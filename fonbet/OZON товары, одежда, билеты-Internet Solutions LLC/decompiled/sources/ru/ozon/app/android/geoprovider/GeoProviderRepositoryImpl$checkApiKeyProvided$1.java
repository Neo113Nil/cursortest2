package ru.ozon.app.android.geoprovider;

import Sc.s;
import Wc.a;
import ae0.i;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geoprovider.GeoProviderRepositoryImpl$checkApiKeyProvided$1", f = "GeoProviderRepositoryImpl.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GeoProviderRepositoryImpl$checkApiKeyProvided$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $locationUid;
    int label;
    final /* synthetic */ GeoProviderRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeoProviderRepositoryImpl$checkApiKeyProvided$1(GeoProviderRepositoryImpl geoProviderRepositoryImpl, String str, d<? super GeoProviderRepositoryImpl$checkApiKeyProvided$1> dVar) {
        super(2, dVar);
        this.this$0 = geoProviderRepositoryImpl;
        this.$locationUid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GeoProviderRepositoryImpl$checkApiKeyProvided$1(this.this$0, this.$locationUid, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            i iVar = i.f36650a;
            context = this.this$0.context;
            this.label = 1;
            if (iVar.e(context, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.fetchGeoProvider(this.$locationUid);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GeoProviderRepositoryImpl$checkApiKeyProvided$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
