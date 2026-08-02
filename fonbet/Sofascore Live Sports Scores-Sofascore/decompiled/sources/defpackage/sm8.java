package defpackage;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sm8 implements i72 {
    public static final sm8 G = new sm8(new pm8());
    public static final hg6 H = new hg6(27);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public int F;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final Metadata j;
    public final String k;
    public final String l;
    public final int m;
    public final List n;
    public final DrmInitData o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final v13 x;
    public final int y;
    public final int z;

    public sm8(pm8 pm8Var) {
        this.a = pm8Var.a;
        this.b = pm8Var.b;
        this.c = lik.z(pm8Var.c);
        this.d = pm8Var.d;
        this.e = pm8Var.e;
        int i = pm8Var.f;
        this.f = i;
        int i2 = pm8Var.g;
        this.g = i2;
        this.h = i2 != -1 ? i2 : i;
        this.i = pm8Var.h;
        this.j = pm8Var.i;
        this.k = pm8Var.j;
        this.l = pm8Var.k;
        this.m = pm8Var.l;
        List list = pm8Var.m;
        this.n = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = pm8Var.n;
        this.o = drmInitData;
        this.p = pm8Var.o;
        this.q = pm8Var.p;
        this.r = pm8Var.q;
        this.s = pm8Var.r;
        int i3 = pm8Var.s;
        this.t = i3 == -1 ? 0 : i3;
        float f = pm8Var.t;
        this.u = f == -1.0f ? 1.0f : f;
        this.v = pm8Var.u;
        this.w = pm8Var.v;
        this.x = pm8Var.w;
        this.y = pm8Var.x;
        this.z = pm8Var.y;
        this.A = pm8Var.z;
        int i4 = pm8Var.A;
        this.B = i4 == -1 ? 0 : i4;
        int i5 = pm8Var.B;
        this.C = i5 != -1 ? i5 : 0;
        this.D = pm8Var.C;
        int i6 = pm8Var.D;
        if (i6 != 0 || drmInitData == null) {
            this.E = i6;
        } else {
            this.E = 1;
        }
    }

    public final pm8 a() {
        pm8 pm8Var = new pm8();
        pm8Var.a = this.a;
        pm8Var.b = this.b;
        pm8Var.c = this.c;
        pm8Var.d = this.d;
        pm8Var.e = this.e;
        pm8Var.f = this.f;
        pm8Var.g = this.g;
        pm8Var.h = this.i;
        pm8Var.i = this.j;
        pm8Var.j = this.k;
        pm8Var.k = this.l;
        pm8Var.l = this.m;
        pm8Var.m = this.n;
        pm8Var.n = this.o;
        pm8Var.o = this.p;
        pm8Var.p = this.q;
        pm8Var.q = this.r;
        pm8Var.r = this.s;
        pm8Var.s = this.t;
        pm8Var.t = this.u;
        pm8Var.u = this.v;
        pm8Var.v = this.w;
        pm8Var.w = this.x;
        pm8Var.x = this.y;
        pm8Var.y = this.z;
        pm8Var.z = this.A;
        pm8Var.A = this.B;
        pm8Var.B = this.C;
        pm8Var.C = this.D;
        pm8Var.D = this.E;
        return pm8Var;
    }

    public final boolean b(sm8 sm8Var) {
        List list = this.n;
        if (list.size() != sm8Var.n.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) sm8Var.n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && sm8.class == obj.getClass()) {
            sm8 sm8Var = (sm8) obj;
            int i2 = this.F;
            if ((i2 == 0 || (i = sm8Var.F) == 0 || i2 == i) && this.d == sm8Var.d && this.e == sm8Var.e && this.f == sm8Var.f && this.g == sm8Var.g && this.m == sm8Var.m && this.p == sm8Var.p && this.q == sm8Var.q && this.r == sm8Var.r && this.t == sm8Var.t && this.w == sm8Var.w && this.y == sm8Var.y && this.z == sm8Var.z && this.A == sm8Var.A && this.B == sm8Var.B && this.C == sm8Var.C && this.D == sm8Var.D && this.E == sm8Var.E && Float.compare(this.s, sm8Var.s) == 0 && Float.compare(this.u, sm8Var.u) == 0 && lik.a(this.a, sm8Var.a) && lik.a(this.b, sm8Var.b) && lik.a(this.i, sm8Var.i) && lik.a(this.k, sm8Var.k) && lik.a(this.l, sm8Var.l) && lik.a(this.c, sm8Var.c) && Arrays.equals(this.v, sm8Var.v) && lik.a(this.j, sm8Var.j) && lik.a(this.x, sm8Var.x) && lik.a(this.o, sm8Var.o) && b(sm8Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.F;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31;
        String str4 = this.i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Metadata metadata = this.j;
        int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
        String str5 = this.k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int floatToIntBits = ((((((((((((((((Float.floatToIntBits(this.u) + ((((Float.floatToIntBits(this.s) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31)) * 31) + this.t) * 31)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
        this.F = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", [");
        sb.append(this.q);
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        sb.append(this.s);
        sb.append("], [");
        sb.append(this.y);
        sb.append(", ");
        return fc6.h(this.z, "])", sb);
    }
}
