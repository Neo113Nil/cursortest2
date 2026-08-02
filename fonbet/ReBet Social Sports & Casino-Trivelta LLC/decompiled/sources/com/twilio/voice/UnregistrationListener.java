package com.twilio.voice;

/* loaded from: classes4.dex */
public interface UnregistrationListener {
    void onError(RegistrationException registrationException, String str, String str2);

    void onUnregistered(String str, String str2);
}
