package ru.ozon.app.android.marketing.widgets.actionProgress.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$dimen;
import ru.ozon.app.android.marketing.databinding.WidgetActionProgressBinding;
import ru.ozon.app.android.marketing.widgets.actionProgress.presentation.ActionProgressVO;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0019\u0010&\u001a\u0004\u0018\u00010\u001d2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020(H\u0002J\u0017\u0010-\u001a\u0004\u0018\u00010\u001d2\u0006\u0010.\u001a\u00020/H\u0002¢\u0006\u0002\u00100J\u0019\u00101\u001a\u0004\u0018\u00010\u001d2\b\u00102\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013¨\u00064"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressBinder;", "", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetActionProgressBinding;", "cardView", "Landroidx/cardview/widget/CardView;", "<init>", "(Lru/ozon/app/android/marketing/databinding/WidgetActionProgressBinding;Landroidx/cardview/widget/CardView;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "isMiniWidget", "", "progressTextColor", "", "horizontalMargin", "", "getHorizontalMargin", "()I", "miniWidgetHorizontalMargin", "getMiniWidgetHorizontalMargin", "cornerRadius", "", "getCornerRadius", "()F", "miniWidgetBgColor", "getMiniWidgetBgColor", "onAttach", "", "setIsMiniWidget", "bind", "item", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;", "bindMiniWidget", "updateProgressTextColor", "updateMiniWidgetBgColor", "setMiniWidgetMargins", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lkotlin/Unit;", "bindProgressText", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "progressText", "bindProgress", "progress", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;", "(Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;)Lkotlin/Unit;", "bindSubtitle", "subTitle", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionProgressBinder {

    @NotNull
    private final WidgetActionProgressBinding binding;

    @NotNull
    private final CardView cardView;
    private final Context context;
    private boolean isMiniWidget;
    private String progressTextColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float miniCardBxRadius = ResourceExtKt.toPxF(12);
    private static final float miniCardSelectRadius = ResourceExtKt.toPxF(20);
    private static final int spaceTopMargin = ResourceExtKt.toPx(6);
    private static final int bxHorizontalMargin = ResourceExtKt.toPx(7);
    private static final int selectHorizontalMargin = ResourceExtKt.toPx(14);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressBinder$Companion;", "", "<init>", "()V", "MINI_CARD_ELEVATION", "", "miniCardBxRadius", "miniCardSelectRadius", "spaceTopMargin", "", "bxHorizontalMargin", "selectHorizontalMargin", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ActionProgressBinder(@NotNull WidgetActionProgressBinding binding, @NotNull CardView cardView) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        this.binding = binding;
        this.cardView = cardView;
        this.context = cardView.getContext();
    }

    private final void bindMiniWidget() {
        if (this.isMiniWidget) {
            WidgetActionProgressBinding widgetActionProgressBinding = this.binding;
            TextAtomView actionProgressTitle = widgetActionProgressBinding.actionProgressTitle;
            Intrinsics.checkNotNullExpressionValue(actionProgressTitle, "actionProgressTitle");
            actionProgressTitle.setVisibility(8);
            TextAtomView actionProgressSubtitle = widgetActionProgressBinding.actionProgressSubtitle;
            Intrinsics.checkNotNullExpressionValue(actionProgressSubtitle, "actionProgressSubtitle");
            actionProgressSubtitle.setVisibility(8);
            updateMiniWidgetBgColor();
            GradientProgressBar actionProgressProgressBar = widgetActionProgressBinding.actionProgressProgressBar;
            Intrinsics.checkNotNullExpressionValue(actionProgressProgressBar, "actionProgressProgressBar");
            ViewGroup.LayoutParams layoutParams = actionProgressProgressBar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = getHorizontalMargin();
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = getHorizontalMargin();
            actionProgressProgressBar.setLayoutParams(bVar);
            AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            if (appTypeResolver.isSelect(context)) {
                Space space = widgetActionProgressBinding.space;
                Intrinsics.checkNotNullExpressionValue(space, "space");
                ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                ((ViewGroup.MarginLayoutParams) bVar2).topMargin = spaceTopMargin;
                space.setLayoutParams(bVar2);
            }
        }
    }

    private final Unit bindProgress(ActionProgressVO.Progress progress) {
        String colorEnd;
        WidgetActionProgressBinding widgetActionProgressBinding = this.binding;
        String colorStart = progress.getColorStart();
        if (colorStart != null && (colorEnd = progress.getColorEnd()) != null) {
            widgetActionProgressBinding.actionProgressProgressBar.setGradient(colorStart, colorEnd);
        }
        String backgroundColor = progress.getBackgroundColor();
        if (backgroundColor != null) {
            widgetActionProgressBinding.actionProgressProgressBar.setFillColor(backgroundColor);
        }
        Long percent = progress.getPercent();
        if (percent == null) {
            return null;
        }
        widgetActionProgressBinding.actionProgressProgressBar.setProgress((int) percent.longValue());
        return Unit.f71690a;
    }

    private final TextAtomView bindProgressText(TextAtom progressText) {
        WidgetActionProgressBinding widgetActionProgressBinding = this.binding;
        this.progressTextColor = progressText.getTextColor();
        TextAtomView textAtomView = widgetActionProgressBinding.actionProgressProgressText;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, progressText, null, 2, null);
        textAtomView.setLetterSpacing(0.0f);
        Intrinsics.checkNotNullExpressionValue(textAtomView, "with(...)");
        return textAtomView;
    }

    private final Unit bindSubtitle(TextAtom subTitle) {
        WidgetActionProgressBinding widgetActionProgressBinding = this.binding;
        if (subTitle == null) {
            return null;
        }
        TextAtomView actionProgressSubtitle = widgetActionProgressBinding.actionProgressSubtitle;
        Intrinsics.checkNotNullExpressionValue(actionProgressSubtitle, "actionProgressSubtitle");
        TextAtomHolderKt.bind$default(actionProgressSubtitle, subTitle, null, 2, null);
        return Unit.f71690a;
    }

    private final Unit bindTitle(TextAtom title) {
        WidgetActionProgressBinding widgetActionProgressBinding = this.binding;
        if (title == null) {
            return null;
        }
        TextAtomView actionProgressTitle = widgetActionProgressBinding.actionProgressTitle;
        Intrinsics.checkNotNullExpressionValue(actionProgressTitle, "actionProgressTitle");
        TextAtomHolderKt.bind$default(actionProgressTitle, title, null, 2, null);
        return Unit.f71690a;
    }

    private final float getCornerRadius() {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return appTypeResolver.isSelect(context) ? miniCardSelectRadius : miniCardBxRadius;
    }

    private final int getHorizontalMargin() {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return appTypeResolver.isSelect(context) ? selectHorizontalMargin : bxHorizontalMargin;
    }

    private final int getMiniWidgetBgColor() {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (!appTypeResolver.isSelect(context)) {
            return this.context.getColor(R$color.layer_floor_1);
        }
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        return ThemeExtKt.themeColor(context2, R$attr.bgDarkKey);
    }

    private final int getMiniWidgetHorizontalMargin() {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return appTypeResolver.isSelect(context) ? R$dimen.mini_widget_margin : R$dimen.mini_widget_horizontal_margin;
    }

    private final void setMiniWidgetMargins() {
        CardView cardView = this.cardView;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        marginLayoutParams.leftMargin = ResourceExtKt.dim(context, getMiniWidgetHorizontalMargin());
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        marginLayoutParams.rightMargin = ResourceExtKt.dim(context2, getMiniWidgetHorizontalMargin());
        Context context3 = this.context;
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        marginLayoutParams.topMargin = ResourceExtKt.dim(context3, R$dimen.mini_widget_margin);
        Context context4 = this.context;
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        marginLayoutParams.bottomMargin = ResourceExtKt.dim(context4, R$dimen.mini_widget_horizontal_margin);
        cardView.setLayoutParams(marginLayoutParams);
    }

    private final void updateMiniWidgetBgColor() {
        this.cardView.setCardBackgroundColor(getMiniWidgetBgColor());
    }

    private final void updateProgressTextColor() {
        String str = this.progressTextColor;
        if (str != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            this.binding.actionProgressProgressText.setTextColorOrDefault(styleParser.parseColor(context, str));
        }
    }

    public final void bind(@NotNull ActionProgressVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindTitle(item.getTitle());
        bindProgressText(item.getProgressText());
        bindProgress(item.getProgress());
        bindSubtitle(item.getSubtitle());
        bindMiniWidget();
    }

    public final void onAttach() {
        if (this.isMiniWidget) {
            updateMiniWidgetBgColor();
            updateProgressTextColor();
        }
    }

    public final void setIsMiniWidget() {
        this.isMiniWidget = true;
        this.cardView.setElevation(10.0f);
        this.cardView.setRadius(getCornerRadius());
        setMiniWidgetMargins();
    }
}
