package ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\r*\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\r*\u00020$H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010+R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010+R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R*\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010+\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u001aR*\u0010A\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010+\u001a\u0004\bB\u0010?\"\u0004\bC\u0010\u001aR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR*\u0010I\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010?\"\u0004\bK\u0010\u001aR\u0017\u0010M\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010Q\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u0017\u0010T\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010WR\u0017\u0010Z\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010WR\u0017\u0010\\\u001a\u00020L8\u0006¢\u0006\f\n\u0004\b\\\u0010N\u001a\u0004\b]\u0010PR\u0014\u0010^\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010NR*\u0010_\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010#R\"\u0010d\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010`\u001a\u0004\be\u0010b\"\u0004\bf\u0010#R*\u0010g\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010`\u001a\u0004\bh\u0010b\"\u0004\bi\u0010#R*\u0010j\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010`\u001a\u0004\bk\u0010b\"\u0004\bl\u0010#R\u0014\u0010m\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010b¨\u0006n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "parentWidthMeasureSpec", "measureTimer", "(I)V", "measureFooter", "layoutBackgroundImage", "()V", "layoutTitleImage", "layoutTimer", "layoutFooter", "visible", "setFooterVisibility", "(Z)V", "Landroid/view/View;", "offsetX", "layoutFooterElement", "(Landroid/view/View;I)V", "goneFooterViewIfVisible", "(Landroid/view/View;)V", "dp5", "I", "", "timerRadius", "F", "bgRadius", "dp1", "", "longestTime", "Ljava/lang/String;", "viewHeight", "horizontalMargin", "verticalPadding", "footerPadding", "Landroid/util/Size;", "iconSize", "Landroid/util/Size;", "titleImageSize", AppMeasurementSdk.ConditionalUserProperty.VALUE, "timerTextColor", "getTimerTextColor", "()I", "setTimerTextColor", "timerBackgroundColor", "getTimerBackgroundColor", "setTimerBackgroundColor", "Landroid/graphics/drawable/ShapeDrawable;", "timer1Shape", "Landroid/graphics/drawable/ShapeDrawable;", "timer2Shape", "daysShape", "footerColor", "getFooterColor", "setFooterColor", "Landroidx/appcompat/widget/AppCompatImageView;", "backgroundImage", "Landroidx/appcompat/widget/AppCompatImageView;", "getBackgroundImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "titleImage", "getTitleImage", "Landroidx/appcompat/widget/AppCompatTextView;", "timerPart1", "Landroidx/appcompat/widget/AppCompatTextView;", "getTimerPart1", "()Landroidx/appcompat/widget/AppCompatTextView;", "timerPart2", "getTimerPart2", "footerTitle", "getFooterTitle", "footerDisclosure", "getFooterDisclosure", "premiumIcon", "footerItemsVisible", "Z", "getFooterItemsVisible", "()Z", "setFooterItemsVisible", "premiumIconVisible", "getPremiumIconVisible", "setPremiumIconVisible", "disclosureVisible", "getDisclosureVisible", "setDisclosureVisible", "timerTickerVisible", "getTimerTickerVisible", "setTimerTickerVisible", "isSmallScreen", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlackFridayCounterView extends ViewGroup {

    @NotNull
    private final AppCompatImageView backgroundImage;
    private final float bgRadius;

    @NotNull
    private final ShapeDrawable daysShape;
    private boolean disclosureVisible;
    private final int dp1;
    private final int dp5;
    private int footerColor;

    @NotNull
    private final AppCompatImageView footerDisclosure;
    private boolean footerItemsVisible;
    private final int footerPadding;

    @NotNull
    private final AppCompatTextView footerTitle;
    private final int horizontalMargin;

    @NotNull
    private final Size iconSize;

    @NotNull
    private final String longestTime;

    @NotNull
    private final AppCompatImageView premiumIcon;
    private boolean premiumIconVisible;

    @NotNull
    private final ShapeDrawable timer1Shape;

    @NotNull
    private final ShapeDrawable timer2Shape;
    private int timerBackgroundColor;

    @NotNull
    private final AppCompatTextView timerPart1;

    @NotNull
    private final AppCompatTextView timerPart2;
    private final float timerRadius;
    private int timerTextColor;
    private boolean timerTickerVisible;

    @NotNull
    private final AppCompatImageView titleImage;

    @NotNull
    private final Size titleImageSize;
    private final int verticalPadding;
    private int viewHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlackFridayCounterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void goneFooterViewIfVisible(View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        ViewExtKt.gone(view);
    }

    private final boolean isSmallScreen() {
        return getContext().getResources().getConfiguration().smallestScreenWidthDp < 375;
    }

    private final void layoutBackgroundImage() {
        LayoutExtKt.layoutLeftTop(this.backgroundImage, getPaddingLeft(), getPaddingBottom());
    }

    private final void layoutFooter() {
        int measuredWidth = ((getMeasuredWidth() - this.horizontalMargin) - this.footerDisclosure.getMeasuredWidth()) - getPaddingRight();
        if (this.disclosureVisible) {
            layoutFooterElement(this.footerDisclosure, measuredWidth);
            measuredWidth -= this.footerPadding;
        }
        int measuredWidth2 = measuredWidth - this.footerTitle.getMeasuredWidth();
        layoutFooterElement(this.footerTitle, measuredWidth2);
        if (this.premiumIcon.getVisibility() == 0) {
            AppCompatImageView appCompatImageView = this.premiumIcon;
            layoutFooterElement(appCompatImageView, (measuredWidth2 - this.footerPadding) - appCompatImageView.getMeasuredWidth());
        }
    }

    private final void layoutFooterElement(View view, int i11) {
        LayoutExtKt.layoutLeftBottom(view, i11, (getMeasuredHeight() - this.verticalPadding) - ((this.footerTitle.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
    }

    private final void layoutTimer() {
        int measuredHeight = this.footerItemsVisible ? this.verticalPadding : (getMeasuredHeight() / 2) - (this.timerPart2.getMeasuredHeight() / 2);
        int measuredWidth = ((getMeasuredWidth() - getPaddingRight()) - this.timerPart2.getMeasuredWidth()) - this.horizontalMargin;
        LayoutExtKt.layoutLeftTop(this.timerPart2, measuredWidth, measuredHeight);
        AppCompatTextView appCompatTextView = this.timerPart1;
        LayoutExtKt.layoutLeftTop(appCompatTextView, measuredWidth - appCompatTextView.getMeasuredWidth(), measuredHeight);
    }

    private final void layoutTitleImage() {
        int measuredHeight = (getMeasuredHeight() / 2) - (this.titleImage.getMeasuredHeight() / 2);
        LayoutExtKt.layoutLeftTop(this.titleImage, getPaddingLeft() + this.horizontalMargin, measuredHeight);
    }

    private final void measureFooter(int parentWidthMeasureSpec) {
        int size = (View.MeasureSpec.getSize(parentWidthMeasureSpec) - ((getPaddingRight() + this.horizontalMargin) * 2)) - this.titleImage.getMeasuredWidth();
        if (this.disclosureVisible) {
            MeasureExtKt.measureExactly(this.footerDisclosure, this.iconSize.getWidth(), this.iconSize.getHeight());
            size -= this.footerDisclosure.getMeasuredWidth() + this.footerPadding;
        } else {
            MeasureExtKt.measureExactly(this.footerDisclosure, 0, 0);
        }
        if (this.premiumIcon.getVisibility() == 0) {
            MeasureExtKt.measureExactly(this.premiumIcon, this.iconSize.getWidth(), this.iconSize.getHeight());
            size -= this.premiumIcon.getMeasuredWidth() + this.footerPadding;
        } else {
            MeasureExtKt.measureExactly(this.premiumIcon, 0, 0);
        }
        this.footerTitle.measure(View.MeasureSpec.makeMeasureSpec(size, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private final void measureTimer(int parentWidthMeasureSpec) {
        int size = (View.MeasureSpec.getSize(parentWidthMeasureSpec) - ((getPaddingRight() + this.horizontalMargin) * 2)) - this.titleImage.getMeasuredWidth();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((int) Math.ceil(this.timerPart1.getPaint().measureText(this.longestTime))) + this.dp5, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (this.timerTickerVisible) {
            this.timerPart1.measure(makeMeasureSpec, makeMeasureSpec2);
        } else {
            MeasureExtKt.measureExactly(this.timerPart1, 0, 0);
        }
        this.timerPart2.measure(View.MeasureSpec.makeMeasureSpec(size - this.timerPart1.getMeasuredWidth(), LinearLayoutManager.INVALID_OFFSET), makeMeasureSpec2);
    }

    private final void setFooterVisibility(boolean visible) {
        if (visible) {
            ViewExtKt.show(this.footerTitle);
            ViewExtKt.show(this.footerDisclosure);
        } else {
            goneFooterViewIfVisible(this.footerTitle);
            goneFooterViewIfVisible(this.footerDisclosure);
        }
        ViewExtKt.showOrGone(this.premiumIcon, Boolean.valueOf(this.premiumIconVisible && visible));
    }

    @NotNull
    public final AppCompatImageView getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final AppCompatImageView getFooterDisclosure() {
        return this.footerDisclosure;
    }

    public final boolean getFooterItemsVisible() {
        return this.footerItemsVisible;
    }

    @NotNull
    public final AppCompatTextView getFooterTitle() {
        return this.footerTitle;
    }

    @NotNull
    public final AppCompatTextView getTimerPart1() {
        return this.timerPart1;
    }

    @NotNull
    public final AppCompatTextView getTimerPart2() {
        return this.timerPart2;
    }

    @NotNull
    public final AppCompatImageView getTitleImage() {
        return this.titleImage;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        layoutBackgroundImage();
        layoutTitleImage();
        layoutTimer();
        if (this.footerItemsVisible) {
            layoutFooter();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measureExactly(this.titleImage, this.titleImageSize.getWidth(), this.titleImageSize.getHeight());
        measureTimer(widthMeasureSpec);
        measureFooter(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        MeasureExtKt.measureExactly(this.backgroundImage, size - (getPaddingRight() + getPaddingLeft()), this.viewHeight);
        setMeasuredDimension(size, this.viewHeight);
    }

    public final void setDisclosureVisible(boolean z11) {
        this.disclosureVisible = z11;
        ViewExtKt.showOrGone(this.footerDisclosure, Boolean.valueOf(z11));
    }

    public final void setFooterColor(int i11) {
        if (this.footerColor != i11) {
            this.footerColor = i11;
            this.footerTitle.setTextColor(i11);
            ThemeExtKt.tint(this.footerDisclosure, Integer.valueOf(i11));
            ThemeExtKt.tint(this.premiumIcon, Integer.valueOf(i11));
        }
    }

    public final void setFooterItemsVisible(boolean z11) {
        this.footerItemsVisible = z11;
        setFooterVisibility(z11);
        requestLayout();
    }

    public final void setPremiumIconVisible(boolean z11) {
        this.premiumIconVisible = z11;
    }

    public final void setTimerBackgroundColor(int i11) {
        if (this.timerBackgroundColor != i11) {
            this.timerBackgroundColor = i11;
            this.timer1Shape.getPaint().setColor(i11);
            this.timer2Shape.getPaint().setColor(i11);
            this.daysShape.getPaint().setColor(i11);
        }
    }

    public final void setTimerTextColor(int i11) {
        if (this.timerTextColor != i11) {
            this.timerTextColor = i11;
            this.timerPart1.setTextColor(i11);
            this.timerPart2.setTextColor(i11);
        }
    }

    public final void setTimerTickerVisible(boolean z11) {
        this.timerTickerVisible = z11;
        ViewExtKt.showOrGone(this.timerPart1, Boolean.valueOf(z11));
        this.timerPart2.setBackground(z11 ? this.timer2Shape : this.daysShape);
        if (!z11) {
            AppCompatTextView appCompatTextView = this.timerPart2;
            int i11 = this.dp5;
            int i12 = this.dp1;
            appCompatTextView.setPadding(i11, i12, i11, i12);
            return;
        }
        AppCompatTextView appCompatTextView2 = this.timerPart1;
        int i13 = this.dp5;
        int i14 = this.dp1;
        appCompatTextView2.setPadding(i13, i14, 0, i14);
        AppCompatTextView appCompatTextView3 = this.timerPart2;
        int i15 = this.dp1;
        appCompatTextView3.setPadding(0, i15, this.dp5, i15);
    }

    public /* synthetic */ BlackFridayCounterView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackFridayCounterView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        char c11;
        Size size;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp5 = ResourceExtKt.toPx(5);
        float pxF = ResourceExtKt.toPxF(5);
        this.timerRadius = pxF;
        this.bgRadius = ResourceExtKt.toPxF(12);
        this.dp1 = ResourceExtKt.toPx(1);
        String format = String.format("%s\u2009:\u2009%s\u2009:\u2009%s", Arrays.copyOf(new Object[]{"00", "00", "00"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.longestTime = format.concat(" ");
        this.viewHeight = ResourceExtKt.toPx(64);
        this.horizontalMargin = ResourceExtKt.toPx(16, context);
        this.verticalPadding = ResourceExtKt.toPx(11, context);
        this.footerPadding = ResourceExtKt.toPx(2);
        int px = ResourceExtKt.toPx(16, context);
        this.iconSize = new Size(px, px);
        if (isSmallScreen()) {
            c11 = 7;
            size = new Size(ResourceExtKt.toPx(118, context), ResourceExtKt.toPx(40, context));
        } else {
            c11 = 7;
            size = new Size(ResourceExtKt.toPx(158, context), ResourceExtKt.toPx(42, context));
        }
        this.titleImageSize = size;
        this.timerTextColor = ThemeExtKt.themeColor(context, R$attr.textLightKey);
        this.timerBackgroundColor = ResourceExtKt.color(context, R$color.transparent);
        float[] fArr = new float[8];
        fArr[0] = pxF;
        fArr[1] = pxF;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = pxF;
        fArr[c11] = pxF;
        this.timer1Shape = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        float[] fArr2 = new float[8];
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = pxF;
        fArr2[3] = pxF;
        fArr2[4] = pxF;
        fArr2[5] = pxF;
        fArr2[6] = 0.0f;
        fArr2[c11] = 0.0f;
        this.timer2Shape = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
        float[] fArr3 = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr3[i13] = this.timerRadius;
        }
        this.daysShape = new ShapeDrawable(new RoundRectShape(fArr3, null, null));
        this.footerColor = ThemeExtKt.themeColor(context, R$attr.textLightKey);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.backgroundIv);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float[] fArr4 = new float[8];
        for (int i14 = 0; i14 < 8; i14++) {
            fArr4[i14] = this.bgRadius;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr4, null, null));
        shapeDrawable.getPaint().setColor(0);
        appCompatImageView.setBackground(shapeDrawable);
        appCompatImageView.setClipToOutline(true);
        addView(appCompatImageView);
        this.backgroundImage = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R$id.titleIv);
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(appCompatImageView2);
        this.titleImage = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.timerTv);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption_AC);
        appCompatTextView.setTextColor(this.timerTextColor);
        appCompatTextView.setGravity(16);
        appCompatTextView.setBackground(this.timer1Shape);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setIncludeFontPadding(false);
        int i15 = this.dp5;
        int i16 = this.dp1;
        appCompatTextView.setPadding(i15, i16, 0, i16);
        addView(appCompatTextView);
        this.timerPart1 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R$id.timerTv2);
        appCompatTextView2.setTextAppearance(R$style.TextStyle_Caption_AC);
        appCompatTextView2.setGravity(16);
        appCompatTextView2.setTextColor(this.timerTextColor);
        appCompatTextView2.setBackground(this.timer2Shape);
        appCompatTextView2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setIncludeFontPadding(false);
        int i17 = this.dp1;
        appCompatTextView2.setPadding(0, i17, this.dp5, i17);
        addView(appCompatTextView2);
        this.timerPart2 = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R$id.footerTitleTv);
        appCompatTextView3.setTextAppearance(context, R$style.TextStyle_Body_M);
        appCompatTextView3.setTextColor(this.footerColor);
        appCompatTextView3.setGravity(16);
        appCompatTextView3.setMaxLines(1);
        appCompatTextView3.setEllipsize(truncateAt);
        addView(appCompatTextView3);
        this.footerTitle = appCompatTextView3;
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R$id.footerDisclosureIv);
        appCompatImageView3.setImageResource(R$drawable.ic_m_chevron_right);
        ThemeExtKt.tint(appCompatImageView3, Integer.valueOf(this.footerColor));
        addView(appCompatImageView3);
        this.footerDisclosure = appCompatImageView3;
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R$id.premiumIv);
        appCompatImageView4.setImageResource(R$drawable.ic_s_premium_logo_filled);
        ThemeExtKt.tint(appCompatImageView4, Integer.valueOf(this.footerColor));
        addView(appCompatImageView4);
        this.premiumIcon = appCompatImageView4;
        this.footerItemsVisible = true;
        this.disclosureVisible = true;
        this.timerTickerVisible = true;
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        int i18 = this.horizontalMargin;
        setPadding(i18, 0, i18, 0);
    }
}
