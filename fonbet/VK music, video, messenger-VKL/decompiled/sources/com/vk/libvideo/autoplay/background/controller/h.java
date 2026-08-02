package com.vk.libvideo.autoplay.background.controller;

import android.app.Activity;
import io.reactivex.rxjava3.internal.operators.observable.g2;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.asu0;
import xsna.c63;
import xsna.gzs;
import xsna.hg1;
import xsna.o1b0;
import xsna.pa;
import xsna.qu5;
import xsna.s3q0;
import xsna.uy3;
import xsna.w6w;
import xsna.yg5;
import xsna.zlm0;

/* compiled from: VideoBackgroundReleaseController.kt */
/* loaded from: classes2.dex */
public final class h extends c63.b {
    public final pa b;
    public final a c;
    public io.reactivex.rxjava3.disposables.c d;
    public io.reactivex.rxjava3.disposables.c e;

    /* compiled from: VideoBackgroundReleaseController.kt */
    public static final class a implements b {
        public final io.reactivex.rxjava3.subjects.f<yg5> a = new io.reactivex.rxjava3.subjects.f<>();

        @Override // com.vk.libvideo.autoplay.background.controller.h.b
        public final void a(yg5 yg5Var) {
            this.a.onNext(yg5Var);
        }
    }

    /* compiled from: VideoBackgroundReleaseController.kt */
    public interface b {
        void a(yg5 yg5Var);
    }

    /* compiled from: VideoBackgroundReleaseController.kt */
    public static final class c implements io.reactivex.rxjava3.functions.a {
        public final /* synthetic */ AdaptedFunctionReference b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(gzs gzsVar) {
            this.b = (AdaptedFunctionReference) gzsVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.AdaptedFunctionReference, xsna.gzs] */
        @Override // io.reactivex.rxjava3.functions.a
        public final /* synthetic */ void run() {
            this.b.invoke();
        }
    }

    /* compiled from: VideoBackgroundReleaseController.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((h) this.receiver).getClass();
            o1b0.b(qu5.c(), null, 2);
            return s3q0.a;
        }
    }

    /* compiled from: VideoBackgroundReleaseController.kt */
    public static final /* synthetic */ class e extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((h) this.receiver).getClass();
            o1b0.b(qu5.c(), null, 2);
            return s3q0.a;
        }
    }

    public h(pa paVar, a aVar) {
        this.b = paVar;
        this.c = aVar;
    }

    public final void D() {
        h hVar;
        io.reactivex.rxjava3.functions.a cVar;
        io.reactivex.rxjava3.functions.a uy3Var;
        yg5 b2 = this.b.b();
        if (b2 == null) {
            hVar = this;
            cVar = new c(new d(0, hVar, h.class, "resetAllPlayers", "resetAllPlayers(Lone/video/player/model/source/VideoSource;)V", 0));
        } else {
            hVar = this;
            if (b2.M0()) {
                uy3Var = new w6w(b2, this);
            } else if (b2.R0().h()) {
                uy3Var = new uy3(b2, this);
            } else {
                cVar = new c(new e(0, hVar, h.class, "resetAllPlayers", "resetAllPlayers(Lone/video/player/model/source/VideoSource;)V", 0));
            }
            cVar = uy3Var;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = hVar.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        hVar.d = io.reactivex.rxjava3.core.a.s(10000L, timeUnit, asu0.p()).o(asu0Var.d()).subscribe(cVar);
    }

    public final void E() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.subjects.f<yg5> fVar = this.c.a;
        fVar.getClass();
        this.e = hg1.h(new g2(fVar).a0(asu0.a.d()), new zlm0(8));
    }

    @Override // xsna.c63.b
    public final void u() {
        D();
        E();
    }

    @Override // xsna.c63.b
    public final void w() {
        D();
        E();
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.e = null;
    }

    @Override // xsna.c63.b
    public final void z(boolean z) {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.e = null;
    }
}
