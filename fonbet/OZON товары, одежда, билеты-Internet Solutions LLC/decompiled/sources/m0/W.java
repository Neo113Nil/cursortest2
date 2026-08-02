package m0;

import androidx.collection.C5145n;
import m0.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class W<T, E extends U<T>> {

    /* renamed from: a, reason: collision with root package name */
    private int f73613a = 300;

    /* renamed from: b, reason: collision with root package name */
    private int f73614b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.C<E> f73615c;

    public W() {
        int i11 = C5145n.f38723b;
        this.f73615c = new androidx.collection.C<>();
    }

    public final int a() {
        return this.f73614b;
    }

    public final int b() {
        return this.f73613a;
    }

    @NotNull
    public final androidx.collection.C<E> c() {
        return this.f73615c;
    }

    public final void d() {
        this.f73614b = 1000;
    }

    public final void e(int i11) {
        this.f73613a = i11;
    }
}
