package ru.ozon.app.android.geoprovider;

import Sc.s;
import Wc.a;
import ae0.AbstractC5006b;
import ae0.C5008d;
import ae0.i;
import android.content.Context;
import je0.C7415j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "<anonymous>", "(Lxe/M;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geoprovider.GeoProviderRepositoryImpl$fetchGeoProviderWithResult$job$1", f = "GeoProviderRepositoryImpl.kt", l = {76, 82}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeoProviderRepositoryImpl$fetchGeoProviderWithResult$job$1 extends j implements Function2<M, d<? super GeoProviderConfig>, Object> {
    final /* synthetic */ String $locationUid;
    int label;
    final /* synthetic */ GeoProviderRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeoProviderRepositoryImpl$fetchGeoProviderWithResult$job$1(GeoProviderRepositoryImpl geoProviderRepositoryImpl, String str, d<? super GeoProviderRepositoryImpl$fetchGeoProviderWithResult$job$1> dVar) {
        super(2, dVar);
        this.this$0 = geoProviderRepositoryImpl;
        this.$locationUid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeoProviderRepositoryImpl$fetchGeoProviderWithResult$job$1(this.this$0, this.$locationUid, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r5.e(r1, r4) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return this.this$0.fetchGeoProviderWithResult(this.$locationUid);
            }
            s.b(obj);
            GeoProviderRepositoryImpl geoProviderRepositoryImpl = this.this$0;
            C7415j c7415j = (C7415j) obj;
            geoProviderRepositoryImpl.tabsGeoProviderConfigs = c7415j;
            geoProviderRepositoryImpl.startUpdateTimer();
            return c7415j.c();
        }
        s.b(obj);
        if (C5008d.f36629d.f()) {
            AbstractC5006b.a.f36625d.getClass();
            GeoProviderRepositoryImpl geoProviderRepositoryImpl2 = this.this$0;
            context2 = geoProviderRepositoryImpl2.context;
            this.label = 1;
            obj = geoProviderRepositoryImpl2.getProvidersForTabs(context2, this);
        } else {
            i iVar = i.f36650a;
            context = this.this$0.context;
            this.label = 2;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super GeoProviderConfig> dVar) {
        return ((GeoProviderRepositoryImpl$fetchGeoProviderWithResult$job$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
