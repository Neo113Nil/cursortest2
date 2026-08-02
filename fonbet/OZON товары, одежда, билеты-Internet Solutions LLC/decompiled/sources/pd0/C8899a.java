package pd0;

import He.b;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.switchUser.data.SwitchUserApi;
import ru.ozon.id.switchUser.data.SwitchUserBodyDTO;
import ru.ozon.id.switchUser.data.SwitchUserResultDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

/* renamed from: pd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8899a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<SwitchUserApi> f80401a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f80402b;

    @e(c = "ru.ozon.id.switchUser.data.SwitchUserRepository$switchUser$2", f = "SwitchUserRepository.kt", l = {14}, m = "invokeSuspend")
    /* renamed from: pd0.a$a, reason: collision with other inner class name */
    static final class C1355a extends j implements Function2<M, d<? super SwitchUserResultDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f80403d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f80404e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C8899a f80405f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1355a(long j11, C8899a c8899a, d<? super C1355a> dVar) {
            super(2, dVar);
            this.f80404e = j11;
            this.f80405f = c8899a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C1355a(this.f80404e, this.f80405f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super SwitchUserResultDTO> dVar) {
            return ((C1355a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80403d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            SwitchUserBodyDTO switchUserBodyDTO = new SwitchUserBodyDTO(this.f80404e);
            SwitchUserApi switchUserApi = (SwitchUserApi) this.f80405f.f80401a.getValue();
            this.f80403d = 1;
            Object switchUser = switchUserApi.switchUser(switchUserBodyDTO, this);
            return switchUser == aVar ? aVar : switchUser;
        }
    }

    public C8899a() {
        throw null;
    }

    public C8899a(InterfaceC4008j api) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        b ioDispatcher = b.f10879b;
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f80401a = api;
        this.f80402b = ioDispatcher;
    }

    public final Object b(long j11, @NotNull d<? super SwitchUserResultDTO> dVar) {
        return C10727i.f(this.f80402b, new C1355a(j11, this, null), dVar);
    }
}
