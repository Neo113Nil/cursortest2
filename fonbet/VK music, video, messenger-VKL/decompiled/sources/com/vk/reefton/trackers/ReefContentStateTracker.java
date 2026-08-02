package com.vk.reefton.trackers;

import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;
import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.trackers.l;
import xsna.b8h0;
import xsna.dn20;
import xsna.jl4;
import xsna.l7i;
import xsna.qof0;
import xsna.r7i;
import xsna.t810;
import xsna.vof0;
import xsna.ykj;

/* compiled from: ReefContentStateTracker.kt */
/* loaded from: classes5.dex */
public final class ReefContentStateTracker extends l {
    public static final ReefContentStateTracker$Companion$sharedPauseTimestamps$1 e = new ReefContentStateTracker$Companion$sharedPauseTimestamps$1();
    public final com.vk.reefton.d a;
    public final b8h0 b;
    public ykj c = new ykj(ReefContentType.UNDEFINED, null, null, null, null, ReefContentQuality.UNKNOWN, null);
    public LambdaObserver d;

    /* compiled from: ReefContentStateTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new ReefContentStateTracker(qof0Var.f(), qof0Var.e());
        }
    }

    public ReefContentStateTracker(com.vk.reefton.d dVar, b8h0 b8h0Var) {
        this.a = dVar;
        this.b = b8h0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new jl4(18, vof0Var, this));
    }

    @Override // com.vk.reefton.trackers.l
    public final void d() {
        LambdaObserver lambdaObserver = this.d;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
    }

    @Override // com.vk.reefton.trackers.l
    public final void e(PublishSubject publishSubject) {
        LambdaObserver lambdaObserver = this.d;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        b8h0 b8h0Var = this.b;
        this.d = new ObservableObserveOn(new ObservableSubscribeOn(publishSubject, b8h0Var), b8h0Var).c(new dn20(this, 21), new t810(11));
    }
}
