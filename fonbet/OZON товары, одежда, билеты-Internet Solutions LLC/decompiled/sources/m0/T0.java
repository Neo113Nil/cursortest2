package m0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class T0<T> implements D<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f73605a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73606b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f73607c;

    public T0() {
        this(0, (E) null, 7);
    }

    @Override // m0.InterfaceC8002m
    public final X0 a(U0 u02) {
        return new k1(this.f73605a, this.f73606b, this.f73607c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T0) {
            T0 t02 = (T0) obj;
            if (t02.f73605a == this.f73605a && t02.f73606b == this.f73606b && Intrinsics.d(t02.f73607c, this.f73607c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f73607c.hashCode() + (this.f73605a * 31)) * 31) + this.f73606b;
    }

    public T0(int i11, int i12, @NotNull E e11) {
        this.f73605a = i11;
        this.f73606b = i12;
        this.f73607c = e11;
    }

    @Override // m0.D, m0.InterfaceC8002m
    public final b1 a(U0 u02) {
        return new k1(this.f73605a, this.f73606b, this.f73607c);
    }

    public /* synthetic */ T0(int i11, E e11, int i12) {
        this((i12 & 1) != 0 ? 300 : i11, 0, (i12 & 4) != 0 ? G.a() : e11);
    }
}
