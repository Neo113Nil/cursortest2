package com.twilio.voice;

/* loaded from: classes4.dex */
public class CallerInfo {
    private Boolean isVerified;

    public CallerInfo(String str) {
        Boolean bool = null;
        this.isVerified = null;
        if (str != null && !str.equals("null")) {
            bool = Boolean.valueOf(str.equals(VoiceConstants.TN_VALIDATION_PASSED_A));
        }
        this.isVerified = bool;
    }

    public Boolean isVerified() {
        return this.isVerified;
    }
}
