package com.yandex.runtime.attestation_storage.internal;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface AttestationListener {
    void onAttestationFailed(@NonNull String str);

    void onAttestationReceived(@NonNull byte[] bArr);
}
