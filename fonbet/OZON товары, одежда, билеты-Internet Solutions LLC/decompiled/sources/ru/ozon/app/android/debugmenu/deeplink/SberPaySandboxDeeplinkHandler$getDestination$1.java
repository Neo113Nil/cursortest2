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
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.deeplink.SberPaySandboxDeeplinkHandler$getDestination$1", f = "SberPaySandboxDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SberPaySandboxDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ GZ.j $route;
    int label;
    final /* synthetic */ SberPaySandboxDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SberPaySandboxDeeplinkHandler$getDestination$1(GZ.j jVar, SberPaySandboxDeeplinkHandler sberPaySandboxDeeplinkHandler, d<? super SberPaySandboxDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.$route = jVar;
        this.this$0 = sberPaySandboxDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new SberPaySandboxDeeplinkHandler$getDestination$1(this.$route, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Boolean t02;
        SberPayPreferences sberPayPreferences;
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
        sberPayPreferences = this.this$0.sberPayPreferences;
        sberPayPreferences.changeIsWithRealBankApp(booleanValue);
        return new pZ.h(booleanValue ? "SandboxRealBankApp включен" : "SandboxRealBankApp выключен");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((SberPaySandboxDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
