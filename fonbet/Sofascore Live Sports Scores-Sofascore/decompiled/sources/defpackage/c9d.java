package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c9d extends c1d {
    public final c1d o;
    public boolean p;

    public c9d(long j, rnh rnhVar, Function1 function1, Function1 function12, c1d c1dVar) {
        super(j, rnhVar, function1, function12);
        this.o = c1dVar;
        c1dVar.k();
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.c1d
    public final oea w() {
        c9d c9dVar;
        c1d c1dVar = this.o;
        if (c1dVar.m || c1dVar.c) {
            return new onh(this);
        }
        y0d y0dVar = this.h;
        long j = this.b;
        HashMap m = y0dVar != null ? snh.m(c1dVar.g(), this, this.o.d()) : null;
        Object obj = snh.c;
        synchronized (obj) {
            try {
                snh.v(this);
                if (y0dVar == null || y0dVar.d == 0) {
                    c9dVar = this;
                    c9dVar.a();
                    Unit unit = Unit.a;
                } else {
                    c9dVar = this;
                    oea z = c9dVar.z(this.o.g(), y0dVar, m, this.o.d());
                    if (!z.equals(pnh.g)) {
                        return z;
                    }
                    y0d x = c9dVar.o.x();
                    if (x != null) {
                        x.j(y0dVar);
                    } else {
                        c9dVar.o.B(y0dVar);
                        c9dVar.h = null;
                    }
                }
                if (Intrinsics.e(c9dVar.o.g(), j) < 0) {
                    c9dVar.o.v();
                }
                c1d c1dVar2 = c9dVar.o;
                c1dVar2.r(c1dVar2.d().c(j).a(c9dVar.j));
                c9dVar.o.A(j);
                c1d c1dVar3 = c9dVar.o;
                int i = c9dVar.d;
                c9dVar.d = -1;
                if (i >= 0) {
                    int[] iArr = c1dVar3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    c1dVar3.k = copyOf;
                } else {
                    c1dVar3.getClass();
                }
                c1d c1dVar4 = c9dVar.o;
                rnh rnhVar = c9dVar.j;
                c1dVar4.getClass();
                synchronized (obj) {
                    c1dVar4.j = c1dVar4.j.e(rnhVar);
                    Unit unit2 = Unit.a;
                    c1d c1dVar5 = c9dVar.o;
                    int[] iArr2 = c9dVar.k;
                    c1dVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c1dVar5.k;
                        if (iArr3.length != 0) {
                            iArr2 = mh0.p(iArr3, iArr2);
                        }
                        c1dVar5.k = iArr2;
                    }
                }
                c9dVar.m = true;
                if (!c9dVar.p) {
                    c9dVar.p = true;
                    c9dVar.o.l();
                }
                return pnh.g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
