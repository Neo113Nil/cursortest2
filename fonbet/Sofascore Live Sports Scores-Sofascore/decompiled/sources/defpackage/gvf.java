package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gvf extends gbc implements ServiceConnection {
    public final ComponentName i;
    public final cvf j;
    public final ArrayList k;
    public boolean l;
    public boolean m;
    public avf n;
    public boolean o;
    public imf p;

    public gvf(Context context, ComponentName componentName) {
        super(context, new yia(componentName, 4));
        this.k = new ArrayList();
        this.i = componentName;
        this.j = new cvf();
    }

    @Override // defpackage.gbc
    public final dbc a(String str, fbc fbcVar) {
        if (str == null) {
            a70.p("initialMemberRouteId cannot be null.");
            return null;
        }
        hbc hbcVar = this.g;
        if (hbcVar != null) {
            List list = hbcVar.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((mac) list.get(i)).d().equals(str)) {
                    evf evfVar = new evf(this, str, fbcVar);
                    this.k.add(evfVar);
                    if (this.o) {
                        evfVar.a(this.n);
                    }
                    p();
                    return evfVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.gbc
    public final ebc f(String str, fbc fbcVar) {
        if (str != null) {
            return m(str, null, fbcVar);
        }
        a70.p("routeId cannot be null");
        return null;
    }

    @Override // defpackage.gbc
    public final ebc g(String str, String str2) {
        if (str == null) {
            a70.p("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return m(str, str2, fbc.b);
        }
        a70.p("routeGroupId cannot be null");
        return null;
    }

    @Override // defpackage.gbc
    public final void h(oac oacVar) {
        if (this.o) {
            avf avfVar = this.n;
            int i = avfVar.d;
            avfVar.d = i + 1;
            avfVar.b(10, i, 0, oacVar != null ? oacVar.a : null, null);
        }
        p();
    }

    public final void l() {
        if (this.m) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.i);
        try {
            this.m = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final fvf m(String str, String str2, fbc fbcVar) {
        hbc hbcVar = this.g;
        if (hbcVar == null) {
            return null;
        }
        List list = hbcVar.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((mac) list.get(i)).d().equals(str)) {
                fvf fvfVar = new fvf(this, str, str2, fbcVar);
                this.k.add(fvfVar);
                if (this.o) {
                    fvfVar.a(this.n);
                }
                p();
                return fvfVar;
            }
        }
        return null;
    }

    public final void n() {
        if (this.n != null) {
            i(null);
            this.o = false;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bvf) arrayList.get(i)).c();
            }
            avf avfVar = this.n;
            avfVar.b(2, 0, 0, null, null);
            avfVar.b.b.clear();
            avfVar.a.getBinder().unlinkToDeath(avfVar, 0);
            avfVar.i.j.post(new zuf(avfVar, 0));
            this.n = null;
        }
    }

    public final void o() {
        if (this.m) {
            this.m = false;
            n();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.m) {
            n();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        avf avfVar = new avf(this, messenger);
                        int i = avfVar.d;
                        avfVar.d = i + 1;
                        avfVar.g = i;
                        if (avfVar.b(1, i, 4, null, null)) {
                            try {
                                avfVar.a.getBinder().linkToDeath(avfVar, 0);
                                this.n = avfVar;
                                return;
                            } catch (RemoteException unused) {
                                avfVar.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            toString();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n();
    }

    public final void p() {
        if (!this.l || (this.e == null && this.k.isEmpty())) {
            o();
        } else {
            l();
        }
    }

    public final String toString() {
        return "Service connection " + this.i.flattenToShortString();
    }
}
