package w0;

import S0.C3956f1;
import S0.C3987u0;
import androidx.recyclerview.widget.m;
import kotlin.collections.C7705l;
import org.jetbrains.annotations.NotNull;
import x0.C10577F;
import x0.C10621z;

/* renamed from: w0.K, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10384K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3987u0 f103186a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3987u0 f103187b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f103188c;

    /* renamed from: d, reason: collision with root package name */
    private Object f103189d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10577F f103190e;

    public C10384K(int i11, int i12) {
        this.f103186a = C3956f1.a(i11);
        this.f103187b = C3956f1.a(i12);
        this.f103190e = new C10577F(i11, 90, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    private final void e(int i11, int i12) {
        if (i11 < 0.0f) {
            throw new IllegalArgumentException(P4.f.c("Index should be non-negative (", i11, ')').toString());
        }
        this.f103186a.d(i11);
        this.f103190e.b(i11);
        this.f103187b.d(i12);
    }

    public final int a() {
        return this.f103186a.getIntValue();
    }

    @NotNull
    public final C10577F b() {
        return this.f103190e;
    }

    public final int c() {
        return this.f103187b.getIntValue();
    }

    public final void d(int i11) {
        e(i11, 0);
        this.f103189d = null;
    }

    public final void f(@NotNull C10377D c10377d) {
        C10378E[] b11;
        C10378E c10378e;
        C10378E[] b12;
        C10378E c10378e2;
        C10379F l11 = c10377d.l();
        this.f103189d = (l11 == null || (b12 = l11.b()) == null || (c10378e2 = (C10378E) C7705l.F(b12)) == null) ? null : c10378e2.getKey();
        if (this.f103188c || c10377d.d() > 0) {
            this.f103188c = true;
            int m11 = c10377d.m();
            if (m11 < 0.0f) {
                throw new IllegalStateException(P4.f.c("scrollOffset should be non-negative (", m11, ')').toString());
            }
            C10379F l12 = c10377d.l();
            e((l12 == null || (b11 = l12.b()) == null || (c10378e = (C10378E) C7705l.F(b11)) == null) ? 0 : c10378e.getIndex(), m11);
        }
    }

    public final void g(int i11) {
        if (i11 < 0.0f) {
            throw new IllegalStateException(P4.f.c("scrollOffset should be non-negative (", i11, ')').toString());
        }
        this.f103187b.d(i11);
    }

    public final int h(@NotNull InterfaceC10396l interfaceC10396l, int i11) {
        int a11 = C10621z.a(i11, this.f103189d, interfaceC10396l);
        if (i11 != a11) {
            this.f103186a.d(a11);
            this.f103190e.b(i11);
        }
        return a11;
    }
}
