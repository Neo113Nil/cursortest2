package Ui;

import Aj.f;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.Z;
import org.spongycastle.asn1.d0;
import org.spongycastle.asn1.i0;
import org.spongycastle.crypto.l;
import org.spongycastle.crypto.m;
import org.spongycastle.crypto.n;
import org.spongycastle.crypto.o;

/* loaded from: classes5.dex */
public class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o f12307a;

    /* renamed from: b, reason: collision with root package name */
    public C5936n f12308b;

    /* renamed from: c, reason: collision with root package name */
    public int f12309c;
    private byte[] partyAInfo;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f12310z;

    public c(o oVar) {
        this.f12307a = oVar;
    }

    @Override // org.spongycastle.crypto.m
    public void a(n nVar) {
        b bVar = (b) nVar;
        this.f12308b = bVar.a();
        this.f12309c = bVar.c();
        this.f12310z = bVar.d();
        this.partyAInfo = bVar.b();
    }

    @Override // org.spongycastle.crypto.m
    public int generateBytes(byte[] bArr, int i10, int i11) {
        boolean z10;
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 < i13) {
            throw new l("output buffer too small");
        }
        long j10 = i12;
        int digestSize = this.f12307a.getDigestSize();
        if (j10 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j11 = digestSize;
        int i14 = (int) (((j10 + j11) - 1) / j11);
        byte[] bArr2 = new byte[this.f12307a.getDigestSize()];
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i14) {
            o oVar = this.f12307a;
            byte[] bArr3 = this.f12310z;
            oVar.update(bArr3, i15, bArr3.length);
            C5928f c5928f = new C5928f();
            C5928f c5928f2 = new C5928f();
            c5928f2.a(this.f12308b);
            c5928f2.a(new Z(f.f(i17)));
            c5928f.a(new d0(c5928f2));
            if (this.partyAInfo != null) {
                z10 = true;
                c5928f.a(new i0(true, i15, new Z(this.partyAInfo)));
            } else {
                z10 = true;
            }
            c5928f.a(new i0(z10, 2, new Z(f.f(this.f12309c))));
            try {
                byte[] b10 = new d0(c5928f).b(ASN1Encoding.DER);
                this.f12307a.update(b10, 0, b10.length);
                this.f12307a.doFinal(bArr2, 0);
                if (i12 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                    i13 += digestSize;
                    i12 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i13, i12);
                }
                i17++;
                i16++;
                i15 = 0;
            } catch (IOException e10) {
                throw new IllegalArgumentException("unable to encode parameter info: " + e10.getMessage());
            }
        }
        this.f12307a.reset();
        return (int) j10;
    }
}
