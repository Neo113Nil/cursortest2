package ie0;

import Sc.s;
import java.util.List;
import je0.C7408c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeSuggestResponse;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProxyClient$getSuggestions$result$1", f = "GeoProxyClient.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super GeocodeSuggestResponse>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f66346d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f66347e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f66348f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f66349g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ He0.b f66350h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f66351i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ List<String> f66352j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(String str, int i11, String str2, He0.b bVar, String str3, List<String> list, kotlin.coroutines.d<? super k> dVar) {
        super(1, dVar);
        this.f66347e = str;
        this.f66348f = i11;
        this.f66349g = str2;
        this.f66350h = bVar;
        this.f66351i = str3;
        this.f66352j = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new k(this.f66347e, this.f66348f, this.f66349g, this.f66350h, this.f66351i, this.f66352j, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super GeocodeSuggestResponse> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f66346d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        C7408c a11 = g.a(g.f66321a).a();
        GeoProxyConfig c11 = g.c();
        Intrinsics.f(c11);
        String appName = c11.getAppName();
        str = g.f66326f;
        this.f66346d = 1;
        Object d11 = a11.d(appName, this.f66347e, this.f66348f, this.f66349g, this.f66350h, this.f66351i, this.f66352j, str, this);
        return d11 == aVar ? aVar : d11;
    }
}
