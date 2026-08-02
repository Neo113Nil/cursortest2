package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.appsflyer.b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ad2;
import defpackage.bea;
import defpackage.ddi;
import defpackage.hs4;
import defpackage.llf;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.wv8;
import defpackage.xw3;
import defpackage.z45;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a extends FrameLayout {
    public final String a;
    public final int b;
    public final int c;
    public final float d;
    public final o e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o f;
    public final ddi g;
    public final float h;
    public final CoroutineContext i;
    public TextureView j;
    public j k;
    public ad2 l;
    public b m;
    public boolean n;
    public long o;
    public Boolean p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, int i, int i2, float f, o oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar2, ddi ddiVar) {
        super(context);
        hs4 hs4Var = z45.a;
        r69 r69Var = rob.a.f;
        context.getClass();
        str.getClass();
        r69Var.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = oVar;
        this.f = oVar2;
        this.g = ddiVar;
        this.h = 40.0f;
        this.i = r69Var;
        this.n = true;
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
        setVisibility(4);
    }

    public static final void d(a aVar) {
        rq3 rq3Var = null;
        aVar.m = null;
        if (aVar.isAttachedToWindow() && aVar.k == null) {
            o oVar = aVar.e;
            j jVar = oVar != null ? (j) oVar.invoke() : null;
            if (jVar == null) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "BlurredVideoBg", "[blur] no live factory — gap stays black (API < 31?)", null, false, 12, null);
                return;
            }
            aVar.k = jVar;
            View c = jVar.c();
            TextureView textureView = c instanceof TextureView ? (TextureView) c : null;
            if (textureView == null) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "BlurredVideoBg", "[blur] live player has no TextureView — gap stays black", null, false, 12, null);
                textureView = null;
            } else {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder("[blur] bringing up live layer (api=");
                int i = Build.VERSION.SDK_INT;
                MolocoLogger.info$default(molocoLogger, "BlurredVideoBg", wv8.j(sb, i, ')'), null, false, 12, null);
                if (i >= 31) {
                    float f = aVar.h;
                    textureView.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
                }
                textureView.setAlpha(1.0f);
                aVar.addView(textureView, new FrameLayout.LayoutParams(-1, -1));
                aVar.c(textureView, aVar.b, aVar.c);
                int width = aVar.getWidth();
                int height = aVar.getHeight();
                if (width > 0 && height > 0) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                    textureView.layout(0, 0, width, height);
                }
            }
            if (textureView == null) {
                return;
            }
            aVar.j = textureView;
            jVar.a(aVar.a);
            jVar.seekTo(aVar.o);
            aVar.a();
            ad2 ad2Var = aVar.l;
            if (ad2Var != null) {
                xw3.L(ad2Var, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(jVar, aVar, rq3Var, 18), 3);
            }
        }
    }

    public final void a() {
        j jVar = this.k;
        if (jVar == null) {
            return;
        }
        Boolean bool = this.p;
        if ((bool != null ? bool.booleanValue() : this.n) && this.q) {
            jVar.play();
        } else {
            jVar.pause();
        }
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int i4 = this.b;
        if (i == 0 || i2 == 0 || i4 == 0 || i3 == 0) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "BlurredVideoBg", "[blur] gate skipped — dimensions not ready (view=" + i + 'x' + i2 + " creative=" + i4 + 'x' + i3 + ')', null, false, 12, null);
            return;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i4 > 0 && i3 > 0 && i > 0 && i2 > 0) {
            float f2 = i;
            float f3 = i4;
            float f4 = i2;
            float f5 = i3;
            float min = Math.min(f2 / f3, f4 / f5);
            f = llf.b(1.0f - (((f5 * min) * (f3 * min)) / (f2 * f4)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("[blur] gate: view=");
        sb.append(i);
        sb.append('x');
        sb.append(i2);
        sb.append(" creative=");
        sb.append(i4);
        sb.append('x');
        sb.append(i3);
        sb.append(" gap=");
        sb.append(f);
        sb.append(" threshold=");
        float f6 = this.d;
        sb.append(f6);
        sb.append(" show=");
        sb.append(f > f6);
        MolocoLogger.info$default(molocoLogger, "BlurredVideoBg", sb.toString(), null, false, 12, null);
        if (f <= f6) {
            setVisibility(4);
            Runnable runnable = this.m;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.m = null;
                return;
            }
            return;
        }
        setVisibility(0);
        if (this.k == null) {
            if (this.m == null) {
                b bVar = new b(this, 13);
                this.m = bVar;
                post(bVar);
                return;
            }
            return;
        }
        TextureView textureView = this.j;
        if (textureView != null) {
            c(textureView, i4, i3);
            int width = getWidth();
            int height = getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            textureView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            textureView.layout(0, 0, width, height);
        }
    }

    public final void c(TextureView textureView, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return;
        }
        float f = width;
        float f2 = i;
        float f3 = height;
        float f4 = i2;
        float max = Math.max(f / f2, f3 / f4);
        Matrix matrix = new Matrix();
        matrix.setScale((f2 * max) / f, (f4 * max) / f3, f / 2.0f, f3 / 2.0f);
        textureView.setTransform(matrix);
    }

    @Nullable
    public final j getLiveVideoPlayer$moloco_sdk_release() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = s9a.c(e.d(bea.a(), this.i));
        b(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.m;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.m = null;
        ad2 ad2Var = this.l;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.l = null;
        j jVar = this.k;
        if (jVar != null) {
            jVar.destroy();
        }
        this.k = null;
        TextureView textureView = this.j;
        if (textureView != null) {
            removeView(textureView);
        }
        this.j = null;
        this.q = false;
        this.p = null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b(i, i2);
    }

    public static /* synthetic */ void getLiveVideoPlayer$moloco_sdk_release$annotations() {
    }
}
