package uf0;

import C.C2702w;
import E0.C2942q;
import kotlin.Pair;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.NetworkInfo;

/* loaded from: classes7.dex */
public abstract class b {
    private static Pair z(long j11, long j12) {
        if (j11 <= 0 || j12 <= 0) {
            return null;
        }
        return new Pair(Long.valueOf(j11), Long.valueOf(j12));
    }

    public final long a() {
        Pair z11 = z(c(), b());
        if (z11 != null) {
            return ((Number) z11.f()).longValue() - ((Number) z11.e()).longValue();
        }
        return 0L;
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();

    @NotNull
    public abstract NetworkInfo e();

    public abstract long f();

    public abstract long g();

    public abstract long h();

    public abstract long i();

    public abstract long j();

    public abstract long k();

    public abstract int l();

    public final long m() {
        Pair z11 = z(o(), n());
        if (z11 != null) {
            return ((Number) z11.f()).longValue() - ((Number) z11.e()).longValue();
        }
        return 0L;
    }

    public abstract long n();

    public abstract long o();

    public final long p() {
        Pair z11 = z(r(), q());
        if (z11 != null) {
            return ((Number) z11.f()).longValue() - ((Number) z11.e()).longValue();
        }
        return 0L;
    }

    public abstract long q();

    public abstract long r();

    public abstract long s();

    public final long t() {
        Pair z11 = z(v(), u());
        if (z11 != null) {
            return ((Number) z11.f()).longValue() - ((Number) z11.e()).longValue();
        }
        return 0L;
    }

    @NotNull
    public final String toString() {
        long v11 = v();
        long u11 = u();
        long y11 = y();
        long x11 = x();
        long g10 = g();
        long f7 = f();
        long c11 = c();
        long b11 = b();
        long o11 = o();
        long n11 = n();
        long r11 = r();
        long q11 = q();
        long k11 = k();
        long j11 = j();
        long i11 = i();
        long h11 = h();
        NetworkInfo e11 = e();
        int l11 = l();
        long a11 = a();
        long m11 = m();
        long p11 = p();
        long t2 = t();
        long w11 = w();
        long s11 = s();
        long d11 = d();
        StringBuilder d12 = C2702w.d(v11, "\n            ttfbTimeStart=", "\n            ttfbTimeEnd=");
        d12.append(u11);
        C2942q.f(d12, "\n            \n            ttlbTimeStart=", y11, "\n            ttlbTimeEnd=");
        d12.append(x11);
        C2942q.f(d12, "\n            \n            requestPrepareTimeStart=", g10, "\n            requestPrepareTimeEnd=");
        d12.append(f7);
        C2942q.f(d12, "\n            \n            dnsTimeStart=", c11, "\n            dnsTimeEnd=");
        d12.append(b11);
        C2942q.f(d12, "\n            \n            tcpTimeStart=", o11, "\n            tcpTimeEnd=");
        d12.append(n11);
        C2942q.f(d12, "\n            \n            tlsTimeStart=", r11, "\n            tlsTimeEnd=");
        d12.append(q11);
        C2942q.f(d12, "\n            \n            serverTimeStart=", k11, "\n            serverTimeEnd=");
        d12.append(j11);
        C2942q.f(d12, "\n            \n            responseTimeStart=", i11, "\n            responseTimeEnd=");
        d12.append(h11);
        d12.append("\n            \n            networkInfo=");
        d12.append(e11);
        d12.append("\n            statusCode=");
        d12.append(l11);
        d12.append("\n            \n            dnsTime=");
        d12.append(a11);
        C2942q.f(d12, "\n            tcpTime=", m11, "\n            tlsTime=");
        d12.append(p11);
        C2942q.f(d12, "\n            ttfbTime=", t2, "\n            ttlbTime=");
        d12.append(w11);
        C2942q.f(d12, "\n            \n            transferSize=", s11, "\n            encodedSize=");
        d12.append(d11);
        d12.append("\n        ");
        return h.E0(d12.toString());
    }

    public abstract long u();

    public abstract long v();

    public final long w() {
        Pair z11 = z(y(), x());
        if (z11 != null) {
            return ((Number) z11.f()).longValue() - ((Number) z11.e()).longValue();
        }
        return 0L;
    }

    public abstract long x();

    public abstract long y();
}
