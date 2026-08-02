package expo.modules;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactDelegate;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.PermissionListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.kotlin.Utils;
import expo.modules.kotlin.exception.Exceptions;
import io.radar.sdk.RadarTrackingOptions;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: ReactActivityDelegateWrapper.kt */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ~2\u00020\u0001:\u0001~B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\tJ\n\u0010-\u001a\u0004\u0018\u00010.H\u0014J\n\u0010/\u001a\u0004\u0018\u000100H\u0014J\n\u00101\u001a\u0004\u0018\u000102H\u0014J\n\u00103\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u00104\u001a\u000205H\u0016J\n\u00106\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u00107\u001a\u00020%2\b\u00108\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u00109\u001a\u00020%2\b\u0010:\u001a\u0004\u0018\u00010.H\u0017J\b\u0010;\u001a\u00020%H\u0016J\b\u0010<\u001a\u00020%H\u0016J\b\u0010=\u001a\u00020%H\u0016J\b\u0010>\u001a\u00020%H\u0016J\"\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0018\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020HH\u0016J\u0018\u0010I\u001a\u00020\u00052\u0006\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020HH\u0016J\u0018\u0010J\u001a\u00020\u00052\u0006\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\u0012\u0010L\u001a\u00020\u00052\b\u0010M\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010N\u001a\u00020%2\u0006\u0010O\u001a\u00020\u0005H\u0016J/\u0010P\u001a\u00020%2\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160R2\u0006\u0010@\u001a\u00020A2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0002\u0010UJ-\u0010V\u001a\u00020%2\u0006\u0010@\u001a\u00020A2\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160R2\u0006\u0010W\u001a\u00020XH\u0016¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020[H\u0014J\b\u0010\\\u001a\u00020]H\u0014J\b\u0010^\u001a\u00020\u0005H\u0014J\b\u0010_\u001a\u00020\u0005H\u0014J\n\u0010`\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010a\u001a\u00020%2\u0006\u0010b\u001a\u00020cH\u0016J\u001b\u0010d\u001a\u0002He\"\u0004\b\u0000\u0010e2\u0006\u0010f\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010gJC\u0010d\u001a\u0002He\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010h2\u0006\u0010f\u001a\u00020\u00162\u0010\u0010i\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030j0R2\f\u0010k\u001a\b\u0012\u0004\u0012\u0002Hh0RH\u0001¢\u0006\u0004\bl\u0010mJ \u0010n\u001a\u00020%2\b\u00108\u001a\u0004\u0018\u00010\u00162\u0006\u0010o\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010pJ\u0018\u0010q\u001a\u00020%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0082@¢\u0006\u0002\u0010rJ@\u0010s\u001a\u00020%2\b\b\u0002\u0010t\u001a\u00020u2'\u0010v\u001a#\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0x\u0012\u0006\u0012\u0004\u0018\u00010y0w¢\u0006\u0002\bzH\u0002¢\u0006\u0002\u0010{J\r\u0010|\u001a\u00020%H\u0001¢\u0006\u0002\b}R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00018AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00130\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b*\u0010+¨\u0006\u007f"}, d2 = {"Lexpo/modules/ReactActivityDelegateWrapper;", "Lcom/facebook/react/ReactActivityDelegate;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Lcom/facebook/react/ReactActivity;", "isNewArchitectureEnabled", "", "delegate", "<init>", "(Lcom/facebook/react/ReactActivity;ZLcom/facebook/react/ReactActivityDelegate;)V", "(Lcom/facebook/react/ReactActivity;Lcom/facebook/react/ReactActivityDelegate;)V", "getDelegate$expo_fullRelease", "()Lcom/facebook/react/ReactActivityDelegate;", "setDelegate$expo_fullRelease", "(Lcom/facebook/react/ReactActivityDelegate;)V", "reactActivityLifecycleListeners", "", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "kotlin.jvm.PlatformType", "reactActivityHandlers", "Lexpo/modules/core/interfaces/ReactActivityHandler;", "methodMap", "Landroidx/collection/ArrayMap;", "", "Ljava/lang/reflect/Method;", "_reactHost", "Lcom/facebook/react/ReactHost;", "get_reactHost", "()Lcom/facebook/react/ReactHost;", "_reactHost$delegate", "Lkotlin/Lazy;", "delayLoadAppHandler", "Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;", "getDelayLoadAppHandler", "()Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;", "delayLoadAppHandler$delegate", "loadAppReady", "Lkotlinx/coroutines/CompletableDeferred;", "", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "applicationCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "applicationCoroutineScope$delegate", "getLaunchOptions", "Landroid/os/Bundle;", "createRootView", "Lcom/facebook/react/ReactRootView;", "getReactDelegate", "Lcom/facebook/react/ReactDelegate;", "getReactHost", "getReactInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "getMainComponentName", "loadApp", "appKey", "onCreate", "savedInstanceState", "onResume", "onPause", "onUserLeaveHint", "onDestroy", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onKeyUp", "onKeyLongPress", "onBackPressed", "onNewIntent", SDKConstants.PARAM_INTENT, "onWindowFocusChanged", "hasFocus", "requestPermissions", "permissions", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/modules/core/PermissionListener;", "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", "onRequestPermissionsResult", "grantResults", "", "(I[Ljava/lang/String;[I)V", "getContext", "Landroid/content/Context;", "getPlainActivity", "Landroid/app/Activity;", "isFabricEnabled", "isWideColorGamutEnabled", "composeLaunchOptions", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "invokeDelegateMethod", ExifInterface.GPS_DIRECTION_TRUE, "name", "(Ljava/lang/String;)Ljava/lang/Object;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "argTypes", "Ljava/lang/Class;", StepData.ARGS, "invokeDelegateMethod$expo_fullRelease", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "loadAppImpl", "supportsDelayLoad", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDelayLoadAppWhenReady", "(Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchLifecycleScopeWithLock", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)V", "setLoadAppReadyForTesting", "setLoadAppReadyForTesting$expo_fullRelease", "Companion", "expo_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReactActivityDelegateWrapper extends ReactActivityDelegate {
    private static final String TAG = Reflection.getOrCreateKotlinClass(ReactActivityDelegate.class).getSimpleName();

    /* renamed from: _reactHost$delegate, reason: from kotlin metadata */
    private final Lazy _reactHost;
    private final ReactActivity activity;

    /* renamed from: applicationCoroutineScope$delegate, reason: from kotlin metadata */
    private final Lazy applicationCoroutineScope;

    /* renamed from: delayLoadAppHandler$delegate, reason: from kotlin metadata */
    private final Lazy delayLoadAppHandler;
    private ReactActivityDelegate delegate;
    private final boolean isNewArchitectureEnabled;
    private final CompletableDeferred<Unit> loadAppReady;
    private final ArrayMap<String, Method> methodMap;
    private final Mutex mutex;
    private final List<ReactActivityHandler> reactActivityHandlers;
    private final List<ReactActivityLifecycleListener> reactActivityLifecycleListeners;

    /* renamed from: getDelegate$expo_fullRelease, reason: from getter */
    public final ReactActivityDelegate getDelegate() {
        return this.delegate;
    }

    public final void setDelegate$expo_fullRelease(ReactActivityDelegate reactActivityDelegate) {
        Intrinsics.checkNotNullParameter(reactActivityDelegate, "<set-?>");
        this.delegate = reactActivityDelegate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactActivityDelegateWrapper(ReactActivity activity, boolean z, ReactActivityDelegate delegate) {
        super(activity, (String) null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.activity = activity;
        this.isNewArchitectureEnabled = z;
        this.delegate = delegate;
        List<Package> packageList = ExpoModulesPackage.INSTANCE.getPackageList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packageList.iterator();
        while (it.hasNext()) {
            List<? extends ReactActivityLifecycleListener> createReactActivityLifecycleListeners = ((Package) it.next()).createReactActivityLifecycleListeners(this.activity);
            Intrinsics.checkNotNullExpressionValue(createReactActivityLifecycleListeners, "createReactActivityLifecycleListeners(...)");
            CollectionsKt.addAll(arrayList, createReactActivityLifecycleListeners);
        }
        this.reactActivityLifecycleListeners = arrayList;
        List<Package> packageList2 = ExpoModulesPackage.INSTANCE.getPackageList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = packageList2.iterator();
        while (it2.hasNext()) {
            List<? extends ReactActivityHandler> createReactActivityHandlers = ((Package) it2.next()).createReactActivityHandlers(this.activity);
            Intrinsics.checkNotNullExpressionValue(createReactActivityHandlers, "createReactActivityHandlers(...)");
            CollectionsKt.addAll(arrayList2, createReactActivityHandlers);
        }
        this.reactActivityHandlers = arrayList2;
        this.methodMap = new ArrayMap<>();
        this._reactHost = LazyKt.lazy(new Function0() { // from class: expo.modules.ReactActivityDelegateWrapper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReactHost _reactHost_delegate$lambda$2;
                _reactHost_delegate$lambda$2 = ReactActivityDelegateWrapper._reactHost_delegate$lambda$2(ReactActivityDelegateWrapper.this);
                return _reactHost_delegate$lambda$2;
            }
        });
        this.delayLoadAppHandler = LazyKt.lazy(new Function0() { // from class: expo.modules.ReactActivityDelegateWrapper$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler_delegate$lambda$4;
                delayLoadAppHandler_delegate$lambda$4 = ReactActivityDelegateWrapper.delayLoadAppHandler_delegate$lambda$4(ReactActivityDelegateWrapper.this);
                return delayLoadAppHandler_delegate$lambda$4;
            }
        });
        this.loadAppReady = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.applicationCoroutineScope = LazyKt.lazy(new Function0() { // from class: expo.modules.ReactActivityDelegateWrapper$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope applicationCoroutineScope_delegate$lambda$5;
                applicationCoroutineScope_delegate$lambda$5 = ReactActivityDelegateWrapper.applicationCoroutineScope_delegate$lambda$5();
                return applicationCoroutineScope_delegate$lambda$5;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactActivityDelegateWrapper(ReactActivity activity, ReactActivityDelegate delegate) {
        this(activity, false, delegate);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    private final ReactHost get_reactHost() {
        return (ReactHost) this._reactHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost _reactHost_delegate$lambda$2(ReactActivityDelegateWrapper reactActivityDelegateWrapper) {
        return reactActivityDelegateWrapper.delegate.getReactHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactActivityHandler.DelayLoadAppHandler getDelayLoadAppHandler() {
        return (ReactActivityHandler.DelayLoadAppHandler) this.delayLoadAppHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler_delegate$lambda$4(final ReactActivityDelegateWrapper reactActivityDelegateWrapper) {
        return (ReactActivityHandler.DelayLoadAppHandler) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(reactActivityDelegateWrapper.reactActivityHandlers), new Function1() { // from class: expo.modules.ReactActivityDelegateWrapper$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler_delegate$lambda$4$lambda$3;
                delayLoadAppHandler_delegate$lambda$4$lambda$3 = ReactActivityDelegateWrapper.delayLoadAppHandler_delegate$lambda$4$lambda$3(ReactActivityDelegateWrapper.this, (ReactActivityHandler) obj);
                return delayLoadAppHandler_delegate$lambda$4$lambda$3;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler_delegate$lambda$4$lambda$3(ReactActivityDelegateWrapper reactActivityDelegateWrapper, ReactActivityHandler reactActivityHandler) {
        return reactActivityHandler.getDelayLoadAppHandler(reactActivityDelegateWrapper.activity, reactActivityDelegateWrapper.getReactHost());
    }

    private final CoroutineScope getApplicationCoroutineScope() {
        return (CoroutineScope) this.applicationCoroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope applicationCoroutineScope_delegate$lambda$5() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Bundle getLaunchOptions() {
        return (Bundle) invokeDelegateMethod("getLaunchOptions");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected ReactRootView createRootView() {
        return (ReactRootView) invokeDelegateMethod("createRootView");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected ReactDelegate getReactDelegate() {
        return (ReactDelegate) invokeDelegateMethod("getReactDelegate");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public ReactHost getReactHost() {
        return get_reactHost();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public ReactInstanceManager getReactInstanceManager() {
        ReactInstanceManager reactInstanceManager = this.delegate.getReactInstanceManager();
        Intrinsics.checkNotNullExpressionValue(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public String getMainComponentName() {
        return this.delegate.getMainComponentName();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected void loadApp(String appKey) {
        launchLifecycleScopeWithLock(CoroutineStart.UNDISPATCHED, new ReactActivityDelegateWrapper$loadApp$1(this, appKey, null));
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onCreate(Bundle savedInstanceState) {
        ReactActivityDelegate reactActivityDelegate = (ReactActivityDelegate) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(this.reactActivityHandlers), new Function1() { // from class: expo.modules.ReactActivityDelegateWrapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ReactActivityDelegate onCreate$lambda$6;
                onCreate$lambda$6 = ReactActivityDelegateWrapper.onCreate$lambda$6(ReactActivityDelegateWrapper.this, (ReactActivityHandler) obj);
                return onCreate$lambda$6;
            }
        }));
        Iterator<T> it = this.reactActivityHandlers.iterator();
        while (it.hasNext()) {
            ((ReactActivityHandler) it.next()).onDidCreateReactActivityDelegateNotification(this.activity, reactActivityDelegate);
        }
        if (reactActivityDelegate != null && !Intrinsics.areEqual(reactActivityDelegate, this)) {
            Field declaredField = ReactActivity.class.getDeclaredField("mDelegate");
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            declaredField.set(this.activity, reactActivityDelegate);
            this.delegate = reactActivityDelegate;
            reactActivityDelegate.onCreate(savedInstanceState);
        } else {
            launchLifecycleScopeWithLock(CoroutineStart.UNDISPATCHED, new ReactActivityDelegateWrapper$onCreate$2(this, null));
        }
        Iterator<T> it2 = this.reactActivityLifecycleListeners.iterator();
        while (it2.hasNext()) {
            ((ReactActivityLifecycleListener) it2.next()).onCreate(this.activity, savedInstanceState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactActivityDelegate onCreate$lambda$6(ReactActivityDelegateWrapper reactActivityDelegateWrapper, ReactActivityHandler reactActivityHandler) {
        return reactActivityHandler.onDidCreateReactActivityDelegate(reactActivityDelegateWrapper.activity, reactActivityDelegateWrapper);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onResume() {
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$onResume$1(this, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onPause() {
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$onPause$1(this, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onUserLeaveHint() {
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$onUserLeaveHint$1(this, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onDestroy() {
        BuildersKt__Builders_commonKt.launch$default(getApplicationCoroutineScope(), null, null, new ReactActivityDelegateWrapper$onDestroy$1(this, null), 3, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$onActivityResult$1(this, requestCode, resultCode, data, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityHandler> list = this.reactActivityHandlers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityHandler) it.next()).onKeyDown(keyCode, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || booleanValue) {
                    z = true;
                }
            }
        }
        return z || this.delegate.onKeyDown(keyCode, event);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityHandler> list = this.reactActivityHandlers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityHandler) it.next()).onKeyUp(keyCode, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || booleanValue) {
                    z = true;
                }
            }
        }
        return z || this.delegate.onKeyUp(keyCode, event);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityHandler> list = this.reactActivityHandlers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityHandler) it.next()).onKeyLongPress(keyCode, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || booleanValue) {
                    z = true;
                }
            }
        }
        return z || this.delegate.onKeyLongPress(keyCode, event);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onBackPressed() {
        boolean z;
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityLifecycleListener> list = this.reactActivityLifecycleListeners;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityLifecycleListener) it.next()).onBackPressed()));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || booleanValue) {
                    z = true;
                }
            }
        }
        return z || this.delegate.onBackPressed();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onNewIntent(Intent intent) {
        boolean z;
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityLifecycleListener> list = this.reactActivityLifecycleListeners;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityLifecycleListener) it.next()).onNewIntent(intent)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || booleanValue) {
                    z = true;
                }
            }
        }
        return z || this.delegate.onNewIntent(intent);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onWindowFocusChanged(boolean hasFocus) {
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$onWindowFocusChanged$1(this, hasFocus, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void requestPermissions(String[] permissions, int requestCode, PermissionListener listener) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$requestPermissions$1(this, permissions, requestCode, listener, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$onRequestPermissionsResult$1(this, requestCode, permissions, grantResults, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Context getContext() {
        return (Context) invokeDelegateMethod("getContext");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Activity getPlainActivity() {
        return (Activity) invokeDelegateMethod("getPlainActivity");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    /* renamed from: isFabricEnabled */
    protected boolean getFabricEnabled() {
        return ((Boolean) invokeDelegateMethod("isFabricEnabled")).booleanValue();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected boolean isWideColorGamutEnabled() {
        return ((Boolean) invokeDelegateMethod("isWideColorGamutEnabled")).booleanValue();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Bundle composeLaunchOptions() {
        return (Bundle) invokeDelegateMethod("composeLaunchOptions");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        launchLifecycleScopeWithLock$default(this, null, new ReactActivityDelegateWrapper$onConfigurationChanged$1(this, newConfig, null), 1, null);
    }

    private final <T> T invokeDelegateMethod(String name) {
        Method method = this.methodMap.get(name);
        if (method == null) {
            method = ReactActivityDelegate.class.getDeclaredMethod(name, null);
            method.setAccessible(true);
            this.methodMap.put(name, method);
        }
        Intrinsics.checkNotNull(method);
        return (T) method.invoke(this.delegate, null);
    }

    public final <T, A> T invokeDelegateMethod$expo_fullRelease(String name, Class<?>[] argTypes, A[] args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        Intrinsics.checkNotNullParameter(args, "args");
        Method method = this.methodMap.get(name);
        if (method == null) {
            method = ReactActivityDelegate.class.getDeclaredMethod(name, (Class[]) Arrays.copyOf(argTypes, argTypes.length));
            method.setAccessible(true);
            this.methodMap.put(name, method);
        }
        Intrinsics.checkNotNull(method);
        return (T) method.invoke(this.delegate, Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f2 A[LOOP:0: B:11:0x00ec->B:13:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAppImpl(String str, boolean z, Continuation<? super Unit> continuation) {
        ReactActivityDelegateWrapper$loadAppImpl$1 reactActivityDelegateWrapper$loadAppImpl$1;
        int i;
        Iterator<T> it;
        if (continuation instanceof ReactActivityDelegateWrapper$loadAppImpl$1) {
            reactActivityDelegateWrapper$loadAppImpl$1 = (ReactActivityDelegateWrapper$loadAppImpl$1) continuation;
            if ((reactActivityDelegateWrapper$loadAppImpl$1.label & Integer.MIN_VALUE) != 0) {
                reactActivityDelegateWrapper$loadAppImpl$1.label -= Integer.MIN_VALUE;
                Object obj = reactActivityDelegateWrapper$loadAppImpl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reactActivityDelegateWrapper$loadAppImpl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ViewGroup viewGroup = (ViewGroup) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(this.reactActivityHandlers), new Function1() { // from class: expo.modules.ReactActivityDelegateWrapper$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ViewGroup loadAppImpl$lambda$18;
                            loadAppImpl$lambda$18 = ReactActivityDelegateWrapper.loadAppImpl$lambda$18(ReactActivityDelegateWrapper.this, (ReactActivityHandler) obj2);
                            return loadAppImpl$lambda$18;
                        }
                    }));
                    if (viewGroup != null) {
                        Field declaredField = ReactActivityDelegate.class.getDeclaredField("mReactDelegate");
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(this.delegate);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.ReactDelegate");
                        ReactDelegate reactDelegate = (ReactDelegate) obj2;
                        if (str != null) {
                            reactDelegate.loadApp(str);
                            ReactRootView reactRootView = reactDelegate.getReactRootView();
                            ViewParent parent = reactRootView != null ? reactRootView.getParent() : null;
                            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(reactRootView);
                            }
                            viewGroup.addView(reactRootView, -1);
                            this.activity.setContentView(viewGroup);
                            Iterator<T> it2 = this.reactActivityLifecycleListeners.iterator();
                            while (it2.hasNext()) {
                                ((ReactActivityLifecycleListener) it2.next()).onContentChanged(this.activity);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    if (z) {
                        ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler = getDelayLoadAppHandler();
                        reactActivityDelegateWrapper$loadAppImpl$1.L$0 = str;
                        reactActivityDelegateWrapper$loadAppImpl$1.label = 1;
                        if (awaitDelayLoadAppWhenReady(delayLoadAppHandler, reactActivityDelegateWrapper$loadAppImpl$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        invokeDelegateMethod$expo_fullRelease("loadApp", new Class[]{String.class}, new String[]{str});
                        Iterator<T> it3 = this.reactActivityLifecycleListeners.iterator();
                        while (it3.hasNext()) {
                            ((ReactActivityLifecycleListener) it3.next()).onContentChanged(this.activity);
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) reactActivityDelegateWrapper$loadAppImpl$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                invokeDelegateMethod$expo_fullRelease("loadApp", new Class[]{String.class}, new String[]{str});
                it = this.reactActivityLifecycleListeners.iterator();
                while (it.hasNext()) {
                    ((ReactActivityLifecycleListener) it.next()).onContentChanged(this.activity);
                }
                return Unit.INSTANCE;
            }
        }
        reactActivityDelegateWrapper$loadAppImpl$1 = new ReactActivityDelegateWrapper$loadAppImpl$1(this, continuation);
        Object obj3 = reactActivityDelegateWrapper$loadAppImpl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reactActivityDelegateWrapper$loadAppImpl$1.label;
        if (i != 0) {
        }
        invokeDelegateMethod$expo_fullRelease("loadApp", new Class[]{String.class}, new String[]{str});
        it = this.reactActivityLifecycleListeners.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup loadAppImpl$lambda$18(ReactActivityDelegateWrapper reactActivityDelegateWrapper, ReactActivityHandler reactActivityHandler) {
        return reactActivityHandler.createReactRootViewContainer(reactActivityDelegateWrapper.activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitDelayLoadAppWhenReady(ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler, Continuation<? super Unit> continuation) {
        if (delayLoadAppHandler == null) {
            return Unit.INSTANCE;
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        delayLoadAppHandler.whenReady(new Runnable() { // from class: expo.modules.ReactActivityDelegateWrapper$awaitDelayLoadAppWhenReady$2$1
            @Override // java.lang.Runnable
            public final void run() {
                Utils utils = Utils.INSTANCE;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    Continuation<Unit> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m13470constructorimpl(Unit.INSTANCE));
                } else {
                    String name = Thread.currentThread().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String name2 = Looper.getMainLooper().getThread().getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    throw new Exceptions.IncorrectThreadException(name, name2);
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    static /* synthetic */ void launchLifecycleScopeWithLock$default(ReactActivityDelegateWrapper reactActivityDelegateWrapper, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        reactActivityDelegateWrapper.launchLifecycleScopeWithLock(coroutineStart, function2);
    }

    private final void launchLifecycleScopeWithLock(CoroutineStart start, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), null, start, new ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1(this, block, null), 1, null);
    }

    public final void setLoadAppReadyForTesting$expo_fullRelease() {
        this.loadAppReady.complete(Unit.INSTANCE);
    }
}
