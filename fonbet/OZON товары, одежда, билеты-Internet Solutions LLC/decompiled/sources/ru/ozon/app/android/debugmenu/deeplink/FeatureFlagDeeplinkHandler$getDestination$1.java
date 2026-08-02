package ru.ozon.app.android.debugmenu.deeplink;

import B0.A0;
import Sc.r;
import Sc.s;
import Wc.a;
import android.net.Uri;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pZ.f;
import pZ.h;
import ru.ozon.app.android.network.abtool.FeatureUpdater;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.deeplink.FeatureFlagDeeplinkHandler$getDestination$1", f = "FeatureFlagDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FeatureFlagDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ GZ.j $route;
    int label;
    final /* synthetic */ FeatureFlagDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureFlagDeeplinkHandler$getDestination$1(GZ.j jVar, FeatureFlagDeeplinkHandler featureFlagDeeplinkHandler, d<? super FeatureFlagDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.$route = jVar;
        this.this$0 = featureFlagDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new FeatureFlagDeeplinkHandler$getDestination$1(this.$route, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        FeatureUpdater featureUpdater;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Uri b11 = this.$route.b();
        HashSet hashSet = new HashSet();
        for (String str : b11.getQueryParameterNames()) {
            String queryParameter = b11.getQueryParameter(str);
            if (queryParameter != null) {
                FeatureFlagDeeplinkHandler featureFlagDeeplinkHandler = this.this$0;
                try {
                    r.Companion companion = r.INSTANCE;
                    featureUpdater = featureFlagDeeplinkHandler.featureFlagUpdater;
                    Intrinsics.f(str);
                    if (queryParameter.equals("on")) {
                        queryParameter = "true";
                    } else if (queryParameter.equals("off")) {
                        queryParameter = "false";
                    }
                    featureUpdater.updateByName(str, queryParameter);
                    a11 = Boolean.valueOf(hashSet.add(str));
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                }
                Throwable b12 = r.b(a11);
                if (b12 != null) {
                    Lm0.a.f17149a.w(b12, "Failed to update feature flags", new Object[0]);
                }
            }
        }
        return new h(hashSet.isEmpty() ? "Не удалось обновить фича флаги. Произошла ошибка" : A0.b("Фича флаги ", C7714v.V(hashSet, ", ", null, null, null, 62), " обновлены"));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((FeatureFlagDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
