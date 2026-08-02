package com.vk.id.analytics.stat;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.analytics.VKIDAnalytics;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J2\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0019H\u0002J2\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0019H\u0002J\u001a\u0010\u001b\u001a\u00020\u001c*\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/vk/id/analytics/stat/StatEventJson;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "params", "", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "eventId", "", "prevEventId", "<init>", "(Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;II)V", "json", "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "actionJson", "typeAction", "screen", "data", "eventJson", "eventName", "eventParams", "", "topLevelParams", "", "techEventJson", "putFields", "", "actionForEvent", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StatEventJson {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> specialParams = C7714v.b0("screen_current", "screen_to", "error", "wrapper_sdk_type", "app_id", "external_device_id");

    @NotNull
    private static final Set<String> techEvents = e0.h("vkid_sdk_init");

    @NotNull
    private final JSONObject json;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vk/id/analytics/stat/StatEventJson$Companion;", "", "<init>", "()V", "specialParams", "", "", "techEvents", "", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StatEventJson(@NotNull String name, @NotNull VKIDAnalytics.EventParam[] params, int i11, int i12) {
        String str;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = "nowhere";
        for (VKIDAnalytics.EventParam eventParam : params) {
            String name2 = eventParam.getName();
            str = "";
            if (Intrinsics.d(name2, "screen")) {
                String strValue = eventParam.getStrValue();
                str2 = strValue != null ? strValue : "";
            } else if (specialParams.contains(name2)) {
                String name3 = eventParam.getName();
                String strValue2 = eventParam.getStrValue();
                if (strValue2 == null) {
                    Integer intValue = eventParam.getIntValue();
                    if (intValue != null) {
                        str = intValue;
                    }
                } else {
                    str = strValue2;
                }
                linkedHashMap.put(name3, str);
            } else {
                arrayList.add(eventParam);
            }
        }
        this.json = actionJson(actionForEvent(name), str2, techEvents.contains(name) ? techEventJson(name, arrayList, linkedHashMap) : eventJson(name, arrayList, linkedHashMap), i11, i12);
    }

    private final String actionForEvent(String name) {
        return techEvents.contains(name) ? "type_sak_sessions_event_item" : "type_registration_item";
    }

    private final JSONObject actionJson(String typeAction, String screen, JSONObject data, int eventId, int prevEventId) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", eventId);
        jSONObject.put("prev_event_id", prevEventId);
        jSONObject.put("prev_nav_id", 0);
        jSONObject.put("screen", screen);
        jSONObject.put("timestamp", String.valueOf(System.currentTimeMillis()));
        jSONObject.put("type", "type_action");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", typeAction);
        jSONObject2.put(typeAction, data);
        Unit unit = Unit.f71690a;
        jSONObject.put("type_action", jSONObject2);
        return jSONObject;
    }

    private final JSONObject eventJson(String eventName, List<VKIDAnalytics.EventParam> eventParams, Map<String, ? extends Object> topLevelParams) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", eventName);
        putFields(jSONObject, eventParams);
        for (Map.Entry<String, ? extends Object> entry : topLevelParams.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    private final void putFields(JSONObject jSONObject, List<VKIDAnalytics.EventParam> list) {
        JSONArray jSONArray = new JSONArray();
        for (VKIDAnalytics.EventParam eventParam : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, eventParam.getName());
            if (eventParam.getStrValue() != null) {
                jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, eventParam.getStrValue());
            } else if (eventParam.getIntValue() != null) {
                jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, eventParam.getIntValue().intValue());
            }
            jSONArray.put(jSONObject2);
        }
        Unit unit = Unit.f71690a;
        jSONObject.put("fields", jSONArray);
    }

    private final JSONObject techEventJson(String eventName, List<VKIDAnalytics.EventParam> eventParams, Map<String, ? extends Object> topLevelParams) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("step", eventName);
        putFields(jSONObject, eventParams);
        for (Map.Entry<String, ? extends Object> entry : topLevelParams.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @NotNull
    public final JSONObject getJson() {
        return this.json;
    }
}
