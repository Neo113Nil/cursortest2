package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageCloser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J2\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010 \u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\bH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006#"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageViewLifecycleListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "()V", "inAppMessageManager", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "afterClosed", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "afterOpened", "inAppMessageView", "Landroid/view/View;", "beforeClosed", "beforeOpened", "onButtonClicked", "inAppMessageCloser", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "messageButton", "Lcom/braze/models/inappmessage/MessageButton;", "inAppMessageImmersive", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "onClicked", "onDismissed", "performClickAction", "clickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "clickUri", "Landroid/net/Uri;", "openUriInWebview", "", "performInAppMessageButtonClicked", "performInAppMessageClicked", "startClearHtmlInAppMessageAssetsThread", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class DefaultInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {

    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickAction.values().length];
            iArr[ClickAction.NEWS_FEED.ordinal()] = 1;
            iArr[ClickAction.URI.ordinal()] = 2;
            iArr[ClickAction.NONE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$beforeOpened$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.beforeOpened called.";
            }
        }, 3, (Object) null);
        inAppMessage.logImpression();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$afterOpened$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.afterOpened called.";
            }
        }, 3, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewOpened(inAppMessageView, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewClosed(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$beforeClosed$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.beforeClosed called.";
            }
        }, 3, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterClosed(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$afterClosed$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.afterClosed called.";
            }
        }, 3, (Object) null);
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (inAppMessage instanceof IInAppMessageHtml) {
            startClearHtmlInAppMessageAssetsThread();
        }
        inAppMessage.onAfterClosed();
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewClosed(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onClicked(InAppMessageCloser inAppMessageCloser, View inAppMessageView, IInAppMessage inAppMessage) {
        boolean onInAppMessageClicked;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onClicked$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onClicked called.";
            }
        }, 3, (Object) null);
        inAppMessage.logClick();
        try {
            onInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage, inAppMessageCloser);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Deprecated onInAppMessageClicked(inAppMessage, inAppMessageCloser) called.";
                }
            }, 3, (Object) null);
        } catch (BrazeFunctionNotImplemented unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Using non-deprecated onInAppMessageClicked(inAppMessage)";
                }
            }, 3, (Object) null);
            onInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage);
        }
        if (onInAppMessageClicked) {
            return;
        }
        performInAppMessageClicked(inAppMessage, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onButtonClicked(InAppMessageCloser inAppMessageCloser, MessageButton messageButton, IInAppMessageImmersive inAppMessageImmersive) {
        boolean onInAppMessageButtonClicked;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        Intrinsics.checkNotNullParameter(inAppMessageImmersive, "inAppMessageImmersive");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onButtonClicked$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
            }
        }, 3, (Object) null);
        inAppMessageImmersive.logButtonClick(messageButton);
        try {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton, inAppMessageCloser);
        } catch (BrazeFunctionNotImplemented unused) {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton);
        }
        if (onInAppMessageButtonClicked) {
            return;
        }
        performInAppMessageButtonClicked(messageButton, inAppMessageImmersive, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onDismissed(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onDismissed$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onDismissed called.";
            }
        }, 3, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(inAppMessage);
    }

    private final void performInAppMessageButtonClicked(MessageButton messageButton, IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(messageButton.getClickAction(), inAppMessage, inAppMessageCloser, messageButton.getUri(), messageButton.getOpenUriInWebview());
    }

    private final void performInAppMessageClicked(IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(inAppMessage.getInternalClickAction(), inAppMessage, inAppMessageCloser, inAppMessage.getInternalUri(), inAppMessage.getOpenUriInWebView());
    }

    private final void performClickAction(ClickAction clickAction, IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser, Uri clickUri, boolean openUriInWebview) {
        Activity activity = getInAppMessageManager().getMActivity();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$performClickAction$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Can't perform click action because the cached activity is null.";
                }
            }, 2, (Object) null);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[clickAction.ordinal()];
        if (i == 1) {
            inAppMessageCloser.close(false);
            BrazeDeeplinkHandler.INSTANCE.getInstance().gotoNewsFeed(activity, new NewsfeedAction(BundleUtils.toBundle(inAppMessage.getExtras()), Channel.INAPP_MESSAGE));
            return;
        }
        if (i != 2) {
            if (i == 3) {
                inAppMessageCloser.close(inAppMessage.getAnimateOut());
                return;
            } else {
                inAppMessageCloser.close(false);
                return;
            }
        }
        inAppMessageCloser.close(false);
        if (clickUri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$performClickAction$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "clickUri is null, not performing click action";
                }
            }, 3, (Object) null);
            return;
        }
        UriAction createUriActionFromUri = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUri(clickUri, BundleUtils.toBundle(inAppMessage.getExtras()), openUriInWebview, Channel.INAPP_MESSAGE);
        Context applicationContext = getInAppMessageManager().getMApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$performClickAction$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "appContext is null, not performing click action";
                }
            }, 3, (Object) null);
        } else {
            BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(applicationContext, createUriActionFromUri);
        }
    }

    private final void startClearHtmlInAppMessageAssetsThread() {
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(null), 3, null);
    }
}
