package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.json.JSONObject;

/* compiled from: FullScreenWebViewDisplay.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001eH\u0014J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001eH\u0014J\b\u0010.\u001a\u00020\u001eH\u0014J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020(H\u0016J\"\u00101\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u001b2\b\b\u0002\u00103\u001a\u00020(H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullScreenWebViewDisplay;", "Landroidx/activity/ComponentActivity;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lkotlin/Lazy;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "getDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers$delegate", "opportunityId", "", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "showOptions", "", "", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "listenToAdPlayerEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWebView", "webView", "Landroid/webkit/WebView;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", X3.i.t0, X3.i.u0, "onWindowFocusChanged", "hasFocus", "openUrl", SDKConstants.PARAM_INTENT, HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "unity-ads_defaultRelease", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {

    /* renamed from: dispatchers$delegate, reason: from kotlin metadata */
    private final Lazy dispatchers;

    /* renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    private final Lazy sendDiagnosticEvent;
    private Map<String, ? extends Object> showOptions;
    private final ActivityResultLauncher<Intent> startForResult;
    private String opportunityId = "";

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    private final Lazy adObject = LazyKt.lazy(new Function0<AdObject>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2
        {
            super(0);
        }

        private static final AdRepository invoke$lambda$0(Lazy<? extends AdRepository> lazy) {
            return lazy.getValue();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AdObject invoke() {
            Object m11180constructorimpl;
            String str;
            final FullScreenWebViewDisplay fullScreenWebViewDisplay = FullScreenWebViewDisplay.this;
            final String str2 = "";
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<AdRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final AdRepository invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str2, Reflection.getOrCreateKotlinClass(AdRepository.class));
                }
            });
            FullScreenWebViewDisplay fullScreenWebViewDisplay2 = FullScreenWebViewDisplay.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                AdRepository invoke$lambda$0 = invoke$lambda$0(lazy);
                str = fullScreenWebViewDisplay2.opportunityId;
                UUID fromString = UUID.fromString(str);
                Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
                m11180constructorimpl = Result.m11180constructorimpl(invoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(fromString)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                m11180constructorimpl = null;
            }
            return (AdObject) m11180constructorimpl;
        }
    });

    public static void safedk_FullScreenWebViewDisplay_startActivity_4b1426b6164d7544028dbc79e147d129(FullScreenWebViewDisplay p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/unity3d/ads/adplayer/FullScreenWebViewDisplay;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.unity3d.ads");
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$7(ActivityResult activityResult) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.unity3d.ads", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return keyCode == 4;
    }

    public FullScreenWebViewDisplay() {
        final String str = "";
        final FullScreenWebViewDisplay fullScreenWebViewDisplay = this;
        this.sendDiagnosticEvent = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            }
        });
        this.dispatchers = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ISDKDispatchers>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.ISDKDispatchers, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ISDKDispatchers invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class));
            }
        });
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FullScreenWebViewDisplay.startForResult$lambda$7((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…n to this activity.\n    }");
        this.startForResult = registerForActivityResult;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        CoroutineScope scope;
        Object m11180constructorimpl;
        Map<String, ? extends Object> map;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        if (Intrinsics.areEqual(stringExtra, "not_provided")) {
            setResult(0);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$1(this, null), 3, null);
            finish();
            return;
        }
        AdObject adObject = getAdObject();
        AdPlayer adPlayer = adObject != null ? adObject.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !CoroutineScopeKt.isActive(scope)) {
            setResult(0);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$2(this, null), 3, null);
            finish();
            return;
        }
        Boolean valueOf = Boolean.valueOf(getIntent().hasExtra("orientation"));
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                FullScreenWebViewDisplay fullScreenWebViewDisplay = this;
                m11180constructorimpl = Result.m11180constructorimpl(JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                m11180constructorimpl = null;
            }
            map = (Map) m11180constructorimpl;
        } else {
            map = null;
        }
        this.showOptions = map;
        FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fullScreenWebViewDisplay2), null, null, new FullScreenWebViewDisplay$onCreate$6(this, null), 3, null);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, fullScreenWebViewDisplay2, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnBackPressedCallback addCallback) {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return Unit.INSTANCE;
            }
        }, 2, null);
    }

    static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, String str, Intent intent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(String opportunityId, Intent intent, boolean useActivityForResult) {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            FullScreenWebViewDisplay fullScreenWebViewDisplay = this;
            if (intent.resolveActivity(getPackageManager()) != null && useActivityForResult) {
                this.startForResult.launch(intent);
            } else {
                intent.setFlags(268435456);
                safedk_FullScreenWebViewDisplay_startActivity_4b1426b6164d7544028dbc79e147d129(this, intent);
            }
            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), getDispatchers().getDefault(), null, new FullScreenWebViewDisplay$openUrl$1(opportunityId, Result.m11187isSuccessimpl(m11180constructorimpl), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getMain()), null, null, new FullScreenWebViewDisplay$loadWebView$1(webView, this, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onResume$1(this, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$1(this, null), 3, null);
        if (isFinishing()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$2(this, null), 3, null);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (isFinishing()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onDestroy$1(this, null), 3, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, hasFocus, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final SharedFlow onSubscription = FlowKt.onSubscription(AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, cancellableContinuationImpl, null));
        FlowKt.launchIn(FlowKt.onEach(new Flow<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    String str;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String opportunityId = ((DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (Intrinsics.areEqual(opportunityId, str)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DisplayMessage> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
