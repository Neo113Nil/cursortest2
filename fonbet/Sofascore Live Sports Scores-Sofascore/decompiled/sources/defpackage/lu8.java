package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class lu8 implements Comparable<lu8> {

    @NotNull
    public static final ku8 Companion = new ku8();
    public static final joa[] j;
    public final int a;
    public final int b;
    public final int c;
    public final m2l d;
    public final int e;
    public final int f;
    public final zuc g;
    public final int h;
    public final long i;

    static {
        ysa ysaVar = ysa.b;
        j = new joa[]{null, null, null, ypa.a(ysaVar, new xt8(12)), null, null, ypa.a(ysaVar, new xt8(13)), null, null};
        xg4.a(0L);
    }

    public /* synthetic */ lu8(int i, int i2, int i3, int i4, m2l m2lVar, int i5, int i6, zuc zucVar, int i7, long j2) {
        if (511 != (i & 511)) {
            oea.z(i, 511, ju8.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = m2lVar;
        this.e = i5;
        this.f = i6;
        this.g = zucVar;
        this.h = i7;
        this.i = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(lu8 lu8Var) {
        lu8 lu8Var2 = lu8Var;
        lu8Var2.getClass();
        return Intrinsics.e(this.i, lu8Var2.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu8)) {
            return false;
        }
        lu8 lu8Var = (lu8) obj;
        return this.a == lu8Var.a && this.b == lu8Var.b && this.c == lu8Var.c && this.d == lu8Var.d && this.e == lu8Var.e && this.f == lu8Var.f && this.g == lu8Var.g && this.h == lu8Var.h && this.i == lu8Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + wv8.a(this.h, (this.g.hashCode() + wv8.a(this.f, wv8.a(this.e, (this.d.hashCode() + wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.a);
        sb.append(", minutes=");
        sb.append(this.b);
        sb.append(", hours=");
        sb.append(this.c);
        sb.append(", dayOfWeek=");
        sb.append(this.d);
        sb.append(", dayOfMonth=");
        sb.append(this.e);
        sb.append(", dayOfYear=");
        sb.append(this.f);
        sb.append(", month=");
        sb.append(this.g);
        sb.append(", year=");
        sb.append(this.h);
        sb.append(", timestamp=");
        return fn0.n(sb, this.i, ')');
    }

    public lu8(int i, int i2, int i3, m2l m2lVar, int i4, int i5, zuc zucVar, int i6, long j2) {
        m2lVar.getClass();
        zucVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = m2lVar;
        this.e = i4;
        this.f = i5;
        this.g = zucVar;
        this.h = i6;
        this.i = j2;
    }
}
