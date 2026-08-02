package com.blaze.blazesdk.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.unity3d.services.UnityAdsConstants;
import defpackage.njf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/custom_views/BlazeShadingEdgeLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeShadingEdgeLayout extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public final Rect h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlazeShadingEdgeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, njf.b);
        obtainStyledAttributes.getClass();
        try {
            try {
                this.m = obtainStyledAttributes.getBoolean(7, this.m);
                this.n = obtainStyledAttributes.getBoolean(0, this.n);
                this.o = obtainStyledAttributes.getBoolean(1, this.o);
                this.p = obtainStyledAttributes.getBoolean(2, this.p);
                this.i = obtainStyledAttributes.getDimensionPixelSize(6, this.i);
                this.j = obtainStyledAttributes.getDimensionPixelSize(3, this.j);
                this.k = obtainStyledAttributes.getDimensionPixelSize(4, this.k);
                this.l = obtainStyledAttributes.getDimensionPixelSize(5, this.l);
            } catch (Exception e) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            }
            obtainStyledAttributes.recycle();
            if (this.m) {
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                this.a = paint;
                this.e = new Rect();
            }
            if (this.n) {
                Paint paint2 = new Paint(1);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                this.b = paint2;
                this.f = new Rect();
            }
            if (this.o) {
                Paint paint3 = new Paint(1);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                this.c = paint3;
                this.g = new Rect();
            }
            if (this.p) {
                Paint paint4 = new Paint(1);
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                this.d = paint4;
                this.h = new Rect();
            }
            a();
            setWillNotDraw(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        try {
            if (this.m) {
                Rect rect = this.e;
                int i = this.i;
                if (rect != null) {
                    rect.set(0, 0, getWidth(), i);
                }
                LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, 0, -16777216, Shader.TileMode.CLAMP);
                Paint paint = this.a;
                if (paint != null) {
                    paint.setShader(linearGradient);
                }
            }
            if (this.n) {
                Rect rect2 = this.f;
                int i2 = this.j;
                if (rect2 != null) {
                    rect2.set(0, getHeight() - i2, getWidth(), getHeight());
                }
                LinearGradient linearGradient2 = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight() - i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight(), -16777216, 0, Shader.TileMode.CLAMP);
                Paint paint2 = this.b;
                if (paint2 != null) {
                    paint2.setShader(linearGradient2);
                }
            }
            if (this.o) {
                Rect rect3 = this.g;
                int i3 = this.k;
                if (rect3 != null) {
                    rect3.set(0, 0, i3, getHeight());
                }
                LinearGradient linearGradient3 = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -16777216, Shader.TileMode.CLAMP);
                Paint paint3 = this.c;
                if (paint3 != null) {
                    paint3.setShader(linearGradient3);
                }
            }
            if (this.p) {
                Rect rect4 = this.h;
                int i4 = this.l;
                if (rect4 != null) {
                    rect4.set(getWidth() - i4, 0, getWidth(), getHeight());
                }
                LinearGradient linearGradient4 = new LinearGradient(getWidth() - i4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216, 0, Shader.TileMode.CLAMP);
                Paint paint4 = this.d;
                if (paint4 != null) {
                    paint4.setShader(linearGradient4);
                }
            }
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Rect rect;
        Paint paint;
        Rect rect2;
        Paint paint2;
        Rect rect3;
        Paint paint3;
        Rect rect4;
        Paint paint4;
        canvas.getClass();
        int saveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        boolean z = false;
        try {
            View childAt = getChildAt(0);
            if (childAt != null) {
                boolean z2 = this.m && childAt.canScrollVertically(-1);
                boolean z3 = this.n && childAt.canScrollVertically(1);
                boolean z4 = this.o && childAt.canScrollHorizontally(-1);
                if (this.p && childAt.canScrollHorizontally(1)) {
                    z = true;
                }
                if (z2 && (rect4 = this.e) != null && (paint4 = this.a) != null) {
                    canvas.drawRect(rect4, paint4);
                }
                if (z3 && (rect3 = this.f) != null && (paint3 = this.b) != null) {
                    canvas.drawRect(rect3, paint3);
                }
                if (z4 && (rect2 = this.g) != null && (paint2 = this.c) != null) {
                    canvas.drawRect(rect2, paint2);
                }
                if (z && (rect = this.h) != null && (paint = this.d) != null) {
                    canvas.drawRect(rect, paint);
                }
            }
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeShadingEdgeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BlazeShadingEdgeLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeShadingEdgeLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
