package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7998k<T, V extends AbstractC8015t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8006o<T, V> f73787a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC7994i f73788b;

    public C7998k(@NotNull C8006o<T, V> c8006o, @NotNull EnumC7994i enumC7994i) {
        this.f73787a = c8006o;
        this.f73788b = enumC7994i;
    }

    @NotNull
    public final EnumC7994i a() {
        return this.f73788b;
    }

    @NotNull
    public final String toString() {
        return "AnimationResult(endReason=" + this.f73788b + ", endState=" + this.f73787a + ')';
    }
}
