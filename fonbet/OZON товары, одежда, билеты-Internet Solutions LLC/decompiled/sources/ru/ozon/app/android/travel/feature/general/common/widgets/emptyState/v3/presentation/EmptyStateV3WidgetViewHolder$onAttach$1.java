package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3WidgetViewHolder$onAttach$1", f = "EmptyStateV3WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EmptyStateV3WidgetViewHolder$onAttach$1 extends j implements Function2<EmptyStateV3UiState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EmptyStateV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV3WidgetViewHolder$onAttach$1(EmptyStateV3WidgetViewHolder emptyStateV3WidgetViewHolder, d<? super EmptyStateV3WidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = emptyStateV3WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        EmptyStateV3WidgetViewHolder$onAttach$1 emptyStateV3WidgetViewHolder$onAttach$1 = new EmptyStateV3WidgetViewHolder$onAttach$1(this.this$0, dVar);
        emptyStateV3WidgetViewHolder$onAttach$1.L$0 = obj;
        return emptyStateV3WidgetViewHolder$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        EmptyStateV3UiState emptyStateV3UiState = (EmptyStateV3UiState) this.L$0;
        this.this$0.handleError(emptyStateV3UiState);
        this.this$0.handleButtonLoader(emptyStateV3UiState);
        this.this$0.handleAction(emptyStateV3UiState);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EmptyStateV3UiState emptyStateV3UiState, d<? super Unit> dVar) {
        return ((EmptyStateV3WidgetViewHolder$onAttach$1) create(emptyStateV3UiState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
