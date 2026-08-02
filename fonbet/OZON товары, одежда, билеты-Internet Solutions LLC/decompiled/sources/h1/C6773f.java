package h1;

import D1.C2809k;
import D1.H0;
import D1.I0;
import D1.J0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

/* renamed from: h1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6773f extends e.c implements I0, InterfaceC6771d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f64596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f64597b = C6772e.f64595a;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6771d f64598c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6776i f64599d;

    /* renamed from: h1.f$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<C6773f, H0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6769b f64600b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6773f f64601c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ I f64602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6769b c6769b, C6773f c6773f, I i11) {
            super(1);
            this.f64600b = c6769b;
            this.f64601c = c6773f;
            this.f64602d = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final H0 invoke(C6773f c6773f) {
            C6773f c6773f2 = c6773f;
            if (!c6773f2.isAttached()) {
                return H0.SkipSubtreeAndContinueTraversal;
            }
            if (c6773f2.f64599d != null) {
                A1.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                throw null;
            }
            c6773f2.f64599d = (InterfaceC6776i) c6773f2.f64596a.invoke(this.f64600b);
            boolean z11 = c6773f2.f64599d != null;
            if (z11) {
                ((AndroidComposeView) C2809k.g(this.f64601c)).getF40543g().a(c6773f2);
            }
            I i11 = this.f64602d;
            i11.f71783a = i11.f71783a || z11;
            return H0.ContinueTraversal;
        }
    }

    /* renamed from: h1.f$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<C6773f, H0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6769b f64603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6769b c6769b) {
            super(1);
            this.f64603b = c6769b;
        }

        @Override // kotlin.jvm.functions.Function1
        public final H0 invoke(C6773f c6773f) {
            C6773f c6773f2 = c6773f;
            if (!c6773f2.getNode().isAttached()) {
                return H0.SkipSubtreeAndContinueTraversal;
            }
            InterfaceC6776i interfaceC6776i = c6773f2.f64599d;
            if (interfaceC6776i != null) {
                interfaceC6776i.i1(this.f64603b);
            }
            c6773f2.f64599d = null;
            c6773f2.f64598c = null;
            return H0.ContinueTraversal;
        }
    }

    /* renamed from: h1.f$c */
    /* loaded from: classes8.dex */
    public static final class c extends AbstractC7737t implements Function1<C6773f, H0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f64604b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6773f f64605c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6769b f64606d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(M m11, C6773f c6773f, C6769b c6769b) {
            super(1);
            this.f64604b = m11;
            this.f64605c = c6773f;
            this.f64606d = c6769b;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [D1.I0, T] */
        @Override // kotlin.jvm.functions.Function1
        public final H0 invoke(C6773f c6773f) {
            C6773f c6773f2 = c6773f;
            C6773f c6773f3 = c6773f2;
            if (!((AndroidComposeView) C2809k.g(this.f64605c)).getF40543g().b(c6773f3) || !C6775h.b(c6773f3, C6778k.a(this.f64606d))) {
                return H0.ContinueTraversal;
            }
            this.f64604b.f71787a = c6773f2;
            return H0.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6773f(@NotNull Function1<? super C6769b, ? extends InterfaceC6776i> function1) {
        this.f64596a = (AbstractC7737t) function1;
    }

    @Override // h1.InterfaceC6776i
    public final boolean A1(@NotNull C6769b c6769b) {
        InterfaceC6771d interfaceC6771d = this.f64598c;
        if (interfaceC6771d != null) {
            return interfaceC6771d.A1(c6769b);
        }
        InterfaceC6776i interfaceC6776i = this.f64599d;
        if (interfaceC6776i != null) {
            return interfaceC6776i.A1(c6769b);
        }
        return false;
    }

    public final boolean I1(@NotNull C6769b c6769b) {
        I i11 = new I();
        C6775h.d(this, new a(c6769b, this, i11));
        return i11.f71783a;
    }

    @Override // D1.I0
    @NotNull
    public final Object K0() {
        return this.f64597b;
    }

    @Override // h1.InterfaceC6776i
    public final void Q0(@NotNull C6769b c6769b) {
        InterfaceC6776i interfaceC6776i = this.f64599d;
        if (interfaceC6776i != null) {
            interfaceC6776i.Q0(c6769b);
        }
        InterfaceC6771d interfaceC6771d = this.f64598c;
        if (interfaceC6771d != null) {
            interfaceC6771d.Q0(c6769b);
        }
        this.f64598c = null;
    }

    @Override // h1.InterfaceC6776i
    public final void a1(@NotNull C6769b c6769b) {
        InterfaceC6776i interfaceC6776i = this.f64599d;
        if (interfaceC6776i != null) {
            interfaceC6776i.a1(c6769b);
            return;
        }
        InterfaceC6771d interfaceC6771d = this.f64598c;
        if (interfaceC6771d != null) {
            interfaceC6771d.a1(c6769b);
        }
    }

    @Override // h1.InterfaceC6776i
    public final void h1(@NotNull C6769b c6769b) {
        I0 i02;
        InterfaceC6771d interfaceC6771d;
        InterfaceC6771d interfaceC6771d2 = this.f64598c;
        if (interfaceC6771d2 == null || !C6775h.b(interfaceC6771d2, C6778k.a(c6769b))) {
            if (getNode().isAttached()) {
                M m11 = new M();
                J0.d(this, new c(m11, this, c6769b));
                i02 = (I0) m11.f71787a;
            } else {
                i02 = null;
            }
            interfaceC6771d = (InterfaceC6771d) i02;
        } else {
            interfaceC6771d = interfaceC6771d2;
        }
        if (interfaceC6771d != null && interfaceC6771d2 == null) {
            C6775h.c(interfaceC6771d, c6769b);
            InterfaceC6776i interfaceC6776i = this.f64599d;
            if (interfaceC6776i != null) {
                interfaceC6776i.Q0(c6769b);
            }
        } else if (interfaceC6771d == null && interfaceC6771d2 != null) {
            InterfaceC6776i interfaceC6776i2 = this.f64599d;
            if (interfaceC6776i2 != null) {
                C6775h.c(interfaceC6776i2, c6769b);
            }
            interfaceC6771d2.Q0(c6769b);
        } else if (!Intrinsics.d(interfaceC6771d, interfaceC6771d2)) {
            if (interfaceC6771d != null) {
                C6775h.c(interfaceC6771d, c6769b);
            }
            if (interfaceC6771d2 != null) {
                interfaceC6771d2.Q0(c6769b);
            }
        } else if (interfaceC6771d != null) {
            interfaceC6771d.h1(c6769b);
        } else {
            InterfaceC6776i interfaceC6776i3 = this.f64599d;
            if (interfaceC6776i3 != null) {
                interfaceC6776i3.h1(c6769b);
            }
        }
        this.f64598c = interfaceC6771d;
    }

    @Override // h1.InterfaceC6776i
    public final void i1(@NotNull C6769b c6769b) {
        C6775h.d(this, new b(c6769b));
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f64599d = null;
        this.f64598c = null;
    }

    @Override // h1.InterfaceC6776i
    public final void x0(@NotNull C6769b c6769b) {
        InterfaceC6776i interfaceC6776i = this.f64599d;
        if (interfaceC6776i != null) {
            interfaceC6776i.x0(c6769b);
            return;
        }
        InterfaceC6771d interfaceC6771d = this.f64598c;
        if (interfaceC6771d != null) {
            interfaceC6771d.x0(c6769b);
        }
    }
}
