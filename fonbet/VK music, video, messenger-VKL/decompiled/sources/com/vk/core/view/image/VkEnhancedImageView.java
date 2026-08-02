package com.vk.core.view.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.vk.R$styleable;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.epx;
import xsna.fhs;
import xsna.fpf0;
import xsna.fxj0;
import xsna.gzs;
import xsna.hwi0;
import xsna.izs;
import xsna.m33;
import xsna.p5j;
import xsna.p7f0;
import xsna.qcy;
import xsna.s3q0;
import xsna.u19;
import xsna.zjt;
import xsna.zlp;

/* compiled from: VkEnhancedImageView.kt */
/* loaded from: classes17.dex */
public class VkEnhancedImageView extends zjt<fhs> {
    public static final /* synthetic */ qcy<Object>[] q = {new MutablePropertyReference1Impl(VkEnhancedImageView.class, "maximumWidth", "getMaximumWidth()I", 0), p5j.a(0, VkEnhancedImageView.class, "maximumHeight", "getMaximumHeight()I", fpf0.a), new MutablePropertyReference1Impl(VkEnhancedImageView.class, "scaleType", "getScaleType()Lcom/vk/core/util/measure/ScaleType;", 0)};
    public static final hwi0 r = new hwi0(17);
    public final zlp k;
    public final a l;
    public final a m;
    public final a n;
    public boolean o;
    public Drawable p;

    /* compiled from: VkEnhancedImageView.kt */
    public static final class a<T> implements p7f0<VkEnhancedImageView, T> {
        public final izs<T, s3q0> b;
        public T c;

        public /* synthetic */ a() {
            this(0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(VkEnhancedImageView vkEnhancedImageView, Object obj) {
            if (epx.f(obj, this.c)) {
                return;
            }
            this.c = obj;
            izs<T, s3q0> izsVar = this.b;
            if (izsVar != null) {
                izsVar.invoke(obj);
            }
            vkEnhancedImageView.k.e();
            vkEnhancedImageView.requestLayout();
            vkEnhancedImageView.invalidate();
        }

        @Override // xsna.i7f0
        public final Object getValue(Object obj, qcy qcyVar) {
            return this.c;
        }

        @Override // xsna.p7f0
        public final /* bridge */ /* synthetic */ void setValue(VkEnhancedImageView vkEnhancedImageView, qcy qcyVar, Object obj) {
            a(vkEnhancedImageView, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Integer num, b bVar) {
            this.b = bVar;
            this.c = num;
        }
    }

    /* compiled from: VkEnhancedImageView.kt */
    public final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ScaleType, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ScaleType scaleType) {
            ((VkEnhancedImageView) this.receiver).k.t(scaleType);
            return s3q0.a;
        }
    }

