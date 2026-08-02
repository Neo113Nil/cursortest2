package ru.ozon.app.android.ui.start;

import Sc.s;
import Wc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.K1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.NAME, ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ui.start.AppHostActivity$observeMiniAppConfig$2", f = "AppHostActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AppHostActivity$observeMiniAppConfig$2 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    AppHostActivity$observeMiniAppConfig$2(d<? super AppHostActivity$observeMiniAppConfig$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AppHostActivity$observeMiniAppConfig$2 appHostActivity$observeMiniAppConfig$2 = new AppHostActivity$observeMiniAppConfig$2(dVar);
        appHostActivity$observeMiniAppConfig$2.L$0 = obj;
        return appHostActivity$observeMiniAppConfig$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        K1.j("miniapp", (String) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((AppHostActivity$observeMiniAppConfig$2) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
