package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import Vg.d;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsGridBinding;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AbstractSearchResultsGridViewMapper;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridBindStrategyPicker;
import ru.ozon.app.android.videocover.ContinuousScrollStateListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AbstractSearchResultsGridViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SearchResultsGridViewHolder> {
    final /* synthetic */ AbstractSearchResultsGridViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractSearchResultsGridViewMapper$holderProducer$1(AbstractSearchResultsGridViewMapper abstractSearchResultsGridViewMapper) {
        super(2);
        this.this$0 = abstractSearchResultsGridViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SearchResultsGridViewHolder invoke(View view, ComposerReferences refs) {
        AbstractSearchResultsGridViewMapper.Companion companion;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ButtonsBinder buttonsBinder = this.this$0.component().getButtonsBinder().get();
        WidgetSearchResultsGridBinding bind = WidgetSearchResultsGridBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        Intrinsics.f(buttonsBinder);
        Srv2GridBindStrategyPicker srv2GridBindStrategyPicker = new Srv2GridBindStrategyPicker(refs, buttonsBinder, refs.getFrameBinderProvider(), this.this$0.component().getPinchToZoomOnboardingDelegate(), this.this$0.component().getVideoTileDelegate(), this.this$0.component().getAdultHandler(), bind, this.this$0.component().getFeatureChecker(), this.this$0.component().getOnboardingRepository());
        ScrollStateListener scrollStateListener = refs.getScrollStateListener().get();
        View requireView = refs.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        scrollStateListener.setOn(ComposerViewExtensionKt.composerRecyclerView(requireView));
        ContinuousScrollStateListener widgetsScrollStateListener = this.this$0.component().getVideoTileDelegate().getWidgetsScrollStateListener();
        View requireView2 = refs.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView2, "requireView(...)");
        widgetsScrollStateListener.setOn(ComposerViewExtensionKt.composerRecyclerView(requireView2));
        MessagesProcessor messagesProcessor = this.this$0.component().getMessagesProcessor();
        ActionSheetEventHandler actionSheetEventHandler = this.this$0.component().getActionSheetEventHandler();
        AdultHandler adultHandler = this.this$0.component().getAdultHandler();
        TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils = this.this$0.component().getTopRightButtonsViewHolderUtils().get();
        Intrinsics.checkNotNullExpressionValue(topRightButtonsViewHolderUtils, "get(...)");
        TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils2 = topRightButtonsViewHolderUtils;
        TileActionSheetHandlerFactory sheetHandlerFactory = this.this$0.component().getSheetHandlerFactory();
        PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate = this.this$0.component().getPinchToZoomOnboardingDelegate();
        VideoTileDelegate videoTileDelegate = this.this$0.component().getVideoTileDelegate();
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        companion = AbstractSearchResultsGridViewMapper.Companion;
        return new SearchResultsGridViewHolder(view, bind, buttonsBinder, messagesProcessor, refs, actionSheetEventHandler, adultHandler, topRightButtonsViewHolderUtils2, sheetHandlerFactory, pinchToZoomOnboardingDelegate, srv2GridBindStrategyPicker, videoTileDelegate, customActionHandlersStoreFactory.create(companion.getCustomActionHandlers()));
    }
}
