package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface RegistrationListener {
    void onError(@NonNull RegistrationException registrationException, @NonNull String str, @NonNull String str2);

    void onRegistered(@NonNull String str, @NonNull String str2);
}
