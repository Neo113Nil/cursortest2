package jd0;

import Kb0.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.core.FeatureFlagConf;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.OzonIdWebViewClient$webViewForceCastHttpInHttps$2$1", f = "OzonIdWebViewClient.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* renamed from: jd0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7353f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super FeatureFlagConf>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f69762d;

    C7353f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7353f(2, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super FeatureFlagConf> dVar) {
        return ((C7353f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f69762d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        vc0.e value = k11.W().j().getValue();
        this.f69762d = 1;
        Object d11 = value.d(this);
        return d11 == aVar ? aVar : d11;
    }
}
