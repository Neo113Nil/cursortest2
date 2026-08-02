package ru.ozon.app.android.geoprovider;

import Sc.s;
import Wc.a;
import android.content.Context;
import je0.C7415j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geoprovider.GeoProviderRepositoryImpl$fetchGeoProvider$1", f = "GeoProviderRepositoryImpl.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class GeoProviderRepositoryImpl$fetchGeoProvider$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GeoProviderRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeoProviderRepositoryImpl$fetchGeoProvider$1(GeoProviderRepositoryImpl geoProviderRepositoryImpl, d<? super GeoProviderRepositoryImpl$fetchGeoProvider$1> dVar) {
        super(2, dVar);
        this.this$0 = geoProviderRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeoProviderRepositoryImpl$fetchGeoProvider$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object providersForTabs;
        GeoProviderRepositoryImpl geoProviderRepositoryImpl;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            GeoProviderRepositoryImpl geoProviderRepositoryImpl2 = this.this$0;
            context = geoProviderRepositoryImpl2.context;
            this.L$0 = geoProviderRepositoryImpl2;
            this.label = 1;
            providersForTabs = geoProviderRepositoryImpl2.getProvidersForTabs(context, this);
            if (providersForTabs == aVar) {
                return aVar;
            }
            geoProviderRepositoryImpl = geoProviderRepositoryImpl2;
            obj = providersForTabs;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            geoProviderRepositoryImpl = (GeoProviderRepositoryImpl) this.L$0;
            s.b(obj);
        }
        geoProviderRepositoryImpl.tabsGeoProviderConfigs = (C7415j) obj;
        this.this$0.startUpdateTimer();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GeoProviderRepositoryImpl$fetchGeoProvider$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
