package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper;

import Pc.a;
import Sc.InterfaceC4008j;
import U7.d;
import Vg.c;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.universalwidgets.flags.TileGrid2ImageSizeCalculatorEnabled;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.RatingMoleculeBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge.BadgeOnboardingDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.TileGrid2BindStrategyPicker;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2GalleryImagePrefetchHelper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySingleViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.ContinuousScrollStateListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TileGrid2ViewHolder> {
    final /* synthetic */ TileGrid2ViewMapper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ViewMapper$holderProducer$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<SelectedProcessor> {
        final /* synthetic */ TileGrid2ViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TileGrid2ViewMapper tileGrid2ViewMapper) {
            super(0);
            this.this$0 = tileGrid2ViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SelectedProcessor invoke() {
            return this.this$0.component().getSelectedProcessorProvider();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewMapper$holderProducer$1(TileGrid2ViewMapper tileGrid2ViewMapper) {
        super(2);
        this.this$0 = tileGrid2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TileGrid2ViewHolder invoke(View view, ComposerReferences refs) {
        boolean isThinEnabled;
        boolean isThinEnabled2;
        boolean isThinEnabled3;
        boolean isThinEnabled4;
        TileGrid2ViewMapper.Companion companion;
        boolean isGalleryImagePrefetchEnabled;
        boolean isPdpOfflineModeEnabled;
        TileOverlayBinder tileOverlayBinder;
        InterfaceC4008j<TileGrid2GalleryImagePrefetchHelper> interfaceC4008j;
        PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;
        ContinuousScrollStateListener widgetsScrollStateListener;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        TileGrid2BaseViewBinding createViewBinding = this.this$0.createViewBinding(view);
        GalleryBaseViewDelegate galleryViewDelegate = createViewBinding.getGalleryViewDelegate();
        isThinEnabled = this.this$0.isThinEnabled();
        VideoTileDelegate videoTileDelegate = (!isThinEnabled || this.this$0.getIsThinView()) ? null : this.this$0.component().getVideoTileDelegate();
        TileOverlayBinder tileOverlayBinder2 = new TileOverlayBinder(this.this$0.component().getTileDislikeInteractor(), refs, true, createViewBinding.getOverlayView());
        BlurMoleculeDelegate provide = this.this$0.component().getBlurDelegateProvider().provide();
        RatingMoleculeBinder ratingMoleculeBinder = new RatingMoleculeBinder(this.this$0.component().getRatingDelegateFactory().create(refs), createViewBinding.getRatingView());
        TileGrid2ImageSizeCalculator imageSizeCalculator = this.this$0.component().getFeatureChecker().isEnabled(TileGrid2ImageSizeCalculatorEnabled.INSTANCE) ? this.this$0.component().getImageSizeCalculator() : null;
        a<FrameBinder> frameBinderProvider = refs.getFrameBinderProvider();
        isThinEnabled2 = this.this$0.isThinEnabled();
        VideoTileDelegate videoTileDelegate2 = videoTileDelegate;
        TileGrid2BindStrategyPicker tileGrid2BindStrategyPicker = new TileGrid2BindStrategyPicker(refs, frameBinderProvider, isThinEnabled2 ? videoTileDelegate : this.this$0.component().getVideoTileDelegate(), createViewBinding, this.this$0.component().getFeatureChecker(), this.this$0.getIsThinView(), new BadgeOnboardingDelegate(refs, this.this$0.component().getOnboardingRepository()), LazyUtilsKt.unsafeLazy(new TileGrid2ViewMapper$holderProducer$1$bindStrategyPicker$1(createViewBinding, this.this$0)), createViewBinding.getBadgesDelegate(), galleryViewDelegate, this.this$0.component().getTileGrid2RootBgColorCache(), tileOverlayBinder2, this.this$0.component().getTileDislikeInteractor(), this.this$0.component().getWishlistServiceLazy(), this.this$0.component().getSelectionProductsEventManager(), this.this$0.component().getSelectionProductsEventsMap(), this.this$0.component().getAdultHandler(), provide, ratingMoleculeBinder, this.this$0.component().getFavoriteManager());
        final AbstractC5434v c11 = d.c(refs);
        final TileGrid2ViewMapper tileGrid2ViewMapper = this.this$0;
        if (c11.b() == AbstractC5434v.b.DESTROYED) {
            tileGrid2ViewMapper.container = null;
        } else {
            c11.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ViewMapper$holderProducer$1$invoke$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    tileGrid2ViewMapper.container = null;
                    AbstractC5434v.this.e(this);
                }
            });
        }
        isThinEnabled3 = this.this$0.isThinEnabled();
        VideoTileDelegate videoTileDelegate3 = isThinEnabled3 ? videoTileDelegate2 : this.this$0.component().getVideoTileDelegate();
        if (videoTileDelegate3 != null && (widgetsScrollStateListener = videoTileDelegate3.getWidgetsScrollStateListener()) != null) {
            View requireView = refs.getContainer().j().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
            widgetsScrollStateListener.setOn(ComposerViewExtensionKt.composerRecyclerView(requireView));
        }
        MessagesProcessor messagesProcessor = this.this$0.component().getMessagesProcessor();
        ActionSheetEventHandler actionSheetEventHandler = this.this$0.component().getActionSheetEventHandler();
        TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils = createViewBinding.getTopRightButtonsDelegate().getTopRightButtonsRv() != null ? this.this$0.component().getTopRightButtonsViewHolderUtils().get() : null;
        AdultHandler adultHandler = this.this$0.component().getAdultHandler();
        TileActionSheetHandlerFactory sheetHandlerFactory = this.this$0.component().getSheetHandlerFactory();
        isThinEnabled4 = this.this$0.isThinEnabled();
        if (!isThinEnabled4) {
            videoTileDelegate2 = this.this$0.component().getVideoTileDelegate();
        }
        Vg.d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        companion = TileGrid2ViewMapper.Companion;
        c create = customActionHandlersStoreFactory.create(companion.getCustomActionHandlers());
        FeatureChecker featureChecker = this.this$0.component().getFeatureChecker();
        GallerySwipeViewDelegate gallerySwipeViewDelegate = galleryViewDelegate instanceof GallerySwipeViewDelegate ? (GallerySwipeViewDelegate) galleryViewDelegate : null;
        PlayerPreloader playerPreloader = this.this$0.component().getPlayerPreloader();
        InterfaceC4008j<TileGrid2GalleryImagePrefetchHelper> galleryImagePrefetchHelperLazy = this.this$0.component().getGalleryImagePrefetchHelperLazy();
        isGalleryImagePrefetchEnabled = this.this$0.isGalleryImagePrefetchEnabled();
        isPdpOfflineModeEnabled = this.this$0.isPdpOfflineModeEnabled();
        if (isPdpOfflineModeEnabled) {
            tileOverlayBinder = tileOverlayBinder2;
            interfaceC4008j = galleryImagePrefetchHelperLazy;
            pdpOfflineScreenWidgetsData = this.this$0.component().getOfflineScreenWidgetsData();
        } else {
            tileOverlayBinder = tileOverlayBinder2;
            interfaceC4008j = galleryImagePrefetchHelperLazy;
            pdpOfflineScreenWidgetsData = null;
        }
        TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator = imageSizeCalculator;
        TileGrid2ViewHolder tileGrid2ViewHolder = new TileGrid2ViewHolder(view, createViewBinding, messagesProcessor, refs, actionSheetEventHandler, topRightButtonsViewHolderUtils, sheetHandlerFactory, tileGrid2BindStrategyPicker, videoTileDelegate2, create, featureChecker, gallerySwipeViewDelegate, playerPreloader, interfaceC4008j, isGalleryImagePrefetchEnabled, pdpOfflineScreenWidgetsData, this.this$0.component().getTileGrid2ProductMapper(), tileOverlayBinder, provide, adultHandler, this.this$0.component().getImageCache(), tileGrid2ImageSizeCalculator, LazyUtilsKt.unsafeLazy(new AnonymousClass3(this.this$0)));
        TileGrid2ViewMapper tileGrid2ViewMapper2 = this.this$0;
        GallerySingleViewDelegate gallerySingleViewDelegate = galleryViewDelegate instanceof GallerySingleViewDelegate ? (GallerySingleViewDelegate) galleryViewDelegate : null;
        if (gallerySingleViewDelegate != null) {
            gallerySingleViewDelegate.init(provide, tileGrid2ViewMapper2.component().getImageCache(), tileGrid2ImageSizeCalculator);
        }
        return tileGrid2ViewHolder;
    }
}
