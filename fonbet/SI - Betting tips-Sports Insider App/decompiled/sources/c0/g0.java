package c0;

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
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3257a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3258b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3259c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f3260d = new HashSet();

    public g0(Context context) {
        this.f3257a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f3258b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(f0 f0Var) {
        boolean z5;
        ArrayDeque arrayDeque = f0Var.f3254d;
        ComponentName componentName = f0Var.f3251a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (f0Var.f3252b) {
            z5 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f3257a;
            boolean bindService = context.bindService(component, this, 33);
            f0Var.f3252b = bindService;
            if (bindService) {
                f0Var.f3255e = 0;
            } else {
                w0.m("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z5 = f0Var.f3252b;
        }
        if (!z5 || f0Var.f3253c == null) {
            b(f0Var);
            return;
        }
        while (true) {
            d0 d0Var = (d0) arrayDeque.peek();
            if (d0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + d0Var);
                }
                d0Var.a(f0Var.f3253c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e7) {
                w0.n("NotifManCompat", "RemoteException communicating with " + componentName, e7);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(f0Var);
    }

    public final void b(f0 f0Var) {
        ComponentName componentName = f0Var.f3251a;
        ArrayDeque arrayDeque = f0Var.f3254d;
        Handler handler = this.f3258b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i5 = f0Var.f3255e;
        int i10 = i5 + 1;
        f0Var.f3255e = i10;
        if (i10 <= 6) {
            int i11 = (1 << i5) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        w0.m("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + f0Var.f3255e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i5 = message.what;
        b.c cVar = null;
        if (i5 == 0) {
            d0 d0Var = (d0) message.obj;
            String string = Settings.Secure.getString(this.f3257a.getContentResolver(), "enabled_notification_listeners");
            synchronized (h0.f3267c) {
                if (string != null) {
                    try {
                        if (!string.equals(h0.f3268d)) {
                            String[] split = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            h0.f3269e = hashSet2;
                            h0.f3268d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = h0.f3269e;
            }
            if (!hashSet.equals(this.f3260d)) {
                this.f3260d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f3257a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            w0.m("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f3259c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f3259c.put(componentName2, new f0(componentName2));
                    }
                }
                Iterator it2 = this.f3259c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        f0 f0Var = (f0) entry.getValue();
                        if (f0Var.f3252b) {
                            this.f3257a.unbindService(this);
                            f0Var.f3252b = false;
                        }
                        f0Var.f3253c = null;
                        it2.remove();
                    }
                }
            }
            for (f0 f0Var2 : this.f3259c.values()) {
                f0Var2.f3254d.add(d0Var);
                a(f0Var2);
            }
        } else if (i5 == 1) {
            e0 e0Var = (e0) message.obj;
            ComponentName componentName3 = e0Var.f3248a;
            IBinder iBinder = e0Var.f3249b;
            f0 f0Var3 = (f0) this.f3259c.get(componentName3);
            if (f0Var3 != null) {
                int i10 = b.b.f2944a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f2945b);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b.c)) {
                        b.a aVar = new b.a();
                        aVar.f2943a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (b.c) queryLocalInterface;
                    }
                }
                f0Var3.f3253c = cVar;
                f0Var3.f3255e = 0;
                a(f0Var3);
                return true;
            }
        } else if (i5 == 2) {
            f0 f0Var4 = (f0) this.f3259c.get((ComponentName) message.obj);
            if (f0Var4 != null) {
                if (f0Var4.f3252b) {
                    this.f3257a.unbindService(this);
                    f0Var4.f3252b = false;
                }
                f0Var4.f3253c = null;
                return true;
            }
        } else {
            if (i5 != 3) {
                return false;
            }
            f0 f0Var5 = (f0) this.f3259c.get((ComponentName) message.obj);
            if (f0Var5 != null) {
                a(f0Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f3258b.obtainMessage(1, new e0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f3258b.obtainMessage(2, componentName).sendToTarget();
    }
}
