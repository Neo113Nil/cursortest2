package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.InterfaceC4008j;
import a00.j;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.activity.J;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.appbar.AppBarLayout;
import ei0.InterfaceC6369b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import i10.C6997c;
import i10.k;
import j10.InterfaceC7238a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityHelper;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.search.R$anim;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.databinding.FragmentSearchSuggestionsBinding;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.StaticNavBarModel;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.views.searchShimmer.ShimmerConfig;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarMapper;
import ru.ozon.app.android.search.widgets.searchbar.di.DaggerSearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SearchSkeleton;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonElement;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.storefront.navBar.NavBarVO;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.app.android.utils.KeyboardUtils;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u0090\u0001\b\u0001\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¤\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0005J\u001f\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0005J\u0011\u0010:\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b<\u0010\u000eJ\u000f\u0010=\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010\u0005J\u000f\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\u0005J\u000f\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010\u0005J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0005J\u000f\u0010A\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010\u0005J\u000f\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010\u0005J\u000f\u0010C\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\u0005J\u0017\u0010D\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010J\u001a\u0004\u0018\u00010I*\f\u0012\b\u0012\u00060Gj\u0002`H0FH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\bH\u0002¢\u0006\u0004\bL\u0010\u0005J\u0011\u0010M\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\bH\u0002¢\u0006\u0004\bO\u0010\u0005J\u000f\u0010P\u001a\u00020\bH\u0002¢\u0006\u0004\bP\u0010\u0005J\u000f\u0010Q\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010\u0005R\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u0080\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0095\u0001\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u0098\u0001\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0094\u0001\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009a\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0017\u0010¡\u0001\u001a\u00020R8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010£\u0001\u001a\u00020-8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010/¨\u0006¥\u0001"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchSuggestionsFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyView", "fragment", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "onComposerCreated", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "readModelAndRewriteArguments", "()Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SearchSkeleton;", "getSearchSkeleton", "()Lru/ozon/app/android/search/widgets/searchbar/shimmer/SearchSkeleton;", "", "showCatalogSkeletonsInSearch", "", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonElement;", "getSkeletonElements", "(Z)Ljava/util/List;", "injectDagger", "getCacheHolder", "()Lru/ozon/uni/atoms/af/pool/CacheHolder;", "addChildComposerFragment", "setupNavBar", "setupBackButtonNavigation", "configureShimmer", "startAnimations", "stopAnimations", "animateBack", "navigateBack", "observeComposerStateAndEvents", "(Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Li10/c;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "getUpdatedSearchBarVO", "(Li10/c;)Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "showShimmer", "showComposer", "()Lkotlin/Unit;", "releaseComposerRelatedObjects", "hideKeyboard", "setupBackgroundColor", "Lru/ozon/app/android/search/databinding/FragmentSearchSuggestionsBinding;", "_binding", "Lru/ozon/app/android/search/databinding/FragmentSearchSuggestionsBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "searchBarViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "clearSearchTextViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "tapTagsV2ViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "tapTagsV3ViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "sharedCarouselViewModel", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "searchByImageViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "searchByImageRouter", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "modifySearchUrlViewModel", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "keyboardVisibilityHelper", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityHelper;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarMapper;", "searchBarMapper", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarMapper;", "Lei0/b;", "ozonTracker", "Lei0/b;", "LSg/a;", "analyticsScreenStorage", "LSg/a;", "_navBarModel", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarViewDelegate;", "navBarViewDelegate", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarViewDelegate;", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate;", "searchBarViewDelegate", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate;", "shouldAnimate", "Z", "isNavigatingBack", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "ru/ozon/app/android/search/searchscreen/presentation/fragment/SearchSuggestionsFragment$onBackPressedListener$1", "onBackPressedListener", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchSuggestionsFragment$onBackPressedListener$1;", "isDialogSearchFeature$delegate", "LSc/j;", "isDialogSearchFeature", "()Z", "isSearchResultsShimmersEnabled$delegate", "isSearchResultsShimmersEnabled", "dp2", "I", "dp16", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "shimmerDelayedVisibilityHandler", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "getBinding", "()Lru/ozon/app/android/search/databinding/FragmentSearchSuggestionsBinding;", "binding", "getNavBarModel", "navBarModel", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchSuggestionsFragment extends ComponentCallbacksC5392m implements ComposerFragment.Host, CacheHolder {
    private FragmentSearchSuggestionsBinding _binding;
    private StaticNavBarModel _navBarModel;
    private Sg.a analyticsScreenStorage;
    private ClearSearchTextViewModel clearSearchTextViewModel;
    private FeatureChecker featureChecker;
    private boolean isNavigatingBack;
    private KeyboardVisibilityHelper keyboardVisibilityHelper;
    private ModifySearchUrlViewModel modifySearchUrlViewModel;
    private NavBarViewDelegate navBarViewDelegate;
    private InterfaceC6369b ozonTracker;
    private ComposerReferences references;
    private SearchBarMapper searchBarMapper;
    private SearchBarViewDelegate searchBarViewDelegate;
    private ActiveSearchBarViewModel searchBarViewModel;
    private SearchByImageRouter searchByImageRouter;
    private SearchByImageViewModel searchByImageViewModel;
    private SearchUrlPrefetchService searchUrlPrefetchService;
    private SharedCarouselViewModel sharedCarouselViewModel;
    private DelayedVisibilityHandler shimmerDelayedVisibilityHandler;
    private TapTagsV2ViewModel tapTagsV2ViewModel;
    private TapTagsV3ViewModel tapTagsV3ViewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int ONBOARDING_SHIMMER_WIDTH = ResourceExtKt.toPx(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
    private boolean shouldAnimate = true;

    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final SearchSuggestionsFragment$onBackPressedListener$1 onBackPressedListener = new C() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$onBackPressedListener$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            ComposerReferences composerReferences;
            composerReferences = SearchSuggestionsFragment.this.references;
            if (composerReferences != null) {
                composerReferences.getNavigator().popBackStack();
            } else {
                Intrinsics.n("references");
                throw null;
            }
        }
    };

    /* renamed from: isDialogSearchFeature$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isDialogSearchFeature = LazyUtilsKt.unsafeLazy(new SearchSuggestionsFragment$isDialogSearchFeature$2(this));

    /* renamed from: isSearchResultsShimmersEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSearchResultsShimmersEnabled = LazyUtilsKt.unsafeLazy(new SearchSuggestionsFragment$isSearchResultsShimmersEnabled$2(this));
    private final int dp2 = ResourceExtKt.toPx(2);
    private final int dp16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchSuggestionsFragment$Companion;", "", "<init>", "()V", "KEY_EXTRA_COMPOSER_SCREEN_CONFIG", "", "KEY_EXTRA_NAVBAR_MODEL", "TAG_COMPOSER_CHILD_FRAGMENT", "EMPTY_STRING", "DEFAULT_HEIGHT", "", "ONBOARDING_SHIMMER_WIDTH", "newInstance", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchSuggestionsFragment;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "navBarModel", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SearchSuggestionsFragment newInstance(@NotNull ComposerScreenConfig screenConfig, @NotNull StaticNavBarModel navBarModel) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
            SearchSuggestionsFragment searchSuggestionsFragment = new SearchSuggestionsFragment();
            searchSuggestionsFragment.setArguments(d.b(new Pair("KeyExtraComposerScreenConfig", screenConfig), new Pair("KeyExtraNavBarModel", navBarModel)));
            return searchSuggestionsFragment;
        }

        private Companion() {
        }
    }

    private final void addChildComposerFragment(Bundle savedInstanceState) {
        Bundle arguments;
        ComposerScreenConfig composerScreenConfig;
        if (savedInstanceState != null || (arguments = getArguments()) == null || (composerScreenConfig = (ComposerScreenConfig) arguments.getParcelable("KeyExtraComposerScreenConfig")) == null) {
            return;
        }
        ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, composerScreenConfig, ComposerFragment.DisplayMode.REGULAR, null, 4, null);
        Q p11 = getChildFragmentManager().p();
        p11.b(R$id.composerContainer, newInstance$default, "TagComposerChildFragment");
        p11.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateBack() {
        if (this.isNavigatingBack) {
            return;
        }
        this.isNavigatingBack = true;
        NavBarViewDelegate navBarViewDelegate = this.navBarViewDelegate;
        if (navBarViewDelegate != null) {
            navBarViewDelegate.animateReverse(new SearchSuggestionsFragment$animateBack$1(this));
        }
    }

    private final void configureShimmer() {
        SearchShimmer searchShimmer = getBinding().shimmer;
        int i11 = R$anim.shimmer_animation;
        int i12 = ONBOARDING_SHIMMER_WIDTH;
        Float valueOf = Float.valueOf(0.0f);
        searchShimmer.configureShimmer(new ShimmerConfig(i11, i12, U.j(new Pair(valueOf, valueOf), new Pair(Float.valueOf(0.3f), Float.valueOf(0.5f)), new Pair(Float.valueOf(0.5f), Float.valueOf(0.6f)), new Pair(Float.valueOf(0.6f), Float.valueOf(0.5f)), new Pair(Float.valueOf(1.0f), valueOf)), null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSearchSuggestionsBinding getBinding() {
        FragmentSearchSuggestionsBinding fragmentSearchSuggestionsBinding = this._binding;
        Intrinsics.f(fragmentSearchSuggestionsBinding);
        return fragmentSearchSuggestionsBinding;
    }

    private final CacheHolder getCacheHolder() {
        InterfaceC5431s g02 = getChildFragmentManager().g0("TagComposerChildFragment");
        if (g02 instanceof CacheHolder) {
            return (CacheHolder) g02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StaticNavBarModel getNavBarModel() {
        if (this._navBarModel == null) {
            this._navBarModel = readModelAndRewriteArguments();
        }
        StaticNavBarModel staticNavBarModel = this._navBarModel;
        Intrinsics.f(staticNavBarModel);
        return staticNavBarModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchSkeleton getSearchSkeleton() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        SearchSkeleton searchSkeleton = new SearchSkeleton(requireContext, null, 0, 0, false, 30, null);
        boolean z11 = isDialogSearchFeature() && !h.K(getNavBarModel().getSearchBarVo().getSearchText()) && isSearchResultsShimmersEnabled();
        int i11 = z11 ? this.dp2 : this.dp16;
        searchSkeleton.addSkeletonElements(getSkeletonElements(z11));
        ViewExtKt.updatePadding$default(searchSkeleton, 0, i11, 0, 0, 13, null);
        return searchSkeleton;
    }

    private final List<SkeletonElement> getSkeletonElements(boolean showCatalogSkeletonsInSearch) {
        boolean z11 = false;
        int i11 = 3;
        if (showCatalogSkeletonsInSearch) {
            SkeletonElement.TileGrid2 tileGrid2 = SkeletonElement.TileGrid2.INSTANCE;
            return C7714v.b0(tileGrid2, tileGrid2, tileGrid2);
        }
        SkeletonElement.IslandSeparator islandSeparator = new SkeletonElement.IslandSeparator(z11, z11, i11, null);
        SkeletonElement.SingleLarge singleLarge = new SkeletonElement.SingleLarge(0, 0, 0, 0, 15, null);
        SkeletonElement.Grid3 grid3 = SkeletonElement.Grid3.INSTANCE;
        return C7714v.b0(SkeletonElement.Double.INSTANCE, SkeletonElement.Flexbox3.INSTANCE, islandSeparator, singleLarge, grid3, grid3, grid3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActiveSearchBarVO getUpdatedSearchBarVO(C6997c<l> c6997c) {
        c cVar;
        ActiveSearchBarVO activeSearchBarVO;
        ActiveSearchBarVO activeSearchBarVO2;
        ActiveSearchBarVO copy;
        c cVar2;
        List<l> a11;
        Object obj;
        List<l> a12;
        Object obj2;
        Map<String, List<l>> g10;
        List<l> list;
        Object obj3;
        k.b<l> h11 = c6997c.h();
        if (h11 != null && (a12 = h11.a()) != null) {
            Iterator<T> it = a12.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((l) obj2).d() instanceof NavBarVO) {
                    break;
                }
            }
            l lVar = (l) obj2;
            if (lVar != null && (g10 = lVar.g()) != null && (list = g10.get("default")) != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (((l) obj3).d() instanceof ActiveSearchBarVO) {
                        break;
                    }
                }
                l lVar2 = (l) obj3;
                if (lVar2 != null) {
                    cVar = lVar2.d();
                    activeSearchBarVO = !(cVar instanceof ActiveSearchBarVO) ? (ActiveSearchBarVO) cVar : null;
                    if (activeSearchBarVO == null) {
                        k.a<l> e11 = c6997c.e();
                        if (e11 != null && (a11 = e11.a()) != null) {
                            Iterator<T> it3 = a11.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it3.next();
                                if (((l) obj).d() instanceof ActiveSearchBarVO) {
                                    break;
                                }
                            }
                            l lVar3 = (l) obj;
                            if (lVar3 != null) {
                                cVar2 = lVar3.d();
                                if (cVar2 instanceof ActiveSearchBarVO) {
                                    activeSearchBarVO2 = null;
                                    if (!isDialogSearchFeature()) {
                                        return activeSearchBarVO2;
                                    }
                                    if (activeSearchBarVO2 == null) {
                                        return null;
                                    }
                                    copy = activeSearchBarVO2.copy((r35 & 1) != 0 ? activeSearchBarVO2.id : 0L, (r35 & 2) != 0 ? activeSearchBarVO2.searchText : String.valueOf(getBinding().searchBarView.getSearchEditText().getText()), (r35 & 4) != 0 ? activeSearchBarVO2.hint : null, (r35 & 8) != 0 ? activeSearchBarVO2.deeplink : null, (r35 & 16) != 0 ? activeSearchBarVO2.link : null, (r35 & 32) != 0 ? activeSearchBarVO2.returnKeyType : null, (r35 & 64) != 0 ? activeSearchBarVO2.keyboardSearchTrackingInfo : null, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? activeSearchBarVO2.searchDelay : null, (r35 & 256) != 0 ? activeSearchBarVO2.cornerRadius : 0.0f, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? activeSearchBarVO2.backgroundColor : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? activeSearchBarVO2.searchBarTintColor : null, (r35 & 2048) != 0 ? activeSearchBarVO2.maxSearchQueryTextLength : null, (r35 & 4096) != 0 ? activeSearchBarVO2.isDynamicUpdateDisabled : null, (r35 & 8192) != 0 ? activeSearchBarVO2.searchByImage : null, (r35 & 16384) != 0 ? activeSearchBarVO2.minTextLength : null);
                                    return copy;
                                }
                                activeSearchBarVO = (ActiveSearchBarVO) cVar2;
                            }
                        }
                        cVar2 = null;
                        if (cVar2 instanceof ActiveSearchBarVO) {
                        }
                    }
                    activeSearchBarVO2 = activeSearchBarVO;
                    if (!isDialogSearchFeature()) {
                    }
                }
            }
        }
        cVar = null;
        if (!(cVar instanceof ActiveSearchBarVO)) {
        }
        if (activeSearchBarVO == null) {
        }
        activeSearchBarVO2 = activeSearchBarVO;
        if (!isDialogSearchFeature()) {
        }
    }

    private final void hideKeyboard() {
        r activity = getActivity();
        if (activity != null) {
            KeyboardUtils.INSTANCE.hideKeyboard(activity);
        }
    }

    private final void injectDagger() {
        SearchBarComponent.Factory factory = DaggerSearchBarComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage2.b(ActionComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, SearchHistoryRepositoryComponentApi.class).getDependencyStorage();
        if (SearchHistoryRepositoryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchHistoryRepositoryComponentApi is not DiComponent");
        }
        SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) dependencyStorage3.b(SearchHistoryRepositoryComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, SearchPrefetchApi.class).getDependencyStorage();
        if (SearchPrefetchApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchPrefetchApi is not DiComponent");
        }
        SearchPrefetchApi searchPrefetchApi = (SearchPrefetchApi) dependencyStorage4.b(SearchPrefetchApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage5.b(ComposerComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, OnboardingComponentApi.class).getDependencyStorage();
        if (OnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingComponentApi is not DiComponent");
        }
        OnboardingComponentApi onboardingComponentApi = (OnboardingComponentApi) dependencyStorage6.b(OnboardingComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage7.b(StorageComponentApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, SearchByImageRepositoryComponentApi.class).getDependencyStorage();
        if (SearchByImageRepositoryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchByImageRepositoryComponentApi is not DiComponent");
        }
        SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi = (SearchByImageRepositoryComponentApi) dependencyStorage8.b(SearchByImageRepositoryComponentApi.class);
        C6740b dependencyStorage9 = C6739a.b(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) dependencyStorage9.b(AndroidPlatformComponentApi.class);
        C6740b dependencyStorage10 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage10.b(ContextComponentDependencies.class);
        C6740b dependencyStorage11 = C6739a.b(this, SearchOnboardingRepositoryComponentApi.class).getDependencyStorage();
        if (SearchOnboardingRepositoryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchOnboardingRepositoryComponentApi is not DiComponent");
        }
        SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi = (SearchOnboardingRepositoryComponentApi) dependencyStorage11.b(SearchOnboardingRepositoryComponentApi.class);
        C6740b dependencyStorage12 = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage12.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage13 = C6739a.b(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) dependencyStorage13.b(AnalyticsScreenStorageComponentApi.class);
        C6740b dependencyStorage14 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage14.b(AccountComponentApi.class);
        C6740b dependencyStorage15 = C6739a.b(this, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        SearchBarComponent create = factory.create(networkComponentApi, actionComponentApi, searchHistoryRepositoryComponentApi, searchByImageRepositoryComponentApi, searchPrefetchApi, composerComponentApi, searchOnboardingRepositoryComponentApi, onboardingComponentApi, storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, accountComponentApi, (CustomActionHandlersComponentApi) dependencyStorage15.b(CustomActionHandlersComponentApi.class));
        this.searchBarMapper = create.staticSearchBarMapper();
        this.searchBarViewModel = create.viewModel().get();
        this.clearSearchTextViewModel = create.clearSearchTextViewModel().get();
        this.tapTagsV2ViewModel = create.tapTagsV2ViewModel().get();
        this.tapTagsV3ViewModel = create.tapTagsV3ViewModel().get();
        this.searchByImageViewModel = create.searchPhotoViewModel().get();
        this.featureChecker = create.featureChecker();
        this.searchUrlPrefetchService = create.searchUrlPrefetchService();
        this.sharedCarouselViewModel = create.sharedCarouselViewModel().get();
        this.keyboardVisibilityHelper = create.keyboardVisibilityHelper();
        this.searchByImageRouter = create.searchByImageRouter();
        this.modifySearchUrlViewModel = create.modifySearchUrlViewModel().get();
        this.ozonTracker = create.ozonTracker();
        this.analyticsScreenStorage = create.analyticsScreenStorage();
    }

    private final boolean isDialogSearchFeature() {
        return ((Boolean) this.isDialogSearchFeature.getValue()).booleanValue();
    }

    private final boolean isSearchResultsShimmersEnabled() {
        return ((Boolean) this.isSearchResultsShimmersEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateBack() {
        this.handler.post(new M30.a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateBack$lambda$13(SearchSuggestionsFragment searchSuggestionsFragment) {
        ComposerReferences composerReferences = searchSuggestionsFragment.references;
        if (composerReferences != null) {
            composerReferences.getNavigator().popBackStack();
        } else {
            Intrinsics.n("references");
            throw null;
        }
    }

    private final void observeComposerStateAndEvents(ComposerFragmentController composer) {
        I i11 = new I();
        I i12 = new I();
        InterfaceC7238a<l> composerStore = composer.getComposerStore();
        InterfaceC2395h<C6997c<l>> state = composerStore.getState();
        AbstractC5434v lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(state, lifecycle, bVar), new SearchSuggestionsFragment$observeComposerStateAndEvents$1(i11, this, null)), K.a(this));
        InterfaceC2395h<A00.a> events = composerStore.getEvents();
        AbstractC5434v lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        C2399j.C(new C2408n0(C5427n.a(events, lifecycle2, bVar), new SearchSuggestionsFragment$observeComposerStateAndEvents$2(i12, this, i11, null)), K.a(this));
    }

    private final StaticNavBarModel readModelAndRewriteArguments() {
        StaticNavBarModel createEmpty;
        Bundle arguments = getArguments();
        if (arguments == null || (createEmpty = (StaticNavBarModel) arguments.getParcelable("KeyExtraNavBarModel")) == null) {
            StaticNavBarModel.Companion companion = StaticNavBarModel.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            boolean isSelect = SelectUtilsKt.isSelect(requireContext2);
            FeatureChecker featureChecker = this.featureChecker;
            if (featureChecker == null) {
                Intrinsics.n("featureChecker");
                throw null;
            }
            createEmpty = companion.createEmpty(requireContext, "", "", SearchBarUtilsKt.getSearchBarDefaultRadius(isSelect, featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE)));
        }
        StaticNavBarModel staticNavBarModel = createEmpty;
        StaticNavBarModel copy$default = StaticNavBarModel.copy$default(staticNavBarModel, null, false, false, false, null, null, StaticNavBarModel.NavBarInfo.copy$default(staticNavBarModel.getNavBarInfo(), false, new StaticNavBarModel.NavBarInfo.ActionsSnapshot(null, null), null, 5, null), 63, null);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putParcelable("KeyExtraNavBarModel", copy$default);
        }
        Context context = getContext();
        if (context != null && ThemeExtKt.isDarkThemeActive(context) && staticNavBarModel.getNavBarInfo().getColors().getIsBgColorDark()) {
            return staticNavBarModel;
        }
        StaticNavBarModel.NavBarInfo navBarInfo = staticNavBarModel.getNavBarInfo();
        StaticNavBarModel.NavBarInfo.Companion companion2 = StaticNavBarModel.NavBarInfo.INSTANCE;
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        return StaticNavBarModel.copy$default(staticNavBarModel, null, false, false, false, null, null, StaticNavBarModel.NavBarInfo.copy$default(navBarInfo, false, null, companion2.createDefaultColors(requireContext3), 3, null), 63, null);
    }

    private final void releaseComposerRelatedObjects() {
        SearchBarViewDelegate searchBarViewDelegate = this.searchBarViewDelegate;
        if (searchBarViewDelegate != null) {
            searchBarViewDelegate.onDestroy();
        }
        this._binding = null;
        this.navBarViewDelegate = null;
        this.searchBarViewDelegate = null;
        this.shimmerDelayedVisibilityHandler = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    private final void setupBackButtonNavigation() {
        J onBackPressedDispatcher;
        r activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.onBackPressedListener);
    }

    private final void setupBackgroundColor() {
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        constraintLayout.setBackgroundColor(ResourceExtKt.color(requireContext, SelectUtilsKt.isSelect(requireContext2) ? R$color.layer_floor_0_select : R$color.layer_floor_1));
    }

    private final void setupNavBar() {
        FragmentSearchSuggestionsBinding binding = getBinding();
        FeatureChecker featureChecker = this.featureChecker;
        if (featureChecker == null) {
            Intrinsics.n("featureChecker");
            throw null;
        }
        NavBarViewDelegate navBarViewDelegate = new NavBarViewDelegate(this, binding, featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE), new kotlin.jvm.internal.C(this) { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$setupNavBar$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                StaticNavBarModel navBarModel;
                navBarModel = ((SearchSuggestionsFragment) this.receiver).getNavBarModel();
                return navBarModel;
            }
        });
        navBarViewDelegate.setCancelButtonClickListener(new SearchSuggestionsFragment$setupNavBar$2$1(this));
        navBarViewDelegate.bindColorCancelButton();
        navBarViewDelegate.bindRoundCorners();
        navBarViewDelegate.setBackButtonClickListener(new SearchSuggestionsFragment$setupNavBar$2$2(this));
        this.navBarViewDelegate = navBarViewDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit showComposer() {
        FragmentContainerView composerContainer = getBinding().composerContainer;
        Intrinsics.checkNotNullExpressionValue(composerContainer, "composerContainer");
        composerContainer.setVisibility(0);
        DelayedVisibilityHandler delayedVisibilityHandler = this.shimmerDelayedVisibilityHandler;
        if (delayedVisibilityHandler == null) {
            return null;
        }
        delayedVisibilityHandler.hide();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShimmer() {
        FragmentSearchSuggestionsBinding binding = getBinding();
        FragmentContainerView composerContainer = binding.composerContainer;
        Intrinsics.checkNotNullExpressionValue(composerContainer, "composerContainer");
        composerContainer.setVisibility(8);
        DelayedVisibilityHandler delayedVisibilityHandler = this.shimmerDelayedVisibilityHandler;
        if (delayedVisibilityHandler != null) {
            delayedVisibilityHandler.show();
        }
        binding.shimmer.startAnimation();
    }

    private final void startAnimations() {
        if (Build.VERSION.SDK_INT != 28) {
            NavBarViewDelegate navBarViewDelegate = this.navBarViewDelegate;
            if (navBarViewDelegate != null) {
                navBarViewDelegate.animateForward();
                return;
            }
            return;
        }
        NavBarViewDelegate navBarViewDelegate2 = this.navBarViewDelegate;
        if (navBarViewDelegate2 != null) {
            navBarViewDelegate2.goToFinalNavBarState();
        }
    }

    private final void stopAnimations() {
        NavBarViewDelegate navBarViewDelegate = this.navBarViewDelegate;
        if (navBarViewDelegate != null) {
            navBarViewDelegate.stopAnimations();
        }
        getBinding().shimmer.stopAnimation();
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        CacheHolder cacheHolder = getCacheHolder();
        if (cacheHolder != null) {
            return cacheHolder.getAtomPool();
        }
        return null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public fk0.c getPrefetchViewPool() {
        CacheHolder cacheHolder = getCacheHolder();
        if (cacheHolder != null) {
            return cacheHolder.getPrefetchViewPool();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ComponentCallbacksC5392m g02 = getChildFragmentManager().g0("TagComposerChildFragment");
        if (g02 != null) {
            g02.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        injectDagger();
        super.onAttach(context);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull ComposerFragmentController composerFragmentController, i iVar) {
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, componentCallbacksC5392m, composerFragmentController, iVar);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addChildComposerFragment(savedInstanceState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentSearchSuggestionsBinding inflate = FragmentSearchSuggestionsBinding.inflate(inflater, container, false);
        inflate.shimmer.addView(getSearchSkeleton());
        this._binding = inflate;
        configureShimmer();
        SearchShimmer shimmer = getBinding().shimmer;
        Intrinsics.checkNotNullExpressionValue(shimmer, "shimmer");
        this.shimmerDelayedVisibilityHandler = new DelayedVisibilityHandler(shimmer, 0L, 2, null);
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        hideKeyboard();
        stopAnimations();
        releaseComposerRelatedObjects();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupNavBar();
        setupBackButtonNavigation();
        if (this.shouldAnimate) {
            startAnimations();
            this.shouldAnimate = false;
        } else {
            NavBarViewDelegate navBarViewDelegate = this.navBarViewDelegate;
            if (navBarViewDelegate != null) {
                navBarViewDelegate.goToFinalNavBarState();
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(composer, "composer");
        this.references = composer.getReferences();
        setupBackgroundColor();
        ComposerReferences composerReferences = this.references;
        if (composerReferences == null) {
            Intrinsics.n("references");
            throw null;
        }
        ActiveSearchBarViewModel activeSearchBarViewModel = (ActiveSearchBarViewModel) new z0(composerReferences.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$onComposerCreated$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                ActiveSearchBarViewModel activeSearchBarViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                activeSearchBarViewModel2 = SearchSuggestionsFragment.this.searchBarViewModel;
                if (activeSearchBarViewModel2 != null) {
                    return activeSearchBarViewModel2;
                }
                Intrinsics.n("searchBarViewModel");
                throw null;
            }
        }).a(ActiveSearchBarViewModel.class);
        StaticSearchBarView searchBarView = getBinding().searchBarView;
        Intrinsics.checkNotNullExpressionValue(searchBarView, "searchBarView");
        kotlin.jvm.internal.C c11 = new kotlin.jvm.internal.C(this) { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$onComposerCreated$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                StaticNavBarModel navBarModel;
                navBarModel = ((SearchSuggestionsFragment) this.receiver).getNavBarModel();
                return navBarModel;
            }
        };
        SearchSuggestionsFragment$onComposerCreated$2 searchSuggestionsFragment$onComposerCreated$2 = new SearchSuggestionsFragment$onComposerCreated$2(this);
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        FeatureChecker featureChecker = this.featureChecker;
        if (featureChecker == null) {
            Intrinsics.n("featureChecker");
            throw null;
        }
        SearchUrlPrefetchService searchUrlPrefetchService = this.searchUrlPrefetchService;
        if (searchUrlPrefetchService == null) {
            Intrinsics.n("searchUrlPrefetchService");
            throw null;
        }
        KeyboardVisibilityHelper keyboardVisibilityHelper = this.keyboardVisibilityHelper;
        if (keyboardVisibilityHelper == null) {
            Intrinsics.n("keyboardVisibilityHelper");
            throw null;
        }
        ComposerReferences composerReferences2 = this.references;
        if (composerReferences2 == null) {
            Intrinsics.n("references");
            throw null;
        }
        SharedCarouselViewModel sharedCarouselViewModel = (SharedCarouselViewModel) new z0(composerReferences2.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$onComposerCreated$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                SharedCarouselViewModel sharedCarouselViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                sharedCarouselViewModel2 = SearchSuggestionsFragment.this.sharedCarouselViewModel;
                if (sharedCarouselViewModel2 != null) {
                    return sharedCarouselViewModel2;
                }
                Intrinsics.n("sharedCarouselViewModel");
                throw null;
            }
        }).a(SharedCarouselViewModel.class);
        ComposerReferences composerReferences3 = this.references;
        if (composerReferences3 == null) {
            Intrinsics.n("references");
            throw null;
        }
        a00.h viewModelOwnerProvider = composerReferences3.getViewModelOwnerProvider();
        ClearSearchTextViewModel clearSearchTextViewModel = (ClearSearchTextViewModel) ((w0) j.a(viewModelOwnerProvider.b(), N.b(ClearSearchTextViewModel.class), new SearchSuggestionsFragment$onComposerCreated$4(this)).getValue());
        ComposerReferences composerReferences4 = this.references;
        if (composerReferences4 == null) {
            Intrinsics.n("references");
            throw null;
        }
        TapTagsV2ViewModel tapTagsV2ViewModel = (TapTagsV2ViewModel) new z0(composerReferences4.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$onComposerCreated$$inlined$viewModel$3
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TapTagsV2ViewModel tapTagsV2ViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                tapTagsV2ViewModel2 = SearchSuggestionsFragment.this.tapTagsV2ViewModel;
                if (tapTagsV2ViewModel2 != null) {
                    return tapTagsV2ViewModel2;
                }
                Intrinsics.n("tapTagsV2ViewModel");
                throw null;
            }
        }).a(TapTagsV2ViewModel.class);
        ComposerReferences composerReferences5 = this.references;
        if (composerReferences5 == null) {
            Intrinsics.n("references");
            throw null;
        }
        TapTagsV3ViewModel tapTagsV3ViewModel = (TapTagsV3ViewModel) new z0(composerReferences5.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$onComposerCreated$$inlined$viewModel$4
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TapTagsV3ViewModel tapTagsV3ViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                tapTagsV3ViewModel2 = SearchSuggestionsFragment.this.tapTagsV3ViewModel;
                if (tapTagsV3ViewModel2 != null) {
                    return tapTagsV3ViewModel2;
                }
                Intrinsics.n("tapTagsV3ViewModel");
                throw null;
            }
        }).a(TapTagsV3ViewModel.class);
        ComposerReferences composerReferences6 = this.references;
        if (composerReferences6 == null) {
            Intrinsics.n("references");
            throw null;
        }
        a00.h viewModelOwnerProvider2 = composerReferences6.getViewModelOwnerProvider();
        SearchByImageViewModel searchByImageViewModel = (SearchByImageViewModel) ((w0) j.a(viewModelOwnerProvider2.b(), N.b(SearchByImageViewModel.class), new SearchSuggestionsFragment$onComposerCreated$7(this)).getValue());
        SearchByImageRouter searchByImageRouter = this.searchByImageRouter;
        if (searchByImageRouter == null) {
            Intrinsics.n("searchByImageRouter");
            throw null;
        }
        ComposerReferences composerReferences7 = this.references;
        if (composerReferences7 == null) {
            Intrinsics.n("references");
            throw null;
        }
        ModifySearchUrlViewModel modifySearchUrlViewModel = (ModifySearchUrlViewModel) new z0(composerReferences7.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$onComposerCreated$$inlined$viewModel$5
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                ModifySearchUrlViewModel modifySearchUrlViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                modifySearchUrlViewModel2 = SearchSuggestionsFragment.this.modifySearchUrlViewModel;
                if (modifySearchUrlViewModel2 != null) {
                    return modifySearchUrlViewModel2;
                }
                Intrinsics.n("modifySearchUrlViewModel");
                throw null;
            }
        }).a(ModifySearchUrlViewModel.class);
        InterfaceC6369b interfaceC6369b = this.ozonTracker;
        if (interfaceC6369b == null) {
            Intrinsics.n("ozonTracker");
            throw null;
        }
        Sg.a aVar = this.analyticsScreenStorage;
        if (aVar == null) {
            Intrinsics.n("analyticsScreenStorage");
            throw null;
        }
        this.searchBarViewDelegate = new SearchBarViewDelegate(searchBarView, c11, searchSuggestionsFragment$onComposerCreated$2, composer, viewLifecycleOwner, featureChecker, searchUrlPrefetchService, keyboardVisibilityHelper, sharedCarouselViewModel, activeSearchBarViewModel, clearSearchTextViewModel, tapTagsV2ViewModel, tapTagsV3ViewModel, searchByImageViewModel, searchByImageRouter, modifySearchUrlViewModel, interfaceC6369b, aVar);
        View view = fragment.getView();
        if (view != null) {
            AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(view);
            if (composerAppbar != null) {
                ViewExtKt.gone(composerAppbar);
            }
            Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(view);
            if (composerToolbar != null) {
                ViewGroup.LayoutParams layoutParams = composerToolbar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = 0;
                composerToolbar.setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            view.setLayoutParams(layoutParams2);
            PageIssueStateView composerScreenStateView = ComposerViewExtensionKt.composerScreenStateView(view);
            if (composerScreenStateView != null && isDialogSearchFeature()) {
                composerScreenStateView.l(new SearchSuggestionsFragment$onComposerCreated$9$3$1(composerScreenStateView, this));
            }
        }
        observeComposerStateAndEvents(composer);
    }
}
