package fZ;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import retrofit2.Retrofit;
import ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityApi;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function0<PoPReachabilityApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Retrofit f63047b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Retrofit retrofit) {
        super(0);
        this.f63047b = retrofit;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PoPReachabilityApi invoke() {
        return (PoPReachabilityApi) this.f63047b.create(PoPReachabilityApi.class);
    }
}
