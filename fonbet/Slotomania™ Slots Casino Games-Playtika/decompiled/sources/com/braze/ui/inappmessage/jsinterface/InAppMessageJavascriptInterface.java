package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.google.android.gms.ads.AdError;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: InAppMessageJavascriptInterface.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007J\b\u0010\u0012\u001a\u00020\fH\u0007J\u001c\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0007J6\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0007J\b\u0010\u001f\u001a\u00020\fH\u0007J\b\u0010 \u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u00020\b8G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface;", "", "context", "Landroid/content/Context;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessageHtml;)V", "user", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "changeUser", "", "userId", "", "sdkAuthSignature", "logButtonClick", "buttonId", "logClick", "logCustomEventWithJSON", X3.i.j0, "propertiesJSON", "logPurchaseWithJSON", InAppPurchaseMetaData.KEY_PRODUCT_ID, "price", "", "currencyCode", "quantity", "", "parseProperties", "Lcom/braze/models/outgoing/BrazeProperties;", "requestImmediateDataFlush", "requestPushPermission", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppMessageJavascriptInterface {
    private final Context context;
    private final IInAppMessageHtml inAppMessage;
    private final InAppMessageUserJavascriptInterface user;

    public InAppMessageJavascriptInterface(Context context, IInAppMessageHtml inAppMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.context = context;
        this.inAppMessage = inAppMessage;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    @JavascriptInterface
    public final void changeUser(String userId, String sdkAuthSignature) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Braze.INSTANCE.getInstance(this.context).changeUser(userId, sdkAuthSignature);
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.INSTANCE.getInstance(this.context).requestImmediateDataFlush();
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String eventName, String propertiesJSON) {
        Braze.INSTANCE.getInstance(this.context).logCustomEvent(eventName, parseProperties(propertiesJSON));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String productId, double price, String currencyCode, int quantity, String propertiesJSON) {
        Braze.INSTANCE.getInstance(this.context).logPurchase(productId, currencyCode, new BigDecimal(String.valueOf(price)), quantity, parseProperties(propertiesJSON));
    }

    @JavascriptInterface
    public final void logButtonClick(String buttonId) {
        if (buttonId == null) {
            return;
        }
        this.inAppMessage.logButtonClick(buttonId);
    }

    @JavascriptInterface
    public final void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.INSTANCE.getInstance().setShouldNextUnregisterBeSkipped(true);
        PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.INSTANCE.getInstance().getMActivity());
    }

    public final BrazeProperties parseProperties(final String propertiesJSON) {
        if (propertiesJSON == null) {
            return null;
        }
        try {
            if (Intrinsics.areEqual(propertiesJSON, AdError.UNDEFINED_DOMAIN) || Intrinsics.areEqual(propertiesJSON, AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return new BrazeProperties(new JSONObject(propertiesJSON));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$parseProperties$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to parse properties JSON String: ", propertiesJSON);
                }
            });
            return null;
        }
    }
}
