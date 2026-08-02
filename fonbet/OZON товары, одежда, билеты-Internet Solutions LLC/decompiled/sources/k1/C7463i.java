package k1;

import org.jetbrains.annotations.NotNull;

/* renamed from: k1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7463i {
    @NotNull
    public static final C7462h a(@NotNull C7460f c7460f, long j11, long j12, long j13, long j14) {
        return new C7462h(c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h(), j11, j12, j13, j14);
    }

    public static final boolean b(@NotNull C7462h c7462h) {
        return C7455a.d(c7462h.h()) == C7455a.e(c7462h.h()) && C7455a.d(c7462h.h()) == C7455a.d(c7462h.i()) && C7455a.d(c7462h.h()) == C7455a.e(c7462h.i()) && C7455a.d(c7462h.h()) == C7455a.d(c7462h.c()) && C7455a.d(c7462h.h()) == C7455a.e(c7462h.c()) && C7455a.d(c7462h.h()) == C7455a.d(c7462h.b()) && C7455a.d(c7462h.h()) == C7455a.e(c7462h.b());
    }
}
