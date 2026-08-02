package com.braze.models.inappmessage;

import bo.app.w0;
import bo.app.z1;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageFull;", "Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lorg/json/JSONObject;", "forJsonPut", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "<init>", "()V", "jsonObject", "Lbo/app/z1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/z1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public class InAppMessageFull extends InAppMessageImmersiveBase {
    public InAppMessageFull() {
        setCropType(CropType.CENTER_CROP);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.FULL;
    }

    @Override // com.braze.models.inappmessage.InAppMessageImmersiveBase, com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageFull(JSONObject jsonObject, z1 brazeManager) {
        super(jsonObject, brazeManager);
        String upperCase;
        CropType[] values;
        int length;
        int i;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        CropType cropType = CropType.CENTER_CROP;
        try {
            w0 w0Var = w0.a;
            String string = jsonObject.getString(InAppMessageBase.CROP_TYPE);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            values = CropType.values();
            length = values.length;
            i = 0;
        } catch (Exception unused) {
        }
        while (i < length) {
            CropType cropType2 = values[i];
            i++;
            if (Intrinsics.areEqual(cropType2.name(), upperCase)) {
                if (cropType2 != null) {
                    cropType = cropType2;
                }
                setCropType(cropType);
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
