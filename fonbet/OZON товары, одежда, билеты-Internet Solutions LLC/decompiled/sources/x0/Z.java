package x0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;
import x0.a0;

/* loaded from: classes.dex */
public final class Z<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<C10600e<T>> f104707a = new U0.b<>(new C10600e[16]);

    /* renamed from: b, reason: collision with root package name */
    private int f104708b;

    /* renamed from: c, reason: collision with root package name */
    private C10600e<? extends T> f104709c;

    private final void b(int i11) {
        if (i11 < 0 || i11 >= this.f104708b) {
            StringBuilder f7 = P4.f.f(i11, "Index ", ", size ");
            f7.append(this.f104708b);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    public final void a(int i11, AbstractC10611p.a aVar) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "size should be >=0, but was ").toString());
        }
        if (i11 == 0) {
            return;
        }
        C10600e c10600e = new C10600e(this.f104708b, i11, aVar);
        this.f104708b += i11;
        this.f104707a.b(c10600e);
    }

    public final void c(int i11, int i12, @NotNull Function1<? super C10600e<? extends T>, Unit> function1) {
        b(i11);
        b(i12);
        if (i12 < i11) {
            throw new IllegalArgumentException(("toIndex (" + i12 + ") should be not smaller than fromIndex (" + i11 + ')').toString());
        }
        U0.b<C10600e<T>> bVar = this.f104707a;
        int a11 = O7.o.a(i11, bVar);
        int b11 = bVar.l()[a11].b();
        while (b11 <= i12) {
            C10600e<T> c10600e = bVar.l()[a11];
            ((a0.a) function1).invoke(c10600e);
            b11 += c10600e.a();
            a11++;
        }
    }

    @NotNull
    public final C10600e<T> d(int i11) {
        b(i11);
        C10600e<? extends T> c10600e = this.f104709c;
        if (c10600e != null) {
            int b11 = c10600e.b();
            if (i11 < c10600e.a() + c10600e.b() && b11 <= i11) {
                return c10600e;
            }
        }
        U0.b<C10600e<T>> bVar = this.f104707a;
        C10600e c10600e2 = (C10600e<? extends T>) bVar.l()[O7.o.a(i11, bVar)];
        this.f104709c = c10600e2;
        return c10600e2;
    }

    public final int e() {
        return this.f104708b;
    }
}
