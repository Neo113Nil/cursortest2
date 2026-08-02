package com.vk.core.view.components.skeleton;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.i0f0;
import xsna.msy;
import xsna.too0;
import xsna.vjv0;
import xsna.xq;

/* compiled from: VkSkeleton.kt */
/* loaded from: classes17.dex */
public final class VkSkeleton extends View implements vjv0, too0 {
    public static final /* synthetic */ int i = 0;
    public final Rect b;
    public final int[] c;
    public final Object d;
    public final boolean e;
    public a f;
    public com.vk.core.view.components.skeleton.a g;
    public boolean h;

    /* compiled from: VkSkeleton.kt */
    public interface a {

        /* compiled from: VkSkeleton.kt */
        /* renamed from: com.vk.core.view.components.skeleton.VkSkeleton$a$a, reason: collision with other inner class name */
        public static final class C0862a implements a {
            public final float a;

            public C0862a() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0862a) && Float.compare(this.a, ((C0862a) obj).a) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.a);
            }

            public final String toString() {
                return xq.c(')', this.a, new StringBuilder("Block(radiusDp="));
            }

            public C0862a(@SuppressLint({"Range"}) float f) {
                this.a = f;
            }

            public /* synthetic */ C0862a(int i) {
                this(-1.0f);
            }
        }

        /* compiled from: VkSkeleton.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -166701305;
            }

            public final String toString() {
                return "Circle";
            }
        }

        /* compiled from: VkSkeleton.kt */
        public static final class c implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Custom(clipPath=null)";
            }
        }

        /* compiled from: VkSkeleton.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 291228649;
            }

            public final String toString() {
                return "Simple";
            }
        }
    }

    public VkSkeleton(Context context) {
        this(context, null, 0, 14, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.core.view.shimmer.b getShimmerDrawable() {
        return (com.vk.core.view.shimmer.b) this.d.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        getShimmerDrawable().Ng();
    }

    public com.vk.core.view.components.skeleton.a getArea() {
        return this.g;
    }

    public boolean getShimmerManagedExternally() {
        return this.h;
    }

    public final a getType() {
        return this.f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        getShimmerDrawable().c();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        super.onDetachedFromWindow();
        if (getShimmerManagedExternally() || (valueAnimator = getShimmerDrawable().g) == null) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.removeAllUpdateListeners();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        com.vk.core.view.components.skeleton.a area = getArea();
        com.vk.core.view.shimmer.b shimmerDrawable = getShimmerDrawable();
        int[] iArr = this.c;
        b.a(this, area, shimmerDrawable, this.b, iArr);
        a aVar = this.f;
        if (!this.e && (aVar instanceof a.c)) {
            ((a.c) aVar).getClass();
            canvas.clipPath(null);
        }
        getShimmerDrawable().a(canvas, r3.left);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        com.vk.core.view.shimmer.b shimmerDrawable;
        ValueAnimator valueAnimator;
        super.onVisibilityChanged(view, i2);
        if (getShimmerManagedExternally()) {
            return;
        }
        if (i2 == 0) {
            getShimmerDrawable().c();
        } else if ((i2 == 4 || i2 == 8) && (valueAnimator = (shimmerDrawable = getShimmerDrawable()).g) != null && valueAnimator.isStarted()) {
            shimmerDrawable.g.cancel();
        }
    }

    @Override // xsna.vjv0
    public void setArea(com.vk.core.view.components.skeleton.a aVar) {
        this.g = aVar;
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        com.vk.core.view.shimmer.b shimmerDrawable = getShimmerDrawable();
        shimmerDrawable.b = themableShimmer;
        shimmerDrawable.b();
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.h = z;
    }

    public final void setType(a aVar) {
        this.f = aVar;
        if (epx.f(aVar, a.d.a)) {
            setClipToOutline(false);
            setOutlineProvider(null);
            return;
        }
        if (epx.f(aVar, a.b.a)) {
            setClipToOutline(true);
            setOutlineProvider(new c());
            return;
        }
        if (aVar instanceof a.C0862a) {
            setClipToOutline(true);
            setOutlineProvider(new d((a.C0862a) aVar, this));
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.e) {
                setClipToOutline(false);
            } else {
                setClipToOutline(true);
                setOutlineProvider(new e());
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == getShimmerDrawable();
    }

    public VkSkeleton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkSkeleton(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 8, 0);
    }

    public /* synthetic */ VkSkeleton(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, 0);
    }

    public VkSkeleton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.b = new Rect();
        this.c = new int[2];
        this.d = msy.a(LazyThreadSafetyMode.NONE, new i0f0(context, 1));
        int i4 = 0;
        this.e = Build.VERSION.SDK_INT >= 33;
        this.f = new a.C0862a(i4);
        this.g = a.c.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.z, 0, 0);
        setType(obtainStyledAttributes.getInteger(1, 0) == 0 ? new a.C0862a(obtainStyledAttributes.getDimension(0, -1.0f)) : a.b.a);
        obtainStyledAttributes.recycle();
        getShimmerDrawable().setCallback(this);
    }
}
