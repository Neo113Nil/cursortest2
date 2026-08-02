package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import An.C2439a;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "showLoaderFlag", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewHolder$onAttachViewModel$4", f = "ReconciliationActsDeclinerViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewHolder$onAttachViewModel$4 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ReconciliationActsDeclinerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewHolder$onAttachViewModel$4(ReconciliationActsDeclinerViewHolder reconciliationActsDeclinerViewHolder, d<? super ReconciliationActsDeclinerViewHolder$onAttachViewModel$4> dVar) {
        super(2, dVar);
        this.this$0 = reconciliationActsDeclinerViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReconciliationActsDeclinerViewHolder$onAttachViewModel$4 reconciliationActsDeclinerViewHolder$onAttachViewModel$4 = new ReconciliationActsDeclinerViewHolder$onAttachViewModel$4(this.this$0, dVar);
        reconciliationActsDeclinerViewHolder$onAttachViewModel$4.Z$0 = ((Boolean) obj).booleanValue();
        return reconciliationActsDeclinerViewHolder$onAttachViewModel$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        InterfaceC7851b controller = this.this$0.references.getController();
        if (z11) {
            C2439a.b(0L, null, 3, controller);
        } else {
            controller.hideLoader();
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((ReconciliationActsDeclinerViewHolder$onAttachViewModel$4) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
