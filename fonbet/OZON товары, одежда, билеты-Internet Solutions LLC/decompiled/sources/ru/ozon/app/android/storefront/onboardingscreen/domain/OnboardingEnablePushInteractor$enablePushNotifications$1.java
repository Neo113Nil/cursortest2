package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingEnablePushInteractor", f = "OnboardingEnablePushInteractor.kt", l = {15}, m = "enablePushNotifications-0E7RQCE")
/* loaded from: classes2.dex */
final class OnboardingEnablePushInteractor$enablePushNotifications$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingEnablePushInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingEnablePushInteractor$enablePushNotifications$1(OnboardingEnablePushInteractor onboardingEnablePushInteractor, d<? super OnboardingEnablePushInteractor$enablePushNotifications$1> dVar) {
        super(dVar);
        this.this$0 = onboardingEnablePushInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m1020enablePushNotifications0E7RQCE = this.this$0.m1020enablePushNotifications0E7RQCE(null, null, this);
        return m1020enablePushNotifications0E7RQCE == a.COROUTINE_SUSPENDED ? m1020enablePushNotifications0E7RQCE : r.a(m1020enablePushNotifications0E7RQCE);
    }
}
