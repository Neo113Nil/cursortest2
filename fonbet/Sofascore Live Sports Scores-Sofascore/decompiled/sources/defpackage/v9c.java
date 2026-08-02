package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v9c extends dbc {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public mac o;
    public final /* synthetic */ z9c p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final yp8 m = new yp8(this, 14);
    public int n = -1;

    public v9c(z9c z9cVar, MediaRouter2.RoutingController routingController, String str) {
        this.p = z9cVar;
        this.g = routingController;
        this.f = str;
        Messenger k = z9c.k(routingController);
        this.h = k;
        this.i = k == null ? null : new Messenger(new gl0(this));
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.ebc
    public final void d() {
        this.g.release();
    }

    @Override // defpackage.ebc
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        yp8 yp8Var = this.m;
        handler.removeCallbacks(yp8Var);
        handler.postDelayed(yp8Var, 1000L);
    }

    @Override // defpackage.ebc
    public final void i(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int i2 = this.n;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i2 + i, this.g.getVolumeMax()));
        this.n = max;
        this.g.setVolume(max);
        Handler handler = this.k;
        yp8 yp8Var = this.m;
        handler.removeCallbacks(yp8Var);
        handler.postDelayed(yp8Var, 1000L);
    }

    @Override // defpackage.dbc
    public final void m(String str) {
        MediaRoute2Info l;
        if (str == null || str.isEmpty() || (l = this.p.l(str)) == null) {
            return;
        }
        this.g.selectRoute(l);
    }

    @Override // defpackage.dbc
    public final void n(String str) {
        MediaRoute2Info l;
        if (str == null || str.isEmpty() || (l = this.p.l(str)) == null) {
            return;
        }
        this.g.deselectRoute(l);
    }

    @Override // defpackage.dbc
    public final void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        String str = (String) arrayList.get(0);
        z9c z9cVar = this.p;
        MediaRoute2Info l = z9cVar.l(str);
        if (l == null) {
            return;
        }
        z9cVar.i.transferTo(l);
    }

    public final String p() {
        mac macVar = this.o;
        return macVar != null ? macVar.d() : this.g.getId();
    }

    public final void q(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.i;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    public final void r(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.i;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
