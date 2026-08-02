package com.braze.models.inappmessage;

import bo.app.b3;
import bo.app.j;
import bo.app.x1;
import bo.app.z1;
import com.braze.Constants;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "", "", "remotePathToLocalAssetMap", "", "setLocalPrefetchedAssetPaths", "buttonId", "", "logButtonClick", "onAfterClosed", "localAssetsDirectoryUrl", "Ljava/lang/String;", "getLocalAssetsDirectoryUrl", "()Ljava/lang/String;", "setLocalAssetsDirectoryUrl", "(Ljava/lang/String;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/z1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/z1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class InAppMessageHtmlBase extends InAppMessageBase implements IInAppMessageHtml {
    private String buttonIdClicked;
    private String localAssetsDirectoryUrl;
    private boolean wasButtonClickLogged;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Button Id was null or blank for this html in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Button click already logged for this html in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot log an html in-app message button click because the BrazeManager is null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Logged button click for button id: " + this.b + " and trigger id: " + ((Object) this.c);
        }
    }

    protected InAppMessageHtmlBase() {
        setOpenUriInWebView(true);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public String getLocalAssetsDirectoryUrl() {
        return this.localAssetsDirectoryUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public boolean logButtonClick(String buttonId) {
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        String triggerId = getTriggerId();
        z1 brazeManager = getBrazeManager();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(buttonId), 3, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(buttonId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
            return false;
        }
        x1 d2 = j.h.d(triggerId, buttonId);
        if (d2 != null) {
            brazeManager.a(d2);
        }
        this.buttonIdClicked = buttonId;
        this.wasButtonClickLogged = true;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(buttonId, triggerId), 3, (Object) null);
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        z1 brazeManager;
        super.onAfterClosed();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.isBlank(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.isBlank(str) || (brazeManager = getBrazeManager()) == null) {
            return;
        }
        brazeManager.a(new b3(getTriggerId(), this.buttonIdClicked));
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public void setLocalAssetsDirectoryUrl(String str) {
        this.localAssetsDirectoryUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (remotePathToLocalAssetMap.isEmpty()) {
            return;
        }
        Object[] array = remotePathToLocalAssetMap.values().toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        setLocalAssetsDirectoryUrl(((String[]) array)[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlBase(JSONObject jsonObject, z1 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        setOpenUriInWebView(jsonObject.optBoolean(InAppMessageBase.OPEN_URI_IN_WEBVIEW, true));
    }
}
