package h10;

import i10.C6997c;
import i10.InterfaceC6995a;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* renamed from: h10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC6779a<I extends C7854a, S extends InterfaceC6995a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S f64609a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<? extends S> f64610b;

    public AbstractC6779a(@NotNull S initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f64609a = initialState;
        this.f64610b = (Class<? extends S>) initialState.getClass();
    }

    @NotNull
    public final S a() {
        return this.f64609a;
    }

    @NotNull
    public final Class<? extends S> b() {
        return this.f64610b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final S c(@NotNull A00.a event, @NotNull C6997c<I> state) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        InterfaceC6995a interfaceC6995a = state.d().get(this.f64610b);
        InterfaceC6995a interfaceC6995a2 = interfaceC6995a instanceof InterfaceC6995a ? interfaceC6995a : null;
        if (interfaceC6995a2 != null) {
            S s11 = (S) d(event, state, interfaceC6995a2);
            if (!interfaceC6995a2.equals(s11)) {
                return s11;
            }
        }
        return null;
    }

    @NotNull
    public abstract S d(@NotNull A00.a aVar, @NotNull C6997c<I> c6997c, @NotNull S s11);
}
