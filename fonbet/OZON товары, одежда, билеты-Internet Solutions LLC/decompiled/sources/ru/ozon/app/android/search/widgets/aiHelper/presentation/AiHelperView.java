package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import Bi.b;
import D40.d;
import Kk.C3531a;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.widgets.aiHelper.presentation.AiHelperVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u0006/"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO;Lkotlin/jvm/functions/Function1;)V", "changeLikeIconState", "()V", "changeDislikeIconState", "backgroundColor", "I", "likeBackground", "likeIconBackground", "dislikeBackground", "dislikeIconBackground", "transparentColor", "mainTextColor", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subTitleView", "Landroidx/appcompat/widget/AppCompatTextView;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "likeView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "dislikeView", "restartView", "infoView", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiHelperView extends ConstraintLayout {
    private final int backgroundColor;
    private final int dislikeBackground;
    private final int dislikeIconBackground;

    @NotNull
    private final IconButtonV3View dislikeView;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final IconButtonV3View infoView;
    private final int likeBackground;
    private final int likeIconBackground;

    @NotNull
    private final IconButtonV3View likeView;
    private final int mainTextColor;

    @NotNull
    private final IconButtonV3View restartView;

    @NotNull
    private final TextAtomV2View subTitleView;

    @NotNull
    private final AppCompatTextView textView;

    @NotNull
    private final TextAtomV2View titleView;
    private final int transparentColor;
    public static final int $stable = 8;
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int dp16 = ResourceExtKt.toPx(16);

    public /* synthetic */ AiHelperView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull AiHelperVO item, Function1<? super AtomAction, Unit> onAction) {
        TestInfo testInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        AiHelperVO.HeaderVO header = item.getHeader();
        IconHolderKt.bind$default(this.iconView, header.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, header.getTitle(), null, 2, null);
        TextAtomV2View textAtomV2View = this.subTitleView;
        TextDTO thinkingSubtitle = header.getThinkingSubtitle();
        if (thinkingSubtitle == null) {
            thinkingSubtitle = header.getReadySubtitle();
        }
        TextHolderKt.bindOrGone$default(textAtomV2View, thinkingSubtitle, null, 2, null);
        IconButtonV3View iconButtonV3View = this.likeView;
        AiHelperVO.FooterVO footer = item.getFooter();
        IconButtonV3HolderKt.bindOrGone(iconButtonV3View, footer != null ? footer.getLikeButton() : null, onAction);
        IconButtonV3View iconButtonV3View2 = this.dislikeView;
        AiHelperVO.FooterVO footer2 = item.getFooter();
        IconButtonV3HolderKt.bindOrGone(iconButtonV3View2, footer2 != null ? footer2.getDislikeButton() : null, onAction);
        IconButtonV3View iconButtonV3View3 = this.restartView;
        AiHelperVO.FooterVO footer3 = item.getFooter();
        IconButtonV3HolderKt.bindOrGone(iconButtonV3View3, footer3 != null ? footer3.getRestartButton() : null, onAction);
        IconButtonV3View iconButtonV3View4 = this.infoView;
        AiHelperVO.FooterVO footer4 = item.getFooter();
        IconButtonV3HolderKt.bindOrGone(iconButtonV3View4, footer4 != null ? footer4.getInfoButton() : null, onAction);
        boolean z11 = true;
        this.likeView.setEnabled(true);
        this.dislikeView.setEnabled(true);
        AppCompatTextView appCompatTextView = this.textView;
        AiHelperVO.AiTextBlockVO aiTextBlock = item.getAiTextBlock();
        OzonSpannableString aiText = aiTextBlock != null ? aiTextBlock.getAiText() : null;
        if (aiText != null && aiText.length() != 0) {
            z11 = false;
        }
        appCompatTextView.setVisibility(z11 ? 8 : 0);
        AiHelperVO.AiTextBlockVO aiTextBlock2 = item.getAiTextBlock();
        appCompatTextView.setText(aiTextBlock2 != null ? aiTextBlock2.getAiText() : null);
        AiHelperVO.AiTextBlockVO aiTextBlock3 = item.getAiTextBlock();
        appCompatTextView.setContentDescription((aiTextBlock3 == null || (testInfo = aiTextBlock3.getTestInfo()) == null) ? null : testInfo.getAutomatizationId());
        TestInfo testInfo2 = item.getTestInfo();
        setContentDescription(testInfo2 != null ? testInfo2.getAutomatizationId() : null);
    }

    public final void changeDislikeIconState() {
        if (this.dislikeView.isEnabled()) {
            IconButtonV3View iconButtonV3View = this.dislikeView;
            iconButtonV3View.setIconColor(this.dislikeIconBackground);
            iconButtonV3View.setBackColor(new Color.Solid(this.dislikeBackground));
            iconButtonV3View.setEnabled(false);
            IconButtonV3View iconButtonV3View2 = this.likeView;
            iconButtonV3View2.setDisabled(true);
            iconButtonV3View2.setEnabled(false);
            iconButtonV3View2.setBackColor(new Color.Solid(this.transparentColor));
        }
    }

    public final void changeLikeIconState() {
        if (this.likeView.isEnabled()) {
            IconButtonV3View iconButtonV3View = this.likeView;
            iconButtonV3View.setIconColor(this.likeIconBackground);
            iconButtonV3View.setBackColor(new Color.Solid(this.likeBackground));
            iconButtonV3View.setEnabled(false);
            IconButtonV3View iconButtonV3View2 = this.dislikeView;
            iconButtonV3View2.setDisabled(true);
            iconButtonV3View2.setEnabled(false);
            iconButtonV3View2.setBackColor(new Color.Solid(this.transparentColor));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiHelperView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        this.likeBackground = a.getColor(context, R$color.bg_positive_secondary);
        this.likeIconBackground = a.getColor(context, R$color.graphic_positive_primary);
        this.dislikeBackground = a.getColor(context, R$color.bg_negative_secondary);
        this.dislikeIconBackground = a.getColor(context, R$color.graphic_negative_primary);
        this.transparentColor = a.getColor(context, R.color.transparent);
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.textPrimary);
        this.mainTextColor = themeColor2;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.aiHeaderIcon, -2, -2);
        a11.f41656t = 0;
        a11.f41636i = 0;
        iconView.setLayoutParams(a11);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.aiHeaderTitle, -2, -2);
        d11.f41655s = R$id.aiHeaderIcon;
        d11.f41636i = 0;
        int i13 = dp12;
        d11.setMarginStart(i13);
        textAtomV2View.setLayoutParams(d11);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.aiHeaderSubtitle, -2, -2);
        int i14 = R$id.aiHeaderTitle;
        d12.f41656t = i14;
        d12.f41638j = i14;
        textAtomV2View2.setLayoutParams(d12);
        this.subTitleView = textAtomV2View2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.aiText);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.f41656t = 0;
        bVar.f41638j = R$id.aiHeaderIcon;
        int i15 = dp4;
        bVar.setMarginStart(i15);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dp16;
        appCompatTextView.setLayoutParams(bVar);
        appCompatTextView.setTextColor(themeColor2);
        ViewExtKt.gone(appCompatTextView);
        this.textView = appCompatTextView;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.aiFooterLikeIcon, -2, -2);
        c11.f41656t = 0;
        c11.f41638j = R$id.aiText;
        int i16 = dp8;
        ((ViewGroup.MarginLayoutParams) c11).topMargin = i16;
        iconButtonV3View.setLayoutParams(c11);
        ViewExtKt.gone(iconButtonV3View);
        this.likeView = iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c12 = d.c(iconButtonV3View2, R$id.aiFooterDislikeIcon, -2, -2);
        c12.f41655s = R$id.aiFooterLikeIcon;
        c12.f41638j = R$id.aiText;
        ((ViewGroup.MarginLayoutParams) c12).topMargin = i16;
        c12.setMarginStart(i15);
        iconButtonV3View2.setLayoutParams(c12);
        ViewExtKt.gone(iconButtonV3View2);
        this.dislikeView = iconButtonV3View2;
        IconButtonV3View iconButtonV3View3 = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c13 = d.c(iconButtonV3View3, R$id.aiFooterRestartIcon, -2, -2);
        c13.f41655s = R$id.aiFooterDislikeIcon;
        c13.f41638j = R$id.aiText;
        ((ViewGroup.MarginLayoutParams) c13).topMargin = i16;
        c13.setMarginStart(i15);
        iconButtonV3View3.setLayoutParams(c13);
        ViewExtKt.gone(iconButtonV3View3);
        this.restartView = iconButtonV3View3;
        IconButtonV3View iconButtonV3View4 = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c14 = d.c(iconButtonV3View4, R$id.aiFooterInfoIcon, -2, -2);
        c14.f41655s = R$id.aiFooterRestartIcon;
        c14.f41638j = R$id.aiText;
        ((ViewGroup.MarginLayoutParams) c14).topMargin = i16;
        c14.setMarginStart(i15);
        iconButtonV3View4.setLayoutParams(c14);
        ViewExtKt.gone(iconButtonV3View4);
        this.infoView = iconButtonV3View4;
        setId(R$id.aiHelperView);
        setBackgroundColor(themeColor);
        setPadding(i16, i16, i13, i16);
        addView(iconView);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(appCompatTextView);
        addView(iconButtonV3View);
        addView(iconButtonV3View2);
        addView(iconButtonV3View3);
        addView(iconButtonV3View4);
    }
}
