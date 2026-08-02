package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes9.dex */
public enum zzrn implements zzfc {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(UserVerificationMethods.USER_VERIFY_PATTERN),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(UserVerificationMethods.USER_VERIFY_NONE),
    FORMAT_UPC_E(UserVerificationMethods.USER_VERIFY_ALL),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);

    private final int zzp;

    zzrn(int i11) {
        this.zzp = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfc
    public final int zza() {
        return this.zzp;
    }
}
