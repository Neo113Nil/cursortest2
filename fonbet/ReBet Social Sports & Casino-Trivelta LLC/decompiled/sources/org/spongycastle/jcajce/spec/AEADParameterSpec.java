package org.spongycastle.jcajce.spec;

import Aj.a;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes5.dex */
public class AEADParameterSpec extends IvParameterSpec {
    private final byte[] associatedData;
    private final int macSizeInBits;

    public AEADParameterSpec(byte[] bArr, int i10) {
        this(bArr, i10, null);
    }

    public byte[] getAssociatedData() {
        return a.d(this.associatedData);
    }

    public int getMacSizeInBits() {
        return this.macSizeInBits;
    }

    public byte[] getNonce() {
        return getIV();
    }

    public AEADParameterSpec(byte[] bArr, int i10, byte[] bArr2) {
        super(bArr);
        this.macSizeInBits = i10;
        this.associatedData = a.d(bArr2);
    }
}
