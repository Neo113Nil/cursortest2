package ru.ozon.app.android.storefront.widgets.scrollAnchor.presentation;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$k;", "it", "", "<anonymous>", "(LA00/a$k;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.scrollAnchor.presentation.ScrollAnchorViewHolder$onAttachViewModel$1", f = "ScrollAnchorViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScrollAnchorViewHolder$onAttachViewModel$1 extends j implements Function2<a.C2370k, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ScrollAnchorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollAnchorViewHolder$onAttachViewModel$1(ScrollAnchorViewHolder scrollAnchorViewHolder, d<? super ScrollAnchorViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = scrollAnchorViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ScrollAnchorViewHolder$onAttachViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.C2370k c2370k, d<? super Unit> dVar) {
        return ((ScrollAnchorViewHolder$onAttachViewModel$1) create(c2370k, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.sendUpdate();
        return Unit.f71690a;
    }
}
