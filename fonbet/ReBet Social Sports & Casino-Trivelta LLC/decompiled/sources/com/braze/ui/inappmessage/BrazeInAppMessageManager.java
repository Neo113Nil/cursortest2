package com.braze.ui.inappmessage;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import android.annotation.SuppressLint;
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
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
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
import com.facebook.react.modules.dialog.DialogModule;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0003J \u0010\u001e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0004H\u0001¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020\nH\u0000¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010,\u001a\u00020\nH\u0000¢\u0006\u0004\b+\u0010\u0003R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\u0003R&\u00105\u001a\b\u0012\u0004\u0012\u00020\u0012048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010\u0003\u001a\u0004\b7\u00108R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010PR*\u0010Q\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bV\u0010\u0003\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0015R*\u0010W\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bW\u0010R\u0012\u0004\bZ\u0010\u0003\u001a\u0004\bX\u0010T\"\u0004\bY\u0010\u0015R\u0011\u0010[\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b[\u0010\u0018¨\u0006]"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "<init>", "()V", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "createInAppMessageEventSubscriber", "()Lcom/braze/events/IEventSubscriber;", "Landroid/content/Context;", "context", "", "ensureSubscribedToInAppMessageEvents", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "registerInAppMessageManager", "(Landroid/app/Activity;)V", "unregisterInAppMessageManager", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "addInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "requestDisplayInAppMessage", "()Z", DialogModule.ACTION_DISMISSED, "hideCurrentlyDisplayingInAppMessage", "(Z)V", "resetAfterInAppMessageClose", "isCarryOver", "displayInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/braze/events/BrazeUserChangeEvent;", "createBrazeUserChangeEventSubscriber$android_sdk_ui_release", "createBrazeUserChangeEventSubscriber", "verifyOrientationStatus", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "", "currentUserId", "isInAppMessageForTheSameUser", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)Z", "pauseWebviewIfNecessary$android_sdk_ui_release", "pauseWebviewIfNecessary", "resumeWebviewIfNecessary$android_sdk_ui_release", "resumeWebviewIfNecessary", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "Ljava/util/Stack;", "inAppMessageStack", "Ljava/util/Stack;", "getInAppMessageStack", "()Ljava/util/Stack;", "getInAppMessageStack$annotations", "", "inAppMessageEventMap", "Ljava/util/Map;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "brazeUserChangeEventSubscriber", "", "originalOrientation", "Ljava/lang/Integer;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Lcom/braze/ui/inappmessage/InAppMessageBackEventHandler;", "currentBackEventHandler", "Lcom/braze/ui/inappmessage/InAppMessageBackEventHandler;", "Ljava/lang/String;", "carryoverInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "getCarryoverInAppMessage$annotations", "unregisteredInAppMessage", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "isCurrentlyDisplayingInAppMessage", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nBrazeInAppMessageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeInAppMessageManager.kt\ncom/braze/ui/inappmessage/BrazeInAppMessageManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,831:1\n1#2:832\n*E\n"})
/* loaded from: classes.dex */
public class BrazeInAppMessageManager extends InAppMessageManagerBase {

    @Nullable
    private static volatile BrazeInAppMessageManager instance;

    @Nullable
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;

    @Nullable
    private IInAppMessage carryoverInAppMessage;

    @Nullable
    private BrazeConfigurationProvider configurationProvider;

    @Nullable
    private InAppMessageBackEventHandler currentBackEventHandler;

    @Nullable
    private String currentUserId;

    @Nullable
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;

    @Nullable
    private IInAppMessageViewWrapper inAppMessageViewWrapper;

    @Nullable
    private Integer originalOrientation;

    @Nullable
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;

    @Nullable
    private IInAppMessage unregisteredInAppMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReentrantLock instanceLock = new ReentrantLock();

    @NotNull
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();

