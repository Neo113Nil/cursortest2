package com.vk.reefton.trackers;

import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.trackers.l;
import java.util.ArrayList;
import xsna.b8h0;
import xsna.eiz;
import xsna.j0r;
import xsna.l7i;
import xsna.qnf0;
import xsna.qof0;
import xsna.r7i;
import xsna.vf1;
import xsna.vof0;

/* compiled from: ReefImagesLoadTracker.kt */
/* loaded from: classes5.dex */
public final class f extends l {
    public final com.vk.reefton.d a;
    public final b8h0 b;
    public final int c = 10;
    public final ArrayList<qnf0> d = new ArrayList<>();
    public LambdaObserver e;

    /* compiled from: ReefImagesLoadTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new f(qof0Var.f(), qof0Var.e());
        }
    }

    public f(com.vk.reefton.d dVar, b8h0 b8h0Var) {
        this.a = dVar;
        this.b = b8h0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new vf1(14, this, vof0Var));
    }

    @Override // com.vk.reefton.trackers.l
    public final void e(PublishSubject publishSubject) {
        LambdaObserver lambdaObserver = this.e;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        b8h0 b8h0Var = this.b;
        this.e = new ObservableObserveOn(new ObservableSubscribeOn(publishSubject, b8h0Var), b8h0Var).c(new eiz(this, 26), new j0r(26));
    }
}
