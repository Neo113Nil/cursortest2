package ru.ozon.uni.android.uikit.view.atoms.price;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 \u008d\u00012\u00020\u00012\u00020\u0002:\u0004\u008d\u0001\u008e\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010 \u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\r2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\r2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010-J\u001f\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b<\u0010\u0013J\u000f\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b?\u0010\u0013J\u0013\u0010@\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\rH\u0002¢\u0006\u0004\bC\u0010;J\u000f\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bD\u0010;J\u0015\u0010F\u001a\u0004\u0018\u00010E*\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010GR$\u0010J\u001a\u00020H2\u0006\u0010I\u001a\u00020H8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR(\u0010M\u001a\u0004\u0018\u00010\u00172\b\u0010I\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR(\u0010'\u001a\u0004\u0018\u00010&2\b\u0010I\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010Q\u001a\u0004\bR\u0010SR$\u0010(\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010T\u001a\u0004\bU\u0010>R$\u0010V\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bW\u0010>R(\u0010X\u001a\u0004\u0018\u00010\u001e2\b\u0010I\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R$\u0010\\\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010T\u001a\u0004\b]\u0010>R(\u0010^\u001a\u0004\u0018\u00010\u00072\b\u0010I\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0016\u0010e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010TR\u0016\u0010f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010TR\u0016\u0010g\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010TR\u0016\u0010h\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010TR\u0016\u0010i\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010TR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001b\u0010u\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u001b\u0010x\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010r\u001a\u0004\bw\u0010tR\u001b\u0010{\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010r\u001a\u0004\bz\u0010tR\u001b\u0010~\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010r\u001a\u0004\b}\u0010tR\u001d\u0010\u0081\u0001\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010r\u001a\u0005\b\u0080\u0001\u0010tR\u001e\u0010\u0084\u0001\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010r\u001a\u0005\b\u0083\u0001\u0010tR\u001e\u0010\u0087\u0001\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010r\u001a\u0005\b\u0086\u0001\u0010tR\u001e\u0010\u008a\u0001\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010r\u001a\u0005\b\u0089\u0001\u0010tR\u0016\u0010\u008c\u0001\u001a\u00020E8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010t¨\u0006\u008f\u0001"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "priceStyle", "originalPriceStyle", "applyStyles", "Landroid/text/SpannableString;", "price", "textColor", "setPrice", "(Landroid/text/SpannableString;I)V", "", "originalPrice", "", "originalPriceColor", "defaultColor", "setOriginalPrice", "(Ljava/lang/CharSequence;Ljava/lang/String;I)V", "color", "setOriginPriceLineColor", "(Ljava/lang/String;I)V", "Landroid/graphics/drawable/Drawable;", "icon", "iconSize", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;I)V", "margin", "setImageMargin", "(I)V", "tintColor", "setImageTint", "(Ljava/lang/Integer;)V", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView$PriceViewType;", "style", "applyStyle", "(Lru/ozon/uni/android/uikit/view/atoms/price/PriceView$PriceViewType;)V", "actualWidth", "calculatePricesSize", "preferredWidth", "getPriceWidth", "(II)I", "updateStaticLayouts", "()V", "drawPriceText", "getIconGap", "()I", "originalDrawPriceText", "drawIcon", "getMaxWidth", "(I)I", "updateTint", "reassignIconSize", "Landroid/text/TextPaint;", "toLocalStyle", "(I)Landroid/text/TextPaint;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isVertical", "Z", "()Z", "priceText", "Landroid/text/SpannableString;", "getPriceText", "()Landroid/text/SpannableString;", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "I", "getIconSize", "priceColor", "getPriceColor", "originalPriceText", "Ljava/lang/String;", "getOriginalPriceText", "()Ljava/lang/String;", "iconMargin", "getIconMargin", "iconTint", "Ljava/lang/Integer;", "getIconTint", "()Ljava/lang/Integer;", "priceTextPaint", "Landroid/text/TextPaint;", "originalPriceTextPaint", "primaryTextHeight", "priceWidth", "priceHeight", "originalPriceHeight", "originalPriceWidth", "Landroid/text/StaticLayout;", "originalPriceStaticLayout", "Landroid/text/StaticLayout;", "priceStaticLayout", "Landroid/graphics/Paint;", "strikePaint", "Landroid/graphics/Paint;", "captionBold$delegate", "LSc/j;", "getCaptionBold", "()Landroid/text/TextPaint;", "captionBold", "caption$delegate", "getCaption", "caption", "bodyMBold$delegate", "getBodyMBold", "bodyMBold", "bodyLBold$delegate", "getBodyLBold", "bodyLBold", "bodyHeadL$delegate", "getBodyHeadL", "bodyHeadL", "bodyHeadXL$delegate", "getBodyHeadXL", "bodyHeadXL", "bodyL$delegate", "getBodyL", "bodyL", "headM$delegate", "getHeadM", "headM", "getBaseTextPaint", "baseTextPaint", "Companion", "PriceViewType", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceView extends View implements AtomView {

    /* renamed from: bodyHeadL$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bodyHeadL;

    /* renamed from: bodyHeadXL$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bodyHeadXL;

    /* renamed from: bodyL$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bodyL;

    /* renamed from: bodyLBold$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bodyLBold;

    /* renamed from: bodyMBold$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bodyMBold;

    /* renamed from: caption$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j caption;

    /* renamed from: captionBold$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j captionBold;

    /* renamed from: headM$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j headM;
    private Drawable icon;
    private int iconMargin;
    private int iconSize;
    private Integer iconTint;
    private boolean isVertical;
    private int originalPriceHeight;
    private StaticLayout originalPriceStaticLayout;
    private String originalPriceText;

    @NotNull
    private TextPaint originalPriceTextPaint;
    private int originalPriceWidth;
    private int priceColor;
    private int priceHeight;
    private StaticLayout priceStaticLayout;
    private SpannableString priceText;

    @NotNull
    private TextPaint priceTextPaint;
    private int priceWidth;
    private int primaryTextHeight;

    @NotNull
    private final Paint strikePaint;
    public static final int $stable = 8;
    private static final int VERTICAL_MARGIN = ResourceExtKt.toPx(4);
    private static final int HORIZONTAL_MARGIN = ResourceExtKt.toPx(4);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/price/PriceView$PriceViewType;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "SMALL_MEDIUM", "MEDIUM", "MEDIUM_LARGE", "LARGE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PriceViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PriceViewType[] $VALUES;
        public static final PriceViewType SMALL = new PriceViewType("SMALL", 0);
        public static final PriceViewType SMALL_MEDIUM = new PriceViewType("SMALL_MEDIUM", 1);
        public static final PriceViewType MEDIUM = new PriceViewType("MEDIUM", 2);
        public static final PriceViewType MEDIUM_LARGE = new PriceViewType("MEDIUM_LARGE", 3);
        public static final PriceViewType LARGE = new PriceViewType("LARGE", 4);

        private static final /* synthetic */ PriceViewType[] $values() {
            return new PriceViewType[]{SMALL, SMALL_MEDIUM, MEDIUM, MEDIUM_LARGE, LARGE};
        }

        static {
            PriceViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PriceViewType(String str, int i11) {
        }

        public static PriceViewType valueOf(String str) {
            return (PriceViewType) Enum.valueOf(PriceViewType.class, str);
        }

        public static PriceViewType[] values() {
            return (PriceViewType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceViewType.values().length];
            try {
                iArr[PriceViewType.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceViewType.SMALL_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceViewType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceViewType.MEDIUM_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceViewType.LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void calculatePricesSize(int actualWidth) {
        this.priceWidth = this.priceText != null ? getPriceWidth((int) Math.ceil(Layout.getDesiredWidth(r0, this.priceTextPaint)), actualWidth) : 0;
        String str = this.originalPriceText;
        this.originalPriceWidth = str != null ? getPriceWidth((int) this.originalPriceTextPaint.measureText(str), actualWidth) : 0;
        SpannableString spannableString = this.priceText;
        this.priceHeight = spannableString != null ? StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.priceTextPaint, this.priceWidth).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build().getHeight() : 0;
        String str2 = this.originalPriceText;
        int height = str2 != null ? StaticLayout.Builder.obtain(str2, 0, str2.length(), this.originalPriceTextPaint, this.originalPriceWidth).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build().getHeight() : 0;
        this.originalPriceHeight = height;
        int i11 = this.priceHeight;
        if (i11 > 0) {
            height = i11;
        }
        this.primaryTextHeight = height;
    }

    private final void drawIcon(Canvas canvas) {
        canvas.save();
        if (this.iconSize > this.primaryTextHeight) {
            reassignIconSize();
        }
        canvas.translate(0.0f, Math.max(0.0f, (this.primaryTextHeight - this.iconSize) / 2.0f) + getPaddingTop());
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    private final void drawPriceText(Canvas canvas) {
        canvas.save();
        canvas.translate(getIconGap(), 0.0f);
        StaticLayout staticLayout = this.priceStaticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextPaint getBaseTextPaint() {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(androidx.core.content.a.getColor(getContext(), R$color.selector_oz_black_text));
        return textPaint;
    }

    private final TextPaint getBodyHeadL() {
        return (TextPaint) this.bodyHeadL.getValue();
    }

    private final TextPaint getBodyHeadXL() {
        return (TextPaint) this.bodyHeadXL.getValue();
    }

    private final TextPaint getBodyL() {
        return (TextPaint) this.bodyL.getValue();
    }

    private final TextPaint getBodyLBold() {
        return (TextPaint) this.bodyLBold.getValue();
    }

    private final TextPaint getBodyMBold() {
        return (TextPaint) this.bodyMBold.getValue();
    }

    private final TextPaint getCaption() {
        return (TextPaint) this.caption.getValue();
    }

    private final TextPaint getCaptionBold() {
        return (TextPaint) this.captionBold.getValue();
    }

    private final TextPaint getHeadM() {
        return (TextPaint) this.headM.getValue();
    }

    private final int getIconGap() {
        if (this.icon != null) {
            return this.iconSize + this.iconMargin;
        }
        return 0;
    }

    private final int getMaxWidth(int widthMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.getSize(widthMeasureSpec);
        }
        if (mode == 0 || mode != 1073741824) {
            return Integer.MAX_VALUE;
        }
        return View.MeasureSpec.getSize(widthMeasureSpec);
    }

    private final int getPriceWidth(int preferredWidth, int actualWidth) {
        return preferredWidth < actualWidth ? preferredWidth : actualWidth;
    }

    private final void originalDrawPriceText(Canvas canvas) {
        canvas.save();
        SpannableString spannableString = this.priceText;
        float max = this.isVertical ? ((Math.max(this.priceHeight, this.iconSize) + (spannableString != null ? VERTICAL_MARGIN : 0)) - getPaddingBottom()) - this.originalPriceTextPaint.getFontMetricsInt().bottom : ((getMeasuredHeight() - this.originalPriceHeight) - getPaddingBottom()) - (spannableString != null ? this.priceTextPaint.getFontMetricsInt().bottom - this.originalPriceTextPaint.getFontMetricsInt().bottom : 0);
        boolean z11 = this.isVertical;
        canvas.translate((z11 ? 0 : this.priceWidth + getIconGap()) + ((z11 || this.priceText == null) ? 0 : HORIZONTAL_MARGIN), max);
        float dp = (this.originalPriceHeight / 2.0f) - ResourceExtKt.toDp(2);
        float f7 = this.originalPriceHeight - dp;
        StaticLayout staticLayout = this.originalPriceStaticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.drawLine(0.0f, f7, this.originalPriceWidth, dp, this.strikePaint);
        canvas.restore();
    }

    private final void reassignIconSize() {
        int i11 = this.primaryTextHeight;
        this.iconSize = i11;
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.setBounds(0, 0, i11, i11);
        }
        requestLayout();
    }

    private final TextPaint toLocalStyle(int i11) {
        if (i11 == R$style.TextStyle_Body_L || i11 == R$style.TextStyle_Body) {
            return getBodyL();
        }
        if (i11 == R$style.TextStyle_Body_L_Bold) {
            return getBodyLBold();
        }
        if (i11 == R$style.TextStyle_Head_M) {
            return getHeadM();
        }
        if (i11 == R$style.TextStyle_Caption) {
            return getCaption();
        }
        return null;
    }

    private final void updateStaticLayouts() {
        SpannableString spannableString = this.priceText;
        this.priceStaticLayout = spannableString != null ? StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.priceTextPaint, this.priceWidth).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build() : null;
        String str = this.originalPriceText;
        this.originalPriceStaticLayout = str != null ? StaticLayout.Builder.obtain(str, 0, str.length(), this.originalPriceTextPaint, this.originalPriceWidth).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build() : null;
    }

    private final void updateTint() {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Integer num = this.iconTint;
            drawable.setTintList(num != null ? ColorStateList.valueOf(num.intValue()) : null);
        }
    }

    public final void applyStyle(@NotNull PriceViewType style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i11 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i11 == 1) {
            this.priceTextPaint = getCaptionBold();
            this.originalPriceTextPaint = getCaption();
            return;
        }
        if (i11 == 2) {
            this.priceTextPaint = getBodyMBold();
            this.originalPriceTextPaint = getCaption();
            return;
        }
        if (i11 == 3) {
            this.priceTextPaint = getBodyLBold();
            this.originalPriceTextPaint = getCaption();
        } else if (i11 == 4) {
            this.priceTextPaint = getBodyHeadL();
            this.originalPriceTextPaint = getBodyL();
        } else {
            if (i11 != 5) {
                throw new o();
            }
            this.priceTextPaint = getBodyHeadXL();
            this.originalPriceTextPaint = getBodyL();
        }
    }

    @InterfaceC3999a
    public final void applyStyles(int priceStyle, int originalPriceStyle) {
        TextPaint localStyle = toLocalStyle(priceStyle);
        if (localStyle == null) {
            localStyle = getBodyL();
        }
        this.priceTextPaint = localStyle;
        TextPaint localStyle2 = toLocalStyle(originalPriceStyle);
        if (localStyle2 == null) {
            localStyle2 = getCaption();
        }
        this.originalPriceTextPaint = localStyle2;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawIcon(canvas);
        drawPriceText(canvas);
        originalDrawPriceText(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int max;
        int maxWidth = getMaxWidth(widthMeasureSpec);
        calculatePricesSize(maxWidth);
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.priceWidth + this.originalPriceWidth + ((this.priceText == null || this.originalPriceText == null) ? 0 : HORIZONTAL_MARGIN) + getIconGap();
        if (paddingRight > maxWidth) {
            this.isVertical = true;
            int i11 = this.priceHeight;
            int i12 = this.originalPriceHeight;
            max = Math.max(i11 + i12, this.iconSize + i12);
        } else {
            this.isVertical = false;
            max = Math.max(this.priceHeight, Math.max(this.originalPriceHeight, this.iconSize));
        }
        setMeasuredDimension(Math.min(maxWidth, paddingRight), getPaddingTop() + getPaddingBottom() + max);
        updateStaticLayouts();
    }

    public final void setImageDrawable(Drawable icon, int iconSize) {
        if (icon != null) {
            icon.setBounds(0, 0, iconSize, iconSize);
        }
        this.icon = icon;
        if (icon == null) {
            this.iconSize = 0;
        } else {
            this.iconSize = iconSize;
        }
        updateTint();
        requestLayout();
    }

    public final void setImageMargin(int margin) {
        this.iconMargin = margin;
    }

    public final void setImageTint(Integer tintColor) {
        this.iconTint = tintColor;
        updateTint();
    }

    public final void setOriginPriceLineColor(String color, int defaultColor) {
        Paint paint = this.strikePaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(styleParser.parseColor(context, color, defaultColor));
    }

    public final void setOriginalPrice(CharSequence originalPrice, String originalPriceColor, int defaultColor) {
        this.originalPriceText = originalPrice != null ? originalPrice.toString() : null;
        TextPaint textPaint = this.originalPriceTextPaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textPaint.setColor(styleParser.parseColor(context, originalPriceColor, defaultColor));
    }

    public final void setPrice(@NotNull SpannableString price, int textColor) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.priceText = price;
        this.priceTextPaint.setColor(textColor);
    }

    public /* synthetic */ PriceView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.priceColor = -1;
        this.iconMargin = ResourceExtKt.toDp(4);
        this.priceTextPaint = getBaseTextPaint();
        this.originalPriceTextPaint = getBaseTextPaint();
        Paint paint = new Paint();
        paint.setStrokeWidth(ResourceExtKt.toPxF(1));
        paint.setAntiAlias(true);
        paint.setColor(-65536);
        this.strikePaint = paint;
        n nVar = n.NONE;
        this.captionBold = k.a(nVar, new PriceView$captionBold$2(this, context));
        this.caption = k.a(nVar, new PriceView$caption$2(this, context));
        this.bodyMBold = k.a(nVar, new PriceView$bodyMBold$2(this, context));
        this.bodyLBold = k.a(nVar, new PriceView$bodyLBold$2(this, context));
        this.bodyHeadL = k.a(nVar, new PriceView$bodyHeadL$2(this, context));
        this.bodyHeadXL = k.a(nVar, new PriceView$bodyHeadXL$2(this, context));
        this.bodyL = k.a(nVar, new PriceView$bodyL$2(this, context));
        this.headM = k.a(nVar, new PriceView$headM$2(this, context));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        applyStyle(PriceViewType.MEDIUM);
    }
}
