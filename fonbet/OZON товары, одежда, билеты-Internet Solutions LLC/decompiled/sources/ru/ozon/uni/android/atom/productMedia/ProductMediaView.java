package ru.ozon.uni.android.atom.productMedia;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002 \u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u000e2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u001cJ\u001b\u0010#\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010\u0014J#\u0010*\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u001cR\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R*\u0010;\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00102\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010F\u001a\u0002042\u0006\u0010:\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00106\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010L\u001a\u00020K2\u0006\u0010:\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR.\u0010S\u001a\u0004\u0018\u00010R2\b\u0010:\u001a\u0004\u0018\u00010R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010Z\u001a\u00020Y2\u0006\u0010:\u001a\u00020Y8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R.\u0010`\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010<\u001a\u0004\ba\u0010>\"\u0004\bb\u0010@R.\u0010c\u001a\u0004\u0018\u00010\b2\b\u0010:\u001a\u0004\u0018\u00010\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR.\u0010\"\u001a\u0004\u0018\u00010\b2\b\u0010:\u001a\u0004\u0018\u00010\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010d\u001a\u0004\bi\u0010f\"\u0004\bj\u0010hR*\u0010k\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u00102\u001a\u0004\bl\u0010C\"\u0004\bm\u0010ER.\u0010)\u001a\u0004\u0018\u00010(2\b\u0010:\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010/R*\u0010r\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u00102\u001a\u0004\bs\u0010C\"\u0004\bt\u0010ER*\u0010u\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u00102\u001a\u0004\bv\u0010C\"\u0004\bw\u0010ER*\u0010x\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bx\u00102\u001a\u0004\by\u0010C\"\u0004\bz\u0010ER*\u0010{\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b{\u00102\u001a\u0004\b|\u0010C\"\u0004\b}\u0010ER.\u0010~\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R0\u0010\u0084\u0001\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010\u007f\u001a\u0006\b\u0085\u0001\u0010\u0081\u0001\"\u0006\b\u0086\u0001\u0010\u0083\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u00102R\u0016\u0010\u008a\u0001\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u00102R\u0016\u0010\u008b\u0001\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u00102R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0095\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00102R%\u0010\u0015\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0002@BX\u0083\u000e¢\u0006\r\n\u0004\b\u0015\u00102\"\u0005\b\u0097\u0001\u0010ER\u001a\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R(\u0010\u009e\u0001\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00178\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0005\b\u009e\u0001\u0010\u007f\"\u0006\b\u009f\u0001\u0010\u0083\u0001¨\u0006¡\u0001"}, d2 = {"Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "borderColor", "borderWidth", "", "isDash", "setBorder", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "clearIcon", "()V", "clearLabel", "clearBorder", "drawBorder", "updateIconBitmap", "Landroid/graphics/Bitmap;", "icon", "drawIcon", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V", "drawLabel", "Landroid/text/StaticLayout;", "staticLayout", "", "label", "getSmallIconVerticalPaddings", "(Landroid/text/StaticLayout;Ljava/lang/CharSequence;)I", "getSmallLabelVerticalPaddings", "(Landroid/text/StaticLayout;Ljava/lang/Integer;)I", "createLabelStaticLayout", "(Ljava/lang/CharSequence;)V", "loadBackground", "defaultTextPaddingHorizontal", "I", "defaultBorderWidth", "", "defaultCornerRadius", "F", "dashGap", "adultContentVerticalPadding", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "fixedWidth", "getFixedWidth", "()I", "setFixedWidth", "(I)V", "cornerRadius", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "Lru/ozon/uni/android/atom/productMedia/Ratio;", "aspectRatio", "Lru/ozon/uni/android/atom/productMedia/Ratio;", "getAspectRatio", "()Lru/ozon/uni/android/atom/productMedia/Ratio;", "setAspectRatio", "(Lru/ozon/uni/android/atom/productMedia/Ratio;)V", "Lru/ozon/uni/android/uikitsdk/Color;", "backgroundColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackgroundColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "Landroid/widget/ImageView$ScaleType;", "fitType", "Landroid/widget/ImageView$ScaleType;", "getFitType", "()Landroid/widget/ImageView$ScaleType;", "setFitType", "(Landroid/widget/ImageView$ScaleType;)V", "image", "getImage", "setImage", "iconTint", "Ljava/lang/Integer;", "getIconTint", "()Ljava/lang/Integer;", "setIconTint", "(Ljava/lang/Integer;)V", "getIcon", "setIcon", "iconSize", "getIconSize", "setIconSize", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "maxLines", "getMaxLines", "setMaxLines", "textPaddingHorizontal", "getTextPaddingHorizontal", "setTextPaddingHorizontal", "textStyle", "getTextStyle", "setTextStyle", "textTintColor", "getTextTintColor", "setTextTintColor", "hasParanja", "Z", "getHasParanja", "()Z", "setHasParanja", "(Z)V", "hasOverlay", "getHasOverlay", "setHasOverlay", "labelStaticLayout", "Landroid/text/StaticLayout;", "paranjaColor", "overlayColor", "defaultBorderColor", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/Paint;", "iconPaint", "Landroid/graphics/Paint;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "iconBitmap", "Landroid/graphics/Bitmap;", "setBorderColor", "Landroid/graphics/ColorFilter;", "borderColorFilter", "Landroid/graphics/ColorFilter;", "Landroid/graphics/PathEffect;", "dashPathEffect", "Landroid/graphics/PathEffect;", "isBorderDash", "setBorderDash", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductMediaView extends AppCompatImageView implements AtomView, AtomLocatableView {
    private final int adultContentVerticalPadding;

    @NotNull
    private Ratio aspectRatio;
    private Color backgroundColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private int borderColor;

    @NotNull
    private ColorFilter borderColorFilter;
    private int borderWidth;
    private float cornerRadius;
    private final float dashGap;
    private PathEffect dashPathEffect;
    private final int defaultBorderColor;
    private final int defaultBorderWidth;
    private final float defaultCornerRadius;
    private final int defaultTextPaddingHorizontal;

    @NotNull
    private ImageView.ScaleType fitType;
    private int fixedWidth;
    private boolean hasOverlay;
    private boolean hasParanja;
    private Integer icon;
    private Bitmap iconBitmap;

    @NotNull
    private final Paint iconPaint;
    private int iconSize;
    private Integer iconTint;
    private String image;
    private boolean isBorderDash;
    private CharSequence label;
    private StaticLayout labelStaticLayout;

    @NotNull
    private String locatorTag;
    private int maxLines;
    private final int overlayColor;
    private final int paranjaColor;
    private int textPaddingHorizontal;

    @NotNull
    private final TextPaint textPaint;
    private int textStyle;
    private int textTintColor;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductMediaView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void createLabelStaticLayout(CharSequence label) {
        if (label == null) {
            return;
        }
        this.labelStaticLayout = StaticLayout.Builder.obtain(label, 0, label.length(), this.textPaint, this.fixedWidth - (this.textPaddingHorizontal * 2)).setMaxLines(this.maxLines).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setText(label).build();
    }

    private final void drawBorder(Canvas canvas) {
        float f7 = this.cornerRadius;
        Paint paint = this.iconPaint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.borderWidth * 2);
        paint.setColorFilter(this.borderColorFilter);
        paint.setPathEffect(this.dashPathEffect);
        canvas.drawRoundRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), f7, f7, this.iconPaint);
    }

    private final void drawIcon(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, (canvas.getWidth() - bitmap.getWidth()) / 2, ((canvas.getHeight() - bitmap.getHeight()) / 2) - getSmallIconVerticalPaddings(this.labelStaticLayout, this.label), this.iconPaint);
    }

    private final void drawLabel(Canvas canvas) {
        StaticLayout staticLayout = this.labelStaticLayout;
        if (staticLayout == null) {
            return;
        }
        int smallLabelVerticalPaddings = getSmallLabelVerticalPaddings(staticLayout, this.icon);
        canvas.save();
        canvas.translate(this.textPaddingHorizontal, ((getHeight() / 2) - (staticLayout.getHeight() / 2)) + smallLabelVerticalPaddings);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private final int getSmallIconVerticalPaddings(StaticLayout staticLayout, CharSequence label) {
        if (staticLayout == null || label == null) {
            return 0;
        }
        return (staticLayout.getHeight() / 2) + this.adultContentVerticalPadding;
    }

    private final int getSmallLabelVerticalPaddings(StaticLayout staticLayout, Integer icon) {
        int i11;
        int height;
        if (icon == null) {
            return 0;
        }
        if (staticLayout.getLineCount() == 2) {
            i11 = this.adultContentVerticalPadding;
            height = staticLayout.getHeight() / 4;
        } else {
            i11 = this.adultContentVerticalPadding;
            height = staticLayout.getHeight() / 2;
        }
        return height + i11;
    }

    private final void loadBackground() {
        String str = this.image;
        if (str != null) {
            ImageViewExtKt.load$default(this, str, K.f71697a, null, null, null, false, null, 124, null);
        } else {
            ImageViewExtKt.clearResource(this);
        }
    }

    private final void setBorderColor(int i11) {
        this.borderColor = i11;
        this.borderColorFilter = new PorterDuffColorFilter(this.borderColor, PorterDuff.Mode.SRC_IN);
    }

    private final void setBorderDash(boolean z11) {
        DashPathEffect dashPathEffect;
        this.isBorderDash = z11;
        if (z11) {
            float f7 = this.dashGap;
            dashPathEffect = new DashPathEffect(new float[]{f7, f7}, 0.0f);
        } else {
            dashPathEffect = null;
        }
        this.dashPathEffect = dashPathEffect;
    }

    private final void updateIconBitmap() {
        Drawable drawable;
        Integer num = this.icon;
        Bitmap bitmap = null;
        if (num != null && (drawable = a.getDrawable(getContext(), num.intValue())) != null) {
            int i11 = this.iconSize;
            bitmap = b.a(drawable, i11, i11, Bitmap.Config.ARGB_8888);
        }
        this.iconBitmap = bitmap;
        invalidate();
    }

    public final void clearBorder() {
        this.borderWidth = 0;
        invalidate();
    }

    public final void clearIcon() {
        if (this.iconBitmap == null && this.icon == null) {
            return;
        }
        this.iconBitmap = null;
        setIcon(null);
        invalidate();
    }

    public final void clearLabel() {
        if (this.label == null) {
            return;
        }
        setLabel(null);
        invalidate();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.hasParanja) {
            canvas.drawColor(this.paranjaColor);
        }
        if (this.hasOverlay) {
            canvas.drawColor(this.overlayColor);
        }
        if (this.label != null) {
            drawLabel(canvas);
        }
        Bitmap bitmap = this.iconBitmap;
        if (bitmap != null) {
            drawIcon(canvas, bitmap);
        }
        if (this.borderWidth != 0) {
            drawBorder(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(this.fixedWidth, C6915b.c(this.fixedWidth * (this.aspectRatio.getHeightRatio() / this.aspectRatio.getWidthRatio())));
    }

    public final void setAspectRatio(@NotNull Ratio value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.aspectRatio = value;
        requestLayout();
    }

    public final void setBackgroundColor(Color color) {
        this.backgroundColor = color;
        if (color == null) {
            this.backgroundDrawable.setColor((ColorStateList) null);
        } else {
            color.applyTo(this.backgroundDrawable);
        }
    }

    public final void setBorder(Integer borderColor, Integer borderWidth, boolean isDash) {
        this.borderWidth = borderWidth != null ? borderWidth.intValue() : this.defaultBorderWidth;
        setBorderColor(borderColor != null ? borderColor.intValue() : this.defaultBorderColor);
        setBorderDash(isDash);
        invalidate();
    }

    public final void setCornerRadius(float f7) {
        this.cornerRadius = f7;
        this.backgroundDrawable.setCornerRadius(f7);
    }

    public final void setFitType(@NotNull ImageView.ScaleType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.fitType = value;
        setScaleType(value);
        invalidate();
    }

    public final void setFixedWidth(int i11) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.fixedWidth = UiExtKt.toPx(i11, context);
        requestLayout();
    }

    public final void setHasOverlay(boolean z11) {
        this.hasOverlay = z11;
        invalidate();
    }

    public final void setHasParanja(boolean z11) {
        this.hasParanja = z11;
        invalidate();
    }

    public final void setIcon(Integer num) {
        if (Intrinsics.d(this.icon, num)) {
            return;
        }
        this.icon = num;
        if (num == null) {
            clearIcon();
        } else {
            updateIconBitmap();
        }
    }

    public final void setIconSize(int i11) {
        this.iconSize = i11;
        updateIconBitmap();
    }

    public final void setIconTint(Integer num) {
        this.iconTint = num;
        if (num == null) {
            clearColorFilter();
        } else {
            this.iconPaint.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
    }

    public final void setImage(String str) {
        this.image = str;
        loadBackground();
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
        createLabelStaticLayout(charSequence);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setMaxLines(int i11) {
        this.maxLines = i11;
        invalidate();
    }

    public final void setTextPaddingHorizontal(int i11) {
        this.textPaddingHorizontal = i11;
        invalidate();
    }

    public final void setTextStyle(int i11) {
        this.textStyle = i11;
        TextPaint textPaint = this.textPaint;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextPaintExtKt.applyStyle(textPaint, context, i11);
    }

    public final void setTextTintColor(int i11) {
        this.textTintColor = i11;
        this.textPaint.setColor(i11);
    }

    public /* synthetic */ ProductMediaView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMediaView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.defaultTextPaddingHorizontal = px;
        int px2 = UiExtKt.toPx(2, context);
        this.defaultBorderWidth = px2;
        float pxF = ResourceExtKt.toPxF(8, context);
        this.defaultCornerRadius = pxF;
        this.dashGap = ResourceExtKt.toPxF(4, context);
        this.adultContentVerticalPadding = UiExtKt.toPx(2, context);
        this.locatorTag = "productMedia";
        this.cornerRadius = pxF;
        this.aspectRatio = Ratio.RATIO_1_1;
        this.fitType = ImageView.ScaleType.FIT_CENTER;
        this.maxLines = 1;
        this.textPaddingHorizontal = px;
        this.textStyle = UniTextStyles.BODY_CONTROL_500_MEDIUM.getResId();
        this.textTintColor = a.getColor(context, R$color.text_primary);
        this.paranjaColor = a.getColor(context, ru.ozon.uni.core.R$color.layer_overlay_paranja);
        this.overlayColor = a.getColor(context, ru.ozon.uni.core.R$color.graphic_tertiary_on_light);
        int color = a.getColor(context, ru.ozon.uni.core.R$color.bg_secondary);
        this.defaultBorderColor = color;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.iconPaint = paint;
        TextPaint textPaint = new TextPaint(1);
        TextPaintExtKt.applyStyle(textPaint, context, this.textStyle);
        textPaint.setColor(this.textTintColor);
        this.textPaint = textPaint;
        this.borderWidth = px2;
        this.borderColor = color;
        this.borderColorFilter = new PorterDuffColorFilter(this.borderColor, PorterDuff.Mode.SRC_IN);
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setContentDescription(getLocatorTag());
    }
}
