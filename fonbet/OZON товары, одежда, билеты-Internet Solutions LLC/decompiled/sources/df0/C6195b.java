package df0;

import af0.C5018a;
import gf0.AbstractC6729a;
import kf0.InterfaceC7675b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;

/* renamed from: df0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6195b implements InterfaceC7675b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC6729a f61620a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d<? extends Ze0.a> f61621b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5018a f61622c;

    public C6195b(@NotNull AbstractC6729a destination, @NotNull d<? extends Ze0.a> composeScreenClass, @NotNull C5018a transitionBuilder) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(composeScreenClass, "composeScreenClass");
        Intrinsics.checkNotNullParameter(transitionBuilder, "transitionBuilder");
        this.f61620a = destination;
        this.f61621b = composeScreenClass;
        this.f61622c = transitionBuilder;
    }

    @NotNull
    public final d<? extends Ze0.a> a() {
        return this.f61621b;
    }

    @NotNull
    public final AbstractC6729a b() {
        return this.f61620a;
    }

    @NotNull
    public final C5018a c() {
        return this.f61622c;
    }
}
