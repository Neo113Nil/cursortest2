package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageJavascriptInterface.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0013H\u0017J\b\u0010\u0017\u001a\u00020\u0013H\u0007J\b\u0010\u0018\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "context", "Landroid/content/Context;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "<init>", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessageHtml;)V", "user", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "wasCloseMessageCalled", "", "getWasCloseMessageCalled", "()Z", "setWasCloseMessageCalled", "(Z)V", "logButtonClick", "", "buttonId", "", "logClick", "beforeMessageClosed", "requestPushPermission", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppMessageJavascriptInterface extends JavascriptInterfaceBase {
    private static final long PUSH_PROMPT_INITIAL_DELAY_MS = 75;
    private static final long PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS = 25;
    private static final long PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS = 2500;
    private final IInAppMessageHtml inAppMessage;
    private final InAppMessageUserJavascriptInterface user;
    private boolean wasCloseMessageCalled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface(Context context, IInAppMessageHtml inAppMessage) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.inAppMessage = inAppMessage;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    public final boolean getWasCloseMessageCalled() {
        return this.wasCloseMessageCalled;
    }

    public final void setWasCloseMessageCalled(boolean z) {
        this.wasCloseMessageCalled = z;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(String buttonId) {
        if (buttonId != null) {
            this.inAppMessage.logButtonClick(buttonId);
        }
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        this.wasCloseMessageCalled = true;
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.INSTANCE.getInstance().setShouldNextUnregisterBeSkipped(true);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, (Number) 75L, null, new InAppMessageJavascriptInterface$requestPushPermission$1(this, null), 2, null);
    }
}
