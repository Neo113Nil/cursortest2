package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import com.ironsource.C2608q2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.fid.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeInAppMessageManager.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0002J\u0018\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u00100\u001a\u00020 H\u0016J\u0010\u00101\u001a\u00020,2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020 H\u0016J\u0010\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020 H\u0016J\u0012\u00107\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020 H\u0016J\b\u0010;\u001a\u00020,H\u0016J\u0012\u0010<\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010=\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0004H\u0017R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0012\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0004\n\u0002\u0010$R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\t¨\u0006?"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "()V", "carryoverInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getCarryoverInAppMessage$annotations", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "inAppMessageEventMap", "", "Lcom/braze/events/InAppMessageEvent;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "inAppMessageStack", "Ljava/util/Stack;", "getInAppMessageStack$annotations", "getInAppMessageStack", "()Ljava/util/Stack;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "isCurrentlyDisplayingInAppMessage", "", "()Z", "originalOrientation", "", "Ljava/lang/Integer;", "sdkDataWipeEventSubscriber", "Lcom/braze/events/SdkDataWipeEvent;", "unregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "addInAppMessage", "", "inAppMessage", "createInAppMessageEventSubscriber", "displayInAppMessage", "isCarryOver", "ensureSubscribedToInAppMessageEvents", "context", "Landroid/content/Context;", "getIsCurrentlyDisplayingInAppMessage", "hideCurrentlyDisplayingInAppMessage", "dismissed", "registerInAppMessageManager", "activity", "Landroid/app/Activity;", "requestDisplayInAppMessage", "resetAfterInAppMessageClose", "unregisterInAppMessageManager", "verifyOrientationStatus", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
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
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Removing existing in-app message event subscriber before subscribing a new one.";
                }
            }, 3, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Subscribing in-app message event subscriber";
            }
        }, 3, (Object) null);
        IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.INSTANCE.getInstance(context).subscribeToNewInAppMessages(createInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = createInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
                }
            }, 2, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$ensureSubscribedToInAppMessageEvents$5
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Subscribing sdk data wipe subscriber";
            }
        }, 2, (Object) null);
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber = new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.m5216ensureSubscribedToInAppMessageEvents$lambda1(BrazeInAppMessageManager.this, (SdkDataWipeEvent) obj);
            }
        };
        Braze.INSTANCE.getInstance(context).addSingleSynchronousSubscription(iEventSubscriber, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensureSubscribedToInAppMessageEvents$lambda-1, reason: not valid java name */
    public static final void m5216ensureSubscribedToInAppMessageEvents$lambda1(BrazeInAppMessageManager this$0, SdkDataWipeEvent it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.inAppMessageStack.clear();
        this$0.carryoverInAppMessage = null;
        this$0.unregisteredInAppMessage = null;
    }

    public void registerInAppMessageManager(final Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Null Activity passed to registerInAppMessageManager. Doing nothing";
                }
            }, 2, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Registering InAppMessageManager with activity: ", activity.getLocalClassName());
            }
        }, 2, (Object) null);
        this.mActivity = activity;
        if (this.mApplicationContext == null) {
            this.mApplicationContext = activity.getApplicationContext();
            if (this.mApplicationContext == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
                    }
                }, 2, (Object) null);
                return;
            }
        }
        if (this.configurationProvider == null) {
            Context context = this.mApplicationContext;
            this.configurationProvider = context == null ? null : new BrazeConfigurationProvider(context);
        }
        IInAppMessage iInAppMessage = this.carryoverInAppMessage;
        if (iInAppMessage != null) {
            if (iInAppMessage != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$5$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Requesting display of carryover in-app message.";
                    }
                }, 3, (Object) null);
                iInAppMessage.setAnimateIn(false);
                displayInAppMessage(iInAppMessage, true);
            }
            this.carryoverInAppMessage = null;
        } else {
            IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
            if (iInAppMessage2 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$6$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Adding previously unregistered in-app message.";
                    }
                }, 3, (Object) null);
                addInAppMessage(iInAppMessage2);
                setUnregisteredInAppMessage(null);
            }
        }
        Context context2 = this.mApplicationContext;
        if (context2 == null) {
            return;
        }
        ensureSubscribedToInAppMessageEvents(context2);
    }

    public void unregisterInAppMessageManager(final Activity activity) {
        IInAppMessage inAppMessage;
        if (getShouldNextUnregisterBeSkipped()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    Activity activity2 = activity;
                    return Intrinsics.stringPlus("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ", activity2 == null ? null : activity2.getLocalClassName());
                }
            }, 3, (Object) null);
            setShouldNextUnregisterBeSkipped(false);
            return;
        }
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Null Activity passed to unregisterInAppMessageManager.";
                }
            }, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Unregistering InAppMessageManager from activity: ", activity.getLocalClassName());
                }
            }, 2, (Object) null);
        }
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "In-app message view includes HTML. Removing the page finished listener.";
                    }
                }, 3, (Object) null);
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
            if (this.mActivity == null) {
                if (!this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
                        }
                    }, 2, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$2
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
                        }
                    }, 3, (Object) null);
                }
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
                    }
                }, 3, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "The in-app message stack is empty. No in-app message will be displayed.";
                    }
                }, 3, (Object) null);
                return false;
            }
            IInAppMessage inAppMessage = this.inAppMessageStack.pop();
            if (!inAppMessage.isControl()) {
                IInAppMessageManagerListener inAppMessageManagerListener = getInAppMessageManagerListener();
                Intrinsics.checkNotNullExpressionValue(inAppMessage, "inAppMessage");
                beforeInAppMessageDisplayed = inAppMessageManagerListener.beforeInAppMessageDisplayed(inAppMessage);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$inAppMessageOperation$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Using the control in-app message manager listener.";
                    }
                }, 3, (Object) null);
                IInAppMessageManagerListener controlInAppMessageManagerListener = getControlInAppMessageManagerListener();
                Intrinsics.checkNotNullExpressionValue(inAppMessage, "inAppMessage");
                beforeInAppMessageDisplayed = controlInAppMessageManagerListener.beforeInAppMessageDisplayed(inAppMessage);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[beforeInAppMessageDisplayed.ordinal()];
            if (i == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$5
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
                    }
                }, 3, (Object) null);
            } else {
                if (i == 2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$6
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
                        }
                    }, 3, (Object) null);
                    this.inAppMessageStack.push(inAppMessage);
                    return false;
                }
                if (i == 3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$7
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
                        }
                    }, 3, (Object) null);
                    return false;
                }
            }
            BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(inAppMessage);
            return true;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$8
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Error running requestDisplayInAppMessage";
                }
            });
            return false;
        }
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean dismissed) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (dismissed) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            iInAppMessageViewWrapper.close();
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$resetAfterInAppMessageClose$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Resetting after in-app message close.";
            }
        }, 2, (Object) null);
        this.inAppMessageViewWrapper = null;
        Activity activity = this.mActivity;
        final Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$resetAfterInAppMessageClose$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Setting requested orientation to original orientation ", num);
            }
        }, 3, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    public boolean getIsCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7 A[Catch: all -> 0x025f, TryCatch #2 {all -> 0x025f, blocks: (B:7:0x003a, B:10:0x0040, B:12:0x004a, B:15:0x008f, B:17:0x0095, B:19:0x009b, B:21:0x00b1, B:24:0x00b9, B:26:0x00d4, B:27:0x00ee, B:29:0x00f2, B:31:0x00fa, B:33:0x0100, B:35:0x011b, B:36:0x0135, B:38:0x0139, B:40:0x013f, B:42:0x0145, B:44:0x014b, B:46:0x014f, B:51:0x01f1, B:53:0x01f7, B:58:0x0214, B:75:0x021e, B:76:0x0225, B:77:0x0226, B:78:0x0232, B:79:0x0233, B:80:0x023f, B:81:0x0240, B:82:0x024c, B:83:0x024d, B:84:0x0254, B:85:0x0053, B:86:0x006f, B:87:0x0070, B:88:0x0080, B:89:0x0255, B:90:0x025e), top: B:6:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void displayInAppMessage(final IInAppMessage inAppMessage, boolean isCarryOver) {
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView;
        final IInAppMessageViewWrapper iInAppMessageViewWrapper;
        IInAppMessageViewWrapper createInAppMessageViewWrapper;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView2;
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Attempting to display in-app message with payload: ", JsonUtils.getPrettyPrintedString(IInAppMessage.this.getKey()));
            }
        }, 2, (Object) null);
        if (!this.displayingInAppMessage.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
                }
            }, 3, (Object) null);
            this.inAppMessageStack.push(inAppMessage);
            return;
        }
        try {
            final Activity activity = this.mActivity;
            if (activity == null) {
                this.carryoverInAppMessage = inAppMessage;
                throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
            }
            if (!isCarryOver) {
                long expirationTimestamp = inAppMessage.getExpirationTimestamp();
                if (expirationTimestamp > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis > expirationTimestamp) {
                        throw new Exception("In-app message is expired. Doing nothing. Expiration: " + expirationTimestamp + ". Current time: " + currentTimeMillis);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Expiration timestamp not defined. Continuing.";
                        }
                    }, 3, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not checking expiration status for carry-over in-app message.";
                    }
                }, 3, (Object) null);
            }
            if (!verifyOrientationStatus(inAppMessage)) {
                throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
            }
            if (inAppMessage.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$5
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not displaying control in-app message. Logging impression and ending display execution.";
                    }
                }, 3, (Object) null);
                inAppMessage.logImpression();
                resetAfterInAppMessageClose();
                return;
            }
            if (BrazeActionUtils.containsInvalidBrazeAction(inAppMessage)) {
                InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$6
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Cannot show message containing an invalid Braze Action.";
                    }
                }, 2, (Object) null);
                if (inAppMessageEvent != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$7
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Attempting to perform any fallback actions.";
                        }
                    }, 2, (Object) null);
                    Context applicationContext = activity.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                    BrazeInternal.retryInAppMessage(applicationContext, inAppMessageEvent);
                }
                resetAfterInAppMessageClose();
                return;
            }
            if (INSTANCE.containsPushPermissionPrompt(inAppMessage) && !PermissionUtils.wouldPushPermissionPromptDisplay(activity)) {
                InAppMessageEvent inAppMessageEvent2 = this.inAppMessageEventMap.get(inAppMessage);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$8
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
                    }
                }, 2, (Object) null);
                if (inAppMessageEvent2 != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$9
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Attempting to perform any fallback actions.";
                        }
                    }, 2, (Object) null);
                    Context applicationContext2 = activity.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "activity.applicationContext");
                    BrazeInternal.retryInAppMessage(applicationContext2, inAppMessageEvent2);
                }
                resetAfterInAppMessageClose();
                return;
            }
            IInAppMessageViewFactory inAppMessageViewFactory = getInAppMessageViewFactory(inAppMessage);
            if (inAppMessageViewFactory == null) {
                inAppMessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
            }
            View createInAppMessageView = inAppMessageViewFactory.createInAppMessageView(activity, inAppMessage);
            if (createInAppMessageView == 0) {
                inAppMessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
            }
            if (createInAppMessageView.getParent() != null) {
                inAppMessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
            }
            BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
            if (brazeConfigurationProvider == null) {
                throw new Exception("configurationProvider is null. The in-app message will not be displayed and will not beput back on the stack.");
            }
            Animation openingAnimation = getInAppMessageAnimationFactory().getOpeningAnimation(inAppMessage);
            Animation closingAnimation = getInAppMessageAnimationFactory().getClosingAnimation(inAppMessage);
            IInAppMessageViewWrapperFactory inAppMessageViewWrapperFactory = getInAppMessageViewWrapperFactory();
            try {
                if (createInAppMessageView instanceof IInAppMessageImmersiveView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$10
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Creating view wrapper for immersive in-app message.";
                        }
                    }, 3, (Object) null);
                    IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) createInAppMessageView;
                    createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(createInAppMessageView, inAppMessage, this.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(((InAppMessageImmersiveBase) inAppMessage).getMessageButtons().size()), iInAppMessageImmersiveView.getMessageCloseButtonView());
                    inAppMessageHtmlBaseView2 = createInAppMessageView;
                } else if (createInAppMessageView instanceof IInAppMessageView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$11
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Creating view wrapper for base in-app message.";
                        }
                    }, 3, (Object) null);
                    createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(createInAppMessageView, inAppMessage, this.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, ((IInAppMessageView) createInAppMessageView).getMessageClickableView());
                    inAppMessageHtmlBaseView2 = createInAppMessageView;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$12
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Creating view wrapper for in-app message.";
                        }
                    }, 3, (Object) null);
                    try {
                        IInAppMessageViewWrapper createInAppMessageViewWrapper2 = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(createInAppMessageView, inAppMessage, this.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, createInAppMessageView);
                        inAppMessageHtmlBaseView = createInAppMessageView;
                        iInAppMessageViewWrapper = createInAppMessageViewWrapper2;
                        this.inAppMessageViewWrapper = iInAppMessageViewWrapper;
                        if (!(inAppMessageHtmlBaseView instanceof InAppMessageHtmlBaseView)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$13
                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    return "In-app message view includes HTML. Delaying display until the content has finished loading.";
                                }
                            }, 3, (Object) null);
                            inAppMessageHtmlBaseView.setHtmlPageFinishedListener(new IWebViewClientStateListener() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda0
                                @Override // com.braze.ui.inappmessage.listeners.IWebViewClientStateListener
                                public final void onPageFinished() {
                                    BrazeInAppMessageManager.m5215displayInAppMessage$lambda7(IInAppMessageViewWrapper.this, this, activity);
                                }
                            });
                            return;
                        } else {
                            if (iInAppMessageViewWrapper == null) {
                                return;
                            }
                            iInAppMessageViewWrapper.open(activity);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$15
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return Intrinsics.stringPlus("Could not display in-app message with payload: ", JsonUtils.getPrettyPrintedString(IInAppMessage.this.getKey()));
                            }
                        });
                        resetAfterInAppMessageClose();
                        return;
                    }
                }
                iInAppMessageViewWrapper = createInAppMessageViewWrapper;
                inAppMessageHtmlBaseView = inAppMessageHtmlBaseView2;
                this.inAppMessageViewWrapper = iInAppMessageViewWrapper;
                if (!(inAppMessageHtmlBaseView instanceof InAppMessageHtmlBaseView)) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayInAppMessage$lambda-7, reason: not valid java name */
    public static final void m5215displayInAppMessage$lambda7(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager this$0, Activity activity) {
        BrazeInAppMessageManager brazeInAppMessageManager;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (iInAppMessageViewWrapper != null) {
            try {
                brazeInAppMessageManager = this$0;
            } catch (Exception e) {
                e = e;
                brazeInAppMessageManager = this$0;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$14$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Page has finished loading. Opening in-app message view wrapper.";
                    }
                }, 3, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e2) {
                e = e2;
                BrazeLogger.INSTANCE.brazelog(brazeInAppMessageManager, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$14$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to open view wrapper in page finished listener";
                    }
                });
            }
        }
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new IEventSubscriber() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.m5214createInAppMessageEventSubscriber$lambda8(BrazeInAppMessageManager.this, (InAppMessageEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createInAppMessageEventSubscriber$lambda-8, reason: not valid java name */
    public static final void m5214createInAppMessageEventSubscriber$lambda8(BrazeInAppMessageManager this$0, InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        IInAppMessage inAppMessage = event.getInAppMessage();
        this$0.inAppMessageEventMap.put(inAppMessage, event);
        this$0.addInAppMessage(inAppMessage);
    }

    public boolean verifyOrientationStatus(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Activity activity = this.mActivity;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot verify orientation status with null Activity.";
                }
            }, 2, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Running on tablet. In-app message can be displayed in any orientation.";
                }
            }, 3, (Object) null);
        } else if (orientation == Orientation.ANY) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Any orientation specified. In-app message can be displayed in any orientation.";
                }
            }, 3, (Object) null);
        } else {
            if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                return false;
            }
            if (this.originalOrientation == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$verifyOrientationStatus$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Requesting orientation lock.";
                    }
                }, 3, (Object) null);
                this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                ViewUtils.setActivityRequestedOrientation(activity, 14);
            }
            return true;
        }
        return true;
    }

    /* compiled from: BrazeInAppMessageManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "()V", C2608q2.p, "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", Constants.GET_INSTANCE, "containsPushPermissionPrompt", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
                if (brazeInAppMessageManager != null) {
                    return brazeInAppMessageManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
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
                if (brazeInAppMessageManager2 != null) {
                    return brazeInAppMessageManager2;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
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
