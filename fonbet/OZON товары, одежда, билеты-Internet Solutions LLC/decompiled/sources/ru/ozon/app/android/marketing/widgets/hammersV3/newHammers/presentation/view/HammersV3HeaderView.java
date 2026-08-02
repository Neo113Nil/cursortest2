package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.switchingButton.SwitchingButtonView;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J0\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0014J\b\u00107\u001a\u00020.H\u0002J\b\u00108\u001a\u00020.H\u0002J\u0010\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020\u0007H\u0002J\b\u0010;\u001a\u00020.H\u0002J\b\u0010<\u001a\u00020.H\u0002J\b\u0010=\u001a\u00020.H\u0002J\b\u0010>\u001a\u00020.H\u0002J\b\u0010?\u001a\u00020\u0007H\u0002J\b\u0010@\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020.H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u000e\u0010#\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010,¨\u0006C"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "logoIv", "Landroidx/appcompat/widget/AppCompatImageView;", "getLogoIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "subtitleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getSubtitleTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "notifyBtn", "Lru/ozon/app/android/atoms/v3/holders/switchingButton/SwitchingButtonView;", "getNotifyBtn", "()Lru/ozon/app/android/atoms/v3/holders/switchingButton/SwitchingButtonView;", "infoBtn", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "getInfoBtn", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "paddingHorizontal", "paddingHeaderBottom", "paddingHeaderTop", "logoWidth", "getLogoWidth", "()I", "logoHeight", "getLogoHeight", "subtitleVisibleMarginStart", "subtitleGoneMarginStart", "subtitleVisibleMarginEnd", "subtitleVisibleMarginEndSmall", "subtitleGoneMarginEnd", "infoButtonMarginRight", "headerHeight", "isSmallScreen", "", "()Z", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "l", "t", "r", "b", "setContainerStyle", "measureLogo", "measureSubtitle", "fullContentWidth", "measureNotifyBtn", "measureInfoBtn", "layoutLogo", "layoutSubtitle", "getSubtitleRightMargin", "layoutNotifyBtn", "layoutInfoBtn", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3HeaderView extends ViewGroup {
    private final int headerHeight;

    @NotNull
    private final SmallIconButtonView infoBtn;
    private final int infoButtonMarginRight;

    @NotNull
    private final AppCompatImageView logoIv;

    @NotNull
    private final SwitchingButtonView notifyBtn;
    private final int paddingHeaderBottom;
    private final int paddingHeaderTop;
    private final int paddingHorizontal;
    private final int subtitleGoneMarginEnd;
    private final int subtitleGoneMarginStart;

    @NotNull
    private final AppCompatTextView subtitleTv;
    private final int subtitleVisibleMarginEnd;
    private final int subtitleVisibleMarginEndSmall;
    private final int subtitleVisibleMarginStart;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderView$Companion;", "", "<init>", "()V", "PADDING_HORIZONTAL", "", "PADDING_BOTTOM", "PADDING_TOP", "LOGO_WIDTH", "LOGO_WIDTH_SMALL", "LOGO_HEIGHT_SMALL", "SUBTITLE_VISIBLE_MARGIN_START", "SUBTITLE_GONE_MARGIN_START", "SUBTITLE_VISIBLE_MARGIN_END", "SUBTITLE_VISIBLE_MARGIN_END_SMALL", "SUBTITLE_GONE_MARGIN_END", "INFO_BTN_MARGIN_RIGHT", "HEADER_HEIGHT", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ HammersV3HeaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final int getLogoHeight() {
        int i11 = (!isSmallScreen() || this.infoBtn.getVisibility() == 8) ? 32 : 25;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPx(i11, context);
    }

    private final int getLogoWidth() {
        int i11 = (!isSmallScreen() || this.infoBtn.getVisibility() == 8) ? UserVerificationMethods.USER_VERIFY_PATTERN : 100;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPx(i11, context);
    }

    private final int getSubtitleRightMargin() {
        return this.infoButtonMarginRight + (isSmallScreen() ? this.subtitleVisibleMarginEndSmall : this.subtitleVisibleMarginEnd);
    }

    private final boolean isSmallScreen() {
        return getContext().getResources().getConfiguration().smallestScreenWidthDp < 375;
    }

    private final void layoutInfoBtn() {
        if (this.infoBtn.getVisibility() == 8) {
            return;
        }
        LayoutExtKt.layoutRightBottom(this.infoBtn, ((getMeasuredWidth() - this.paddingHorizontal) - this.notifyBtn.getMeasuredWidth()) - this.infoButtonMarginRight, getMeasuredHeight() - this.paddingHeaderBottom);
    }

    private final void layoutLogo() {
        if (this.logoIv.getVisibility() == 8) {
            return;
        }
        LayoutExtKt.layoutLeftBottom(this.logoIv, this.paddingHorizontal, getMeasuredHeight() - this.paddingHeaderBottom);
    }

    private final void layoutNotifyBtn() {
        if (this.notifyBtn.getVisibility() == 8) {
            return;
        }
        LayoutExtKt.layoutRightBottom(this.notifyBtn, getMeasuredWidth() - this.paddingHorizontal, getMeasuredHeight() - this.paddingHeaderBottom);
    }

    private final void layoutSubtitle() {
        if (this.subtitleTv.getVisibility() == 8) {
            return;
        }
        LayoutExtKt.layoutRightTop(this.subtitleTv, (((getMeasuredWidth() - this.paddingHorizontal) - (this.notifyBtn.getVisibility() == 8 ? 0 : this.notifyBtn.getMeasuredWidth())) - (this.infoBtn.getVisibility() != 8 ? this.infoBtn.getMeasuredWidth() : 0)) - ((this.notifyBtn.getVisibility() == 8 && this.infoBtn.getVisibility() == 8) ? this.subtitleGoneMarginEnd : getSubtitleRightMargin()), ((this.headerHeight - this.subtitleTv.getMeasuredHeight()) / 2) + this.paddingHeaderTop);
    }

    private final void measureInfoBtn() {
        if (this.infoBtn.getVisibility() == 8) {
            return;
        }
        SmallIconButtonView smallIconButtonView = this.infoBtn;
        int i11 = this.headerHeight;
        MeasureExtKt.measureExactly(smallIconButtonView, i11, i11);
    }

    private final void measureLogo() {
        if (this.logoIv.getVisibility() == 8) {
            return;
        }
        MeasureExtKt.measureExactly(this.logoIv, getLogoWidth(), getLogoHeight());
    }

    private final void measureNotifyBtn() {
        if (this.notifyBtn.getVisibility() == 8) {
            return;
        }
        SwitchingButtonView switchingButtonView = this.notifyBtn;
        int i11 = this.headerHeight;
        MeasureExtKt.measureExactly(switchingButtonView, i11, i11);
    }

    private final void measureSubtitle(int fullContentWidth) {
        if (this.subtitleTv.getVisibility() == 8) {
            return;
        }
        int measuredWidth = this.infoBtn.getMeasuredWidth() + this.notifyBtn.getMeasuredWidth() + this.logoIv.getMeasuredWidth();
        MeasureExtKt.measureAtMost(this.subtitleTv, ((fullContentWidth - measuredWidth) - ((this.notifyBtn.getVisibility() == 8 && this.infoBtn.getVisibility() == 8) ? this.subtitleGoneMarginEnd : getSubtitleRightMargin())) - (this.logoIv.getVisibility() == 8 ? this.subtitleGoneMarginStart : this.subtitleVisibleMarginStart), this.headerHeight);
    }

    private final void setContainerStyle() {
        int i11 = this.paddingHorizontal;
        setPadding(i11, this.paddingHeaderTop, i11, this.paddingHeaderBottom);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ResourceExtKt.color(context, R$color.layer_floor_1));
    }

    @NotNull
    public final SmallIconButtonView getInfoBtn() {
        return this.infoBtn;
    }

    @NotNull
    public final AppCompatImageView getLogoIv() {
        return this.logoIv;
    }

    @NotNull
    public final SwitchingButtonView getNotifyBtn() {
        return this.notifyBtn;
    }

    @NotNull
    public final AppCompatTextView getSubtitleTv() {
        return this.subtitleTv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        layoutLogo();
        layoutSubtitle();
        layoutNotifyBtn();
        layoutInfoBtn();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec) - (this.paddingHorizontal * 2);
        measureLogo();
        measureInfoBtn();
        measureNotifyBtn();
        measureSubtitle(size);
        setMeasuredDimension((this.paddingHorizontal * 2) + size, this.headerHeight + this.paddingHeaderTop + this.paddingHeaderBottom);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersV3HeaderView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.logoIv);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(appCompatImageView);
        this.logoIv = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.subtitleTv);
        appCompatTextView.setSingleLine();
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M);
        appCompatTextView.setLetterSpacing(0.0f);
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textSecondary));
        addView(appCompatTextView);
        this.subtitleTv = appCompatTextView;
        SwitchingButtonView switchingButtonView = new SwitchingButtonView(context, null, 0, 6, null);
        switchingButtonView.setId(R$id.notifyBtn);
        addView(switchingButtonView);
        this.notifyBtn = switchingButtonView;
        SmallIconButtonView smallIconButtonView = new SmallIconButtonView(context, null, 0, 6, null);
        smallIconButtonView.setId(R$id.infoBtn);
        addView(smallIconButtonView);
        this.infoBtn = smallIconButtonView;
        this.paddingHorizontal = ResourceExtKt.toPx(16, context);
        this.paddingHeaderBottom = ResourceExtKt.toPx(8, context);
        this.paddingHeaderTop = ResourceExtKt.toPx(12, context);
        this.subtitleVisibleMarginStart = ResourceExtKt.toPx(8, context);
        this.subtitleGoneMarginStart = ResourceExtKt.toPx(0, context);
        this.subtitleVisibleMarginEnd = ResourceExtKt.toPx(2, context);
        this.subtitleVisibleMarginEndSmall = ResourceExtKt.toPx(6, context);
        this.subtitleGoneMarginEnd = ResourceExtKt.toPx(0, context);
        this.infoButtonMarginRight = ResourceExtKt.toPx(4, context);
        this.headerHeight = ResourceExtKt.toPx(32, context);
        setContainerStyle();
    }
}
