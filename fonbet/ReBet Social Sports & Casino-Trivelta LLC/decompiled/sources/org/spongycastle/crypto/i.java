package org.spongycastle.crypto;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public SecureRandom f62625a;

    /* renamed from: b, reason: collision with root package name */
    public int f62626b;

    public byte[] a() {
        byte[] bArr = new byte[this.f62626b];
        this.f62625a.nextBytes(bArr);
        return bArr;
    }

    public void b(t tVar) {
        this.f62625a = tVar.a();
        this.f62626b = (tVar.b() + 7) / 8;
    }
}