    public VkEnhancedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        setMaximumWidth(typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE));
        int i = typedArray.getInt(7, ScaleType.CENTER_INSIDE.h());
        ScaleType.Companion.getClass();
        setScaleType(ScaleType.a.a(i));
        setAspectRatio(typedArray.getFloat(2, -1.0f));
        setPlaceholder(typedArray.getDrawable(8));
        setEmptyPlaceholder(typedArray.getDrawable(4));
        setBgFillDrawable(typedArray.getDrawable(6));
        this.k.v(typedArray.getBoolean(3, false));
        setFadeDuration(typedArray.getInt(5, 300));
    }

    @Override // xsna.zjt
    public final fhs b0() {
        fhs fhsVar = new fhs(this);
        fhsVar.f = new u19(1, this, VkEnhancedImageView.class, "buildHierarchy", "buildHierarchy(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)V", 0, 9);
        return fhsVar;
    }

    @Override // xsna.zjt
    public final void clear() {
        super.clear();
        this.k.clear();
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.k.c();
    }

    public final gzs<Boolean> getIgnoreTrafficSaverPredicate() {
        return this.k.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMaximumHeight() {
        qcy<Object> qcyVar = q[1];
        return ((Number) this.m.c).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMaximumWidth() {
        qcy<Object> qcyVar = q[0];
        return ((Number) this.l.c).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ImageView
    public final ScaleType getScaleType() {
        qcy<Object> qcyVar = q[2];
        return (ScaleType) this.n.c;
    }

    public final boolean getSimpleAspectRatio() {
        return this.o;
    }

    public final boolean getWithImageDownscale() {
        return this.k.w();
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.k.d() && (drawable = this.p) != null) {
            drawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        boolean z2 = this.o;
        zlp zlpVar = this.k;
        if (z2 && getAspectRatio() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            zlpVar.k(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        if (this.p != null && !zlpVar.d() && (drawable = this.p) != null) {
            drawable.setBounds(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        zlpVar.k(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getSuggestedMinimumWidth() > getMaxWidth()) {
            throw new IllegalStateException("minWidth is greater than maxWidth");
        }
        if (getSuggestedMinimumHeight() > getMaxHeight()) {
            throw new IllegalStateException("minHeight is greater than maxHeight");
        }
        boolean z = this.o;
        zlp zlpVar = this.k;
        if (!z || getAspectRatio() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Size r2 = this.k.r(i, i2, getSuggestedMinimumWidth(), getSuggestedMinimumHeight(), getMaximumWidth(), getMaximumHeight(), getPaddingRight() + getPaddingLeft(), getPaddingBottom() + getPaddingTop(), getScaleType(), getAspectRatio());
            setMeasuredDimension(r2.getWidth(), r2.getHeight());
            zlpVar.m();
            return;
        }
        float aspectRatio = getAspectRatio();
        int size = View.MeasureSpec.getSize(i);
        float f = size;
        int ceil = (int) Math.ceil(f / aspectRatio);
        int maximumHeight = getMaximumHeight();
        if (1 <= maximumHeight && maximumHeight < ceil) {
            float f2 = ceil;
            float maximumHeight2 = getMaximumHeight() / f2;
            ceil = (int) (f2 * maximumHeight2);
            size = (int) (f * maximumHeight2);
        }
        int maximumWidth = getMaximumWidth();
        if (1 <= maximumWidth && maximumWidth < size) {
            float f3 = size;
            float maximumWidth2 = getMaximumWidth() / f3;
            ceil = (int) (ceil * maximumWidth2);
            size = (int) (f3 * maximumWidth2);
        }
        setMeasuredDimension(size, ceil);
        zlpVar.m();
    }

    public final void setBgFillDrawable(int i) {
        setBgFillDrawable(m33.a(i, getContext()));
    }

    @Override // android.widget.ImageView, xsna.msx0
    public void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        invalidate();
    }

    public final void setEmptyPlaceholder(Drawable drawable) {
        this.k.q(drawable);
    }

    public final void setFadeDuration(int i) {
        this.k.n(i);
    }

    public final void setIgnoreTrafficSaverPredicate(gzs<Boolean> gzsVar) {
        this.k.u(gzsVar);
    }

    public final void setLocalImage(fxj0 fxj0Var) {
        this.k.l(fxj0Var);
        requestLayout();
        invalidate();
    }

    public final void setMaximumHeight(int i) {
        qcy<Object> qcyVar = q[1];
        this.m.a(this, Integer.valueOf(i));
    }

    public final void setMaximumWidth(int i) {
        qcy<Object> qcyVar = q[0];
        this.l.a(this, Integer.valueOf(i));
    }

    public final void setPlaceholder(int i) {
        setPlaceholder(m33.a(i, getContext()));
    }

    public final void setRemoteImage(fxj0 fxj0Var) {
        this.k.j(fxj0Var);
        requestLayout();
        invalidate();
    }

    public final void setRemoteImages(List<? extends fxj0> list) {
        this.k.g(list);
        requestLayout();
        invalidate();
    }

    public final void setScaleType(ScaleType scaleType) {
        qcy<Object> qcyVar = q[2];
        this.n.a(this, scaleType);
    }

    public final void setSimpleAspectRatio(boolean z) {
        this.o = z;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.k.e();
    }

    public final void setWithImageDownscale(boolean z) {
        this.k.s(z);
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.k.f(drawable) || drawable == this.p || super.verifyDrawable(drawable);
    }

    @Override // xsna.zjt
    public final void x0() {
        super.x0();
        this.k.h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkEnhancedImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        zlp zlpVar = (zlp) r.invoke(this);
        zlpVar.o();
        this.k = zlpVar;
        this.l = new a();
        this.m = new a();
        this.n = new a(null, new b(1, this, VkEnhancedImageView.class, "applyScaleType", "applyScaleType(Lcom/vk/core/util/measure/ScaleType;)V", 0));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public final void setBgFillDrawable(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            unscheduleDrawable(drawable2);
            drawable2.setCallback(null);
        }
        this.p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
        invalidate();
    }

    public final void setPlaceholder(Drawable drawable) {
        this.k.setPlaceholder(drawable);
    }

    public final void setLocalImage(List<? extends fxj0> list) {
        this.k.p(list);
        requestLayout();
        invalidate();
    }
}
