package ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler;

import A00.a;
import P00.k;
import Sc.s;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l20.C7854a;
import l20.c;
import retrofit2.HttpException;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler.AppOnboardingConfigurator$onCreate$1", f = "AppOnboardingConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AppOnboardingConfigurator$onCreate$1 extends j implements Function2<a, d<? super Unit>, Object> {
    final /* synthetic */ AppOnboardingViewModel $appOnboardingViewModel;
    final /* synthetic */ ConfiguratorReferences $ref;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppOnboardingConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingConfigurator$onCreate$1(AppOnboardingConfigurator appOnboardingConfigurator, AppOnboardingViewModel appOnboardingViewModel, ConfiguratorReferences configuratorReferences, d<? super AppOnboardingConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = appOnboardingConfigurator;
        this.$appOnboardingViewModel = appOnboardingViewModel;
        this.$ref = configuratorReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AppOnboardingConfigurator$onCreate$1 appOnboardingConfigurator$onCreate$1 = new AppOnboardingConfigurator$onCreate$1(this.this$0, this.$appOnboardingViewModel, this.$ref, dVar);
        appOnboardingConfigurator$onCreate$1.L$0 = obj;
        return appOnboardingConfigurator$onCreate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((AppOnboardingConfigurator$onCreate$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if (aVar2 instanceof a.p) {
            a.p pVar = (a.p) aVar2;
            if ((pVar.f() instanceof IOException) || (pVar.f() instanceof HttpException)) {
                this.this$0.closeFlowAndMarkAsNotWizard(this.$appOnboardingViewModel, this.$ref);
            }
        } else if (aVar2 instanceof a.o) {
            k f7 = ((a.o) aVar2).f();
            ArrayList arrayList = (ArrayList) f7.d();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = arrayList.get(i11);
                c d11 = ((C7854a) obj2).d();
                if ((d11 instanceof AppOnboardingVI ? (AppOnboardingVI) d11 : null) == null ? false : !r6.getContent().getPages().isEmpty()) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty() || !f7.c().isEmpty()) {
                this.this$0.closeFlowAndMarkAsNotWizard(this.$appOnboardingViewModel, this.$ref);
            }
        }
        return Unit.f71690a;
    }
}
