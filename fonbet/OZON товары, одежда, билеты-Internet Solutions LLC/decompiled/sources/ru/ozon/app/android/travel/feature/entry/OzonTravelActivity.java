package ru.ozon.app.android.travel.feature.entry;

import Ae.C2399j;
import Ae.C2408n0;
import B90.L;
import B90.M;
import B90.N;
import EZ.h;
import Fb0.e;
import GZ.g;
import Rg.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
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
import androidx.lifecycle.K;
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
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentsInterceptor;
import ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
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
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.travel.feature.entry.databinding.ActivityOzonTravelBinding;
import ru.ozon.app.android.travel.feature.entry.di.DaggerOzonTravelActivityComponent;
import ru.ozon.app.android.travel.feature.entry.di.OzonTravelActivityComponent;
import ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragment;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingDelegate;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingDelegateImpl;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel;
import ru.ozon.app.android.travel.feature.entry.shortcuts.ShortcutsController;
import ru.ozon.app.android.travel.map.di.TravelMapApi;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.ComposerApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import w2.C10411b;
import w2.C10416g;
import xZ.C10683b;
import xZ.InterfaceC10682a;
import xZ.l;
import xe.B0;
import xe.C10727i;
import yZ.f;

@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 µ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0004µ\u0001¶\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0014¢\u0006\u0004\b \u0010\rJ\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J#\u0010*\u001a\u00020\u00102\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00100'H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u0010\rJ\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010\rJ\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b8\u00107J\u0017\u00109\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b9\u00107J\u0017\u0010:\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b:\u00107J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010>J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0010H\u0002¢\u0006\u0004\bC\u0010\rJ\u000f\u0010D\u001a\u00020\u0010H\u0002¢\u0006\u0004\bD\u0010\rJ\u000f\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010\rJ\u000f\u0010F\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010\rJ\u0011\u0010G\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bG\u0010HJ\u0011\u0010I\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bK\u0010\u001fJ\u000f\u0010L\u001a\u00020\u0010H\u0002¢\u0006\u0004\bL\u0010\rJ\u000f\u0010M\u001a\u00020\u0010H\u0002¢\u0006\u0004\bM\u0010\rJ\u000f\u0010N\u001a\u00020\u0010H\u0002¢\u0006\u0004\bN\u0010\rJ\u0019\u0010O\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bO\u0010\u0012J\u000f\u0010P\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u0010\rJ\u000f\u0010Q\u001a\u00020\u0010H\u0002¢\u0006\u0004\bQ\u0010\rJ!\u0010V\u001a\u00020\u00102\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0010H\u0002¢\u0006\u0004\bX\u0010\rJ\u000f\u0010Y\u001a\u00020\u0010H\u0002¢\u0006\u0004\bY\u0010\rJ\u000f\u0010Z\u001a\u00020\u0010H\u0002¢\u0006\u0004\bZ\u0010\rR\"\u0010\\\u001a\u00020[8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010d\u001a\b\u0012\u0004\u0012\u00020c0b8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR(\u0010k\u001a\b\u0012\u0004\u0012\u00020j0b8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bk\u0010e\u001a\u0004\bl\u0010g\"\u0004\bm\u0010iR\"\u0010o\u001a\u00020n8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010v\u001a\u00020u8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u0080\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R)\u0010\u009a\u0001\u001a\u000b \u0095\u0001*\u0004\u0018\u00010c0c8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010\u009e\u0001\u001a\u000b \u0095\u0001*\u0004\u0018\u00010j0j8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0097\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R)\u0010£\u0001\u001a\u00020\u00132\u0007\u0010¢\u0001\u001a\u00020\u00138\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\b£\u0001\u0010\u0015R2\u0010¦\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010¥\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R!\u0010°\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0097\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u001f\u0010±\u0001\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001¨\u0006·\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/OzonTravelActivity;", "Landroidx/appcompat/app/g;", "LxZ/a;", "Lru/ozon/app/android/navigation/newrouter/navigators/host/AppHostUiReadyNotifier;", "LqZ/e;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "LyZ/f;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "LRg/b;", "LxZ/l;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "onSupportNavigateUp", "()Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onDestroy", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "getViewPool", "()Lfk0/c;", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "LqZ/f;", "getScreenFlowTag", "()LqZ/f;", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "setRootView", "initDependencies", "initPermissionBuilder", "initNotificationOnboardingDelegate", "getBottomNavigationStateController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "getBottomNavigationAnimationController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "handleIntent", "setGeoProxyConfig", "loadMapApiKeys", "launchSplashScreen", "handleNavigation", "reportActivityCreated", "interceptIntent", "", "state", "LxZ/b;", "navigator", "navigateToInitialPage", "(Ljava/lang/String;LxZ/b;)V", "observeViewModels", "initNotificationOnboardingFlow", "populateShortcuts", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "getEnvironmentService$entry_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/storage/environment/EnvironmentService;", "setEnvironmentService$entry_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/storage/environment/EnvironmentService;)V", "LPc/a;", "Lru/ozon/app/android/travel/feature/entry/OzonTravelViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider$entry_prodGoogleAllVendorsRelease", "()LPc/a;", "setViewModelProvider$entry_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel;", "notificationViewModelProvider", "getNotificationViewModelProvider$entry_prodGoogleAllVendorsRelease", "setNotificationViewModelProvider$entry_prodGoogleAllVendorsRelease", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProvidersStorage", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "getTravelGeoProvidersStorage$entry_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "setTravelGeoProvidersStorage$entry_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;)V", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "deeplinkDelegate", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "getDeeplinkDelegate$entry_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "setDeeplinkDelegate$entry_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;)V", "LEZ/h;", "holder", "LEZ/h;", "LGZ/g;", "router", "LGZ/g;", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "appLaunchListener", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "appLaunchArgumentsInterceptor", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "analyticsScreenStorage", "LSg/a;", "LWe/E;", "okHttpClient", "LWe/E;", "Lei0/b;", "ozonTracker", "Lei0/b;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingDelegate;", "notificationOnboardingDelegate", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingDelegate;", "kotlin.jvm.PlatformType", "activityViewModel$delegate", "LSc/j;", "getActivityViewModel", "()Lru/ozon/app/android/travel/feature/entry/OzonTravelViewModel;", "activityViewModel", "notificationOnboardingViewModel$delegate", "getNotificationOnboardingViewModel", "()Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel;", "notificationOnboardingViewModel", "Lxe/B0;", "notificationOnboardingJob", "Lxe/B0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isAppHostUiReady", "Z", "Lkotlin/Function0;", "onAppHostUiReady", "Lkotlin/jvm/functions/Function0;", "getOnAppHostUiReady", "()Lkotlin/jvm/functions/Function0;", "setOnAppHostUiReady", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/entry/shortcuts/ShortcutsController;", "shortcutsController$delegate", "getShortcutsController", "()Lru/ozon/app/android/travel/feature/entry/shortcuts/ShortcutsController;", "shortcutsController", "themeId", "I", "getThemeId", "()I", "Companion", "OnboardingStatusObserver", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonTravelActivity extends g implements InterfaceC10682a, AppHostUiReadyNotifier, InterfaceC9013e, BottomNavigationStateController, BottomNavigationAnimationController, f, CacheHolder, PermissionRequester, b, l {

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j activityViewModel;
    private a analyticsScreenStorage;
    private AppLaunchArgumentsInterceptor appLaunchArgumentsInterceptor;
    private AppLaunchListener appLaunchListener;
    public ExternalDeeplinkProcessorDelegate deeplinkDelegate;
    public EnvironmentService environmentService;
    private h holder;
    private boolean isAppHostUiReady;
    private NotificationOnboardingDelegate notificationOnboardingDelegate;
    private B0 notificationOnboardingJob;

    /* renamed from: notificationOnboardingViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationOnboardingViewModel;
    public Pc.a<NotificationOnboardingViewModel> notificationViewModelProvider;
    private E okHttpClient;
    private Function0<Unit> onAppHostUiReady;
    private InterfaceC6369b ozonTracker;
    private PermissionRequest.Builder permissionRequestBuilder;
    private GZ.g router;

    /* renamed from: shortcutsController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shortcutsController;
    private final int themeId;
    public TravelGeoProvidersStorage travelGeoProvidersStorage;
    public Pc.a<OzonTravelViewModel> viewModelProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/OzonTravelActivity$Companion;", "", "<init>", "()V", "EXTRA_REDIRECT_DESTINATION", "", "MAP_API_APP_NAME", "CROSSAPP_WAIT_TIME_MS", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "deeplink", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, String deeplink) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) OzonTravelActivity.class);
            intent.addFlags(67108864);
            if (deeplink != null) {
                intent.putExtra("ru.ozon.app.android.travel.feature.entry.OzonTravelActivity.EXTRA_REDIRECT_DESTINATION", deeplink);
            }
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/OzonTravelActivity$OnboardingStatusObserver;", "Landroidx/lifecycle/W;", "", "Landroidx/lifecycle/P;", "liveData", "Lkotlin/Function1;", "", "action", "<init>", "(Landroidx/lifecycle/P;Lkotlin/jvm/functions/Function1;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onChanged", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lkotlin/jvm/functions/Function1;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
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

    public OzonTravelActivity() {
        n nVar = n.NONE;
        this.activityViewModel = k.a(nVar, new OzonTravelActivity$activityViewModel$2(this));
        this.notificationOnboardingViewModel = k.a(nVar, new OzonTravelActivity$notificationOnboardingViewModel$2(this));
        this.shortcutsController = LazyUtilsKt.unsafeLazy(OzonTravelActivity$shortcutsController$2.INSTANCE);
        this.themeId = R$style.OzonTravelTheme;
    }

    private final OzonTravelViewModel getActivityViewModel() {
        return (OzonTravelViewModel) this.activityViewModel.getValue();
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

    private final NotificationOnboardingViewModel getNotificationOnboardingViewModel() {
        return (NotificationOnboardingViewModel) this.notificationOnboardingViewModel.getValue();
    }

    private final ShortcutsController getShortcutsController() {
        return (ShortcutsController) this.shortcutsController.getValue();
    }

    private final void handleIntent(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("ru.ozon.app.android.travel.feature.entry.OzonTravelActivity.EXTRA_REDIRECT_DESTINATION") : null;
        getDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().navigate(intent);
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

    private final void handleNavigation(Bundle savedInstanceState) {
        Intent intent = getIntent();
        C10683b c10683b = new C10683b(this, "main", R$id.rootNavigationContainer, new L(intent != null ? intent.getStringExtra("ru.ozon.app.android.travel.feature.entry.OzonTravelActivity.EXTRA_REDIRECT_DESTINATION") : null));
        String value = getActivityViewModel().onboardingStatusLiveData().getValue();
        if (value == null && savedInstanceState == null) {
            getActivityViewModel().onboardingStatusLiveData().observe(this, new OnboardingStatusObserver(getActivityViewModel().onboardingStatusLiveData(), new OzonTravelActivity$handleNavigation$observer$1(this, c10683b)));
        } else {
            navigateToInitialPage(value, c10683b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacksC5392m handleNavigation$lambda$3(String str) {
        return OzonTravelFragment.INSTANCE.newInstance(str);
    }

    private final void initDependencies() {
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        OzonTravelActivityComponent.Factory factory = DaggerOzonTravelActivityComponent.factory();
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
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage5.b(AccountComponentApi.class);
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage6 = C6739a.a(this, OnboardingCheckerComponentApi.class).getDependencyStorage();
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        OnboardingCheckerComponentApi onboardingCheckerComponentApi = (OnboardingCheckerComponentApi) dependencyStorage6.b(OnboardingCheckerComponentApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage7 = C6739a.a(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage7.b(ContextComponentDependencies.class);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage8 = C6739a.a(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) dependencyStorage8.b(AndroidPlatformComponentApi.class);
        if (TravelMapApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TravelMapApi is not DiComponent");
        }
        C6740b dependencyStorage9 = C6739a.a(this, TravelMapApi.class).getDependencyStorage();
        if (TravelMapApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TravelMapApi is not DiComponent");
        }
        TravelMapApi travelMapApi = (TravelMapApi) dependencyStorage9.b(TravelMapApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage10 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, accountComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, androidPlatformComponentApi, travelMapApi, (AnalyticsComponentApi) dependencyStorage10.b(AnalyticsComponentApi.class)).inject(this);
        this.router = navigationComponentApi.getOzonRouter();
        this.holder = navigationComponentApi.getNavigatorHolder();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage11 = C6739a.a(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        this.analyticsScreenStorage = ((AnalyticsScreenStorageComponentApi) dependencyStorage11.b(AnalyticsScreenStorageComponentApi.class)).getAnalyticsScreenStorage();
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage12 = C6739a.a(this, AppLaunchHandlersComponentApi.class).getDependencyStorage();
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        AppLaunchHandlersComponentApi appLaunchHandlersComponentApi = (AppLaunchHandlersComponentApi) dependencyStorage12.b(AppLaunchHandlersComponentApi.class);
        this.appLaunchListener = appLaunchHandlersComponentApi.getAppLaunchListener();
        this.appLaunchArgumentsInterceptor = appLaunchHandlersComponentApi.getAppLaunchArgumentsInterceptor();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage13 = C6739a.a(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.okHttpClient = ((NetworkComponentApi) dependencyStorage13.b(NetworkComponentApi.class)).getOkHttpClient();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage14 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        this.ozonTracker = ((AnalyticsComponentApi) dependencyStorage14.b(AnalyticsComponentApi.class)).getOzonTracker();
    }

    private final void initNotificationOnboardingDelegate() {
        NotificationOnboardingViewModel notificationOnboardingViewModel = getNotificationOnboardingViewModel();
        Intrinsics.checkNotNullExpressionValue(notificationOnboardingViewModel, "<get-notificationOnboardingViewModel>(...)");
        GZ.g gVar = this.router;
        if (gVar != null) {
            this.notificationOnboardingDelegate = new NotificationOnboardingDelegateImpl(this, notificationOnboardingViewModel, gVar);
        } else {
            Intrinsics.n("router");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNotificationOnboardingFlow() {
        B0 b02 = this.notificationOnboardingJob;
        if (b02 == null || !b02.isActive()) {
            this.notificationOnboardingJob = C10727i.c(K.a(this), null, null, new OzonTravelActivity$initNotificationOnboardingFlow$1(this, null), 3);
        }
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
        c10411b.b(new M(this, 6));
        c10411b.c(new N(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean launchSplashScreen$lambda$2$lambda$0(OzonTravelActivity ozonTravelActivity) {
        return !ozonTravelActivity.getActivityViewModel().getCanNavigate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchSplashScreen$lambda$2$lambda$1(OzonTravelActivity ozonTravelActivity, C10416g splashScreenView) {
        Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
        splashScreenView.c();
        ozonTravelActivity.isAppHostUiReady = true;
        Function0<Unit> onAppHostUiReady = ozonTravelActivity.getOnAppHostUiReady();
        if (onAppHostUiReady != null) {
            onAppHostUiReady.invoke();
        }
    }

    private final void loadMapApiKeys() {
        getActivityViewModel().loadMapApiKeys();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToInitialPage(String state, C10683b navigator) {
        h hVar = this.holder;
        if (hVar == null) {
            Intrinsics.n("holder");
            throw null;
        }
        yZ.h.a(navigator, hVar, this);
        getDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().navigate(getIntent());
        if (state != null && !kotlin.text.h.K(state)) {
            GZ.g gVar = this.router;
            if (gVar == null) {
                Intrinsics.n("router");
                throw null;
            }
            g.a.a(gVar, state, null, null, 6);
        }
        getActivityViewModel().initialPageOpened();
    }

    private final void observeViewModels() {
        C2399j.C(new C2408n0(getActivityViewModel().getNotificationAction(), new OzonTravelActivity$observeViewModels$1(this, null)), K.a(this));
    }

    private final void populateShortcuts() {
        getShortcutsController().populateShortcuts(this);
    }

    private final void reportActivityCreated() {
        AppLaunchListener appLaunchListener = this.appLaunchListener;
        if (appLaunchListener != null) {
            AppLaunchListener.onActivityCreated$default(appLaunchListener, null, 1, null);
        } else {
            Intrinsics.n("appLaunchListener");
            throw null;
        }
    }

    private final void setGeoProxyConfig() {
        if (this.okHttpClient == null || this.ozonTracker == null) {
            return;
        }
        GeoProxyConfigClient geoProxyConfigClient = new GeoProxyConfigClient(this) { // from class: ru.ozon.app.android.travel.feature.entry.OzonTravelActivity$setGeoProxyConfig$config$1
            private final String appName = "tx-mobile-android";
            private final ApiHost host;
            private final E okHttpClient;
            private final InterfaceC6369b ozonTracker;

            {
                E e11;
                InterfaceC6369b interfaceC6369b;
                e.a aVar = e.Companion;
                boolean isStage = this.getEnvironmentService$entry_prodGoogleAllVendorsRelease().isStage();
                aVar.getClass();
                this.host = new ComposerApiHost(isStage ? e.defaultStage : e.defaultProd);
                e11 = this.okHttpClient;
                if (e11 == null) {
                    Intrinsics.n("okHttpClient");
                    throw null;
                }
                this.okHttpClient = e11;
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
        if (getTravelGeoProvidersStorage$entry_prodGoogleAllVendorsRelease().isNewStorage()) {
            getTravelGeoProvidersStorage$entry_prodGoogleAllVendorsRelease().setAppName("tx-mobile-android");
        }
    }

    private final void setRootView() {
        ActivityOzonTravelBinding inflate = ActivityOzonTravelBinding.inflate(LayoutInflater.from(this));
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
    public final Pc.a<NotificationOnboardingViewModel> getNotificationViewModelProvider$entry_prodGoogleAllVendorsRelease() {
        Pc.a<NotificationOnboardingViewModel> aVar = this.notificationViewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("notificationViewModelProvider");
        throw null;
    }

    public Function0<Unit> getOnAppHostUiReady() {
        return this.onAppHostUiReady;
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
    public final TravelGeoProvidersStorage getTravelGeoProvidersStorage$entry_prodGoogleAllVendorsRelease() {
        TravelGeoProvidersStorage travelGeoProvidersStorage = this.travelGeoProvidersStorage;
        if (travelGeoProvidersStorage != null) {
            return travelGeoProvidersStorage;
        }
        Intrinsics.n("travelGeoProvidersStorage");
        throw null;
    }

    @NotNull
    public final Pc.a<OzonTravelViewModel> getViewModelProvider$entry_prodGoogleAllVendorsRelease() {
        Pc.a<OzonTravelViewModel> aVar = this.viewModelProvider;
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

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    @SuppressLint({"MissingActivityTheme"})
    protected void onCreate(Bundle savedInstanceState) {
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
        initNotificationOnboardingDelegate();
        observeViewModels();
        populateShortcuts();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected void onDestroy() {
        B0 b02 = this.notificationOnboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.notificationOnboardingJob = null;
        super.onDestroy();
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
