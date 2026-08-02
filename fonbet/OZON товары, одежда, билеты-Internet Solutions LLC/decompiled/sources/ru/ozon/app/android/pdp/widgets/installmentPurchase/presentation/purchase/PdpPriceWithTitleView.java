package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase;

import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.utils.TextPaintStyleParser;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 l2\u00020\u0001:\u0001lB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u000108H\u0017J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0014J\u0010\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0014J6\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u0002032\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020:0C2\b\u0010\u0010\u001a\u0004\u0018\u00010E2\b\u0010\u0012\u001a\u0004\u0018\u000105J\f\u0010F\u001a\u00020:*\u00020?H\u0002J\f\u0010G\u001a\u00020:*\u00020?H\u0002J\u001a\u0010H\u001a\u00020:2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002JX\u0010L\u001a\u00020:2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010P\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010N2\b\u0010R\u001a\u0004\u0018\u00010N2\b\u0010S\u001a\u0004\u0018\u00010N2\b\u0010T\u001a\u0004\u0018\u00010N2\b\u0010U\u001a\u0004\u0018\u00010NH\u0002J$\u0010V\u001a\u00020:2\u0006\u0010A\u001a\u0002032\b\u00102\u001a\u0004\u0018\u0001032\b\u0010\u0012\u001a\u0004\u0018\u000105H\u0002J\u001c\u0010W\u001a\u00020:2\b\u0010X\u001a\u0004\u0018\u00010\u00142\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u000e\u0010Y\u001a\u0004\u0018\u00010&*\u00020ZH\u0002J$\u0010[\u001a\u00020:2\u0006\u0010A\u001a\u0002032\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020:0CH\u0002J\u001c\u0010\\\u001a\u00020:2\b\u0010\u0010\u001a\u0004\u0018\u00010E2\b\u0010\u0012\u001a\u0004\u0018\u000105H\u0002J#\u0010]\u001a\u00020:2\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\t2\b\u0010_\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0002\u0010`J\u0012\u0010a\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u000108H\u0002J\b\u0010b\u001a\u00020:H\u0002J\b\u0010c\u001a\u00020:H\u0002J\b\u0010d\u001a\u00020:H\u0002J\u001e\u0010e\u001a\u00020\u0014*\u00020f2\u0006\u0010g\u001a\u00020,2\b\b\u0001\u0010h\u001a\u00020\tH\u0002J\u000e\u0010i\u001a\u00020\t*\u0004\u0018\u00010jH\u0002J\u000e\u0010k\u001a\u00020\t*\u0004\u0018\u00010jH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/PdpPriceWithTitleView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "isSelect", "", "<init>", "(Landroid/content/Context;Z)V", "badgeElementsWidth", "", "getBadgeElementsWidth", "()I", "price", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "chevronIcon", "Landroid/graphics/drawable/Drawable;", "badgeIcon", "priceLayout", "Landroid/text/StaticLayout;", "titleLayout", "subTitleLayout", "strikethroughHalfHeight", "", "priceBackgroundCornerRadius", "priceHorizontalPadding", "badgeIconLeftPadding", "badgeIconRightPadding", "priceVerticalPadding", "titleLeftMargin", "priceStyle", "titleStyle", "subTitleStyle", "defaultPriceBackgroundColor", "priceBackgroundColor", "linkColorValue", "priceBackgroundGradient", "", "priceBackgroundPaint", "Landroid/graphics/Paint;", "priceBackgroundRect", "Landroid/graphics/RectF;", "pricePaint", "Landroid/text/TextPaint;", "titlePaint", "subTitlePaint", "strikethroughPaint", "textPaintStyleParser", "Lru/ozon/app/android/uikit/utils/TextPaintStyleParser;", "prevItem", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "prevBadgeIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "item", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "drawRightIcon", "drawBadgeIcon", "resolveTextStyles", "theme", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle$ThemeType;", "prevTheme", "resolveTextColors", "priceColor", "", "prevPriceColor", "titleColor", "prevTitleColor", "subTitleColor", "prevSubTitleColor", "strikethroughTitleColor", "prevStrikethroughTitleColor", "mayBeLayoutOrInvalidate", "makeStrikethrough", "safeTitleLayout", "mapToColor", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle$GradientColor;", "setTitleWithSubtitle", "setIcons", "setPriceBackground", "color", "gradient", "(Ljava/lang/Integer;[I)V", "checkSpanClick", "updatePriceBackground", "updatePriceBackgroundRect", "updateContentDescription", "toStaticLayout", "", "paint", "width", "safeWidth", "Landroid/text/Layout;", "safeHeight", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class PdpPriceWithTitleView extends View {
    private Drawable badgeIcon;
    private int badgeIconLeftPadding;
    private int badgeIconRightPadding;
    private Drawable chevronIcon;
    private final int defaultPriceBackgroundColor;
    private final boolean isSelect;
    private final int linkColorValue;
    private Icon prevBadgeIcon;
    private PriceWithTitle prevItem;

    @NotNull
    private OzonSpannableString price;
    private int priceBackgroundColor;
    private float priceBackgroundCornerRadius;
    private int[] priceBackgroundGradient;

    @NotNull
    private final Paint priceBackgroundPaint;

    @NotNull
    private final RectF priceBackgroundRect;
    private int priceHorizontalPadding;
    private StaticLayout priceLayout;

    @NotNull
    private final TextPaint pricePaint;
    private int priceStyle;
    private float priceVerticalPadding;
    private final float strikethroughHalfHeight;

    @NotNull
    private final Paint strikethroughPaint;
    private OzonSpannableString subTitle;
    private StaticLayout subTitleLayout;

    @NotNull
    private final TextPaint subTitlePaint;
    private int subTitleStyle;

    @NotNull
    private final TextPaintStyleParser textPaintStyleParser;
    private OzonSpannableString title;
    private StaticLayout titleLayout;
    private int titleLeftMargin;

    @NotNull
    private final TextPaint titlePaint;
    private int titleStyle;
    public static final int $stable = 8;
    private static final int MAX_BADGE_WIDTH = ResourceExtKt.toPx(m.e.DEFAULT_DRAG_ANIMATION_DURATION);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceWithTitle.ThemeType.values().length];
            try {
                iArr[PriceWithTitle.ThemeType.THEME_TYPE_MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceWithTitle.ThemeType.THEME_TYPE_MEDIUM_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceWithTitle.ThemeType.THEME_TYPE_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceWithTitle.ThemeType.THEME_TYPE_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceWithTitle.ThemeType.STYLE_TYPE_SMALL_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpPriceWithTitleView(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSelect = z11;
        this.price = OzonSpannableStringKt.toOzonSpannableString("");
        Dimens dimens = Dimens.INSTANCE;
        this.strikethroughHalfHeight = dimens.getDPF_1();
        this.priceBackgroundCornerRadius = ResourceExtKt.toPxF((z11 ? CornerRadius.RADIUS_400 : CornerRadius.RADIUS_350).getPx());
        this.priceHorizontalPadding = z11 ? dimens.getDP_10() : dimens.getDP_8();
        this.badgeIconLeftPadding = dimens.getDP_6();
        this.badgeIconRightPadding = dimens.getDP_4();
        this.priceVerticalPadding = dimens.getDPF_4();
        this.titleLeftMargin = dimens.getDP_4();
        this.priceStyle = R$style.TextStyle_Body_M_Bold;
        int i11 = R$style.TextStyle_Body_M;
        this.titleStyle = i11;
        this.subTitleStyle = i11;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.graphicWarningPrimaryInverted);
        this.defaultPriceBackgroundColor = themeColor;
        this.priceBackgroundColor = themeColor;
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.bgActionPrimary);
        this.linkColorValue = themeColor2;
        Paint paint = new Paint(1);
        paint.setColor(this.priceBackgroundColor);
        this.priceBackgroundPaint = paint;
        this.priceBackgroundRect = new RectF();
        this.pricePaint = new TextPaint(1);
        TextPaint textPaint = new TextPaint(1);
        textPaint.linkColor = themeColor2;
        this.titlePaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.linkColor = themeColor2;
        this.subTitlePaint = textPaint2;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(dimens.getDPF_1());
        this.strikethroughPaint = paint2;
        this.textPaintStyleParser = new TextPaintStyleParser(context);
        setClickable(true);
    }

    private final boolean checkSpanClick(MotionEvent event) {
        StaticLayout staticLayout;
        OzonSpannableString ozonSpannableString = this.title;
        if (ozonSpannableString != null && (staticLayout = this.titleLayout) != null && event != null && event.getAction() == 1) {
            float x11 = event.getX();
            float paddingLeft = (x11 - getPaddingLeft()) - (safeWidth(this.priceLayout) + this.titleLeftMargin);
            int y11 = (((int) event.getY()) - getPaddingTop()) - ((safeHeight(this.priceLayout) - staticLayout.getHeight()) / 2);
            if (paddingLeft >= 0.0f && paddingLeft <= staticLayout.getWidth() && y11 >= 0 && y11 <= staticLayout.getHeight()) {
                int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForVertical(y11), paddingLeft);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ozonSpannableString.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                Intrinsics.f(clickableSpanArr);
                if (!(clickableSpanArr.length == 0)) {
                    clickableSpanArr[0].onClick(this);
                    return true;
                }
            }
        }
        return false;
    }

    private final void drawBadgeIcon(Canvas canvas) {
        Drawable drawable = this.badgeIcon;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.badgeIconLeftPadding, (((getMeasuredHeight() - (getPaddingBottom() + getPaddingTop())) - drawable.getIntrinsicHeight()) / 2) + getPaddingTop());
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final void drawRightIcon(Canvas canvas) {
        Drawable drawable = this.chevronIcon;
        if (drawable != null) {
            canvas.translate(canvas.getWidth() - drawable.getIntrinsicWidth(), (((getMeasuredHeight() - (getPaddingBottom() + getPaddingTop())) - drawable.getIntrinsicHeight()) / 2) + getPaddingTop());
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
        }
    }

    private final int getBadgeElementsWidth() {
        Drawable drawable = this.badgeIcon;
        if (drawable != null) {
            return this.badgeIconLeftPadding + (drawable != null ? drawable.getIntrinsicWidth() : 0) + this.badgeIconRightPadding + this.priceHorizontalPadding;
        }
        return this.priceHorizontalPadding * 2;
    }

    private final void makeStrikethrough(StaticLayout safeTitleLayout, Canvas canvas) {
        if (canvas != null) {
            PriceWithTitle priceWithTitle = this.prevItem;
            if ((priceWithTitle != null ? priceWithTitle.getStrikethroughTitleColor() : null) == null || safeTitleLayout == null) {
                return;
            }
            canvas.drawLine(0.0f, (safeTitleLayout.getHeight() / 2.0f) + this.strikethroughHalfHeight, safeTitleLayout.getWidth(), (safeTitleLayout.getHeight() / 2.0f) - this.strikethroughHalfHeight, this.strikethroughPaint);
        }
    }

    private final int[] mapToColor(PriceWithTitle.GradientColor gradientColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, gradientColor.getStartColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, gradientColor.getEndColor());
            if (parseColor2 != null) {
                return new int[]{intValue, parseColor2.intValue()};
            }
        }
        return null;
    }

    private final void mayBeLayoutOrInvalidate(PriceWithTitle item, PriceWithTitle prevItem, Icon badgeIcon) {
        if ((prevItem != null ? prevItem.getTheme() : null) != item.getTheme() || !Intrinsics.d(prevItem.getPrice(), item.getPrice()) || !Intrinsics.d(prevItem.getSubtitle(), item.getSubtitle()) || !Intrinsics.d(prevItem.getTitle(), item.getTitle()) || !Intrinsics.d(this.prevBadgeIcon, badgeIcon)) {
            requestLayout();
            invalidate();
        } else {
            if (Intrinsics.d(prevItem.getBackgroundColor(), item.getBackgroundColor()) && Intrinsics.d(prevItem.getGradientBackgroundColor(), item.getGradientBackgroundColor()) && Intrinsics.d(prevItem.getPriceColor(), item.getPriceColor()) && Intrinsics.d(prevItem.getTitleColor(), item.getTitleColor()) && Intrinsics.d(prevItem.getSubtitleColor(), item.getSubtitleColor()) && Intrinsics.d(prevItem.getStrikethroughTitleColor(), item.getStrikethroughTitleColor())) {
                return;
            }
            invalidate();
        }
    }

    private final void resolveTextColors(String priceColor, String prevPriceColor, String titleColor, String prevTitleColor, String subTitleColor, String prevSubTitleColor, String strikethroughTitleColor, String prevStrikethroughTitleColor) {
        if (!Intrinsics.d(priceColor, prevPriceColor)) {
            TextPaint textPaint = this.pricePaint;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textPaint.setColor(styleParser.parseColor(context, priceColor, UniColors.GRAPHIC_PRIMARY_ON_LIGHT.getResId()));
        }
        if (!Intrinsics.d(titleColor, prevTitleColor)) {
            TextPaint textPaint2 = this.titlePaint;
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textPaint2.setColor(styleParser2.parseColor(context2, titleColor, UniColors.TEXT_SECONDARY.getResId()));
        }
        if (!Intrinsics.d(subTitleColor, prevSubTitleColor)) {
            TextPaint textPaint3 = this.subTitlePaint;
            StyleParser styleParser3 = StyleParser.INSTANCE;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            textPaint3.setColor(styleParser3.parseColor(context3, subTitleColor, UniColors.TEXT_SECONDARY.getResId()));
        }
        if (Intrinsics.d(strikethroughTitleColor, prevStrikethroughTitleColor)) {
            return;
        }
        Paint paint = this.strikethroughPaint;
        StyleParser styleParser4 = StyleParser.INSTANCE;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        paint.setColor(styleParser4.parseColor(context4, strikethroughTitleColor, UniColors.TEXT_SECONDARY.getResId()));
    }

    private final void resolveTextStyles(PriceWithTitle.ThemeType theme, PriceWithTitle.ThemeType prevTheme) {
        if (theme != prevTheme) {
            if (this.isSelect) {
                this.priceStyle = R$style.OzonTextAppearance_CompactControl_400small;
                int i11 = R$style.OzonTextAppearance_Compact_400large;
                this.titleStyle = i11;
                this.subTitleStyle = i11;
                Dimens dimens = Dimens.INSTANCE;
                this.priceVerticalPadding = dimens.getDPF_9();
                this.titleLeftMargin = dimens.getDP_8();
                TextPaint textPaint = this.pricePaint;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TextPaintExtKt.applyStyle(textPaint, context, this.priceStyle);
                TextPaint textPaint2 = this.titlePaint;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                TextPaintExtKt.applyStyle(textPaint2, context2, this.titleStyle);
                TextPaint textPaint3 = this.subTitlePaint;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                TextPaintExtKt.applyStyle(textPaint3, context3, this.subTitleStyle);
                return;
            }
            int i12 = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                this.priceStyle = R$style.TextStyle_Body_L_Bold;
                this.titleStyle = R$style.TextStyle_Body_M;
                this.subTitleStyle = R$style.TextStyle_Caption;
                Dimens dimens2 = Dimens.INSTANCE;
                this.priceVerticalPadding = dimens2.getDPF_8();
                this.titleLeftMargin = dimens2.getDP_8();
            } else {
                if (i12 != 4 && i12 != 5) {
                    throw new o();
                }
                this.priceStyle = R$style.TextStyle_Body_M_Bold;
                this.titleStyle = R$style.TextStyle_Body_M;
                this.subTitleStyle = R$style.TextStyle_Caption;
                Dimens dimens3 = Dimens.INSTANCE;
                this.priceVerticalPadding = dimens3.getDPF_4();
                this.titleLeftMargin = dimens3.getDP_4();
            }
            TextPaintStyleParser.applyStyle$default(this.textPaintStyleParser, this.pricePaint, this.priceStyle, null, 4, null);
            TextPaintStyleParser.applyStyle$default(this.textPaintStyleParser, this.titlePaint, this.titleStyle, null, 4, null);
            TextPaintStyleParser.applyStyle$default(this.textPaintStyleParser, this.subTitlePaint, this.subTitleStyle, null, 4, null);
        }
    }

    private final int safeHeight(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    private final int safeWidth(Layout layout) {
        if (layout != null) {
            return layout.getWidth();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setIcons(CommonAtomIconDTO chevronIcon, Icon badgeIcon) {
        Drawable drawable;
        Drawable drawable2 = null;
        if (chevronIcon != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable = ContextExtKt.loadDrawableByName(context, chevronIcon.getIcon());
            if (drawable != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context2, chevronIcon.getTintColor());
                if (parseColor != null) {
                    drawable.setTint(parseColor.intValue());
                }
                this.chevronIcon = drawable;
                if (badgeIcon != null) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    Drawable loadDrawableByName = ContextExtKt.loadDrawableByName(context3, badgeIcon.getImage());
                    if (loadDrawableByName != null) {
                        StyleParser styleParser2 = StyleParser.INSTANCE;
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        Integer parseColor2 = styleParser2.parseColor(context4, badgeIcon.getTintColor());
                        if (parseColor2 != null) {
                            loadDrawableByName.setTint(parseColor2.intValue());
                        }
                        drawable2 = loadDrawableByName;
                    }
                }
                this.badgeIcon = drawable2;
            }
        }
        drawable = null;
        this.chevronIcon = drawable;
        if (badgeIcon != null) {
        }
        this.badgeIcon = drawable2;
    }

    private final void setPriceBackground(Integer color, int[] gradient) {
        boolean equals = Arrays.equals(this.priceBackgroundGradient, gradient);
        this.priceBackgroundGradient = gradient;
        int intValue = color != null ? color.intValue() : this.defaultPriceBackgroundColor;
        boolean z11 = (equals && this.priceBackgroundColor == intValue) ? false : true;
        this.priceBackgroundColor = intValue;
        if (z11) {
            updatePriceBackground();
        }
    }

    private final void setTitleWithSubtitle(PriceWithTitle item, Function1<? super AtomAction, Unit> onAction) {
        PdpPriceWithTitleView$setTitleWithSubtitle$onUrlClick$1 pdpPriceWithTitleView$setTitleWithSubtitle$onUrlClick$1 = new PdpPriceWithTitleView$setTitleWithSubtitle$onUrlClick$1(onAction);
        if (!Intrinsics.d(this.title, item.getTitle())) {
            OzonSpannableString title = item.getTitle();
            this.title = title != null ? OzonUrlSpan.INSTANCE.setOnUrlSpanClick(title, this, pdpPriceWithTitleView$setTitleWithSubtitle$onUrlClick$1) : null;
        }
        if (Intrinsics.d(this.subTitle, item.getSubtitle())) {
            return;
        }
        OzonSpannableString subtitle = item.getSubtitle();
        this.subTitle = subtitle != null ? OzonUrlSpan.INSTANCE.setOnUrlSpanClick(subtitle, this, pdpPriceWithTitleView$setTitleWithSubtitle$onUrlClick$1) : null;
    }

    private final StaticLayout toStaticLayout(CharSequence charSequence, TextPaint textPaint, int i11) {
        int length = charSequence.length();
        if (i11 < 1) {
            i11 = 1;
        }
        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i11).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void updateContentDescription() {
        StringBuilder sb2 = new StringBuilder(this.price);
        OzonSpannableString ozonSpannableString = this.title;
        if (ozonSpannableString != null) {
            sb2.append(" " + ((Object) ozonSpannableString));
        }
        OzonSpannableString ozonSpannableString2 = this.subTitle;
        if (ozonSpannableString2 != null) {
            sb2.append(" " + ((Object) ozonSpannableString2));
        }
        setContentDescription(sb2.toString());
    }

    private final void updatePriceBackground() {
        LinearGradient linearGradient;
        int[] iArr = this.priceBackgroundGradient;
        float safeWidth = safeWidth(this.priceLayout) + getBadgeElementsWidth();
        Paint paint = this.priceBackgroundPaint;
        if (iArr == null) {
            paint.setColor(this.priceBackgroundColor);
            linearGradient = null;
        } else {
            linearGradient = new LinearGradient(0.0f, 0.0f, safeWidth, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(linearGradient);
    }

    private final void updatePriceBackgroundRect() {
        float width = this.priceBackgroundRect.width();
        float height = this.priceBackgroundRect.height();
        float safeWidth = safeWidth(this.priceLayout) + getBadgeElementsWidth();
        float safeHeight = (this.priceVerticalPadding * 2.0f) + safeHeight(this.priceLayout);
        if (width == safeWidth && height == safeHeight) {
            return;
        }
        int[] iArr = this.priceBackgroundGradient;
        this.priceBackgroundPaint.setShader(iArr != null ? new LinearGradient(0.0f, 0.0f, safeWidth, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP) : null);
        this.priceBackgroundRect.set(0.0f, 0.0f, safeWidth, safeHeight);
    }

    public final void bind(@NotNull PriceWithTitle item, @NotNull Function1<? super AtomAction, Unit> onAction, CommonAtomIconDTO chevronIcon, Icon badgeIcon) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        PriceWithTitle.ThemeType theme = item.getTheme();
        PriceWithTitle priceWithTitle = this.prevItem;
        resolveTextStyles(theme, priceWithTitle != null ? priceWithTitle.getTheme() : null);
        String priceColor = item.getPriceColor();
        PriceWithTitle priceWithTitle2 = this.prevItem;
        String priceColor2 = priceWithTitle2 != null ? priceWithTitle2.getPriceColor() : null;
        String titleColor = item.getTitleColor();
        PriceWithTitle priceWithTitle3 = this.prevItem;
        String titleColor2 = priceWithTitle3 != null ? priceWithTitle3.getTitleColor() : null;
        String subtitleColor = item.getSubtitleColor();
        PriceWithTitle priceWithTitle4 = this.prevItem;
        String subtitleColor2 = priceWithTitle4 != null ? priceWithTitle4.getSubtitleColor() : null;
        String strikethroughTitleColor = item.getStrikethroughTitleColor();
        PriceWithTitle priceWithTitle5 = this.prevItem;
        resolveTextColors(priceColor, priceColor2, titleColor, titleColor2, subtitleColor, subtitleColor2, strikethroughTitleColor, priceWithTitle5 != null ? priceWithTitle5.getStrikethroughTitleColor() : null);
        this.price = item.getPrice();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        PriceWithTitle.GradientColor gradientBackgroundColor = item.getGradientBackgroundColor();
        setPriceBackground(parseColor, gradientBackgroundColor != null ? mapToColor(gradientBackgroundColor) : null);
        setTitleWithSubtitle(item, onAction);
        setIcons(chevronIcon, badgeIcon);
        mayBeLayoutOrInvalidate(item, this.prevItem, badgeIcon);
        updateContentDescription();
        this.prevItem = item;
        this.prevBadgeIcon = badgeIcon;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        canvas.save();
        canvas.translate(getPaddingLeft(), (((getMeasuredHeight() - paddingBottom) - this.priceBackgroundRect.height()) / 2) + getPaddingTop());
        RectF rectF = this.priceBackgroundRect;
        float f7 = this.priceBackgroundCornerRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.priceBackgroundPaint);
        canvas.translate(this.badgeIcon != null ? getBadgeElementsWidth() - this.priceHorizontalPadding : this.priceHorizontalPadding, this.priceVerticalPadding);
        StaticLayout staticLayout = this.priceLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        drawBadgeIcon(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft() + safeWidth(this.priceLayout) + getBadgeElementsWidth() + this.titleLeftMargin, (((getMeasuredHeight() - paddingBottom) - (safeHeight(this.titleLayout) + safeHeight(this.subTitleLayout))) / 2.0f) + getPaddingTop());
        StaticLayout staticLayout2 = this.titleLayout;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        makeStrikethrough(this.titleLayout, canvas);
        canvas.translate(0.0f, safeHeight(this.titleLayout));
        StaticLayout staticLayout3 = this.subTitleLayout;
        if (staticLayout3 != null) {
            staticLayout3.draw(canvas);
        }
        canvas.restore();
        drawRightIcon(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        OzonSpannableString ozonSpannableString = this.price;
        OzonSpannableString ozonSpannableString2 = this.title;
        OzonSpannableString ozonSpannableString3 = this.subTitle;
        int ceil = (int) Math.ceil(Layout.getDesiredWidth(ozonSpannableString, this.pricePaint));
        int ceil2 = ozonSpannableString2 != null ? (int) Math.ceil(Layout.getDesiredWidth(ozonSpannableString2, this.titlePaint)) : 0;
        int ceil3 = ozonSpannableString3 != null ? (int) Math.ceil(Layout.getDesiredWidth(ozonSpannableString3, this.subTitlePaint)) : 0;
        Drawable drawable = this.chevronIcon;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        int resolveSize = View.resolveSize(Math.max(ozonSpannableString2 != null ? ceil2 + this.titleLeftMargin : 0, ozonSpannableString3 != null ? this.titleLeftMargin + ceil3 : 0) + getBadgeElementsWidth() + ceil + paddingRight + intrinsicWidth, widthMeasureSpec);
        int badgeElementsWidth = getBadgeElementsWidth() + ceil;
        int i11 = MAX_BADGE_WIDTH;
        if (badgeElementsWidth > i11) {
            ceil = i11 - getBadgeElementsWidth();
        }
        int badgeElementsWidth2 = (((resolveSize - ceil) - getBadgeElementsWidth()) - this.titleLeftMargin) - intrinsicWidth;
        this.priceLayout = toStaticLayout(ozonSpannableString, this.pricePaint, ceil);
        this.titleLayout = ozonSpannableString2 != null ? toStaticLayout(ozonSpannableString2, this.titlePaint, badgeElementsWidth2) : null;
        this.subTitleLayout = ozonSpannableString3 != null ? toStaticLayout(ozonSpannableString3, this.subTitlePaint, badgeElementsWidth2) : null;
        int max = Math.max((((int) this.priceVerticalPadding) * 2) + safeHeight(this.priceLayout), safeHeight(this.titleLayout) + safeHeight(this.subTitleLayout)) + paddingBottom;
        updatePriceBackgroundRect();
        setMeasuredDimension(resolveSize, View.resolveSize(max, heightMeasureSpec));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        return checkSpanClick(event) || super.onTouchEvent(event);
    }
}
