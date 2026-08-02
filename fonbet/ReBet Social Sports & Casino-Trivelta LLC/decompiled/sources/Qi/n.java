package Qi;

import java.io.IOException;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5926d;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.W;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class n extends AbstractC5935m implements InterfaceC5926d {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5927e f9831a;

    /* renamed from: b, reason: collision with root package name */
    public int f9832b;

    public n(Oi.c cVar) {
        this.f9831a = cVar;
        this.f9832b = 4;
    }

    public static n c(Object obj) {
        if (obj == null || (obj instanceof n)) {
            return (n) obj;
        }
        if (obj instanceof AbstractC5947z) {
            AbstractC5947z abstractC5947z = (AbstractC5947z) obj;
            int n10 = abstractC5947z.n();
            switch (n10) {
                case 0:
                    return new n(n10, AbstractC5941t.l(abstractC5947z, false));
                case 1:
                    return new n(n10, W.l(abstractC5947z, false));
                case 2:
                    return new n(n10, W.l(abstractC5947z, false));
                case 3:
                    throw new IllegalArgumentException("unknown tag: " + n10);
                case 4:
                    return new n(n10, Oi.c.e(abstractC5947z, true));
                case 5:
                    return new n(n10, AbstractC5941t.l(abstractC5947z, false));
                case 6:
                    return new n(n10, W.l(abstractC5947z, false));
                case 7:
                    return new n(n10, AbstractC5937o.l(abstractC5947z, false));
                case 8:
                    return new n(n10, C5936n.q(abstractC5947z, false));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return c(AbstractC5940s.g((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f9832b == 4 ? new i0(true, this.f9832b, this.f9831a) : new i0(false, this.f9832b, this.f9831a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9832b);
        stringBuffer.append(": ");
        int i10 = this.f9832b;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                stringBuffer.append(Oi.c.c(this.f9831a).toString());
            } else if (i10 != 6) {
                stringBuffer.append(this.f9831a.toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(W.k(this.f9831a).getString());
        return stringBuffer.toString();
    }

    public n(int i10, InterfaceC5927e interfaceC5927e) {
        this.f9831a = interfaceC5927e;
        this.f9832b = i10;
    }
}
