package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class A extends z {
    private final byte[] zza;

    public A(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.zza = bArr;
    }

    @Override // com.google.android.gms.common.z
    public final byte[] g() {
        return this.zza;
    }
}
