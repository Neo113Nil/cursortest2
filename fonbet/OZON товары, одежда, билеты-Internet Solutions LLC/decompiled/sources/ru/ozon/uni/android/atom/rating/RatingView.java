package ru.ozon.uni.android.atom.rating;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002cdB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00172\b\b\u0001\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%R*\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010.\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\u0002042\u0006\u0010'\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR*\u0010Q\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b8\u0000@@X\u0081\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010S\"\u0004\bT\u0010 R\u0016\u0010U\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010PR*\u0010V\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b8\u0000@@X\u0081\u000e¢\u0006\u0012\n\u0004\bV\u0010L\u001a\u0004\bW\u0010S\"\u0004\bX\u0010 R\u0016\u0010\\\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010^\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u0014\u0010`\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010SR\u0014\u0010b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010S¨\u0006e"}, d2 = {"Lru/ozon/uni/android/atom/rating/RatingView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "starIndex", "Lru/ozon/uni/android/atom/rating/RatingView$FillType;", "getFillingForStar", "(I)Lru/ozon/uni/android/atom/rating/RatingView$FillType;", "", "x", "getRatingFromTouchPosition", "(F)F", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "style", "applyStyle", "(I)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "totalRating", "F", "getTotalRating", "()F", "setTotalRating", "(F)V", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;", "ratingSize", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;", "getRatingSize", "()Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;", "setRatingSize", "(Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;)V", "separateClickable", "Z", "getSeparateClickable", "()Z", "setSeparateClickable", "(Z)V", "Lkotlin/Function1;", "ratingClickCallback", "Lkotlin/jvm/functions/Function1;", "getRatingClickCallback", "()Lkotlin/jvm/functions/Function1;", "setRatingClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Rect;", "iconBounds", "Landroid/graphics/Rect;", "defIconColor", "I", "defIconBackColor", "Landroid/graphics/ColorFilter;", "iconColorFilter", "Landroid/graphics/ColorFilter;", "iconColor", "getIconColor$uni_release", "()I", "setIconColor$uni_release", "backColorFilter", "iconBackgroundColor", "getIconBackgroundColor$uni_release", "setIconBackgroundColor$uni_release", "Landroid/graphics/drawable/Drawable;", "getRatingIcon", "()Landroid/graphics/drawable/Drawable;", "ratingIcon", "getHalfRatingIcon", "halfRatingIcon", "getStarGap", "starGap", "getRatingWidth", "ratingWidth", "Companion", "FillType", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatingView extends View implements AtomView, AtomLocatableView {

    @NotNull
    private ColorFilter backColorFilter;
    private final int defIconBackColor;
    private final int defIconColor;
    private int iconBackgroundColor;

    @NotNull
    private Rect iconBounds;
    private int iconColor;

    @NotNull
    private ColorFilter iconColorFilter;

    @NotNull
    private String locatorTag;
    private Function1<? super Integer, Unit> ratingClickCallback;

    @NotNull
    private RatingDTO.RatingSize ratingSize;
    private boolean separateClickable;
    private float totalRating;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/atom/rating/RatingView$FillType;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "HALF", "EMPTY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class FillType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FillType[] $VALUES;
        public static final FillType FULL = new FillType("FULL", 0);
        public static final FillType HALF = new FillType("HALF", 1);
        public static final FillType EMPTY = new FillType("EMPTY", 2);

        private static final /* synthetic */ FillType[] $values() {
            return new FillType[]{FULL, HALF, EMPTY};
        }

        static {
            FillType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FillType(String str, int i11) {
        }

        public static FillType valueOf(String str) {
            return (FillType) Enum.valueOf(FillType.class, str);
        }

        public static FillType[] values() {
            return (FillType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RatingDTO.RatingSize.values().length];
            try {
                iArr[RatingDTO.RatingSize.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final FillType getFillingForStar(int starIndex) {
        float f7 = this.totalRating;
        float f11 = f7 % 1;
        float f12 = starIndex;
        if (f12 <= f7 && (starIndex + 1 <= f7 || f11 >= 0.75d)) {
            return FillType.FULL;
        }
        if (f7 > f12 && f7 < starIndex + 1) {
            double d11 = f11;
            if (d11 >= 0.25d && d11 < 0.75d) {
                return FillType.HALF;
            }
        }
        return FillType.EMPTY;
    }

    private final Drawable getHalfRatingIcon() {
        return androidx.core.content.a.getDrawable(getContext(), WhenMappings.$EnumSwitchMapping$0[this.ratingSize.ordinal()] == 1 ? R$drawable.ic_s_star_half_filled : R$drawable.ic_m_star_half_filled);
    }

    private final float getRatingFromTouchPosition(float x11) {
        if (getWidth() == 0) {
            return 0.0f;
        }
        if (x11 < 0.0f) {
            return 1.0f;
        }
        return (float) Math.ceil((5.0f / getWidth()) * x11);
    }

    private final Drawable getRatingIcon() {
        return androidx.core.content.a.getDrawable(getContext(), WhenMappings.$EnumSwitchMapping$0[this.ratingSize.ordinal()] == 1 ? R$drawable.ic_s_star_filled : R$drawable.ic_m_star_filled);
    }

    private final int getRatingWidth() {
        return (getStarGap() * 4) + (this.ratingSize.getSize() * 5);
    }

    private final int getStarGap() {
        return this.ratingSize.getGap() + (this.separateClickable ? this.ratingSize.getGapClickable() : 0);
    }

    public final void applyStyle(int style) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(style, R$styleable.RatingView);
        setIconColor$uni_release(obtainStyledAttributes.getColor(R$styleable.RatingView_starColor, this.defIconColor));
        setIconBackgroundColor$uni_release(obtainStyledAttributes.getColor(R$styleable.RatingView_starBackgroundColor, this.defIconBackColor));
        obtainStyledAttributes.recycle();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Drawable halfRatingIcon;
        Drawable mutate;
        Drawable mutate2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        for (int i11 = 0; i11 < 5; i11++) {
            FillType fillingForStar = getFillingForStar(i11);
            Drawable ratingIcon = getRatingIcon();
            if (ratingIcon != null && (mutate2 = ratingIcon.mutate()) != null) {
                mutate2.setColorFilter(fillingForStar == FillType.FULL ? this.iconColorFilter : this.backColorFilter);
                mutate2.setBounds(this.iconBounds);
                mutate2.draw(canvas);
            }
            if (fillingForStar == FillType.HALF && (halfRatingIcon = getHalfRatingIcon()) != null && (mutate = halfRatingIcon.mutate()) != null) {
                mutate.setColorFilter(this.iconColorFilter);
                mutate.setBounds(this.iconBounds);
                mutate.draw(canvas);
            }
            canvas.translate(UiExtKt.toPxF(this.ratingSize.getSize() + getStarGap()), 0.0f);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            size = UiExtKt.toPx(getRatingWidth());
        }
        setMeasuredDimension(size, UiExtKt.toPx(this.ratingSize.getSize()));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.separateClickable && event != null && event.getAction() == 1) {
            setTotalRating(getRatingFromTouchPosition(event.getX()));
            Function1<? super Integer, Unit> function1 = this.ratingClickCallback;
            if (function1 != null) {
                function1.invoke(Integer.valueOf((int) this.totalRating));
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setIconBackgroundColor$uni_release(int i11) {
        this.iconBackgroundColor = i11;
        this.backColorFilter = new PorterDuffColorFilter(this.iconBackgroundColor, PorterDuff.Mode.SRC_IN);
    }

    public final void setIconColor$uni_release(int i11) {
        this.iconColor = i11;
        this.iconColorFilter = new PorterDuffColorFilter(this.iconColor, PorterDuff.Mode.SRC_IN);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setRatingClickCallback(Function1<? super Integer, Unit> function1) {
        this.ratingClickCallback = function1;
    }

    public final void setRatingSize(@NotNull RatingDTO.RatingSize value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.ratingSize = value;
        int px = UiExtKt.toPx(value.getSize());
        this.iconBounds = new Rect(0, 0, px, px);
        requestLayout();
    }

    public final void setSeparateClickable(boolean z11) {
        this.separateClickable = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 > 5.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTotalRating(float f7) {
        float f11 = f7 >= 0.0f ? 5.0f : 0.0f;
        f7 = f11;
        this.totalRating = f7;
        invalidate();
    }

    public /* synthetic */ RatingView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Rating_Default : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "rating";
        RatingDTO.RatingSize ratingSize = RatingDTO.RatingSize.SIZE_500;
        this.ratingSize = ratingSize;
        this.separateClickable = true;
        this.iconBounds = new Rect();
        int color = androidx.core.content.a.getColor(context, R$color.graphic_rating);
        this.defIconColor = color;
        int color2 = androidx.core.content.a.getColor(context, R$color.layer_active_surface);
        this.defIconBackColor = color2;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.iconColorFilter = new PorterDuffColorFilter(color, mode);
        this.iconColor = color;
        this.backColorFilter = new PorterDuffColorFilter(color2, mode);
        this.iconBackgroundColor = color2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatingView, i11, i12);
        setRatingSize(((RatingDTO.RatingSize[]) RatingDTO.RatingSize.getEntries().toArray(new RatingDTO.RatingSize[0]))[obtainStyledAttributes.getInt(R$styleable.RatingView_ratingSize, ratingSize.ordinal())]);
        setIconColor$uni_release(obtainStyledAttributes.getColor(R$styleable.RatingView_starColor, color));
        setIconBackgroundColor$uni_release(obtainStyledAttributes.getColor(R$styleable.RatingView_starBackgroundColor, color2));
        obtainStyledAttributes.recycle();
        setContentDescription(getLocatorTag());
    }
}
