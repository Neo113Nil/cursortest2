package com.vk.photo.editor.features.collage.view;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vkontakte.android.R;
import defpackage.e;
import defpackage.f;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c2g;
import xsna.d2g;
import xsna.e43;
import xsna.epx;
import xsna.f56;
import xsna.fdi;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.kt50;
import xsna.p31;
import xsna.pcj;
import xsna.s3q0;
import xsna.svd;
import xsna.tbb;
import xsna.tm1;
import xsna.to50;
import xsna.u11;
import xsna.uo50;
import xsna.wpg0;

/* compiled from: CollageSlotView.kt */
/* loaded from: classes4.dex */
public final class CollageSlotView extends RelativeLayout {
    public static final /* synthetic */ int r = 0;
    public gzs<s3q0> b;
    public izs<? super d2g, s3q0> c;
    public gzs<s3q0> d;
    public boolean e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public c2g l;
    public Size m;
    public SizeF n;
    public boolean o;
    public boolean p;
    public final kt50 q;

    /* compiled from: CollageSlotView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<kt50.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(kt50.a aVar) {
            kt50.a aVar2 = aVar;
            CollageSlotView collageSlotView = (CollageSlotView) this.receiver;
            if (collageSlotView.e) {
                izs<? super d2g, s3q0> izsVar = collageSlotView.c;
                if (izsVar != null) {
                    izsVar.invoke(new d2g(null, null, null, null, Float.valueOf(aVar2.e), Float.valueOf(aVar2.f), aVar2.g, Float.valueOf(aVar2.h), 11));
                }
                if (collageSlotView.m != null) {
                    fdi.J(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r15.getWidth(), r15.getHeight()), new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, collageSlotView.getWidth(), collageSlotView.getHeight()));
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: CollageSlotView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            bool.getClass();
            CollageSlotView collageSlotView = (CollageSlotView) this.receiver;
            int i = CollageSlotView.r;
            collageSlotView.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new p31(collageSlotView, 8), 50L);
            gzs<s3q0> gzsVar = collageSlotView.d;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            return s3q0.a;
        }
    }

    public CollageSlotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kt50 kt50Var = new kt50(this, new e(this, 26));
        this.q = kt50Var;
        addView(LayoutInflater.from(context).inflate(R.layout.collage_slot_view, (ViewGroup) null));
        this.f = findViewById(R.id.emptyView);
        this.g = findViewById(R.id.loadingView);
        View findViewById = findViewById(R.id.borderLeft);
        this.h = findViewById;
        View findViewById2 = findViewById(R.id.borderTop);
        this.i = findViewById2;
        View findViewById3 = findViewById(R.id.borderRight);
        this.j = findViewById3;
        View findViewById4 = findViewById(R.id.borderBottom);
        this.k = findViewById4;
        kt50Var.d = new f(this, 23);
        kt50Var.e = new a(1, this, CollageSlotView.class, "handleUserTransform", "handleUserTransform(Lcom/vk/photo/editor/features/collage/view/helper/MyTouchListener$Transform;)V", 0);
        kt50Var.f = new b(1, this, CollageSlotView.class, "handleUserTransformEnd", "handleUserTransformEnd(Z)V", 0);
        setOnTouchListener(kt50Var);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.editorSlotNeighbors});
        int i = obtainStyledAttributes.getInt(0, 0);
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        boolean z3 = (i & 4) == 4;
        boolean z4 = (i & 8) == 8;
        int floor = (int) Math.floor(0.75f * Resources.getSystem().getDisplayMetrics().density);
        int floor2 = (int) Math.floor(1.5f * Resources.getSystem().getDisplayMetrics().density);
        findViewById.getLayoutParams().width = z ? floor : floor2;
        findViewById2.getLayoutParams().height = z2 ? floor : floor2;
        findViewById3.getLayoutParams().width = z3 ? floor : floor2;
        findViewById4.getLayoutParams().height = z4 ? floor : floor2;
        obtainStyledAttributes.recycle();
        setContentDescription(context.getResources().getString(R.string.editor_accessibility_collage_select_slot));
        setFocusableInTouchMode(true);
    }

    public static void a(float f, float f2, float f3, float f4, float f5, float f6, CollageSlotView collageSlotView, to50.b bVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float b2 = u11.b(f2, f, floatValue, f);
        float b3 = u11.b(f4, f3, floatValue, f3);
        float b4 = u11.b(f6, f5, floatValue, f5);
        izs<? super d2g, s3q0> izsVar = collageSlotView.c;
        if (izsVar != null) {
            izsVar.invoke(new d2g(Float.valueOf(b2 / collageSlotView.getCollageWidth()), Float.valueOf(b3 / collageSlotView.getCollageHeight()), Float.valueOf(b4), Float.valueOf(bVar.d), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK));
        }
    }

    private final float getCollageHeight() {
        return ((View) getParent()).getHeight();
    }

    private final float getCollageWidth() {
        return ((View) getParent()).getWidth();
    }

    public final to50.b b(c2g c2gVar) {
        if (this.m == null) {
            return null;
        }
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r2.getWidth(), r2.getHeight());
        RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight());
        fdi.J(rectF, rectF2);
        float f = c2gVar.e;
        float f2 = c2gVar.g;
        float f3 = c2gVar.h;
        float collageWidth = f * getCollageWidth();
        float collageHeight = c2gVar.f * getCollageHeight();
        if (Math.abs(f3) < 5.0f) {
            f3 = -0.5f;
        }
        RectF rectF3 = new RectF(rectF.left + collageWidth, rectF.top + collageHeight, rectF.right + collageWidth, rectF.bottom + collageHeight);
        float[] O = fdi.O(rectF2, 1.0f, -f3, Float.valueOf(rectF3.centerX()), Float.valueOf(rectF3.centerY()));
        int i = 1;
        List l = e43.l(new float[]{O[0], O[1]}, new float[]{O[2], O[3]}, new float[]{O[4], O[5]}, new float[]{O[6], O[7]});
        float[] O2 = fdi.O(rectF3, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null);
        to50 to50Var = new to50(O2[0], O2[1], O2[4], O2[5]);
        List list = l;
        List D0 = j5g.D0(new pcj(i), list);
        List D02 = j5g.D0(new uo50(), list);
        float[] fArr = (float[]) j5g.Y(D0);
        to50.d dVar = new to50.d(fArr[0], fArr[1]);
        float[] fArr2 = (float[]) j5g.i0(D0);
        to50.d dVar2 = new to50.d(fArr2[0], fArr2[1]);
        float[] fArr3 = (float[]) j5g.Y(D02);
        to50.d dVar3 = new to50.d(fArr3[0], fArr3[1]);
        float[] fArr4 = (float[]) j5g.i0(D02);
        to50.d dVar4 = new to50.d(fArr4[0], fArr4[1]);
        List l2 = e43.l(new f56(to50Var, dVar, dVar2, 2), new tbb(to50Var, dVar3, dVar4, 4), new svd(to50Var, dVar2, dVar, 7), new tm1(to50Var, dVar4, dVar3, 5));
        int intValue = ((Number) ((Pair) j5g.y0(j5g.D0(new wpg0(i), e43.l(new Pair(Float.valueOf(to50Var.a.a.a - dVar.a), 0), new Pair(Float.valueOf(to50Var.b.a.b - dVar3.b), 1), new Pair(Float.valueOf(dVar2.a - to50Var.c.a.a), 2), new Pair(Float.valueOf(dVar4.b - to50Var.d.a.b), 3)))).get(0)).j()).intValue();
        to50.b a2 = ((to50.b) ((gzs) l2.get(intValue)).invoke()).a((to50.b) ((gzs) l2.get((intValue + 1) % 4)).invoke()).a((to50.b) ((gzs) l2.get((intValue + 2) % 4)).invoke()).a((to50.b) ((gzs) l2.get((intValue + 3) % 4)).invoke());
        float[] fArr5 = {a2.b, a2.c};
        Matrix matrix = new Matrix();
        matrix.setRotate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        matrix.mapPoints(fArr5);
        float f4 = a2.a;
        float f5 = fArr5[0];
        float f6 = fArr5[1];
        if (Math.abs(f3) <= Math.abs(-0.5f)) {
            f3 = 0.0f;
        }
        if (Math.abs(f4 - f2) >= 0.005d) {
            f2 = f4;
        }
        if (Math.abs(f5) < 0.005d) {
            f5 = 0.0f;
        }
        return new to50.b(f2, f5, ((double) Math.abs(f6)) < 0.005d ? 0.0f : f6, f3);
    }

    public final void c(boolean z) {
        final to50.b b2;
        c2g c2gVar = this.l;
        if (c2gVar == null || (b2 = b(c2gVar)) == null) {
            return;
        }
        float f = b2.a;
        float f2 = b2.c;
        float f3 = b2.b;
        if (!z) {
            izs<? super d2g, s3q0> izsVar = this.c;
            if (izsVar != null) {
                izsVar.invoke(new d2g(null, null, Float.valueOf(c2gVar.g * f), Float.valueOf(b2.d), Float.valueOf(f3 / getCollageWidth()), Float.valueOf(f2 / getCollageHeight()), null, null, 195));
                return;
            }
            return;
        }
        final float collageWidth = c2gVar.e * getCollageWidth();
        final float collageHeight = c2gVar.f * getCollageHeight();
        final float f4 = c2gVar.g;
        final float f5 = collageWidth + f3;
        final float f6 = collageHeight + f2;
        final float f7 = f4 * f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        ofFloat.setInterpolator(new TimeInterpolator() { // from class: xsna.e2g
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f8) {
                int i = CollageSlotView.r;
                return accelerateDecelerateInterpolator.getInterpolation(f8);
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.f2g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CollageSlotView.a(collageWidth, f5, collageHeight, f6, f4, f7, this, b2, valueAnimator);
            }
        });
        ofFloat.start();
    }

    public final gzs<s3q0> getOnClick() {
        return this.b;
    }

    public final izs<d2g, s3q0> getOnTransform() {
        return this.c;
    }

    public final gzs<s3q0> getOnTransformEnd() {
        return this.d;
    }

    public final d2g getSpringTransform() {
        to50.b b2;
        c2g c2gVar = this.l;
        if (c2gVar == null || (b2 = b(c2gVar)) == null) {
            return null;
        }
        return new d2g(null, null, Float.valueOf(c2gVar.g * b2.a), Float.valueOf(b2.d), Float.valueOf(b2.b / getCollageWidth()), Float.valueOf(b2.c / getCollageHeight()), null, null, 195);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.n = new SizeF(getCollageWidth(), getCollageHeight());
        if (this.o) {
            c(false);
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void setConfig(c2g c2gVar) {
        if (epx.f(c2gVar, this.l)) {
            return;
        }
        View view = this.f;
        if (c2gVar != null) {
            view.setVisibility(c2gVar.i == null ? 0 : 8);
            setImportantForAccessibility(view.getVisibility() != 0 ? 1 : 2);
        } else {
            this.g.setVisibility(8);
            view.setVisibility(0);
            setImportantForAccessibility(2);
        }
        this.l = c2gVar;
    }

    public final void setImageSize(Size size) {
        this.m = size;
        if (this.p) {
            c(false);
            this.p = false;
        }
    }

    public final void setLoading(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public final void setOnClick(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public final void setOnTransform(izs<? super d2g, s3q0> izsVar) {
        this.c = izsVar;
    }

    public final void setOnTransformEnd(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
    }

    public final void setSlotSelected(boolean z) {
        this.e = z;
        setSelected(z);
        this.q.g = z;
    }
}
