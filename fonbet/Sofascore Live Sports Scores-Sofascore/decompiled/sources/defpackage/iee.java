package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class iee extends dee {
    public final gee e;
    public Object f;
    public boolean g;
    public int h;

    public iee(gee geeVar, w0k[] w0kVarArr) {
        super(geeVar.c, w0kVarArr);
        this.e = geeVar;
        this.h = geeVar.e;
    }

    public final void f(int i, v0k v0kVar, Object obj, int i2) {
        w0k[] w0kVarArr = (w0k[]) this.d;
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int U = 1 << aik.U(i, i3);
            if (v0kVar.h(U)) {
                w0kVarArr[i2].a(Integer.bitCount(v0kVar.a) * 2, v0kVar.f(U), v0kVar.d);
                this.b = i2;
                return;
            }
            int t = v0kVar.t(U);
            v0k s = v0kVar.s(t);
            w0kVarArr[i2].a(Integer.bitCount(v0kVar.a) * 2, t, v0kVar.d);
            f(i, s, obj, i2 + 1);
            return;
        }
        w0k w0kVar = w0kVarArr[i2];
        Object[] objArr = v0kVar.d;
        w0kVar.a(objArr.length, 0, objArr);
        while (true) {
            w0k w0kVar2 = w0kVarArr[i2];
            if (Intrinsics.c(w0kVar2.b[w0kVar2.d], obj)) {
                this.b = i2;
                return;
            } else {
                w0kVarArr[i2].d += 2;
            }
        }
    }

    @Override // defpackage.dee, java.util.Iterator
    public final Object next() {
        if (this.e.e != this.h) {
            a70.o();
            return null;
        }
        if (!this.c) {
            yhk.d();
            return null;
        }
        w0k w0kVar = ((w0k[]) this.d)[this.b];
        this.f = w0kVar.b[w0kVar.d];
        this.g = true;
        return super.next();
    }

    @Override // defpackage.dee, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            zzl.s();
            return;
        }
        boolean z = this.c;
        gee geeVar = this.e;
        if (!z) {
            i5k.c(geeVar).remove(this.f);
        } else {
            if (!z) {
                yhk.d();
                return;
            }
            w0k w0kVar = ((w0k[]) this.d)[this.b];
            Object obj = w0kVar.b[w0kVar.d];
            i5k.c(geeVar).remove(this.f);
            f(obj != null ? obj.hashCode() : 0, geeVar.c, obj, 0);
        }
        this.f = null;
        this.g = false;
        this.h = geeVar.e;
    }
}
