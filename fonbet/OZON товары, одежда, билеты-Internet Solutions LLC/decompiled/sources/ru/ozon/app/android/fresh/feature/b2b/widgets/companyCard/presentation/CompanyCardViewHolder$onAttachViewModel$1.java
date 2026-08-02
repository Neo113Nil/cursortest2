package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardViewHolder$onAttachViewModel$1", f = "CompanyCardViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CompanyCardViewHolder$onAttachViewModel$1 extends j implements Function2<CompanyCardViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CompanyCardViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanyCardViewHolder$onAttachViewModel$1(CompanyCardViewHolder companyCardViewHolder, d<? super CompanyCardViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = companyCardViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CompanyCardViewHolder$onAttachViewModel$1 companyCardViewHolder$onAttachViewModel$1 = new CompanyCardViewHolder$onAttachViewModel$1(this.this$0, dVar);
        companyCardViewHolder$onAttachViewModel$1.L$0 = obj;
        return companyCardViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CompanyCardViewModel.Action action = (CompanyCardViewModel.Action) this.L$0;
        if (action instanceof CompanyCardViewModel.Action.PerformAction) {
            function1 = this.this$0.actionHandler;
            function1.invoke(((CompanyCardViewModel.Action.PerformAction) action).getAction());
        } else {
            if (!(action instanceof CompanyCardViewModel.Action.ShowNotification)) {
                throw new o();
            }
            this.this$0.showNotification(((CompanyCardViewModel.Action.ShowNotification) action).getNotification());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CompanyCardViewModel.Action action, d<? super Unit> dVar) {
        return ((CompanyCardViewHolder$onAttachViewModel$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
