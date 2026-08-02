package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewHolder$onAttachViewModel$2", f = "CommentsListViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsListViewHolder$onAttachViewModel$2 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ CommentsListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsListViewHolder$onAttachViewModel$2(CommentsListViewHolder commentsListViewHolder, d<? super CommentsListViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = commentsListViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsListViewHolder$onAttachViewModel$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.checkReportAction();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((CommentsListViewHolder$onAttachViewModel$2) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
