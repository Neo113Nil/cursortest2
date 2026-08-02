package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class o extends AbstractC5935m {
    private final n[] names;

    public o(n nVar) {
        this.names = new n[]{nVar};
    }

    public static o c(Object obj) {
        if (obj instanceof o) {
            return (o) obj;
        }
        if (obj != null) {
            return new o(AbstractC5941t.k(obj));
        }
        return null;
    }

    public static o e(AbstractC5947z abstractC5947z, boolean z10) {
        return c(AbstractC5941t.l(abstractC5947z, z10));
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return new d0(this.names);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = Aj.h.d();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(d10);
        for (int i10 = 0; i10 != this.names.length; i10++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.names[i10]);
            stringBuffer.append(d10);
        }
        return stringBuffer.toString();
    }

    public o(AbstractC5941t abstractC5941t) {
        this.names = new n[abstractC5941t.size()];
        for (int i10 = 0; i10 != abstractC5941t.size(); i10++) {
            this.names[i10] = n.c(abstractC5941t.n(i10));
        }
    }
}
