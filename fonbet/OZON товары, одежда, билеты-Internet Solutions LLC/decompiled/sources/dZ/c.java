package dZ;

import Sc.s;
import hZ.C6894a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import jZ.C7320a;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.text.h;
import ru.ozon.android.networkinfo.models.NetworkConnectionType;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityApi;
import uf0.InterfaceC10056a;

@e(c = "ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityRepositoryImpl$getPopOrNull$2", f = "PoPReachabilityRepositoryImpl.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class c extends j implements Function1<d<? super C7320a.C1133a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    C6132a f61440d;

    /* renamed from: e, reason: collision with root package name */
    int f61441e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6132a f61442f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6894a.c.b.C1061a f61443g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f61444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(C6132a c6132a, C6894a.c.b.C1061a c1061a, String str, d<? super c> dVar) {
        super(1, dVar);
        this.f61442f = c6132a;
        this.f61443g = c1061a;
        this.f61444h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new c(this.f61442f, this.f61443g, this.f61444h, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super C7320a.C1133a> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C6132a c6132a;
        NetworkConnectionType networkConnectionType;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61441e;
        C6894a.c.b.C1061a c1061a = this.f61443g;
        if (i11 == 0) {
            s.b(obj);
            C6132a c6132a2 = this.f61442f;
            PoPReachabilityApi c11 = C6132a.c(c6132a2);
            String b11 = c1061a.b();
            String str = h.t(b11, "?", false) ? "&" : "?";
            String str2 = b11 + str + System.currentTimeMillis();
            this.f61440d = c6132a2;
            this.f61441e = 1;
            Object file = c11.getFile(str2, this);
            if (file == aVar) {
                return aVar;
            }
            c6132a = c6132a2;
            obj = file;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6132a = this.f61440d;
            s.b(obj);
        }
        InterfaceC10056a interfaceC10056a = (InterfaceC10056a) obj;
        String a11 = c1061a.a();
        c6132a.getClass();
        C7320a.b bVar = new C7320a.b(interfaceC10056a.b().a(), interfaceC10056a.b().m(), interfaceC10056a.b().p(), interfaceC10056a.b().t(), interfaceC10056a.b().w());
        NetworkInfo e11 = interfaceC10056a.b().e();
        NetworkInfo.Available available = e11 instanceof NetworkInfo.Available ? (NetworkInfo.Available) e11 : null;
        if (available == null || (networkConnectionType = available.getNetworkConnectionType()) == null) {
            networkConnectionType = NetworkConnectionType.CONNECTION_TYPE_UNKNOWN;
        }
        return new C7320a.C1133a(this.f61444h, a11, bVar, networkConnectionType);
    }
}
