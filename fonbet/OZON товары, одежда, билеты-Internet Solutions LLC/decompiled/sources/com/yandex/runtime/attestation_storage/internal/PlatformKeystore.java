package com.yandex.runtime.attestation_storage.internal;

import androidx.annotation.NonNull;
import com.yandex.runtime.attestation.EcPublicKey;

/* loaded from: classes9.dex */
public interface PlatformKeystore {
    @NonNull
    byte[] ecSign(@NonNull byte[] bArr);

    void generateKey(@NonNull byte[] bArr);

    @NonNull
    byte[] getAppAttestKeyAssertion();

    @NonNull
    String getAppAttestKeyId();

    String getApplicationId();

    @NonNull
    EcPublicKey getEcPublicKey();

    @NonNull
    byte[] getKeystoreProof();

    boolean hasKey();

    void removeKey();

    void requestAttestKey(@NonNull byte[] bArr, long j11, @NonNull AttestationListener attestationListener);
}
