package Di;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.Z;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class b extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public int f2808a;
    private byte[] nonce;

    public b(byte[] bArr, int i10) {
        this.nonce = Aj.a.d(bArr);
        this.f2808a = i10;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(new Z(this.nonce));
        int i10 = this.f2808a;
        if (i10 != 12) {
            c5928f.a(new C5933k(i10));
        }
        return new d0(c5928f);
    }
}
