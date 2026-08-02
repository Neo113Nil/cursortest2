package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.FlashBarErrorWrapper;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/FlashBarErrorWrapper;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation.StatusEdoViewHolder$onAttachViewModel$2", f = "StatusEdoViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StatusEdoViewHolder$onAttachViewModel$2 extends j implements Function2<FlashBarErrorWrapper, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StatusEdoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatusEdoViewHolder$onAttachViewModel$2(StatusEdoViewHolder statusEdoViewHolder, d<? super StatusEdoViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = statusEdoViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StatusEdoViewHolder$onAttachViewModel$2 statusEdoViewHolder$onAttachViewModel$2 = new StatusEdoViewHolder$onAttachViewModel$2(this.this$0, dVar);
        statusEdoViewHolder$onAttachViewModel$2.L$0 = obj;
        return statusEdoViewHolder$onAttachViewModel$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.showErrorMessage(((FlashBarErrorWrapper) this.L$0).getMessage());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlashBarErrorWrapper flashBarErrorWrapper, d<? super Unit> dVar) {
        return ((StatusEdoViewHolder$onAttachViewModel$2) create(flashBarErrorWrapper, dVar)).invokeSuspend(Unit.f71690a);
    }
}
