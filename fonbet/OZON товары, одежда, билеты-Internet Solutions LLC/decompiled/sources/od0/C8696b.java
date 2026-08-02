package od0;

import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.s;
import Vb0.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.InterfaceC8695a;
import org.jetbrains.annotations.NotNull;
import pd0.C8899a;
import ru.ozon.id.switchUser.data.SwitchUserResultDTO;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td0.f;
import td0.g;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import xe.N;
import xe.X0;

/* renamed from: od0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8696b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8899a> f78081a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f78082b;

    @e(c = "ru.ozon.id.switchUser.SwitchUserUseCase$execute$1", f = "SwitchUserUseCase.kt", l = {29, AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: od0.b$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f78083d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f78085f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L0 f78086g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC8695a, Unit> f78087h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, L0 l02, Function1 function1, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f78085f = j11;
            this.f78086g = l02;
            this.f78087h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8696b.this.new a(this.f78085f, this.f78086g, this.f78087h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (r11 == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        
            if (r11 == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f78083d;
            Function1<InterfaceC8695a, Unit> function1 = this.f78087h;
            L0 l02 = this.f78086g;
            try {
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                b.a.c(Vb0.b.f28514a, th2);
                InterfaceC8695a.C1321a c1321a = new InterfaceC8695a.C1321a();
                this.f78083d = 3;
                Object f7 = C10727i.f(l02, new C8698d(function1, c1321a, null), this);
                if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                    f7 = Unit.f71690a;
                }
            }
            if (i11 == 0) {
                s.b(obj);
                C8696b c8696b = C8696b.this;
                long j11 = this.f78085f;
                this.f78083d = 1;
                obj = C8696b.a(c8696b, j11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            this.f78083d = 2;
            Object f11 = C10727i.f(l02, new C8698d(function1, (InterfaceC8695a) obj, null), this);
            if (f11 != aVar) {
                f11 = Unit.f71690a;
            }
        }
    }

    public C8696b() {
        throw null;
    }

    public C8696b(InterfaceC4008j repository) {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e scope = N.a(CoroutineContext.Element.a.d(He.b.f10879b, (H0) b11));
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f78081a = repository;
        this.f78082b = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C8696b c8696b, long j11, kotlin.coroutines.jvm.internal.c cVar) {
        C8697c c8697c;
        int i11;
        SwitchUserResultDTO.Restriction restriction;
        InterfaceC8695a.c cVar2;
        c8696b.getClass();
        if (cVar instanceof C8697c) {
            c8697c = (C8697c) cVar;
            int i12 = c8697c.f78091g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8697c.f78091g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8697c.f78089e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8697c.f78091g;
                if (i11 != 0) {
                    s.b(obj);
                    C8899a value = c8696b.f78081a.getValue();
                    c8697c.f78088d = c8696b;
                    c8697c.f78091g = 1;
                    obj = value.b(j11, c8697c);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8696b = c8697c.f78088d;
                    s.b(obj);
                }
                SwitchUserResultDTO switchUserResultDTO = (SwitchUserResultDTO) obj;
                restriction = switchUserResultDTO.getRestriction();
                if (restriction == null) {
                    c8696b.getClass();
                    cVar2 = new InterfaceC8695a.c(restriction.getIcon(), restriction.getTitle(), restriction.getMessage());
                } else {
                    cVar2 = null;
                }
                return switchUserResultDTO.getAuthToken() == null ? new InterfaceC8695a.d(cVar2) : new InterfaceC8695a.b(cVar2);
            }
        }
        c8697c = new C8697c(c8696b, cVar);
        Object obj2 = c8697c.f78089e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8697c.f78091g;
        if (i11 != 0) {
        }
        SwitchUserResultDTO switchUserResultDTO2 = (SwitchUserResultDTO) obj2;
        restriction = switchUserResultDTO2.getRestriction();
        if (restriction == null) {
        }
        if (switchUserResultDTO2.getAuthToken() == null) {
        }
    }

    public final void b(long j11, @NotNull Function1<? super InterfaceC8695a, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        C10720e0 c10720e0 = C10720e0.f105451a;
        f.b(this.f78082b, null, new a(j11, g.a(), onResult, null));
    }
}
