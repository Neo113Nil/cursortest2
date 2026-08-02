package m0;

import J0.C3354v2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class U<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Float f73608a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private E f73609b;

    public U(Float f7, C3354v2 c3354v2) {
        this.f73608a = f7;
        this.f73609b = c3354v2;
    }

    @NotNull
    public final E a() {
        return this.f73609b;
    }

    public final T b() {
        return (T) this.f73608a;
    }

    public final void c(@NotNull E e11) {
        this.f73609b = e11;
    }
}
