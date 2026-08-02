package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation;

import DN.a;
import DN.b;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.OrderCalculatorVO;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.adapter.BoxCardsAdapter;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.layoutManager.OrderCalculatorBoxesLayoutManager;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view.OrderCalculatorView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 N2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001NB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u0012J'\u00104\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010*\u001a\u0002012\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010*\u001a\u000201H\u0014¢\u0006\u0004\b4\u00106J)\u0010;\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00100A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00100A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010K¨\u0006O"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/OrderCalculatorView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/OrderCalculatorView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "", "setupRegionViews", "()V", "setupBoxCardsRv", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;", "item", "", "isSourceChanged", "isDestinationChanged", "updateRegions", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;ZZ)V", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;", "sourceVO", "bindSource", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$TextFieldVO;)V", "destinationVO", "bindDestination", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "bindSwapButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "boxCards", "updateBoxCards", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "info", "bindInfo", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "bindCreateOrderButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "cancelAnimators", "Ll20/d;", "", "payload", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/OrderCalculatorView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "swapButtonActionHandler", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter;", "boxCardsAdapter", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter;", "Landroid/animation/AnimatorSet;", "swapRegionsAnimator", "Landroid/animation/AnimatorSet;", "showSourceTextAnimator", "showDestinationTextAnimator", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderCalculatorWidgetViewHolder extends k<OrderCalculatorVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BoxCardsAdapter boxCardsAdapter;

    @NotNull
    private final OrderCalculatorView containerView;

    @NotNull
    private final ComposerReferences refs;
    private AnimatorSet showDestinationTextAnimator;
    private AnimatorSet showSourceTextAnimator;

    @NotNull
    private final Function1<AtomAction, Unit> swapButtonActionHandler;
    private AnimatorSet swapRegionsAnimator;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int lastBoxSpacing = ResourceExtKt.toPx(16);
    private static final int horizontalBoxSpacing = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorWidgetViewHolder$Companion;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCalculatorWidgetViewHolder(@NotNull OrderCalculatorView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new OrderCalculatorWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.swapButtonActionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new OrderCalculatorWidgetViewHolder$swapButtonActionHandler$1(this)).customActionHandlers(new OrderCalculatorWidgetViewHolder$swapButtonActionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        this.boxCardsAdapter = new BoxCardsAdapter(buildHandler, tokenizedAnalytics, this);
        setupRegionViews();
        setupBoxCardsRv();
    }

    private final void bindCreateOrderButton(ButtonV3DTO item) {
        ButtonV3HolderKt.bind(this.containerView.getCreateOrderButton(), item, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindDestination(OrderCalculatorVO.TextFieldVO destinationVO) {
        this.containerView.bindDestination(destinationVO.getText(), this.actionHandler);
    }

    private final void bindInfo(TextDTO info) {
        TextHolderKt.bindOrGone$default(this.containerView.getInfoTv(), info, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSource(OrderCalculatorVO.TextFieldVO sourceVO) {
        this.containerView.bindSource(sourceVO.getText(), this.actionHandler);
    }

    private final void bindSwapButton(IconButtonV3DTO item) {
        this.containerView.bindSwapButton(item, this.swapButtonActionHandler);
    }

    private final void cancelAnimators() {
        AnimatorSet animatorSet = this.showSourceTextAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.showSourceTextAnimator = null;
        AnimatorSet animatorSet2 = this.showDestinationTextAnimator;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.showDestinationTextAnimator = null;
        AnimatorSet animatorSet3 = this.swapRegionsAnimator;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.swapRegionsAnimator = null;
    }

    private final void setupBoxCardsRv() {
        RecyclerView boxCardsRv = this.containerView.getBoxCardsRv();
        boxCardsRv.setRecycledViewPool(this.refs.getComposerViewPoolProvider().getViewPool());
        int i11 = lastBoxSpacing;
        boxCardsRv.addItemDecoration(new HorizontalSpacingBoxCardsDecoration(i11, i11, horizontalBoxSpacing, 0));
        Context context = boxCardsRv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boxCardsRv.setLayoutManager(new OrderCalculatorBoxesLayoutManager(context));
        boxCardsRv.setAdapter(this.boxCardsAdapter);
        boxCardsRv.setOverScrollMode(2);
    }

    private final void setupRegionViews() {
        this.containerView.getViewRegions().getSourceTv().setOnClickListener(new a(this, 8));
        this.containerView.getViewRegions().getDestinationTv().setOnClickListener(new b(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRegionViews$lambda$0(OrderCalculatorWidgetViewHolder orderCalculatorWidgetViewHolder, View view) {
        OrderCalculatorVO.RegionsVO regions;
        OrderCalculatorVO.TextFieldVO source;
        CommonControlSettings common;
        AtomAction atomAction$default;
        OrderCalculatorVO boundData = orderCalculatorWidgetViewHolder.getBoundData();
        if (boundData == null || (regions = boundData.getRegions()) == null || (source = regions.getSource()) == null || (common = source.getCommon()) == null || (atomAction$default = CommonControlSettingsExtKt.atomAction$default(common, null, 1, null)) == null) {
            return;
        }
        orderCalculatorWidgetViewHolder.actionHandler.invoke(atomAction$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRegionViews$lambda$2(OrderCalculatorWidgetViewHolder orderCalculatorWidgetViewHolder, View view) {
        OrderCalculatorVO.RegionsVO regions;
        OrderCalculatorVO.TextFieldVO destination;
        CommonControlSettings common;
        AtomAction atomAction$default;
        OrderCalculatorVO boundData = orderCalculatorWidgetViewHolder.getBoundData();
        if (boundData == null || (regions = boundData.getRegions()) == null || (destination = regions.getDestination()) == null || (common = destination.getCommon()) == null || (atomAction$default = CommonControlSettingsExtKt.atomAction$default(common, null, 1, null)) == null) {
            return;
        }
        orderCalculatorWidgetViewHolder.actionHandler.invoke(atomAction$default);
    }

    private final void updateBoxCards(List<BoxCardVO> boxCards) {
        this.boxCardsAdapter.submitList(boxCards);
        this.containerView.scrollToSelectedBox(boxCards);
    }

    private final void updateRegions(OrderCalculatorVO.RegionsVO item, boolean isSourceChanged, boolean isDestinationChanged) {
        if (isSourceChanged) {
            AnimatorSet animatorSet = this.showSourceTextAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.showSourceTextAnimator = this.containerView.updateSourceWithFade(new OrderCalculatorWidgetViewHolder$updateRegions$1(this, item));
        } else {
            bindSource(item.getSource());
        }
        if (!isDestinationChanged) {
            bindDestination(item.getDestination());
            return;
        }
        AnimatorSet animatorSet2 = this.showDestinationTextAnimator;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.showDestinationTextAnimator = this.containerView.updateDestinationWithFade(new OrderCalculatorWidgetViewHolder$updateRegions$2(this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        cancelAnimators();
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderCalculatorVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((OrderCalculatorWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderCalculatorVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof OrderCalculatorPayload) {
            OrderCalculatorPayload orderCalculatorPayload = (OrderCalculatorPayload) payload;
            if (orderCalculatorPayload.areRegionsSwapped()) {
                AnimatorSet animatorSet = this.swapRegionsAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.swapRegionsAnimator = this.containerView.swapRegions(new OrderCalculatorWidgetViewHolder$bind$1(this, item), new OrderCalculatorWidgetViewHolder$bind$2(this, item));
            } else if (orderCalculatorPayload.areRegionsChanged()) {
                updateRegions(item.getRegions(), orderCalculatorPayload.isSourceChanged(), orderCalculatorPayload.isDestinationChanged());
            }
            this.containerView.bindBackground(item.getTopPatchColor(), item.getBackgroundColor());
            bindSwapButton(item.getRegions().getSwapButton());
            updateBoxCards(item.getBoxCards());
            bindInfo(item.getInfoText());
            bindCreateOrderButton(item.getCreateOrderButton());
            return;
        }
        super.bind((OrderCalculatorWidgetViewHolder) item, info, payload);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderCalculatorVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bindBackground(item.getTopPatchColor(), item.getBackgroundColor());
        bindSource(item.getRegions().getSource());
        bindDestination(item.getRegions().getDestination());
        bindSwapButton(item.getRegions().getSwapButton());
        updateBoxCards(item.getBoxCards());
        bindInfo(item.getInfoText());
        bindCreateOrderButton(item.getCreateOrderButton());
    }
}
