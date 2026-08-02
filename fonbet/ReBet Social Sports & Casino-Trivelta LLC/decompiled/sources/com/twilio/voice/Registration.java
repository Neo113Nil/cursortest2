package com.twilio.voice;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class Registration {
    private static final String VERSION = "3";
    private final String channelType;
    private final RegistrationData data;
    private final MessageTypes messageTypes = new MessageTypes();
    private final String version = VERSION;

    public class MessageTypes {
        private final String CALL_TYPE;

        public JSONArray toJson() {
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(0, VoiceConstants.MESSAGE_TYPE_CALL);
                return jSONArray;
            } catch (JSONException e10) {
                Log.e(getClass().getSimpleName(), e10.toString());
                return null;
            }
        }

        private MessageTypes() {
            this.CALL_TYPE = VoiceConstants.MESSAGE_TYPE_CALL;
        }
    }

    public class RegistrationData {
        String registrationId;

        public RegistrationData(String str) {
            this.registrationId = str;
        }

        public JSONObject toJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("registration_id", this.registrationId);
                return jSONObject;
            } catch (Exception e10) {
                Log.e(getClass().getSimpleName(), e10.toString());
                return null;
            }
        }
    }

    public Registration(String str, String str2) {
        this.channelType = str;
        this.data = new RegistrationData(str2);
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("channel_type", this.channelType);
            jSONObject.put("message_types", this.messageTypes.toJson());
            jSONObject.put(EventKeys.DATA, this.data.toJson());
            jSONObject.put("version", this.version);
            return jSONObject;
        } catch (Exception e10) {
            Log.e(getClass().getSimpleName(), e10.toString());
            return null;
        }
    }
}
