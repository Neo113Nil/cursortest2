package com.vk.core.tool.view.vkblur;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.graphics.BlendModeCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurView;
import xsna.a90;
import xsna.bpn0;
import xsna.ca0;
import xsna.da0;
import xsna.efu0;
import xsna.f62;
import xsna.fa0;
import xsna.hg90;
import xsna.ip;
import xsna.s101;
import xsna.wb3;

/* compiled from: VkBlurView.kt */
/* loaded from: classes.dex */
public final class VkBlurView extends FrameLayout {
    public static final /* synthetic */ int C = 0;
    public int A;
    public final efu0 B;
    public boolean b;
    public float c;
    public GradientDirection d;
    public Shader e;
    public Shader f;
    public final float g;
    public final bpn0 h;
    public int i;
    public int j;
    public RenderNode k;
    public RenderNode l;
    public RenderEffect m;
    public float n;
    public boolean o;
    public int p;
    public int q;
    public VkBlurContentView r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final PorterDuffXfermode v;
    public final int[] w;
    public final int[] x;
    public final ip y;
    public int z;

    public VkBlurView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void a(VkBlurView vkBlurView) {
        VkBlurContentView vkBlurContentView = vkBlurView.r;
        if (vkBlurContentView == null || !vkBlurView.b || vkBlurView.c <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Build.VERSION.SDK_INT < 31) {
            return;
        }
        vkBlurContentView.getLocationOnScreen(vkBlurView.w);
        vkBlurView.getLocationOnScreen(vkBlurView.x);
        if (vkBlurView.getLeftPos() == vkBlurView.z && vkBlurView.getTopPos() == vkBlurView.A) {
            return;
        }
        vkBlurView.invalidate();
    }

    private final RenderNode getBlurNode() {
        return a90.c(this.h.getValue());
    }

    private final boolean getFlipGradient() {
        return this.d == GradientDirection.BottomTop;
    }

    private final int getLeftPos() {
        return this.w[0] - this.x[0];
    }

    private final int getTopPos() {
        return this.w[1] - this.x[1];
    }

    public final boolean getBlurEnabled() {
        return this.b;
    }

    public final float getBlurRadius() {
        return this.c;
    }

    public final Shader getColorOverlayShader() {
        return this.e;
    }

    public final Shader getFallbackColorOverlay() {
        return this.f;
    }

