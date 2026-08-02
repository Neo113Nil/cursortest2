package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class egd implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public egd(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(dgd dgdVar) {
        boolean z;
        ArrayDeque arrayDeque = dgdVar.d;
        ComponentName componentName = dgdVar.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (dgdVar.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean bindService = context.bindService(component, this, 33);
            dgdVar.b = bindService;
            if (bindService) {
                dgdVar.e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = dgdVar.b;
        }
        if (!z || dgdVar.c == null) {
            d(dgdVar);
            return;
        }
        while (true) {
            bgd bgdVar = (bgd) arrayDeque.peek();
            if (bgdVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    bgdVar.toString();
                }
                bgdVar.a(dgdVar.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        d(dgdVar);
    }

    public final void d(dgd dgdVar) {
        ComponentName componentName = dgdVar.a;
        ArrayDeque arrayDeque = dgdVar.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = dgdVar.e + 1;
        dgdVar.e = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
            return;
        }
        arrayDeque.size();
        Objects.toString(componentName);
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        vm9 vm9Var = null;
        if (i == 0) {
            bgd bgdVar = (bgd) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (fgd.c) {
                if (string != null) {
                    try {
                        if (!string.equals(fgd.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            fgd.e = hashSet2;
                            fgd.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = fgd.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new dgd(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        dgd dgdVar = (dgd) entry.getValue();
                        if (dgdVar.b) {
                            this.a.unbindService(this);
                            dgdVar.b = false;
                        }
                        dgdVar.c = null;
                        it2.remove();
                    }
                }
            }
            for (dgd dgdVar2 : this.c.values()) {
                dgdVar2.d.add(bgdVar);
                a(dgdVar2);
            }
        } else if (i == 1) {
            cgd cgdVar = (cgd) message.obj;
            ComponentName componentName3 = cgdVar.a;
            IBinder iBinder = cgdVar.b;
            dgd dgdVar3 = (dgd) this.c.get(componentName3);
            if (dgdVar3 != null) {
                int i2 = um9.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(vm9.v7);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof vm9)) {
                        tm9 tm9Var = new tm9();
                        tm9Var.a = iBinder;
                        vm9Var = tm9Var;
                    } else {
                        vm9Var = (vm9) queryLocalInterface;
                    }
                }
                dgdVar3.c = vm9Var;
                dgdVar3.e = 0;
                a(dgdVar3);
                return true;
            }
        } else if (i == 2) {
            dgd dgdVar4 = (dgd) this.c.get((ComponentName) message.obj);
            if (dgdVar4 != null) {
                if (dgdVar4.b) {
                    this.a.unbindService(this);
                    dgdVar4.b = false;
                }
                dgdVar4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            dgd dgdVar5 = (dgd) this.c.get((ComponentName) message.obj);
            if (dgdVar5 != null) {
                a(dgdVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new cgd(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
