package mi;

import com.plaid.internal.EnumC3631g;
import java.util.Collections;
import java.util.Map;
import li.AbstractC5469c;
import oi.EnumC5900A;
import oi.InterfaceC5915k;
import oi.z;

/* loaded from: classes5.dex */
public final class l implements z {

    /* renamed from: a, reason: collision with root package name */
    public final Map f56639a;

    /* renamed from: b, reason: collision with root package name */
    public final oi.p f56640b;

    public l(InterfaceC5915k interfaceC5915k, oi.p pVar) {
        this.f56639a = Collections.singletonMap("calendrical", interfaceC5915k);
        this.f56640b = pVar;
    }

    public static Integer l(long j10) {
        long j11;
        long f10 = AbstractC5469c.f(EnumC5900A.MODIFIED_JULIAN_DATE.i(j10, EnumC5900A.UTC), 678881L);
        long b10 = AbstractC5469c.b(f10, 146097);
        int d10 = AbstractC5469c.d(f10, 146097);
        if (d10 == 146096) {
            j11 = (b10 + 1) * 400;
        } else {
            int i10 = d10 / 36524;
            int i11 = d10 % 36524;
            int i12 = i11 / 1461;
            int i13 = i11 % 1461;
            if (i13 == 1460) {
                j11 = (b10 * 400) + (i10 * 100) + ((i12 + 1) * 4);
            } else {
                j11 = (b10 * 400) + (i10 * 100) + (i12 * 4) + (i13 / 365);
                if (((((i13 % 365) + 31) * 5) / EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) + 2 > 12) {
                    j11++;
                }
            }
        }
        return Integer.valueOf(AbstractC5469c.g(j11));
    }

    public final InterfaceC5915k a(oi.q qVar) {
        return (InterfaceC5915k) this.f56639a.get("calendrical");
    }

    @Override // oi.z
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public oi.p b(oi.q qVar) {
        return null;
    }

    @Override // oi.z
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public oi.p d(oi.q qVar) {
        return null;
    }

    @Override // oi.z
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer e(oi.q qVar) {
        InterfaceC5915k a10 = a(qVar);
        return l(a10.c(((oi.q) a10.b(a10.a())).w(this.f56640b, 1)));
    }

    @Override // oi.z
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer i(oi.q qVar) {
        InterfaceC5915k a10 = a(qVar);
        return l(a10.c(((oi.q) a10.b(a10.d())).w(this.f56640b, 1)));
    }

    @Override // oi.z
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer p(oi.q qVar) {
        return l(a(qVar).c(qVar.w(this.f56640b, 1)));
    }

    @Override // oi.z
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public oi.q o(oi.q qVar, Integer num, boolean z10) {
        if (isValid(qVar, num)) {
            return qVar;
        }
        throw new IllegalArgumentException("The related gregorian year is read-only.");
    }

    @Override // oi.z
    public boolean isValid(oi.q qVar, Integer num) {
        return p(qVar).equals(num);
    }
}
