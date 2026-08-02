package com.twilio.voice;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twilio.voice.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class MetricEvent extends EventMetadata {
    private JSONArray payload;

    public static class Builder {
        private String callSid;
        private String eventName;
        private String groupName;
        private Constants.SeverityLevel level;
        private JSONArray payload;
        private String payloadType;
        private String productName;

        public MetricEvent build() {
            if (this.productName == null) {
                throw new NullPointerException("productName must not be null");
            }
            if (this.level == null) {
                throw new NullPointerException("level must not be null");
            }
            if (this.groupName == null) {
                throw new NullPointerException("groupName must not be null");
            }
            if (this.eventName == null) {
                throw new NullPointerException("eventName must not be null");
            }
            if (this.payloadType != null) {
                return new MetricEvent(this);
            }
            throw new NullPointerException("payloadType must not be null");
        }

        public Builder eventName(String str) {
            this.eventName = str;
            return this;
        }

        public Builder groupName(String str) {
            this.groupName = str;
            return this;
        }

        public Builder level(Constants.SeverityLevel severityLevel) {
            this.level = severityLevel;
            return this;
        }

        public Builder payLoad(JSONArray jSONArray) {
            this.payload = jSONArray;
            return this;
        }

        public Builder payLoadType(String str) {
            this.payloadType = str;
            return this;
        }

        public Builder productName(String str) {
            this.productName = str;
            return this;
        }
    }

    public void addStatsToPayload(JSONObject jSONObject) {
        if (this.payload == null) {
            this.payload = new JSONArray();
        }
        this.payload.put(jSONObject);
    }

    public JSONArray getPayload() {
        return this.payload;
    }

    public void setPayload(JSONArray jSONArray) {
        this.payload = jSONArray;
    }

    @SuppressLint({"SimpleDateFormat"})
    public JSONObject toJSONObject(Context context) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        this.timeStamp = simpleDateFormat.format(new Date());
        JSONObject jsonEnvelopePreparation = jsonEnvelopePreparation(this.productName, "metrics-sample", EventGroupType.CALL_QUALITY_STATS_GROUP);
        jsonEnvelopePreparation.put(PublisherMetadata.PUBLISHER_META_DATA, jsonPublisherMetadataPreparation(context));
        jsonEnvelopePreparation.put(EventKeys.PAYLOAD, this.payload);
        return jsonEnvelopePreparation;
    }

    private MetricEvent(Builder builder) {
        this.productName = builder.productName;
        this.level = builder.level;
        this.groupName = builder.groupName;
        this.eventName = builder.eventName;
        this.callSid = builder.callSid;
        this.payloadType = builder.payloadType;
        this.payload = builder.payload;
    }
}
