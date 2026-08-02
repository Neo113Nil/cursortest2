package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.d;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.jr.oo.gm;
import com.fyber.inneractive.sdk.ignite.k;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.nativex.view.RollingBCView;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import org.bouncycastle.crypto.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kac(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        xti b;
        long j;
        xti b2;
        cui cuiVar = (cui) this.b;
        synchronized (cuiVar) {
            cuiVar.g++;
            b = cuiVar.b();
        }
        if (b == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b.a);
                Logger logger = ((cui) this.b).b;
                bui buiVar = b.c;
                buiVar.getClass();
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    by9 by9Var = buiVar.a.a;
                    j = System.nanoTime();
                    v7a.y(logger, b, buiVar, "starting");
                } else {
                    j = -1;
                }
                try {
                    long a = b.a();
                    if (isLoggable) {
                        by9 by9Var2 = buiVar.a.a;
                        v7a.y(logger, b, buiVar, "finished run in " + v7a.p(System.nanoTime() - j));
                    }
                    cui cuiVar2 = (cui) this.b;
                    synchronized (cuiVar2) {
                        cuiVar2.a(b, a, true);
                        b2 = cuiVar2.b();
                    }
                    if (b2 == null) {
                        return;
                    } else {
                        b = b2;
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        by9 by9Var3 = buiVar.a.a;
                        v7a.y(logger, b, buiVar, "failed a run in " + v7a.p(System.nanoTime() - j));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    cui cuiVar3 = (cui) this.b;
                    synchronized (cuiVar3) {
                        cuiVar3.a(b, -1L, false);
                        Unit unit = Unit.a;
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } finally {
                    currentThread.setName(name);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Logger logger;
        StringBuilder sb;
        qem qemVar;
        tsz tszVar;
        tsz tszVar2;
        int i;
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        boolean z2;
        long j6;
        int i2;
        long j7;
        long unused;
        int unused2;
        int i3 = 1;
        int i4 = 0;
        switch (this.a) {
            case 0:
                d dVar = (d) ((lac) this.b).c;
                if (dVar.O != null) {
                    dVar.O = null;
                    if (dVar.e0) {
                        dVar.q(dVar.f0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                File file = (File) this.b;
                Logger logger2 = a.a;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine("cleanup shutdown hook started");
                }
                if (file.exists()) {
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        int length = listFiles.length;
                        while (i4 < length) {
                            i3 &= listFiles[i4].delete() ? 1 : 0;
                            i4++;
                        }
                    }
                    if (((file.delete() ? 1 : 0) & i3) == 0) {
                        logger = a.a;
                        sb = new StringBuilder(" failed to delete: ");
                    } else {
                        logger = a.a;
                        sb = new StringBuilder("successfully cleaned up: ");
                    }
                    sb.append(file.getAbsolutePath());
                    logger.fine(sb.toString());
                    return;
                }
                return;
            case 2:
                ((ncd) this.b).a();
                return;
            case 3:
                am0 am0Var = (am0) this.b;
                long j8 = am0Var.b;
                long max = Math.max(2 * j8, j8);
                if (((bm0) am0Var.c).a.compareAndSet(j8, max)) {
                    bm0.b.log(Level.WARNING, "Increased {0} to {1}", new Object[]{"keepalive time nanos", Long.valueOf(max)});
                    return;
                }
                return;
            case 4:
                ood oodVar = (ood) this.b;
                oodVar.o.execute(oodVar.t);
                synchronized (((ood) this.b).k) {
                    ood oodVar2 = (ood) this.b;
                    oodVar2.C = Integer.MAX_VALUE;
                    oodVar2.r();
                }
                return;
            case 5:
                fge fgeVar = (fge) this.b;
                fgeVar.l = null;
                if (fgeVar.i.b()) {
                    fgeVar.y();
                    return;
                }
                return;
            case 6:
                ((o6a) ((dge) this.b).c).K();
                return;
            case 7:
                pye pyeVar = (pye) this.b;
                j22 j22Var = pyeVar.d;
                int i5 = pye.F;
                pyeVar.n(1);
                int i6 = 2;
                pyeVar.n(2);
                if (!pyeVar.E) {
                    LinkedHashMap linkedHashMap = pyeVar.t;
                    int i7 = pyeVar.y;
                    if (i7 != 1) {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap == null) {
                        linkedHashMap = pyeVar.u;
                    }
                    LinkedHashMap linkedHashMap2 = i7 == 1 ? pyeVar.o : null;
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = pyeVar.p;
                    }
                    pyeVar.s(true, linkedHashMap, linkedHashMap2);
                    return;
                }
                ((CheckBox) j22Var.f).setEnabled(true);
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) j22Var.l;
                Boolean bool = Boolean.FALSE;
                Pair pair = new Pair(bool, bool);
                os4 os4Var = new os4(pyeVar, i6);
                t1h[] t1hVarArr = {new r1h("First", new tc3(1012027298, new nye(i4, pyeVar), true)), new r1h("Second", new tc3(927217827, new nye(i3, pyeVar), true))};
                rlh rlhVar = rlh.b;
                rlhVar.getClass();
                hfe d = rlhVar.d();
                o13.w(d, t1hVarArr);
                b7 d2 = d.d();
                segmentedButtonsView.k = os4Var;
                segmentedButtonsView.g = true;
                segmentedButtonsView.h = pair;
                segmentedButtonsView.j = v1h.f;
                segmentedButtonsView.i = new z1h(i4);
                if (d2 == null) {
                    d2 = rlh.b;
                }
                if (!d2.isEmpty()) {
                    SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
                }
                ((CheckBox) j22Var.f).setOnClickListener(new oye(i4, pyeVar));
                if (d7a.D(pyeVar.getContext())) {
                    return;
                }
                pyeVar.A = true;
                j22Var.e.setText(pyeVar.getContext().getString(R.string.tap_player_average_positions));
                ((LinearLayout) j22Var.o).setVisibility(0);
                ((LinearLayout) j22Var.o).setOnClickListener(new oye(i3, pyeVar));
                return;
            case 8:
                RecyclerView recyclerView = ((PreferenceFragmentCompat) this.b).c;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 9:
                synchronized (this) {
                    ((PreferenceGroup) this.b).M.clear();
                }
                return;
            case 10:
                ((y4f) this.b).s();
                return;
            case 11:
                ((vdb) this.b).f();
                return;
            case 12:
                n0g n0gVar = (n0g) this.b;
                n0gVar.c.c(n0gVar);
                return;
            case 13:
                grb grbVar = (grb) this.b;
                if (grbVar.z) {
                    return;
                }
                grbVar.u.B();
                return;
            case 14:
                a8p a8pVar = (a8p) this.b;
                grb grbVar2 = (grb) ((k1d) a8pVar.c).c;
                r3g r3gVar = (r3g) a8pVar.b;
                jic jicVar = grb.E;
                grbVar2.f(r3gVar);
                return;
            case 15:
                ((c4g) this.b).W();
                return;
            case 16:
                ((p03) this.b).B();
                return;
            case 17:
                ((p03) ((scg) this.b).b).B();
                return;
            case 18:
                ((SearchView) this.b).updateFocusedState();
                return;
            case 19:
                ((StaggeredGridLayoutManager) this.b).d();
                return;
            case 20:
                a();
                return;
            case 21:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 22:
                ((Toolbar) this.b).u();
                return;
            case 23:
                fkj fkjVar = (fkj) this.b;
                Window.Callback callback = fkjVar.n;
                Menu z0 = fkjVar.z0();
                vec vecVar = z0 instanceof vec ? (vec) z0 : null;
                if (vecVar != null) {
                    vecVar.w();
                }
                try {
                    z0.clear();
                    if (callback.onCreatePanelMenu(0, z0)) {
                        if (!callback.onPreparePanel(0, null, z0)) {
                        }
                        if (vecVar == null) {
                            vecVar.v();
                            return;
                        }
                        return;
                    }
                    z0.clear();
                    if (vecVar == null) {
                    }
                } catch (Throwable th) {
                    if (vecVar != null) {
                        vecVar.v();
                    }
                    throw th;
                }
            case 24:
                ((jsk) this.b).m(0);
                return;
            case 25:
                RollingBCView rollingBCView = (RollingBCView) this.b;
                rollingBCView.setScrollState(0);
                rollingBCView.populate();
                return;
            case 26:
                ((dr9) this.b).a.b();
                return;
            case 27:
                synchronized (((o8m) this.b).l) {
                    try {
                        Intent intent = new Intent();
                        intent.setClassName(((o8m) this.b).h, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                        o8m o8mVar = (o8m) this.b;
                        Context context = o8mVar.e;
                        if (context != null) {
                            context.bindService(intent, o8mVar, 1);
                        }
                    } catch (Throwable th2) {
                        Object[] objArr = {th2};
                        k kVar = (k) hpo.c.a;
                        if (kVar != null) {
                            kVar.e("Failed to bind IgniteRemoteService", objArr);
                        }
                        if (th2.getMessage() != null && th2.getMessage().contains("Too many bind requests")) {
                            return;
                        } else {
                            de0.l(p5m.ONE_DT_GENERAL_ERROR, z1a.g(th2, h2m.IGNITE_SERVICE_UNAVAILABLE));
                        }
                    } finally {
                    }
                }
                return;
            case 28:
                gm gmVar = (gm) this.b;
                qemVar = ((csm) gmVar).ork;
                if (qemVar == null) {
                    return;
                }
                long lu = gmVar.lu();
                if (lu > 0 && gmVar.wh()) {
                    j2 = ((csm) gmVar).gpj;
                    if (j2 != Long.MIN_VALUE) {
                        try {
                            j3 = ((csm) gmVar).gpj;
                            if (j3 == lu) {
                                z2 = ((csm) gmVar).nac;
                                if (!z2) {
                                    j7 = ((csm) gmVar).lo;
                                    if (j7 >= 400) {
                                        gmVar.f(IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION);
                                        ((csm) gmVar).nac = true;
                                    }
                                }
                                j6 = ((csm) gmVar).lo;
                                i2 = ((csm) gmVar).lq;
                                ((csm) gmVar).lo = j6 + i2;
                            } else {
                                z = ((csm) gmVar).nac;
                                if (z) {
                                    j4 = ((csm) gmVar).lu;
                                    j5 = ((csm) gmVar).lo;
                                    ((csm) gmVar).lu = j4 + j5;
                                    gmVar.f(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD);
                                    unused = ((csm) gmVar).lu;
                                    unused2 = ((csm) gmVar).qf;
                                }
                                ((csm) gmVar).lo = 0L;
                                ((csm) gmVar).nac = false;
                            }
                        } catch (Throwable th3) {
                            th3.getMessage();
                        }
                    }
                }
                if (gmVar.nac() > 0) {
                    j = ((csm) gmVar).gpj;
                    if (j != lu) {
                        csm.pcc(gmVar, lu, gmVar.nac());
                    }
                    ((csm) gmVar).gpj = lu;
                }
                if (gmVar.sf()) {
                    csm.pcc(gmVar, gmVar.nac(), gmVar.nac());
                    return;
                }
                tszVar = ((csm) gmVar).dax;
                if (tszVar != null) {
                    tszVar2 = ((csm) gmVar).dax;
                    i = ((csm) gmVar).lq;
                    tszVar2.postDelayed(this, i);
                    return;
                }
                return;
            default:
                zaar zaarVar = (zaar) this.b;
                GoogleApiAvailabilityLight googleApiAvailabilityLight = zaarVar.d;
                Context context2 = zaarVar.c;
                googleApiAvailabilityLight.getClass();
                if (GooglePlayServicesUtilLight.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException unused3) {
                    return;
                }
        }
    }
}
