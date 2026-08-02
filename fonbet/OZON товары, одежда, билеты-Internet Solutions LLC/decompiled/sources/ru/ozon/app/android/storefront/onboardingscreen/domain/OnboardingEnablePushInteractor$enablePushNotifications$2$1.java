package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingEnablePushInteractor$enablePushNotifications$2$1", f = "OnboardingEnablePushInteractor.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OnboardingEnablePushInteractor$enablePushNotifications$2$1 extends j implements Function2<M, d<? super Boolean>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ OnboardingEnablePushInteractor $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingEnablePushInteractor$enablePushNotifications$2$1(OnboardingEnablePushInteractor onboardingEnablePushInteractor, String str, Map<String, ? extends Object> map, d<? super OnboardingEnablePushInteractor$enablePushNotifications$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = onboardingEnablePushInteractor;
        this.$link = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OnboardingEnablePushInteractor$enablePushNotifications$2$1(this.$this_runCatching, this.$link, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OnboardingPushApi onboardingPushApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        onboardingPushApi = this.$this_runCatching.onboardingPushApi;
        String str = this.$link;
        Map<String, Object> map = this.$params;
        this.label = 1;
        Object allowNotifications = onboardingPushApi.allowNotifications(str, map, this);
        return allowNotifications == aVar ? aVar : allowNotifications;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((OnboardingEnablePushInteractor$enablePushNotifications$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
