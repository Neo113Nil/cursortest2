package ru.ozon.app.android.geoprovider;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "<anonymous>", "(Lxe/M;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geoprovider.GeoProviderRepositoryImpl$fetchGeoProviderWithResult$1", f = "GeoProviderRepositoryImpl.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeoProviderRepositoryImpl$fetchGeoProviderWithResult$1 extends j implements Function2<M, d<? super GeoProviderConfig>, Object> {
    final /* synthetic */ U<GeoProviderConfig> $job;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeoProviderRepositoryImpl$fetchGeoProviderWithResult$1(U<GeoProviderConfig> u11, d<? super GeoProviderRepositoryImpl$fetchGeoProviderWithResult$1> dVar) {
        super(2, dVar);
        this.$job = u11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeoProviderRepositoryImpl$fetchGeoProviderWithResult$1(this.$job, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        U<GeoProviderConfig> u11 = this.$job;
        this.label = 1;
        Object s11 = u11.s(this);
        return s11 == aVar ? aVar : s11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super GeoProviderConfig> dVar) {
        return ((GeoProviderRepositoryImpl$fetchGeoProviderWithResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
