package ru.ozon.app.android.pdp.ui.configurators.monetization;

import A00.a;
import Sc.s;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$k;", "it", "", "<anonymous>", "(LA00/a$k;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$1", f = "RefreshByFragmentResultPageConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class RefreshByFragmentResultPageConfigurator$onComposerInitialized$1 extends j implements Function2<a.C2370k, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RefreshByFragmentResultPageConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshByFragmentResultPageConfigurator$onComposerInitialized$1(RefreshByFragmentResultPageConfigurator refreshByFragmentResultPageConfigurator, d<? super RefreshByFragmentResultPageConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = refreshByFragmentResultPageConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RefreshByFragmentResultPageConfigurator$onComposerInitialized$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.C2370k c2370k, d<? super Unit> dVar) {
        return ((RefreshByFragmentResultPageConfigurator$onComposerInitialized$1) create(c2370k, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Set set;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        set = this.this$0.refreshOnResumeKeys;
        set.clear();
        this.this$0.refreshInProgress = false;
        return Unit.f71690a;
    }
}
