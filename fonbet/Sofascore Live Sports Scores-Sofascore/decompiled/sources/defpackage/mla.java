package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mla {
    public final List a;
    public final plb b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final x50 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final r50 q;
    public final f4a r;
    public final s50 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final hpo w;
    public final p03 x;
    public final int y;

    public mla(List list, plb plbVar, String str, long j, int i, long j2, String str2, List list2, x50 x50Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, r50 r50Var, f4a f4aVar, List list3, int i5, s50 s50Var, boolean z, hpo hpoVar, p03 p03Var, int i6) {
        this.a = list;
        this.b = plbVar;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = x50Var;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = r50Var;
        this.r = f4aVar;
        this.t = list3;
        this.u = i5;
        this.s = s50Var;
        this.v = z;
        this.w = hpoVar;
        this.x = p03Var;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.c);
        sb.append("\n");
        long j = this.f;
        plb plbVar = this.b;
        mla mlaVar = (mla) plbVar.i.c(j);
        if (mlaVar != null) {
            sb.append("\t\tParents: ");
            sb.append(mlaVar.c);
            for (mla mlaVar2 = (mla) plbVar.i.c(mlaVar.f); mlaVar2 != null; mlaVar2 = (mla) plbVar.i.c(mlaVar2.f)) {
                sb.append("->");
                sb.append(mlaVar2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
