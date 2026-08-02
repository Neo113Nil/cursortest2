package androidx.recyclerview.widget;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements w7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2437a;

    /* renamed from: b, reason: collision with root package name */
    public long f2438b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2439c;

    public /* synthetic */ j(int i5, long j, Object obj) {
        this.f2437a = i5;
        this.f2439c = obj;
        this.f2438b = j;
    }

    public void a(int i5) {
        if (i5 < 64) {
            this.f2438b &= ~(1 << i5);
            return;
        }
        j jVar = (j) this.f2439c;
        if (jVar != null) {
            jVar.a(i5 - 64);
        }
    }

    public int b(int i5) {
        j jVar = (j) this.f2439c;
        if (jVar == null) {
            return i5 >= 64 ? Long.bitCount(this.f2438b) : Long.bitCount(this.f2438b & ((1 << i5) - 1));
        }
        if (i5 < 64) {
            return Long.bitCount(this.f2438b & ((1 << i5) - 1));
        }
        return Long.bitCount(this.f2438b) + jVar.b(i5 - 64);
    }

    @Override // w7.c
    public void c(Exception exc) {
        ConnectionResult connectionResult;
        switch (this.f2437a) {
            case 2:
                com.google.android.gms.ads.identifier.c cVar = (com.google.android.gms.ads.identifier.c) this.f2439c;
                long j = this.f2438b;
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof d6.e) && (connectionResult = ((d6.e) exc).f8245a.f4469d) != null && connectionResult.f4441b == 24) {
                    cVar.f4240b.set(j);
                    break;
                }
                break;
            default:
                ((AtomicLong) ((kh.g) this.f2439c).f19117d).set(this.f2438b);
                break;
        }
    }

    public void d() {
        if (((j) this.f2439c) == null) {
            this.f2439c = new j();
        }
    }

    public boolean e(int i5) {
        if (i5 < 64) {
            return (this.f2438b & (1 << i5)) != 0;
        }
        d();
        return ((j) this.f2439c).e(i5 - 64);
    }

    public void f(int i5, boolean z5) {
        if (i5 >= 64) {
            d();
            ((j) this.f2439c).f(i5 - 64, z5);
            return;
        }
        long j = this.f2438b;
        boolean z7 = (Long.MIN_VALUE & j) != 0;
        long j6 = (1 << i5) - 1;
        this.f2438b = ((j & (~j6)) << 1) | (j & j6);
        if (z5) {
            j(i5);
        } else {
            a(i5);
        }
        if (z7 || ((j) this.f2439c) != null) {
            d();
            ((j) this.f2439c).f(0, z7);
        }
    }

    public Headers g() {
        gh.v vVar = new gh.v();
        while (true) {
            String line = ((BufferedSource) this.f2439c).readUtf8LineStrict(this.f2438b);
            this.f2438b -= line.length();
            if (line.length() == 0) {
                return vVar.d();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            int F = StringsKt.F(line, ':', 1, false, 4);
            if (F != -1) {
                String substring = line.substring(0, F);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String substring2 = line.substring(F + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                vVar.b(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                vVar.b("", substring3);
            } else {
                vVar.b("", line);
            }
        }
    }

    public boolean h(int i5) {
        if (i5 >= 64) {
            d();
            return ((j) this.f2439c).h(i5 - 64);
        }
        long j = 1 << i5;
        long j6 = this.f2438b;
        boolean z5 = (j6 & j) != 0;
        long j10 = j6 & (~j);
        this.f2438b = j10;
        long j11 = j - 1;
        this.f2438b = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
        j jVar = (j) this.f2439c;
        if (jVar != null) {
            if (jVar.e(0)) {
                j(63);
            }
            ((j) this.f2439c).h(0);
        }
        return z5;
    }

    public void i() {
        this.f2438b = 0L;
        j jVar = (j) this.f2439c;
        if (jVar != null) {
            jVar.i();
        }
    }

    public void j(int i5) {
        if (i5 < 64) {
            this.f2438b |= 1 << i5;
        } else {
            d();
            ((j) this.f2439c).j(i5 - 64);
        }
    }

    public String toString() {
        switch (this.f2437a) {
            case 0:
                if (((j) this.f2439c) == null) {
                    return Long.toBinaryString(this.f2438b);
                }
                return ((j) this.f2439c).toString() + "xx" + Long.toBinaryString(this.f2438b);
            default:
                return super.toString();
        }
    }

    public j(CharSequence charSequence) {
        this.f2437a = 1;
        this.f2439c = charSequence;
        this.f2438b = System.currentTimeMillis();
    }

    public j(q6.a aVar) {
        this.f2437a = 5;
        g6.v.h(aVar);
        this.f2439c = aVar;
    }

    public j(BufferedSource source) {
        this.f2437a = 3;
        Intrinsics.checkNotNullParameter(source, "source");
        this.f2439c = source;
        this.f2438b = 262144L;
    }

    public j() {
        this.f2437a = 0;
        this.f2438b = 0L;
    }
}
