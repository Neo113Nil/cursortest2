package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import CG.a;
import Dc0.m;
import Dc0.n;
import Vg.c;
import a00.C4908c;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import hk0.C6969b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.atom2.LabelsAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.atom2.VariantsColorAtom;
import ru.ozon.app.android.atoms.atom2.VariantsTextAtom;
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Labels;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.atoms.data.rating.Rating;
import ru.ozon.app.android.atoms.data.variants.ColorVariants;
import ru.ozon.app.android.atoms.data.variants.TextVariants;
import ru.ozon.app.android.atoms.data.variants.VariantsColor;
import ru.ozon.app.android.atoms.data.variants.VariantsText;
import ru.ozon.app.android.atoms.rv.DefaultPaddingDecorator;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsGridBinding;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.SearchResultsPayload;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.decarator.SearchResultsRecyclerAtomDecorator;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.MultiButtonItemView;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.VerticalMultiButtonContainerView;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters.TopRightButtonAdapterMain;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridBindStrategyPicker;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridBindStrategy;
import ru.ozon.app.android.search.views.galleryswipeview.GallerySwipeView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uikit.recycler.delegate.ItemListLayoutManager;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u0000\u0091\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001o\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u00042\u00020\u0005Bs\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\u0010 \u001a\u00060\u001ej\u0002`\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010%J\u0017\u0010+\u001a\u00020#2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020#H\u0016¢\u0006\u0004\b-\u0010%J#\u00102\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00022\n\u00101\u001a\u00060/j\u0002`0H\u0014¢\u0006\u0004\b2\u00103J+\u00102\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00022\n\u00101\u001a\u00060/j\u0002`02\u0006\u00104\u001a\u00020\u0004H\u0014¢\u0006\u0004\b2\u00105J3\u0010<\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00022\n\u00108\u001a\u000606j\u0002`72\u000e\u0010;\u001a\n\u0018\u000109j\u0004\u0018\u0001`:H\u0016¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>H\u0096\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AH\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0012\u0010E\u001a\u0004\u0018\u00010DH\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020#2\u0006\u0010G\u001a\u00020\u0002H\u0002¢\u0006\u0004\bH\u0010IJ'\u0010L\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010K\u001a\u00020J2\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020#2\n\u00101\u001a\u00060/j\u0002`0H\u0002¢\u0006\u0004\bN\u0010OJ#\u0010T\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020R0Q\u0012\u0004\u0012\u00020S0PH\u0002¢\u0006\u0004\bT\u0010UR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ZR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010[R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\\R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010]R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010_R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010`R\u0018\u0010 \u001a\u00060\u001ej\u0002`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010|\u001a\u00020y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006}"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "viewBinding", "Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;", "buttonsBinder", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "messagesProcessor", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "pinchToZoomOnboardingDelegate", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/Srv2GridBindStrategyPicker;", "bindStrategyPicker", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Landroid/view/View;Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderUtils;Lru/ozon/app/android/product/TileActionSheetHandlerFactory;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/Srv2GridBindStrategyPicker;Lru/ozon/app/android/videocover/VideoTileDelegate;LVg/c;)V", "", "onAttach", "()V", "onDetach", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Ll20/d;)V", "payload", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getOnboardingContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "getConstraintsViewIds", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "getGalleryModel", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "processProductClick", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;)V", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "bindProduct", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Lru/ozon/app/android/action/sheet/DisposableActionHandler;Ljava/lang/Object;)V", "bindActionHandlers", "(Ll20/d;)V", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "provideConfigs", "()Ljava/util/Map;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/Srv2GridBindStrategyPicker;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "LVg/c;", "", "defaultBackgroundColor", "I", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;", "atomItemViewHolderDelegate", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;", "Lhk0/b;", "contentAdapter", "Lhk0/b;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapterMain;", "topRightButtonsAdapter", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapterMain;", "ru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridViewHolder$actionListener$1", "actionListener", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridViewHolder$actionListener$1;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "atomActionSheetHandler", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridBindStrategy;", "bindStrategy", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridBindStrategy;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "getOnboardingStyle", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "onboardingStyle", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsGridViewHolder extends k<SearchResultsGridVO> implements PinchToZoomOnboardingHolder {
    private final /* synthetic */ Srv2GridBindStrategy $$delegate_0;
    private DisposableActionHandler actionHandler;

    @NotNull
    private final SearchResultsGridViewHolder$actionListener$1 actionListener;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AtomActionSheetHandler atomActionSheetHandler;

    @NotNull
    private final AtomItemViewHolderDelegate atomItemViewHolderDelegate;

    @NotNull
    private final Srv2GridBindStrategy bindStrategy;

    @NotNull
    private final Srv2GridBindStrategyPicker bindStrategyPicker;

    @NotNull
    private final View containerView;

    @NotNull
    private C6969b contentAdapter;

    @NotNull
    private final c customActionHandlersStore;
    private final int defaultBackgroundColor;
    private SearchResultsGridVO item;

    @NotNull
    private final MessagesProcessor messagesProcessor;

    @NotNull
    private final PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TopRightButtonAdapterMain topRightButtonsAdapter;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final WidgetSearchResultsGridBinding viewBinding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchResultsPayload.values().length];
            try {
                iArr[SearchResultsPayload.BUTTON_TYPE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchResultsPayload.BUTTON_ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchResultsPayload.BUTTON_STATE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchResultsPayload.BUTTON_REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchResultsPayload.TOP_RIGHT_BUTTONS_CHANGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener, ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewHolder$actionListener$1] */
    public SearchResultsGridViewHolder(@NotNull View containerView, @NotNull WidgetSearchResultsGridBinding viewBinding, @NotNull ButtonsBinder buttonsBinder, @NotNull MessagesProcessor messagesProcessor, @NotNull ComposerReferences references, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull AdultHandler adultHandler, @NotNull TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils, @NotNull TileActionSheetHandlerFactory sheetHandlerFactory, @NotNull PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate, @NotNull Srv2GridBindStrategyPicker bindStrategyPicker, @NotNull VideoTileDelegate videoTileDelegate, @NotNull c customActionHandlersStore) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(buttonsBinder, "buttonsBinder");
        Intrinsics.checkNotNullParameter(messagesProcessor, "messagesProcessor");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderUtils, "topRightButtonsViewHolderUtils");
        Intrinsics.checkNotNullParameter(sheetHandlerFactory, "sheetHandlerFactory");
        Intrinsics.checkNotNullParameter(pinchToZoomOnboardingDelegate, "pinchToZoomOnboardingDelegate");
        Intrinsics.checkNotNullParameter(bindStrategyPicker, "bindStrategyPicker");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.$$delegate_0 = bindStrategyPicker.getActiveStrategy();
        this.containerView = containerView;
        this.viewBinding = viewBinding;
        this.messagesProcessor = messagesProcessor;
        this.references = references;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.adultHandler = adultHandler;
        this.pinchToZoomOnboardingDelegate = pinchToZoomOnboardingDelegate;
        this.bindStrategyPicker = bindStrategyPicker;
        this.videoTileDelegate = videoTileDelegate;
        this.customActionHandlersStore = customActionHandlersStore;
        int themeColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        this.defaultBackgroundColor = themeColor;
        AtomItemViewHolderDelegate atomItemViewHolderDelegate = new AtomItemViewHolderDelegate(null, null, provideConfigs(), 3, null);
        this.atomItemViewHolderDelegate = atomItemViewHolderDelegate;
        this.contentAdapter = new C6969b(atomItemViewHolderDelegate);
        TopRightButtonAdapterMain topRightButtonAdapterMain = new TopRightButtonAdapterMain(topRightButtonsViewHolderUtils, this, references);
        this.topRightButtonsAdapter = topRightButtonAdapterMain;
        ?? r72 = new ActionListener() { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewHolder$actionListener$1
            @Override // ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener
            public void onErrorReceived(String errorMessage) {
                MessagesProcessor messagesProcessor2;
                ComposerReferences composerReferences;
                ComposerReferences composerReferences2;
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                messagesProcessor2 = SearchResultsGridViewHolder.this.messagesProcessor;
                composerReferences = SearchResultsGridViewHolder.this.references;
                C4908c g10 = composerReferences.getContainer().g();
                composerReferences2 = SearchResultsGridViewHolder.this.references;
                messagesProcessor2.showError(g10, composerReferences2.getContainer().i(), errorMessage);
            }

            @Override // ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener
            public void onMessageReceived(String message, Long duration, Integer icon, String actionTitle, String actionDeeplink) {
                MessagesProcessor messagesProcessor2;
                ComposerReferences composerReferences;
                ComposerReferences composerReferences2;
                Intrinsics.checkNotNullParameter(message, "message");
                messagesProcessor2 = SearchResultsGridViewHolder.this.messagesProcessor;
                composerReferences = SearchResultsGridViewHolder.this.references;
                C4908c g10 = composerReferences.getContainer().g();
                composerReferences2 = SearchResultsGridViewHolder.this.references;
                messagesProcessor2.showMessage(g10, composerReferences2.getContainer().i(), message, duration, icon, actionTitle, actionDeeplink);
            }
        };
        this.actionListener = r72;
        this.atomActionSheetHandler = sheetHandlerFactory.create(references, r72);
        Srv2GridBindStrategy activeStrategy = bindStrategyPicker.getActiveStrategy();
        this.bindStrategy = activeStrategy;
        viewBinding.topRightButtonsRV.setItemAnimator(null);
        viewBinding.topRightButtonsRV.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        GallerySwipeView gallerySwipeView = viewBinding.gallerySwipeView;
        gallerySwipeView.init(references, this, videoTileDelegate, new SearchResultsGridViewHolder$1$1$1(getContainerView()));
        gallerySwipeView.setOnPinchToZoomStartedCallback(new SearchResultsGridViewHolder$1$1$2(this));
        viewBinding.contentElementsVAL.setAdapter(this.contentAdapter);
        viewBinding.contentElementsVAL.setItemAnimator(null);
        viewBinding.contentElementsVAL.setLayoutManager(new ItemListLayoutManager(getContext()));
        viewBinding.contentElementsVAL.setNestedScrollingEnabled(false);
        viewBinding.contentElementsVAL.addItemDecoration(new DefaultPaddingDecorator());
        viewBinding.contentElementsVAL.addItemDecoration(new SearchResultsRecyclerAtomDecorator());
        viewBinding.contentElementView.setOnClickListener(new m(this, 11));
        getContainerView().setOnClickListener(new n(this, 12));
        viewBinding.topRightButtonsRV.setOnClickListener(new a(this, 13));
        getContainerView().setContentDescription("grid");
        buttonsBinder.init(references, this);
        activeStrategy.init(this, viewBinding, topRightButtonAdapterMain, this.contentAdapter, themeColor, atomItemViewHolderDelegate);
    }

    private final void bindActionHandlers(d info) {
        this.atomActionSheetHandler.setWidgetViewItem(getViewItem());
        this.atomActionSheetHandler.setTrackingData(getTrackingData());
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        ActionHandler.Builder builder = new ActionHandler.Builder(this.references, this);
        T00.a b11 = info.b();
        ActionHandler.Builder onPreProcess = builder.setCurrentPageUrl(b11 != null ? b11.c() : null).customActionHandlers(new SearchResultsGridViewHolder$bindActionHandlers$1(this)).onPreProcess(new SearchResultsGridViewHolder$bindActionHandlers$2(this.atomActionSheetHandler));
        SearchResultsGridVO searchResultsGridVO = this.item;
        if (searchResultsGridVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        DisposableActionHandler buildDisposableHandlerForListWidgets = onPreProcess.buildDisposableHandlerForListWidgets(searchResultsGridVO.getId(), getLifecycle(), this.actionSheetEventHandler);
        this.actionHandler = buildDisposableHandlerForListWidgets;
        this.topRightButtonsAdapter.setActionHandler(buildDisposableHandlerForListWidgets != null ? buildDisposableHandlerForListWidgets.getHandler() : null);
    }

    private final void bindProduct(SearchResultsGridVO item, DisposableActionHandler actionHandler, Object payload) {
        MultiButtonVO buttonState = item.getButtonState();
        Intrinsics.g(payload, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.SearchResultsPayload>");
        Iterator it = ((List) payload).iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((SearchResultsPayload) it.next()).ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                this.bindStrategy.bindButtons(buttonState, actionHandler);
            } else if (i11 == 4) {
                VerticalMultiButtonContainerView multiButtonItemContainer = this.viewBinding.multiButtonItemContainer;
                Intrinsics.checkNotNullExpressionValue(multiButtonItemContainer, "multiButtonItemContainer");
                ViewExtKt.gone(multiButtonItemContainer);
            } else if (i11 == 5) {
                this.bindStrategy.bindTopRightButtons(item.getTopRightButtons());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$1(SearchResultsGridViewHolder searchResultsGridViewHolder, View view) {
        searchResultsGridViewHolder.getContainerView().performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$2(SearchResultsGridViewHolder searchResultsGridViewHolder, View view) {
        SearchResultsGridVO searchResultsGridVO = searchResultsGridViewHolder.item;
        if (searchResultsGridVO != null) {
            searchResultsGridViewHolder.processProductClick(searchResultsGridVO);
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3(SearchResultsGridViewHolder searchResultsGridViewHolder, View view) {
        searchResultsGridViewHolder.getContainerView().performClick();
    }

    private final void processProductClick(final SearchResultsGridVO product) {
        this.videoTileDelegate.onVideoTileClicked(product.getGalleryModel().getAdultImagesModel().getImageItems());
        AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, product.getIsAdult(), this.references.getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewHolder$processProductClick$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                DisposableActionHandler disposableActionHandler;
                Function1<AtomAction, Unit> handler;
                AtomActionDTO action;
                AtomAction atomAction;
                disposableActionHandler = SearchResultsGridViewHolder.this.actionHandler;
                if (disposableActionHandler == null || (handler = disposableActionHandler.getHandler()) == null || (action = product.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, product.getTrackingInfo())) == null) {
                    return;
                }
                handler.invoke(atomAction);
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                AdultListener.DefaultImpls.onAdultReject(this);
            }
        }, null, false, 24, null);
    }

    private final Map<Class<? extends AtomDTO>, Atom.AtomConfiguration> provideConfigs() {
        return U.j(new Pair(Price.class, new Atom.DefaultConfigurator(0, 0, 0, 2, 7, null)), new Pair(MultilineBadge.class, new Atom.DefaultConfigurator(0, 0, 4, 4)), new Pair(PriceWithTitle.class, new Atom.DefaultConfigurator(0, 0, 0, 2)), new Pair(CommonText.TextMedium.class, new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_M, 0, 0, null, 0, false, false, 0, null, null, 0, 0, 5, null, null, 458732, null)), new Pair(VariantsText.class, new VariantsTextAtom.Configuration(0, 0, 2, 2, 0, false, 48, null)), new Pair(VariantsColor.class, new VariantsColorAtom.Configuration(0, 0, 2, 2, 0, 16, null)), new Pair(CommonText.TextSmall.class, new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Caption, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524268, null)), new Pair(Labels.class, new LabelsAtom.Configuration(0, 0, 0, 0, 0, 0, null, null, null, 508, null)), new Pair(Rating.class, new Atom.DefaultConfigurator(0, 0, 4, 4, 3, null)), new Pair(ColorVariants.class, new Atom.DefaultConfigurator(2, 0, 4, 4)), new Pair(TextVariants.class, new Atom.DefaultConfigurator(0, 0, 2, 2)));
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public PinchToZoomOnboardingHolder.ConstraintsViewIds getConstraintsViewIds() {
        return this.$$delegate_0.getConstraintsViewIds();
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    public SearchResultsGalleryModel getGalleryModel() {
        return this.$$delegate_0.getGalleryModel();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public ConstraintLayout getOnboardingContainer() {
        return this.$$delegate_0.getOnboardingContainer();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public PinchToZoomOnboardingDelegate.OnboardingStyle getOnboardingStyle() {
        return this.$$delegate_0.getOnboardingStyle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.bindStrategy.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.atomActionSheetHandler.clear();
        this.bindStrategy.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.bindStrategy.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        MultiButtonItemView secondButton;
        MultiButtonItemView firstButton;
        super.onRecycle();
        this.bindStrategy.onRecycle();
        VerticalMultiButtonContainerView verticalMultiButtonContainerView = this.viewBinding.multiButtonItemContainer;
        if (verticalMultiButtonContainerView == null) {
            verticalMultiButtonContainerView = null;
        }
        if (verticalMultiButtonContainerView != null && (firstButton = verticalMultiButtonContainerView.getFirstButton()) != null) {
            firstButton.onRecycle();
        }
        VerticalMultiButtonContainerView verticalMultiButtonContainerView2 = this.viewBinding.multiButtonItemContainer;
        VerticalMultiButtonContainerView verticalMultiButtonContainerView3 = verticalMultiButtonContainerView2 != null ? verticalMultiButtonContainerView2 : null;
        if (verticalMultiButtonContainerView3 == null || (secondButton = verticalMultiButtonContainerView3.getSecondButton()) == null) {
            return;
        }
        secondButton.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.bindStrategy.onViewInVisibleBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.bindStrategy.onViewOutOfVisibleBounds();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SearchResultsGridVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SearchResultsGridViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchResultsGridVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        bindActionHandlers(info);
        this.bindStrategy.bind(item, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchResultsGridVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.item = item;
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler == null) {
            return;
        }
        bindProduct(item, disposableActionHandler, payload);
    }
}
