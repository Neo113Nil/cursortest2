package w0;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;
import x0.Z;

/* renamed from: w0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10394j extends AbstractC10611p<C10393i> implements InterfaceC10383J {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function2<InterfaceC10402s, Integer, C10387c> f103274c = a.f103277b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final N f103275a = new N(this);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z<C10393i> f103276b = new Z<>();

    /* renamed from: w0.j$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC10402s, Integer, C10387c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f103277b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final C10387c invoke(InterfaceC10402s interfaceC10402s, Integer num) {
            num.intValue();
            return C10387c.a(1);
        }
    }

    public C10394j(@NotNull Function1<? super InterfaceC10383J, Unit> function1) {
        function1.invoke(this);
    }

    @Override // w0.InterfaceC10383J
    public final void b(int i11, @NotNull Function1 function1, @NotNull C4912a c4912a) {
        this.f103276b.a(i11, new C10393i(f103274c, function1, c4912a));
    }

    @Override // x0.AbstractC10611p
    public final Z g() {
        return this.f103276b;
    }

    public final boolean i() {
        return false;
    }

    @NotNull
    public final Z<C10393i> j() {
        return this.f103276b;
    }

    @NotNull
    public final N k() {
        return this.f103275a;
    }
}
