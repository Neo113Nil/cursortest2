package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders;

import WZ.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import hk0.C6968a;
import hk0.C6969b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$string;
import ru.ozon.app.android.search.catalog.components.searchresultv2.presentation.BadgesContainerView;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsGridBinding;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.producttilebuttons.binders.ButtonsBinder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.BackgroundBinderKt;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.VerticalMultiButtonContainerView;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters.TopRightButtonAdapter;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AdultImagesModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders.Srv2GridViewStateBinder;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.OnboardingFeature;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingCutConfig;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.videocover.HorizontalScrollDelegate;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JQ\u0010 \u001a\u00020\u001f2\u0012\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J)\u0010(\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001fH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u001fH\u0016¢\u0006\u0004\b/\u0010-J\u000f\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b0\u0010-J\u001f\u00100\u001a\u00020\u001f2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0016¢\u0006\u0004\b0\u00104J\u000f\u00105\u001a\u00020\u001fH\u0016¢\u0006\u0004\b5\u0010-J#\u00105\u001a\u00020\u001f2\b\u00107\u001a\u0004\u0018\u0001062\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b5\u00108J\u000f\u00109\u001a\u00020\u001fH\u0016¢\u0006\u0004\b9\u0010-J\u000f\u0010:\u001a\u00020\u001fH\u0016¢\u0006\u0004\b:\u0010-J\u000f\u0010;\u001a\u00020\u001fH\u0016¢\u0006\u0004\b;\u0010-J\u000f\u0010<\u001a\u00020\u001fH\u0016¢\u0006\u0004\b<\u0010-J\u000f\u0010=\u001a\u00020\u001fH\u0016¢\u0006\u0004\b=\u0010-J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001fH\u0016¢\u0006\u0004\bG\u0010-J\u000f\u0010H\u001a\u00020\u001bH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001fH\u0002¢\u0006\u0004\bJ\u0010-J\u0011\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010Q\u001a\u00020\u001f*\u00020N2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010V\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u001bH\u0002¢\u0006\u0004\bV\u0010WJ\u001b\u0010Y\u001a\u00020\u001f*\u00020X2\u0006\u0010U\u001a\u00020\u001bH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\u001f*\u00020XH\u0002¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010eR\u001a\u0010g\u001a\u00020f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\"\u0010k\u001a\u00020\"8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR.\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00128\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0013\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010\u0015\u001a\u00020\u00148\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0015\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0017\u0010\u0081\u0001R\u001b\u0010\u001a\u001a\u00060\u0018j\u0002`\u00198\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u001a\u0010\u0082\u0001R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u0083\u0001¨\u0006\u0084\u0001"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/viewbinders/Srv2GridDefaultViewStateBinder;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/viewbinders/Srv2GridViewStateBinder;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;", "buttonsBinder", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;", "adultDelegate", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "pinchToZoomOnboardingDelegate", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;Lru/ozon/app/android/videocover/VideoTileDelegate;Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "viewBinding", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lhk0/b;", "Lru/ozon/app/android/uikit/recycler/ItemListAdapter;", "contentAdapter", "", "defaultBackgroundColor", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;", "atomItemViewHolderDelegate", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;Lhk0/b;ILru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "vo", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "prepare", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Lru/ozon/app/android/action/sheet/DisposableActionHandler;Landroidx/recyclerview/widget/RecyclerView$u;)V", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "bindGallery", "()V", "bindBadges", "bindMainState", "bindTopRightButtons", "", "", "topRightButtons", "(Ljava/util/List;)V", "bindButtons", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "state", "(Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "bindFooter", "bindBackground", "onAttach", "onViewOutOfVisibleBounds", "onDetach", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getOnboardingContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "getConstraintsViewIds", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "getGalleryModel", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "swipeGalleryToFirstVideo", "getPosition", "()I", "bindOnBoarding", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "getOrCreateOnBoardingDelegate", "()Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "", "widgetId", "trackOnboardingView", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;J)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "badgeId", "addBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "applyId", "(Lru/ozon/uni/android/atom/badge/BadgeView;I)V", "adultImagesModel", "showOnboardingIfNeed", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;)V", "appendContentDescription", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "onboardingStyle", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "getOnboardingStyle", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "item", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "getItem", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "setItem", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;)V", "Lru/ozon/composer/ui/widget/k;", "getViewHolder", "()Lru/ozon/composer/ui/widget/k;", "setViewHolder", "(Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "getViewBinding", "()Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "setViewBinding", "(Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;)V", "onboardingDelegate", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;", "Lhk0/b;", "Ljava/lang/Integer;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public class Srv2GridDefaultViewStateBinder implements Srv2GridViewStateBinder {
    private DisposableActionHandler actionHandler;

    @NotNull
    private final AdultDelegate<AdultImagesModel> adultDelegate;

    @NotNull
    private final ButtonsBinder buttonsBinder;
    private C6969b contentAdapter;
    private Integer defaultBackgroundColor;

    @NotNull
    private final C8486a disposables;
    protected SearchResultsGridVO item;
    private OnboardingDelegate onboardingDelegate;

    @NotNull
    private final CommonOnboardingRepository onboardingRepository;

    @NotNull
    private final PinchToZoomOnboardingDelegate.OnboardingStyle onboardingStyle;

    @NotNull
    private final PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate;

    @NotNull
    private final ComposerReferences references;
    private TopRightButtonAdapter topRightButtonsAdapter;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;
    protected WidgetSearchResultsGridBinding viewBinding;
    protected k<?> viewHolder;

    public Srv2GridDefaultViewStateBinder(@NotNull ComposerReferences references, @NotNull ButtonsBinder buttonsBinder, @NotNull AdultDelegate<AdultImagesModel> adultDelegate, @NotNull PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate, @NotNull VideoTileDelegate videoTileDelegate, @NotNull CommonOnboardingRepository onboardingRepository) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(buttonsBinder, "buttonsBinder");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(pinchToZoomOnboardingDelegate, "pinchToZoomOnboardingDelegate");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.references = references;
        this.buttonsBinder = buttonsBinder;
        this.adultDelegate = adultDelegate;
        this.pinchToZoomOnboardingDelegate = pinchToZoomOnboardingDelegate;
        this.videoTileDelegate = videoTileDelegate;
        this.onboardingRepository = onboardingRepository;
        this.onboardingStyle = PinchToZoomOnboardingDelegate.OnboardingStyle.GRID;
        this.disposables = new C8486a();
    }

    private final void addBadge(BadgeDTO badge, int badgeId) {
        BadgeView addBadge = getViewBinding().badgesContainer.addBadge(badge);
        appendContentDescription(addBadge);
        applyId(addBadge, badgeId);
    }

    private final void appendContentDescription(BadgeView badgeView) {
        CharSequence badgeText = badgeView.getBadgeText();
        if (badgeText != null) {
            badgeView.setContentDescription(StringProvider.getString(R$string.search_cd_search_result_product_android, Long.valueOf(getItem().getId()), badgeText));
        }
    }

    private final void applyId(BadgeView badgeView, int i11) {
        badgeView.setId(i11);
    }

    private final void bindOnBoarding() {
        final BadgeView badgeView;
        final SearchResultsGridVO.BadgeOnboardingVO badgeOnboarding = getItem().getBadgeOnboarding();
        if (badgeOnboarding == null) {
            return;
        }
        if (!this.onboardingRepository.canShowOnboarding(badgeOnboarding.getOnboardingKey(), OnboardingFeature.SRV_2_BADGE_ONBOARDING.getMaxShowCount()) || (badgeView = (BadgeView) getViewBinding().badgesContainer.findViewById(R$id.leftBottomBadge)) == null) {
            return;
        }
        this.onboardingRepository.onStartShowOnboarding();
        int i11 = Y.f42258g;
        if (!badgeView.isLaidOut() || badgeView.isLayoutRequested()) {
            badgeView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders.Srv2GridDefaultViewStateBinder$bindOnBoarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    float badgeCornerRadius = SearchResultsGridVO.BadgeOnboardingVO.this.getBadgeCornerRadius();
                    float backgroundCornerRadius = SearchResultsGridVO.BadgeOnboardingVO.this.getBackgroundCornerRadius();
                    int backgroundPadding = SearchResultsGridVO.BadgeOnboardingVO.this.getBackgroundPadding();
                    OnboardingDelegate orCreateOnBoardingDelegate = this.getOrCreateOnBoardingDelegate();
                    if (orCreateOnBoardingDelegate != null) {
                        OnboardingDelegate.DefaultImpls.bind$default(orCreateOnBoardingDelegate, badgeView, new OnboardingCutConfig(backgroundPadding, backgroundCornerRadius, badgeCornerRadius), null, SearchResultsGridVO.BadgeOnboardingVO.this.getOnboarding(), 4, null);
                    }
                }
            });
            return;
        }
        float badgeCornerRadius = badgeOnboarding.getBadgeCornerRadius();
        float backgroundCornerRadius = badgeOnboarding.getBackgroundCornerRadius();
        int backgroundPadding = badgeOnboarding.getBackgroundPadding();
        OnboardingDelegate orCreateOnBoardingDelegate = getOrCreateOnBoardingDelegate();
        if (orCreateOnBoardingDelegate != null) {
            OnboardingDelegate.DefaultImpls.bind$default(orCreateOnBoardingDelegate, badgeView, new OnboardingCutConfig(backgroundPadding, backgroundCornerRadius, badgeCornerRadius), null, badgeOnboarding.getOnboarding(), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingDelegate getOrCreateOnBoardingDelegate() {
        OnboardingModel onboarding;
        SearchResultsGridVO.BadgeOnboardingVO badgeOnboarding = getItem().getBadgeOnboarding();
        if (badgeOnboarding == null || (onboarding = badgeOnboarding.getOnboarding()) == null) {
            return null;
        }
        OnboardingDelegate onboardingDelegate = this.onboardingDelegate;
        if (onboardingDelegate != null) {
            return onboardingDelegate;
        }
        OnboardingDelegateImpl onboardingDelegateImpl = new OnboardingDelegateImpl(this.references, getViewBinding().getConstraintLayout(), getViewHolder());
        onboardingDelegateImpl.setOnShownListener(new Srv2GridDefaultViewStateBinder$getOrCreateOnBoardingDelegate$1$1$1(this, onboarding));
        this.onboardingDelegate = onboardingDelegateImpl;
        return onboardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboardingIfNeed(AdultImagesModel adultImagesModel) {
        SearchResultsGalleryModel.GalleryItem galleryItem;
        AdultImageView.Image image;
        t pinchToZoomTokenizedEvent;
        if (!this.pinchToZoomOnboardingDelegate.showIfNeedOn(this) || (galleryItem = (SearchResultsGalleryModel.GalleryItem) C7714v.M(adultImagesModel.getImageItems())) == null || (image = galleryItem.getImage()) == null || (pinchToZoomTokenizedEvent = image.getPinchToZoomTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), pinchToZoomTokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackOnboardingView(OnboardingModel onboardingModel, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo = onboardingModel.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null), null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindBackground() {
        ConstraintLayout searchResultGridItemCl = getViewBinding().searchResultGridItemCl;
        Intrinsics.checkNotNullExpressionValue(searchResultGridItemCl, "searchResultGridItemCl");
        Drawable backgroundImage = getItem().getBackgroundImage();
        String backgroundColor = getItem().getBackgroundColor();
        Integer num = this.defaultBackgroundColor;
        Intrinsics.f(num);
        BackgroundBinderKt.bindBackground(searchResultGridItemCl, backgroundImage, backgroundColor, num.intValue());
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindBadges() {
        BadgeDTO leftBottomBadge;
        boolean z11 = getItem().getGalleryModel().getOverlayTitle() == null;
        WidgetSearchResultsGridBinding viewBinding = getViewBinding();
        BadgesContainerView badgesContainer = viewBinding.badgesContainer;
        Intrinsics.checkNotNullExpressionValue(badgesContainer, "badgesContainer");
        ViewExtKt.show(badgesContainer);
        viewBinding.badgesContainer.reset();
        if (!z11 || (leftBottomBadge = getItem().getLeftBottomBadge()) == null) {
            return;
        }
        addBadge(leftBottomBadge, R$id.leftBottomBadge);
        BadgeDTO secondLeftBottomBadge = getItem().getSecondLeftBottomBadge();
        if (secondLeftBottomBadge != null) {
            addBadge(secondLeftBottomBadge, R$id.secondLeftBottomBadge);
        }
        bindOnBoarding();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindButtons() {
        bindButtons(getItem().getButtonState(), this.actionHandler);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindFooter() {
        TextAtom footerLabelAtom = getItem().getFooterLabelAtom();
        TextAtomView textAtomView = getViewBinding().footerLabelTv;
        Intrinsics.f(textAtomView);
        ViewExtKt.show(textAtomView);
        ViewGroup.LayoutParams layoutParams = textAtomView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = getItem().getFooterLabelHeight();
        textAtomView.setLayoutParams(bVar);
        TextAtomHolderKt.bindOrInvisible$default(textAtomView, footerLabelAtom, null, 2, null);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindGallery() {
        WidgetSearchResultsGridBinding viewBinding = getViewBinding();
        viewBinding.gallerySwipeView.show();
        viewBinding.gallerySwipeView.setLocalModel(getItem().getGalleryModel());
        if (getItem().getIsAdult()) {
            this.adultDelegate.bindItem(getItem().getGalleryModel().getAdultImagesModel());
        } else {
            viewBinding.gallerySwipeView.bind(getItem().getGalleryModel().getAdultImagesModel());
            showOnboardingIfNeed(getItem().getGalleryModel().getAdultImagesModel());
        }
        viewBinding.gallerySwipeView.bindOverlayTitle(getItem().getGalleryModel().getOverlayTitle(), OverlayTitleView.SizeMode.MEDIUM);
        viewBinding.gallerySwipeView.bindWaveOrGone(getItem().getGalleryModel().getWaveModel());
        viewBinding.gallerySwipeView.bindRatio(getItem().getGalleryModel());
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindMainState() {
        RecyclerView contentElementsVAL = getViewBinding().contentElementsVAL;
        Intrinsics.checkNotNullExpressionValue(contentElementsVAL, "contentElementsVAL");
        ViewExtKt.show(contentElementsVAL);
        C6969b c6969b = this.contentAdapter;
        if (c6969b != null) {
            c6969b.submitList(getItem().getContentElements());
        } else {
            Intrinsics.n("contentAdapter");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindTopRightButtons() {
        bindTopRightButtons(getItem().getTopRightButtons());
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public PinchToZoomOnboardingHolder.ConstraintsViewIds getConstraintsViewIds() {
        return new PinchToZoomOnboardingHolder.ConstraintsViewIds(getViewBinding().gallerySwipeView.getGalleryId(), 0, 0, 0, 0, 30, null);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public SearchResultsGalleryModel getGalleryModel() {
        return getItem().getGalleryModel();
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public HorizontalScrollDelegate getHorizontalDelegate() {
        return Srv2GridViewStateBinder.DefaultImpls.getHorizontalDelegate(this);
    }

    @NotNull
    protected final SearchResultsGridVO getItem() {
        SearchResultsGridVO searchResultsGridVO = this.item;
        if (searchResultsGridVO != null) {
            return searchResultsGridVO;
        }
        Intrinsics.n("item");
        throw null;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public ConstraintLayout getOnboardingContainer() {
        ConstraintLayout searchResultGridItemCl = getViewBinding().searchResultGridItemCl;
        Intrinsics.checkNotNullExpressionValue(searchResultGridItemCl, "searchResultGridItemCl");
        return searchResultGridItemCl;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public PinchToZoomOnboardingDelegate.OnboardingStyle getOnboardingStyle() {
        return this.onboardingStyle;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public int getPosition() {
        return getViewHolder().getAdapterPosition();
    }

    @NotNull
    protected final WidgetSearchResultsGridBinding getViewBinding() {
        WidgetSearchResultsGridBinding widgetSearchResultsGridBinding = this.viewBinding;
        if (widgetSearchResultsGridBinding != null) {
            return widgetSearchResultsGridBinding;
        }
        Intrinsics.n("viewBinding");
        throw null;
    }

    @NotNull
    protected final k<?> getViewHolder() {
        k<?> kVar = this.viewHolder;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.n("viewHolder");
        throw null;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders.Srv2GridViewStateBinder
    public void init(@NotNull k<?> viewHolder, @NotNull WidgetSearchResultsGridBinding viewBinding, @NotNull TopRightButtonAdapter topRightButtonsAdapter, @NotNull C6969b contentAdapter, int defaultBackgroundColor, @NotNull AtomItemViewHolderDelegate atomItemViewHolderDelegate) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(topRightButtonsAdapter, "topRightButtonsAdapter");
        Intrinsics.checkNotNullParameter(contentAdapter, "contentAdapter");
        Intrinsics.checkNotNullParameter(atomItemViewHolderDelegate, "atomItemViewHolderDelegate");
        setViewHolder(viewHolder);
        setViewBinding(viewBinding);
        this.topRightButtonsAdapter = topRightButtonsAdapter;
        this.defaultBackgroundColor = Integer.valueOf(defaultBackgroundColor);
        C6968a c6968a = new C6968a(atomItemViewHolderDelegate);
        viewBinding.contentElementsVAL.setAdapter(c6968a);
        this.contentAdapter = c6968a;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onAttach() {
        RecyclerView recyclerView = getViewBinding().topRightButtonsRV;
        TopRightButtonAdapter topRightButtonAdapter = this.topRightButtonsAdapter;
        if (topRightButtonAdapter == null) {
            Intrinsics.n("topRightButtonsAdapter");
            throw null;
        }
        recyclerView.setAdapter(topRightButtonAdapter.getAdapter());
        getViewHolder().getLifecycle().a(new Srv2GridDefaultViewStateBinder$onAttach$1(this));
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onDetach() {
        getViewBinding().topRightButtonsRV.setAdapter(null);
        this.pinchToZoomOnboardingDelegate.cancelOnboarding();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onRecycle() {
        Srv2GridViewStateBinder.DefaultImpls.onRecycle(this);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onViewInVisibleBounds() {
        Srv2GridViewStateBinder.DefaultImpls.onViewInVisibleBounds(this);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onViewOutOfVisibleBounds() {
        Srv2GridViewStateBinder.DefaultImpls.onViewOutOfVisibleBounds(this);
        if (this.references.getContainer().f().getLifecycle().b().a(AbstractC5434v.b.RESUMED)) {
            this.videoTileDelegate.onWidgetHolderScrolledOutOfVisibleBounds(this);
        }
        OnboardingDelegate onboardingDelegate = this.onboardingDelegate;
        if (onboardingDelegate != null) {
            onboardingDelegate.unbind();
        }
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders.Srv2GridViewStateBinder
    public void prepare(@NotNull SearchResultsGridVO vo, DisposableActionHandler actionHandler, @NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(pool, "pool");
        setItem(vo);
        this.actionHandler = actionHandler;
        setRecycledViewPool(pool);
    }

    protected final void setItem(@NotNull SearchResultsGridVO searchResultsGridVO) {
        Intrinsics.checkNotNullParameter(searchResultsGridVO, "<set-?>");
        this.item = searchResultsGridVO;
    }

    public void setRecycledViewPool(@NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        WidgetSearchResultsGridBinding viewBinding = getViewBinding();
        viewBinding.topRightButtonsRV.setRecycledViewPool(pool);
        viewBinding.gallerySwipeView.setRecycledViewPool(pool);
        viewBinding.contentElementsVAL.setRecycledViewPool(pool);
    }

    protected final void setViewBinding(@NotNull WidgetSearchResultsGridBinding widgetSearchResultsGridBinding) {
        Intrinsics.checkNotNullParameter(widgetSearchResultsGridBinding, "<set-?>");
        this.viewBinding = widgetSearchResultsGridBinding;
    }

    protected final void setViewHolder(@NotNull k<?> kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.viewHolder = kVar;
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public void swipeGalleryToFirstVideo() {
        getViewBinding().gallerySwipeView.swipeToFirstVideo();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindButtons(MultiButtonVO state, DisposableActionHandler actionHandler) {
        if (actionHandler == null || state == null) {
            VerticalMultiButtonContainerView multiButtonItemContainer = getViewBinding().multiButtonItemContainer;
            Intrinsics.checkNotNullExpressionValue(multiButtonItemContainer, "multiButtonItemContainer");
            ViewExtKt.gone(multiButtonItemContainer);
            return;
        }
        ButtonsBinder buttonsBinder = this.buttonsBinder;
        k<?> viewHolder = getViewHolder();
        VerticalMultiButtonContainerView multiButtonItemContainer2 = getViewBinding().multiButtonItemContainer;
        Intrinsics.checkNotNullExpressionValue(multiButtonItemContainer2, "multiButtonItemContainer");
        buttonsBinder.bind(viewHolder, multiButtonItemContainer2, state, actionHandler.getHandler(), this.references);
        VerticalMultiButtonContainerView multiButtonItemContainer3 = getViewBinding().multiButtonItemContainer;
        Intrinsics.checkNotNullExpressionValue(multiButtonItemContainer3, "multiButtonItemContainer");
        ViewExtKt.show(multiButtonItemContainer3);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindTopRightButtons(List<? extends Object> topRightButtons) {
        if (topRightButtons == null) {
            RecyclerView topRightButtonsRV = getViewBinding().topRightButtonsRV;
            Intrinsics.checkNotNullExpressionValue(topRightButtonsRV, "topRightButtonsRV");
            ViewExtKt.gone(topRightButtonsRV);
            return;
        }
        TopRightButtonAdapter topRightButtonAdapter = this.topRightButtonsAdapter;
        if (topRightButtonAdapter == null) {
            Intrinsics.n("topRightButtonsAdapter");
            throw null;
        }
        topRightButtonAdapter.submitList(topRightButtons);
        RecyclerView topRightButtonsRV2 = getViewBinding().topRightButtonsRV;
        Intrinsics.checkNotNullExpressionValue(topRightButtonsRV2, "topRightButtonsRV");
        ViewExtKt.show(topRightButtonsRV2);
    }
}
