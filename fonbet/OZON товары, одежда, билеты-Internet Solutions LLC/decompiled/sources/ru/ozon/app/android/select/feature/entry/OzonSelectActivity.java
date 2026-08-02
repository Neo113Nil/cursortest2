package ru.ozon.app.android.select.feature.entry;

import Ae.C2399j;
import Ae.C2408n0;
import B90.O;
import BZ.e;
import EZ.h;
import GZ.g;
import Rg.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sg.a;
import Xh0.c;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.K;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fJ.C6474a;
import fJ.C6475b;
import fJ.C6477d;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
import ru.ozon.app.android.composer.universalscreen.view.ComposerThemeProvider;
import ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.InAppPushHostApi;
import ru.ozon.app.android.inapppush.util.InAppHostProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostNotificationUiReadyNotifier;
import ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostUiReadyNotifier;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.select.feature.entry.di.DaggerOzonSelectActivityComponent;
import ru.ozon.app.android.select.feature.entry.di.OzonSelectActivityComponent;
import ru.ozon.app.android.select.feature.entry.splash.view.SelectSplashScreenView;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;
import ru.ozon.app.android.tabbar.ui.SelectTabNavigationFragment;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import w2.C10411b;
import w2.C10416g;
import xZ.C10683b;
import xZ.InterfaceC10682a;
import xZ.l;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import yZ.f;

