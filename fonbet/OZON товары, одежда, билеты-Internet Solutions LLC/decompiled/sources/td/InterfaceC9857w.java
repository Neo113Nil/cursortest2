package td;

import java.util.List;
import je.B0;
import je.F0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;
import ud.InterfaceC10030h;

/* renamed from: td.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9857w extends InterfaceC9836b {

    /* renamed from: td.w$a */
    /* loaded from: classes10.dex */
    public interface a<D extends InterfaceC9857w> {
        @NotNull
        a a(@NotNull kotlin.collections.K k11);

        @NotNull
        a<D> b(@NotNull InterfaceC9836b.a aVar);

        D build();

        @NotNull
        a<D> c();

        @NotNull
        a<D> d();

        @NotNull
        a<D> e(@NotNull je.N n11);

        @NotNull
        a f();

        @NotNull
        a g(InterfaceC9838d interfaceC9838d);

        @NotNull
        a<D> h(InterfaceC9834Z interfaceC9834Z);

        @NotNull
        a<D> i(@NotNull List<p0> list);

        @NotNull
        a<D> j();

        @NotNull
        a k();

        @NotNull
        a<D> l(@NotNull EnumC9812C enumC9812C);

        @NotNull
        a<D> m(@NotNull InterfaceC10030h interfaceC10030h);

        @NotNull
        a<D> n(@NotNull AbstractC9853s abstractC9853s);

        @NotNull
        a<D> o(@NotNull Sd.f fVar);

        @NotNull
        a<D> p(@NotNull B0 b02);

        @NotNull
        a q(@NotNull InterfaceC9839e interfaceC9839e);

        @NotNull
        a<D> r();
    }

    boolean B0();

    boolean T();

    @NotNull
    a<? extends InterfaceC9857w> U();

    @Override // td.InterfaceC9836b, td.InterfaceC9835a, td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    InterfaceC9857w n0();

    /* renamed from: b */
    InterfaceC9857w b2(@NotNull F0 f02);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    InterfaceC9857w v0();

    boolean y();
}
