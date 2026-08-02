package ru.ozon.app.android.ui.start;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import xe.InterfaceC10756x;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ui.start.AppHostViewModel$loadPagesDataIfNecessary$1", f = "AppHostViewModel.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AppHostViewModel$loadPagesDataIfNecessary$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppHostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppHostViewModel$loadPagesDataIfNecessary$1(AppHostViewModel appHostViewModel, d<? super AppHostViewModel$loadPagesDataIfNecessary$1> dVar) {
        super(2, dVar);
        this.this$0 = appHostViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppHostViewModel$loadPagesDataIfNecessary$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        OnboardingInteractor onboardingInteractor;
        Object mo1021callOnBoardingCheckerWithActionIoAF18A;
        V v11;
        InterfaceC10756x interfaceC10756x;
        V v12;
        InterfaceC10756x interfaceC10756x2;
        FirstLaunchStateStorage firstLaunchStateStorage;
        V v13;
        V v14;
        InterfaceC10756x interfaceC10756x3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            z11 = this.this$0.shouldSkipOnboarding;
            if (z11) {
                this.this$0.canNavigateFurther = true;
                v11 = this.this$0.onboardingStatusLiveData;
                v11.setValue("");
                this.this$0.canNavigateFurther = true;
                interfaceC10756x = this.this$0.navigationJob;
                interfaceC10756x.j(null);
                return Unit.f71690a;
            }
            onboardingInteractor = this.this$0.onboardingInteractor;
            this.label = 1;
            mo1021callOnBoardingCheckerWithActionIoAF18A = onboardingInteractor.mo1021callOnBoardingCheckerWithActionIoAF18A(this);
            if (mo1021callOnBoardingCheckerWithActionIoAF18A == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo1021callOnBoardingCheckerWithActionIoAF18A = ((r) obj).getF26106a();
        }
        AppHostViewModel appHostViewModel = this.this$0;
        if (r.b(mo1021callOnBoardingCheckerWithActionIoAF18A) != null) {
            v14 = appHostViewModel.onboardingStatusLiveData;
            v14.setValue("");
            appHostViewModel.canNavigateFurther = true;
            interfaceC10756x3 = appHostViewModel.navigationJob;
            interfaceC10756x3.j(null);
        }
        AppHostViewModel appHostViewModel2 = this.this$0;
        if (!(mo1021callOnBoardingCheckerWithActionIoAF18A instanceof r.b)) {
            String str = (String) mo1021callOnBoardingCheckerWithActionIoAF18A;
            appHostViewModel2.canNavigateFurther = true;
            if (str == null || h.K(str)) {
                v12 = appHostViewModel2.onboardingStatusLiveData;
                v12.setValue("");
            } else {
                firstLaunchStateStorage = appHostViewModel2.firstLaunchStateStorage;
                firstLaunchStateStorage.setShowedNewOnboarding(true);
                v13 = appHostViewModel2.onboardingStatusLiveData;
                v13.setValue(str);
            }
            appHostViewModel2.canNavigateFurther = true;
            interfaceC10756x2 = appHostViewModel2.navigationJob;
            interfaceC10756x2.j(null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AppHostViewModel$loadPagesDataIfNecessary$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
