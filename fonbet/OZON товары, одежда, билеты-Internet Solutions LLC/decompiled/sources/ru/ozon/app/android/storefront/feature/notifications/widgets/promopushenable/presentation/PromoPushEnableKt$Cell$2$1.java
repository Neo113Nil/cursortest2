package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushEnableCellDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableKt$Cell$2$1", f = "PromoPushEnable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoPushEnableKt$Cell$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ PromoPushEnableCellDTO $model;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PromoPushEnableKt$Cell$2$1(Function1<? super AtomAction, Unit> function1, PromoPushEnableCellDTO promoPushEnableCellDTO, d<? super PromoPushEnableKt$Cell$2$1> dVar) {
        super(2, dVar);
        this.$actionHandler = function1;
        this.$model = promoPushEnableCellDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoPushEnableKt$Cell$2$1(this.$actionHandler, this.$model, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$actionHandler.invoke(new AtomAction.ViewAction(this.$model.getCell().getTrackingInfo(), null, 2, null));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoPushEnableKt$Cell$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
