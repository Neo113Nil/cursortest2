package n00;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m00.C8029a;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import p00.InterfaceC8826b;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8029a f76273a;

    public h(@NotNull C8029a initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f76273a = initialState;
    }

    public final boolean a(@NotNull C8029a newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Map<InterfaceC8826b<? extends Object>, Object> d11 = newState.d();
        C8829e c8829e = C8829e.f80013b;
        return !Intrinsics.d(d11.get(c8829e), this.f76273a.d().get(c8829e));
    }
}
