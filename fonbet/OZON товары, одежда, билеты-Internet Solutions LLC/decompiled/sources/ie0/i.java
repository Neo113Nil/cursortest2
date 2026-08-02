package ie0;

import Sc.s;
import je0.C7408c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProvidersV2Response;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProxyClient$getProviders$2", f = "GeoProxyClient.kt", l = {325}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super GeoProvidersV2Response>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f66332d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f66333e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f66334f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Double f66335g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Double f66336h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(String str, String str2, Double d11, Double d12, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f66333e = str;
        this.f66334f = str2;
        this.f66335g = d11;
        this.f66336h = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new i(this.f66333e, this.f66334f, this.f66335g, this.f66336h, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super GeoProvidersV2Response> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f66332d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        C7408c a11 = g.a(g.f66321a).a();
        String str = this.f66333e;
        if (str == null) {
            GeoProxyConfig c11 = g.c();
            Intrinsics.f(c11);
            str = c11.getAppName();
        }
        this.f66332d = 1;
        Object a12 = a11.a(str, this.f66334f, this.f66335g, this.f66336h, this);
        return a12 == aVar ? aVar : a12;
    }
}
