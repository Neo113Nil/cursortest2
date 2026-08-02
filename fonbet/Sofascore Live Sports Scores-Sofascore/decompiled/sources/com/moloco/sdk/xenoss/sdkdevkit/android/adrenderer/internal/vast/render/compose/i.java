package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.ad2;
import defpackage.bea;
import defpackage.hje;
import defpackage.hs4;
import defpackage.luj;
import defpackage.r69;
import defpackage.rob;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i extends FrameLayout {
    public static final r69 f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g a;
    public final Function0 b;
    public ad2 c;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r d;
    public final GestureDetector e;

    static {
        hs4 hs4Var = z45.a;
        f = rob.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar, Function0 function0) {
        super(context);
        context.getClass();
        this.a = gVar;
        this.b = function0;
        this.e = new GestureDetector(context, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a(this, 2)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.e.onTouchEvent(motionEvent);
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), f));
        this.c = c;
        xw3.L(c, null, null, new hje(this, null, 26), 3);
        xw3.L(c, null, null, new luj(this, null, 27), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = this.c;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.c = null;
        this.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.a);
    }
}
