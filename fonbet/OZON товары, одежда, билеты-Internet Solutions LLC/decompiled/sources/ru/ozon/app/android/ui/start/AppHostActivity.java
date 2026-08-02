package ru.ozon.app.android.ui.start;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import BZ.d;
import BZ.e;
import EZ.h;
import GZ.g;
import Rg.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import Sg.a;
import Xh0.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n10.InterfaceC8417a;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import qZ.InterfaceC9013e;
import qZ.InterfaceC9014f;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentsInterceptor;
import ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener;
import ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.InAppPushHostApi;
import ru.ozon.app.android.inapppush.util.InAppHostProvider;
import ru.ozon.app.android.main.R$id;
import ru.ozon.app.android.main.R$layout;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.search.flags.SearchBySharedImageEnabled;
import ru.ozon.app.android.storage.bugReport.BugReportCookieState;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.tabbar.ui.MainTabNavigationFragment;
import ru.ozon.app.android.ui.start.AppHostActivity;
import ru.ozon.app.android.ui.start.bugReport.BugReportView;
import ru.ozon.app.android.ui.start.di.AppHostActivityComponent;
import ru.ozon.app.android.ui.start.di.DaggerAppHostActivityComponent;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import w2.C10411b;
import xZ.C10683b;
import xZ.InterfaceC10682a;
import xZ.l;
import xe.C10727i;
import yZ.f;

