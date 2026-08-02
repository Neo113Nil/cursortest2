package com.twilio.voice;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twilio.voice.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class Event extends EventMetadata {
    private JSONObject payload;

    public static class Builder {
        private String eventName;
        private String groupName;
        private Constants.SeverityLevel level;
        private JSONObject payload;
        private String payloadType;
        private String productName;
        private String timeStamp;
        private long timestampMS;

        @SuppressLint({"SimpleDateFormat"})
        public Builder() {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            Date date = new Date();
            this.timeStamp = simpleDateFormat.format(date);
            this.timestampMS = date.getTime();
        }

        public Event build() {
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
                return new Event(this);
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

        public Builder payLoad(JSONObject jSONObject) {
            this.payload = jSONObject;
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

    public JSONObject getPayload() {
        return this.payload;
    }

    @SuppressLint({"SimpleDateFormat"})
    public JSONObject toJSONObject(Context context) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        this.timeStamp = simpleDateFormat.format(new Date());
        JSONObject jsonEnvelopePreparation = jsonEnvelopePreparation(this.productName, this.eventName, this.groupName);
        jsonEnvelopePreparation.put(PublisherMetadata.PUBLISHER_META_DATA, jsonPublisherMetadataPreparation(context));
        jsonEnvelopePreparation.put(EventKeys.PAYLOAD_TYPE, this.payloadType);
        jsonEnvelopePreparation.put(EventKeys.PAYLOAD, this.payload);
        return jsonEnvelopePreparation;
    }

    private Event(Builder builder) {
        this.productName = builder.productName;
        this.level = builder.level;
        this.groupName = builder.groupName;
        this.eventName = builder.eventName;
        this.payload = builder.payload;
        this.payloadType = builder.payloadType;
        this.timeStamp = builder.timeStamp;
        this.timestampMS = builder.timestampMS;
    }
}
