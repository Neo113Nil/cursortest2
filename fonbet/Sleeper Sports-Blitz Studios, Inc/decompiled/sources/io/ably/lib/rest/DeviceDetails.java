package io.ably.lib.rest;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.ably.lib.http.HttpCore;
import io.ably.lib.realtime.Presence;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.util.JsonUtils;
import io.ably.lib.util.Serialisation;
import io.intercom.android.sdk.metrics.MetricTracker;

/* loaded from: classes9.dex */
public class DeviceDetails {
    public String clientId;
    public String formFactor;
    public String id;
    public JsonObject metadata;
    public String platform;
    public Push push;
    private static Serialisation.FromJsonElement<DeviceDetails> fromJsonElement = new Serialisation.FromJsonElement<DeviceDetails>() { // from class: io.ably.lib.rest.DeviceDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.util.Serialisation.FromJsonElement
        public DeviceDetails fromJsonElement(JsonElement jsonElement) {
            return DeviceDetails.fromJsonObject((JsonObject) jsonElement);
        }
    };
    public static HttpCore.ResponseHandler<DeviceDetails> httpResponseHandler = new Serialisation.HttpResponseHandler(DeviceDetails.class, fromJsonElement);
    public static HttpCore.BodyHandler<DeviceDetails> httpBodyHandler = new Serialisation.HttpBodyHandler(DeviceDetails[].class, fromJsonElement);

    public static class Push {
        public ErrorInfo errorReason;
        public JsonObject recipient;
        public State state;

        public JsonObject toJsonObject() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("recipient", this.recipient);
            return jsonObject;
        }

        public enum State {
            ACTIVE("ACTIVE"),
            FAILING("FAILING"),
            FAILED("FAILED");

            public String code;

            State(String str) {
                this.code = str;
            }

            public int toInt() {
                State[] values = values();
                for (int i = 0; i < values.length; i++) {
                    if (this == values[i]) {
                        return i;
                    }
                }
                return -1;
            }

            public static State fromInt(int i) {
                State[] values = values();
                if (i < 0 || i >= values.length) {
                    return null;
                }
                return values[i];
            }

            public static State fromCode(String str) {
                for (State state : values()) {
                    if (state.code.equals(str)) {
                        return state;
                    }
                }
                return null;
            }
        }
    }

    public JsonObject toJsonObject() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.id);
        jsonObject.addProperty("platform", this.platform);
        jsonObject.addProperty("formFactor", this.formFactor);
        jsonObject.addProperty(Presence.GET_CLIENTID, this.clientId);
        JsonObject jsonObject2 = this.metadata;
        if (jsonObject2 != null) {
            jsonObject.add("metadata", jsonObject2);
        }
        Push push = this.push;
        if (push != null) {
            jsonObject.add(MetricTracker.Place.PUSH, push.toJsonObject());
        }
        return jsonObject;
    }

    public JsonObject pushRecipientJsonObject() {
        return JsonUtils.object().add(MetricTracker.Place.PUSH, JsonUtils.object().add("recipient", this.push.recipient)).toJson();
    }

    public boolean equals(Object obj) {
        JsonObject jsonObject;
        if (!(obj instanceof DeviceDetails)) {
            return false;
        }
        DeviceDetails deviceDetails = (DeviceDetails) obj;
        JsonObject jsonObject2 = toJsonObject();
        JsonObject jsonObject3 = deviceDetails.toJsonObject();
        jsonObject2.remove("deviceSecret");
        jsonObject3.remove("deviceSecret");
        normalizeRecipientField(jsonObject2);
        normalizeRecipientField(jsonObject3);
        JsonObject jsonObject4 = this.metadata;
        if ((jsonObject4 == null || jsonObject4.entrySet().isEmpty()) && ((jsonObject = deviceDetails.metadata) == null || jsonObject.entrySet().isEmpty())) {
            jsonObject2.remove("metadata");
            jsonObject3.remove("metadata");
        }
        return jsonObject2.equals(jsonObject3);
    }

    public String toString() {
        return toJsonObject().toString();
    }

    public static DeviceDetails fromJsonObject(JsonObject jsonObject) {
        return (DeviceDetails) Serialisation.gson.fromJson((JsonElement) jsonObject, DeviceDetails.class);
    }

    private static void normalizeRecipientField(JsonObject jsonObject) {
        JsonElement jsonElement;
        JsonElement jsonElement2 = jsonObject.get(MetricTracker.Place.PUSH);
        if (jsonElement2 == null || (jsonElement = jsonElement2.getAsJsonObject().get("recipient")) == null) {
            return;
        }
        jsonElement2.getAsJsonObject().add("recipient", JsonUtils.object().add("transportType", jsonElement.getAsJsonObject().get("transportType")).add("deviceToken", jsonElement.getAsJsonObject().get("deviceToken")).add("registrationToken", jsonElement.getAsJsonObject().get("registrationToken")).toJson());
    }
}
