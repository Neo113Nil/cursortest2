package ru.ozon.app.android.marketing.widgets.couponList.presentation;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$styleable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", "rightMargin", "F", "getRightMargin", "()F", "setRightMargin", "(F)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "dotRadius", "bigDotRadius", "minimumDotGap", "bottomMargin", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponView$Orientation;", "orientation", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponView$Orientation;", "Orientation", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponView extends CardView {
    private float bigDotRadius;
    private float bottomMargin;
    private float dotRadius;
    private float minimumDotGap;

    @NotNull
    private Orientation orientation;

    @NotNull
    private final Paint paint;
    private float rightMargin;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponView$Orientation;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Orientation {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL", 0);
        public static final Orientation VERTICAL = new Orientation("VERTICAL", 1);

        private static final /* synthetic */ Orientation[] $values() {
            return new Orientation[]{HORIZONTAL, VERTICAL};
        }

        static {
            Orientation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Orientation(String str, int i11) {
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CouponView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        float f7 = 2;
        float f11 = this.dotRadius;
        float f12 = f7 * f11;
        float f13 = this.minimumDotGap;
        if (this.orientation == Orientation.HORIZONTAL) {
            float f14 = this.bigDotRadius + f13;
            float width = getWidth() - (f7 * f14);
            int floor = (int) Math.floor((width - f12) / (f13 + f12));
            float f15 = (width - ((floor + 1) * f12)) / floor;
            if (this.bigDotRadius > 0.0f) {
                canvas.drawCircle(0.0f, getHeight() - this.bottomMargin, this.bigDotRadius, this.paint);
                canvas.drawCircle(getWidth(), getHeight() - this.bottomMargin, this.bigDotRadius, this.paint);
            }
            if (this.dotRadius <= 0.0f || floor < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                canvas.drawCircle(((f12 + f15) * i11) + this.dotRadius + f14, getHeight() - this.bottomMargin, this.dotRadius, this.paint);
                if (i11 == floor) {
                    return;
                } else {
                    i11++;
                }
            }
        } else {
            if (this.bigDotRadius == 0.0f) {
                this.bigDotRadius = f11;
            }
            float height = getHeight() - this.bigDotRadius;
            int floor2 = (int) Math.floor((height - f12) / (f13 + f12));
            float f16 = (height - ((floor2 + 1) * f12)) / floor2;
            if (this.dotRadius <= 0.0f) {
                return;
            }
            canvas.drawCircle(getWidth() - this.rightMargin, 0.0f, this.bigDotRadius, this.paint);
            canvas.drawCircle(getWidth() - this.rightMargin, height, this.bigDotRadius, this.paint);
            int i12 = 1;
            if (1 > floor2) {
                return;
            }
            while (true) {
                canvas.drawCircle(getWidth() - this.rightMargin, (f12 + f16) * i12, this.dotRadius, this.paint);
                if (i12 == floor2) {
                    return;
                } else {
                    i12++;
                }
            }
        }
    }

    public /* synthetic */ CouponView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int ordinal;
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.paint = paint;
        Orientation orientation = Orientation.HORIZONTAL;
        this.orientation = orientation;
        setLayerType(1, null);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        int argb = Color.argb(255, 0, 0, 0);
        float applyDimension2 = TypedValue.applyDimension(1, 62.0f, displayMetrics);
        float applyDimension3 = TypedValue.applyDimension(1, 100.0f, displayMetrics);
        if (attributeSet != null) {
            Resources.Theme theme = context.getTheme();
            TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, R$styleable.CouponView, i11, 0) : null;
            this.dotRadius = obtainStyledAttributes != null ? obtainStyledAttributes.getDimension(R$styleable.CouponView_dotRadius, applyDimension) : applyDimension;
            this.bigDotRadius = obtainStyledAttributes != null ? obtainStyledAttributes.getDimension(R$styleable.CouponView_bigDotRadius, applyDimension) : applyDimension;
            this.minimumDotGap = obtainStyledAttributes != null ? obtainStyledAttributes.getDimension(R$styleable.CouponView_minimumDotGap, applyDimension) : applyDimension;
            this.bottomMargin = obtainStyledAttributes != null ? obtainStyledAttributes.getDimension(R$styleable.CouponView_dotMarginBottom, applyDimension2) : applyDimension2;
            this.rightMargin = obtainStyledAttributes != null ? obtainStyledAttributes.getDimension(R$styleable.CouponView_dotMarginRight, applyDimension3) : applyDimension3;
            if (obtainStyledAttributes != null) {
                ordinal = obtainStyledAttributes.getInt(R$styleable.CouponView_orientation, orientation.ordinal());
            } else {
                ordinal = orientation.ordinal();
            }
            Orientation orientation2 = Orientation.VERTICAL;
            if (ordinal == orientation2.ordinal()) {
                this.orientation = orientation2;
            } else {
                this.orientation = orientation;
            }
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.dotRadius = applyDimension;
            this.bigDotRadius = applyDimension;
            this.minimumDotGap = applyDimension;
            this.bottomMargin = applyDimension2;
            this.rightMargin = applyDimension3;
            paint.setColor(argb);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setFlags(1);
    }
}
