package com.vk.reefton.trackers;

import android.annotation.SuppressLint;
import android.app.Application;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.reefton.dto.network.ReefMobileNetworkDataState;
import com.vk.reefton.dto.network.ReefNetworkType;
import com.vk.reefton.literx.completable.CompletableTimer;
import com.vk.reefton.literx.completable.LambdaCompletableObserver;
import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.trackers.l;
import com.vk.reefton.utils.ReefNetworkUtil;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.b8h0;
import xsna.cof0;
import xsna.dof0;
import xsna.enf0;
import xsna.fnf0;
import xsna.gzn;
import xsna.hof0;
import xsna.k560;
import xsna.l7i;
import xsna.ofc0;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;
import xsna.wq20;
import xsna.xmf0;

/* compiled from: ReefNetworkInfoTracker.kt */
@SuppressLint({"MissingPermission", "ObsoleteSdkInt"})
/* loaded from: classes5.dex */
public final class h extends l implements dof0.a {
    public static long l;
    public static long m;
    public final com.vk.reefton.d a;
    public final ConnectivityManager b;
    public final TelephonyManager c;
    public final enf0 d;
    public final ReefNetworkUtil e;
    public final fnf0 f;
    public final dof0 g;
    public final b8h0 h;
    public final hof0 i;
    public k560 j;
    public LambdaObserver k;

    /* compiled from: ReefNetworkInfoTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            com.vk.reefton.d f = qof0Var.f();
            Application application = qof0Var.a;
            ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService("connectivity");
            TelephonyManager telephonyManager = (TelephonyManager) application.getSystemService("phone");
            enf0 enf0Var = qof0.I;
            if (enf0Var == null) {
                enf0Var = (enf0) qof0.J.invoke(qof0Var);
                qof0.I = enf0Var;
            }
            ReefNetworkUtil c = qof0Var.c();
            fnf0 a = qof0Var.a();
            dof0 dof0Var = qof0.C;
            if (dof0Var == null) {
                dof0Var = (dof0) qof0.D.invoke(qof0Var);
                qof0.C = dof0Var;
            }
            return new h(f, connectivityManager, telephonyManager, enf0Var, c, a, dof0Var, qof0Var.e(), qof0Var.d());
        }
    }

    public h(com.vk.reefton.d dVar, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, enf0 enf0Var, ReefNetworkUtil reefNetworkUtil, fnf0 fnf0Var, dof0 dof0Var, b8h0 b8h0Var, hof0 hof0Var) {
        this.a = dVar;
        this.b = connectivityManager;
        this.c = telephonyManager;
        this.d = enf0Var;
        this.e = reefNetworkUtil;
        this.f = fnf0Var;
        this.g = dof0Var;
        this.h = b8h0Var;
        this.i = hof0Var;
        ReefNetworkType reefNetworkType = ReefNetworkType.UNKNOWN;
        EmptyList emptyList = EmptyList.b;
        this.j = new k560(reefNetworkType, null, null, null, null, null, false, ReefMobileNetworkDataState.DATA_UNKNOWN, emptyList, null, null, null, null, null, null, emptyList, emptyList, emptyList, null, null, null, null, null, null, false);
    }

    @Override // xsna.dof0.a
    public final void a(cof0 cof0Var) {
        if ((!this.f.c() || this.i.a()) && !(cof0Var instanceof cof0.e)) {
            boolean z = cof0Var instanceof cof0.d;
            com.vk.reefton.d dVar = this.a;
            if (z) {
                dVar.a(this, ReefRequestReason.REACHABILITY_CHANGED, System.currentTimeMillis());
            } else {
                dVar.a(this, ReefRequestReason.NETWORK_CHANGED, System.currentTimeMillis());
            }
        }
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new com.vk.movika.sdk.android.defaultplayer.container.e(24, this, vof0Var));
    }

    @Override // com.vk.reefton.trackers.l
    public final void c() {
        dof0 dof0Var = this.g;
        if (dof0Var != null) {
            synchronized (dof0Var) {
                dof0Var.g.remove(this);
                LambdaCompletableObserver lambdaCompletableObserver = dof0Var.i;
                if (lambdaCompletableObserver != null) {
                    lambdaCompletableObserver.dispose();
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                CompletableTimer completableTimer = new CompletableTimer(dof0Var.e);
                LambdaCompletableObserver lambdaCompletableObserver2 = new LambdaCompletableObserver(new ofc0(dof0Var, 2));
                completableTimer.a(lambdaCompletableObserver2);
                dof0Var.i = lambdaCompletableObserver2;
            }
        }
    }

    @Override // com.vk.reefton.trackers.l
    public final void d() {
        LambdaObserver lambdaObserver = this.k;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
    }

    @Override // com.vk.reefton.trackers.l
    public final void e(PublishSubject publishSubject) {
        LambdaObserver lambdaObserver = this.k;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        b8h0 b8h0Var = this.h;
        this.k = new ObservableObserveOn(new ObservableSubscribeOn(publishSubject, b8h0Var), b8h0Var).c(new wq20(this, 21), new gzn(29));
    }

    @Override // com.vk.reefton.trackers.l
    public final void f(xmf0 xmf0Var) {
        dof0 dof0Var;
        if (!xmf0Var.a || (dof0Var = this.g) == null) {
            return;
        }
        synchronized (dof0Var) {
            dof0Var.g.add(this);
            if (!dof0Var.h) {
                dof0Var.e();
            }
        }
    }
}
