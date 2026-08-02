package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class CallMessage {
    private final String content;
    private final String contentType;
    private final String messageType;
    private String voiceEventSid;

    public static class Builder {
        private String content;
        private String contentType;
        private String messageType;

        public Builder(@NonNull String str) {
            Preconditions.checkNotNull(str, "messageType must not be null");
            Preconditions.checkArgument(str.length() > 0, "messageType must not be empty");
            this.messageType = str;
            this.contentType = "application/json";
            this.content = "";
        }

        public CallMessage build() {
            return new CallMessage(this.messageType, this.contentType, this.content, "");
        }

        public Builder content(@NonNull String str) {
            Preconditions.checkNotNull(str, "content must not be null");
            this.content = str;
            return this;
        }

        public Builder contentType(@NonNull String str) {
            Preconditions.checkNotNull(str, "contentType must not be null");
            this.contentType = str;
            return this;
        }
    }

    @NonNull
    public String getContent() {
        return this.content;
    }

    @NonNull
    public String getMessageContentType() {
        return this.contentType;
    }

    @NonNull
    public String getMessageType() {
        return this.messageType;
    }

    @NonNull
    public String getVoiceEventSID() {
        return this.voiceEventSid;
    }

    private CallMessage(String str, String str2, String str3, String str4) {
        this.messageType = str;
        this.contentType = str2;
        this.content = str3;
        this.voiceEventSid = str4;
    }
}
