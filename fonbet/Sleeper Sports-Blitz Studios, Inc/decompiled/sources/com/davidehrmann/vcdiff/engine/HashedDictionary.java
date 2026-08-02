package com.davidehrmann.vcdiff.engine;

/* loaded from: classes6.dex */
public class HashedDictionary {
    private final VCDiffEngine engine;

    public HashedDictionary(byte[] bArr) {
        this.engine = new VCDiffEngine(bArr);
    }

    public VCDiffEngine engine() {
        return this.engine;
    }
}
