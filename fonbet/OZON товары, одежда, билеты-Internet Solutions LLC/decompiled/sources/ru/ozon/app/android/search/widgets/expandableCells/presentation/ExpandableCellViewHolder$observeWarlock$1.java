package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.WarlockResult;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellViewHolder$observeWarlock$1", f = "ExpandableCellViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ExpandableCellViewHolder$observeWarlock$1 extends j implements Function2<WarlockResult, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ExpandableCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpandableCellViewHolder$observeWarlock$1(ExpandableCellViewHolder expandableCellViewHolder, d<? super ExpandableCellViewHolder$observeWarlock$1> dVar) {
        super(2, dVar);
        this.this$0 = expandableCellViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ExpandableCellViewHolder$observeWarlock$1 expandableCellViewHolder$observeWarlock$1 = new ExpandableCellViewHolder$observeWarlock$1(this.this$0, dVar);
        expandableCellViewHolder$observeWarlock$1.L$0 = obj;
        return expandableCellViewHolder$observeWarlock$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        WarlockResult warlockResult = (WarlockResult) this.L$0;
        if (warlockResult instanceof WarlockResult.WarlockSuccess) {
            WarlockResult.WarlockSuccess warlockSuccess = (WarlockResult.WarlockSuccess) warlockResult;
            this.this$0.showSectionData(warlockSuccess.getResponse(), warlockSuccess.getSavedItem());
        } else {
            if (!(warlockResult instanceof WarlockResult.WarlockFailure)) {
                throw new o();
            }
            this.this$0.showNotification(((WarlockResult.WarlockFailure) warlockResult).getSavedItem());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WarlockResult warlockResult, d<? super Unit> dVar) {
        return ((ExpandableCellViewHolder$observeWarlock$1) create(warlockResult, dVar)).invokeSuspend(Unit.f71690a);
    }
}
