package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kij {
    public static final Object p = new Object();
    public static final h6c q;
    public Object a = p;
    public h6c b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public u5c i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        v5c v5cVar;
        b78 b78Var = new b78();
        p5c p5cVar = new p5c(0);
        List list = Collections.EMPTY_LIST;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        s5c s5cVar = new s5c();
        z5c z5cVar = z5c.a;
        Uri uri = Uri.EMPTY;
        z1a.E(((Uri) p5cVar.c) == null || ((UUID) p5cVar.b) != null);
        if (uri != null) {
            v5cVar = new v5c(uri, null, ((UUID) p5cVar.b) != null ? new q5c(p5cVar) : null, null, list, null, vvfVar, C.TIME_UNSET);
        } else {
            v5cVar = null;
        }
        q = new h6c("androidx.media3.common.Timeline", new m5c(b78Var), v5cVar, new u5c(s5cVar), q6c.D, z5cVar);
        wt3.s(1, 2, 3, 4, 5);
        wt3.s(6, 7, 8, 9, 10);
        nik.N(11);
        nik.N(12);
        nik.N(13);
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(Object obj, h6c h6cVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, u5c u5cVar, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.b = h6cVar != null ? h6cVar : q;
        if (h6cVar != null) {
            v5c v5cVar = h6cVar.b;
        }
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = u5cVar;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kij.class.equals(obj.getClass())) {
            return false;
        }
        kij kijVar = (kij) obj;
        return Objects.equals(this.a, kijVar.a) && Objects.equals(this.b, kijVar.b) && Objects.equals(this.c, kijVar.c) && Objects.equals(this.i, kijVar.i) && this.d == kijVar.d && this.e == kijVar.e && this.f == kijVar.f && this.g == kijVar.g && this.h == kijVar.h && this.j == kijVar.j && this.k == kijVar.k && this.l == kijVar.l && this.m == kijVar.m && this.n == kijVar.n && this.o == kijVar.o;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        u5c u5cVar = this.i;
        int hashCode3 = (hashCode2 + (u5cVar != null ? u5cVar.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
