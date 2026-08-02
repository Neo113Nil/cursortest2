package x2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h<T> extends g<T> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f104940c;

    public h(int i11) {
        super(i11);
        this.f104940c = new Object();
    }

    @Override // x2.g, x2.f
    public final T a() {
        T t2;
        synchronized (this.f104940c) {
            t2 = (T) super.a();
        }
        return t2;
    }

    @Override // x2.g, x2.f
    public final boolean b(@NotNull T instance) {
        boolean b11;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f104940c) {
            b11 = super.b(instance);
        }
        return b11;
    }
}
