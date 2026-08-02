package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Am.b;
import E.RunnableC2901q;
import Fv.RunnableC3061a;
import L3.p;
import WZ.t;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ei0.InterfaceC6369b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.extensions.AnalyticsExtensionsKt;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityHelper;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.network.cache.ForceNetworkRefreshParameters;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.flags.CatalogInSearchSuggestionsEnabled;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate;
import ru.ozon.app.android.search.widgets.commonTapTags.SearchBarValueFormatter;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchLinkGenerator;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModelKt;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.SearchAnalyticsCustomizedParams;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.RefreshDataWrapper;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3VO;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;
import ru.ozon.app.android.search.widgets.utils.LiveDataDebounceExtKt;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002z}\b\u0001\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J/\u0010-\u001a\u00020\t2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u00100J\u0017\u00104\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u00100J\u001d\u0010=\u001a\u00020\t*\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u000206H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u00100J\u000f\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bB\u00100J\u0019\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020\t2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020DH\u0002¢\u0006\u0004\bM\u0010NJ!\u0010Q\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\b2\u0006\u0010P\u001a\u00020DH\u0002¢\u0006\u0004\bQ\u0010NJ\u000f\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u00100J\u0013\u0010S\u001a\u00020\t*\u00020\u0002H\u0003¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\u00020\t*\u00020\u0002H\u0002¢\u0006\u0004\bU\u0010TJ\u000f\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u00100J\u000f\u0010W\u001a\u00020\bH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020DH\u0002¢\u0006\u0004\bY\u0010ZJ\u0013\u0010[\u001a\u00020\t*\u00020;H\u0002¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\t*\u00020;2\b\u0010O\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b]\u0010>J\u0019\u0010^\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010aR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010gR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010iR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010jR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010kR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010lR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010mR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010nR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010oR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010pR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0087\u0001"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate;", "", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView;", "searchBarView", "Lkotlin/Function0;", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "modelProvider", "Lkotlin/Function1;", "", "", "queryCallback", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "Landroidx/lifecycle/J;", "viewLifecycleOwner", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "keyboardVisibilityHelper", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "sharedCarouselViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "clearSearchTextViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "tapTagsV2ViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "tapTagsV3ViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "searchByImageViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "searchByImageRouter", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "modifySearchUrlViewModel", "Lei0/b;", "ozonTracker", "LSg/a;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerFragmentController;Landroidx/lifecycle/J;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/common/SearchUrlPrefetchService;Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;Lei0/b;LSg/a;)V", "loadingAction", "successAction", "observePrefetchLoad", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "onDestroy", "()V", "onScreenStateViewAction", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "searchByImage", "updatePhotoSearchIconVisibility", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;)V", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "newModel", "updateSearchModel", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;)V", "bind", "Landroid/widget/EditText;", SearchIntents.EXTRA_QUERY, "setTextFromBind", "(Landroid/widget/EditText;Ljava/lang/String;)V", "getCorrectedSearchBarVO", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "observeLifecycleContainer", "observeViewModelAction", "actionUrl", "", "areLinksNotSame", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;", "data", "handleTapTagsV3Refresh", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;)V", "suggestedTapTag", "shouldOverrideExistingText", "onSuggestedTapTagClicked", "(Ljava/lang/String;Z)V", "newText", "fromBind", "onTextChanged", "setUpKeyboardAnimationCallback", "setupSearch", "(Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView;)V", "setupClickListeners", "observeBusEvents", "deeplinkFromSearchBarModel", "()Ljava/lang/String;", "isDialogSearchFeature", "()Z", "toggleKeyboard", "(Landroid/widget/EditText;)V", "setTextWithSelection", "sendSearchAnalyticsEvent", "(Ljava/lang/String;)V", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerFragmentController;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "Lei0/b;", "LSg/a;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "maxQueryLength", "Ljava/lang/Integer;", "isQueryFromBind", "Z", "ru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate$editTextTextWatcher$1", "editTextTextWatcher", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate$editTextTextWatcher$1;", "ru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate$scrollListener$1", "scrollListener", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate$scrollListener$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "getModel", "()Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "model", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchBarViewDelegate {

    @NotNull
    private final ActiveSearchBarViewModel activeSearchBarViewModel;

    @NotNull
    private final Sg.a analyticsScreenStorage;

    @NotNull
    private final ClearSearchTextViewModel clearSearchTextViewModel;

    @NotNull
    private final ComposerFragmentController composer;

    @NotNull
    private final SearchBarViewDelegate$editTextTextWatcher$1 editTextTextWatcher;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Handler handler;
    private boolean isQueryFromBind;

    @NotNull
    private final KeyboardVisibilityHelper keyboardVisibilityHelper;
    private Integer maxQueryLength;

    @NotNull
    private final Function0<StaticNavBarModel> modelProvider;

    @NotNull
    private final ModifySearchUrlViewModel modifySearchUrlViewModel;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final Function1<String, Unit> queryCallback;

    @NotNull
    private final SearchBarViewDelegate$scrollListener$1 scrollListener;

    @NotNull
    private final StaticSearchBarView searchBarView;

    @NotNull
    private final SearchByImageRouter searchByImageRouter;

    @NotNull
    private final SearchByImageViewModel searchByImageViewModel;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final SharedCarouselViewModel sharedCarouselViewModel;

    @NotNull
    private final TapTagsV2ViewModel tapTagsV2ViewModel;

    @NotNull
    private final TapTagsV3ViewModel tapTagsV3ViewModel;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    @NotNull
    private final J viewLifecycleOwner;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$editTextTextWatcher$1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$scrollListener$1] */
    public SearchBarViewDelegate(@NotNull StaticSearchBarView searchBarView, @NotNull Function0<StaticNavBarModel> modelProvider, @NotNull Function1<? super String, Unit> queryCallback, @NotNull ComposerFragmentController composer, @NotNull J viewLifecycleOwner, @NotNull FeatureChecker featureChecker, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull KeyboardVisibilityHelper keyboardVisibilityHelper, @NotNull SharedCarouselViewModel sharedCarouselViewModel, @NotNull ActiveSearchBarViewModel activeSearchBarViewModel, @NotNull ClearSearchTextViewModel clearSearchTextViewModel, @NotNull TapTagsV2ViewModel tapTagsV2ViewModel, @NotNull TapTagsV3ViewModel tapTagsV3ViewModel, @NotNull SearchByImageViewModel searchByImageViewModel, @NotNull SearchByImageRouter searchByImageRouter, @NotNull ModifySearchUrlViewModel modifySearchUrlViewModel, @NotNull InterfaceC6369b ozonTracker, @NotNull Sg.a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(searchBarView, "searchBarView");
        Intrinsics.checkNotNullParameter(modelProvider, "modelProvider");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(keyboardVisibilityHelper, "keyboardVisibilityHelper");
        Intrinsics.checkNotNullParameter(sharedCarouselViewModel, "sharedCarouselViewModel");
        Intrinsics.checkNotNullParameter(activeSearchBarViewModel, "activeSearchBarViewModel");
        Intrinsics.checkNotNullParameter(clearSearchTextViewModel, "clearSearchTextViewModel");
        Intrinsics.checkNotNullParameter(tapTagsV2ViewModel, "tapTagsV2ViewModel");
        Intrinsics.checkNotNullParameter(tapTagsV3ViewModel, "tapTagsV3ViewModel");
        Intrinsics.checkNotNullParameter(searchByImageViewModel, "searchByImageViewModel");
        Intrinsics.checkNotNullParameter(searchByImageRouter, "searchByImageRouter");
        Intrinsics.checkNotNullParameter(modifySearchUrlViewModel, "modifySearchUrlViewModel");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.searchBarView = searchBarView;
        this.modelProvider = modelProvider;
        this.queryCallback = queryCallback;
        this.composer = composer;
        this.viewLifecycleOwner = viewLifecycleOwner;
        this.featureChecker = featureChecker;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.keyboardVisibilityHelper = keyboardVisibilityHelper;
        this.sharedCarouselViewModel = sharedCarouselViewModel;
        this.activeSearchBarViewModel = activeSearchBarViewModel;
        this.clearSearchTextViewModel = clearSearchTextViewModel;
        this.tapTagsV2ViewModel = tapTagsV2ViewModel;
        this.tapTagsV3ViewModel = tapTagsV3ViewModel;
        this.searchByImageViewModel = searchByImageViewModel;
        this.searchByImageRouter = searchByImageRouter;
        this.modifySearchUrlViewModel = modifySearchUrlViewModel;
        this.ozonTracker = ozonTracker;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.handler = new Handler(Looper.getMainLooper());
        this.editTextTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$editTextTextWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                boolean z11;
                Intrinsics.checkNotNullParameter(s11, "s");
                SearchBarViewDelegate searchBarViewDelegate = SearchBarViewDelegate.this;
                String obj = s11.toString();
                z11 = SearchBarViewDelegate.this.isQueryFromBind;
                searchBarViewDelegate.onTextChanged(obj, z11);
                SearchBarViewDelegate.this.isQueryFromBind = false;
            }
        };
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                StaticSearchBarView staticSearchBarView;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (1 == newState) {
                    SearchBarViewDelegate searchBarViewDelegate = SearchBarViewDelegate.this;
                    staticSearchBarView = searchBarViewDelegate.searchBarView;
                    searchBarViewDelegate.toggleKeyboard(staticSearchBarView.getSearchEditText());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                StaticSearchBarView staticSearchBarView;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                if (dy != 0) {
                    SearchBarViewDelegate searchBarViewDelegate = SearchBarViewDelegate.this;
                    staticSearchBarView = searchBarViewDelegate.searchBarView;
                    searchBarViewDelegate.toggleKeyboard(staticSearchBarView.getSearchEditText());
                }
            }
        };
        this.touchListener = new View.OnTouchListener() { // from class: kI.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z11;
                z11 = SearchBarViewDelegate.touchListener$lambda$0(SearchBarViewDelegate.this, view, motionEvent);
                return z11;
            }
        };
        observeBusEvents();
        observeLifecycleContainer();
        activeSearchBarViewModel.subscribeForSearchValue();
        observeViewModelAction();
        setupSearch(searchBarView);
        setupClickListeners(searchBarView);
        bind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean areLinksNotSame(String actionUrl) {
        Set<String> queryParameterNames;
        String deeplinkFromSearchBarModel = deeplinkFromSearchBarModel();
        if (!ActiveSearchBarViewModelKt.isFavoritePage(deeplinkFromSearchBarModel)) {
            return !Intrinsics.d(deeplinkFromSearchBarModel, actionUrl);
        }
        Uri parse = Uri.parse(deeplinkFromSearchBarModel);
        LinkedHashMap linkedHashMap = null;
        Uri parse2 = actionUrl != null ? Uri.parse(actionUrl) : null;
        Set<String> queryParameterNames2 = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames2, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames2;
        int h11 = U.h(C7714v.z(set, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
        for (Object obj : set) {
            linkedHashMap2.put(obj, parse.getQueryParameter((String) obj));
        }
        if (parse2 != null && (queryParameterNames = parse2.getQueryParameterNames()) != null) {
            Set<String> set2 = queryParameterNames;
            int h12 = U.h(C7714v.z(set2, 10));
            linkedHashMap = new LinkedHashMap(h12 >= 16 ? h12 : 16);
            for (Object obj2 : set2) {
                linkedHashMap.put(obj2, parse2.getQueryParameter((String) obj2));
            }
        }
        if (linkedHashMap == null || linkedHashMap2.size() != linkedHashMap.size()) {
            return true;
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (!Intrinsics.d(linkedHashMap.get((String) entry.getKey()), (String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    private final void bind() {
        ActiveSearchBarVO correctedSearchBarVO = getCorrectedSearchBarVO();
        this.maxQueryLength = correctedSearchBarVO.getMaxSearchQueryTextLength();
        AppCompatEditText searchEditText = this.searchBarView.getSearchEditText();
        searchEditText.setHint(correctedSearchBarVO.getHint());
        Integer maxSearchQueryTextLength = correctedSearchBarVO.getMaxSearchQueryTextLength();
        if (maxSearchQueryTextLength != null) {
            searchEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxSearchQueryTextLength.intValue())});
        }
        this.searchBarView.setClickListeners(new SearchBarViewDelegate$bind$2(this));
        this.activeSearchBarViewModel.updateSearchModel(correctedSearchBarVO);
        this.sharedCarouselViewModel.setPageViewId(this.activeSearchBarViewModel.getPageViewId());
        this.activeSearchBarViewModel.setSearchDelay(correctedSearchBarVO.getSearchDelay());
        this.activeSearchBarViewModel.setSearchQuery(this.clearSearchTextViewModel.getNeedClearText() ? "" : correctedSearchBarVO.getSearchText(), new SearchBarViewDelegate$bind$3(this));
    }

    private final String deeplinkFromSearchBarModel() {
        return SearchLinkGenerator.INSTANCE.getPageLink(getModel().getSearchBarVo().getDeeplink(), getModel().getSearchBarVo().getSearchText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActiveSearchBarVO getCorrectedSearchBarVO() {
        String searchText;
        String deeplink;
        ActiveSearchBarVO copy;
        TapTagsV3VO.SuggestedPage suggestedPage;
        if (!isDialogSearchFeature()) {
            return getModel().getSearchBarVo();
        }
        ActiveSearchBarVO searchBarVo = getModel().getSearchBarVo();
        TapTagsV3VO value = this.tapTagsV3ViewModel.getTapTags().getValue();
        if (value == null || (searchText = value.getSearchText()) == null) {
            searchText = getModel().getSearchBarVo().getSearchText();
        }
        String str = searchText;
        TapTagsV3VO value2 = this.tapTagsV3ViewModel.getTapTags().getValue();
        if (value2 == null || (suggestedPage = value2.getSuggestedPage()) == null || (deeplink = suggestedPage.getRefreshLink()) == null) {
            deeplink = getModel().getSearchBarVo().getDeeplink();
        }
        copy = searchBarVo.copy((r35 & 1) != 0 ? searchBarVo.id : 0L, (r35 & 2) != 0 ? searchBarVo.searchText : str, (r35 & 4) != 0 ? searchBarVo.hint : null, (r35 & 8) != 0 ? searchBarVo.deeplink : deeplink, (r35 & 16) != 0 ? searchBarVo.link : null, (r35 & 32) != 0 ? searchBarVo.returnKeyType : null, (r35 & 64) != 0 ? searchBarVo.keyboardSearchTrackingInfo : null, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? searchBarVo.searchDelay : null, (r35 & 256) != 0 ? searchBarVo.cornerRadius : 0.0f, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? searchBarVo.backgroundColor : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? searchBarVo.searchBarTintColor : null, (r35 & 2048) != 0 ? searchBarVo.maxSearchQueryTextLength : null, (r35 & 4096) != 0 ? searchBarVo.isDynamicUpdateDisabled : null, (r35 & 8192) != 0 ? searchBarVo.searchByImage : null, (r35 & 16384) != 0 ? searchBarVo.minTextLength : null);
        this.activeSearchBarViewModel.updateSearchModel(copy);
        return copy;
    }

    private final StaticNavBarModel getModel() {
        return this.modelProvider.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTapTagsV3Refresh(RefreshDataWrapper data) {
        View view;
        RecyclerView composerRecyclerView;
        if (SearchBarUtilsKt.searchParamsHasChanged(data.getSuggestedPage().getRefreshLink(), this.composer.getScreen().c().r().b().m().c()) || h.K(String.valueOf(this.searchBarView.getSearchEditText().getText()))) {
            t tokenizedEvent = data.getSuggestedPage().getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composer.getReferences().getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
            InterfaceC7851b.a.e(this.composer.getReferences().getController(), data.getSuggestedPage().getRefreshLink(), null, ForceNetworkRefreshParameters.INSTANCE, 2);
            ComponentCallbacksC5392m c11 = this.composer.getReferences().getContainer().c();
            if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
                return;
            }
            composerRecyclerView.post(new p(composerRecyclerView, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDialogSearchFeature() {
        return this.featureChecker.isEnabled(CatalogInSearchSuggestionsEnabled.INSTANCE) && ActiveSearchBarViewModelKt.isFreshPage(deeplinkFromSearchBarModel());
    }

    private final void observeBusEvents() {
        this.composer.getController().getEvents().observe(this.viewLifecycleOwner, new SearchBarViewDelegate$sam$androidx_lifecycle_Observer$0(new SearchBarViewDelegate$observeBusEvents$1(this)));
    }

    private final void observeLifecycleContainer() {
        AbstractC5434v lifecycle = this.composer.getReferences().getContainer().g().getLifecycle();
        lifecycle.a(new SearchBarViewDelegate$observeLifecycleContainer$1(this, lifecycle));
    }

    private final void observeViewModelAction() {
        InterfaceC2395h<ActiveSearchBarViewModel.Action> actionFlow = this.activeSearchBarViewModel.getActionFlow();
        AbstractC5434v lifecycle = this.composer.getReferences().getContainer().g().getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(actionFlow, lifecycle, bVar), new SearchBarViewDelegate$observeViewModelAction$1(this, null)), K.a(this.composer.getReferences().getContainer().g()));
        LiveDataDebounceExtKt.debounce(this.tapTagsV3ViewModel.getActionLiveData(), this.activeSearchBarViewModel.getSearchDebounce(String.valueOf(this.searchBarView.getSearchEditText().getText())), x0.a(this.activeSearchBarViewModel)).observe(this.composer.getReferences().getContainer().g(), new SearchBarViewDelegate$sam$androidx_lifecycle_Observer$0(new SearchBarViewDelegate$observeViewModelAction$2(this)));
        this.searchByImageViewModel.getOpenPhotoLoad().observe(this.viewLifecycleOwner, new SearchBarViewDelegate$sam$androidx_lifecycle_Observer$0(new SearchBarViewDelegate$observeViewModelAction$3(this)));
        C2399j.C(new C2408n0(C5427n.a(this.searchByImageViewModel.getShowErrorNotificationFlow(), this.viewLifecycleOwner.getLifecycle(), bVar), new SearchBarViewDelegate$observeViewModelAction$4(this, null)), K.a(this.viewLifecycleOwner));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenStateViewAction$lambda$3(SearchBarViewDelegate searchBarViewDelegate) {
        searchBarViewDelegate.onTextChanged(String.valueOf(searchBarViewDelegate.searchBarView.getSearchEditText().getText()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuggestedTapTagClicked(String suggestedTapTag, boolean shouldOverrideExistingText) {
        setTextWithSelection(this.searchBarView.getSearchEditText(), SearchBarValueFormatter.INSTANCE.formatSearchValueWithTapTags(String.valueOf(this.searchBarView.getSearchEditText().getText()), suggestedTapTag, shouldOverrideExistingText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextChanged(String newText, boolean fromBind) {
        ActiveSearchBarVO correctedSearchBarVO = getCorrectedSearchBarVO();
        if (Intrinsics.d(correctedSearchBarVO.getIsDynamicUpdateDisabled(), Boolean.TRUE)) {
            return;
        }
        StaticSearchBarView staticSearchBarView = this.searchBarView;
        boolean z11 = newText == null || newText.length() == 0;
        staticSearchBarView.getClearSearchView().setVisibility(!z11 ? 0 : 8);
        staticSearchBarView.showOrGonePhotoSearchIcon(z11 && correctedSearchBarVO.getSearchByImage() != null);
        if (newText == null) {
            return;
        }
        if (isDialogSearchFeature()) {
            this.queryCallback.invoke(newText);
        }
        this.activeSearchBarViewModel.configureTapTagsRequestBody(newText, fromBind, new SearchBarViewDelegate$onTextChanged$1$1(this, fromBind));
        this.activeSearchBarViewModel.onQueryChanged(newText);
        if (fromBind || this.clearSearchTextViewModel.getNeedClearText()) {
            return;
        }
        sendSearchAnalyticsEvent(newText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sendSearchAnalyticsEvent(String newText) {
        InterfaceC6369b interfaceC6369b = this.ozonTracker;
        ActionType.Custom custom = new ActionType.Custom("query_input");
        String str = null;
        String str2 = null;
        Long l11 = null;
        Long l12 = null;
        Integer num = null;
        Long l13 = null;
        String str3 = null;
        String str4 = null;
        EventEntity.Widget widget = new EventEntity.Widget(null, "catalog.searchBarMobile", str, str2, l11, null, null, null, l12, num, null, l13, null, str3, null, str4, null, null, null, null, 1048573, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        EventEntity.Properties properties = new EventEntity.Properties(null, str, str2, l11, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l12, num, 0 == true ? 1 : 0, l13, 0 == true ? 1 : 0, str3, 0 == true ? 1 : 0, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr, objArr2, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(newText), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, 16383, null);
        Sg.a d11 = this.analyticsScreenStorage.d();
        interfaceC6369b.sendEvent(custom, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : properties, (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : widget, AnalyticsExtensionsKt.toPage(d11 != null ? d11.a() : null), (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextFromBind(EditText editText, String str) {
        this.isQueryFromBind = true;
        setTextWithSelection(editText, str);
    }

    private final void setTextWithSelection(EditText editText, String str) {
        String cut;
        if (str == null || (cut = SearchBarUtilsKt.cut(str, this.maxQueryLength)) == null) {
            return;
        }
        editText.setText(cut);
        editText.setSelection(cut.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpKeyboardAnimationCallback() {
        if (Build.VERSION.SDK_INT < 30 || !isDialogSearchFeature()) {
            return;
        }
        this.searchBarView.getSearchEditText().setWindowInsetsAnimationCallback(new SearchBarViewDelegate$setUpKeyboardAnimationCallback$1(this));
    }

    private final void setupClickListeners(StaticSearchBarView staticSearchBarView) {
        staticSearchBarView.getClearSearchView().setOnClickListener(new b(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$20(SearchBarViewDelegate searchBarViewDelegate, View view) {
        searchBarViewDelegate.searchBarView.getSearchEditText().requestFocus();
        Editable text = searchBarViewDelegate.searchBarView.getSearchEditText().getText();
        if (text != null) {
            text.clear();
        }
        KeyboardUtilsKt.showKeyboard(searchBarViewDelegate.searchBarView.getSearchEditText());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setupSearch(StaticSearchBarView staticSearchBarView) {
        this.searchBarView.getSearchEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kI.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                SearchBarViewDelegate.setupSearch$lambda$13(SearchBarViewDelegate.this, view, z11);
            }
        });
        if (!ActiveSearchBarViewModelKt.isFreshSuborders(deeplinkFromSearchBarModel()) && (!isDialogSearchFeature() || String.valueOf(this.searchBarView.getSearchEditText().getText()).length() == 0)) {
            this.handler.post(new RunnableC2901q(this, 3));
        }
        this.searchBarView.setReturnKeyType(getCorrectedSearchBarVO().getReturnKeyType());
        this.searchBarView.getSearchEditText().setOnKeyListener(new View.OnKeyListener() { // from class: kI.c
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean z11;
                z11 = SearchBarViewDelegate.setupSearch$lambda$19(SearchBarViewDelegate.this, view, i11, keyEvent);
                return z11;
            }
        });
        boolean z11 = getCorrectedSearchBarVO().getSearchText().length() == 0;
        staticSearchBarView.getClearSearchView().setVisibility(!z11 ? 0 : 8);
        staticSearchBarView.showOrGonePhotoSearchIcon(z11 && getCorrectedSearchBarVO().getSearchByImage() != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearch$lambda$13(SearchBarViewDelegate searchBarViewDelegate, View view, boolean z11) {
        if (z11) {
            KeyboardUtilsKt.showKeyboard(searchBarViewDelegate.searchBarView.getSearchEditText());
            searchBarViewDelegate.searchBarView.getSearchEditText().setOnFocusChangeListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearch$lambda$14(SearchBarViewDelegate searchBarViewDelegate) {
        searchBarViewDelegate.searchBarView.getSearchEditText().requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupSearch$lambda$19(SearchBarViewDelegate searchBarViewDelegate, View view, int i11, KeyEvent keyEvent) {
        if (i11 != 66) {
            return false;
        }
        t keyboardSearchTrackingInfo = searchBarViewDelegate.getCorrectedSearchBarVO().getKeyboardSearchTrackingInfo();
        if (keyboardSearchTrackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processAnyEvents(searchBarViewDelegate.composer.getReferences().getTokenizedAnalytics(), keyboardSearchTrackingInfo, new SearchBarViewDelegate$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(searchBarViewDelegate.activeSearchBarViewModel.m981pageIdModifierUsgXMg(SearchAnalyticsCustomizedParams.m982boximpl(SearchAnalyticsCustomizedParams.m983constructorimpl(String.valueOf(searchBarViewDelegate.searchBarView.getSearchEditText().getText()))))));
        }
        if (searchBarViewDelegate.getCorrectedSearchBarVO().getReturnKeyType() == SearchBarVO.ReturnKeyType.DONE) {
            searchBarViewDelegate.toggleKeyboard(searchBarViewDelegate.searchBarView.getSearchEditText());
            return true;
        }
        String valueOf = String.valueOf(searchBarViewDelegate.searchBarView.getSearchEditText().getText());
        int length = valueOf.length();
        Integer minTextLength = searchBarViewDelegate.getModel().getSearchBarVo().getMinTextLength();
        if (length < (minTextLength != null ? minTextLength.intValue() : 2)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return true;
        }
        SearchUrlPrefetchService.DefaultImpls.navigateWhenRequestPrefetched$default(searchBarViewDelegate.searchUrlPrefetchService, searchBarViewDelegate.modifySearchUrlViewModel.modifySearchUrl(searchBarViewDelegate.activeSearchBarViewModel.getSearchResultDeeplink(valueOf)), searchBarViewDelegate.composer.getReferences().getContainer().g(), new SearchBarViewDelegate$setupSearch$3$3$1$1(searchBarViewDelegate, U.f(new Pair("IS_ORDINARY_SEARCH", Boolean.TRUE), new Pair("hint", searchBarViewDelegate.getCorrectedSearchBarVO().getHint()))), null, 8, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleKeyboard(EditText editText) {
        editText.clearFocus();
        KeyboardUtilsKt.hideKeyboard(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(SearchBarViewDelegate searchBarViewDelegate, View view, MotionEvent motionEvent) {
        KeyboardUtilsKt.hideKeyboard(searchBarViewDelegate.searchBarView.getSearchEditText());
        return false;
    }

    public final void observePrefetchLoad(@NotNull Function0<Unit> loadingAction, @NotNull Function1<? super String, Unit> successAction) {
        TapTagsV3VO value;
        TapTagsV3VO.SuggestedPage suggestedPage;
        String refreshLink;
        Intrinsics.checkNotNullParameter(loadingAction, "loadingAction");
        Intrinsics.checkNotNullParameter(successAction, "successAction");
        String deeplinkFromSearchBarModel = deeplinkFromSearchBarModel();
        if (isDialogSearchFeature() && (value = this.tapTagsV3ViewModel.getTapTags().getValue()) != null && (suggestedPage = value.getSuggestedPage()) != null && (refreshLink = suggestedPage.getRefreshLink()) != null) {
            deeplinkFromSearchBarModel = refreshLink;
        }
        this.searchUrlPrefetchService.navigateWhenRequestPrefetched(deeplinkFromSearchBarModel, this.composer.getReferences().getContainer().g(), successAction, loadingAction);
    }

    public final void onDestroy() {
        this.searchBarView.clearFocus();
        KeyboardUtilsKt.hideKeyboard(this.searchBarView.getSearchEditText());
    }

    public final void onScreenStateViewAction() {
        this.searchBarView.getSearchEditText().post(new RunnableC3061a(this, 1));
    }

    public final void updatePhotoSearchIconVisibility(ActiveSearchBarVO.SearchByImageVO searchByImage) {
        Editable text;
        StaticSearchBarView staticSearchBarView = this.searchBarView;
        staticSearchBarView.showOrGonePhotoSearchIcon(searchByImage != null && ((text = staticSearchBarView.getSearchEditText().getText()) == null || text.length() == 0));
    }

    public final void updateSearchModel(@NotNull ActiveSearchBarVO newModel) {
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        this.activeSearchBarViewModel.updateSearchModel(newModel);
    }
}
