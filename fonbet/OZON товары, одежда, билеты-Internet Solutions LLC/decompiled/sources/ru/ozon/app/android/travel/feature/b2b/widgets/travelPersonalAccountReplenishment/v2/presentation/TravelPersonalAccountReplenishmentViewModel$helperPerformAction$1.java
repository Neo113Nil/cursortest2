package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel", f = "TravelPersonalAccountReplenishmentViewModel.kt", l = {168}, m = "helperPerformAction")
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentViewModel$helperPerformAction$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TravelPersonalAccountReplenishmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentViewModel$helperPerformAction$1(TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel, d<? super TravelPersonalAccountReplenishmentViewModel$helperPerformAction$1> dVar) {
        super(dVar);
        this.this$0 = travelPersonalAccountReplenishmentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object helperPerformAction;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        helperPerformAction = this.this$0.helperPerformAction(null, null, null, this);
        return helperPerformAction;
    }
}