@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r:\u0002\u009d\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u00122\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00120#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0010H\u0014¢\u0006\u0004\b)\u0010\u0014J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010\u000fJ\u000f\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010\u000fJ\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00102J\u0017\u00105\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00102J\u0017\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00122\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\n\u0018\u00010Aj\u0004\u0018\u0001`BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0013\u0010J\u001a\u00060Hj\u0002`IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0012H\u0016¢\u0006\u0004\bL\u0010\u000fJ\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\bP\u0010\u001aJ\u0011\u0010Q\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bQ\u0010RJ\u0011\u0010S\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bS\u0010TJ!\u0010Y\u001a\u00020\u00122\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b[\u0010\u000fJ\u000f\u0010\\\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\\\u0010\u000fJ\u000f\u0010]\u001a\u00020\u0012H\u0002¢\u0006\u0004\b]\u0010\u000fJ\u000f\u0010^\u001a\u00020\u0012H\u0002¢\u0006\u0004\b^\u0010\u000fR(\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001b\u0010k\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020o8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010r\u001a\u00060Hj\u0002`I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001e\u0010\u009a\u0001\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010\"¨\u0006\u009e\u0001"}, d2 = {"Lru/ozon/app/android/ui/start/AppHostActivity;", "Landroidx/appcompat/app/g;", "LxZ/a;", "LqZ/e;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "LyZ/f;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "LRg/b;", "LxZ/l;", "Lru/ozon/app/android/composer/universalscreen/view/ThemeResIdProvider;", "Ln10/a;", "Lru/ozon/app/android/inapppush/util/InAppHostProvider;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "themeResId", "()I", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "outState", "onSaveInstanceState", "", "onSupportNavigateUp", "()Z", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "LqZ/f;", "getScreenFlowTag", "()LqZ/f;", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "getAnalyticsScreenStorage", "()LSg/a;", "pageViewChanged", "Lru/ozon/app/android/inapppush/InAppPushHost;", "getInAppHost", "()Lru/ozon/app/android/inapppush/InAppPushHost;", "handleIntent", "getBottomNavigationStateController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "getBottomNavigationAnimationController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "", "state", "LxZ/b;", "navigator", "navigateToInitialPage", "(Ljava/lang/String;LxZ/b;)V", "observeMiniAppConfig", "observeBugReportFlow", "addBugReportIconView", "handleSharedImage", "LPc/a;", "Lru/ozon/app/android/ui/start/AppHostViewModel;", "pViewModel", "LPc/a;", "getPViewModel$main_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$main_prodGoogleAllVendorsRelease", "(LPc/a;)V", "appHostViewModel$delegate", "LSc/j;", "getAppHostViewModel", "()Lru/ozon/app/android/ui/start/AppHostViewModel;", "appHostViewModel", "LEZ/h;", "holder", "LEZ/h;", "LGZ/g;", "router", "LGZ/g;", "analyticsScreenStorage", "LSg/a;", "LXh0/c;", "startupTimeTracker", "LXh0/c;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "appLaunchArgumentsInterceptor", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "appLaunchListener", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "LBZ/e;", "miniAppConfigHolder", "LBZ/e;", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "customBundleSaveStateActivityCallback", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "inAppPushHost", "Lru/ozon/app/android/inapppush/InAppPushHost;", "Lru/ozon/app/android/storage/bugReport/BugReportCookieState;", "bugReportCookieState", "Lru/ozon/app/android/storage/bugReport/BugReportCookieState;", "Lru/ozon/app/android/ui/start/bugReport/BugReportView;", "bugReportView", "Lru/ozon/app/android/ui/start/bugReport/BugReportView;", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "externalDeeplinkDelegate", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "setExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;)V", "Lw2/b;", "splashScreen", "Lw2/b;", "themeId", "I", "getThemeId", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppHostActivity extends g implements InterfaceC10682a, InterfaceC9013e, BottomNavigationStateController, BottomNavigationAnimationController, f, CacheHolder, PermissionRequester, b, l, ThemeResIdProvider, InterfaceC8417a, InAppHostProvider {
    private a analyticsScreenStorage;
    private AppLaunchArgumentsInterceptor appLaunchArgumentsInterceptor;
    private AppLaunchListener appLaunchListener;
    private BugReportCookieState bugReportCookieState;
    private BugReportView bugReportView;
    private ManualStateBundleActivityCallback customBundleSaveStateActivityCallback;
    public ExternalDeeplinkProcessorDelegate externalDeeplinkDelegate;
    private FeatureChecker featureChecker;
    private h holder;
    private InAppPushHost inAppPushHost;
    private e miniAppConfigHolder;
    public Pc.a<AppHostViewModel> pViewModel;
    private PermissionRequest.Builder permissionRequestBuilder;
    private GZ.g router;
    private C10411b splashScreen;
    private c startupTimeTracker;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: appHostViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j appHostViewModel = k.b(new AppHostActivity$appHostViewModel$2(this));
    private final int themeId = R$style.OzonTheme;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ui/start/AppHostActivity$Companion;", "", "<init>", "()V", "EXTRA_REDIRECT_DESTINATION", "", "BUG_REPORT_REDIRECT_URL", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "redirectDeeplink", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, String redirectDeeplink) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) AppHostActivity.class);
            intent.addFlags(67108864);
            if (redirectDeeplink != null) {
                intent.putExtra("ru.ozon.app.android.ui.start.PreStartActivity.EXTRA_REDIRECT_DESTINATION", redirectDeeplink);
            }
            return intent;
        }

        private Companion() {
        }
    }

    private final void addBugReportIconView() {
        BugReportView bugReportView = new BugReportView(this, null, 0, 6, null);
        this.bugReportView = bugReportView;
        bugReportView.setOnClickListener(new View.OnClickListener() { // from class: iX.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppHostActivity.addBugReportIconView$lambda$6(AppHostActivity.this, view);
            }
        });
        View decorView = getWindow().getDecorView();
        Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        BugReportView bugReportView2 = this.bugReportView;
        if (bugReportView2 != null) {
            viewGroup.addView(bugReportView2);
        } else {
            Intrinsics.n("bugReportView");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addBugReportIconView$lambda$6(AppHostActivity appHostActivity, View view) {
        GZ.g gVar = appHostActivity.router;
        if (gVar != null) {
            g.a.a(gVar, "ozon://web/?url=https://forms.ozon.ru/form/6f8feaf7-ff42-433b-a8fa-5d133290689f", null, null, 6);
        } else {
            Intrinsics.n("router");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppHostViewModel getAppHostViewModel() {
        Object value = this.appHostViewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppHostViewModel) value;
    }

    private final BottomNavigationAnimationController getBottomNavigationAnimationController() {
        InterfaceC5431s w02 = getSupportFragmentManager().w0();
        if (w02 instanceof BottomNavigationAnimationController) {
            return (BottomNavigationAnimationController) w02;
        }
        return null;
    }

    private final BottomNavigationStateController getBottomNavigationStateController() {
        InterfaceC5431s w02 = getSupportFragmentManager().w0();
        if (w02 instanceof BottomNavigationStateController) {
            return (BottomNavigationStateController) w02;
        }
        return null;
    }

    private final void handleIntent(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("ru.ozon.app.android.ui.start.PreStartActivity.EXTRA_REDIRECT_DESTINATION") : null;
        getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease().navigate(intent);
        if (stringExtra == null || kotlin.text.h.K(stringExtra)) {
            return;
        }
        GZ.g gVar = this.router;
        if (gVar != null) {
            g.a.a(gVar, stringExtra, null, null, 6);
        } else {
            Intrinsics.n("router");
            throw null;
        }
    }

    private final void handleSharedImage() {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (Intrinsics.d(getIntent().getAction(), "android.intent.action.SEND")) {
            FeatureChecker featureChecker = this.featureChecker;
            if (featureChecker == null) {
                Intrinsics.n("featureChecker");
                throw null;
            }
            if (featureChecker.isEnabled(SearchBySharedImageEnabled.INSTANCE)) {
                Intent intent = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
                    parcelableExtra = (Parcelable) parcelableExtra2;
                } else {
                    parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
                }
                final Uri uri = (Uri) parcelableExtra;
                if (uri == null) {
                    return;
                }
                if (!getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                    getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ui.start.AppHostActivity$handleSharedImage$$inlined$whenStarted$1
                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public void onDestroy(J owner) {
                            Intrinsics.checkNotNullParameter(owner, "owner");
                            J.this.getLifecycle().e(this);
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public void onStart(J owner) {
                            Intrinsics.checkNotNullParameter(owner, "owner");
                            GZ.g gVar = this.router;
                            if (gVar == null) {
                                Intrinsics.n("router");
                                throw null;
                            }
                            g.a.a(gVar, "ozon://searchBySharedImage", U.i(new Pair("KEY_PHOTO_URI", uri)), null, 4);
                            J.this.getLifecycle().e(this);
                        }
                    });
                    return;
                }
                GZ.g gVar = this.router;
                if (gVar != null) {
                    g.a.a(gVar, "ozon://searchBySharedImage", U.i(new Pair("KEY_PHOTO_URI", uri)), null, 4);
                } else {
                    Intrinsics.n("router");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToInitialPage(final String state, C10683b navigator) {
        h hVar = this.holder;
        if (hVar == null) {
            Intrinsics.n("holder");
            throw null;
        }
        yZ.h.a(navigator, hVar, this);
        if (!getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease().hasExternalDeeplink(getIntent()) || state == null || kotlin.text.h.K(state)) {
            if (getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease().hasExternalDeeplink(getIntent())) {
                if (getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                    getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease().navigate(getIntent());
                } else {
                    getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ui.start.AppHostActivity$navigateToInitialPage$$inlined$whenStarted$2
                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public void onDestroy(J owner) {
                            Intrinsics.checkNotNullParameter(owner, "owner");
                            J.this.getLifecycle().e(this);
                        }

                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public void onStart(J owner) {
                            Intrinsics.checkNotNullParameter(owner, "owner");
                            this.getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease().navigate(this.getIntent());
                            J.this.getLifecycle().e(this);
                        }
                    });
                }
            }
            if (state != null && !kotlin.text.h.K(state)) {
                GZ.g gVar = this.router;
                if (gVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                g.a.a(gVar, state, null, null, 6);
            }
            getAppHostViewModel().initialPageOpened();
        } else if (getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease().navigate(getIntent());
            GZ.g gVar2 = this.router;
            if (gVar2 == null) {
                Intrinsics.n("router");
                throw null;
            }
            g.a.a(gVar2, state, null, null, 6);
            getAppHostViewModel().initialPageOpened();
        } else {
            getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ui.start.AppHostActivity$navigateToInitialPage$$inlined$whenStarted$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    J.this.getLifecycle().e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease().navigate(this.getIntent());
                    GZ.g gVar3 = this.router;
                    if (gVar3 == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    g.a.a(gVar3, state, null, null, 6);
                    this.getAppHostViewModel().initialPageOpened();
                    J.this.getLifecycle().e(this);
                }
            });
        }
        handleSharedImage();
    }

    private final void observeBugReportFlow() {
        C10727i.c(K.a(this), null, null, new AppHostActivity$observeBugReportFlow$1(this, null), 3);
    }

    private final void observeMiniAppConfig() {
        e eVar = this.miniAppConfigHolder;
        if (eVar == null) {
            Intrinsics.n("miniAppConfigHolder");
            throw null;
        }
        final M0<d> h11 = eVar.h();
        C2399j.C(new C2408n0(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.ui.start.AppHostActivity$observeMiniAppConfig$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ui.start.AppHostActivity$observeMiniAppConfig$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.ui.start.AppHostActivity$observeMiniAppConfig$$inlined$map$1$2", f = "AppHostActivity.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.ui.start.AppHostActivity$observeMiniAppConfig$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                d dVar2 = (d) obj;
                                String b11 = kotlin.text.h.t(dVar2.b(), "seller", false) ? "seller" : dVar2.b();
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(b11, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super String> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AppHostActivity$observeMiniAppConfig$2(null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$1$lambda$0(AppHostActivity appHostActivity) {
        return !appHostActivity.getAppHostViewModel().getCanNavigateFurther();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacksC5392m onCreate$lambda$2(String str) {
        return MainTabNavigationFragment.INSTANCE.newInstance(str);
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void addListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.addListener(listener);
        }
    }

    @Override // Rg.b
    @NotNull
    public a getAnalyticsScreenStorage() {
        a aVar = this.analyticsScreenStorage;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("analyticsScreenStorage");
        throw null;
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    @NotNull
    public TranslateAnimationState getBottomNavigationAnimationState() {
        TranslateAnimationState bottomNavigationAnimationState;
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        return (bottomNavigationAnimationController == null || (bottomNavigationAnimationState = bottomNavigationAnimationController.getBottomNavigationAnimationState()) == null) ? TranslateAnimationState.NONE : bottomNavigationAnimationState;
    }

    @NotNull
    public final ExternalDeeplinkProcessorDelegate getExternalDeeplinkDelegate$main_prodGoogleAllVendorsRelease() {
        ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate = this.externalDeeplinkDelegate;
        if (externalDeeplinkProcessorDelegate != null) {
            return externalDeeplinkProcessorDelegate;
        }
        Intrinsics.n("externalDeeplinkDelegate");
        throw null;
    }

    @Override // ru.ozon.app.android.inapppush.util.InAppHostProvider
    @NotNull
    public InAppPushHost getInAppHost() {
        InAppPushHost inAppPushHost = this.inAppPushHost;
        if (inAppPushHost == null) {
            Intrinsics.n("inAppPushHost");
            throw null;
        }
        InAppPushHost.DefaultImpls.initInAppPushSdk$default(inAppPushHost, this, null, 2, null);
        InAppPushHost inAppPushHost2 = this.inAppPushHost;
        if (inAppPushHost2 != null) {
            return inAppPushHost2;
        }
        Intrinsics.n("inAppPushHost");
        throw null;
    }

    @NotNull
    public final Pc.a<AppHostViewModel> getPViewModel$main_prodGoogleAllVendorsRelease() {
        Pc.a<AppHostViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        InterfaceC5431s w02 = getSupportFragmentManager().w0();
        CacheHolder cacheHolder = w02 instanceof CacheHolder ? (CacheHolder) w02 : null;
        if (cacheHolder != null) {
            return cacheHolder.getAtomPool();
        }
        return null;
    }

    @Override // qZ.InterfaceC9013e
    @NotNull
    public InterfaceC9014f getScreenFlowTag() {
        InterfaceC9014f screenFlowTag;
        ComponentCallbacksC5392m w02 = getSupportFragmentManager().w0();
        C9011c c9011c = w02 instanceof C9011c ? (C9011c) w02 : null;
        if (c9011c != null && (screenFlowTag = c9011c.getScreenFlowTag()) != null) {
            return screenFlowTag;
        }
        InterfaceC9014f.f81797k0.getClass();
        return InterfaceC9014f.a.a();
    }

    @Override // xZ.l
    public int getThemeId() {
        return this.themeId;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public fk0.c getPrefetchViewPool() {
        InterfaceC5431s w02 = getSupportFragmentManager().w0();
        CacheHolder cacheHolder = w02 instanceof CacheHolder ? (CacheHolder) w02 : null;
        if (cacheHolder != null) {
            return cacheHolder.getPrefetchViewPool();
        }
        return null;
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigation() {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.hideBottomNavigation();
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigationWithAnimation(long duration) {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.hideBottomNavigationWithAnimation(duration);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void hideBottomNavigationWithTranslationAnimation(long duration) {
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.hideBottomNavigationWithTranslationAnimation(duration);
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((requestCode >> 16) != 0) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        ComponentCallbacksC5392m w02 = getSupportFragmentManager().w0();
        if (w02 != null) {
            w02.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        int i11 = c.f34471a;
        c.a.a();
        Intrinsics.checkNotNullParameter("Creating DaggerAppHostActivityComponent", "stepName");
        Yh0.f.c("Creating DaggerAppHostActivityComponent");
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        AppHostActivityComponent.Factory factory = DaggerAppHostActivityComponent.factory();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage3.b(StorageComponentApi.class);
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage4.b(ActionComponentApi.class);
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(this, OnboardingCheckerComponentApi.class).getDependencyStorage();
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        OnboardingCheckerComponentApi onboardingCheckerComponentApi = (OnboardingCheckerComponentApi) dependencyStorage5.b(OnboardingCheckerComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage6 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, (AnalyticsComponentApi) dependencyStorage6.b(AnalyticsComponentApi.class)).inject(this);
        if (StartupTimeTrackerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StartupTimeTrackerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage7 = C6739a.a(this, StartupTimeTrackerComponentApi.class).getDependencyStorage();
        if (StartupTimeTrackerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StartupTimeTrackerComponentApi is not DiComponent");
        }
        this.startupTimeTracker = ((StartupTimeTrackerComponentApi) dependencyStorage7.b(StartupTimeTrackerComponentApi.class)).getStartupTimeTracker();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage8 = C6739a.a(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.featureChecker = ((NetworkComponentApi) dependencyStorage8.b(NetworkComponentApi.class)).getFeatureChecker();
        c cVar = this.startupTimeTracker;
        if (cVar == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar.a("Installing SplashScreen");
        Intrinsics.checkNotNullParameter(this, "<this>");
        C10411b c10411b = new C10411b(this);
        C10411b.a(c10411b);
        c10411b.b(new AY.a(this));
        this.splashScreen = c10411b;
        c cVar2 = this.startupTimeTracker;
        if (cVar2 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar2.a("Getting OzonRouter");
        this.router = navigationComponentApi.getOzonRouter();
        this.holder = navigationComponentApi.getNavigatorHolder();
        this.miniAppConfigHolder = navigationComponentApi.getMiniAppConfigHolder();
        observeMiniAppConfig();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage9 = C6739a.a(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        this.analyticsScreenStorage = ((AnalyticsScreenStorageComponentApi) dependencyStorage9.b(AnalyticsScreenStorageComponentApi.class)).getAnalyticsScreenStorage();
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage10 = C6739a.a(this, AppLaunchHandlersComponentApi.class).getDependencyStorage();
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        AppLaunchHandlersComponentApi appLaunchHandlersComponentApi = (AppLaunchHandlersComponentApi) dependencyStorage10.b(AppLaunchHandlersComponentApi.class);
        this.appLaunchArgumentsInterceptor = appLaunchHandlersComponentApi.getAppLaunchArgumentsInterceptor();
        this.appLaunchListener = appLaunchHandlersComponentApi.getAppLaunchListener();
        if (InAppPushHostApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppPushHostApi is not DiComponent");
        }
        C6740b dependencyStorage11 = C6739a.a(this, InAppPushHostApi.class).getDependencyStorage();
        if (InAppPushHostApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppPushHostApi is not DiComponent");
        }
        this.inAppPushHost = ((InAppPushHostApi) dependencyStorage11.b(InAppPushHostApi.class)).getInAppPushHost();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage12 = C6739a.a(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        ManualStateBundleActivityCallback manualStateBundleActivityCallback = ((AndroidPlatformComponentApi) dependencyStorage12.b(AndroidPlatformComponentApi.class)).getManualStateBundleActivityCallback();
        this.customBundleSaveStateActivityCallback = manualStateBundleActivityCallback;
        if (manualStateBundleActivityCallback == null) {
            Intrinsics.n("customBundleSaveStateActivityCallback");
            throw null;
        }
        manualStateBundleActivityCallback.onActivityPreCreated(this, savedInstanceState);
        c cVar3 = this.startupTimeTracker;
        if (cVar3 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar3.a("AppHostActivity super.onCreate");
        super.onCreate(savedInstanceState);
        c cVar4 = this.startupTimeTracker;
        if (cVar4 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar4.a("Creating AppHostNavigator");
        Intent intent = getIntent();
        final C10683b c10683b = new C10683b(this, "main", R$id.rootNavigationContainer, new com.google.gson.internal.e(intent != null ? intent.getStringExtra("ru.ozon.app.android.ui.start.PreStartActivity.EXTRA_REDIRECT_DESTINATION") : null));
        c cVar5 = this.startupTimeTracker;
        if (cVar5 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar5.a("Executing setContentView");
        setContentView(R$layout.activity_app_host);
        c cVar6 = this.startupTimeTracker;
        if (cVar6 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar6.a("Creating PermissionRequest.Builder");
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
        String value = getAppHostViewModel().getOnboardingRequiredLiveData().getValue();
        if (value == null && savedInstanceState == null) {
            getAppHostViewModel().getOnboardingRequiredLiveData().observe(this, new W<String>() { // from class: ru.ozon.app.android.ui.start.AppHostActivity$onCreate$2
                @Override // androidx.lifecycle.W
                public void onChanged(String value2) {
                    Intrinsics.checkNotNullParameter(value2, "value");
                    AppHostActivity.this.navigateToInitialPage(value2, c10683b);
                    AppHostActivity.this.getAppHostViewModel().getOnboardingRequiredLiveData().removeObserver(this);
                }
            });
        } else {
            navigateToInitialPage(value, c10683b);
        }
        AppLaunchListener appLaunchListener = this.appLaunchListener;
        if (appLaunchListener == null) {
            Intrinsics.n("appLaunchListener");
            throw null;
        }
        AppLaunchListener.onActivityCreated$default(appLaunchListener, null, 1, null);
        AppLaunchArgumentsInterceptor appLaunchArgumentsInterceptor = this.appLaunchArgumentsInterceptor;
        if (appLaunchArgumentsInterceptor == null) {
            Intrinsics.n("appLaunchArgumentsInterceptor");
            throw null;
        }
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        appLaunchArgumentsInterceptor.intercept(intent2);
        c cVar7 = this.startupTimeTracker;
        if (cVar7 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar7.a("AppHostActivity#onCreate ends");
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage13 = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        this.bugReportCookieState = ((StorageComponentApi) dependencyStorage13.b(StorageComponentApi.class)).getBugReportCookieState();
        addBugReportIconView();
        observeBugReportFlow();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected void onDestroy() {
        View decorView = getWindow().getDecorView();
        Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        BugReportView bugReportView = this.bugReportView;
        if (bugReportView == null) {
            Intrinsics.n("bugReportView");
            throw null;
        }
        viewGroup.removeView(bugReportView);
        super.onDestroy();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
        handleSharedImage();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected void onResume() {
        super.onResume();
        Kd0.a.c();
    }

    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ManualStateBundleActivityCallback manualStateBundleActivityCallback = this.customBundleSaveStateActivityCallback;
        if (manualStateBundleActivityCallback != null) {
            manualStateBundleActivityCallback.onActivityPostSaveInstanceState(outState);
        } else {
            Intrinsics.n("customBundleSaveStateActivityCallback");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean onSupportNavigateUp() {
        if (!getOnBackPressedDispatcher().j()) {
            return super.onSupportNavigateUp();
        }
        getOnBackPressedDispatcher().l();
        return true;
    }

    @Override // n10.InterfaceC8417a
    public void pageViewChanged() {
        InterfaceC5431s w02 = getSupportFragmentManager().w0();
        InterfaceC8417a interfaceC8417a = w02 instanceof InterfaceC8417a ? (InterfaceC8417a) w02 : null;
        if (interfaceC8417a != null) {
            interfaceC8417a.pageViewChanged();
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void removeListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.removeListener(listener);
        }
    }

    @Override // ru.ozon.app.android.permission.PermissionRequester
    public void requestPermission(@NotNull Function1<? super PermissionRequest.Builder, Unit> buildPermissionRequest) {
        Intrinsics.checkNotNullParameter(buildPermissionRequest, "buildPermissionRequest");
        PermissionRequest.Builder builder = this.permissionRequestBuilder;
        if (builder == null) {
            Intrinsics.n("permissionRequestBuilder");
            throw null;
        }
        buildPermissionRequest.invoke(builder);
        builder.build().execute();
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigation() {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.showBottomNavigation();
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigationWithAnimation(long duration) {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.showBottomNavigationWithAnimation(duration);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void showBottomNavigationWithTranslationAnimation(long duration) {
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.showBottomNavigationWithTranslationAnimation(duration);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider
    @InterfaceC3999a
    /* renamed from: themeResId */
    public int getThemeId() {
        e eVar = this.miniAppConfigHolder;
        if (eVar != null) {
            return BZ.f.b(eVar);
        }
        Intrinsics.n("miniAppConfigHolder");
        throw null;
    }
}
