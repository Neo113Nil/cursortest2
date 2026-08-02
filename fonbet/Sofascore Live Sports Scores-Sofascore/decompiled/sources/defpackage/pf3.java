package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pf3 {
    public final av8 a;
    public hn2 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final e7a d = new e7a(1, false);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public pf3(av8 av8Var, hn2 hn2Var) {
        this.a = av8Var;
        this.b = hn2Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            evd evdVar = this.b.k;
            evdVar.l0(avd.c);
            evdVar.e[evdVar.f - evdVar.c[evdVar.d - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        hn2 hn2Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        hn2Var.getClass();
        if (size != 0) {
            evd evdVar2 = hn2Var.k;
            evdVar2.l0(aud.c);
            wba.H(evdVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                evd evdVar = this.b.k;
                evdVar.l0(qud.c);
                int i3 = evdVar.f - evdVar.c[evdVar.d - 1].a;
                int[] iArr = evdVar.e;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                evd evdVar2 = this.b.k;
                evdVar2.l0(lud.c);
                int i6 = evdVar2.f - evdVar2.c[evdVar2.d - 1].a;
                int[] iArr2 = evdVar2.e;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        ilh ilhVar = this.a.G;
        int i = z ? ilhVar.i : ilhVar.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            sf3.a("Tried to seek backward");
        }
        if (i2 > 0) {
            evd evdVar = this.b.k;
            evdVar.l0(ttd.c);
            evdVar.e[evdVar.f - evdVar.c[evdVar.d - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        ilh ilhVar = this.a.G;
        if (ilhVar.c > 0) {
            int i = ilhVar.i;
            e7a e7aVar = this.d;
            if (e7aVar.c(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.k.l0(gud.c);
                    this.c = true;
                }
                if (i > 0) {
                    vu8 a = ilhVar.a(i);
                    e7aVar.e(i);
                    d(false);
                    evd evdVar = this.b.k;
                    evdVar.l0(fud.c);
                    wba.H(evdVar, 0, a);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                sf3.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
