package Qi;

import com.facebook.hermes.intl.Constants;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5925c;
import org.spongycastle.asn1.P;

/* loaded from: classes5.dex */
public class r extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public j f9840a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9841b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9842c;

    /* renamed from: d, reason: collision with root package name */
    public t f9843d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9844e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9845f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC5941t f9846g;

    public r(AbstractC5941t abstractC5941t) {
        this.f9846g = abstractC5941t;
        for (int i10 = 0; i10 != abstractC5941t.size(); i10++) {
            AbstractC5947z k10 = AbstractC5947z.k(abstractC5941t.n(i10));
            int n10 = k10.n();
            if (n10 == 0) {
                this.f9840a = j.f(k10, true);
            } else if (n10 == 1) {
                this.f9841b = C5925c.m(k10, false).o();
            } else if (n10 == 2) {
                this.f9842c = C5925c.m(k10, false).o();
            } else if (n10 == 3) {
                this.f9843d = new t(P.r(k10, false));
            } else if (n10 == 4) {
                this.f9844e = C5925c.m(k10, false).o();
            } else {
                if (n10 != 5) {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                this.f9845f = C5925c.m(k10, false).o();
            }
        }
    }

    private void c(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static r f(Object obj) {
        if (obj instanceof r) {
            return (r) obj;
        }
        if (obj != null) {
            return new r(AbstractC5941t.k(obj));
        }
        return null;
    }

    public final String e(boolean z10) {
        return z10 ? "true" : Constants.CASEFIRST_FALSE;
    }

    public boolean g() {
        return this.f9844e;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f9846g;
    }

    public String toString() {
        String d10 = Aj.h.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(d10);
        j jVar = this.f9840a;
        if (jVar != null) {
            c(stringBuffer, d10, "distributionPoint", jVar.toString());
        }
        boolean z10 = this.f9841b;
        if (z10) {
            c(stringBuffer, d10, "onlyContainsUserCerts", e(z10));
        }
        boolean z11 = this.f9842c;
        if (z11) {
            c(stringBuffer, d10, "onlyContainsCACerts", e(z11));
        }
        t tVar = this.f9843d;
        if (tVar != null) {
            c(stringBuffer, d10, "onlySomeReasons", tVar.toString());
        }
        boolean z12 = this.f9845f;
        if (z12) {
            c(stringBuffer, d10, "onlyContainsAttributeCerts", e(z12));
        }
        boolean z13 = this.f9844e;
        if (z13) {
            c(stringBuffer, d10, "indirectCRL", e(z13));
        }
        stringBuffer.append("]");
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
