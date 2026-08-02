package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mrk {
    public final lrk a;
    public final k12 b;

    public mrk(lrk lrkVar) {
        this.a = lrkVar;
        k12 k12Var = new k12();
        k12Var.a = 0;
        this.b = k12Var;
    }

    public final View a(int i, int i2, int i3, int i4) {
        lrk lrkVar = this.a;
        int f = lrkVar.f();
        int s = lrkVar.s();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View x = lrkVar.x(i);
            int e = lrkVar.e(x);
            int A = lrkVar.A(x);
            k12 k12Var = this.b;
            k12Var.b = f;
            k12Var.c = s;
            k12Var.d = e;
            k12Var.e = A;
            if (i3 != 0) {
                k12Var.a = i3;
                if (k12Var.a()) {
                    return x;
                }
            }
            if (i4 != 0) {
                k12Var.a = i4;
                if (k12Var.a()) {
                    view = x;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        lrk lrkVar = this.a;
        int f = lrkVar.f();
        int s = lrkVar.s();
        int e = lrkVar.e(view);
        int A = lrkVar.A(view);
        k12 k12Var = this.b;
        k12Var.b = f;
        k12Var.c = s;
        k12Var.d = e;
        k12Var.e = A;
        k12Var.a = 24579;
        return k12Var.a();
    }
}
