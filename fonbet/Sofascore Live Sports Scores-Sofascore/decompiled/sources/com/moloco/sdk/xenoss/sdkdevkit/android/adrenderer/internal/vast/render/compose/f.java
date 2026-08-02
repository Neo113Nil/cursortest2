package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ad2;
import defpackage.bea;
import defpackage.g6b;
import defpackage.hs4;
import defpackage.lji;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.yih;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends FrameLayout {
    public static final r69 m;
    public final g6b a;
    public final yih b;
    public Function1 c;
    public Function1 d;
    public Function1 e;
    public Function1 f;
    public String g;
    public long h;
    public boolean i;
    public boolean j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l k;
    public ad2 l;

    static {
        hs4 hs4Var = z45.a;
        m = rob.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, g6b g6bVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar) {
        super(context);
        yih yihVar = new yih(context, z, qVar);
        context.getClass();
        g6bVar.getClass();
        qVar.getClass();
        this.a = g6bVar;
        this.b = yihVar;
        this.i = true;
    }

    @Nullable
    public final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> getOnError() {
        return this.f;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnIsPlaying() {
        return this.c;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnIsVisible() {
        return this.d;
    }

    @Nullable
    public final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, Unit> getOnProgressChanged() {
        return this.e;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j getVideoPlayer$moloco_sdk_release() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g6b g6bVar = this.a;
        g6bVar.getClass();
        yih yihVar = this.b;
        Context context = (Context) yihVar.c;
        boolean z = yihVar.b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j a = com.moloco.sdk.service_locator.g.a();
        com.moloco.sdk.acm.recorder.b.Companion.getClass();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h(context, z, a, g6bVar, com.moloco.sdk.acm.recorder.a.b());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l(hVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q) yihVar.d);
        this.k = lVar;
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), m));
        this.l = c;
        lji ljiVar = hVar.l;
        if (ljiVar != null) {
            addView(ljiVar, new ViewGroup.LayoutParams(-1, -1));
        }
        rq3 rq3Var = null;
        xw3.L(c, null, null, new d(lVar, this, rq3Var, 0), 3);
        xw3.L(c, null, null, new d(lVar, this, rq3Var, 1), 3);
        xw3.L(c, null, null, new d(lVar, this, rq3Var, 2), 3);
        String str = this.g;
        if (str != null) {
            lVar.a(str);
        }
        lVar.seekTo(this.h);
        if (this.i) {
            lVar.play();
        } else {
            lVar.pause();
        }
        lVar.b(this.j);
        xw3.L(c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(lVar, rq3Var, 14), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = this.l;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.l = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = this.k;
        if (lVar != null) {
            lVar.destroy();
        }
        this.k = null;
        removeAllViews();
        Function1 function1 = this.c;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    public final void setMute(boolean z) {
        this.j = z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = this.k;
        if (lVar != null) {
            lVar.b(z);
        }
    }

    public final void setOnError(@Nullable Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> function1) {
        this.f = function1;
    }

    public final void setOnIsPlaying(@Nullable Function1<? super Boolean, Unit> function1) {
        this.c = function1;
    }

    public final void setOnIsVisible(@Nullable Function1<? super Boolean, Unit> function1) {
        this.d = function1;
    }

    public final void setOnProgressChanged(@Nullable Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, Unit> function1) {
        this.e = function1;
    }

    public final void setPlay(boolean z) {
        this.i = z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = this.k;
        if (lVar != null) {
            if (z) {
                lVar.play();
            } else {
                lVar.pause();
            }
        }
    }

    public final void setUri(@NotNull String str) {
        str.getClass();
        this.g = str;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = this.k;
        if (lVar != null) {
            lVar.a(str);
            lVar.seekTo(this.h);
            if (this.i) {
                lVar.play();
            } else {
                lVar.pause();
            }
            lVar.b(this.j);
        }
    }

    public static /* synthetic */ void getVideoPlayer$moloco_sdk_release$annotations() {
    }
}
