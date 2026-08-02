package ru.ozon.uni.android.atom.indicator.ui;

import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.DrawableExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.android.uikitsdk.resources.TokenizedResource;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 t2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001tB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\u000f*\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020\u000f*\u00020)H\u0002¢\u0006\u0004\b*\u0010+R*\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00168\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u00107\"\u0004\b8\u0010\u0019R$\u00109\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b9\u0010:\"\u0004\b;\u0010\u001dR.\u0010<\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010B\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u00105\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u00020G2\u0006\u0010-\u001a\u00020G8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010L\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bL\u00105\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR.\u0010P\u001a\u0004\u0018\u00010O2\b\u0010-\u001a\u0004\u0018\u00010O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR*\u0010[\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b[\u00105\u001a\u0004\b\\\u0010D\"\u0004\b]\u0010FR\u0014\u0010^\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R(\u0010`\u001a\u0004\u0018\u00010\u001e2\b\u0010-\u001a\u0004\u0018\u00010\u001e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b`\u0010a\"\u0004\bb\u0010!R\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010DR\u0014\u0010o\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010DR\u0014\u0010q\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010DR\u0014\u0010s\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010D¨\u0006u"}, d2 = {"Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "indicatorSize", "setSize", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;)V", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorContent;", "indicatorContent", "setContent", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorContent;)V", "", "charSequence", "setText", "(Ljava/lang/CharSequence;)V", "text", "drawText", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;)V", "Landroid/graphics/Bitmap;", "icon", "drawIcon", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V", "Landroid/text/TextPaint;", "applyTextStyle", "(Landroid/text/TextPaint;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "transparentColor", "I", "defContentColor", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "setIndicatorSize", "contentType", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$IndicatorContent;", "setContentType", "backColor", "Ljava/lang/Integer;", "getBackColor", "()Ljava/lang/Integer;", "setBackColor", "(Ljava/lang/Integer;)V", "borderColor", "getBorderColor", "()I", "setBorderColor", "(I)V", "", "hasBorder", "Z", "setHasBorder", "(Z)V", "iconColor", "getIconColor", "setIconColor", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "iconDrawable", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getIconDrawable", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setIconDrawable", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "iconBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/ColorFilter;", "iconColorFilter", "Landroid/graphics/ColorFilter;", "textColor", "getTextColor", "setTextColor", "textPaint", "Landroid/text/TextPaint;", "indicatorText", "Ljava/lang/CharSequence;", "setIndicatorText", "Landroid/graphics/Rect;", "textBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getMinSizePx", "minSizePx", "getBorderWidthPx", "borderWidthPx", "getHorizontalPaddingPx", "horizontalPaddingPx", "getTextWidth", "textWidth", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IndicatorView extends View implements AtomView, AtomLocatableView {
    private Integer backColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private int borderColor;

    @NotNull
    private IndicatorDTO.IndicatorContent contentType;
    private final int defContentColor;
    private boolean hasBorder;
    private Bitmap iconBitmap;
    private int iconColor;
    private ColorFilter iconColorFilter;
    private DrawableResource iconDrawable;

    @NotNull
    private IndicatorDTO.IndicatorSize indicatorSize;
    private CharSequence indicatorText;

    @NotNull
    private String locatorTag;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Rect textBounds;
    private int textColor;

    @NotNull
    private final TextPaint textPaint;
    private final int transparentColor;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IndicatorDTO.IndicatorSize.values().length];
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_450.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_800.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IndicatorDTO.IndicatorContent.values().length];
            try {
                iArr2[IndicatorDTO.IndicatorContent.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IndicatorDTO.IndicatorContent.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[IndicatorDTO.IndicatorContent.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyTextStyle(TextPaint textPaint) {
        int i11;
        switch (WhenMappings.$EnumSwitchMapping$0[this.indicatorSize.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
                i11 = R$style.OzonTextAppearance_BodyNumeric_300xsmall;
                break;
            case 3:
                i11 = R$style.OzonTextAppearance_BodyNumeric_200xsmall;
                break;
            case 6:
            case 7:
                i11 = R$style.OzonTextAppearance_BodyNumeric_400small;
                break;
            default:
                throw new o();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextPaintExtKt.applyStyle(textPaint, context, i11);
    }

    private final void drawIcon(Canvas canvas, Bitmap bitmap) {
        float pxF = UiExtKt.toPxF(8);
        Paint paint = this.paint;
        DrawableResource drawableResource = this.iconDrawable;
        paint.setColorFilter((drawableResource == null || drawableResource.getIsMulticolor()) ? null : this.iconColorFilter);
        canvas.drawBitmap(bitmap, (canvas.getWidth() / 2) - pxF, (canvas.getHeight() / 2) - pxF, this.paint);
    }

    private final void drawText(Canvas canvas, CharSequence charSequence) {
        canvas.drawText(charSequence, 0, charSequence.length(), (canvas.getWidth() / 2) - (getTextWidth() / 2.0f), (canvas.getHeight() / 2) - this.textBounds.exactCenterY(), this.textPaint);
    }

    private final int getBorderWidthPx() {
        int i11;
        if (this.hasBorder) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.indicatorSize.ordinal()];
            i11 = 1;
            if (i12 != 1 && i12 != 2) {
                i11 = 2;
            }
        } else {
            i11 = 0;
        }
        return UiExtKt.toPx(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r0 != 7) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getHorizontalPaddingPx() {
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.contentType.ordinal()];
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            int i13 = 3;
            if (i11 != 3) {
                throw new o();
            }
            int i14 = WhenMappings.$EnumSwitchMapping$0[this.indicatorSize.ordinal()];
            if (i14 != 3) {
                i13 = 4;
                if (i14 != 4) {
                    if (i14 != 5) {
                        if (i14 != 6) {
                        }
                    }
                }
            }
            i12 = i13;
        }
        return UiExtKt.toPx(i12);
    }

    private final int getMinSizePx() {
        return UiExtKt.toPx(this.indicatorSize.getSize()) + getBorderWidthPx();
    }

    private final int getTextWidth() {
        CharSequence charSequence = this.indicatorText;
        if (charSequence != null) {
            return (int) this.textPaint.measureText(charSequence.toString());
        }
        return 0;
    }

    private final void setContentType(IndicatorDTO.IndicatorContent indicatorContent) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.indicatorSize.ordinal()];
        if (i11 == 1 || i11 == 2) {
            indicatorContent = IndicatorDTO.IndicatorContent.NONE;
        } else if (i11 == 3 && indicatorContent == IndicatorDTO.IndicatorContent.ICON) {
            indicatorContent = IndicatorDTO.IndicatorContent.NONE;
        }
        this.contentType = indicatorContent;
    }

    private final void setHasBorder(boolean z11) {
        if (this.hasBorder != z11) {
            this.hasBorder = z11;
            this.backgroundDrawable.setStroke(getBorderWidthPx(), this.borderColor);
        }
    }

    private final void setIndicatorSize(IndicatorDTO.IndicatorSize indicatorSize) {
        this.indicatorSize = indicatorSize;
        applyTextStyle(this.textPaint);
        this.backgroundDrawable.setCornerRadius(UiExtKt.toPxF(this.indicatorSize.getCornerRadius()));
        requestLayout();
    }

    private final void setIndicatorText(CharSequence charSequence) {
        this.indicatorText = charSequence;
        if (charSequence != null) {
            this.textPaint.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.textBounds);
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.contentType.ordinal()];
        if (i11 == 1) {
            Bitmap bitmap = this.iconBitmap;
            if (bitmap != null) {
                drawIcon(canvas, bitmap);
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new o();
            }
            CharSequence charSequence = this.indicatorText;
            if (charSequence != null) {
                drawText(canvas, charSequence);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int horizontalPaddingPx = (getHorizontalPaddingPx() * 2) + getTextWidth();
        int minSizePx = getMinSizePx();
        if (horizontalPaddingPx < minSizePx) {
            horizontalPaddingPx = minSizePx;
        }
        setMeasuredDimension(horizontalPaddingPx, getMinSizePx());
    }

    public final void setBackColor(Integer num) {
        if (Intrinsics.d(this.backColor, num)) {
            return;
        }
        this.backColor = num;
        this.backgroundDrawable.setColor(num != null ? num.intValue() : this.transparentColor);
    }

    public final void setBorderColor(int i11) {
        if (this.borderColor != i11) {
            this.borderColor = i11;
            this.backgroundDrawable.setStroke(getBorderWidthPx(), this.borderColor);
        }
    }

    public final void setContent(IndicatorDTO.IndicatorContent indicatorContent) {
        if (indicatorContent == null) {
            indicatorContent = this.indicatorText != null ? IndicatorDTO.IndicatorContent.TEXT : this.iconBitmap != null ? IndicatorDTO.IndicatorContent.ICON : IndicatorDTO.IndicatorContent.NONE;
        }
        setContentType(indicatorContent);
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.contentType.ordinal()];
        if (i11 == 1) {
            setIndicatorText(null);
            return;
        }
        if (i11 == 2) {
            this.iconBitmap = null;
            setIndicatorText(null);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            this.iconBitmap = null;
        }
    }

    public final void setIconColor(int i11) {
        if (this.iconColor != i11) {
            this.iconColor = i11;
            this.iconColorFilter = new PorterDuffColorFilter(this.iconColor, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void setIconDrawable(DrawableResource drawableResource) {
        this.iconDrawable = drawableResource;
        Bitmap bitmap = null;
        if (drawableResource != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = (Drawable) TokenizedResource.DefaultImpls.getValue$default(drawableResource, context, null, 2, null);
            if (drawable != null) {
                bitmap = DrawableExtKt.toBitmap(drawable, UiExtKt.toPx(16));
            }
        }
        this.iconBitmap = bitmap;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setSize(@NotNull IndicatorDTO.IndicatorSize indicatorSize) {
        Intrinsics.checkNotNullParameter(indicatorSize, "indicatorSize");
        setIndicatorSize(indicatorSize);
    }

    public final void setText(CharSequence charSequence) {
        setIndicatorText(charSequence);
    }

    public final void setTextColor(int i11) {
        if (this.textColor != i11) {
            this.textColor = i11;
            this.textPaint.setColor(i11);
        }
    }

    public /* synthetic */ IndicatorView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? ru.ozon.uni.R$style.Indicator_Accent : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "indicator";
        int color = a.getColor(context, R.color.transparent);
        this.transparentColor = color;
        int color2 = a.getColor(context, R$color.text_primary);
        this.defContentColor = color2;
        this.indicatorSize = IndicatorDTO.IndicatorSize.SIZE_300;
        IndicatorDTO.IndicatorContent indicatorContent = IndicatorDTO.IndicatorContent.NONE;
        this.contentType = indicatorContent;
        this.backColor = Integer.valueOf(color);
        this.borderColor = color;
        this.iconColor = color;
        this.textColor = color;
        this.textPaint = new TextPaint(1);
        this.textBounds = new Rect();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IndicatorView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setIndicatorSize(((IndicatorDTO.IndicatorSize[]) IndicatorDTO.IndicatorSize.getEntries().toArray(new IndicatorDTO.IndicatorSize[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorView_indicatorsSize, IndicatorDTO.IndicatorSize.SIZE_600.ordinal())]);
        setContentType(((IndicatorDTO.IndicatorContent[]) IndicatorDTO.IndicatorContent.getEntries().toArray(new IndicatorDTO.IndicatorContent[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorView_contentType, indicatorContent.ordinal())]);
        setHasBorder(obtainStyledAttributes.getBoolean(R$styleable.IndicatorView_border, false));
        int color3 = obtainStyledAttributes.getColor(R$styleable.IndicatorView_android_background, 0);
        if (color3 != 0) {
            setBackColor(Integer.valueOf(color3));
        }
        setBorderColor(obtainStyledAttributes.getColor(R$styleable.IndicatorView_borderColor, color2));
        setIconColor(obtainStyledAttributes.getColor(R$styleable.IndicatorView_iconColor, color2));
        setTextColor(obtainStyledAttributes.getColor(R$styleable.IndicatorView_android_textColor, color2));
        setIndicatorText(obtainStyledAttributes.getText(R$styleable.IndicatorView_android_text));
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IndicatorView_android_src, 0);
        if (resourceId != 0) {
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setIconDrawable(companion.fromResources(resources, resourceId));
        }
        obtainStyledAttributes.recycle();
        setBackground(gradientDrawable);
        setContentDescription(getLocatorTag());
    }
}
