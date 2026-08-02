package cj;

import java.io.InputStream;
import java.math.BigInteger;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.C5980g;
import org.spongycastle.crypto.params.i;
import org.spongycastle.crypto.u;

/* renamed from: cj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2929a implements u {

    /* renamed from: a, reason: collision with root package name */
    public C5980g f27859a;

    public C2929a(C5980g c5980g) {
        this.f27859a = c5980g;
    }

    @Override // org.spongycastle.crypto.u
    public AbstractC5975b readKey(InputStream inputStream) {
        int bitLength = (this.f27859a.e().bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        Bj.a.d(inputStream, bArr, 0, bitLength);
        return new i(new BigInteger(1, bArr), this.f27859a);
    }
}
