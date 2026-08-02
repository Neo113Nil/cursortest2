package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import com.sofascore.results.R;
import defpackage.d6b;
import defpackage.nea;
import defpackage.p2g;
import defpackage.qha;
import defpackage.rha;
import defpackage.tc3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xw3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i extends FrameLayout implements o {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m a;
    public final com.moloco.sdk.internal.d b;
    public ComposeView c;

    public i(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar, q qVar, com.moloco.sdk.internal.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, com.moloco.sdk.internal.publisher.nativead.b bVar2) {
        super(context);
        this.a = mVar;
        this.b = dVar;
        tc3 tc3Var = new tc3(1867022133, new h(bVar, this, bVar2, qVar), true);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new tc3(1870157091, new d(tc3Var, 1), true));
        addView(composeView, new ViewGroup.LayoutParams(-1, -1));
        this.c = composeView;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        this.a.destroy();
        removeAllViews();
        ComposeView composeView = this.c;
        if (composeView != null) {
            composeView.e();
        }
        this.c = null;
    }

    @Nullable
    public final ComposeView getVideoView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onAttachedToWindow", null, false, 12, null);
        com.moloco.sdk.internal.d dVar = this.b;
        dVar.getClass();
        xw3.L(com.moloco.sdk.internal.scheduling.b.a, null, null, new nea(new com.moloco.sdk.internal.b(0, this, dVar), null, 3), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "VideoContainer", "onDetachedFromWindow", null, false, 12, null);
        com.moloco.sdk.internal.d dVar = this.b;
        dVar.getClass();
        View rootView = getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(molocoLogger, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (Intrinsics.c(rha.q(rootView), dVar)) {
            MolocoLogger.info$default(molocoLogger, "ViewLifecycleOwner", "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            rootView.setTag(R.id.view_tree_saved_state_registry_owner, null);
        }
        if (Intrinsics.c(qha.w(rootView), dVar)) {
            MolocoLogger.info$default(molocoLogger, "ViewLifecycleOwner", "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            rootView.setTag(R.id.view_tree_lifecycle_owner, null);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        Object u2gVar;
        Object u2gVar2;
        super.onWindowFocusChanged(z);
        com.moloco.sdk.internal.d dVar = this.b;
        if (!z) {
            dVar.getClass();
            View rootView = getRootView();
            rootView.getClass();
            if (Intrinsics.c(qha.w(rootView), dVar)) {
                try {
                    p2g p2gVar = w2g.b;
                    dVar.a.g(d6b.ON_PAUSE);
                    u2gVar = Unit.a;
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder("lifecycle pause success ");
                sb.append(!(u2gVar instanceof u2g));
                MolocoLogger.info$default(molocoLogger, "ViewLifecycleOwner", sb.toString(), w2g.a(u2gVar), false, 8, null);
                return;
            }
            return;
        }
        dVar.getClass();
        View rootView2 = getRootView();
        rootView2.getClass();
        if (Intrinsics.c(qha.w(rootView2), dVar)) {
            try {
                p2g p2gVar3 = w2g.b;
                dVar.a.g(d6b.ON_RESUME);
                u2gVar2 = Unit.a;
            } catch (Throwable th2) {
                p2g p2gVar4 = w2g.b;
                u2gVar2 = new u2g(th2);
            }
            if (!(u2gVar2 instanceof u2g)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume success", null, false, 12, null);
            }
            Throwable a = w2g.a(u2gVar2);
            if (a != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume failure", a, false, 8, null);
            }
        }
    }

    public final void setVideoView(@Nullable ComposeView composeView) {
        this.c = composeView;
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }
}
