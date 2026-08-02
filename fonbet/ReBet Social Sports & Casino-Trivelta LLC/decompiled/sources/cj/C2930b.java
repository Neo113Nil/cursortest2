package cj;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.k;
import org.spongycastle.crypto.params.o;
import org.spongycastle.crypto.u;

/* renamed from: cj.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2930b implements u {

    /* renamed from: a, reason: collision with root package name */
    public k f27860a;

    public C2930b(k kVar) {
        this.f27860a = kVar;
    }

    @Override // org.spongycastle.crypto.u
    public AbstractC5975b readKey(InputStream inputStream) {
        byte[] bArr;
        int read = inputStream.read();
        if (read == 0) {
            throw new IOException("Sender's public key invalid.");
        }
        if (read == 2 || read == 3) {
            bArr = new byte[((this.f27860a.a().t() + 7) / 8) + 1];
        } else {
            if (read != 4 && read != 6 && read != 7) {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(read, 16));
            }
            bArr = new byte[(((this.f27860a.a().t() + 7) / 8) * 2) + 1];
        }
        bArr[0] = (byte) read;
        Bj.a.d(inputStream, bArr, 1, bArr.length - 1);
        return new o(this.f27860a.a().j(bArr), this.f27860a);
    }
}
