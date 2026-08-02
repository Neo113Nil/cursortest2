package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jij implements i72 {
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static final f6c r;
    public Object a = p;
    public f6c b = r;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public t5c i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        i5c i5cVar = new i5c();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        List list = Collections.EMPTY_LIST;
        av9 av9Var2 = hv9.b;
        vvf vvfVar2 = vvf.e;
        y5c y5cVar = y5c.c;
        Uri uri = Uri.EMPTY;
        r = new f6c("com.google.android.exoplayer2.Timeline", new l5c(i5cVar), uri != null ? new x5c(uri, null, list, vvfVar2) : null, new t5c(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), p6c.G, y5cVar);
    }

    public final boolean a() {
        qx9.t(this.h == (this.i != null));
        return this.i != null;
    }

    public final void b(Object obj, f6c f6cVar, long j, long j2, long j3, boolean z, boolean z2, t5c t5cVar, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.b = f6cVar != null ? f6cVar : r;
        if (f6cVar != null) {
            x5c x5cVar = f6cVar.b;
        }
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = z2;
        this.h = t5cVar != null;
        this.i = t5cVar;
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
        if (obj == null || !jij.class.equals(obj.getClass())) {
            return false;
        }
        jij jijVar = (jij) obj;
        return lik.a(this.a, jijVar.a) && lik.a(this.b, jijVar.b) && lik.a(this.i, jijVar.i) && this.c == jijVar.c && this.d == jijVar.d && this.e == jijVar.e && this.f == jijVar.f && this.g == jijVar.g && this.j == jijVar.j && this.k == jijVar.k && this.l == jijVar.l && this.m == jijVar.m && this.n == jijVar.n && this.o == jijVar.o;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 961;
        t5c t5cVar = this.i;
        int hashCode2 = t5cVar == null ? 0 : t5cVar.hashCode();
        long j = this.c;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
