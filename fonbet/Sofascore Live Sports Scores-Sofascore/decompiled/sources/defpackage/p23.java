package defpackage;

import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p23 {
    public final e1d a;
    public final e1d b;
    public final e1d c;
    public final e1d d;
    public final e1d e;
    public final e1d f;
    public final e1d g;
    public final e1d h;
    public final e1d i;
    public final e1d j;
    public final e1d k;
    public final e1d l;
    public final e1d m;

    public p23(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        r13 r13Var = new r13(j);
        wib wibVar = wib.i;
        this.a = e.e(r13Var, wibVar);
        this.b = e.e(new r13(j2), wibVar);
        this.c = e.e(new r13(j3), wibVar);
        this.d = e.e(new r13(j4), wibVar);
        this.e = e.e(new r13(j5), wibVar);
        this.f = e.e(new r13(j6), wibVar);
        this.g = e.e(new r13(j7), wibVar);
        this.h = e.e(new r13(j8), wibVar);
        this.i = e.e(new r13(j9), wibVar);
        this.j = e.e(new r13(j10), wibVar);
        this.k = e.e(new r13(j11), wibVar);
        this.l = e.e(new r13(j12), wibVar);
        this.m = e.e(Boolean.valueOf(z), wibVar);
    }

    public final long a() {
        return ((r13) ((eoh) this.k).getValue()).a;
    }

    public final long b() {
        return ((r13) ((eoh) this.a).getValue()).a;
    }

    public final long c() {
        return ((r13) ((eoh) this.f).getValue()).a;
    }

    public final boolean d() {
        return ((Boolean) ((eoh) this.m).getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) r13.i(b()));
        sb.append(", primaryVariant=");
        vxd.q(((r13) ((eoh) this.b).getValue()).a, ", secondary=", sb);
        vxd.q(((r13) ((eoh) this.c).getValue()).a, ", secondaryVariant=", sb);
        vxd.q(((r13) ((eoh) this.d).getValue()).a, ", background=", sb);
        sb.append((Object) r13.i(((r13) ((eoh) this.e).getValue()).a));
        sb.append(", surface=");
        sb.append((Object) r13.i(c()));
        sb.append(", error=");
        vxd.q(((r13) ((eoh) this.g).getValue()).a, ", onPrimary=", sb);
        vxd.q(((r13) ((eoh) this.h).getValue()).a, ", onSecondary=", sb);
        vxd.q(((r13) ((eoh) this.i).getValue()).a, ", onBackground=", sb);
        sb.append((Object) r13.i(((r13) ((eoh) this.j).getValue()).a));
        sb.append(", onSurface=");
        sb.append((Object) r13.i(a()));
        sb.append(", onError=");
        sb.append((Object) r13.i(((r13) ((eoh) this.l).getValue()).a));
        sb.append(", isLight=");
        sb.append(d());
        sb.append(')');
        return sb.toString();
    }
}
