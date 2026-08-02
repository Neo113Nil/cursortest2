package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.l;
import java.util.ArrayList;
import java.util.List;
import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public n f35706a;

    /* renamed from: b, reason: collision with root package name */
    public final List f35707b = new ArrayList();

    public m(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35707b.add(new l.a());
        }
    }

    public abstract void a();

    public float b(int i10, int i11, int i12) {
        return AbstractC6307a.a((i10 - i11) / i12, 0.0f, 1.0f);
    }

    public abstract void c();

    public abstract void d(androidx.vectordrawable.graphics.drawable.b bVar);

    public void e(n nVar) {
        this.f35706a = nVar;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}
