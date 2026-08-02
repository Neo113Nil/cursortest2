package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5943v;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.InterfaceC5926d;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class j extends AbstractC5935m implements InterfaceC5926d {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5927e f9790a;

    /* renamed from: b, reason: collision with root package name */
    public int f9791b;

    public j(AbstractC5947z abstractC5947z) {
        int n10 = abstractC5947z.n();
        this.f9791b = n10;
        if (n10 == 0) {
            this.f9790a = o.e(abstractC5947z, false);
        } else {
            this.f9790a = AbstractC5943v.m(abstractC5947z, false);
        }
    }

    public static j e(Object obj) {
        if (obj == null || (obj instanceof j)) {
            return (j) obj;
        }
        if (obj instanceof AbstractC5947z) {
            return new j((AbstractC5947z) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public static j f(AbstractC5947z abstractC5947z, boolean z10) {
        return e(AbstractC5947z.l(abstractC5947z, true));
    }

    public final void c(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return new i0(false, this.f9791b, this.f9790a);
    }

    public String toString() {
        String d10 = Aj.h.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(d10);
        if (this.f9791b == 0) {
            c(stringBuffer, d10, "fullName", this.f9790a.toString());
        } else {
            c(stringBuffer, d10, "nameRelativeToCRLIssuer", this.f9790a.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
