package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import Ae.C2399j;
import Ae.C2408n0;
import B0.C2454a;
import T00.a;
import T00.e;
import Ve.C4598rp;
import Vg.d;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j10.InterfaceC7238a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipHelper;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.common.cache.handler.search.SearchCacheGroup;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.flags.PageTypesWithDisabledSuggestsPrefetch;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarColors;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.StaticNavBarModel;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchLinkGenerator;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.navBar.NavBarColors;
import ru.ozon.app.android.storefront.navBar.NavBarModelProvider;
import ru.ozon.app.android.storefront.navBar.NavBarSearchRedesignProvider;
import ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import xe.B0;

@Metadata(d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002\u0091\u0001\b\u0001\u0018\u0000 ¦\u00012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002¦\u0001B\u0089\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\n\u0010'\u001a\u00060%j\u0002`&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010,J#\u00106\u001a\u00020*2\u0006\u00102\u001a\u00020\u00022\n\u00105\u001a\u000603j\u0002`4H\u0014¢\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020*2\u001c\u0010;\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0012\u0006\u0012\u0004\u0018\u00010\u000408H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020*2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020*2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020*2\u0006\u0010F\u001a\u00020>2\u0006\u0010G\u001a\u00020@H\u0002¢\u0006\u0004\bH\u0010CJ\u000f\u0010I\u001a\u00020*H\u0002¢\u0006\u0004\bI\u0010,J\u0017\u0010J\u001a\u00020*2\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010O\u001a\u00020N2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ!\u0010S\u001a\u00020*2\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u00020>2\n\u0010U\u001a\u000603j\u0002`4H\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020>H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020L2\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\bZ\u0010[J\u001d\u0010^\u001a\u00020]*\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020*2\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b`\u0010KJ\u0019\u0010b\u001a\u00020>2\b\u0010a\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020*H\u0002¢\u0006\u0004\bd\u0010,J\u000f\u0010e\u001a\u00020*H\u0002¢\u0006\u0004\be\u0010,J\u0013\u0010g\u001a\u00020f*\u00020\u0002H\u0002¢\u0006\u0004\bg\u0010hJ\u0013\u0010k\u001a\u00020j*\u00020iH\u0002¢\u0006\u0004\bk\u0010lR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010m\u001a\u0004\bn\u0010oR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010pR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010qR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010sR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010tR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010uR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010vR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010wR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010xR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010yR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010zR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010{R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010|R\u0018\u0010'\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001f\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`48\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R1\u0010\u008b\u0001\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\"\u0010\u0096\u0001\u001a\r \u0095\u0001*\u0005\u0018\u00010\u0094\u00010\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R$\u0010\u0099\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020*088\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008c\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R#\u0010\u009f\u0001\u001a\f\u0018\u00010\u009d\u0001j\u0005\u0018\u0001`\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010o¨\u0006§\u0001"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider;", "Lru/ozon/app/android/storefront/navBar/v2/NavBarRepaintable;", "Lru/ozon/app/android/storefront/navBar/NavBarSearchRedesignProvider;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "searchByImageViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "searchByImageRouter", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "composerStore", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "modifySearchUrlViewModel", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/SearchUrlPrefetchService;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lj10/a;Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;Landroid/content/SharedPreferences;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/user/UserManager;LVg/d;)V", "", "onAttach", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;Ll20/d;)V", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "provideNavBarModelListener", "(Lkotlin/jvm/functions/Function1;)V", "", "hasAlphaChangingFloor", "", "alpha", "onNavbarConfigured", "(ZF)V", "onFloorAlphaChanged", "(F)V", "isDynamicColorsOnScrollEnabled", "blendPercentage", "setupSearchBarColorsOnScroll", "observeViewModelActions", "prefetch", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;)V", "", "onboardingKey", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "showOnboardingIfExist", "(Ljava/lang/String;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;)V", "widgetInfo", "isPageInPrefetchBlackList", "(Ll20/d;)Z", "isHomePage", "()Z", "getPrefetchDeeplink", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;)Ljava/lang/String;", "navBarModelInfo", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "formatNavBarModel", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;)Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "showTooltipIfNeeded", "tooltipKey", "needToShowTooltip", "(Ljava/lang/String;)Z", "subscribeToDismissEvents", "dismissTooltip", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "toActiveVO", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;)Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "toVo", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;)Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lj10/a;", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/user/UserManager;", "LVg/d;", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarColors;", "searchBarColors", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarColors;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Ll20/d;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "dynamicColors", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "navbarModelListener", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Boolean;", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangeListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "ru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarViewHolder$scrollListener$1;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarView;", "kotlin.jvm.PlatformType", "searchBarView", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarView;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "tooltipHelper", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "showTooltipRunnable", "Ljava/lang/Runnable;", "Lxe/B0;", "openSuggestsScreenJob", "Lxe/B0;", "getComposerRootView", "composerRootView", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarViewHolder extends k<SearchBarVO> implements NavBarModelProvider, NavBarRepaintable, NavBarSearchRedesignProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final InterfaceC7238a<l> composerStore;

    @NotNull
    private final View containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private SearchBarDTO.DynamicOnScrollColors dynamicColors;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final Handler handler;
    private Boolean hasAlphaChangingFloor;
    private l20.d info;

    @NotNull
    private final ModifySearchUrlViewModel modifySearchUrlViewModel;
    private Function1<? super kotlin.coroutines.d<? super NavBarModelProvider.NavBarModel>, ? extends Object> navbarModelListener;

    @NotNull
    private final AppBarLayout.f offsetChangeListener;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final CommonOnboardingRepository onboardingRepository;
    private B0 openSuggestsScreenJob;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final SearchBarViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final SearchBarColors searchBarColors;
    private final SearchBarView searchBarView;

    @NotNull
    private final SearchByImageRouter searchByImageRouter;

    @NotNull
    private final SearchByImageViewModel searchByImageViewModel;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final SharedPreferences sharedPreferences;
    private Runnable showTooltipRunnable;

    @NotNull
    private final CartTooltipHelper tooltipHelper;

    @NotNull
    private final UserManager userManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float ONBOARDING_CORNER_RADIUS = ResourceExtKt.toPxF(16);
    private static final int ONBOARDING_ADDITIONAL_MARGIN = UiExtKt.toPx(8);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarViewHolder$Companion;", "", "<init>", "()V", "ONBOARDING_CORNER_RADIUS", "", "getONBOARDING_CORNER_RADIUS", "()F", "ONBOARDING_ADDITIONAL_MARGIN", "", "getONBOARDING_ADDITIONAL_MARGIN", "()I", "DEFAULT_TOOLTIP_DISMISS_TIMEOUT", "", "FAVORITES_SEARCH_TOOLTIP_PREFS_KEY", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getONBOARDING_ADDITIONAL_MARGIN() {
            return SearchBarViewHolder.ONBOARDING_ADDITIONAL_MARGIN;
        }

        public final float getONBOARDING_CORNER_RADIUS() {
            return SearchBarViewHolder.ONBOARDING_CORNER_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v4, types: [ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$scrollListener$1] */
    public SearchBarViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull SearchByImageViewModel searchByImageViewModel, @NotNull SearchByImageRouter searchByImageRouter, @NotNull CommonOnboardingRepository onboardingRepository, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull InterfaceC7238a<l> composerStore, @NotNull ModifySearchUrlViewModel modifySearchUrlViewModel, @NotNull SharedPreferences sharedPreferences, @NotNull AuthStateStorage authStateStorage, @NotNull UserManager userManager, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(searchByImageViewModel, "searchByImageViewModel");
        Intrinsics.checkNotNullParameter(searchByImageRouter, "searchByImageRouter");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(composerStore, "composerStore");
        Intrinsics.checkNotNullParameter(modifySearchUrlViewModel, "modifySearchUrlViewModel");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.references = references;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.featureChecker = featureChecker;
        this.featureService = featureService;
        this.searchByImageViewModel = searchByImageViewModel;
        this.searchByImageRouter = searchByImageRouter;
        this.onboardingRepository = onboardingRepository;
        this.onBoardingViewModel = onBoardingViewModel;
        this.composerStore = composerStore;
        this.modifySearchUrlViewModel = modifySearchUrlViewModel;
        this.sharedPreferences = sharedPreferences;
        this.authStateStorage = authStateStorage;
        this.userManager = userManager;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.searchBarColors = new SearchBarColors(getContext());
        this.handler = new Handler(Looper.getMainLooper());
        this.offsetChangeListener = new AppBarLayout.f() { // from class: RI.e
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                SearchBarViewHolder.offsetChangeListener$lambda$1(SearchBarViewHolder.this, appBarLayout, i11);
            }
        };
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Handler handler;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                handler = SearchBarViewHolder.this.handler;
                handler.removeCallbacksAndMessages(null);
                SearchBarViewHolder.this.dismissTooltip();
            }
        };
        SearchBarView searchBarView = (SearchBarView) getContainerView().findViewById(R$id.searchBarView);
        this.searchBarView = searchBarView;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new SearchBarViewHolder$actionHandler$1(this)).buildHandler();
        this.tooltipHelper = new CartTooltipHelper(references.getContainer().j());
        if (featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE)) {
            searchBarView.applyRedesign();
        }
        searchBarView.setClickListeners(new SearchBarViewHolder$1$1(this), new SearchBarViewHolder$1$2(this), new SearchBarViewHolder$1$3(this), new SearchBarViewHolder$1$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissTooltip() {
        View view;
        RecyclerView composerRecyclerView;
        this.tooltipHelper.onDismissTooltip();
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.removeOnScrollListener(this.scrollListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StaticNavBarModel formatNavBarModel(SearchBarVO searchBarVO, NavBarModelProvider.NavBarModel navBarModel) {
        StaticNavBarModel.NavBarInfo createEmpty;
        boolean z11 = searchBarVO.getSearchButton() != null;
        ActiveSearchBarVO activeVO = toActiveVO(searchBarVO);
        boolean z12 = searchBarVO.getScanItEnabled() && !z11;
        boolean z13 = searchBarVO.getSearchByImage() != null;
        boolean z14 = !z11;
        SearchBarVO.SearchButton searchButton = searchBarVO.getSearchButton();
        StaticNavBarModel.SearchButton searchButton2 = searchButton != null ? new StaticNavBarModel.SearchButton(searchButton.getIcon(), searchButton.getTestInfo()) : null;
        String searchBarBackgroundColor = this.searchBarColors.getSearchBarBackgroundColor(searchBarVO.getBackgroundColor());
        if (navBarModel == null || (createEmpty = formatNavBarModel$mapToStaticModel(navBarModel, this)) == null) {
            createEmpty = StaticNavBarModel.NavBarInfo.INSTANCE.createEmpty(getContext());
        }
        return new StaticNavBarModel(activeVO, z12, z13, z14, searchButton2, searchBarBackgroundColor, createEmpty);
    }

    private static final StaticNavBarModel.NavBarInfo formatNavBarModel$mapToStaticModel(NavBarModelProvider.NavBarModel navBarModel, SearchBarViewHolder searchBarViewHolder) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (Build.VERSION.SDK_INT != 28) {
            bitmap = navBarModel.getLeftActionsSnapshot();
            bitmap2 = navBarModel.getRightActionsSnapshot();
        } else {
            bitmap = null;
            bitmap2 = null;
        }
        boolean showBackButton = navBarModel.getShowBackButton();
        StaticNavBarModel.NavBarInfo.ActionsSnapshot actionsSnapshot = new StaticNavBarModel.NavBarInfo.ActionsSnapshot(bitmap, bitmap2);
        NavBarColors colors = navBarModel.getColors();
        if (colors == null) {
            colors = StaticNavBarModel.NavBarInfo.INSTANCE.createDefaultColors(searchBarViewHolder.getContext());
        }
        return new StaticNavBarModel.NavBarInfo(showBackButton, actionsSnapshot, colors);
    }

    private final View getComposerRootView() {
        View view;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        return (c11 == null || (view = c11.getView()) == null) ? ContextExtKt.getRootView(this.references.getContainer().a()) : view;
    }

    private final String getPrefetchDeeplink(SearchBarVO item) {
        return SearchLinkGenerator.INSTANCE.getPageLink(item.getDeeplink(), item.getSearchText());
    }

    private final void initDelegate(OnBoardingDTO onBoarding, String onboardingKey) {
        if (this.onboardingDelegate != null || onBoarding == null) {
            return;
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.references, getContainerView(), onBoarding, this, this.onBoardingViewModel, this.references.getTokenizedAnalytics(), 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new SearchBarViewHolder$initDelegate$1$1(this, onboardingKey));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    private final boolean isHomePage() {
        a b11;
        e h11;
        l20.d dVar = this.info;
        return Intrinsics.d((dVar == null || (b11 = dVar.b()) == null || (h11 = b11.h()) == null) ? null : h11.e(), "home");
    }

    private final boolean isPageInPrefetchBlackList(l20.d widgetInfo) {
        e h11;
        List l11 = h.l(this.featureService.getStringKey(PageTypesWithDisabledSuggestsPrefetch.INSTANCE), new char[]{','}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
        Iterator it = l11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        Set Y02 = C7714v.Y0(arrayList);
        a b11 = widgetInfo.b();
        return C7714v.A(Y02, (b11 == null || (h11 = b11.h()) == null) ? null : h11.e());
    }

    private final boolean needToShowTooltip(String tooltipKey) {
        long userId = this.userManager.getUserId();
        String string = this.sharedPreferences.getString("FAVORITES_SEARCH_TOOLTIP_PREFS_KEY", null);
        if (string != null) {
            if (string.equals(tooltipKey + "_" + userId)) {
                return false;
            }
        }
        return this.authStateStorage.isAuthenticated();
    }

    private final void observeViewModelActions() {
        this.searchByImageViewModel.getOpenPhotoLoad().observe(this.references.getContainer().g(), new SearchBarViewHolder$sam$androidx_lifecycle_Observer$0(new SearchBarViewHolder$observeViewModelActions$1(this)));
        C4598rp.f(this.references, new C2408n0(C5427n.a(this.searchByImageViewModel.getShowErrorNotificationFlow(), U7.d.c(this.references), AbstractC5434v.b.STARTED), new SearchBarViewHolder$observeViewModelActions$2(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offsetChangeListener$lambda$1(SearchBarViewHolder searchBarViewHolder, AppBarLayout appBarLayout, int i11) {
        View composerRootView;
        CollapsingToolbarLayout composerCollapsingToolbar;
        Intrinsics.checkNotNullParameter(appBarLayout, "<unused var>");
        if (searchBarViewHolder.hasAlphaChangingFloor != null || (composerRootView = searchBarViewHolder.getComposerRootView()) == null || (composerCollapsingToolbar = ComposerViewExtensionKt.composerCollapsingToolbar(composerRootView)) == null) {
            return;
        }
        boolean z11 = composerCollapsingToolbar.getHeight() + i11 > composerCollapsingToolbar.b();
        SearchBarVO boundData = searchBarViewHolder.getBoundData();
        searchBarViewHolder.searchBarView.setBackgroundColor(searchBarViewHolder.searchBarColors.getSearchBarBackgroundColor(boundData != null ? z11 ? boundData.getExpandedBackgroundColor() : boundData.getBackgroundColor() : null));
    }

    private final void prefetch(SearchBarVO item) {
        this.searchUrlPrefetchService.prefetch(getPrefetchDeeplink(item), SearchCacheGroup.INSTANCE, false);
    }

    private final void setupSearchBarColorsOnScroll(boolean isDynamicColorsOnScrollEnabled, float blendPercentage) {
        if (!AppTypeResolver.INSTANCE.isSelect(getContext())) {
            if (isDynamicColorsOnScrollEnabled) {
                this.searchBarView.updateColorsByScroll(blendPercentage, this.dynamicColors);
            }
        } else {
            SearchBarView searchBarView = this.searchBarView;
            SearchBarColors searchBarColors = this.searchBarColors;
            SearchBarVO boundData = getBoundData();
            searchBarView.updateColorsForSelect(searchBarColors, boundData != null ? boundData.getBackgroundColor() : null, isHomePage());
        }
    }

    private final ViewTreeObserver.OnGlobalLayoutListener showOnboardingIfExist(final String onboardingKey) {
        final View containerView = getContainerView();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$showOnboardingIfExist$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ComposerReferences composerReferences;
                OnBoardingDelegate onBoardingDelegate;
                BaseOnBoardingViewModel baseOnBoardingViewModel;
                if (containerView.getMeasuredWidth() <= 0 || containerView.getMeasuredHeight() <= 0) {
                    return;
                }
                containerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                composerReferences = this.references;
                ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                String tag = c11 != null ? c11.getTag() : null;
                onBoardingDelegate = this.onboardingDelegate;
                if (onBoardingDelegate == null || tag == null) {
                    return;
                }
                baseOnBoardingViewModel = this.onBoardingViewModel;
                baseOnBoardingViewModel.showIfNeed(tag, onboardingKey, new SearchBarViewHolder$showOnboardingIfExist$1$1(this));
            }
        };
        containerView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return onGlobalLayoutListener;
    }

    private final void showTooltipIfNeeded(SearchBarVO item) {
        SearchBarVO.TooltipVO tooltip = item.getTooltip();
        if (needToShowTooltip(tooltip != null ? tooltip.getTooltipKey() : null)) {
            final SearchBarVO.TooltipVO tooltip2 = item.getTooltip();
            if (tooltip2 == null) {
                dismissTooltip();
                return;
            }
            final Object tooltipDelay = tooltip2.getTooltipDelay();
            if (tooltipDelay == null) {
                tooltipDelay = 5000L;
            }
            item.getTooltip().getTooltip().setHideByTouchOutside(true);
            Runnable runnable = new Runnable() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$showTooltipIfNeeded$lambda$11$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    CartTooltipHelper cartTooltipHelper;
                    SearchBarView searchBarView;
                    SharedPreferences sharedPreferences;
                    UserManager userManager;
                    cartTooltipHelper = SearchBarViewHolder.this.tooltipHelper;
                    CartTooltipVO tooltip3 = tooltip2.getTooltip();
                    searchBarView = SearchBarViewHolder.this.searchBarView;
                    Intrinsics.checkNotNullExpressionValue(searchBarView, "access$getSearchBarView$p(...)");
                    CartTooltipHelper.onShowTooltip$default(cartTooltipHelper, tooltip3, searchBarView, -UiExtKt.toPx(Paddings.PADDING_100.getPx()), true, Long.valueOf(((Number) tooltipDelay).longValue()), null, 32, null);
                    sharedPreferences = SearchBarViewHolder.this.sharedPreferences;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    String tooltipKey = tooltip2.getTooltipKey();
                    userManager = SearchBarViewHolder.this.userManager;
                    edit.putString("FAVORITES_SEARCH_TOOLTIP_PREFS_KEY", tooltipKey + "_" + userManager.getUserId());
                    edit.apply();
                }
            };
            this.handler.post(runnable);
            this.showTooltipRunnable = runnable;
            subscribeToDismissEvents();
        }
    }

    private final void subscribeToDismissEvents() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.addOnScrollListener(this.scrollListener);
    }

    private final ActiveSearchBarVO toActiveVO(SearchBarVO searchBarVO) {
        long id2 = searchBarVO.getId();
        String searchText = searchBarVO.getSearchText();
        String hint = searchBarVO.getHint();
        String deeplink = searchBarVO.getDeeplink();
        String link = searchBarVO.getLink();
        SearchBarVO.ReturnKeyType returnKeyType = searchBarVO.getReturnKeyType();
        Long searchDelay = searchBarVO.getSearchDelay();
        float cornerRadius = searchBarVO.getCornerRadius();
        String backgroundColor = searchBarVO.getBackgroundColor();
        String searchBarTintColor = searchBarVO.getSearchBarTintColor();
        Integer maxSearchQueryTextLength = searchBarVO.getMaxSearchQueryTextLength();
        Boolean isDynamicUpdateDisabled = searchBarVO.getIsDynamicUpdateDisabled();
        SearchBarVO.SearchByImageVO searchByImage = searchBarVO.getSearchByImage();
        return new ActiveSearchBarVO(id2, searchText, hint, deeplink, link, returnKeyType, null, searchDelay, cornerRadius, backgroundColor, searchBarTintColor, maxSearchQueryTextLength, isDynamicUpdateDisabled, searchByImage != null ? toVo(searchByImage) : null, searchBarVO.getMinTextLength());
    }

    private final ActiveSearchBarVO.SearchByImageVO toVo(SearchBarVO.SearchByImageVO searchByImageVO) {
        return new ActiveSearchBarVO.SearchByImageVO(searchByImageVO.getButtonTrackingInfo(), searchByImageVO.getOpenOnboardingControl(), searchByImageVO.getErrorNotification(), searchByImageVO.getLoadPhotoTrackingInfo());
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        AppBarLayout composerAppbar;
        super.onAttach();
        View composerRootView = getComposerRootView();
        if (composerRootView != null && (composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRootView)) != null) {
            composerAppbar.d(this.offsetChangeListener);
        }
        C4598rp.f(this.references, new C2408n0(C2399j.o(this.references.getController().getEventsFlow()), new SearchBarViewHolder$onAttach$1(this, null)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        observeViewModelActions();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        AppBarLayout composerAppbar;
        super.onDetach();
        this.handler.removeCallbacksAndMessages(null);
        this.showTooltipRunnable = null;
        View composerRootView = getComposerRootView();
        if (composerRootView == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRootView)) == null) {
            return;
        }
        composerAppbar.q(this.offsetChangeListener);
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onFloorAlphaChanged(float alpha) {
        SearchBarVO boundData = getBoundData();
        boolean isDynamicColorsOnScrollEnabled = boundData != null ? boundData.getIsDynamicColorsOnScrollEnabled() : false;
        if (Intrinsics.d(this.hasAlphaChangingFloor, Boolean.TRUE)) {
            setupSearchBarColorsOnScroll(isDynamicColorsOnScrollEnabled, alpha);
        }
        if (isDynamicColorsOnScrollEnabled) {
            this.searchBarView.updateQueryTextColor(alpha);
        }
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onNavbarConfigured(boolean hasAlphaChangingFloor, float alpha) {
        this.hasAlphaChangingFloor = Boolean.valueOf(hasAlphaChangingFloor);
        SearchBarVO boundData = getBoundData();
        boolean isDynamicColorsOnScrollEnabled = boundData != null ? boundData.getIsDynamicColorsOnScrollEnabled() : false;
        setupSearchBarColorsOnScroll(isDynamicColorsOnScrollEnabled, hasAlphaChangingFloor ? alpha : 0.0f);
        if (isDynamicColorsOnScrollEnabled) {
            SearchBarView searchBarView = this.searchBarView;
            if (!hasAlphaChangingFloor) {
                alpha = 0.0f;
            }
            searchBarView.updateQueryTextColor(alpha);
        }
    }

    @Override // ru.ozon.app.android.storefront.navBar.NavBarModelProvider
    public void provideNavBarModelListener(@NotNull Function1<? super kotlin.coroutines.d<? super NavBarModelProvider.NavBarModel>, ? extends Object> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.navbarModelListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SearchBarVO item, @NotNull l20.d info) {
        String onboardingKey;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        boolean e02 = h.e0(item.getDeeplink(), "ozon://searchSuggestions", false);
        boolean e03 = h.e0(item.getDeeplink(), "ozon://dialogSearch", false);
        if ((e02 && !isPageInPrefetchBlackList(info)) || e03) {
            prefetch(item);
        }
        this.dynamicColors = item.getDynamicColors();
        this.info = info;
        SearchBarView searchBarView = this.searchBarView;
        boolean z11 = item.getSearchButton() != null;
        boolean isHomePage = isHomePage();
        searchBarView.setSearchTextWithHint(SearchBarUtilsKt.cut(item.getSearchText(), item.getMaxSearchQueryTextLength()), item.getHint());
        searchBarView.bindRightButton(item.getRightButton(), this.actionHandler);
        searchBarView.showOrGoneScanItIcon(item.getScanItEnabled() && !z11);
        searchBarView.showOrGonePhotoSearchIcon(item.getSearchByImage() != null);
        searchBarView.showOrGoneSearchCompoundDraw(!z11);
        SearchBarColors searchBarColors = this.searchBarColors;
        String expandedBackgroundColor = item.getExpandedBackgroundColor();
        if (expandedBackgroundColor == null) {
            expandedBackgroundColor = item.getBackgroundColor();
        }
        searchBarView.setBackgroundColor(searchBarColors.getSearchBarBackgroundColor(expandedBackgroundColor, isHomePage));
        searchBarView.setSearchTextColor(this.searchBarColors.getText());
        searchBarView.setSearchHintColor(this.searchBarColors.getHintColor(isHomePage));
        searchBarView.setSearchIconsTint(this.searchBarColors.getIconColor(item.getSearchBarTintColor(), isHomePage));
        searchBarView.setCornerRadius(item.getCornerRadius());
        searchBarView.showOrGonePdpSearchIcon(item.getSearchButton(), this.searchBarColors.getPdpButtonBackground());
        OnBoardingDTO onboarding = item.getOnboarding();
        if (onboarding != null && (onboardingKey = onboarding.getOnboardingKey()) != null) {
            initDelegate(item.getOnboarding(), onboardingKey);
            showOnboardingIfExist(onboardingKey);
        }
        showTooltipIfNeeded(item);
    }
}
