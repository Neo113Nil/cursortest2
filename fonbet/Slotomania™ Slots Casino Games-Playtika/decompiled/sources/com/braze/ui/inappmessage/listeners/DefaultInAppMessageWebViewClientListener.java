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
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DefaultInAppMessageWebViewClientListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "()V", "inAppMessageManager", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "onCloseAction", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "url", "", "queryBundle", "Landroid/os/Bundle;", "onCustomEventAction", "onNewsfeedAction", "onOtherUrlAction", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY = "name";

    @JvmStatic
    public static final void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
        INSTANCE.logHtmlInAppMessageClick(iInAppMessage, bundle);
    }

    @JvmStatic
    public static final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return INSTANCE.parseCustomEventNameFromQueryBundle(bundle);
    }

    @JvmStatic
    public static final BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
        return INSTANCE.parsePropertiesFromQueryBundle(bundle);
    }

    @JvmStatic
    public static final boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
        return INSTANCE.parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onCloseAction$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCloseAction called.";
            }
        }, 3, (Object) null);
        INSTANCE.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(inAppMessage, url, queryBundle);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onNewsfeedAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onNewsfeedAction$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onNewsfeedAction called.";
            }
        }, 3, (Object) null);
        if (getInAppMessageManager().getMActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onNewsfeedAction$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Can't perform news feed action because the cached activity is null.";
                }
            }, 2, (Object) null);
            return;
        }
        INSTANCE.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(inAppMessage, url, queryBundle)) {
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        NewsfeedAction newsfeedAction = new NewsfeedAction(BundleUtils.toBundle(inAppMessage.getExtras()), Channel.INAPP_MESSAGE);
        Activity activity = getInAppMessageManager().getMActivity();
        if (activity == null) {
            return;
        }
        BrazeDeeplinkHandler.INSTANCE.getInstance().gotoNewsFeed(activity, newsfeedAction);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onCustomEventAction$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
            }
        }, 3, (Object) null);
        if (getInAppMessageManager().getMActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onCustomEventAction$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Can't perform custom event action because the activity is null.";
                }
            }, 2, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(inAppMessage, url, queryBundle)) {
            return;
        }
        Companion companion = INSTANCE;
        String parseCustomEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(queryBundle);
        String str = parseCustomEventNameFromQueryBundle;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        BrazeProperties parsePropertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(queryBundle);
        Activity activity = getInAppMessageManager().getMActivity();
        if (activity == null) {
            return;
        }
        Braze.INSTANCE.getInstance(activity).logCustomEvent(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage inAppMessage, final String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onOtherUrlAction$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
            }
        }, 3, (Object) null);
        if (getInAppMessageManager().getMActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onOtherUrlAction$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Can't perform other url action because the cached activity is null. Url: ", url);
                }
            }, 2, (Object) null);
            return;
        }
        Companion companion = INSTANCE;
        companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(inAppMessage, url, queryBundle)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onOtherUrlAction$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: ", url);
                }
            }, 2, (Object) null);
            return;
        }
        boolean parseUseWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(inAppMessage, queryBundle);
        Bundle bundle = BundleUtils.toBundle(inAppMessage.getExtras());
        bundle.putAll(queryBundle);
        UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (createUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onOtherUrlAction$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: ", url);
                }
            }, 2, (Object) null);
            return;
        }
        final Uri uri = createUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener$onOtherUrlAction$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + url;
                }
            }, 2, (Object) null);
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getMActivity();
        if (activity == null) {
            return;
        }
        BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(activity, createUriActionFromUrlString);
    }

    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener$Companion;", "", "()V", "HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY", "", "logHtmlInAppMessageClick", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "queryBundle", "Landroid/os/Bundle;", "parseCustomEventNameFromQueryBundle", "parsePropertiesFromQueryBundle", "Lcom/braze/models/outgoing/BrazeProperties;", "parseUseWebViewFromQueryBundle", "", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
            if (queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK)) {
                z = Boolean.parseBoolean(queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK));
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN)) {
                z3 = Boolean.parseBoolean(queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN));
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
            if (queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID)) {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) inAppMessage;
                String string = queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID);
                if (string == null) {
                    return;
                }
                iInAppMessageHtml.logButtonClick(string);
                return;
            }
            if (inAppMessage.getMessageType() == MessageType.HTML_FULL) {
                inAppMessage.logClick();
            }
        }

        @JvmStatic
        public final String parseCustomEventNameFromQueryBundle(Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            return queryBundle.getString("name");
        }

        @JvmStatic
        public final BrazeProperties parsePropertiesFromQueryBundle(Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String key : queryBundle.keySet()) {
                if (!Intrinsics.areEqual(key, "name")) {
                    String string = queryBundle.getString(key, null);
                    String str = string;
                    if (str != null && !StringsKt.isBlank(str)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        brazeProperties.addProperty(key, string);
                    }
                }
            }
            return brazeProperties;
        }
    }
}
