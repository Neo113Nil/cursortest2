package ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class RegionSearchWidgetViewHolder$searchTextWatcher$1 extends C7735q implements Function1<CharSequence, Unit> {
    RegionSearchWidgetViewHolder$searchTextWatcher$1(Object obj) {
        super(1, obj, RegionSearchWidgetViewHolder.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        ((RegionSearchWidgetViewHolder) this.receiver).onSearchQueryChanged(charSequence);
    }
}
