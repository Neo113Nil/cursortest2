package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.WebView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import io.radar.sdk.RadarTrackingOptions;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: BrazeInAppMessageManager.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 J2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00108\u001a\u0002012\b\u00109\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010:\u001a\u00020.H\u0016J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020.H\u0016J\b\u0010=\u001a\u000201H\u0016J\b\u0010>\u001a\u00020.H\u0016J\u001e\u0010?\u001a\u0002012\u0006\u00109\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020.H\u0096@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0002J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u00102\u001a\u000203H\u0002J\u0010\u0010D\u001a\u00020.2\u0006\u00109\u001a\u00020\u000bH\u0017J\u001c\u0010E\u001a\u00020.2\b\u00109\u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0017J\r\u0010F\u001a\u000201H\u0000¢\u0006\u0002\bGJ\r\u0010H\u001a\u000201H\u0000¢\u0006\u0002\bIR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010)\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b*\u0010\u0003\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b-\u0010/¨\u0006K"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "<init>", "()V", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "inAppMessageStack", "Ljava/util/Stack;", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessageStack$annotations", "getInAppMessageStack", "()Ljava/util/Stack;", "inAppMessageEventMap", "", "Lcom/braze/events/InAppMessageEvent;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "sdkDataWipeEventSubscriber", "Lcom/braze/events/SdkDataWipeEvent;", "brazeUserChangeEventSubscriber", "Lcom/braze/events/BrazeUserChangeEvent;", "originalOrientation", "", "Ljava/lang/Integer;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "currentUserId", "", "carryoverInAppMessage", "getCarryoverInAppMessage$annotations", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "unregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "isCurrentlyDisplayingInAppMessage", "", "()Z", "ensureSubscribedToInAppMessageEvents", "", "context", "Landroid/content/Context;", "registerInAppMessageManager", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "unregisterInAppMessageManager", "addInAppMessage", "inAppMessage", "requestDisplayInAppMessage", "hideCurrentlyDisplayingInAppMessage", "dismissed", "resetAfterInAppMessageClose", "getIsCurrentlyDisplayingInAppMessage", "displayInAppMessage", "isCarryOver", "(Lcom/braze/models/inappmessage/IInAppMessage;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInAppMessageEventSubscriber", "createBrazeUserChangeEventSubscriber", "verifyOrientationStatus", "isInAppMessageForTheSameUser", "pauseWebviewIfNecessary", "pauseWebviewIfNecessary$android_sdk_ui_release", "resumeWebviewIfNecessary", "resumeWebviewIfNecessary$android_sdk_ui_release", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance;
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
    private String currentUserId;
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;
    private IInAppMessageViewWrapper inAppMessageViewWrapper;
    private Integer originalOrientation;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private IInAppMessage unregisteredInAppMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock instanceLock = new ReentrantLock();
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    /* compiled from: BrazeInAppMessageManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MessageType.values().length];
            try {
                iArr2[MessageType.HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MessageType.HTML_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void getCarryoverInAppMessage$annotations() {
    }

    public static /* synthetic */ void getDisplayingInAppMessage$annotations() {
    }

    public static /* synthetic */ void getInAppMessageStack$annotations() {
    }

    @JvmStatic
    public static final BrazeInAppMessageManager getInstance() {
        return INSTANCE.getInstance();
    }

    public static /* synthetic */ void getUnregisteredInAppMessage$annotations() {
    }

    public Object displayInAppMessage(IInAppMessage iInAppMessage, boolean z, Continuation<? super Unit> continuation) {
        return displayInAppMessage$suspendImpl(this, iInAppMessage, z, continuation);
    }

    public final Stack<IInAppMessage> getInAppMessageStack() {
        return this.inAppMessageStack;
    }

    public final Map<IInAppMessage, InAppMessageEvent> getInAppMessageEventMap() {
        return this.inAppMessageEventMap;
    }

    public final IInAppMessage getCarryoverInAppMessage() {
        return this.carryoverInAppMessage;
    }

    public final void setCarryoverInAppMessage(IInAppMessage iInAppMessage) {
        this.carryoverInAppMessage = iInAppMessage;
    }

    public final IInAppMessage getUnregisteredInAppMessage() {
        return this.unregisteredInAppMessage;
    }

    public final void setUnregisteredInAppMessage(IInAppMessage iInAppMessage) {
        this.unregisteredInAppMessage = iInAppMessage;
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$0;
                    ensureSubscribedToInAppMessageEvents$lambda$0 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$0();
                    return ensureSubscribedToInAppMessageEvents$lambda$0;
                }
            }, 7, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String ensureSubscribedToInAppMessageEvents$lambda$1;
                ensureSubscribedToInAppMessageEvents$lambda$1 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1();
                return ensureSubscribedToInAppMessageEvents$lambda$1;
            }
        }, 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.INSTANCE.getInstance(context).subscribeToNewInAppMessages(createInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = createInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$3;
                    ensureSubscribedToInAppMessageEvents$lambda$3 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$3();
                    return ensureSubscribedToInAppMessageEvents$lambda$3;
                }
            }, 6, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String ensureSubscribedToInAppMessageEvents$lambda$4;
                ensureSubscribedToInAppMessageEvents$lambda$4 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$4();
                return ensureSubscribedToInAppMessageEvents$lambda$4;
            }
        }, 6, (Object) null);
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber = new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda49
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager.this, (SdkDataWipeEvent) obj);
            }
        };
        Braze.INSTANCE.getInstance(context).addSingleSynchronousSubscription(iEventSubscriber, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$7;
                    ensureSubscribedToInAppMessageEvents$lambda$7 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$7();
                    return ensureSubscribedToInAppMessageEvents$lambda$7;
                }
            }, 6, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber(context);
        Braze.INSTANCE.getInstance(context).subscribeToChangeUserEvents(createBrazeUserChangeEventSubscriber);
        this.brazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$0() {
        return "Removing existing in-app message event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$1() {
        return "Subscribing in-app message event subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$3() {
        return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$4() {
        return "Subscribing sdk data wipe subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager brazeInAppMessageManager, SdkDataWipeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$7() {
        return "Removing existing user change event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$9() {
        return "Null Activity passed to registerInAppMessageManager. Doing nothing";
    }

    public void registerInAppMessageManager(final Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerInAppMessageManager$lambda$9;
                        registerInAppMessageManager$lambda$9 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$9();
                        return registerInAppMessageManager$lambda$9;
                    }
                }, 6, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerInAppMessageManager$lambda$10;
                    registerInAppMessageManager$lambda$10 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$10(activity);
                    return registerInAppMessageManager$lambda$10;
                }
            }, 6, (Object) null);
            this.mActivity = new WeakReference<>(activity);
            if (this.mApplicationContext == null) {
                this.mApplicationContext = activity.getApplicationContext();
                if (this.mApplicationContext == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$11;
                            registerInAppMessageManager$lambda$11 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$11();
                            return registerInAppMessageManager$lambda$11;
                        }
                    }, 6, (Object) null);
                    return;
                }
            }
            if (this.configurationProvider == null) {
                Context context = this.mApplicationContext;
                this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
            }
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            if (iInAppMessage != null) {
                if (iInAppMessage != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$14$lambda$13;
                            registerInAppMessageManager$lambda$14$lambda$13 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$14$lambda$13();
                            return registerInAppMessageManager$lambda$14$lambda$13;
                        }
                    }, 7, (Object) null);
                    iInAppMessage.setAnimateIn(false);
                    BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, Dispatchers.getMain(), null, new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this, iInAppMessage, null), 2, null);
                }
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$16$lambda$15;
                            registerInAppMessageManager$lambda$16$lambda$15 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$16$lambda$15();
                            return registerInAppMessageManager$lambda$16$lambda$15;
                        }
                    }, 7, (Object) null);
                    addInAppMessage(iInAppMessage2);
                    this.unregisteredInAppMessage = null;
                }
            }
            Context context2 = this.mApplicationContext;
            if (context2 != null) {
                ensureSubscribedToInAppMessageEvents(context2);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerInAppMessageManager$lambda$18;
                    registerInAppMessageManager$lambda$18 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$18();
                    return registerInAppMessageManager$lambda$18;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$10(Activity activity) {
        return "Registering InAppMessageManager with activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$11() {
        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$14$lambda$13() {
        return "Requesting display of carryover in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$16$lambda$15() {
        return "Adding previously unregistered in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$18() {
        return "Error while calling attempting to register the InAppMessageManager";
    }

    public void unregisterInAppMessageManager(final Activity activity) {
        IInAppMessage inAppMessage;
        try {
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$19;
                        unregisterInAppMessageManager$lambda$19 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$19(activity);
                        return unregisterInAppMessageManager$lambda$19;
                    }
                }, 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
                return;
            }
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$20;
                        unregisterInAppMessageManager$lambda$20 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$20();
                        return unregisterInAppMessageManager$lambda$20;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$21;
                        unregisterInAppMessageManager$lambda$21 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$21(activity);
                        return unregisterInAppMessageManager$lambda$21;
                    }
                }, 6, (Object) null);
            }
            IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
            if (iInAppMessageViewWrapper != null) {
                View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
                if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String unregisterInAppMessageManager$lambda$22;
                            unregisterInAppMessageManager$lambda$22 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$22();
                            return unregisterInAppMessageManager$lambda$22;
                        }
                    }, 7, (Object) null);
                    ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
                }
                ViewUtils.removeViewFromParent(inAppMessageView);
                if (iInAppMessageViewWrapper.getIsAnimatingClose()) {
                    this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                    inAppMessage = null;
                } else {
                    inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
                }
                this.carryoverInAppMessage = inAppMessage;
                this.inAppMessageViewWrapper = null;
            } else {
                this.carryoverInAppMessage = null;
            }
            this.mActivity = null;
            this.displayingInAppMessage.set(false);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterInAppMessageManager$lambda$23;
                    unregisterInAppMessageManager$lambda$23 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$23();
                    return unregisterInAppMessageManager$lambda$23;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$19(Activity activity) {
        return "Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: " + (activity != null ? activity.getLocalClassName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$20() {
        return "Null Activity passed to unregisterInAppMessageManager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$21(Activity activity) {
        return "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$22() {
        return "In-app message view includes HTML. Removing the page finished listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$23() {
        return "Error while calling attempting to unregister the InAppMessageManager";
    }

    public void addInAppMessage(IInAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.inAppMessageStack.push(inAppMessage);
            requestDisplayInAppMessage();
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation beforeInAppMessageDisplayed;
        try {
            WeakReference<Activity> weakReference = this.mActivity;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null) {
                if (!this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda52
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestDisplayInAppMessage$lambda$24;
                            requestDisplayInAppMessage$lambda$24 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$24();
                            return requestDisplayInAppMessage$lambda$24;
                        }
                    }, 6, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda54
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestDisplayInAppMessage$lambda$25;
                            requestDisplayInAppMessage$lambda$25 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$25();
                            return requestDisplayInAppMessage$lambda$25;
                        }
                    }, 7, (Object) null);
                }
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$26;
                        requestDisplayInAppMessage$lambda$26 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$26();
                        return requestDisplayInAppMessage$lambda$26;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$27;
                        requestDisplayInAppMessage$lambda$27 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$27();
                        return requestDisplayInAppMessage$lambda$27;
                    }
                }, 7, (Object) null);
                return false;
            }
            final IInAppMessage pop = this.inAppMessageStack.pop();
            if (!pop.isControl()) {
                IInAppMessageManagerListener inAppMessageManagerListener = getInAppMessageManagerListener();
                Intrinsics.checkNotNull(pop);
                beforeInAppMessageDisplayed = inAppMessageManagerListener.beforeInAppMessageDisplayed(pop);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$28;
                        requestDisplayInAppMessage$lambda$28 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$28();
                        return requestDisplayInAppMessage$lambda$28;
                    }
                }, 7, (Object) null);
                IInAppMessageManagerListener controlInAppMessageManagerListener = getControlInAppMessageManagerListener();
                Intrinsics.checkNotNull(pop);
                beforeInAppMessageDisplayed = controlInAppMessageManagerListener.beforeInAppMessageDisplayed(pop);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[beforeInAppMessageDisplayed.ordinal()];
            if (i == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$29;
                        requestDisplayInAppMessage$lambda$29 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$29();
                        return requestDisplayInAppMessage$lambda$29;
                    }
                }, 7, (Object) null);
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(pop);
                return true;
            }
            if (i == 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$30;
                        requestDisplayInAppMessage$lambda$30 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$30();
                        return requestDisplayInAppMessage$lambda$30;
                    }
                }, 7, (Object) null);
                this.inAppMessageStack.push(pop);
                return false;
            }
            if (i == 3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$31;
                        requestDisplayInAppMessage$lambda$31 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$31();
                        return requestDisplayInAppMessage$lambda$31;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(pop);
            if (inAppMessageEvent != null) {
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$32;
                        requestDisplayInAppMessage$lambda$32 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$32();
                        return requestDisplayInAppMessage$lambda$32;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$33;
                        requestDisplayInAppMessage$lambda$33 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$33(IInAppMessage.this);
                        return requestDisplayInAppMessage$lambda$33;
                    }
                }, 7, (Object) null);
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestDisplayInAppMessage$lambda$34;
                    requestDisplayInAppMessage$lambda$34 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$34();
                    return requestDisplayInAppMessage$lambda$34;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$24() {
        return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$25() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$26() {
        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$27() {
        return "The in-app message stack is empty. No in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$28() {
        return "Using the control in-app message manager listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$29() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$30() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$31() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$32() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$33(IInAppMessage iInAppMessage) {
        return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$34() {
        return "Error running requestDisplayInAppMessage";
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean dismissed) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (dismissed) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, Dispatchers.getMain(), null, new BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1(iInAppMessageViewWrapper, null), 2, null);
            } else {
                iInAppMessageViewWrapper.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$35() {
        return "Resetting after in-app message close.";
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetAfterInAppMessageClose$lambda$35;
                resetAfterInAppMessageClose$lambda$35 = BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$35();
                return resetAfterInAppMessageClose$lambda$35;
            }
        }, 6, (Object) null);
        this.inAppMessageViewWrapper = null;
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        final Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetAfterInAppMessageClose$lambda$36;
                resetAfterInAppMessageClose$lambda$36 = BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$36(num);
                return resetAfterInAppMessageClose$lambda$36;
            }
        }, 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$36(Integer num) {
        return "Setting requested orientation to original orientation " + num;
    }

    public boolean getIsCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:66|67))(2:68|(2:70|71)(4:72|73|(1:75)(1:147)|(4:77|(2:79|(1:81)(2:142|143))(1:144)|82|(2:84|(2:86|(4:88|(1:90)|91|92)(2:93|(2:95|96)(4:97|98|99|(4:101|(3:103|104|105)(1:108)|106|107)(2:109|(2:121|(4:123|(1:132)(1:127)|128|(1:130)(1:131))(2:133|134))(4:113|(3:115|116|117)(1:120)|118|119)))))(2:138|139))(2:140|141))(2:145|146)))|13|14|15|(2:17|(9:19|20|(4:22|23|24|25)(3:41|42|(4:44|45|46|47)(3:48|49|50))|26|(1:28)(1:(1:38))|29|(1:33)|34|35)(2:56|57))(2:58|59)))|149|6|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x030c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x030e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x030f, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0215 A[Catch: all -> 0x030e, TryCatch #5 {all -> 0x030e, blocks: (B:14:0x0211, B:17:0x0215, B:19:0x021b, B:22:0x0233), top: B:13:0x0211 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0303 A[Catch: all -> 0x030c, TryCatch #4 {all -> 0x030c, blocks: (B:26:0x02bf, B:28:0x02c5, B:29:0x02e5, B:31:0x02e9, B:33:0x02ef, B:38:0x02e2, B:42:0x027b, B:44:0x027f, B:48:0x02a4, B:56:0x02fa, B:57:0x0302, B:58:0x0303, B:59:0x030b), top: B:15:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.braze.configuration.BrazeConfigurationProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.braze.configuration.BrazeConfigurationProvider] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.braze.configuration.BrazeConfigurationProvider] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.braze.configuration.BrazeConfigurationProvider] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object displayInAppMessage$suspendImpl(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, boolean z, Continuation<? super Unit> continuation) {
        BrazeInAppMessageManager$displayInAppMessage$1 brazeInAppMessageManager$displayInAppMessage$1;
        int i;
        IInAppMessage iInAppMessage2;
        Throwable th;
        BrazeInAppMessageManager brazeInAppMessageManager2;
        final Activity activity;
        MainCoroutineDispatcher main;
        IInAppMessage iInAppMessage3;
        final BrazeInAppMessageManager brazeInAppMessageManager3;
        IInAppMessage iInAppMessage4;
        BrazeInAppMessageManager brazeInAppMessageManager4;
        BrazeInAppMessageManager brazeInAppMessageManager5;
        Throwable th2;
        ?? r0;
        final IInAppMessageViewWrapper createInAppMessageViewWrapper;
        IInAppMessageBackEventListener iInAppMessageBackEventListener;
        BrazeInAppMessageManager brazeInAppMessageManager6 = brazeInAppMessageManager;
        final IInAppMessage iInAppMessage5 = iInAppMessage;
        if (continuation instanceof BrazeInAppMessageManager$displayInAppMessage$1) {
            brazeInAppMessageManager$displayInAppMessage$1 = (BrazeInAppMessageManager$displayInAppMessage$1) continuation;
            if ((brazeInAppMessageManager$displayInAppMessage$1.label & Integer.MIN_VALUE) != 0) {
                brazeInAppMessageManager$displayInAppMessage$1.label -= Integer.MIN_VALUE;
                BrazeInAppMessageManager$displayInAppMessage$1 brazeInAppMessageManager$displayInAppMessage$12 = brazeInAppMessageManager$displayInAppMessage$1;
                Object obj = brazeInAppMessageManager$displayInAppMessage$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = brazeInAppMessageManager$displayInAppMessage$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    iInAppMessage2 = null;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager6, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String displayInAppMessage$lambda$37;
                            displayInAppMessage$lambda$37 = BrazeInAppMessageManager.displayInAppMessage$lambda$37(IInAppMessage.this);
                            return displayInAppMessage$lambda$37;
                        }
                    }, 6, (Object) null);
                    if (!brazeInAppMessageManager6.displayingInAppMessage.compareAndSet(false, true)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String displayInAppMessage$lambda$38;
                                displayInAppMessage$lambda$38 = BrazeInAppMessageManager.displayInAppMessage$lambda$38();
                                return displayInAppMessage$lambda$38;
                            }
                        }, 7, (Object) null);
                        brazeInAppMessageManager6.inAppMessageStack.push(iInAppMessage5);
                        return Unit.INSTANCE;
                    }
                    try {
                        WeakReference<Activity> weakReference = brazeInAppMessageManager6.mActivity;
                        activity = weakReference != null ? weakReference.get() : null;
                        if (activity == null) {
                            brazeInAppMessageManager6.carryoverInAppMessage = iInAppMessage5;
                            throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
                        }
                        long expirationTimestamp = iInAppMessage5.getExpirationTimestamp();
                        if (expirationTimestamp > 0) {
                            long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                            if (nowInMilliseconds > expirationTimestamp) {
                                throw new Exception("In-app message is expired. Doing nothing. Expiration: " + expirationTimestamp + ". Current time: " + nowInMilliseconds);
                            }
                        } else {
                            iInAppMessage2 = null;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String displayInAppMessage$lambda$39;
                                    displayInAppMessage$lambda$39 = BrazeInAppMessageManager.displayInAppMessage$lambda$39();
                                    return displayInAppMessage$lambda$39;
                                }
                            }, 7, (Object) null);
                        }
                        if (!brazeInAppMessageManager.verifyOrientationStatus(iInAppMessage)) {
                            throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                        }
                        ?? r02 = brazeInAppMessageManager6.configurationProvider;
                        if (r02 == 0) {
                            throw new Exception("configurationProvider is null. The in-app message will not be displayed and will not beput back on the stack.");
                        }
                        if (!brazeInAppMessageManager6.isInAppMessageForTheSameUser(iInAppMessage5, brazeInAppMessageManager6.currentUserId)) {
                            String str = brazeInAppMessageManager6.currentUserId;
                            InAppMessageEvent inAppMessageEvent = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage5);
                            throw new Exception("The last identified user '" + str + "' does not match the incoming in-app message's user '" + (inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null) + "'. The in-app message will not be displayed and will not be put back on the stack.");
                        }
                        if (iInAppMessage5.isControl()) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String displayInAppMessage$lambda$40;
                                    displayInAppMessage$lambda$40 = BrazeInAppMessageManager.displayInAppMessage$lambda$40();
                                    return displayInAppMessage$lambda$40;
                                }
                            }, 7, (Object) null);
                            iInAppMessage5.logImpression();
                            brazeInAppMessageManager6.resetAfterInAppMessageClose();
                            return Unit.INSTANCE;
                        }
                        try {
                            if (BrazeActionUtils.containsInvalidBrazeAction(iInAppMessage5)) {
                                InAppMessageEvent inAppMessageEvent2 = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage5);
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager6, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda24
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String displayInAppMessage$lambda$41;
                                        displayInAppMessage$lambda$41 = BrazeInAppMessageManager.displayInAppMessage$lambda$41();
                                        return displayInAppMessage$lambda$41;
                                    }
                                }, 6, (Object) null);
                                if (inAppMessageEvent2 != null) {
                                    brazeInAppMessageManager5 = brazeInAppMessageManager;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager5, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda25
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String displayInAppMessage$lambda$42;
                                            displayInAppMessage$lambda$42 = BrazeInAppMessageManager.displayInAppMessage$lambda$42();
                                            return displayInAppMessage$lambda$42;
                                        }
                                    }, 6, (Object) null);
                                    Context applicationContext = activity.getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                    BrazeInternal.retryInAppMessage(applicationContext, inAppMessageEvent2);
                                } else {
                                    brazeInAppMessageManager5 = brazeInAppMessageManager;
                                }
                                brazeInAppMessageManager5.resetAfterInAppMessageClose();
                                return Unit.INSTANCE;
                            }
                            if (INSTANCE.containsPushPermissionPrompt(iInAppMessage5) && !PermissionUtils.wouldPushPermissionPromptDisplay(activity)) {
                                InAppMessageEvent inAppMessageEvent3 = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage5);
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager6, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda26
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String displayInAppMessage$lambda$43;
                                        displayInAppMessage$lambda$43 = BrazeInAppMessageManager.displayInAppMessage$lambda$43();
                                        return displayInAppMessage$lambda$43;
                                    }
                                }, 6, (Object) null);
                                if (inAppMessageEvent3 != null) {
                                    brazeInAppMessageManager4 = brazeInAppMessageManager;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager4, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda27
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String displayInAppMessage$lambda$44;
                                            displayInAppMessage$lambda$44 = BrazeInAppMessageManager.displayInAppMessage$lambda$44();
                                            return displayInAppMessage$lambda$44;
                                        }
                                    }, 6, (Object) null);
                                    Context applicationContext2 = activity.getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                                    BrazeInternal.retryInAppMessage(applicationContext2, inAppMessageEvent3);
                                } else {
                                    brazeInAppMessageManager4 = brazeInAppMessageManager;
                                }
                                brazeInAppMessageManager4.resetAfterInAppMessageClose();
                                return Unit.INSTANCE;
                            }
                            IInAppMessageViewFactory inAppMessageViewFactory = brazeInAppMessageManager.getInAppMessageViewFactory(iInAppMessage);
                            if (inAppMessageViewFactory == null) {
                                throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                            }
                            int i2 = WhenMappings.$EnumSwitchMapping$1[iInAppMessage5.getMessageType().ordinal()];
                            if (i2 == 1 || i2 == 2) {
                                main = Dispatchers.getMain();
                            } else {
                                main = Dispatchers.getIO();
                            }
                            BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1 brazeInAppMessageManager$displayInAppMessage$inAppMessageView$1 = new BrazeInAppMessageManager$displayInAppMessage$inAppMessageView$1(inAppMessageViewFactory, activity, iInAppMessage5, null);
                            brazeInAppMessageManager$displayInAppMessage$12.L$0 = brazeInAppMessageManager6;
                            brazeInAppMessageManager$displayInAppMessage$12.L$1 = iInAppMessage5;
                            brazeInAppMessageManager$displayInAppMessage$12.L$2 = activity;
                            brazeInAppMessageManager$displayInAppMessage$12.L$3 = r02;
                            brazeInAppMessageManager$displayInAppMessage$12.label = 1;
                            Object withContext = BuildersKt.withContext(main, brazeInAppMessageManager$displayInAppMessage$inAppMessageView$1, brazeInAppMessageManager$displayInAppMessage$12);
                            if (withContext == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            iInAppMessage3 = r02;
                            obj = withContext;
                            brazeInAppMessageManager3 = brazeInAppMessageManager6;
                            iInAppMessage4 = iInAppMessage5;
                        } catch (Throwable th3) {
                            th = th3;
                            brazeInAppMessageManager6 = brazeInAppMessageManager;
                            th = th;
                            brazeInAppMessageManager2 = brazeInAppMessageManager6;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.E, th, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String displayInAppMessage$lambda$52;
                                    displayInAppMessage$lambda$52 = BrazeInAppMessageManager.displayInAppMessage$lambda$52(IInAppMessage.this);
                                    return displayInAppMessage$lambda$52;
                                }
                            }, 4, (Object) null);
                            brazeInAppMessageManager2.resetAfterInAppMessageClose();
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r1 = (BrazeConfigurationProvider) brazeInAppMessageManager$displayInAppMessage$12.L$3;
                    Activity activity2 = (Activity) brazeInAppMessageManager$displayInAppMessage$12.L$2;
                    IInAppMessage iInAppMessage6 = (IInAppMessage) brazeInAppMessageManager$displayInAppMessage$12.L$1;
                    brazeInAppMessageManager3 = (BrazeInAppMessageManager) brazeInAppMessageManager$displayInAppMessage$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        activity = activity2;
                        iInAppMessage3 = r1;
                        iInAppMessage4 = iInAppMessage6;
                    } catch (Throwable th5) {
                        th2 = th5;
                        iInAppMessage5 = iInAppMessage6;
                        brazeInAppMessageManager2 = brazeInAppMessageManager3;
                        th = th2;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.E, th, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String displayInAppMessage$lambda$52;
                                displayInAppMessage$lambda$52 = BrazeInAppMessageManager.displayInAppMessage$lambda$52(IInAppMessage.this);
                                return displayInAppMessage$lambda$52;
                            }
                        }, 4, (Object) null);
                        brazeInAppMessageManager2.resetAfterInAppMessageClose();
                        return Unit.INSTANCE;
                    }
                }
                r0 = (View) obj;
                if (r0 != 0) {
                    throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                }
                if (r0.getParent() != null) {
                    throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                }
                Animation openingAnimation = brazeInAppMessageManager3.getInAppMessageAnimationFactory().getOpeningAnimation(iInAppMessage4);
                Animation closingAnimation = brazeInAppMessageManager3.getInAppMessageAnimationFactory().getClosingAnimation(iInAppMessage4);
                ?? inAppMessageViewWrapperFactory = brazeInAppMessageManager3.getInAppMessageViewWrapperFactory();
                try {
                    if (r0 instanceof IInAppMessageImmersiveView) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String displayInAppMessage$lambda$45;
                                displayInAppMessage$lambda$45 = BrazeInAppMessageManager.displayInAppMessage$lambda$45();
                                return displayInAppMessage$lambda$45;
                            }
                        }, 7, (Object) null);
                        IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) r0;
                        Intrinsics.checkNotNull(iInAppMessage4, "null cannot be cast to non-null type com.braze.models.inappmessage.InAppMessageImmersiveBase");
                        iInAppMessage2 = iInAppMessage4;
                        createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(r0, iInAppMessage2, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, iInAppMessage3, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(((InAppMessageImmersiveBase) iInAppMessage4).getMessageButtons().size()), iInAppMessageImmersiveView.getMessageCloseButtonView());
                        iInAppMessageBackEventListener = r0;
                    } else {
                        IInAppMessage iInAppMessage7 = iInAppMessage4;
                        ?? r12 = r0;
                        ?? r13 = iInAppMessage3;
                        if (r12 instanceof IInAppMessageView) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda29
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String displayInAppMessage$lambda$46;
                                    displayInAppMessage$lambda$46 = BrazeInAppMessageManager.displayInAppMessage$lambda$46();
                                    return displayInAppMessage$lambda$46;
                                }
                            }, 7, (Object) null);
                            iInAppMessage2 = iInAppMessage7;
                            createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(r12, iInAppMessage2, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, r13, openingAnimation, closingAnimation, ((IInAppMessageView) r12).getMessageClickableView());
                            iInAppMessageBackEventListener = r12;
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String displayInAppMessage$lambda$47;
                                    displayInAppMessage$lambda$47 = BrazeInAppMessageManager.displayInAppMessage$lambda$47();
                                    return displayInAppMessage$lambda$47;
                                }
                            }, 7, (Object) null);
                            iInAppMessage2 = iInAppMessage7;
                            createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(r12, iInAppMessage2, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, r13, openingAnimation, closingAnimation, r12);
                            iInAppMessageBackEventListener = r12;
                        }
                    }
                    brazeInAppMessageManager3.inAppMessageViewWrapper = createInAppMessageViewWrapper;
                    if (iInAppMessageBackEventListener instanceof InAppMessageHtmlBaseView) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String displayInAppMessage$lambda$48;
                                displayInAppMessage$lambda$48 = BrazeInAppMessageManager.displayInAppMessage$lambda$48();
                                return displayInAppMessage$lambda$48;
                            }
                        }, 7, (Object) null);
                        ((InAppMessageHtmlBaseView) iInAppMessageBackEventListener).setHtmlPageFinishedListener(new IWebViewClientStateListener() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda18
                            @Override // com.braze.ui.inappmessage.listeners.IWebViewClientStateListener
                            public final void onPageFinished() {
                                BrazeInAppMessageManager.displayInAppMessage$lambda$51(IInAppMessageViewWrapper.this, brazeInAppMessageManager3, activity);
                            }
                        });
                    } else if (createInAppMessageViewWrapper != null) {
                        createInAppMessageViewWrapper.open(activity);
                    }
                    if ((iInAppMessageBackEventListener instanceof InAppMessageFullView) && Build.VERSION.SDK_INT >= 34) {
                        new InAppMessageBackEventHandler(activity, iInAppMessageBackEventListener);
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    iInAppMessage3 = iInAppMessage2;
                    iInAppMessage5 = iInAppMessage3;
                    brazeInAppMessageManager2 = brazeInAppMessageManager3;
                    th = th2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.E, th, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String displayInAppMessage$lambda$52;
                            displayInAppMessage$lambda$52 = BrazeInAppMessageManager.displayInAppMessage$lambda$52(IInAppMessage.this);
                            return displayInAppMessage$lambda$52;
                        }
                    }, 4, (Object) null);
                    brazeInAppMessageManager2.resetAfterInAppMessageClose();
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        brazeInAppMessageManager$displayInAppMessage$1 = new BrazeInAppMessageManager$displayInAppMessage$1(brazeInAppMessageManager6, continuation);
        BrazeInAppMessageManager$displayInAppMessage$1 brazeInAppMessageManager$displayInAppMessage$122 = brazeInAppMessageManager$displayInAppMessage$1;
        Object obj2 = brazeInAppMessageManager$displayInAppMessage$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = brazeInAppMessageManager$displayInAppMessage$122.label;
        if (i != 0) {
        }
        r0 = (View) obj2;
        if (r0 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$37(IInAppMessage iInAppMessage) {
        return "Attempting to display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getJsonKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$38() {
        return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$39() {
        return "Expiration timestamp not defined. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$40() {
        return "Not displaying control in-app message. Logging impression and ending display execution.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$41() {
        return "Cannot show message containing an invalid Braze Action.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$42() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$43() {
        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$44() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$45() {
        return "Creating view wrapper for immersive in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$46() {
        return "Creating view wrapper for base in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$47() {
        return "Creating view wrapper for in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$48() {
        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$51(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$51$lambda$49;
                        displayInAppMessage$lambda$51$lambda$49 = BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$49();
                        return displayInAppMessage$lambda$51$lambda$49;
                    }
                }, 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$51$lambda$50;
                        displayInAppMessage$lambda$51$lambda$50 = BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$50();
                        return displayInAppMessage$lambda$51$lambda$50;
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$49() {
        return "Page has finished loading. Opening in-app message view wrapper.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$50() {
        return "Failed to open view wrapper in page finished listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$52(IInAppMessage iInAppMessage) {
        return "Could not display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getJsonKey());
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda43
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$53(BrazeInAppMessageManager.this, (InAppMessageEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$53(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        IInAppMessage inAppMessage = event.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, event);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    private final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber(Context context) {
        return new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda14
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57(BrazeInAppMessageManager.this, (BrazeUserChangeEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBrazeUserChangeEventSubscriber$lambda$57(final BrazeInAppMessageManager brazeInAppMessageManager, final BrazeUserChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createBrazeUserChangeEventSubscriber$lambda$57$lambda$54;
                createBrazeUserChangeEventSubscriber$lambda$57$lambda$54 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(BrazeUserChangeEvent.this);
                return createBrazeUserChangeEventSubscriber$lambda$57$lambda$54;
            }
        }, 6, (Object) null);
        final String currentUserId = event.getCurrentUserId();
        brazeInAppMessageManager.currentUserId = currentUserId;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createBrazeUserChangeEventSubscriber$lambda$57$lambda$55;
                createBrazeUserChangeEventSubscriber$lambda$57$lambda$55 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(currentUserId);
                return createBrazeUserChangeEventSubscriber$lambda$57$lambda$55;
            }
        }, 7, (Object) null);
        CollectionsKt.removeAll((List) brazeInAppMessageManager.inAppMessageStack, new Function1() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean createBrazeUserChangeEventSubscriber$lambda$57$lambda$56;
                createBrazeUserChangeEventSubscriber$lambda$57$lambda$56 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$56(BrazeInAppMessageManager.this, currentUserId, (IInAppMessage) obj);
                return Boolean.valueOf(createBrazeUserChangeEventSubscriber$lambda$57$lambda$56);
            }
        });
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.carryoverInAppMessage, currentUserId)) {
            brazeInAppMessageManager.carryoverInAppMessage = null;
        }
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.unregisteredInAppMessage, currentUserId)) {
            brazeInAppMessageManager.unregisteredInAppMessage = null;
        }
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "InAppMessage manager handling new current user id: '" + brazeUserChangeEvent + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(String str) {
        return "Removing in-app messages not from user " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createBrazeUserChangeEventSubscriber$lambda$57$lambda$56(BrazeInAppMessageManager brazeInAppMessageManager, String str, IInAppMessage iInAppMessage) {
        return !brazeInAppMessageManager.isInAppMessageForTheSameUser(iInAppMessage, str);
    }

    public boolean verifyOrientationStatus(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$58;
                    verifyOrientationStatus$lambda$58 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$58();
                    return verifyOrientationStatus$lambda$58;
                }
            }, 6, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$59;
                    verifyOrientationStatus$lambda$59 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$59();
                    return verifyOrientationStatus$lambda$59;
                }
            }, 7, (Object) null);
        } else if (orientation == Orientation.ANY) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$60;
                    verifyOrientationStatus$lambda$60 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$60();
                    return verifyOrientationStatus$lambda$60;
                }
            }, 7, (Object) null);
        } else {
            if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                return false;
            }
            if (this.originalOrientation == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String verifyOrientationStatus$lambda$61;
                        verifyOrientationStatus$lambda$61 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$61();
                        return verifyOrientationStatus$lambda$61;
                    }
                }, 7, (Object) null);
                this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                ViewUtils.setActivityRequestedOrientation(activity, 14);
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$58() {
        return "Cannot verify orientation status with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$59() {
        return "Running on tablet. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$60() {
        return "Any orientation specified. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$61() {
        return "Requesting orientation lock.";
    }

    public boolean isInAppMessageForTheSameUser(IInAppMessage inAppMessage, String currentUserId) {
        if (inAppMessage != null && currentUserId != null) {
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
            String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
            if (userId != null && !Intrinsics.areEqual(userId, currentUserId)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$62() {
        return "Pausing InAppMessage WebView";
    }

    public final void pauseWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String pauseWebviewIfNecessary$lambda$62;
                pauseWebviewIfNecessary$lambda$62 = BrazeInAppMessageManager.pauseWebviewIfNecessary$lambda$62();
                return pauseWebviewIfNecessary$lambda$62;
            }
        }, 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resumeWebviewIfNecessary$lambda$63() {
        return "Resuming InAppMessage WebView";
    }

    public final void resumeWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resumeWebviewIfNecessary$lambda$63;
                resumeWebviewIfNecessary$lambda$63 = BrazeInAppMessageManager.resumeWebviewIfNecessary$lambda$63();
                return resumeWebviewIfNecessary$lambda$63;
            }
        }, 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onResume();
        }
    }

    /* compiled from: BrazeInAppMessageManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\b\fJ\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "<init>", "()V", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", "instance", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInstance", "setTestingInstance", "", "manager", "setTestingInstance$android_sdk_ui_release", "containsPushPermissionPrompt", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                Intrinsics.checkNotNull(brazeInAppMessageManager, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    Companion companion = BrazeInAppMessageManager.INSTANCE;
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                Intrinsics.checkNotNull(brazeInAppMessageManager2, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void setTestingInstance$android_sdk_ui_release(BrazeInAppMessageManager manager) {
            BrazeInAppMessageManager.instance = manager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            if (iInAppMessage instanceof InAppMessageHtml) {
                return ((InAppMessageHtml) iInAppMessage).isPushPrimer();
            }
            return BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }
    }
}
