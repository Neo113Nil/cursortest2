package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.p f17434a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f17435b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f17436c;

    /* renamed from: d, reason: collision with root package name */
    public volatile i f17437d;

    public q(j$.time.temporal.p pVar, g0 g0Var, b0 b0Var) {
        this.f17434a = pVar;
        this.f17435b = g0Var;
        this.f17436c = b0Var;
    }

    @Override // j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        String c2;
        Long a7 = yVar.a(this.f17434a);
        DateTimeFormatter dateTimeFormatter = yVar.f17468b;
        if (a7 == null) {
            return false;
        }
        j$.time.chrono.k kVar = (j$.time.chrono.k) yVar.f17467a.z(j$.time.temporal.q.f17531b);
        if (kVar == null || kVar == j$.time.chrono.r.f17346c) {
            c2 = this.f17436c.c(this.f17434a, a7.longValue(), this.f17435b, dateTimeFormatter.f17369b);
        } else {
            c2 = this.f17436c.b(kVar, this.f17434a, a7.longValue(), this.f17435b, dateTimeFormatter.f17369b);
        }
        if (c2 != null) {
            sb2.append(c2);
            return true;
        }
        if (this.f17437d == null) {
            this.f17437d = new i(this.f17434a, 1, 19, f0.NORMAL);
        }
        return this.f17437d.i(yVar, sb2);
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        Iterator e7;
        b0 b0Var = this.f17436c;
        j$.time.temporal.p pVar = this.f17434a;
        int length = charSequence.length();
        if (i5 >= 0 && i5 <= length) {
            boolean z5 = vVar.f17460c;
            DateTimeFormatter dateTimeFormatter = vVar.f17458a;
            g0 g0Var = z5 ? this.f17435b : null;
            j$.time.chrono.k kVar = vVar.c().f17386c;
            if (kVar == null && (kVar = vVar.f17458a.f17372e) == null) {
                kVar = j$.time.chrono.r.f17346c;
            }
            j$.time.chrono.k kVar2 = kVar;
            if (kVar2 == null || kVar2 == j$.time.chrono.r.f17346c) {
                e7 = b0Var.e(pVar, g0Var, dateTimeFormatter.f17369b);
            } else {
                e7 = b0Var.d(kVar2, pVar, g0Var, dateTimeFormatter.f17369b);
            }
            Iterator it = e7;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (vVar.g(str, 0, charSequence, i5, str.length())) {
                        return vVar.f(this.f17434a, ((Long) entry.getValue()).longValue(), i5, str.length() + i5);
                    }
                }
                if (pVar == j$.time.temporal.a.ERA && !vVar.f17460c) {
                    Iterator it2 = kVar2.s().iterator();
                    while (it2.hasNext()) {
                        String obj = ((j$.time.chrono.l) it2.next()).toString();
                        if (vVar.g(obj, 0, charSequence, i5, obj.length())) {
                            return vVar.f(this.f17434a, r7.getValue(), i5, obj.length() + i5);
                        }
                    }
                }
                if (vVar.f17460c) {
                    return ~i5;
                }
            }
            if (this.f17437d == null) {
                this.f17437d = new i(this.f17434a, 1, 19, f0.NORMAL);
            }
            return this.f17437d.j(vVar, charSequence, i5);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        g0 g0Var = g0.FULL;
        j$.time.temporal.p pVar = this.f17434a;
        g0 g0Var2 = this.f17435b;
        if (g0Var2 == g0Var) {
            return "Text(" + pVar + ")";
        }
        return "Text(" + pVar + StringUtils.COMMA + g0Var2 + ")";
    }
}
