package ru.ozon.app.android.initializers.bundle;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.bundle.CleanCustomBundleStateActionInitializer$init$2", f = "CleanCustomBundleStateActionInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CleanCustomBundleStateActionInitializer$init$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ CleanCustomBundleStateActionInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CleanCustomBundleStateActionInitializer$init$2(CleanCustomBundleStateActionInitializer cleanCustomBundleStateActionInitializer, d<? super CleanCustomBundleStateActionInitializer$init$2> dVar) {
        super(2, dVar);
        this.this$0 = cleanCustomBundleStateActionInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CleanCustomBundleStateActionInitializer$init$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ManualSaveRestoreStateDelegate manualSaveRestoreStateDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        manualSaveRestoreStateDelegate = this.this$0.delegate;
        manualSaveRestoreStateDelegate.clearStorage();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CleanCustomBundleStateActionInitializer$init$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
