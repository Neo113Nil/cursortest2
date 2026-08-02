package com.vk.reefton.trackers;

import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.trackers.l;
import xsna.af50;
import xsna.b8h0;
import xsna.c220;
import xsna.hs4;
import xsna.ie3;
import xsna.l7i;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;
import xsna.ymf0;

/* compiled from: ReefAudioTracker.kt */
/* loaded from: classes5.dex */
public final class a extends l {
    public final com.vk.reefton.d a;
    public final b8h0 b;
    public LambdaObserver c;
    public hs4 d = new hs4(0, 0, 0, "", null, null, null, 0);

    /* compiled from: ReefAudioTracker.kt */
    /* renamed from: com.vk.reefton.trackers.a$a, reason: collision with other inner class name */
    public static final class C1758a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new a(qof0Var.f(), qof0Var.e());
        }
    }

    public a(com.vk.reefton.d dVar, b8h0 b8h0Var) {
        this.a = dVar;
        this.b = b8h0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new ie3(24, vof0Var, this));
    }

    @Override // com.vk.reefton.trackers.l
    public final void e(PublishSubject publishSubject) {
        LambdaObserver lambdaObserver = this.c;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        b8h0 b8h0Var = this.b;
        this.c = new ObservableObserveOn(new ObservableSubscribeOn(publishSubject, b8h0Var), b8h0Var).c(new af50(this, 20), new c220(19));
    }

    public final void g(ymf0 ymf0Var) {
        hs4 hs4Var = this.d;
        long j = ymf0Var.a;
        long j2 = ymf0Var.b;
        int i = ymf0Var.c;
        String str = ymf0Var.d;
        Integer num = ymf0Var.e;
        Integer num2 = ymf0Var.f;
        Integer num3 = ymf0Var.g;
        Integer num4 = ymf0Var.h;
        hs4Var.getClass();
        this.d = new hs4(j, j2, i, str, num, num2, num3, num4);
    }
}
