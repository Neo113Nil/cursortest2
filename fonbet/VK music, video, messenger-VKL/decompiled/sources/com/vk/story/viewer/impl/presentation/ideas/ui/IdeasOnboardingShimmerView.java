package com.vk.story.viewer.impl.presentation.ideas.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;
import com.vk.story.viewer.impl.R$styleable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.asp;
import xsna.ilq;
import xsna.n8g;
import xsna.swe0;
import xsna.u11;
import xsna.zrp;

/* compiled from: IdeasOnboardingShimmerView.kt */
/* loaded from: classes6.dex */
public final class IdeasOnboardingShimmerView extends View {
    public static final /* synthetic */ int l = 0;
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public final ilq f;
    public final float g;
    public final float h;
    public final long i;
    public final long j;
    public final Direction k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IdeasOnboardingShimmerView.kt */
    public static final class Direction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction BOTTOM_TO_TOP;
        public static final Direction LEFT_TO_RIGHT;
        public static final Direction RIGHT_TO_LEFT;
        public static final Direction TOP_TO_BOTTOM;

        static {
            Direction direction = new Direction("LEFT_TO_RIGHT", 0);
            LEFT_TO_RIGHT = direction;
            Direction direction2 = new Direction("RIGHT_TO_LEFT", 1);
            RIGHT_TO_LEFT = direction2;
            Direction direction3 = new Direction("TOP_TO_BOTTOM", 2);
            TOP_TO_BOTTOM = direction3;
            Direction direction4 = new Direction("BOTTOM_TO_TOP", 3);
            BOTTOM_TO_TOP = direction4;
            Direction[] directionArr = {direction, direction2, direction3, direction4};
            $VALUES = directionArr;
            $ENTRIES = new asp(directionArr);
        }

        public Direction() {
            throw null;
        }

        public static zrp<Direction> h() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* compiled from: IdeasOnboardingShimmerView.kt */
    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Integer valueOf = Integer.valueOf(view.getWidth());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : view.getMeasuredWidth();
            Integer valueOf2 = Integer.valueOf(view.getHeight());
            Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
            int intValue2 = num != null ? num.intValue() : view.getMeasuredHeight();
            float f = IdeasOnboardingShimmerView.this.h;
            outline.setRoundRect(0, 0, intValue, intValue2 + ((int) f), f);
        }
    }

    /* compiled from: IdeasOnboardingShimmerView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.TOP_TO_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.BOTTOM_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.vk.story.viewer.impl.presentation.ideas.ui.IdeasOnboardingShimmerView$Direction] */
    public IdeasOnboardingShimmerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint(1);
        this.c = new Rect();
        this.d = new Matrix();
        this.f = new ilq();
        float f = 20.0f * getResources().getDisplayMetrics().density;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r3 = Direction.LEFT_TO_RIGHT;
        ref$ObjectRef.element = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        float f2 = swe0.f(obtainStyledAttributes.getFloat(3, 0.5f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float dimension = obtainStyledAttributes.getDimension(1, f);
        long j = obtainStyledAttributes.getInt(0, (int) 3000);
        j = j < 1 ? 1L : j;
        long j2 = obtainStyledAttributes.getInt(4, (int) 1200);
        j2 = j2 < 0 ? 0L : j2;
        int i = obtainStyledAttributes.getInt(2, 0);
        zrp<Direction> h = Direction.h();
        T t = r3;
        if (i >= 0) {
            t = r3;
            if (i < h.size()) {
                t = h.get(i);
            }
        }
        ref$ObjectRef.element = t;
        obtainStyledAttributes.recycle();
        this.g = f2;
        this.h = dimension;
        this.i = j;
        this.j = j2;
        this.k = (Direction) ref$ObjectRef.element;
        setOutlineProvider(new a());
        setClipToOutline(true);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.e = null;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        float b2;
        float f;
        Paint paint = this.b;
        Shader shader = paint.getShader();
        if (shader == null || (valueAnimator = this.e) == null) {
            return;
        }
        long j = this.j;
        long j2 = this.i;
        long j3 = j + j2;
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        if (j3 < 1) {
            j3 = 1;
        }
        long j4 = currentPlayTime % j3;
        float interpolation = j4 < j2 ? this.f.getInterpolation(j4 / j2) : 1.0f;
        Rect rect = this.c;
        float width = rect.width();
        float height = rect.height();
        int i = b.$EnumSwitchMapping$0[this.k.ordinal()];
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i == 1) {
            float f3 = -width;
            b2 = u11.b(width, f3, interpolation, f3);
        } else {
            if (i != 2) {
                if (i == 3) {
                    float f4 = -height;
                    f = u11.b(height, f4, interpolation, f4);
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = u11.b(-height, height, interpolation, height);
                }
                Matrix matrix = this.d;
                matrix.reset();
                matrix.setTranslate(f2, f);
                shader.setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
            b2 = u11.b(-width, width, interpolation, width);
        }
        f2 = b2;
        f = 0.0f;
        Matrix matrix2 = this.d;
        matrix2.reset();
        matrix2.setTranslate(f2, f);
        shader.setLocalMatrix(matrix2);
        canvas.drawRect(rect, paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c.set(0, 0, i, i2);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int l2 = n8g.l(-1, (int) (this.g * 255.0f));
        Direction direction = Direction.TOP_TO_BOTTOM;
        Direction direction2 = this.k;
        boolean z = direction2 == direction || direction2 == Direction.BOTTOM_TO_TOP;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = z ? 0.0f : i;
        if (z) {
            f = i2;
        }
        this.b.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f, new int[]{0, 0, l2, 0, 0}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.25f, 0.5f, 0.75f, 1.0f}, Shader.TileMode.CLAMP));
        invalidate();
    }
}
