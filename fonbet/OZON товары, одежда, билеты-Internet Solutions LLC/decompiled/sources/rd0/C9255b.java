package rd0;

import De.C2862e;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.s;
import Vb0.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.InterfaceC9254a;
import ru.ozon.id.user.data.GetUserApi;
import ru.ozon.id.user.data.OzonIdUser;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sd0.EnumC9670a;
import td0.g;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import xe.N;
import xe.X0;

/* renamed from: rd0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9255b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f83318a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f83319b;

    @e(c = "ru.ozon.id.user.GetUserUseCase$execute$1", f = "GetUserUseCase.kt", l = {29, AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: rd0.b$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83320d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC9670a[] f83322f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L0 f83323g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC9254a, Unit> f83324h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC9670a[] enumC9670aArr, L0 l02, Function1 function1, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f83322f = enumC9670aArr;
            this.f83323g = l02;
            this.f83324h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            Function1<InterfaceC9254a, Unit> function1 = this.f83324h;
            return C9255b.this.new a(this.f83322f, this.f83323g, function1, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r10 == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        
            if (r10 == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83320d;
            Function1<InterfaceC9254a, Unit> function1 = this.f83324h;
            L0 l02 = this.f83323g;
            try {
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                b.a.c(Vb0.b.f28514a, th2);
                InterfaceC9254a.C1418a c1418a = new InterfaceC9254a.C1418a(th2);
                this.f83320d = 3;
                Object f7 = C10727i.f(l02, new C9256c(function1, c1418a, null), this);
                if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                    f7 = Unit.f71690a;
                }
            }
            if (i11 == 0) {
                s.b(obj);
                C9255b c9255b = C9255b.this;
                EnumC9670a[] enumC9670aArr = this.f83322f;
                EnumC9670a[] enumC9670aArr2 = (EnumC9670a[]) Arrays.copyOf(enumC9670aArr, enumC9670aArr.length);
                this.f83320d = 1;
                obj = C9255b.a(c9255b, enumC9670aArr2, this);
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
            this.f83320d = 2;
            Object f11 = C10727i.f(l02, new C9256c(function1, (InterfaceC9254a) obj, null), this);
            if (f11 != aVar) {
                f11 = Unit.f71690a;
            }
        }
    }

    public C9255b() {
        throw null;
    }

    public C9255b(InterfaceC4008j apiLazy) {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e scope = N.a(CoroutineContext.Element.a.d(He.b.f10879b, (H0) b11));
        Intrinsics.checkNotNullParameter(apiLazy, "apiLazy");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f83318a = scope;
        this.f83319b = apiLazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C9255b c9255b, EnumC9670a[] enumC9670aArr, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        c9255b.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f83329f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f83329f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f83327d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f83329f;
                if (i11 != 0) {
                    s.b(obj);
                    K k11 = Tb0.a.f26975d;
                    if (k11 == null) {
                        throw new Lb0.a();
                    }
                    if (!k11.w().getValue().e()) {
                        return InterfaceC9254a.b.f83316a;
                    }
                    int h11 = U.h(enumC9670aArr.length);
                    if (h11 < 16) {
                        h11 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                    for (EnumC9670a enumC9670a : enumC9670aArr) {
                        linkedHashMap.put(enumC9670a.a(), Boolean.TRUE);
                    }
                    GetUserApi getUserApi = (GetUserApi) c9255b.f83319b.getValue();
                    dVar.f83329f = 1;
                    obj = getUserApi.getUserV2(linkedHashMap, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return new InterfaceC9254a.c((OzonIdUser) obj);
            }
        }
        dVar = new d(c9255b, cVar);
        Object obj2 = dVar.f83327d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f83329f;
        if (i11 != 0) {
        }
        return new InterfaceC9254a.c((OzonIdUser) obj2);
    }

    public final void b(@NotNull EnumC9670a[] fields, @NotNull Function1<? super InterfaceC9254a, Unit> onResult) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(this.f83318a, null, null, new a(fields, g.a(), onResult, null), 3);
    }
}
