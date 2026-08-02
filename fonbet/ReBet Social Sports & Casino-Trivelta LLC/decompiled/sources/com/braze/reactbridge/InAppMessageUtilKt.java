package com.braze.reactbridge;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.reactbridge.InAppMessageUtilKt;
import com.braze.reactbridge.util.MapFactoryKt;
import com.braze.support.BrazeLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG", "", "mapInAppMessage", "Lcom/facebook/react/bridge/WritableMap;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InAppMessageUtilKt {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageUtil");

    @NotNull
    public static final WritableMap mapInAppMessage(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        try {
            Map mapOf = MapsKt.mapOf(TuplesKt.to(EventKeys.URL, "uri"), TuplesKt.to("use_webview", "useWebView"), TuplesKt.to("image_alt", "imageAltText"), TuplesKt.to("message_close", "dismissType"), TuplesKt.to("type", "messageType"), TuplesKt.to("btns", "buttons"), TuplesKt.to("bg_color", ViewProps.BACKGROUND_COLOR), TuplesKt.to("close_btn_color", "closeButtonColor"), TuplesKt.to("icon_bg_color", "iconBackgroundColor"));
            JSONObject jSONObject = new JSONObject(inAppMessage.getKey().toString());
            WritableMap formatToCamelCase = JsonUtilsKt.formatToCamelCase(jSONObject, (List<String>) CollectionsKt.listOf("extras"), (Map<String, String>) mapOf);
            formatToCamelCase.putString("inAppMessageJsonString", jSONObject.toString());
            return formatToCamelCase;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: V3.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String mapInAppMessage$lambda$0;
                    mapInAppMessage$lambda$0 = InAppMessageUtilKt.mapInAppMessage$lambda$0(e10);
                    return mapInAppMessage$lambda$0;
                }
            }, 12, (Object) null);
            return MapFactoryKt.getMutableMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mapInAppMessage$lambda$0(JSONException jSONException) {
        return "Unable to parse In-App Message: " + jSONException.getMessage();
    }
}
