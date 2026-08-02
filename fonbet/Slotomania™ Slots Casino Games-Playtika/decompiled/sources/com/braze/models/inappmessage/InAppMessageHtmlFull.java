package com.braze.models.inappmessage;

import bo.app.z1;
import com.braze.enums.inappmessage.MessageType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageHtmlFull;", "Lcom/braze/models/inappmessage/InAppMessageZippedAssetHtmlBase;", "Lorg/json/JSONObject;", "forJsonPut", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "<init>", "()V", "jsonObject", "Lbo/app/z1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/z1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class InAppMessageHtmlFull extends InAppMessageZippedAssetHtmlBase {
    public InAppMessageHtmlFull() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.HTML_FULL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlFull(JSONObject jsonObject, z1 brazeManager) {
        super(jsonObject, brazeManager);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    @Override // com.braze.models.inappmessage.InAppMessageZippedAssetHtmlBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject == null) {
            jsonObject = super.getJsonKey();
            try {
                jsonObject.put("type", getMessageType().name());
            } catch (JSONException unused) {
            }
        }
        return jsonObject;
    }
}
