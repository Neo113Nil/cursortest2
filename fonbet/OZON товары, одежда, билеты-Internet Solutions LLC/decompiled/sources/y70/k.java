package y70;

import Sc.s;
import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.settings.models.FeatureValue;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsViewModel$loadText$1", f = "RequestNotificationsViewModel.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f106284d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f106285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f106285e = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f106285e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Application application;
        Q90.c cVar;
        Application application2;
        String string;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f106284d;
        j jVar = this.f106285e;
        try {
            if (i11 == 0) {
                s.b(obj);
                cVar = jVar.f106271e;
                S90.d dVar = S90.d.MOB_NATIVE_NOTIFICATION_PERMISSION;
                this.f106284d = 1;
                obj = cVar.u(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            FeatureValue featureValue = (FeatureValue) obj;
            if (featureValue == null || (string = featureValue.getStringData()) == null) {
                application2 = jVar.f106267a;
                string = application2.getString(R.string.fintech_notification_request_description);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            jVar.f106283q = string;
        } catch (Exception unused) {
            application = jVar.f106267a;
            jVar.f106283q = application.getString(R.string.fintech_notification_request_description);
        }
        j.h0(jVar, a.b.f96629a);
        return Unit.f71690a;
    }
}