    public final GradientDirection getGradientDirection() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        VkBlurContentView vkBlurContentView;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && (vkBlurContentView = this.r) != null) {
            vkBlurContentView.a(this.y);
        }
        if (i >= 31) {
            getViewTreeObserver().addOnPreDrawListener(this.B);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        VkBlurContentView vkBlurContentView = this.r;
        if (vkBlurContentView != null) {
            vkBlurContentView.b(this.y);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this.B);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            getBlurNode().discardDisplayList();
            RenderNode renderNode = this.k;
            if (renderNode != null) {
                renderNode.discardDisplayList();
            }
            RenderNode renderNode2 = this.l;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RecordingCanvas beginRecording;
        RecordingCanvas beginRecording2;
        RenderEffect createBlurEffect;
        float f;
        float f2;
        RecordingCanvas beginRecording3;
        int saveLayer;
        RenderNode renderNode;
        RenderEffect createBlurEffect2;
        super.onDraw(canvas);
        if (this.b) {
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || !canvas.isHardwareAccelerated() || !ca0.g(canvas)) {
                if (this.f == null) {
                    return;
                }
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), this.t);
                return;
            }
            VkBlurContentView vkBlurContentView = this.r;
            if (vkBlurContentView != null && this.c > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                RecordingCanvas b = f62.b(canvas);
                if (getWidth() == 0 || getHeight() == 0) {
                    return;
                }
                VkBlurContentView vkBlurContentView2 = this.r;
                if (vkBlurContentView2 != null) {
                    vkBlurContentView2.getLocationOnScreen(this.w);
                }
                getLocationOnScreen(this.x);
                this.z = getLeftPos();
                this.A = getTopPos();
                float width = getWidth();
                float f3 = this.g;
                int i2 = (int) (width / f3);
                if (i2 < 1) {
                    i2 = 1;
                }
                this.i = i2;
                int height = (int) (getHeight() / f3);
                this.j = height >= 1 ? height : 1;
                getBlurNode().setPosition(0, 0, this.i, this.j);
                beginRecording = getBlurNode().beginRecording();
                try {
                    beginRecording.drawColor(vkBlurContentView.c());
                    beginRecording.scale(this.i / getWidth(), this.j / getHeight());
                    beginRecording.translate(getLeftPos(), getTopPos());
                    beginRecording.drawRenderNode(vkBlurContentView.getRenderNode$foundation_release());
                    getBlurNode().endRecording();
                    float width2 = this.c / (getWidth() / this.i);
                    if (width2 < 1.0f) {
                        width2 = 1.0f;
                    }
                    if (this.d == null) {
                        renderNode = getBlurNode();
                        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
                        createBlurEffect2 = RenderEffect.createBlurEffect(width2, width2, Shader.TileMode.MIRROR);
                        renderNode.setRenderEffect(createBlurEffect2);
                    } else if (i >= 33) {
                        renderNode = getBlurNode();
                        RenderEffect renderEffect = this.m;
                        if (renderEffect == null || this.n != width2 || this.o != getFlipGradient() || this.p != this.i || this.q != this.j) {
                            renderEffect = s101.l(width2, this.i, this.j, getFlipGradient());
                            this.m = renderEffect;
                            this.n = width2;
                            this.o = getFlipGradient();
                            this.p = this.i;
                            this.q = this.j;
                        }
                        renderNode.setRenderEffect(renderEffect);
                    } else {
                        Paint paint = this.u;
                        RenderNode renderNode2 = this.l;
                        if (renderNode2 == null) {
                            renderNode2 = da0.a();
                            this.l = renderNode2;
                        }
                        RenderNode renderNode3 = this.k;
                        if (renderNode3 == null) {
                            renderNode3 = fa0.c();
                            this.k = renderNode3;
                        }
                        getBlurNode().setRenderEffect(null);
                        renderNode2.setPosition(0, 0, this.i, this.j);
                        beginRecording2 = renderNode2.beginRecording();
                        try {
                            beginRecording2.drawRenderNode(getBlurNode());
                            renderNode2.endRecording();
                            Shader.TileMode tileMode2 = Shader.TileMode.MIRROR;
                            createBlurEffect = RenderEffect.createBlurEffect(width2, width2, Shader.TileMode.MIRROR);
                            renderNode2.setRenderEffect(createBlurEffect);
                            float f4 = this.i;
                            float f5 = this.j;
                            if (getFlipGradient()) {
                                f = 0.55f * f5;
                                f2 = f5;
                            } else {
                                f = 0.45f * f5;
                                f2 = 0.0f;
                            }
                            float f6 = f;
                            renderNode2.setPosition(0, 0, this.i, this.j);
                            beginRecording3 = renderNode2.beginRecording();
                            try {
                                beginRecording3.drawRenderNode(renderNode2);
                                saveLayer = beginRecording3.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f5, null);
                                beginRecording3.drawRenderNode(getBlurNode());
                                paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, -16777216, 0, Shader.TileMode.CLAMP));
                                paint.setXfermode(this.v);
                                beginRecording3.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f5, paint);
                                beginRecording3.restoreToCount(saveLayer);
                                renderNode2.endRecording();
                                renderNode2.setRenderEffect(null);
                                renderNode = renderNode2;
                            } finally {
                            }
                        } finally {
                        }
                    }
                    int save = b.save();
                    b.scale(getWidth() / this.i, getHeight() / this.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    try {
                        b.drawRenderNode(renderNode);
                        b.restoreToCount(save);
                        if (this.e == null) {
                            return;
                        }
                        b.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b.getWidth(), b.getHeight(), this.s);
                    } catch (Throwable th) {
                        b.restoreToCount(save);
                        throw th;
                    }
                } catch (Throwable th2) {
                    getBlurNode().endRecording();
                    throw th2;
                }
            }
        }
    }

    public final void setBlurEnabled(boolean z) {
        this.b = z;
        invalidate();
    }

    public final void setBlurRadius(float f) {
        this.c = f;
        invalidate();
    }

    public final void setColorOverlayShader(Shader shader) {
        this.e = shader;
        this.s.setShader(shader);
        invalidate();
    }

    public final void setFallbackColorOverlay(Shader shader) {
        this.f = shader;
        this.t.setShader(shader);
        invalidate();
    }

    public final void setGradientDirection(GradientDirection gradientDirection) {
        this.d = gradientDirection;
        invalidate();
    }

    public final void setupWithContent(VkBlurContentView vkBlurContentView) {
        VkBlurContentView vkBlurContentView2;
        VkBlurContentView vkBlurContentView3 = this.r;
        if (vkBlurContentView3 == vkBlurContentView) {
            return;
        }
        ip ipVar = this.y;
        if (vkBlurContentView3 != null) {
            vkBlurContentView3.b(ipVar);
        }
        this.r = vkBlurContentView;
        if (!isAttachedToWindow() || Build.VERSION.SDK_INT < 31 || (vkBlurContentView2 = this.r) == null) {
            return;
        }
        vkBlurContentView2.a(ipVar);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [xsna.efu0] */
    public VkBlurView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setWillNotDraw(false);
        this.b = true;
        this.c = 20.0f;
        this.g = 2.0f;
        this.h = new bpn0(new wb3(9));
        Paint paint = new Paint();
        BlendModeCompat blendModeCompat = BlendModeCompat.SRC_OVER;
        hg90.a(paint, blendModeCompat);
        this.s = paint;
        Paint paint2 = new Paint();
        hg90.a(paint2, blendModeCompat);
        this.t = paint2;
        this.u = new Paint();
        this.v = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.w = new int[2];
        this.x = new int[2];
        this.y = new ip(this, 8);
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.efu0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                VkBlurView.a(VkBlurView.this);
                return true;
            }
        };
    }
}
