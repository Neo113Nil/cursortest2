package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class png implements hmg, pg0 {
    public float a;
    public float b;
    public final Object c;

    public png(j12 j12Var) {
        this.c = new Path();
        if (j12Var == null) {
            return;
        }
        j12Var.r(this);
    }

    @Override // defpackage.hmg
    public void a(float f, float f2, float f3, float f4) {
        ((Path) this.c).quadTo(f, f2, f3, f4);
        this.a = f3;
        this.b = f4;
    }

    @Override // defpackage.pg0
    public void b(kx4 kx4Var, int i, int[] iArr, int[] iArr2) {
        kx4Var.getClass();
        if (iArr.length == 0) {
            return;
        }
        int e0 = kx4Var.e0(this.a);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 > 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        int size = arrayList.size();
        int a = ((lv1) this.c).a(CollectionsKt.K0(arrayList) + (size > 1 ? (size - 1) * e0 : 0), i);
        int length = iArr.length;
        int i4 = 0;
        boolean z = false;
        while (i2 < length) {
            int i5 = iArr[i2];
            int i6 = i4 + 1;
            if (i5 > 0) {
                if (z) {
                    a += e0;
                }
                iArr2[i4] = a;
                a += i5;
                z = true;
            } else {
                iArr2[i4] = a;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.hmg
    public void c(float f, float f2) {
        ((Path) this.c).moveTo(f, f2);
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.hmg
    public void close() {
        ((Path) this.c).close();
    }

    @Override // defpackage.hmg
    public void d(float f, float f2, float f3, float f4, float f5, float f6) {
        ((Path) this.c).cubicTo(f, f2, f3, f4, f5, f6);
        this.a = f5;
        this.b = f6;
    }

    @Override // defpackage.pg0
    public float e() {
        return this.b;
    }

    @Override // defpackage.hmg
    public void f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        vng.n(this.a, this.b, f, f2, f3, z, z2, f4, f5, this);
        this.a = f4;
        this.b = f5;
    }

    @Override // defpackage.hmg
    public void g(float f, float f2) {
        ((Path) this.c).lineTo(f, f2);
        this.a = f;
        this.b = f2;
    }

    public png(float f, lv1 lv1Var) {
        this.a = f;
        this.c = lv1Var;
        this.b = f;
    }
}
