package org.spongycastle.pqc.crypto.newhope;

import org.spongycastle.crypto.params.AbstractC5975b;

/* loaded from: classes5.dex */
public class e extends AbstractC5975b {
    final byte[] pubData;

    public e(byte[] bArr) {
        super(false);
        this.pubData = Aj.a.d(bArr);
    }

    public byte[] b() {
        return Aj.a.d(this.pubData);
    }
}
