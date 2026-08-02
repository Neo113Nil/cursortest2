package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation;

import Vg.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.oldwidgets.databinding.ItemTravelPriceDetailInformationBinding;
import ru.ozon.app.android.travel.feature.oldwidgets.databinding.WidgetTravelPriceDetailInformationBinding;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.TravelPriceDetailInformationVO;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObserver;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00160)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;", "widgetVisibilityObserver", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;)V", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO$PriceVO;", "prices", "Landroid/view/ViewGroup;", "container", "", "inflateAndBindPrices", "(Ljava/util/List;Landroid/view/ViewGroup;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO;Ll20/d;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetTravelPriceDetailInformationBinding;", "binding", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetTravelPriceDetailInformationBinding;", "", "priceItemTopMargin", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationWidgetViewHolder extends k<TravelPriceDetailInformationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelPriceDetailInformationBinding binding;
    private final int priceItemTopMargin;

    @NotNull
    private final WidgetVisibilityObserver widgetVisibilityObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationWidgetViewHolder(@NotNull View containerView, @NotNull WidgetVisibilityObserver widgetVisibilityObserver, @NotNull ComposerReferences references, @NotNull HandlersInhibitor handlersInhibitor, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(widgetVisibilityObserver, "widgetVisibilityObserver");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.widgetVisibilityObserver = widgetVisibilityObserver;
        WidgetTravelPriceDetailInformationBinding bind = WidgetTravelPriceDetailInformationBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.priceItemTopMargin = ResourceExtKt.toPx(16, getContext());
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelPriceDetailInformationWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    private final void inflateAndBindPrices(List<TravelPriceDetailInformationVO.PriceVO> prices, ViewGroup container) {
        for (TravelPriceDetailInformationVO.PriceVO priceVO : prices) {
            ItemTravelPriceDetailInformationBinding inflate = ItemTravelPriceDetailInformationBinding.inflate(LayoutInflater.from(getContext()), container, true);
            ConstraintLayout constraintLayout = inflate.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = this.priceItemTopMargin;
            constraintLayout.setLayoutParams(marginLayoutParams);
            inflate.priceTitleTV.setText(priceVO.getTitle());
            inflate.priceTV.setText(priceVO.getPrice());
            inflate.priceDetailsBtn.bindOrGone(priceVO.getDetailsButton(), this.actionHandler);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.widgetVisibilityObserver.onVisibilityChanged(true);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        this.widgetVisibilityObserver.onVisibilityChanged(false);
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPriceDetailInformationVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.titleTV.setText(item.getTitle());
        TextView subtitleTV = this.binding.subtitleTV;
        Intrinsics.checkNotNullExpressionValue(subtitleTV, "subtitleTV");
        TextViewExtKt.setTextOrGone(subtitleTV, item.getSubtitle());
        this.binding.pricesContainerLL.removeAllViews();
        List<TravelPriceDetailInformationVO.PriceVO> prices = item.getPrices();
        LinearLayout pricesContainerLL = this.binding.pricesContainerLL;
        Intrinsics.checkNotNullExpressionValue(pricesContainerLL, "pricesContainerLL");
        inflateAndBindPrices(prices, pricesContainerLL);
        this.binding.totalPriceTitleTV.setText(item.getTotalPriceTitle());
        this.binding.totalPriceTV.setText(item.getTotalPrice());
        SmallIconButtonView infoButton = this.binding.infoButton;
        Intrinsics.checkNotNullExpressionValue(infoButton, "infoButton");
        WrappedIconButtonHolderKt.bindOrGone(infoButton, item.getPriceInfoButton(), this.actionHandler);
        LargeButtonView largeButton = this.binding.largeButton;
        Intrinsics.checkNotNullExpressionValue(largeButton, "largeButton");
        LargeButtonHolderKt.bind(largeButton, item.getLargeButton(), this.actionHandler);
        TextAtomView priceDetailAdditionalInfoTextView = this.binding.priceDetailAdditionalInfoTextView;
        Intrinsics.checkNotNullExpressionValue(priceDetailAdditionalInfoTextView, "priceDetailAdditionalInfoTextView");
        TextAtomHolderKt.bindOrGone(priceDetailAdditionalInfoTextView, item.getAgreementText(), this.actionHandler);
        View separatorBonusView = this.binding.separatorBonusView;
        Intrinsics.checkNotNullExpressionValue(separatorBonusView, "separatorBonusView");
        separatorBonusView.setVisibility(item.getIsSeparatorVisible() ? 0 : 8);
        BadgeView bonusBtn = this.binding.bonusBtn;
        Intrinsics.checkNotNullExpressionValue(bonusBtn, "bonusBtn");
        BadgeHolderKt.bindOrGone(bonusBtn, item.getBonusButton(), this.actionHandler);
    }
}
