package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Sc.s;
import Wc.a;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "showLoading", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewHolder$onAttachViewModel$3$1", f = "CommentsListViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsListViewHolder$onAttachViewModel$3$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CommentsListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsListViewHolder$onAttachViewModel$3$1(CommentsListViewHolder commentsListViewHolder, d<? super CommentsListViewHolder$onAttachViewModel$3$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsListViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CommentsListViewHolder$onAttachViewModel$3$1 commentsListViewHolder$onAttachViewModel$3$1 = new CommentsListViewHolder$onAttachViewModel$3$1(this.this$0, dVar);
        commentsListViewHolder$onAttachViewModel$3$1.Z$0 = ((Boolean) obj).booleanValue();
        return commentsListViewHolder$onAttachViewModel$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        composerReferences = this.this$0.ref;
        InterfaceC7851b controller = composerReferences.getController();
        if (z11) {
            controller.e(new l.a.b(0L, new Integer(0), 1));
        } else {
            controller.hideLoader();
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((CommentsListViewHolder$onAttachViewModel$3$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
