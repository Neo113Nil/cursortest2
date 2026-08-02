package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaComplexSearchFormWidgetViewHolder$bind$4 extends C7735q implements Function1<Boolean, Boolean> {
    AviaComplexSearchFormWidgetViewHolder$bind$4(Object obj) {
        super(1, obj, AviaComplexSearchFormViewModel.class, "getIsDemoAnimationRequired", "getIsDemoAnimationRequired(Z)Z", 0);
    }

    public final Boolean invoke(boolean z11) {
        return Boolean.valueOf(((AviaComplexSearchFormViewModel) this.receiver).getIsDemoAnimationRequired(z11));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
