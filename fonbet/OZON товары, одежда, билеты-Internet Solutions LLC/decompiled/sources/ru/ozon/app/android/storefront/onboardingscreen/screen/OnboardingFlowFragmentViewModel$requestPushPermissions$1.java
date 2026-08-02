package ru.ozon.app.android.storefront.onboardingscreen.screen;

import Sc.r;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.lifecycle.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingEnablePushInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.screen.NavigationState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragmentViewModel$requestPushPermissions$1", f = "OnboardingFlowFragmentViewModel.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OnboardingFlowFragmentViewModel$requestPushPermissions$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ OnboardingFlowFragmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingFlowFragmentViewModel$requestPushPermissions$1(OnboardingFlowFragmentViewModel onboardingFlowFragmentViewModel, String str, Map<String, ? extends Object> map, d<? super OnboardingFlowFragmentViewModel$requestPushPermissions$1> dVar) {
        super(2, dVar);
        this.this$0 = onboardingFlowFragmentViewModel;
        this.$link = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OnboardingFlowFragmentViewModel$requestPushPermissions$1(this.this$0, this.$link, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OnboardingEnablePushInteractor onboardingEnablePushInteractor;
        Object m1020enablePushNotifications0E7RQCE;
        V v11;
        Pair pair;
        Pair pair2;
        V v12;
        Pair pair3;
        Pair pair4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            onboardingEnablePushInteractor = this.this$0.onboardingEnablePushInteractor;
            String str = this.$link;
            Map<String, ? extends Object> map = this.$params;
            this.label = 1;
            m1020enablePushNotifications0E7RQCE = onboardingEnablePushInteractor.m1020enablePushNotifications0E7RQCE(str, map, this);
            if (m1020enablePushNotifications0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            m1020enablePushNotifications0E7RQCE = ((r) obj).getF26106a();
        }
        OnboardingFlowFragmentViewModel onboardingFlowFragmentViewModel = this.this$0;
        if (r.b(m1020enablePushNotifications0E7RQCE) != null) {
            v12 = onboardingFlowFragmentViewModel.navigationLiveData;
            pair3 = onboardingFlowFragmentViewModel.deeplinkInfo;
            Uri uri = pair3 != null ? (Uri) pair3.e() : null;
            pair4 = onboardingFlowFragmentViewModel.deeplinkInfo;
            v12.setValue(new NavigationState.CloseScreenFlow(uri, pair4 != null ? (Uri) pair4.f() : null));
        }
        OnboardingFlowFragmentViewModel onboardingFlowFragmentViewModel2 = this.this$0;
        if (!(m1020enablePushNotifications0E7RQCE instanceof r.b)) {
            ((Boolean) m1020enablePushNotifications0E7RQCE).getClass();
            v11 = onboardingFlowFragmentViewModel2.navigationLiveData;
            pair = onboardingFlowFragmentViewModel2.deeplinkInfo;
            Uri uri2 = pair != null ? (Uri) pair.e() : null;
            pair2 = onboardingFlowFragmentViewModel2.deeplinkInfo;
            v11.setValue(new NavigationState.CloseScreenFlow(uri2, pair2 != null ? (Uri) pair2.f() : null));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OnboardingFlowFragmentViewModel$requestPushPermissions$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
