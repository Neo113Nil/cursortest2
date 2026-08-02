package com.braze.ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultInAppMessageHtmlViewFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageHtmlViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "(Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;)V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageHtmlView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultInAppMessageHtmlViewFactory implements IInAppMessageViewFactory {
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    public DefaultInAppMessageHtmlViewFactory(IInAppMessageWebViewClientListener inAppMessageWebViewClientListener) {
        Intrinsics.checkNotNullParameter(inAppMessageWebViewClientListener, "inAppMessageWebViewClientListener");
        this.inAppMessageWebViewClientListener = inAppMessageWebViewClientListener;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageHtmlView createInAppMessageView(Activity activity, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Context context = activity.getApplicationContext();
        View inflate = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_html, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) inflate;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            if (new BrazeConfigurationProvider(context).isTouchModeRequiredForHtmlInAppMessages() && ViewUtils.isDeviceNotInTouchMode(inAppMessageHtmlView)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "The device is not currently in touch mode. This message requires user touch interaction to display properly. Please set setIsTouchModeRequiredForHtmlInAppMessages to false to change this behavior.";
                    }
                }, 2, (Object) null);
                return null;
            }
            InAppMessageHtml inAppMessageHtml = (InAppMessageHtml) inAppMessage;
            InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(context, inAppMessageHtml);
            InAppMessageHtmlBaseView.setWebViewContent$default(inAppMessageHtmlView, inAppMessageHtml.getMessage(), null, 2, null);
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            inAppMessageHtmlView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext, inAppMessageHtml, this.inAppMessageWebViewClientListener));
            WebView messageWebView = inAppMessageHtmlView.getMessageWebView();
            if (messageWebView == null) {
                return inAppMessageHtmlView;
            }
            messageWebView.addJavascriptInterface(inAppMessageJavascriptInterface, InAppMessageHtmlBaseView.BRAZE_BRIDGE_PREFIX);
            return inAppMessageHtmlView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlView");
    }
}
