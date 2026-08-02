package fZ;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityApi;

/* loaded from: classes7.dex */
public final class g implements Jb.e<InterfaceC4008j<PoPReachabilityApi>> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Retrofit> f63048a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Boolean> f63049b;

    public g(Pc.a<Retrofit> aVar, Pc.a<Boolean> aVar2) {
        this.f63048a = aVar;
        this.f63049b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Retrofit retrofit = this.f63048a.get();
        boolean booleanValue = this.f63049b.get().booleanValue();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (booleanValue) {
            return k.b(new f(retrofit));
        }
        return null;
    }
}
