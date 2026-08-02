package com.vk.reefton.trackers;

import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.trackers.l;
import java.util.ArrayList;
import xsna.b8h0;
import xsna.gda0;
import xsna.j5n;
import xsna.l7i;
import xsna.pnf0;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;

/* compiled from: ReefHttpRequestMetricTracker.kt */
/* loaded from: classes5.dex */
public final class e extends l {
    public final b8h0 a;
    public final int b = 10;
    public final ArrayList<pnf0> c = new ArrayList<>();
    public LambdaObserver d;

    /* compiled from: ReefHttpRequestMetricTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new e(qof0Var.e());
        }
    }

    public e(b8h0 b8h0Var) {
        this.a = b8h0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new com.vk.movika.tools.controls.seekbar.f(20, this, vof0Var));
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
        b8h0 b8h0Var = this.a;
        this.d = new ObservableObserveOn(new ObservableSubscribeOn(publishSubject, b8h0Var), b8h0Var).c(new gda0(this, 10), new j5n(21));
    }
}
