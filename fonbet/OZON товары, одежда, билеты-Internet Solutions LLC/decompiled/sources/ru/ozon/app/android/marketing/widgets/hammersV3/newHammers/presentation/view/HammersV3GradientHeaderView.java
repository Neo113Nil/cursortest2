package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.GradientTitleVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001:B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J0\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J\u0015\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u001cH\u0000¢\u0006\u0002\b,J\b\u0010-\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u0007H\u0002J\u0012\u00100\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u00101\u001a\u00020 2\u0006\u0010/\u001a\u00020\u0007H\u0002J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u00020 H\u0002J\b\u00105\u001a\u00020 H\u0002J\b\u00106\u001a\u00020 H\u0002J\b\u00107\u001a\u00020 H\u0002J\b\u00108\u001a\u00020 H\u0002J\b\u00109\u001a\u00020 H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "infoBtn", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getInfoBtn", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "timerBadge", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderBadge;", "getTimerBadge", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderBadge;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTv", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTv", "getSubtitleTv", "infoText", "getInfoText", "currentGradientTitleVO", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;", "titleGradient", "Landroid/graphics/LinearGradient;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "bindTitle", "gradientTitleVO", "bindTitle$marketing_prodGoogleAllVendorsRelease", "setContainerStyle", "measureTitle", "fullContentWidth", "setGradient", "measureSubtitle", "measureInfoText", "measureTimerBadge", "measureInfoBtn", "layoutMoreBadge", "layoutInfoBtn", "layoutInfoText", "layoutTitle", "layoutSubtitle", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HammersV3GradientHeaderView extends ViewGroup {
    private GradientTitleVO currentGradientTitleVO;

    @NotNull
    private final IconButtonV3View infoBtn;

    @NotNull
    private final TextAtomV2View infoText;

    @NotNull
    private final TextAtomV2View subtitleTv;

    @NotNull
    private final HammersV3HeaderBadge timerBadge;
    private LinearGradient titleGradient;

    @NotNull
    private final TextAtomV2View titleTv;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final float[] gradientPosition = {0.0f, 1.0f};
    private static final int paddingHorizontalOfView = ResourceExtKt.toPx(16);
    private static final int paddingTopOfView = ResourceExtKt.toPx(14);
    private static final int paddingTopOfInfoText = ResourceExtKt.toPx(18);
    private static final int marginLeftInfoIcon = ResourceExtKt.toPx(8);
    private static final int marginRightInfoIcon = ResourceExtKt.toPx(6);
    private static final int marginTopBadge = ResourceExtKt.toPx(2);
    private static final int marginTopInfoIcon = ResourceExtKt.toPx(1);
    private static final int marginRightInfoText = ResourceExtKt.toPx(2);
    private static final int headerHeightMin = ResourceExtKt.toPx(48);
    private static final int headerHeightMax = ResourceExtKt.toPx(68);
    private static final int infoBtnSize = ResourceExtKt.toPx(24);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView$Companion;", "", "<init>", "()V", "PADDING_HORIZONTAL", "", "PADDING_TOP", "PADDING_TOP_INFO_TEXT", "MARGIN_LEFT_INFO_ICON", "MARGIN_RIGHT_INFO_ICON", "MARGIN_TOP_BADGE", "MARGIN_RIGHT_INFO_TEXT", "MARGIN_TOP_INFO_ICON", "HEADER_HEIGHT_MIN", "HEADER_HEIGHT_MAX", "INFO_BTN_SIZE", "gradientPosition", "", "paddingHorizontalOfView", "getPaddingHorizontalOfView", "()I", "paddingTopOfView", "paddingTopOfInfoText", "marginLeftInfoIcon", "marginRightInfoIcon", "marginTopBadge", "marginTopInfoIcon", "marginRightInfoText", "headerHeightMin", "headerHeightMax", "infoBtnSize", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPaddingHorizontalOfView() {
            return HammersV3GradientHeaderView.paddingHorizontalOfView;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HammersV3GradientHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void layoutInfoBtn() {
        int i11;
        if (this.infoBtn.getVisibility() == 8) {
            return;
        }
        int i12 = paddingTopOfView;
        if (this.subtitleTv.getVisibility() == 8) {
            if (this.infoText.getVisibility() != 8) {
                i11 = marginTopInfoIcon;
            }
            int i13 = paddingHorizontalOfView;
            if (this.timerBadge.getVisibility() != 8) {
                i13 += this.timerBadge.getMeasuredWidth() + marginRightInfoIcon;
            }
            LayoutExtKt.layoutRightTop(this.infoBtn, getMeasuredWidth() - i13, i12);
        }
        i11 = marginTopBadge;
        i12 += i11;
        int i132 = paddingHorizontalOfView;
        if (this.timerBadge.getVisibility() != 8) {
        }
        LayoutExtKt.layoutRightTop(this.infoBtn, getMeasuredWidth() - i132, i12);
    }

    private final void layoutInfoText() {
        if (this.infoText.getVisibility() == 8) {
            return;
        }
        int i11 = paddingHorizontalOfView;
        if (this.infoBtn.getVisibility() != 8) {
            i11 += infoBtnSize + marginRightInfoText;
        }
        LayoutExtKt.layoutRightTop(this.infoText, getMeasuredWidth() - i11, paddingTopOfInfoText);
    }

    private final void layoutMoreBadge() {
        if (this.timerBadge.getVisibility() == 8) {
            return;
        }
        LayoutExtKt.layoutRightTop(this.timerBadge, getMeasuredWidth() - paddingHorizontalOfView, this.subtitleTv.getVisibility() == 8 ? paddingTopOfView : paddingTopOfView + marginTopBadge);
    }

    private final void layoutSubtitle() {
        if (this.subtitleTv.getVisibility() == 8) {
            return;
        }
        int i11 = paddingHorizontalOfView;
        if (this.timerBadge.getVisibility() != 8) {
            this.timerBadge.getMeasuredWidth();
        }
        if (this.infoBtn.getVisibility() != 8) {
            this.infoBtn.getMeasuredWidth();
        }
        if (this.timerBadge.getVisibility() == 8) {
            this.infoBtn.getVisibility();
        }
        if (this.timerBadge.getVisibility() != 8) {
            this.infoBtn.getVisibility();
        }
        LayoutExtKt.layoutLeftTop(this.subtitleTv, i11, this.titleTv.getMeasuredHeight() + paddingTopOfView);
    }

    private final void layoutTitle() {
        if (this.titleTv.getVisibility() == 8) {
            return;
        }
        int i11 = paddingHorizontalOfView;
        if (this.timerBadge.getVisibility() != 8) {
            this.timerBadge.getMeasuredWidth();
        }
        if (this.infoBtn.getVisibility() != 8) {
            this.infoBtn.getMeasuredWidth();
        }
        if (this.infoText.getVisibility() != 8) {
            this.infoText.getMeasuredWidth();
        }
        if (this.timerBadge.getVisibility() == 8 && this.infoBtn.getVisibility() == 8) {
            this.infoText.getVisibility();
        }
        if ((this.timerBadge.getVisibility() == 8 || this.infoBtn.getVisibility() == 8) && this.infoBtn.getVisibility() != 8) {
            this.infoText.getVisibility();
        }
        LayoutExtKt.layoutLeftTop(this.titleTv, i11, paddingTopOfView);
    }

    private final void measureInfoBtn() {
        if (this.infoBtn.getVisibility() == 8) {
            return;
        }
        IconButtonV3View iconButtonV3View = this.infoBtn;
        int i11 = infoBtnSize;
        MeasureExtKt.measureExactly(iconButtonV3View, i11, i11);
    }

    private final void measureInfoText() {
        if (this.infoText.getVisibility() == 8) {
            return;
        }
        MeasureExtKt.measureUnspecified(this.infoText);
    }

    private final void measureSubtitle(int fullContentWidth) {
        if (this.subtitleTv.getVisibility() == 8) {
            return;
        }
        int measuredWidth = this.timerBadge.getVisibility() == 8 ? 0 : this.timerBadge.getMeasuredWidth();
        if (this.infoBtn.getVisibility() != 8) {
            measuredWidth += this.infoBtn.getMeasuredWidth();
        }
        if (this.timerBadge.getVisibility() != 8 || this.infoBtn.getVisibility() != 8) {
            measuredWidth += marginLeftInfoIcon;
        }
        if (this.timerBadge.getVisibility() != 8 && this.infoBtn.getVisibility() != 8) {
            measuredWidth += marginRightInfoIcon;
        }
        MeasureExtKt.measureAtMost(this.subtitleTv, fullContentWidth - measuredWidth, headerHeightMin);
    }

    private final void measureTimerBadge() {
        if (this.timerBadge.getVisibility() == 8) {
            return;
        }
        MeasureExtKt.measure(this.timerBadge, 0, 0, infoBtnSize, 1073741824);
    }

    private final void measureTitle(int fullContentWidth) {
        if (this.titleTv.getVisibility() == 8) {
            return;
        }
        int measuredWidth = this.timerBadge.getVisibility() == 8 ? 0 : this.timerBadge.getMeasuredWidth();
        if (this.infoBtn.getVisibility() != 8) {
            measuredWidth += this.infoBtn.getMeasuredWidth();
        }
        if (this.infoText.getVisibility() != 8) {
            measuredWidth += this.infoText.getMeasuredWidth();
        }
        if (this.timerBadge.getVisibility() != 8 || this.infoBtn.getVisibility() != 8 || this.infoText.getVisibility() != 8) {
            measuredWidth += marginLeftInfoIcon;
        }
        if (this.timerBadge.getVisibility() != 8 && this.infoBtn.getVisibility() != 8) {
            measuredWidth += marginRightInfoIcon;
        }
        if (this.infoBtn.getVisibility() != 8 && this.infoText.getVisibility() != 8) {
            measuredWidth += marginRightInfoText;
        }
        MeasureExtKt.measureAtMost(this.titleTv, fullContentWidth - measuredWidth, headerHeightMin);
        setGradient(this.currentGradientTitleVO);
    }

    private final void setContainerStyle() {
        int i11 = paddingHorizontalOfView;
        setPadding(i11, paddingTopOfView, i11, 0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ResourceExtKt.color(context, R$color.layer_floor_1));
    }

    private final void setGradient(GradientTitleVO gradientTitleVO) {
        if (gradientTitleVO == null) {
            this.titleTv.getPaint().setShader(null);
            return;
        }
        if (this.titleGradient == null) {
            this.titleGradient = new LinearGradient(0.0f, 0.0f, this.titleTv.getMeasuredWidth(), this.titleTv.getTextSize(), C7714v.T0(gradientTitleVO.getGradient()), gradientPosition, Shader.TileMode.CLAMP);
        }
        this.titleTv.getPaint().setShader(this.titleGradient);
    }

    public final void bindTitle$marketing_prodGoogleAllVendorsRelease(@NotNull GradientTitleVO gradientTitleVO) {
        Intrinsics.checkNotNullParameter(gradientTitleVO, "gradientTitleVO");
        if (!Intrinsics.d(this.currentGradientTitleVO, gradientTitleVO)) {
            this.titleGradient = null;
            this.currentGradientTitleVO = gradientTitleVO;
        }
        this.titleTv.setText(gradientTitleVO.getText());
    }

    @NotNull
    public final IconButtonV3View getInfoBtn() {
        return this.infoBtn;
    }

    @NotNull
    public final TextAtomV2View getInfoText() {
        return this.infoText;
    }

    @NotNull
    public final TextAtomV2View getSubtitleTv() {
        return this.subtitleTv;
    }

    @NotNull
    public final HammersV3HeaderBadge getTimerBadge() {
        return this.timerBadge;
    }

    @NotNull
    public final TextAtomV2View getTitleTv() {
        return this.titleTv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        layoutMoreBadge();
        layoutInfoBtn();
        layoutInfoText();
        layoutTitle();
        layoutSubtitle();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i11 = paddingHorizontalOfView;
        int i12 = size - (i11 * 2);
        measureInfoBtn();
        measureTimerBadge();
        measureInfoText();
        measureTitle(i12);
        measureSubtitle(i12);
        setMeasuredDimension((i11 * 2) + i12, this.subtitleTv.getVisibility() == 8 ? headerHeightMin : headerHeightMax);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersV3GradientHeaderView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i14 = 0;
        int i15 = 0;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, attributeSet2, i14, i15, i13, defaultConstructorMarker);
        iconButtonV3View.setId(R$id.infoBtn);
        addView(iconButtonV3View);
        this.infoBtn = iconButtonV3View;
        HammersV3HeaderBadge hammersV3HeaderBadge = new HammersV3HeaderBadge(context, attributeSet2, i14, i15, i13, defaultConstructorMarker);
        hammersV3HeaderBadge.setId(R$id.hammersGradientTimerBadge);
        addView(hammersV3HeaderBadge);
        this.timerBadge = hammersV3HeaderBadge;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.headerTitleTv);
        textAtomV2View.setSingleLine();
        textAtomV2View.setTextIsSelectable(false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textAtomV2View.setEllipsize(truncateAt);
        textAtomV2View.setTextAppearance(R$style.OzonTextAppearance_Headline_500medium);
        addView(textAtomV2View);
        this.titleTv = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.headerSubtitleTv);
        textAtomV2View2.setSingleLine();
        textAtomV2View2.setEllipsize(truncateAt);
        textAtomV2View2.setTextIsSelectable(false);
        textAtomV2View2.setTextAppearance(R$style.OzonTextAppearance_BodyControl_400small);
        addView(textAtomV2View2);
        this.subtitleTv = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View3.setId(R$id.infoTv);
        textAtomV2View3.setSingleLine();
        textAtomV2View3.setTextIsSelectable(false);
        addView(textAtomV2View3);
        this.infoText = textAtomV2View3;
        setContainerStyle();
    }
}
