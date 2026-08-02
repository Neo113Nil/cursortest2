package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a74;
import defpackage.ar3;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.ku3;
import defpackage.mqi;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.un0;
import defpackage.weh;
import defpackage.xw3;
import defpackage.yf4;
import defpackage.ypa;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class e extends FrameLayout implements n, h, f, o {
    public final ku3 a;
    public i b;
    public View c;
    public final mqi d;
    public final fdi e;
    public final mqi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ku3 ku3Var, Context context) {
        super(context);
        context.getClass();
        ku3Var.getClass();
        this.a = ku3Var;
        final int i = 0;
        this.d = ypa.b(new Function0(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                e eVar = this.b;
                switch (i2) {
                    case 0:
                        return eVar.getAdLoader().isLoaded();
                    default:
                        return un0.K(new yf4(eVar.isLoaded(), eVar.e, new ar3(3, null, 2), 1), eVar.a, weh.a, Boolean.FALSE);
                }
            }
        });
        this.e = gdi.a(Boolean.FALSE);
        final int i2 = 1;
        this.f = ypa.b(new Function0(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        return eVar.getAdLoader().isLoaded();
                    default:
                        return un0.K(new yf4(eVar.isLoaded(), eVar.e, new ar3(3, null, 2), 1), eVar.a, weh.a, Boolean.FALSE);
                }
            }
        });
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, g gVar) {
        xw3.L(this.a, null, null, new a74(this, j, gVar, (rq3) null, 12), 3);
    }

    public abstract void b();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        s9a.o(this.a, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @NotNull
    public abstract h getAdLoader();

    @Nullable
    public i getAdShowListener() {
        return this.b;
    }

    @Nullable
    public final View getAdView() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    @Nullable
    public abstract /* synthetic */ m getCreativeType();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return (ddi) this.d.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public ddi l() {
        return (ddi) this.f.getValue();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
        super.onVisibilityChanged(view, i);
        Boolean valueOf = Boolean.valueOf(i == 0);
        fdi fdiVar = this.e;
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
    }

    public void setAdShowListener(@Nullable i iVar) {
        this.b = iVar;
    }

    public final void setAdView(@Nullable View view) {
        View view2 = this.c;
        this.c = view;
        removeAllViews();
        try {
            ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
            if (composeView != null) {
                composeView.e();
            }
        } catch (ClassNotFoundException e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "XenossBannerView", "Compose not available, skipping ComposeView disposeComposition", e, false, 8, null);
        } catch (NoClassDefFoundError e2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "XenossBannerView", "Compose not available, skipping ComposeView disposeComposition", e2, false, 8, null);
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public static /* synthetic */ void getAdView$annotations() {
    }
}
