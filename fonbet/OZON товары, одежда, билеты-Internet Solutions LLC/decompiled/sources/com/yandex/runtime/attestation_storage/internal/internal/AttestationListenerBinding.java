package com.yandex.runtime.attestation_storage.internal.internal;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.attestation_storage.internal.AttestationListener;

/* loaded from: classes9.dex */
public class AttestationListenerBinding implements AttestationListener {
    private final NativeObject nativeObject;

    protected AttestationListenerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.attestation_storage.internal.AttestationListener
    public native void onAttestationFailed(@NonNull String str);

    @Override // com.yandex.runtime.attestation_storage.internal.AttestationListener
    public native void onAttestationReceived(@NonNull byte[] bArr);
}
