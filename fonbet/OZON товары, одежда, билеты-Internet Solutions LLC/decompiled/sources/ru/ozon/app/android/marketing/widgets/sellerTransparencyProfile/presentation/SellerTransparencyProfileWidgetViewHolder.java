package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.o;
import Vg.d;
import W10.c;
import WZ.t;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetSellerTransparencyProfileBinding;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SubscribeEvent;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.v3.containers.RecyclerContainer;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00104\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerTransparencyProfileWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerTransparencyProfileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;LVg/d;)V", "", "isItemFavourite", "", "initButtons", "(Z)V", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;", "state", "bindButtons", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerTransparencyProfileVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerTransparencyProfileVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "()V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "Lru/ozon/app/android/marketing/databinding/WidgetSellerTransparencyProfileBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetSellerTransparencyProfileBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "subscribeActionHandler", "Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomWrappedRecyclerListAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomWrappedRecyclerListAdapter;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/TrustFactorDecorator;", "trustFactorDecorator", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/TrustFactorDecorator;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerTransparencyProfileWidgetViewHolder extends k<SellerTransparencyProfileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RecyclerContainer.AtomWrappedRecyclerListAdapter atomsAdapter;

    @NotNull
    private final WidgetSellerTransparencyProfileBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final Function1<AtomAction, Unit> subscribeActionHandler;

    @NotNull
    private final TrustFactorDecorator trustFactorDecorator;

    @NotNull
    private final SellerHeaderViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerTransparencyProfileWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull SellerHeaderViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        WidgetSellerTransparencyProfileBinding bind = WidgetSellerTransparencyProfileBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new SellerTransparencyProfileWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.subscribeActionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new SellerTransparencyProfileWidgetViewHolder$subscribeActionHandler$1(this)).buildHandler();
        RecyclerContainer.AtomWrappedRecyclerListAdapter atomWrappedRecyclerListAdapter = new RecyclerContainer.AtomWrappedRecyclerListAdapter();
        atomWrappedRecyclerListAdapter.setOnAction(buildHandler);
        this.atomsAdapter = atomWrappedRecyclerListAdapter;
        TrustFactorDecorator trustFactorDecorator = new TrustFactorDecorator(getContext());
        this.trustFactorDecorator = trustFactorDecorator;
        bind.trustFactorList.addItemDecoration(trustFactorDecorator);
        bind.trustFactorList.setAdapter(atomWrappedRecyclerListAdapter);
        bind.trustFactorList.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButtons(SubscribeEvent state) {
        WidgetSellerTransparencyProfileBinding widgetSellerTransparencyProfileBinding = this.binding;
        if (!(state instanceof SubscribeEvent.SuccessfulEvent)) {
            if (!(state instanceof SubscribeEvent.ErrorEvent)) {
                throw new o();
            }
            return;
        }
        boolean d11 = Intrinsics.d(((SubscribeEvent.SuccessfulEvent) state).getAction(), "sisLike");
        SingleAtom unsubscribeBtn = widgetSellerTransparencyProfileBinding.unsubscribeBtn;
        Intrinsics.checkNotNullExpressionValue(unsubscribeBtn, "unsubscribeBtn");
        unsubscribeBtn.setVisibility(d11 ? 0 : 8);
        SingleAtom subscribeBtn = widgetSellerTransparencyProfileBinding.subscribeBtn;
        Intrinsics.checkNotNullExpressionValue(subscribeBtn, "subscribeBtn");
        subscribeBtn.setVisibility(d11 ? 8 : 0);
    }

    private final void initButtons(boolean isItemFavourite) {
        WidgetSellerTransparencyProfileBinding widgetSellerTransparencyProfileBinding = this.binding;
        SingleAtom unsubscribeBtn = widgetSellerTransparencyProfileBinding.unsubscribeBtn;
        Intrinsics.checkNotNullExpressionValue(unsubscribeBtn, "unsubscribeBtn");
        unsubscribeBtn.setVisibility(isItemFavourite ? 0 : 8);
        SingleAtom subscribeBtn = widgetSellerTransparencyProfileBinding.subscribeBtn;
        Intrinsics.checkNotNullExpressionValue(subscribeBtn, "subscribeBtn");
        subscribeBtn.setVisibility(isItemFavourite ? 8 : 0);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getSubscribeStateFlow(), getLifecycle(), AbstractC5434v.b.STARTED), new SellerTransparencyProfileWidgetViewHolder$onAttach$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerTransparencyProfileVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSellerTransparencyProfileBinding widgetSellerTransparencyProfileBinding = this.binding;
        IconView sellerIv = widgetSellerTransparencyProfileBinding.sellerIv;
        Intrinsics.checkNotNullExpressionValue(sellerIv, "sellerIv");
        IconHolderKt.bind$default(sellerIv, item.getAvatar(), null, 2, null);
        SingleAtom.bind$default(widgetSellerTransparencyProfileBinding.shareBtn, item.getShare(), false, 2, null);
        widgetSellerTransparencyProfileBinding.shareBtn.setOnAction(this.actionHandler);
        TextAtomView subscriberCountTv = widgetSellerTransparencyProfileBinding.subscriberCountTv;
        Intrinsics.checkNotNullExpressionValue(subscriberCountTv, "subscriberCountTv");
        TextAtomHolderKt.bind$default(subscriberCountTv, item.getSubscribers().getTitle(), null, 2, null);
        TextAtomView subscriberCountLabelTv = widgetSellerTransparencyProfileBinding.subscriberCountLabelTv;
        Intrinsics.checkNotNullExpressionValue(subscriberCountLabelTv, "subscriberCountLabelTv");
        TextAtomHolderKt.bind$default(subscriberCountLabelTv, item.getSubscribers().getSubtitle(), null, 2, null);
        TextAtomView reviewCountTv = widgetSellerTransparencyProfileBinding.reviewCountTv;
        Intrinsics.checkNotNullExpressionValue(reviewCountTv, "reviewCountTv");
        TextAtomHolderKt.bind$default(reviewCountTv, item.getReviews().getTitle(), null, 2, null);
        TextAtomView reviewCountLabelTv = widgetSellerTransparencyProfileBinding.reviewCountLabelTv;
        Intrinsics.checkNotNullExpressionValue(reviewCountLabelTv, "reviewCountLabelTv");
        TextAtomHolderKt.bind$default(reviewCountLabelTv, item.getReviews().getSubtitle(), null, 2, null);
        List<IconLabelButtonDTO> trustFactors = item.getTrustFactors();
        if (trustFactors != null) {
            this.atomsAdapter.submitList(trustFactors);
        }
        TextAtomView sellerNameTv = widgetSellerTransparencyProfileBinding.sellerNameTv;
        Intrinsics.checkNotNullExpressionValue(sellerNameTv, "sellerNameTv");
        TextAtomHolderKt.bind$default(sellerNameTv, item.getSellerName(), null, 2, null);
        SingleAtom.bind$default(widgetSellerTransparencyProfileBinding.subscribeBtn, item.getSubscribeSingleAtom(), false, 2, null);
        widgetSellerTransparencyProfileBinding.subscribeBtn.setOnAction(this.subscribeActionHandler);
        AtomDTO unSubscribeSingleAtom = item.getUnSubscribeSingleAtom();
        if (unSubscribeSingleAtom != null) {
            SingleAtom.bind$default(widgetSellerTransparencyProfileBinding.unsubscribeBtn, unSubscribeSingleAtom, false, 2, null);
            widgetSellerTransparencyProfileBinding.unsubscribeBtn.setOnAction(this.subscribeActionHandler);
        }
        initButtons(SellerHeaderViewModel.shouldDisplayAsFavourite$default(this.viewModel, item.getIsActive(), null, 2, null));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SellerTransparencyProfileVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
