package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownWidgetViewHolder", f = "DirectFlightsDropdownWidgetViewHolder.kt", l = {107}, m = "calculateRVHeight")
/* loaded from: classes10.dex */
final class DirectFlightsDropdownWidgetViewHolder$calculateRVHeight$1 extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DirectFlightsDropdownWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownWidgetViewHolder$calculateRVHeight$1(DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder, d<? super DirectFlightsDropdownWidgetViewHolder$calculateRVHeight$1> dVar) {
        super(dVar);
        this.this$0 = directFlightsDropdownWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object calculateRVHeight;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        calculateRVHeight = this.this$0.calculateRVHeight(null, 0, this);
        return calculateRVHeight;
    }
}
