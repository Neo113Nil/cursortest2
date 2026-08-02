package org.spongycastle.pqc.crypto.newhope;

import org.spongycastle.crypto.engines.C5959i;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public abstract class a {
    public static void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11) {
        C5959i c5959i = new C5959i(20);
        c5959i.a(true, new z(new w(bArr), bArr2));
        c5959i.processBytes(bArr3, i10, i11, bArr3, i10);
    }
}
