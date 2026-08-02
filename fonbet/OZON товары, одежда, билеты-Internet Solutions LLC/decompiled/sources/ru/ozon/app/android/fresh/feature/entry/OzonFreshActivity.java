package ru.ozon.app.android.fresh.feature.entry;

import B90.A;
import B90.B;
import B90.C2623z;
import EZ.h;
import Fb0.e;
import GZ.g;
import Rg.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sg.a;
import We.E;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ei0.InterfaceC6369b;
import fk0.c;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import qZ.InterfaceC9013e;
import qZ.InterfaceC9014f;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentsInterceptor;
import ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.feature.entry.databinding.ActivityOzonFreshBinding;
import ru.ozon.app.android.fresh.feature.entry.di.DaggerOzonFreshActivityComponent;
import ru.ozon.app.android.fresh.feature.entry.di.OzonFreshActivityComponent;
import ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostUiReadyNotifier;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import w2.C10411b;
import w2.C10416g;
import xZ.C10683b;
import xZ.InterfaceC10682a;
import xZ.l;
import yZ.f;

@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0004¢\u0001£\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u0010\rJ\u000f\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u0010\rJ\u0017\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b9\u00106J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0010H\u0002¢\u0006\u0004\bB\u0010\rJ\u000f\u0010C\u001a\u00020\u0010H\u0002¢\u0006\u0004\bC\u0010\rJ\u000f\u0010D\u001a\u00020\u0010H\u0002¢\u0006\u0004\bD\u0010\rJ\u0011\u0010E\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bE\u0010FJ\u0011\u0010G\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bI\u0010\u001fJ\u000f\u0010J\u001a\u00020\u0010H\u0002¢\u0006\u0004\bJ\u0010\rJ\u000f\u0010K\u001a\u00020\u0010H\u0002¢\u0006\u0004\bK\u0010\rJ\u000f\u0010L\u001a\u00020\u0010H\u0002¢\u0006\u0004\bL\u0010\rJ\u0019\u0010M\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bM\u0010\u0012J\u000f\u0010N\u001a\u00020\u0010H\u0002¢\u0006\u0004\bN\u0010\rJ\u000f\u0010O\u001a\u00020\u0010H\u0002¢\u0006\u0004\bO\u0010\rJ!\u0010T\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R(\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010m\u001a\u00020l8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010t\u001a\u00020s8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR#\u0010{\u001a\u00020z8\u0000@\u0000X\u0081.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u008f\u0001\u001a\u00020\u00132\u0007\u0010\u008e\u0001\u001a\u00020\u00138\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u008f\u0001\u0010\u0015R2\u0010\u0092\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0091\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009d\u0001\u001a\u000b \u0098\u0001*\u0004\u0018\u00010^0^8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010\u009e\u0001\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006¤\u0001"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/OzonFreshActivity;", "Landroidx/appcompat/app/g;", "LxZ/a;", "Lru/ozon/app/android/navigation/newrouter/navigators/host/AppHostUiReadyNotifier;", "LqZ/e;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "LyZ/f;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "LRg/b;", "LxZ/l;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "onSupportNavigateUp", "()Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "getViewPool", "()Lfk0/c;", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "LqZ/f;", "getScreenFlowTag", "()LqZ/f;", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "setRootView", "initDependencies", "initPermissionBuilder", "getBottomNavigationStateController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "getBottomNavigationAnimationController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "handleIntent", "setGeoProxyConfig", "loadMapApiKeys", "launchSplashScreen", "handleNavigation", "reportActivityCreated", "interceptIntent", "", "state", "LxZ/b;", "navigator", "navigateToInitialPage", "(Ljava/lang/String;LxZ/b;)V", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "getEnvironmentService$entry_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/storage/environment/EnvironmentService;", "setEnvironmentService$entry_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/storage/environment/EnvironmentService;)V", "LPc/a;", "Lru/ozon/app/android/fresh/feature/entry/OzonFreshViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider$entry_prodGoogleAllVendorsRelease", "()LPc/a;", "setViewModelProvider$entry_prodGoogleAllVendorsRelease", "(LPc/a;)V", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder$entry_prodGoogleAllVendorsRelease", "()LEZ/h;", "setNavigatorHolder$entry_prodGoogleAllVendorsRelease", "(LEZ/h;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter$entry_prodGoogleAllVendorsRelease", "()LGZ/g;", "setOzonRouter$entry_prodGoogleAllVendorsRelease", "(LGZ/g;)V", "LWe/E;", "okHttpClient", "LWe/E;", "getOkHttpClient$entry_prodGoogleAllVendorsRelease", "()LWe/E;", "setOkHttpClient$entry_prodGoogleAllVendorsRelease", "(LWe/E;)V", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "deeplinkDelegate", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "getDeeplinkDelegate$entry_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "setDeeplinkDelegate$entry_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;)V", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "appLaunchListener", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "appLaunchArgumentsInterceptor", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "analyticsScreenStorage", "LSg/a;", "Lei0/b;", "ozonTracker", "Lei0/b;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isAppHostUiReady", "Z", "Lkotlin/Function0;", "onAppHostUiReady", "Lkotlin/jvm/functions/Function0;", "getOnAppHostUiReady", "()Lkotlin/jvm/functions/Function0;", "setOnAppHostUiReady", "(Lkotlin/jvm/functions/Function0;)V", "kotlin.jvm.PlatformType", "activityViewModel$delegate", "LSc/j;", "getActivityViewModel", "()Lru/ozon/app/android/fresh/feature/entry/OzonFreshViewModel;", "activityViewModel", "themeId", "I", "getThemeId", "()I", "Companion", "OnboardingStatusObserver", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonFreshActivity extends g implements InterfaceC10682a, AppHostUiReadyNotifier, InterfaceC9013e, BottomNavigationStateController, BottomNavigationAnimationController, f, CacheHolder, PermissionRequester, b, l {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private a analyticsScreenStorage;
    private AppLaunchArgumentsInterceptor appLaunchArgumentsInterceptor;
    private AppLaunchListener appLaunchListener;
    public ExternalDeeplinkProcessorDelegate deeplinkDelegate;
    public EnvironmentService environmentService;
    private boolean isAppHostUiReady;
    public h navigatorHolder;
    public E okHttpClient;
    private Function0<Unit> onAppHostUiReady;
    public GZ.g ozonRouter;
    private InterfaceC6369b ozonTracker;
    private PermissionRequest.Builder permissionRequestBuilder;
    public Pc.a<OzonFreshViewModel> viewModelProvider;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j activityViewModel = LazyUtilsKt.unsafeLazy(new OzonFreshActivity$activityViewModel$2(this));
    private final int themeId = R$style.OzonFreshTheme;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/OzonFreshActivity$Companion;", "", "<init>", "()V", "EXTRA_REDIRECT_DESTINATION", "", "MAP_API_APP_NAME", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "deeplink", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, String deeplink) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) OzonFreshActivity.class);
            intent.addFlags(67108864);
            if (deeplink != null && !deeplink.equals(LinkGenerator.INSTANCE.home().toString())) {
                intent.putExtra("ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity.EXTRA_REDIRECT_DESTINATION", deeplink);
            }
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/OzonFreshActivity$OnboardingStatusObserver;", "Landroidx/lifecycle/W;", "", "Landroidx/lifecycle/P;", "liveData", "Lkotlin/Function1;", "", "action", "<init>", "(Landroidx/lifecycle/P;Lkotlin/jvm/functions/Function1;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onChanged", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lkotlin/jvm/functions/Function1;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    private static final class OnboardingStatusObserver implements W<String> {

        @NotNull
        private final Function1<String, Unit> action;

        @NotNull
        private final P<String> liveData;

        /* JADX WARN: Multi-variable type inference failed */
        public OnboardingStatusObserver(@NotNull P<String> liveData, @NotNull Function1<? super String, Unit> action) {
            Intrinsics.checkNotNullParameter(liveData, "liveData");
            Intrinsics.checkNotNullParameter(action, "action");
            this.liveData = liveData;
            this.action = action;
        }

        @Override // androidx.lifecycle.W
        public void onChanged(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.action.invoke(value);
            this.liveData.removeObserver(this);
        }
    }

    private final OzonFreshViewModel getActivityViewModel() {
        return (OzonFreshViewModel) this.activityViewModel.getValue();
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
        String stringExtra = intent != null ? intent.getStringExtra("ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity.EXTRA_REDIRECT_DESTINATION") : null;
        getDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().navigate(intent);
        if (stringExtra == null || kotlin.text.h.K(stringExtra)) {
            return;
        }
        g.a.a(getOzonRouter$entry_prodGoogleAllVendorsRelease(), stringExtra, null, null, 6);
    }

    private final void handleNavigation(Bundle savedInstanceState) {
        Intent intent = getIntent();
        C10683b c10683b = new C10683b(this, "supermarket", R$id.rootNavigationContainer, new B(intent != null ? intent.getStringExtra("ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity.EXTRA_REDIRECT_DESTINATION") : null));
        String value = getActivityViewModel().onboardingStatusLiveData().getValue();
        if (value == null && savedInstanceState == null) {
            getActivityViewModel().onboardingStatusLiveData().observe(this, new OnboardingStatusObserver(getActivityViewModel().onboardingStatusLiveData(), new OzonFreshActivity$handleNavigation$observer$1(this, c10683b)));
        } else {
            navigateToInitialPage(value, c10683b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacksC5392m handleNavigation$lambda$3(String str) {
        return OzonFreshFragment.INSTANCE.newInstance(str);
    }

    private final void initDependencies() {
        OzonFreshActivityComponent.Factory factory = DaggerOzonFreshActivityComponent.factory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
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
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(this, OnboardingCheckerComponentApi.class).getDependencyStorage();
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        OnboardingCheckerComponentApi onboardingCheckerComponentApi = (OnboardingCheckerComponentApi) dependencyStorage4.b(OnboardingCheckerComponentApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage5.b(ContextComponentDependencies.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage6 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, networkComponentApi, storageComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, (AnalyticsComponentApi) dependencyStorage6.b(AnalyticsComponentApi.class)).inject(this);
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage7 = C6739a.a(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        this.analyticsScreenStorage = ((AnalyticsScreenStorageComponentApi) dependencyStorage7.b(AnalyticsScreenStorageComponentApi.class)).getAnalyticsScreenStorage();
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage8 = C6739a.a(this, AppLaunchHandlersComponentApi.class).getDependencyStorage();
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        AppLaunchHandlersComponentApi appLaunchHandlersComponentApi = (AppLaunchHandlersComponentApi) dependencyStorage8.b(AppLaunchHandlersComponentApi.class);
        this.appLaunchListener = appLaunchHandlersComponentApi.getAppLaunchListener();
        this.appLaunchArgumentsInterceptor = appLaunchHandlersComponentApi.getAppLaunchArgumentsInterceptor();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage9 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        this.ozonTracker = ((AnalyticsComponentApi) dependencyStorage9.b(AnalyticsComponentApi.class)).getOzonTracker();
    }

    private final void initPermissionBuilder() {
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
    }

    private final void interceptIntent() {
        AppLaunchArgumentsInterceptor appLaunchArgumentsInterceptor = this.appLaunchArgumentsInterceptor;
        if (appLaunchArgumentsInterceptor == null) {
            Intrinsics.n("appLaunchArgumentsInterceptor");
            throw null;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        appLaunchArgumentsInterceptor.intercept(intent);
    }

    private final void launchSplashScreen() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        C10411b c10411b = new C10411b(this);
        C10411b.a(c10411b);
        c10411b.b(new C2623z(this));
        c10411b.c(new A(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean launchSplashScreen$lambda$2$lambda$0(OzonFreshActivity ozonFreshActivity) {
        return !ozonFreshActivity.getActivityViewModel().getCanNavigate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchSplashScreen$lambda$2$lambda$1(OzonFreshActivity ozonFreshActivity, C10416g splashScreenView) {
        Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
        splashScreenView.c();
        ozonFreshActivity.isAppHostUiReady = true;
        Function0<Unit> onAppHostUiReady = ozonFreshActivity.getOnAppHostUiReady();
        if (onAppHostUiReady != null) {
            onAppHostUiReady.invoke();
        }
    }

    private final void loadMapApiKeys() {
        getActivityViewModel().loadMapApiKeys();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToInitialPage(String state, C10683b navigator) {
        yZ.h.a(navigator, getNavigatorHolder$entry_prodGoogleAllVendorsRelease(), this);
        getDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().navigate(getIntent());
        if (state != null && !kotlin.text.h.K(state)) {
            g.a.a(getOzonRouter$entry_prodGoogleAllVendorsRelease(), state, null, null, 6);
        }
        getActivityViewModel().initialPageOpened();
    }

    private final void reportActivityCreated() {
        AppLaunchListener appLaunchListener = this.appLaunchListener;
        if (appLaunchListener != null) {
            appLaunchListener.onActivityCreated("supermarket");
        } else {
            Intrinsics.n("appLaunchListener");
            throw null;
        }
    }

    private final void setGeoProxyConfig() {
        if (this.okHttpClient == null || this.ozonTracker == null) {
            return;
        }
        GeoProxyConfigClient geoProxyConfigClient = new GeoProxyConfigClient(this) { // from class: ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity$setGeoProxyConfig$config$1
            private final String appName = "fresh-mobile-android";
            private final ApiHost host;
            private final E okHttpClient;
            private final InterfaceC6369b ozonTracker;

            {
                InterfaceC6369b interfaceC6369b;
                e.a aVar = e.Companion;
                boolean isStage = this.getEnvironmentService$entry_prodGoogleAllVendorsRelease().isStage();
                aVar.getClass();
                this.host = new GeoProxyApiHost(isStage ? e.defaultStage : e.defaultProd);
                this.okHttpClient = this.getOkHttpClient$entry_prodGoogleAllVendorsRelease();
                interfaceC6369b = this.ozonTracker;
                if (interfaceC6369b != null) {
                    this.ozonTracker = interfaceC6369b;
                } else {
                    Intrinsics.n("ozonTracker");
                    throw null;
                }
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public String getAppName() {
                return this.appName;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public ApiHost getHost() {
                return this.host;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient
            public E getOkHttpClient() {
                return this.okHttpClient;
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
            public InterfaceC6369b getOzonTracker() {
                return this.ozonTracker;
            }
        };
        ie0.g.f66321a.getClass();
        ie0.g.k(geoProxyConfigClient);
    }

    private final void setRootView() {
        ActivityOzonFreshBinding inflate = ActivityOzonFreshBinding.inflate(LayoutInflater.from(this));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        setContentView(inflate.getConstraintLayout());
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
    public final ExternalDeeplinkProcessorDelegate getDeeplinkDelegate$entry_prodGoogleAllVendorsRelease() {
        ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate = this.deeplinkDelegate;
        if (externalDeeplinkProcessorDelegate != null) {
            return externalDeeplinkProcessorDelegate;
        }
        Intrinsics.n("deeplinkDelegate");
        throw null;
    }

    @NotNull
    public final EnvironmentService getEnvironmentService$entry_prodGoogleAllVendorsRelease() {
        EnvironmentService environmentService = this.environmentService;
        if (environmentService != null) {
            return environmentService;
        }
        Intrinsics.n("environmentService");
        throw null;
    }

    @NotNull
    public final h getNavigatorHolder$entry_prodGoogleAllVendorsRelease() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    @NotNull
    public final E getOkHttpClient$entry_prodGoogleAllVendorsRelease() {
        E e11 = this.okHttpClient;
        if (e11 != null) {
            return e11;
        }
        Intrinsics.n("okHttpClient");
        throw null;
    }

    public Function0<Unit> getOnAppHostUiReady() {
        return this.onAppHostUiReady;
    }

    @NotNull
    public final GZ.g getOzonRouter$entry_prodGoogleAllVendorsRelease() {
        GZ.g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
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

    @NotNull
    public final Pc.a<OzonFreshViewModel> getViewModelProvider$entry_prodGoogleAllVendorsRelease() {
        Pc.a<OzonFreshViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
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

    @Override // ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostUiReadyNotifier
    /* renamed from: isAppHostUiReady, reason: from getter */
    public boolean getIsAppHostUiReady() {
        return this.isAppHostUiReady;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, android.app.Activity
    @InterfaceC3999a
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    @SuppressLint({"MissingActivityTheme"})
    public void onCreate(Bundle savedInstanceState) {
        initDependencies();
        launchSplashScreen();
        super.onCreate(savedInstanceState);
        setGeoProxyConfig();
        loadMapApiKeys();
        setRootView();
        initPermissionBuilder();
        handleNavigation(savedInstanceState);
        reportActivityCreated();
        interceptIntent();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
    }

    @Override // androidx.appcompat.app.g
    public boolean onSupportNavigateUp() {
        if (!getOnBackPressedDispatcher().j()) {
            return super.onSupportNavigateUp();
        }
        getOnBackPressedDispatcher().l();
        return true;
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

    @Override // ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostUiReadyNotifier
    public void setOnAppHostUiReady(Function0<Unit> function0) {
        this.onAppHostUiReady = function0;
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
}