    @JvmField
    @NotNull
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);

    @NotNull
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();

    @NotNull
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "", "containsPushPermissionPrompt", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInstance", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Ljava/util/concurrent/locks/ReentrantLock;", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", "instance", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        @JvmStatic
        @NotNull
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
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                Intrinsics.checkNotNull(brazeInAppMessageManager2, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBrazeUserChangeEventSubscriber$lambda$0(BrazeInAppMessageManager brazeInAppMessageManager, final BrazeUserChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: k4.Y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createBrazeUserChangeEventSubscriber$lambda$0$0;
                createBrazeUserChangeEventSubscriber$lambda$0$0 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0$0(BrazeUserChangeEvent.this);
                return createBrazeUserChangeEventSubscriber$lambda$0$0;
            }
        }, 6, (Object) null);
        final String str = brazeInAppMessageManager.currentUserId;
        brazeInAppMessageManager.currentUserId = event.getCurrentUserId();
        if (str == null || Intrinsics.areEqual(str, event.getCurrentUserId())) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createBrazeUserChangeEventSubscriber$lambda$0$1;
                createBrazeUserChangeEventSubscriber$lambda$0$1 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0$1(str, event);
                return createBrazeUserChangeEventSubscriber$lambda$0$1;
            }
        }, 7, (Object) null);
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.inAppMessageEventMap.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$0$0(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "InAppMessage manager handling user change event. New user id: '" + brazeUserChangeEvent.getCurrentUserId() + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$0$1(String str, BrazeUserChangeEvent brazeUserChangeEvent) {
        return "User changed from '" + str + "' to '" + brazeUserChangeEvent.getCurrentUserId() + "'. Clearing in-app message state.";
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new IEventSubscriber() { // from class: k4.V
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$0(BrazeInAppMessageManager.this, (InAppMessageEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$0(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        IInAppMessage inAppMessage = event.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, event);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$0(IInAppMessage iInAppMessage) {
        return "Attempting to display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$1() {
        return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$10() {
        return "Creating view wrapper for in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$11() {
        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$12(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$12$0;
                        displayInAppMessage$lambda$12$0 = BrazeInAppMessageManager.displayInAppMessage$lambda$12$0();
                        return displayInAppMessage$lambda$12$0;
                    }
                }, 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: k4.X
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$12$1;
                        displayInAppMessage$lambda$12$1 = BrazeInAppMessageManager.displayInAppMessage$lambda$12$1();
                        return displayInAppMessage$lambda$12$1;
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$12$0() {
        return "Page has finished loading. Opening in-app message view wrapper.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$12$1() {
        return "Failed to open view wrapper in page finished listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$13(IInAppMessage iInAppMessage) {
        return "Could not display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$2() {
        return "Expiration timestamp not defined. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$3() {
        return "Not displaying control in-app message. Logging impression and ending display execution.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$4() {
        return "Cannot show message containing an invalid Braze Action.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$5() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$6() {
        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$7() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$8() {
        return "Creating view wrapper for immersive in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$9() {
        return "Creating view wrapper for base in-app message.";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:58|(1:59)|(7:112|113|114|115|116|117|118)(4:61|62|63|(5:65|66|67|68|69)(16:93|94|95|96|97|98|99|100|101|72|73|(3:75|76|77)(2:86|(1:88))|78|(1:82)|83|84))|70|72|73|(0)(0)|78|(2:80|82)|83|84) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024f A[Catch: all -> 0x026b, TRY_LEAVE, TryCatch #6 {all -> 0x026b, blocks: (B:73:0x0249, B:75:0x024f), top: B:72:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026f  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object displayInAppMessage$suspendImpl(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, boolean z10, Continuation<? super Unit> continuation) {
        Throwable th2;
        BrazeInAppMessageManager brazeInAppMessageManager2;
        final Activity activity;
        BrazeInAppMessageManager brazeInAppMessageManager3;
        BrazeLogger brazeLogger;
        IInAppMessageViewWrapper createInAppMessageViewWrapper;
        View view;
        final IInAppMessageViewWrapper iInAppMessageViewWrapper;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView;
        final BrazeInAppMessageManager brazeInAppMessageManager4;
        BrazeInAppMessageManager brazeInAppMessageManager5;
        final IInAppMessage iInAppMessage2 = iInAppMessage;
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeInAppMessageManager brazeInAppMessageManager6 = brazeInAppMessageManager;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: k4.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String displayInAppMessage$lambda$0;
                displayInAppMessage$lambda$0 = BrazeInAppMessageManager.displayInAppMessage$lambda$0(IInAppMessage.this);
                return displayInAppMessage$lambda$0;
            }
        }, 6, (Object) null);
        if (!brazeInAppMessageManager6.displayingInAppMessage.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String displayInAppMessage$lambda$1;
                    displayInAppMessage$lambda$1 = BrazeInAppMessageManager.displayInAppMessage$lambda$1();
                    return displayInAppMessage$lambda$1;
                }
            }, 7, (Object) null);
            brazeInAppMessageManager6.inAppMessageStack.push(iInAppMessage2);
            return Unit.INSTANCE;
        }
        try {
            WeakReference<Activity> weakReference = brazeInAppMessageManager6.mActivity;
            activity = weakReference != null ? weakReference.get() : null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (activity == null) {
            brazeInAppMessageManager6.carryoverInAppMessage = iInAppMessage2;
            throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
        }
        long expirationTimestamp = iInAppMessage2.getExpirationTimestamp();
        if (expirationTimestamp > 0) {
            long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
            if (nowInMilliseconds > expirationTimestamp) {
                throw new Exception("In-app message is expired. Doing nothing. Expiration: " + expirationTimestamp + ". Current time: " + nowInMilliseconds);
            }
        } else {
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String displayInAppMessage$lambda$2;
                    displayInAppMessage$lambda$2 = BrazeInAppMessageManager.displayInAppMessage$lambda$2();
                    return displayInAppMessage$lambda$2;
                }
            }, 7, (Object) null);
        }
        if (!brazeInAppMessageManager.verifyOrientationStatus(iInAppMessage)) {
            throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
        }
        BrazeConfigurationProvider brazeConfigurationProvider = brazeInAppMessageManager6.configurationProvider;
        if (brazeConfigurationProvider == null) {
            throw new Exception("configurationProvider is null. The in-app message will not be displayed and will not beput back on the stack.");
        }
        if (!brazeInAppMessageManager6.isInAppMessageForTheSameUser(iInAppMessage2, brazeInAppMessageManager6.currentUserId)) {
            String str = brazeInAppMessageManager6.currentUserId;
            InAppMessageEvent inAppMessageEvent = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage2);
            throw new Exception("The last identified user '" + str + "' does not match the incoming in-app message's user '" + (inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null) + "'. The in-app message will not be displayed and will not be put back on the stack.");
        }
        if (iInAppMessage2.isControl()) {
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String displayInAppMessage$lambda$3;
                    displayInAppMessage$lambda$3 = BrazeInAppMessageManager.displayInAppMessage$lambda$3();
                    return displayInAppMessage$lambda$3;
                }
            }, 7, (Object) null);
            iInAppMessage2.logImpression();
            brazeInAppMessageManager6.resetAfterInAppMessageClose();
            return Unit.INSTANCE;
        }
        try {
        } catch (Throwable th4) {
            th = th4;
            brazeInAppMessageManager6 = brazeInAppMessageManager;
        }
        if (BrazeActionUtils.containsInvalidBrazeAction(iInAppMessage2)) {
            InAppMessageEvent inAppMessageEvent2 = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage2);
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29471I;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, priority, (Throwable) null, false, new Function0() { // from class: k4.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String displayInAppMessage$lambda$4;
                    displayInAppMessage$lambda$4 = BrazeInAppMessageManager.displayInAppMessage$lambda$4();
                    return displayInAppMessage$lambda$4;
                }
            }, 6, (Object) null);
            if (inAppMessageEvent2 != null) {
                brazeInAppMessageManager5 = brazeInAppMessageManager;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager5, priority, (Throwable) null, false, new Function0() { // from class: k4.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$5;
                        displayInAppMessage$lambda$5 = BrazeInAppMessageManager.displayInAppMessage$lambda$5();
                        return displayInAppMessage$lambda$5;
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
        if (INSTANCE.containsPushPermissionPrompt(iInAppMessage2) && !PermissionUtils.wouldPushPermissionPromptDisplay(activity)) {
            InAppMessageEvent inAppMessageEvent3 = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage2);
            BrazeLogger.Priority priority2 = BrazeLogger.Priority.f29471I;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, priority2, (Throwable) null, false, new Function0() { // from class: k4.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String displayInAppMessage$lambda$6;
                    displayInAppMessage$lambda$6 = BrazeInAppMessageManager.displayInAppMessage$lambda$6();
                    return displayInAppMessage$lambda$6;
                }
            }, 6, (Object) null);
            if (inAppMessageEvent3 != null) {
                BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager, priority2, (Throwable) null, false, new Function0() { // from class: k4.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$7;
                        displayInAppMessage$lambda$7 = BrazeInAppMessageManager.displayInAppMessage$lambda$7();
                        return displayInAppMessage$lambda$7;
                    }
                }, 6, (Object) null);
                Context applicationContext2 = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                BrazeInternal.retryInAppMessage(applicationContext2, inAppMessageEvent3);
            }
            brazeInAppMessageManager.resetAfterInAppMessageClose();
            return Unit.INSTANCE;
        }
        IInAppMessageViewFactory inAppMessageViewFactory = brazeInAppMessageManager.getInAppMessageViewFactory(iInAppMessage);
        if (inAppMessageViewFactory == null) {
            throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
        }
        ?? createInAppMessageView = inAppMessageViewFactory.createInAppMessageView(activity, iInAppMessage2);
        if (createInAppMessageView == 0) {
            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
        }
        if (createInAppMessageView.getParent() != null) {
            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
        }
        Animation openingAnimation = brazeInAppMessageManager.getInAppMessageAnimationFactory().getOpeningAnimation(iInAppMessage2);
        Animation closingAnimation = brazeInAppMessageManager.getInAppMessageAnimationFactory().getClosingAnimation(iInAppMessage2);
        ?? inAppMessageViewWrapperFactory = brazeInAppMessageManager.getInAppMessageViewWrapperFactory();
        ?? r12 = createInAppMessageView instanceof IInAppMessageImmersiveView;
        try {
            try {
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            brazeInAppMessageManager6 = r12;
        }
        if (r12 != 0) {
            try {
                BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$8;
                        displayInAppMessage$lambda$8 = BrazeInAppMessageManager.displayInAppMessage$lambda$8();
                        return displayInAppMessage$lambda$8;
                    }
                }, 7, (Object) null);
                brazeLogger = brazeLogger2;
                brazeInAppMessageManager3 = brazeInAppMessageManager;
                IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) createInAppMessageView;
                Intrinsics.checkNotNull(iInAppMessage2, "null cannot be cast to non-null type com.braze.models.inappmessage.InAppMessageImmersiveBase");
                View view2 = createInAppMessageView;
                createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(view2, iInAppMessage2, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(((InAppMessageImmersiveBase) iInAppMessage2).getMessageButtons().size()), iInAppMessageImmersiveView.getMessageCloseButtonView());
                view = view2;
                r12 = view2;
            } catch (Throwable th7) {
                th = th7;
                brazeInAppMessageManager3 = brazeInAppMessageManager;
                iInAppMessage2 = iInAppMessage;
                th2 = th;
                brazeInAppMessageManager2 = brazeInAppMessageManager3;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: k4.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$13;
                        displayInAppMessage$lambda$13 = BrazeInAppMessageManager.displayInAppMessage$lambda$13(IInAppMessage.this);
                        return displayInAppMessage$lambda$13;
                    }
                }, 4, (Object) null);
                brazeInAppMessageManager.resetAfterInAppMessageClose();
                return Unit.INSTANCE;
            }
        } else {
            brazeInAppMessageManager3 = brazeInAppMessageManager;
            brazeLogger = brazeLogger2;
            try {
            } catch (Throwable th8) {
                th = th8;
                iInAppMessage2 = iInAppMessage;
            }
            if (!(createInAppMessageView instanceof IInAppMessageView)) {
                BrazeInAppMessageManager brazeInAppMessageManager7 = brazeInAppMessageManager3;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager7, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String displayInAppMessage$lambda$10;
                            displayInAppMessage$lambda$10 = BrazeInAppMessageManager.displayInAppMessage$lambda$10();
                            return displayInAppMessage$lambda$10;
                        }
                    }, 7, (Object) null);
                } catch (Throwable th9) {
                    th = th9;
                    brazeInAppMessageManager6 = brazeInAppMessageManager7;
                    iInAppMessage2 = iInAppMessage;
                    th2 = th;
                    brazeInAppMessageManager2 = brazeInAppMessageManager6;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: k4.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String displayInAppMessage$lambda$13;
                            displayInAppMessage$lambda$13 = BrazeInAppMessageManager.displayInAppMessage$lambda$13(IInAppMessage.this);
                            return displayInAppMessage$lambda$13;
                        }
                    }, 4, (Object) null);
                    brazeInAppMessageManager.resetAfterInAppMessageClose();
                    return Unit.INSTANCE;
                }
                try {
                    IInAppMessageViewWrapper createInAppMessageViewWrapper2 = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(createInAppMessageView, iInAppMessage, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, createInAppMessageView);
                    inAppMessageHtmlBaseView = createInAppMessageView;
                    iInAppMessage2 = iInAppMessage;
                    iInAppMessageViewWrapper = createInAppMessageViewWrapper2;
                    brazeInAppMessageManager3.inAppMessageViewWrapper = iInAppMessageViewWrapper;
                    if (inAppMessageHtmlBaseView instanceof InAppMessageHtmlBaseView) {
                        brazeInAppMessageManager4 = brazeInAppMessageManager3;
                        if (iInAppMessageViewWrapper != null) {
                            iInAppMessageViewWrapper.open(activity);
                        }
                    } else {
                        brazeInAppMessageManager4 = brazeInAppMessageManager3;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager4, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String displayInAppMessage$lambda$11;
                                displayInAppMessage$lambda$11 = BrazeInAppMessageManager.displayInAppMessage$lambda$11();
                                return displayInAppMessage$lambda$11;
                            }
                        }, 7, (Object) null);
                        inAppMessageHtmlBaseView.setHtmlPageFinishedListener(new IWebViewClientStateListener() { // from class: k4.r
                            @Override // com.braze.ui.inappmessage.listeners.IWebViewClientStateListener
                            public final void onPageFinished() {
                                BrazeInAppMessageManager.displayInAppMessage$lambda$12(IInAppMessageViewWrapper.this, brazeInAppMessageManager4, activity);
                            }
                        });
                    }
                    if ((inAppMessageHtmlBaseView instanceof InAppMessageFullView) && Build.VERSION.SDK_INT >= 34) {
                        brazeInAppMessageManager4.currentBackEventHandler = new InAppMessageBackEventHandler(activity, (IInAppMessageBackEventListener) inAppMessageHtmlBaseView);
                    }
                } catch (Throwable th10) {
                    th = th10;
                    iInAppMessage2 = iInAppMessage;
                    brazeInAppMessageManager6 = brazeInAppMessageManager3;
                    th2 = th;
                    brazeInAppMessageManager2 = brazeInAppMessageManager6;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: k4.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String displayInAppMessage$lambda$13;
                            displayInAppMessage$lambda$13 = BrazeInAppMessageManager.displayInAppMessage$lambda$13(IInAppMessage.this);
                            return displayInAppMessage$lambda$13;
                        }
                    }, 4, (Object) null);
                    brazeInAppMessageManager.resetAfterInAppMessageClose();
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String displayInAppMessage$lambda$9;
                    displayInAppMessage$lambda$9 = BrazeInAppMessageManager.displayInAppMessage$lambda$9();
                    return displayInAppMessage$lambda$9;
                }
            }, 7, (Object) null);
            View view3 = createInAppMessageView;
            createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(view3, iInAppMessage, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, ((IInAppMessageView) createInAppMessageView).getMessageClickableView());
            view = view3;
            r12 = view3;
        }
        iInAppMessageViewWrapper = createInAppMessageViewWrapper;
        inAppMessageHtmlBaseView = view;
        iInAppMessage2 = iInAppMessage;
        brazeInAppMessageManager3.inAppMessageViewWrapper = iInAppMessageViewWrapper;
        if (inAppMessageHtmlBaseView instanceof InAppMessageHtmlBaseView) {
        }
        if (inAppMessageHtmlBaseView instanceof InAppMessageFullView) {
            brazeInAppMessageManager4.currentBackEventHandler = new InAppMessageBackEventHandler(activity, (IInAppMessageBackEventListener) inAppMessageHtmlBaseView);
        }
        return Unit.INSTANCE;
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
    public static final String pauseWebviewIfNecessary$lambda$0() {
        return "Pausing InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$0() {
        return "Null Activity passed to registerInAppMessageManager. Doing nothing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$1(Activity activity) {
        return "Registering InAppMessageManager with activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$2() {
        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$4$0() {
        return "Requesting display of carryover in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$5$0() {
        return "Adding previously unregistered in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$7() {
        return "Error while calling attempting to register the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$0() {
        return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$1() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$10() {
        return "Error running requestDisplayInAppMessage";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$2() {
        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$3() {
        return "The in-app message stack is empty. No in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$4() {
        return "Using the control in-app message manager listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$5() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$6() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$7() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$8() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$9(IInAppMessage iInAppMessage) {
        return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$0() {
        return "Resetting after in-app message close.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$1(Integer num) {
        return "Setting requested orientation to original orientation " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resumeWebviewIfNecessary$lambda$0() {
        return "Resuming InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$0(Activity activity) {
        return "Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: " + (activity != null ? activity.getLocalClassName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$1() {
        return "Null Activity passed to unregisterInAppMessageManager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$2(Activity activity) {
        return "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$3() {
        return "In-app message view includes HTML. Removing the page finished listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$4() {
        return "Error while calling attempting to unregister the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$0() {
        return "Cannot verify orientation status with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$1() {
        return "Running on tablet. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$2() {
        return "Any orientation specified. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$3() {
        return "Requesting orientation lock.";
    }

    public void addInAppMessage(@Nullable IInAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.inAppMessageStack.push(inAppMessage);
            requestDisplayInAppMessage();
        }
    }

    @NotNull
    public final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber$android_sdk_ui_release() {
        return new IEventSubscriber() { // from class: k4.U
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0(BrazeInAppMessageManager.this, (BrazeUserChangeEvent) obj);
            }
        };
    }

    @Nullable
    public Object displayInAppMessage(@NotNull IInAppMessage iInAppMessage, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        return displayInAppMessage$suspendImpl(this, iInAppMessage, z10, continuation);
    }

    public void ensureSubscribedToInAppMessageEvents(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$0;
                    ensureSubscribedToInAppMessageEvents$lambda$0 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$0();
                    return ensureSubscribedToInAppMessageEvents$lambda$0;
                }
            }, 7, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String ensureSubscribedToInAppMessageEvents$lambda$1;
                ensureSubscribedToInAppMessageEvents$lambda$1 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1();
                return ensureSubscribedToInAppMessageEvents$lambda$1;
            }
        }, 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(context).subscribeToNewInAppMessages(createInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = createInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: k4.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$3;
                    ensureSubscribedToInAppMessageEvents$lambda$3 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$3();
                    return ensureSubscribedToInAppMessageEvents$lambda$3;
                }
            }, 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.I
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String ensureSubscribedToInAppMessageEvents$lambda$4;
                ensureSubscribedToInAppMessageEvents$lambda$4 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$4();
                return ensureSubscribedToInAppMessageEvents$lambda$4;
            }
        }, 6, (Object) null);
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber = new IEventSubscriber() { // from class: k4.J
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager.this, (SdkDataWipeEvent) obj);
            }
        };
        companion.getInstance(context).addSingleSynchronousSubscription(iEventSubscriber, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$7;
                    ensureSubscribedToInAppMessageEvents$lambda$7 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$7();
                    return ensureSubscribedToInAppMessageEvents$lambda$7;
                }
            }, 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber$android_sdk_ui_release = createBrazeUserChangeEventSubscriber$android_sdk_ui_release();
        companion.getInstance(context).subscribeToChangeUserEvents(createBrazeUserChangeEventSubscriber$android_sdk_ui_release);
        this.brazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber$android_sdk_ui_release;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean dismissed) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (dismissed) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                iInAppMessageViewWrapper.close();
            } else {
                AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, C1452g0.c(), null, new BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1(iInAppMessageViewWrapper, null), 2, null);
            }
        }
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public boolean isInAppMessageForTheSameUser(@Nullable IInAppMessage inAppMessage, @Nullable String currentUserId) {
        if (inAppMessage != null && currentUserId != null) {
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
            String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
            if (userId != null && !Intrinsics.areEqual(userId, currentUserId)) {
                return false;
            }
        }
        return true;
    }

    public final void pauseWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String pauseWebviewIfNecessary$lambda$0;
                pauseWebviewIfNecessary$lambda$0 = BrazeInAppMessageManager.pauseWebviewIfNecessary$lambda$0();
                return pauseWebviewIfNecessary$lambda$0;
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

    public void registerInAppMessageManager(@Nullable final Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: k4.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerInAppMessageManager$lambda$0;
                        registerInAppMessageManager$lambda$0 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$0();
                        return registerInAppMessageManager$lambda$0;
                    }
                }, 6, (Object) null);
                return;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: k4.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerInAppMessageManager$lambda$1;
                    registerInAppMessageManager$lambda$1 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$1(activity);
                    return registerInAppMessageManager$lambda$1;
                }
            }, 6, (Object) null);
            this.mActivity = new WeakReference<>(activity);
            if (this.mApplicationContext == null) {
                Context applicationContext = activity.getApplicationContext();
                this.mApplicationContext = applicationContext;
                if (applicationContext == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: k4.c0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$2;
                            registerInAppMessageManager$lambda$2 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$2();
                            return registerInAppMessageManager$lambda$2;
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
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$4$0;
                            registerInAppMessageManager$lambda$4$0 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$4$0();
                            return registerInAppMessageManager$lambda$4$0;
                        }
                    }, 7, (Object) null);
                    iInAppMessage.setAnimateIn(false);
                    AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, C1452g0.c(), null, new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this, iInAppMessage, null), 2, null);
                }
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.e0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$5$0;
                            registerInAppMessageManager$lambda$5$0 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$5$0();
                            return registerInAppMessageManager$lambda$5$0;
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
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: k4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerInAppMessageManager$lambda$7;
                    registerInAppMessageManager$lambda$7 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$7();
                    return registerInAppMessageManager$lambda$7;
                }
            }, 4, (Object) null);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation beforeInAppMessageDisplayed;
        try {
            WeakReference<Activity> weakReference = this.mActivity;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestDisplayInAppMessage$lambda$1;
                            requestDisplayInAppMessage$lambda$1 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$1();
                            return requestDisplayInAppMessage$lambda$1;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: k4.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestDisplayInAppMessage$lambda$0;
                            requestDisplayInAppMessage$lambda$0 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$0();
                            return requestDisplayInAppMessage$lambda$0;
                        }
                    }, 6, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                }
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$2;
                        requestDisplayInAppMessage$lambda$2 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$2();
                        return requestDisplayInAppMessage$lambda$2;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$3;
                        requestDisplayInAppMessage$lambda$3 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$3();
                        return requestDisplayInAppMessage$lambda$3;
                    }
                }, 7, (Object) null);
                return false;
            }
            final IInAppMessage pop = this.inAppMessageStack.pop();
            if (pop.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$4;
                        requestDisplayInAppMessage$lambda$4 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$4();
                        return requestDisplayInAppMessage$lambda$4;
                    }
                }, 7, (Object) null);
                IInAppMessageManagerListener controlInAppMessageManagerListener = getControlInAppMessageManagerListener();
                Intrinsics.checkNotNull(pop);
                beforeInAppMessageDisplayed = controlInAppMessageManagerListener.beforeInAppMessageDisplayed(pop);
            } else {
                IInAppMessageManagerListener inAppMessageManagerListener = getInAppMessageManagerListener();
                Intrinsics.checkNotNull(pop);
                beforeInAppMessageDisplayed = inAppMessageManagerListener.beforeInAppMessageDisplayed(pop);
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[beforeInAppMessageDisplayed.ordinal()];
            if (i10 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$5;
                        requestDisplayInAppMessage$lambda$5 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$5();
                        return requestDisplayInAppMessage$lambda$5;
                    }
                }, 7, (Object) null);
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(pop);
                return true;
            }
            if (i10 == 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$6;
                        requestDisplayInAppMessage$lambda$6 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$6();
                        return requestDisplayInAppMessage$lambda$6;
                    }
                }, 7, (Object) null);
                this.inAppMessageStack.push(pop);
                return false;
            }
            if (i10 == 3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$7;
                        requestDisplayInAppMessage$lambda$7 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$7();
                        return requestDisplayInAppMessage$lambda$7;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(pop);
            if (inAppMessageEvent != null) {
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$8;
                        requestDisplayInAppMessage$lambda$8 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$8();
                        return requestDisplayInAppMessage$lambda$8;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$9;
                        requestDisplayInAppMessage$lambda$9 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$9(IInAppMessage.this);
                        return requestDisplayInAppMessage$lambda$9;
                    }
                }, 7, (Object) null);
            }
            return false;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: k4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestDisplayInAppMessage$lambda$10;
                    requestDisplayInAppMessage$lambda$10 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$10();
                    return requestDisplayInAppMessage$lambda$10;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: k4.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetAfterInAppMessageClose$lambda$0;
                resetAfterInAppMessageClose$lambda$0 = BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$0();
                return resetAfterInAppMessageClose$lambda$0;
            }
        }, 6, (Object) null);
        InAppMessageBackEventHandler inAppMessageBackEventHandler = this.currentBackEventHandler;
        if (inAppMessageBackEventHandler != null) {
            inAppMessageBackEventHandler.unregister();
        }
        this.currentBackEventHandler = null;
        this.inAppMessageViewWrapper = null;
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        final Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetAfterInAppMessageClose$lambda$1;
                resetAfterInAppMessageClose$lambda$1 = BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$1(num);
                return resetAfterInAppMessageClose$lambda$1;
            }
        }, 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    public final void resumeWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resumeWebviewIfNecessary$lambda$0;
                resumeWebviewIfNecessary$lambda$0 = BrazeInAppMessageManager.resumeWebviewIfNecessary$lambda$0();
                return resumeWebviewIfNecessary$lambda$0;
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

    public void unregisterInAppMessageManager(@Nullable final Activity activity) {
        IInAppMessage inAppMessage;
        try {
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$0;
                        unregisterInAppMessageManager$lambda$0 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$0(activity);
                        return unregisterInAppMessageManager$lambda$0;
                    }
                }, 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
                return;
            }
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: k4.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$1;
                        unregisterInAppMessageManager$lambda$1 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$1();
                        return unregisterInAppMessageManager$lambda$1;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: k4.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$2;
                        unregisterInAppMessageManager$lambda$2 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$2(activity);
                        return unregisterInAppMessageManager$lambda$2;
                    }
                }, 6, (Object) null);
            }
            IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
            if (iInAppMessageViewWrapper != null) {
                View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
                if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String unregisterInAppMessageManager$lambda$3;
                            unregisterInAppMessageManager$lambda$3 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$3();
                            return unregisterInAppMessageManager$lambda$3;
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
                InAppMessageBackEventHandler inAppMessageBackEventHandler = this.currentBackEventHandler;
                if (inAppMessageBackEventHandler != null) {
                    inAppMessageBackEventHandler.unregister();
                }
                this.currentBackEventHandler = null;
                this.inAppMessageViewWrapper = null;
            } else {
                this.carryoverInAppMessage = null;
            }
            this.mActivity = null;
            this.displayingInAppMessage.set(false);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: k4.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterInAppMessageManager$lambda$4;
                    unregisterInAppMessageManager$lambda$4 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$4();
                    return unregisterInAppMessageManager$lambda$4;
                }
            }, 4, (Object) null);
        }
    }

    @SuppressLint({"InlinedApi"})
    public boolean verifyOrientationStatus(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: k4.O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$0;
                    verifyOrientationStatus$lambda$0 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$0();
                    return verifyOrientationStatus$lambda$0;
                }
            }, 6, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.P
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$1;
                    verifyOrientationStatus$lambda$1 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$1();
                    return verifyOrientationStatus$lambda$1;
                }
            }, 7, (Object) null);
        } else {
            if (orientation != Orientation.ANY) {
                if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                    return false;
                }
                if (this.originalOrientation == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.S
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String verifyOrientationStatus$lambda$3;
                            verifyOrientationStatus$lambda$3 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$3();
                            return verifyOrientationStatus$lambda$3;
                        }
                    }, 7, (Object) null);
                    this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                    ViewUtils.setActivityRequestedOrientation(activity, 14);
                }
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$2;
                    verifyOrientationStatus$lambda$2 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$2();
                    return verifyOrientationStatus$lambda$2;
                }
            }, 7, (Object) null);
        }
        return true;
    }
}
