package com.google.android.gms.internal.play_billing;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f3 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final g3 f5449a;

    /* renamed from: b, reason: collision with root package name */
    public g3 f5450b;

    public f3(g3 g3Var) {
        this.f5449a = g3Var;
        if (g3Var.c()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5450b = (g3) g3Var.d(4);
    }

    public static void a(int i5, List list) {
        String f6 = d9.e.f(list.size() - i5, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i5) {
                throw new NullPointerException(f6);
            }
            list.remove(size);
        }
    }

    public final g3 b() {
        g3 d10 = d();
        if (g3.m(d10, true)) {
            return d10;
        }
        throw new g4();
    }

    public final Object clone() {
        f3 f3Var = (f3) this.f5449a.d(5);
        f3Var.f5450b = d();
        return f3Var;
    }

    public final g3 d() {
        if (!this.f5450b.c()) {
            return this.f5450b;
        }
        g3 g3Var = this.f5450b;
        g3Var.getClass();
        a4.f5397c.a(g3Var.getClass()).a(g3Var);
        g3Var.j();
        return this.f5450b;
    }

    public final void e() {
        if (this.f5450b.c()) {
            return;
        }
        g3 g3Var = (g3) this.f5449a.d(4);
        a4.f5397c.a(g3Var.getClass()).e(g3Var, this.f5450b);
        this.f5450b = g3Var;
    }
}
