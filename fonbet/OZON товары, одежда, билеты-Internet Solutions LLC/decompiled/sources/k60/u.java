package k60;

import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayGetStoresResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayStores;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import ta0.InterfaceC9791a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayGetUpdateStoresBridgeInterface$getStores$1", f = "MirPayGetUpdateStoresBridgeInterface.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class u extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71000d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v f71001e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f71002f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ U50.j f71003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(v vVar, boolean z11, U50.j jVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f71001e = vVar;
        this.f71002f = z11;
        this.f71003g = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new u(this.f71001e, this.f71002f, this.f71003g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((u) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ?? r02;
        Moshi moshi;
        String str;
        InterfaceC9791a interfaceC9791a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71000d;
        v vVar = this.f71001e;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC9791a = vVar.f71004a;
                this.f71000d = 1;
                obj = interfaceC9791a.e(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            Iterable<Pair> iterable = (Iterable) obj;
            r02 = new ArrayList(C7714v.z(iterable, 10));
            for (Pair pair : iterable) {
                r02.add(new MirPayStores((String) pair.e(), (String) pair.f()));
            }
        } catch (MirPayWalletException e11) {
            L80.a.c("MirPayGetUpdateStoresBridgeInterface", "getStores", e11);
            if (this.f71002f && e11.getType() == MirPayWalletException.a.NO_CONNECTION) {
                throw e11;
            }
            r02 = K.f71697a;
        }
        moshi = vVar.f71005b;
        try {
            str = moshi.c(MirPayGetStoresResult.class).toJson(new MirPayGetStoresResult(r02));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        this.f71003g.invoke(new NativeResult.Success(str));
        return Unit.f71690a;
    }
}
