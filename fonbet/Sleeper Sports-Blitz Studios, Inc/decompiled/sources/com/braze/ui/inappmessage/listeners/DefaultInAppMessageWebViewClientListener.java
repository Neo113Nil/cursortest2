package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DefaultInAppMessageWebViewClientListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "<init>", "()V", "inAppMessageManager", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "onCloseAction", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "url", "", "queryBundle", "Landroid/os/Bundle;", "onCustomEventAction", "onOtherUrlAction", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
        INSTANCE.logHtmlInAppMessageClick(iInAppMessage, bundle);
    }

    @JvmStatic
    public static final boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
        return INSTANCE.parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onCloseAction called.";
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCloseAction$lambda$0;
                onCloseAction$lambda$0 = DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$0();
                return onCloseAction$lambda$0;
            }
        }, 7, (Object) null);
        INSTANCE.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(inAppMessage, url, queryBundle);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCloseAction$lambda$1;
                onCloseAction$lambda$1 = DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$1();
                return onCloseAction$lambda$1;
            }
        }, 7, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$1() {
        return "IInAppMessageWebViewClientListener.onCloseAction finished.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$2() {
        return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCustomEventAction$lambda$2;
                onCustomEventAction$lambda$2 = DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$2();
                return onCustomEventAction$lambda$2;
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCustomEventAction$lambda$3;
                    onCustomEventAction$lambda$3 = DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$3();
                    return onCustomEventAction$lambda$3;
                }
            }, 6, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(inAppMessage, url, queryBundle)) {
            return;
        }
        String parseCustomEventNameFromQueryBundle = BrazeWebViewClient.INSTANCE.parseCustomEventNameFromQueryBundle(queryBundle);
        String str = parseCustomEventNameFromQueryBundle;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        BrazeProperties parsePropertiesFromQueryBundle = BrazeWebViewClient.INSTANCE.parsePropertiesFromQueryBundle(queryBundle);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            Braze.INSTANCE.getInstance(activity).logCustomEvent(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$3() {
        return "Can't perform custom event action because the activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$5() {
        return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage inAppMessage, final String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onOtherUrlAction$lambda$5;
                onOtherUrlAction$lambda$5 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$5();
                return onOtherUrlAction$lambda$5;
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$6;
                    onOtherUrlAction$lambda$6 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$6(url);
                    return onOtherUrlAction$lambda$6;
                }
            }, 6, (Object) null);
            return;
        }
        Companion companion = INSTANCE;
        companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(inAppMessage, url, queryBundle)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$7;
                    onOtherUrlAction$lambda$7 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$7(url);
                    return onOtherUrlAction$lambda$7;
                }
            }, 6, (Object) null);
            return;
        }
        boolean parseUseWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(inAppMessage, queryBundle);
        Bundle bundle = BundleUtils.toBundle(inAppMessage.getExtras());
        bundle.putAll(queryBundle);
        UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (createUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$8;
                    onOtherUrlAction$lambda$8 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$8(url);
                    return onOtherUrlAction$lambda$8;
                }
            }, 6, (Object) null);
            return;
        }
        final Uri uri = createUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$9;
                    onOtherUrlAction$lambda$9 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$9(uri, url);
                    return onOtherUrlAction$lambda$9;
                }
            }, 6, (Object) null);
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(activity, createUriActionFromUrlString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$6(String str) {
        return "Can't perform other url action because the cached activity is null. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$7(String str) {
        return "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$8(String str) {
        return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$9(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str;
    }

    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener$Companion;", "", "<init>", "()V", "parseUseWebViewFromQueryBundle", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "queryBundle", "Landroid/os/Bundle;", "logHtmlInAppMessageClick", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean parseUseWebViewFromQueryBundle(IInAppMessage inAppMessage, Bundle queryBundle) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            if (queryBundle.containsKey(BrazeWebViewClient.QUERY_NAME_DEEPLINK)) {
                z = Boolean.parseBoolean(queryBundle.getString(BrazeWebViewClient.QUERY_NAME_DEEPLINK));
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (queryBundle.containsKey(BrazeWebViewClient.QUERY_NAME_EXTERNAL_OPEN)) {
                z3 = Boolean.parseBoolean(queryBundle.getString(BrazeWebViewClient.QUERY_NAME_EXTERNAL_OPEN));
                z2 = true;
            } else {
                z3 = false;
            }
            return z2 ? (z || z3) ? false : true : inAppMessage.getOpenUriInWebView();
        }

        @JvmStatic
        public final void logHtmlInAppMessageClick(IInAppMessage inAppMessage, Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            if (queryBundle.containsKey(BrazeWebViewClient.QUERY_NAME_BUTTON_ID)) {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) inAppMessage;
                String string = queryBundle.getString(BrazeWebViewClient.QUERY_NAME_BUTTON_ID);
                if (string != null) {
                    iInAppMessageHtml.logButtonClick(string);
                    return;
                }
                return;
            }
            if (inAppMessage.getMessageType() == MessageType.HTML_FULL) {
                inAppMessage.logClick();
            }
        }
    }
}