@Metadata(d1 = {"\u0000æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 Î\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u0010:\u0002Î\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0019H\u0015¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001dH\u0017¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\u00152\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0013H\u0014¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u0010\u0012J\u000f\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b0\u0010\u0012J\u0017\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00152\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b6\u00104J\u0017\u00107\u001a\u00020\u00152\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b7\u00104J\u0017\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0011\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0015H\u0016¢\u0006\u0004\bP\u0010\u0012J\u0019\u0010Q\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bQ\u0010\u001cJ\u0011\u0010R\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bR\u0010SJ\u0011\u0010T\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0015H\u0002¢\u0006\u0004\bV\u0010\u0012J'\u0010[\u001a\u00020\u00152\u0006\u0010X\u001a\u00020W2\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00150YH\u0002¢\u0006\u0004\b[\u0010\\J)\u0010a\u001a\u00020\u00152\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u0015H\u0002¢\u0006\u0004\bc\u0010\u0012J\u000f\u0010d\u001a\u00020\u0015H\u0002¢\u0006\u0004\bd\u0010\u0012J\u0017\u0010g\u001a\u00020,2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hR(\u0010k\u001a\b\u0012\u0004\u0012\u00020j0i8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR(\u0010r\u001a\b\u0012\u0004\u0012\u00020q0i8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR\"\u0010v\u001a\u00020u8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010}\u001a\u00020|8\u0000@\u0000X\u0081.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0087\u0001\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008e\u0001\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0084\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010¡\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¦\u0001\u001a\u00030¥\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010©\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010«\u0001\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R)\u0010·\u0001\u001a\u00020,2\u0007\u0010¶\u0001\u001a\u00020,8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0005\b·\u0001\u0010.R1\u0010¹\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010Y8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R)\u0010¿\u0001\u001a\u00020,2\u0007\u0010¶\u0001\u001a\u00020,8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\b¿\u0001\u0010¸\u0001\u001a\u0005\b¿\u0001\u0010.R1\u0010À\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010Y8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010º\u0001\u001a\u0006\bÁ\u0001\u0010¼\u0001\"\u0006\bÂ\u0001\u0010¾\u0001R\u001e\u0010Ã\u0001\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010$R\u001f\u0010Æ\u0001\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ä\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u001f\u0010É\u0001\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ä\u0001\u001a\u0006\bÊ\u0001\u0010È\u0001R!\u0010Ë\u0001\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010È\u0001¨\u0006Ï\u0001"}, d2 = {"Lru/ozon/app/android/select/feature/entry/OzonSelectActivity;", "Landroidx/appcompat/app/g;", "LxZ/a;", "Lru/ozon/app/android/navigation/newrouter/navigators/host/AppHostUiReadyNotifier;", "Lru/ozon/app/android/navigation/newrouter/navigators/host/AppHostNotificationUiReadyNotifier;", "LqZ/e;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "LyZ/f;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/app/android/permission/PermissionRequester;", "LRg/b;", "LxZ/l;", "Lru/ozon/app/android/composer/universalscreen/view/ThemeResIdProvider;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerThemeProvider;", "Ln10/a;", "Lru/ozon/app/android/inapppush/util/InAppHostProvider;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "themeResId", "()I", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "outState", "onSaveInstanceState", "", "onSupportNavigateUp", "()Z", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "LqZ/f;", "getScreenFlowTag", "()LqZ/f;", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "Lru/ozon/app/android/inapppush/InAppPushHost;", "getInAppHost", "()Lru/ozon/app/android/inapppush/InAppPushHost;", "pageViewChanged", "handleIntent", "getBottomNavigationStateController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "getBottomNavigationAnimationController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "setupDecorViewFocusListener", "Lw2/g;", "screenViewProvider", "Lkotlin/Function0;", "onHidden", "hideSplash", "(Lw2/g;Lkotlin/jvm/functions/Function0;)V", "Lw2/b;", "splash", "LxZ/b;", "navigator", "setupSplashExitListener", "(Lw2/b;LxZ/b;Landroid/os/Bundle;)V", "notifyAppHostUiReady", "notifyAppHostNotificationUiReady", "", ImagesContract.URL, "openUrl", "(Ljava/lang/String;)Z", "LPc/a;", "Lru/ozon/app/android/select/feature/entry/OzonSelectViewModel;", "pViewModel", "LPc/a;", "getPViewModel$entry_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$entry_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;", "pAppOnboardingViewModel", "getPAppOnboardingViewModel$entry_prodGoogleAllVendorsRelease", "setPAppOnboardingViewModel$entry_prodGoogleAllVendorsRelease", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "getEnvironmentService$entry_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/storage/environment/EnvironmentService;", "setEnvironmentService$entry_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/storage/environment/EnvironmentService;)V", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "externalDeeplinkDelegate", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "setExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;)V", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/select/feature/entry/OzonSelectViewModel;", "viewModel", "Lru/ozon/app/android/select/feature/entry/splash/view/SelectSplashScreenView;", "selectSplashView", "Lru/ozon/app/android/select/feature/entry/splash/view/SelectSplashScreenView;", "appOnboardingViewModel$delegate", "getAppOnboardingViewModel", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;", "appOnboardingViewModel", "Lxe/J;", "exceptionHandler", "Lxe/J;", "LEZ/h;", "holder", "LEZ/h;", "LGZ/g;", "router", "LGZ/g;", "analyticsScreenStorage", "LSg/a;", "LXh0/c;", "startupTimeTracker", "LXh0/c;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "appLaunchArgumentsInterceptor", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "appLaunchListener", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "LBZ/e;", "miniAppConfigHolder", "LBZ/e;", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "customBundleSaveStateActivityCallback", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "inAppPushHost", "Lru/ozon/app/android/inapppush/InAppPushHost;", "Lxe/B0;", "navigationEventJob", "Lxe/B0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "splashScreenExitHandled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "windowFocusListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isAppHostUiReady", "Z", "onAppHostUiReady", "Lkotlin/jvm/functions/Function0;", "getOnAppHostUiReady", "()Lkotlin/jvm/functions/Function0;", "setOnAppHostUiReady", "(Lkotlin/jvm/functions/Function0;)V", "isAppHostNotificationUiReady", "onAppHostNotificationUiReady", "getOnAppHostNotificationUiReady", "setOnAppHostNotificationUiReady", "themeId", "I", "getThemeId", "statusBarSemanticColor", "getStatusBarSemanticColor", "()Ljava/lang/Integer;", "loaderBackgroundColor", "getLoaderBackgroundColor", "defaultToolbarBackground", "Ljava/lang/Integer;", "getDefaultToolbarBackground", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonSelectActivity extends g implements InterfaceC10682a, AppHostUiReadyNotifier, AppHostNotificationUiReadyNotifier, InterfaceC9013e, BottomNavigationStateController, BottomNavigationAnimationController, f, CacheHolder, PermissionRequester, b, l, ThemeResIdProvider, ComposerThemeProvider, InterfaceC8417a, InAppHostProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private a analyticsScreenStorage;
    private AppLaunchArgumentsInterceptor appLaunchArgumentsInterceptor;
    private AppLaunchListener appLaunchListener;
    private ManualStateBundleActivityCallback customBundleSaveStateActivityCallback;
    public EnvironmentService environmentService;
    public ExternalDeeplinkProcessorDelegate externalDeeplinkDelegate;
    private h holder;
    private InAppPushHost inAppPushHost;
    private boolean isAppHostNotificationUiReady;
    private boolean isAppHostUiReady;
    private e miniAppConfigHolder;
    private B0 navigationEventJob;
    private Function0<Unit> onAppHostNotificationUiReady;
    private Function0<Unit> onAppHostUiReady;
    public Pc.a<AppOnboardingViewModel> pAppOnboardingViewModel;
    public Pc.a<OzonSelectViewModel> pViewModel;
    private PermissionRequest.Builder permissionRequestBuilder;
    private GZ.g router;
    private SelectSplashScreenView selectSplashView;
    private c startupTimeTracker;
    private ViewTreeObserver.OnWindowFocusChangeListener windowFocusListener;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new OzonSelectActivity$viewModel$2(this));

    /* renamed from: appOnboardingViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j appOnboardingViewModel = k.b(new OzonSelectActivity$appOnboardingViewModel$2(this));

    @NotNull
    private final J exceptionHandler = new OzonSelectActivity$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);

    @NotNull
    private final AtomicBoolean splashScreenExitHandled = new AtomicBoolean(false);
    private final int themeId = R$style.OzonSelectTheme;
    private final int statusBarSemanticColor = R$attr.layerFloor0;
    private final int loaderBackgroundColor = R$attr.clearDarkKey700;
    private final Integer defaultToolbarBackground = Integer.valueOf(ru.ozon.uni.R$color.bg_dark_key);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/select/feature/entry/OzonSelectActivity$Companion;", "", "<init>", "()V", "EXTRA_REDIRECT_DESTINATION", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "deeplink", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, String deeplink) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) OzonSelectActivity.class);
            intent.addFlags(67108864);
            if (deeplink != null) {
                intent.putExtra("ru.ozon.app.android.select.feature.entry.OzonSelectActivity.EXTRA_REDIRECT_DESTINATION", deeplink);
            }
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppOnboardingViewModel getAppOnboardingViewModel() {
        Object value = this.appOnboardingViewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppOnboardingViewModel) value;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final OzonSelectViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OzonSelectViewModel) value;
    }

    private final void handleIntent(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("ru.ozon.app.android.select.feature.entry.OzonSelectActivity.EXTRA_REDIRECT_DESTINATION") : null;
        getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().navigate(intent);
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

    private final void hideSplash(C10416g screenViewProvider, Function0<Unit> onHidden) {
        screenViewProvider.b().post(new J2.b(4, screenViewProvider, onHidden));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void hideSplash$default(OzonSelectActivity ozonSelectActivity, C10416g c10416g, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = OzonSelectActivity$hideSplash$1.INSTANCE;
        }
        ozonSelectActivity.hideSplash(c10416g, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideSplash$lambda$3(C10416g c10416g, Function0 function0) {
        View iconView;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewGroup b11 = c10416g.b();
            if (C6474a.b(b11)) {
                C6475b.a(b11).setAlpha(0.0f);
                iconView = C6475b.a(b11).getIconView();
                if (iconView != null) {
                    iconView.setAlpha(0.0f);
                }
            }
        } else {
            c10416g.b().setAlpha(0.0f);
            c10416g.a().setAlpha(0.0f);
        }
        c10416g.c();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAppHostNotificationUiReady() {
        if (getIsAppHostNotificationUiReady()) {
            return;
        }
        this.isAppHostNotificationUiReady = true;
        Function0<Unit> onAppHostNotificationUiReady = getOnAppHostNotificationUiReady();
        if (onAppHostNotificationUiReady != null) {
            onAppHostNotificationUiReady.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAppHostUiReady() {
        if (getIsAppHostUiReady()) {
            return;
        }
        this.isAppHostUiReady = true;
        Function0<Unit> onAppHostUiReady = getOnAppHostUiReady();
        if (onAppHostUiReady != null) {
            onAppHostUiReady.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacksC5392m onCreate$lambda$1(String str) {
        return SelectTabNavigationFragment.INSTANCE.newInstance(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean openUrl(String url) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        intent.putExtra("com.android.browser.application_id", getApplicationContext().getPackageName());
        try {
            startActivity(intent, null);
            return true;
        } catch (ActivityNotFoundException unused) {
            Log.w("URLSpan", "Activity was not found for intent: " + intent);
            return false;
        }
    }

    private final void setupDecorViewFocusListener() {
        final View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.windowFocusListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: fJ.e
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z11) {
                OzonSelectActivity.setupDecorViewFocusListener$lambda$2(OzonSelectActivity.this, decorView, z11);
            }
        };
        decorView.getViewTreeObserver().addOnWindowFocusChangeListener(this.windowFocusListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDecorViewFocusListener$lambda$2(OzonSelectActivity ozonSelectActivity, View view, boolean z11) {
        ozonSelectActivity.getViewModel().delayedCloseSplash();
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(ozonSelectActivity.windowFocusListener);
    }

    private final void setupSplashExitListener(C10411b splash, C10683b navigator, Bundle savedInstanceState) {
        if (savedInstanceState == null && !getViewModel().isFakeSplashShowed()) {
            splash.c(new C6477d(this, navigator));
            return;
        }
        h hVar = this.holder;
        if (hVar == null) {
            Intrinsics.n("holder");
            throw null;
        }
        yZ.h.a(navigator, hVar, this);
        getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().navigate(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSplashExitListener$lambda$5(OzonSelectActivity ozonSelectActivity, C10683b c10683b, C10416g screenViewProvider) {
        Intrinsics.checkNotNullParameter(screenViewProvider, "screenViewProvider");
        if (ozonSelectActivity.splashScreenExitHandled.compareAndSet(true, true)) {
            hideSplash$default(ozonSelectActivity, screenViewProvider, null, 2, null);
            return;
        }
        if (c10683b.getContainerId() != null) {
            ozonSelectActivity.getViewModel().fakeSplashShowed();
            ozonSelectActivity.splashScreenExitHandled.set(true);
            View decorView = ozonSelectActivity.getWindow().getDecorView();
            Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            SelectSplashScreenView selectSplashScreenView = ozonSelectActivity.selectSplashView;
            if (selectSplashScreenView == null) {
                Intrinsics.n("selectSplashView");
                throw null;
            }
            viewGroup.addView(selectSplashScreenView);
            SelectSplashScreenView selectSplashScreenView2 = ozonSelectActivity.selectSplashView;
            if (selectSplashScreenView2 == null) {
                Intrinsics.n("selectSplashView");
                throw null;
            }
            selectSplashScreenView2.playAnimation(new OzonSelectActivity$setupSplashExitListener$1$1$1(ozonSelectActivity), new OzonSelectActivity$setupSplashExitListener$1$1$2(ozonSelectActivity));
        }
        hideSplash$default(ozonSelectActivity, screenViewProvider, null, 2, null);
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

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerThemeProvider
    public Integer getDefaultToolbarBackground() {
        return this.defaultToolbarBackground;
    }

    @NotNull
    public final ExternalDeeplinkProcessorDelegate getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease() {
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

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerThemeProvider
    @NotNull
    public Integer getLoaderBackgroundColor() {
        return Integer.valueOf(this.loaderBackgroundColor);
    }

    public Function0<Unit> getOnAppHostNotificationUiReady() {
        return this.onAppHostNotificationUiReady;
    }

    public Function0<Unit> getOnAppHostUiReady() {
        return this.onAppHostUiReady;
    }

    @NotNull
    public final Pc.a<AppOnboardingViewModel> getPAppOnboardingViewModel$entry_prodGoogleAllVendorsRelease() {
        Pc.a<AppOnboardingViewModel> aVar = this.pAppOnboardingViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pAppOnboardingViewModel");
        throw null;
    }

    @NotNull
    public final Pc.a<OzonSelectViewModel> getPViewModel$entry_prodGoogleAllVendorsRelease() {
        Pc.a<OzonSelectViewModel> aVar = this.pViewModel;
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

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerThemeProvider
    @NotNull
    public Integer getStatusBarSemanticColor() {
        return Integer.valueOf(this.statusBarSemanticColor);
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

    @Override // ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostNotificationUiReadyNotifier
    /* renamed from: isAppHostNotificationUiReady, reason: from getter */
    public boolean getIsAppHostNotificationUiReady() {
        return this.isAppHostNotificationUiReady;
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
        OzonSelectActivityComponent.Factory factory = DaggerOzonSelectActivityComponent.factory();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage2.b(StorageComponentApi.class);
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage3.b(ActionComponentApi.class);
        if (AppOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppOnboardingComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(this, AppOnboardingComponentApi.class).getDependencyStorage();
        if (AppOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppOnboardingComponentApi is not DiComponent");
        }
        AppOnboardingComponentApi appOnboardingComponentApi = (AppOnboardingComponentApi) dependencyStorage4.b(AppOnboardingComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, storageComponentApi, actionComponentApi, appOnboardingComponentApi, (AnalyticsComponentApi) dependencyStorage5.b(AnalyticsComponentApi.class)).inject(this);
        if (StartupTimeTrackerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StartupTimeTrackerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage6 = C6739a.a(this, StartupTimeTrackerComponentApi.class).getDependencyStorage();
        if (StartupTimeTrackerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StartupTimeTrackerComponentApi is not DiComponent");
        }
        c startupTimeTracker = ((StartupTimeTrackerComponentApi) dependencyStorage6.b(StartupTimeTrackerComponentApi.class)).getStartupTimeTracker();
        this.startupTimeTracker = startupTimeTracker;
        if (startupTimeTracker == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        startupTimeTracker.a("Installing SplashScreen");
        Intrinsics.checkNotNullParameter(this, "<this>");
        C10411b c10411b = new C10411b(this);
        C10411b.a(c10411b);
        c cVar = this.startupTimeTracker;
        if (cVar == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar.a("Getting OzonRouter");
        this.router = navigationComponentApi.getOzonRouter();
        this.holder = navigationComponentApi.getNavigatorHolder();
        this.miniAppConfigHolder = navigationComponentApi.getMiniAppConfigHolder();
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
        this.appLaunchArgumentsInterceptor = appLaunchHandlersComponentApi.getAppLaunchArgumentsInterceptor();
        this.appLaunchListener = appLaunchHandlersComponentApi.getAppLaunchListener();
        if (InAppPushHostApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppPushHostApi is not DiComponent");
        }
        C6740b dependencyStorage9 = C6739a.a(this, InAppPushHostApi.class).getDependencyStorage();
        if (InAppPushHostApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppPushHostApi is not DiComponent");
        }
        this.inAppPushHost = ((InAppPushHostApi) dependencyStorage9.b(InAppPushHostApi.class)).getInAppPushHost();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage10 = C6739a.a(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        ManualStateBundleActivityCallback manualStateBundleActivityCallback = ((AndroidPlatformComponentApi) dependencyStorage10.b(AndroidPlatformComponentApi.class)).getManualStateBundleActivityCallback();
        this.customBundleSaveStateActivityCallback = manualStateBundleActivityCallback;
        if (manualStateBundleActivityCallback == null) {
            Intrinsics.n("customBundleSaveStateActivityCallback");
            throw null;
        }
        manualStateBundleActivityCallback.onActivityPreCreated(this, savedInstanceState);
        c cVar2 = this.startupTimeTracker;
        if (cVar2 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar2.a("AppHostActivity super.onCreate");
        super.onCreate(savedInstanceState);
        c cVar3 = this.startupTimeTracker;
        if (cVar3 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar3.a("Creating AppHostNavigator");
        Intent intent = getIntent();
        C10683b c10683b = new C10683b(this, "main", R$id.rootNavigationContainer, new O(intent != null ? intent.getStringExtra("ru.ozon.app.android.select.feature.entry.OzonSelectActivity.EXTRA_REDIRECT_DESTINATION") : null));
        D a11 = K.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b.plus(this.exceptionHandler), null, new OzonSelectActivity$onCreate$1(this, null), 2);
        c cVar4 = this.startupTimeTracker;
        if (cVar4 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar4.a("Executing setContentView");
        setContentView(R$layout.activity_ozon_select);
        setupSplashExitListener(c10411b, c10683b, savedInstanceState);
        setupDecorViewFocusListener();
        this.selectSplashView = new SelectSplashScreenView(this, K.a(this));
        c cVar5 = this.startupTimeTracker;
        if (cVar5 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar5.a("Creating PermissionRequest.Builder");
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
        C2399j.C(new C2408n0(getAppOnboardingViewModel().getFinishedEvents(), new OzonSelectActivity$onCreate$2(this, null)), K.a(this));
        this.navigationEventJob = C2399j.C(new C2408n0(C5427n.a(getViewModel().getSplashCompletedFlow(), getLifecycle(), AbstractC5434v.b.STARTED), new OzonSelectActivity$onCreate$3(this, c10683b, null)), K.a(this));
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
        c cVar6 = this.startupTimeTracker;
        if (cVar6 == null) {
            Intrinsics.n("startupTimeTracker");
            throw null;
        }
        cVar6.a("AppHostActivity#onCreate ends");
        UniGlobalConfig.INSTANCE.setUrlSpanClickHandler(new OzonSelectActivity$onCreate$4(this));
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
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

    @Override // ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostNotificationUiReadyNotifier
    public void setOnAppHostNotificationUiReady(Function0<Unit> function0) {
        this.onAppHostNotificationUiReady = function0;
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
