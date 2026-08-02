package i1;

import Z1.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7823h0;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: i1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6987g implements Z1.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC6985e f65682a = C6993m.f65688a;

    /* renamed from: b, reason: collision with root package name */
    private C6992l f65683b;

    /* renamed from: c, reason: collision with root package name */
    private Function0<? extends InterfaceC7823h0> f65684c;

    /* renamed from: i1.g$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f65685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super InterfaceC8412e, Unit> function1) {
            super(1);
            this.f65685b = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8410c interfaceC8410c) {
            InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
            this.f65685b.invoke(interfaceC8410c2);
            interfaceC8410c2.F0();
            return Unit.f71690a;
        }
    }

    @Override // Z1.d
    public final float g() {
        return this.f65682a.g().g();
    }

    @NotNull
    public final s getLayoutDirection() {
        return this.f65682a.getLayoutDirection();
    }

    public final long i() {
        return this.f65682a.i();
    }

    public final C6992l m() {
        return this.f65683b;
    }

    @NotNull
    public final C6992l s(@NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        return t(new a(function1));
    }

    @NotNull
    public final C6992l t(@NotNull Function1<? super InterfaceC8410c, Unit> function1) {
        C6992l c6992l = new C6992l(function1);
        this.f65683b = c6992l;
        return c6992l;
    }

    public final void u(@NotNull InterfaceC6985e interfaceC6985e) {
        this.f65682a = interfaceC6985e;
    }

    @Override // Z1.k
    public final float u1() {
        return this.f65682a.g().u1();
    }

    public final void v() {
        this.f65683b = null;
    }

    public final void w(Function0<? extends InterfaceC7823h0> function0) {
        this.f65684c = function0;
    }
}
