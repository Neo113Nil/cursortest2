package ru.ozon.app.android.fresh.navigation.configurators;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.navigation.configurators.CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1", f = "CategoryMainPageFreshConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1 extends j implements Function2<a, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1(d<? super CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1 categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1 = new CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1(dVar);
        categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1.L$0 = obj;
        return categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Boolean> dVar) {
        return ((CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Boolean.valueOf(((a) this.L$0) instanceof a.C2370k);
    }
}
