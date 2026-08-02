package ru.ozon.app.android.fresh.common.widgets.placeholdersUtils;

import A00.a;
import Sc.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.common.widgets.placeholdersUtils.SinglePlaceholderController$resubscribeToComposerUpdates$1", f = "SinglePlaceholderController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SinglePlaceholderController$resubscribeToComposerUpdates$1 extends j implements Function2<a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SinglePlaceholderController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SinglePlaceholderController$resubscribeToComposerUpdates$1(SinglePlaceholderController singlePlaceholderController, d<? super SinglePlaceholderController$resubscribeToComposerUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = singlePlaceholderController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SinglePlaceholderController$resubscribeToComposerUpdates$1 singlePlaceholderController$resubscribeToComposerUpdates$1 = new SinglePlaceholderController$resubscribeToComposerUpdates$1(this.this$0, dVar);
        singlePlaceholderController$resubscribeToComposerUpdates$1.L$0 = obj;
        return singlePlaceholderController$resubscribeToComposerUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((SinglePlaceholderController$resubscribeToComposerUpdates$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        Placeholder placeholder;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if (!(aVar2 instanceof a.J)) {
            return Unit.f71690a;
        }
        iVar = this.this$0.container;
        I00.a<l> s11 = iVar.J().s();
        a.J.InterfaceC0007a d11 = ((a.J) aVar2).d();
        placeholder = this.this$0.currentPlaceholder;
        ArrayList c11 = s11.c(d11, placeholder.getViewObjects());
        if (c11 != null) {
            this.this$0.handleNestedWidgets((List<l>) c11);
        }
        return Unit.f71690a;
    }
}
