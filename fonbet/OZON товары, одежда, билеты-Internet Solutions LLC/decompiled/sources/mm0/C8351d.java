package mm0;

import gm0.C6752a;
import km0.AbstractC7693a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: mm0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8351d<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8348a f76033a;

    public C8351d(@NotNull C8348a stateSubject) {
        Intrinsics.checkNotNullParameter(stateSubject, "stateSubject");
        this.f76033a = stateSubject;
    }

    @NotNull
    public final AbstractC7693a a(@NotNull C6752a backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return this.f76033a.a(backpressureStrategy);
    }
}
