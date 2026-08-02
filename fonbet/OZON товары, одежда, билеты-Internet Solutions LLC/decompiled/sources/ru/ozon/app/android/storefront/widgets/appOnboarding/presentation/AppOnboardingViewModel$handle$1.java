package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingStorage;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel$handle$1", f = "AppOnboardingViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AppOnboardingViewModel$handle$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    int label;
    final /* synthetic */ AppOnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingViewModel$handle$1(AtomAction.Click click, AppOnboardingViewModel appOnboardingViewModel, d<? super AppOnboardingViewModel$handle$1> dVar) {
        super(2, dVar);
        this.$action = click;
        this.this$0 = appOnboardingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppOnboardingViewModel$handle$1(this.$action, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AppOnboardingStorage appOnboardingStorage;
        AppOnboardingViewModel.Event closeFlowWithRedirect;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Map<String, String> params = this.$action.getParams();
            if (Intrinsics.d(params != null ? params.get("onboardingAction") : null, "nextStep")) {
                closeFlowWithRedirect = AppOnboardingViewModel.Event.NextStep.INSTANCE;
            } else {
                appOnboardingStorage = this.this$0.appOnboardingStorage;
                Pair<Uri, Uri> redirectData = appOnboardingStorage.redirectData();
                Uri e11 = redirectData.e();
                Uri f7 = redirectData.f();
                closeFlowWithRedirect = (e11 == null || f7 == null) ? AppOnboardingViewModel.Event.CloseFlow.INSTANCE : new AppOnboardingViewModel.Event.CloseFlowWithRedirect(e11, f7);
            }
            w0Var = this.this$0._events;
            this.label = 1;
            if (w0Var.emit(closeFlowWithRedirect, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AppOnboardingViewModel$handle$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
