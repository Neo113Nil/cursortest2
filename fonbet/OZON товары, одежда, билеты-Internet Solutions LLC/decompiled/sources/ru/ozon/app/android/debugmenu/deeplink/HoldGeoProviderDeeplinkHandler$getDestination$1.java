package ru.ozon.app.android.debugmenu.deeplink;

import Sc.s;
import Wc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.text.h;
import pZ.f;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.deeplink.HoldGeoProviderDeeplinkHandler$getDestination$1", f = "HoldGeoProviderDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class HoldGeoProviderDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ GZ.j $route;
    int label;
    final /* synthetic */ HoldGeoProviderDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoldGeoProviderDeeplinkHandler$getDestination$1(GZ.j jVar, HoldGeoProviderDeeplinkHandler holdGeoProviderDeeplinkHandler, d<? super HoldGeoProviderDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.$route = jVar;
        this.this$0 = holdGeoProviderDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new HoldGeoProviderDeeplinkHandler$getDestination$1(this.$route, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Boolean t02;
        MapPreferences mapPreferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String queryParameter = this.$route.b().getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (queryParameter == null || (t02 = h.t0(queryParameter)) == null) {
            f.Companion.getClass();
            return f.NONE;
        }
        boolean booleanValue = t02.booleanValue();
        mapPreferences = this.this$0.mapPreferences;
        mapPreferences.changeGeoProviderHolding(booleanValue);
        return new pZ.h(booleanValue ? "Удержание геопровайдера включено" : "Удержание геопровайдера выключено");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((HoldGeoProviderDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
