package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "deeplink", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewHolder$onAttachViewModel$5", f = "ReconciliationActsDeclinerViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewHolder$onAttachViewModel$5 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReconciliationActsDeclinerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewHolder$onAttachViewModel$5(ReconciliationActsDeclinerViewHolder reconciliationActsDeclinerViewHolder, d<? super ReconciliationActsDeclinerViewHolder$onAttachViewModel$5> dVar) {
        super(2, dVar);
        this.this$0 = reconciliationActsDeclinerViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReconciliationActsDeclinerViewHolder$onAttachViewModel$5 reconciliationActsDeclinerViewHolder$onAttachViewModel$5 = new ReconciliationActsDeclinerViewHolder$onAttachViewModel$5(this.this$0, dVar);
        reconciliationActsDeclinerViewHolder$onAttachViewModel$5.L$0 = obj;
        return reconciliationActsDeclinerViewHolder$onAttachViewModel$5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = (String) this.L$0;
        if (str.length() > 0) {
            ComposerExtKt.sendRefreshToTargetFragment$default(this.this$0.references.getContainer(), null, null, null, null, 15, null);
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.this$0.references.getNavigator(), str, null, 2, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((ReconciliationActsDeclinerViewHolder$onAttachViewModel$5) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
