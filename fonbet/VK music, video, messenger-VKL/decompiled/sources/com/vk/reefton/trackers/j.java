package com.vk.reefton.trackers;

import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.trackers.l;
import xsna.b8h0;
import xsna.bwa0;
import xsna.c230;
import xsna.l7i;
import xsna.n0;
import xsna.qof0;
import xsna.r7i;
import xsna.sux;
import xsna.uya0;
import xsna.vof0;

/* compiled from: ReefPlayerTracker.kt */
/* loaded from: classes5.dex */
public final class j extends l {
    public final com.vk.reefton.d a;
    public final b8h0 b;
    public bwa0 c;
    public boolean d;
    public int f;
    public int g;
    public Long h;
    public String i;
    public LambdaObserver k;
    public Long l;
    public uya0 e = a.b();
    public long j = -1;

    /* compiled from: ReefPlayerTracker.kt */
    public static final class a {
        public static final Long a(Long l) {
            if (l == null) {
                return null;
            }
            return Long.valueOf(System.currentTimeMillis() - l.longValue());
        }

        public static uya0 b() {
            return new uya0(null, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, false, 0L, 0L, null);
        }
    }

    /* compiled from: ReefPlayerTracker.kt */
    public static final class b implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new j(qof0Var.f(), qof0Var.e());
        }
    }

    public j(com.vk.reefton.d dVar, b8h0 b8h0Var) {
        this.a = dVar;
        this.b = b8h0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new n0(25, this, vof0Var));
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
        b8h0 b8h0Var = this.b;
        this.k = new ObservableObserveOn(new ObservableSubscribeOn(publishSubject, b8h0Var), b8h0Var).c(new c230(this, 23), new sux(22));
    }
}
