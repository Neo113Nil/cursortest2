package mb0;

import Ba0.c;
import Sc.s;
import kb0.EnumC7626a;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb0.C7914a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.host.config.external.AppId;
import xe.C10727i;
import xe.M;
import za0.InterfaceC11014a;

/* renamed from: mb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8123a implements InterfaceC11014a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static EnumC7626a f74702d = EnumC7626a.Stg;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f74703e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AppId f74704a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC7626a f74705b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f74706c;

    /* renamed from: mb0.a$a, reason: collision with other inner class name */
    public static final class C1264a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C7914a f74707a;

        @e(c = "ru.ozon.host.config.internal.HostConfigImpl$Factory$create$1", f = "HostConfigImpl.kt", l = {43}, m = "invokeSuspend")
        /* renamed from: mb0.a$a$a, reason: collision with other inner class name */
        static final class C1265a extends j implements Function2<M, d<? super EnumC7626a>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f74708d;

            C1265a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C1265a(2, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super EnumC7626a> dVar) {
                return ((C1265a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f74708d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                c.f3352a.getClass();
                Fa0.a b11 = c.b();
                this.f74708d = 1;
                Enum c11 = b11.c(this);
                return c11 == aVar ? aVar : c11;
            }
        }

        public C1264a(@NotNull C7914a params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f74707a = params;
        }

        @NotNull
        public final C8123a a() {
            int i11 = C8123a.f74703e;
            C7914a c7914a = this.f74707a;
            EnumC7626a b11 = c7914a.b();
            Intrinsics.checkNotNullParameter(b11, "<set-?>");
            C8123a.f74702d = b11;
            return new C8123a(c7914a.a(), (EnumC7626a) C10727i.d(g.f71771a, new C1265a(2, null)));
        }
    }

    public C8123a(AppId appId, EnumC7626a enumC7626a) {
        this.f74704a = appId;
        this.f74705b = enumC7626a;
        this.f74706c = C8124b.d(appId, enumC7626a);
    }

    @Override // za0.InterfaceC11014a
    @NotNull
    public final EnumC7626a G() {
        return this.f74705b;
    }

    @Override // za0.InterfaceC11014a
    @NotNull
    public final String a() {
        return this.f74706c;
    }

    @Override // za0.InterfaceC11014a
    public final AppId m() {
        return this.f74704a;
    }

    @Override // Ld0.e
    public final void onInstantPluginsCreated() {
    }
}
