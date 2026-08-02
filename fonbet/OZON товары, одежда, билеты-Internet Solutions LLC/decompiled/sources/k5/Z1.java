package k5;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class Z1<T> implements InterfaceC7505d1<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final R0 f70686a;

    /* renamed from: b, reason: collision with root package name */
    protected Rm0.a f70687b;

    public Z1(@NonNull R0 r02) {
        this.f70686a = r02;
    }

    @Override // k5.InterfaceC7505d1
    @NonNull
    public final T b() {
        if (this.f70687b == null) {
            N0 a11 = ((T) this).a();
            this.f70687b = a11;
            if (a11 instanceof Sm0.a) {
                C7584x1.a().b((Sm0.a) this.f70687b);
            }
        }
        return (T) this.f70687b;
    }
}
