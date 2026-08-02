package hm0;

import Sc.o;
import hm0.b;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: hm0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f65632a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7704k<b> f65633b;

    public C6971a(@NotNull Object monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.f65632a = monitor;
        this.f65633b = new C7704k<>();
    }

    public final void a() {
        synchronized (this.f65632a) {
            this.f65633b.clear();
            Unit unit = Unit.f71690a;
        }
    }

    public final void b(@NotNull b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f65632a) {
            this.f65633b.addLast(value);
            Unit unit = Unit.f71690a;
        }
    }

    public final b c() {
        b A11;
        synchronized (this.f65632a) {
            try {
                A11 = this.f65633b.A();
                if (!(A11 instanceof b.C1076b)) {
                    if (A11 instanceof b.c) {
                        A11 = (b.c) A11;
                    } else if (!Intrinsics.d(A11, b.a.f65634a)) {
                        if (A11 != null) {
                            throw new o();
                        }
                        A11 = null;
                    }
                }
            } finally {
            }
        }
        return A11;
    }

    public final int d() {
        int f26995b;
        synchronized (this.f65632a) {
            f26995b = this.f65633b.getF26995b();
        }
        return f26995b;
    }
}
