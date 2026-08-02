package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f2521a;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f2522b;

    public q2(p2 p2Var) {
        this.f2521a = p2Var;
        o2 o2Var = new o2();
        o2Var.f2497a = 0;
        this.f2522b = o2Var;
    }

    public final View a(int i5, int i10, int i11, int i12) {
        p2 p2Var = this.f2521a;
        int b10 = p2Var.b();
        int c2 = p2Var.c();
        int i13 = i10 > i5 ? 1 : -1;
        View view = null;
        while (i5 != i10) {
            View d10 = p2Var.d(i5);
            int a7 = p2Var.a(d10);
            int e7 = p2Var.e(d10);
            o2 o2Var = this.f2522b;
            o2Var.f2498b = b10;
            o2Var.f2499c = c2;
            o2Var.f2500d = a7;
            o2Var.f2501e = e7;
            if (i11 != 0) {
                o2Var.f2497a = i11;
                if (o2Var.a()) {
                    return d10;
                }
            }
            if (i12 != 0) {
                o2Var.f2497a = i12;
                if (o2Var.a()) {
                    view = d10;
                }
            }
            i5 += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        p2 p2Var = this.f2521a;
        int b10 = p2Var.b();
        int c2 = p2Var.c();
        int a7 = p2Var.a(view);
        int e7 = p2Var.e(view);
        o2 o2Var = this.f2522b;
        o2Var.f2498b = b10;
        o2Var.f2499c = c2;
        o2Var.f2500d = a7;
        o2Var.f2501e = e7;
        o2Var.f2497a = 24579;
        return o2Var.a();
    }
}
