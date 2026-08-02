package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls7j;", "Lbuc;", "Lv7j;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s7j extends buc {
    public final q80 a;
    public final dfj b;
    public final sf8 c;
    public final Function1 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final Function1 j;
    public final c23 k;
    public final es0 l;
    public final Function1 m;

    public s7j(q80 q80Var, dfj dfjVar, sf8 sf8Var, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, c23 c23Var, es0 es0Var, Function1 function13) {
        this.a = q80Var;
        this.b = dfjVar;
        this.c = sf8Var;
        this.d = function1;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = function12;
        this.k = c23Var;
        this.l = es0Var;
        this.m = function13;
    }

    @Override // defpackage.buc
    public final wtc c() {
        v7j v7jVar = new v7j();
        v7jVar.o = this.a;
        v7jVar.p = this.b;
        v7jVar.q = this.c;
        v7jVar.r = this.d;
        v7jVar.s = this.e;
        v7jVar.t = this.f;
        v7jVar.u = this.g;
        v7jVar.v = this.h;
        v7jVar.w = this.i;
        v7jVar.x = this.j;
        v7jVar.y = this.k;
        v7jVar.z = this.l;
        v7jVar.A = this.m;
        return v7jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7j)) {
            return false;
        }
        s7j s7jVar = (s7j) obj;
        return Intrinsics.c(this.k, s7jVar.k) && Intrinsics.c(this.a, s7jVar.a) && Intrinsics.c(this.b, s7jVar.b) && Intrinsics.c(this.i, s7jVar.i) && Intrinsics.c(this.c, s7jVar.c) && this.d == s7jVar.d && this.m == s7jVar.m && this.e == s7jVar.e && this.f == s7jVar.f && this.g == s7jVar.g && this.h == s7jVar.h && this.j == s7jVar.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.a.c(r0.a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    @Override // defpackage.buc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(wtc wtcVar) {
        boolean z;
        boolean c;
        boolean z2;
        List list;
        List list2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        sf8 sf8Var;
        sf8 sf8Var2;
        int i5;
        int i6;
        es0 es0Var;
        es0 es0Var2;
        Function1 function1;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        v7j v7jVar = (v7j) wtcVar;
        c23 c23Var = v7jVar.y;
        c23 c23Var2 = this.k;
        boolean c2 = Intrinsics.c(c23Var2, c23Var);
        v7jVar.y = c23Var2;
        boolean z5 = false;
        boolean z6 = true;
        dfj dfjVar = this.b;
        if (c2) {
            dfj dfjVar2 = v7jVar.p;
            if (dfjVar == dfjVar2) {
                dfjVar.getClass();
            }
            z = false;
            String str = v7jVar.o.b;
            q80 q80Var = this.a;
            c = Intrinsics.c(str, q80Var.b);
            z2 = c || !Intrinsics.c(v7jVar.o.a, q80Var.a);
            if (z2) {
                v7jVar.o = q80Var;
            }
            if (!c) {
                v7jVar.E = null;
            }
            boolean z7 = !v7jVar.p.d(dfjVar);
            v7jVar.p = dfjVar;
            list = v7jVar.w;
            list2 = this.i;
            if (!Intrinsics.c(list, list2)) {
                v7jVar.w = list2;
                z7 = true;
            }
            i = v7jVar.v;
            i2 = this.h;
            if (i != i2) {
                v7jVar.v = i2;
                z7 = true;
            }
            i3 = v7jVar.u;
            i4 = this.g;
            if (i3 != i4) {
                v7jVar.u = i4;
                z7 = true;
            }
            z3 = v7jVar.t;
            z4 = this.f;
            if (z3 != z4) {
                v7jVar.t = z4;
                z7 = true;
            }
            sf8Var = v7jVar.q;
            sf8Var2 = this.c;
            if (!Intrinsics.c(sf8Var, sf8Var2)) {
                v7jVar.q = sf8Var2;
                z7 = true;
            }
            i5 = v7jVar.s;
            i6 = this.e;
            if (i5 != i6) {
                v7jVar.s = i6;
                z7 = true;
            }
            es0Var = v7jVar.z;
            es0Var2 = this.l;
            if (!Intrinsics.c(es0Var, es0Var2)) {
                v7jVar.z = es0Var2;
                z7 = true;
            }
            function1 = v7jVar.r;
            function12 = this.d;
            if (function1 != function12) {
                v7jVar.r = function12;
                z5 = true;
            }
            function13 = v7jVar.x;
            function14 = this.j;
            if (function13 != function14) {
                v7jVar.x = function14;
                z5 = true;
            }
            function15 = v7jVar.A;
            function16 = this.m;
            if (function15 == function16) {
                v7jVar.A = function16;
            } else {
                z6 = z5;
            }
            if (!z2 || z7 || z6) {
                hyc k1 = v7jVar.k1();
                q80 q80Var2 = v7jVar.o;
                dfj dfjVar3 = v7jVar.p;
                sf8 sf8Var3 = v7jVar.q;
                int i7 = v7jVar.s;
                boolean z8 = v7jVar.t;
                int i8 = v7jVar.u;
                int i9 = v7jVar.v;
                List list3 = v7jVar.w;
                es0 es0Var3 = v7jVar.z;
                k1.a = q80Var2;
                k1.f(dfjVar3);
                k1.b = sf8Var3;
                k1.c = i7;
                k1.d = z8;
                k1.e = i8;
                k1.f = i9;
                k1.g = list3;
                k1.h = es0Var3;
                k1.s = (k1.s << 2) | 2;
                k1.m = null;
                k1.o = null;
                k1.q = -1;
                k1.p = -1;
                k1.r = null;
            }
            if (v7jVar.n) {
                return;
            }
            if (z2 || (z && v7jVar.D != null)) {
                sea.p(v7jVar);
            }
            if (z2 || z7 || z6) {
                y6a.E(v7jVar);
                n9e.E(v7jVar);
            }
            if (z) {
                n9e.E(v7jVar);
                return;
            }
            return;
        }
        z = true;
        String str2 = v7jVar.o.b;
        q80 q80Var3 = this.a;
        c = Intrinsics.c(str2, q80Var3.b);
        if (c) {
        }
        if (z2) {
        }
        if (!c) {
        }
        boolean z72 = !v7jVar.p.d(dfjVar);
        v7jVar.p = dfjVar;
        list = v7jVar.w;
        list2 = this.i;
        if (!Intrinsics.c(list, list2)) {
        }
        i = v7jVar.v;
        i2 = this.h;
        if (i != i2) {
        }
        i3 = v7jVar.u;
        i4 = this.g;
        if (i3 != i4) {
        }
        z3 = v7jVar.t;
        z4 = this.f;
        if (z3 != z4) {
        }
        sf8Var = v7jVar.q;
        sf8Var2 = this.c;
        if (!Intrinsics.c(sf8Var, sf8Var2)) {
        }
        i5 = v7jVar.s;
        i6 = this.e;
        if (i5 != i6) {
        }
        es0Var = v7jVar.z;
        es0Var2 = this.l;
        if (!Intrinsics.c(es0Var, es0Var2)) {
        }
        function1 = v7jVar.r;
        function12 = this.d;
        if (function1 != function12) {
        }
        function13 = v7jVar.x;
        function14 = this.j;
        if (function13 != function14) {
        }
        function15 = v7jVar.A;
        function16 = this.m;
        if (function15 == function16) {
        }
        if (!z2) {
        }
        hyc k12 = v7jVar.k1();
        q80 q80Var22 = v7jVar.o;
        dfj dfjVar32 = v7jVar.p;
        sf8 sf8Var32 = v7jVar.q;
        int i72 = v7jVar.s;
        boolean z82 = v7jVar.t;
        int i82 = v7jVar.u;
        int i92 = v7jVar.v;
        List list32 = v7jVar.w;
        es0 es0Var32 = v7jVar.z;
        k12.a = q80Var22;
        k12.f(dfjVar32);
        k12.b = sf8Var32;
        k12.c = i72;
        k12.d = z82;
        k12.e = i82;
        k12.f = i92;
        k12.g = list32;
        k12.h = es0Var32;
        k12.s = (k12.s << 2) | 2;
        k12.m = null;
        k12.o = null;
        k12.q = -1;
        k12.p = -1;
        k12.r = null;
        if (v7jVar.n) {
        }
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + dmi.f(this.b, this.a.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.d;
        int e = (((dmi.e(wv8.a(this.e, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int hashCode2 = (e + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.j;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        c23 c23Var = this.k;
        int hashCode4 = (hashCode3 + (c23Var != null ? c23Var.hashCode() : 0)) * 31;
        Function1 function13 = this.m;
        return hashCode4 + (function13 != null ? function13.hashCode() : 0);
    }
}
