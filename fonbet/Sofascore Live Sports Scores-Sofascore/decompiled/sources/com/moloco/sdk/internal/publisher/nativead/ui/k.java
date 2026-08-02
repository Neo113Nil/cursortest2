package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.e6b;
import defpackage.g6b;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.y6b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k extends FrameLayout implements u6b, o {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m a;
    public final y6b b;
    public View c;

    public k(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar, q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, com.moloco.sdk.internal.publisher.nativead.b bVar2) {
        super(context);
        this.a = mVar;
        y6b y6bVar = new y6b(this, true);
        this.b = y6bVar;
        y6bVar.i(e6b.c);
        g6b lifecycle = getLifecycle();
        l lVar = new l(0);
        tc3 tc3Var = m.a;
        View view = (View) f1.d(lifecycle, lVar, null, new l(1), j.b, null, new f0(bVar2, bVar2, bVar2), qVar, false, new com.moloco.sdk.internal.publisher.nativead.b(0, mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m.class, "onReplay", "onReplay()V", 0, 1), 1536).invoke(context, mVar);
        bVar.b(view);
        this.c = view;
        addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        this.a.destroy();
        removeAllViews();
        this.c = null;
        y6b y6bVar = this.b;
        e6b e6bVar = y6bVar.i;
        e6b e6bVar2 = e6b.a;
        if (e6bVar != e6bVar2) {
            y6bVar.i(e6bVar2);
        }
    }

    @Override // defpackage.u6b
    @NotNull
    public g6b getLifecycle() {
        return this.b;
    }

    @Nullable
    public final View getVideoView$moloco_sdk_release() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdVideoContainerView", "onAttachedToWindow", null, false, 12, null);
        this.b.i(hasWindowFocus() ? e6b.e : e6b.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdVideoContainerView", "onDetachedFromWindow", null, false, 12, null);
        y6b y6bVar = this.b;
        if (y6bVar.i != e6b.a) {
            y6bVar.i(e6b.c);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        y6b y6bVar = this.b;
        e6b e6bVar = y6bVar.i;
        e6b e6bVar2 = e6b.d;
        if (e6bVar.a(e6bVar2)) {
            if (z) {
                e6bVar2 = e6b.e;
            }
            y6bVar.i(e6bVar2);
        }
    }

    public static /* synthetic */ void getVideoView$moloco_sdk_release$annotations() {
    }
}
