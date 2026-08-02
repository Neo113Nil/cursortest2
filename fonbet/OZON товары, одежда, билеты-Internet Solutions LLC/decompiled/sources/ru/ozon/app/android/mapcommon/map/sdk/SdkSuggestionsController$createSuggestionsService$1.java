package ru.ozon.app.android.mapcommon.map.sdk;

import Ge0.b;
import Sc.s;
import Wc.a;
import ie0.n;
import je0.AbstractC7409d;
import je0.C7406a;
import je0.C7414i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.data.model.SimpleAnalyticModuleState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "LGe0/b;", "<anonymous>", "(Lxe/M;)LGe0/b;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mapcommon.map.sdk.SdkSuggestionsController$createSuggestionsService$1", f = "SdkSuggestionsController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SdkSuggestionsController$createSuggestionsService$1 extends j implements Function2<M, d<? super b>, Object> {
    final /* synthetic */ C7406a $analyticModule;
    final /* synthetic */ GeoProviderConfig $geoProviderConfig;
    final /* synthetic */ Function1<Boolean, Unit> $loading;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SdkSuggestionsController$createSuggestionsService$1(Function1<? super Boolean, Unit> function1, C7406a c7406a, GeoProviderConfig geoProviderConfig, d<? super SdkSuggestionsController$createSuggestionsService$1> dVar) {
        super(2, dVar);
        this.$loading = function1;
        this.$analyticModule = c7406a;
        this.$geoProviderConfig = geoProviderConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SdkSuggestionsController$createSuggestionsService$1(this.$loading, this.$analyticModule, this.$geoProviderConfig, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Function1<Boolean, Unit> function1 = this.$loading;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        AbstractC7409d abstractC7409d = this.$analyticModule;
        if (abstractC7409d == null) {
            abstractC7409d = C7414i.a.a(new SimpleAnalyticModuleState(null, this.$geoProviderConfig, null, 5, null));
        }
        return new n(abstractC7409d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super b> dVar) {
        return ((SdkSuggestionsController$createSuggestionsService$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
