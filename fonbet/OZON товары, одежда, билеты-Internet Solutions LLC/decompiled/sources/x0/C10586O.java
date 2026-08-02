package x0;

import S0.C3969l;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import a1.C4912a;
import b1.C5514q;
import b1.InterfaceC5505h;
import b1.InterfaceC5512o;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10586O implements InterfaceC5512o, InterfaceC5505h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5512o f104689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f104690b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f104691c;

    /* renamed from: x0.O$a */
    static final class a extends AbstractC7737t implements Function1<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5512o f104692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5512o interfaceC5512o) {
            super(1);
            this.f104692b = interfaceC5512o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            InterfaceC5512o interfaceC5512o = this.f104692b;
            return Boolean.valueOf(interfaceC5512o != null ? interfaceC5512o.a(obj) : true);
        }
    }

    public C10586O(InterfaceC5512o interfaceC5512o, Map<String, ? extends List<? extends Object>> map) {
        C3991w0 f7;
        this.f104689a = C5514q.a(map, new a(interfaceC5512o));
        f7 = n1.f(null, D1.f25195a);
        this.f104690b = f7;
        this.f104691c = new LinkedHashSet();
    }

    @Override // b1.InterfaceC5512o
    public final boolean a(@NotNull Object obj) {
        return this.f104689a.a(obj);
    }

    @Override // b1.InterfaceC5512o
    @NotNull
    public final InterfaceC5512o.a b(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        return this.f104689a.b(str, function0);
    }

    @Override // b1.InterfaceC5505h
    public final void c(@NotNull Object obj, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-697180401);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            InterfaceC5505h interfaceC5505h = (InterfaceC5505h) this.f104690b.getValue();
            if (interfaceC5505h == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            interfaceC5505h.c(obj, c4912a, u11, i12 & 126);
            boolean F11 = u11.F(this) | u11.F(obj);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C10590T(this, obj);
                u11.x(C11);
            }
            S0.Q.c(obj, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C10591U(this, obj, c4912a, i11));
        }
    }

    @Override // b1.InterfaceC5512o
    @NotNull
    public final Map<String, List<Object>> d() {
        InterfaceC5505h interfaceC5505h = (InterfaceC5505h) this.f104690b.getValue();
        if (interfaceC5505h != null) {
            Iterator it = this.f104691c.iterator();
            while (it.hasNext()) {
                interfaceC5505h.e(it.next());
            }
        }
        return this.f104689a.d();
    }

    @Override // b1.InterfaceC5505h
    public final void e(@NotNull Object obj) {
        InterfaceC5505h interfaceC5505h = (InterfaceC5505h) this.f104690b.getValue();
        if (interfaceC5505h == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        interfaceC5505h.e(obj);
    }

    @Override // b1.InterfaceC5512o
    public final Object f(@NotNull String str) {
        return this.f104689a.f(str);
    }

    public final void h(InterfaceC5505h interfaceC5505h) {
        this.f104690b.setValue(interfaceC5505h);
    }
}
