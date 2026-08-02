package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class hee extends dee {
    public final fee e;
    public Object f;
    public boolean g;
    public int h;

    public hee(fee feeVar, w0k[] w0kVarArr) {
        super(feeVar.c, w0kVarArr);
        this.e = feeVar;
        this.h = feeVar.e;
    }

    public final void f(int i, u0k u0kVar, Object obj, int i2, int i3, boolean z) {
        int i4;
        w0k[] w0kVarArr = (w0k[]) this.d;
        int i5 = i2 * 5;
        if (i5 <= 30) {
            int D = 1 << cga.D(i, i5);
            if (!u0kVar.i(D)) {
                int t = u0kVar.t(D);
                u0k s = u0kVar.s(t);
                w0k w0kVar = w0kVarArr[i2];
                Object[] objArr = u0kVar.d;
                int bitCount = Integer.bitCount(u0kVar.a) * 2;
                w0kVar.getClass();
                objArr.getClass();
                w0kVar.b = objArr;
                w0kVar.c = bitCount;
                w0kVar.d = t;
                f(i, s, obj, i2 + 1, i3, z);
                return;
            }
            int f = u0kVar.f(D);
            if (D == (z ? 1 << cga.D(i3, i5) : 0) && i2 < (i4 = this.b)) {
                w0k w0kVar2 = w0kVarArr[i4];
                Object[] objArr2 = u0kVar.d;
                Object[] objArr3 = {objArr2[f], objArr2[f + 1]};
                w0kVar2.getClass();
                w0kVar2.b = objArr3;
                w0kVar2.c = 2;
                w0kVar2.d = 0;
                return;
            }
            w0k w0kVar3 = w0kVarArr[i2];
            Object[] objArr4 = u0kVar.d;
            int bitCount2 = Integer.bitCount(u0kVar.a) * 2;
            w0kVar3.getClass();
            objArr4.getClass();
            w0kVar3.b = objArr4;
            w0kVar3.c = bitCount2;
            w0kVar3.d = f;
            this.b = i2;
            return;
        }
        w0k w0kVar4 = w0kVarArr[i2];
        Object[] objArr5 = u0kVar.d;
        int length = objArr5.length;
        w0kVar4.getClass();
        w0kVar4.b = objArr5;
        w0kVar4.c = length;
        w0kVar4.d = 0;
        while (true) {
            w0k w0kVar5 = w0kVarArr[i2];
            if (Intrinsics.c(w0kVar5.b[w0kVar5.d], obj)) {
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
        hee heeVar;
        if (!this.g) {
            zzl.s();
            return;
        }
        boolean z = this.c;
        fee feeVar = this.e;
        if (!z) {
            heeVar = this;
            i5k.c(feeVar).remove(heeVar.f);
        } else {
            if (!z) {
                yhk.d();
                return;
            }
            w0k w0kVar = ((w0k[]) this.d)[this.b];
            Object obj = w0kVar.b[w0kVar.d];
            i5k.c(feeVar).remove(this.f);
            int hashCode = obj != null ? obj.hashCode() : 0;
            u0k u0kVar = feeVar.c;
            Object obj2 = this.f;
            heeVar = this;
            heeVar.f(hashCode, u0kVar, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        heeVar.f = null;
        heeVar.g = false;
        heeVar.h = feeVar.e;
    }
}
