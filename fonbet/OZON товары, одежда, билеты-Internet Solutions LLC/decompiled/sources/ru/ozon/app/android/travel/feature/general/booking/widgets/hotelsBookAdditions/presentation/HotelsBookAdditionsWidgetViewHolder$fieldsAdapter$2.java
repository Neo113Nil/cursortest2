package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsBookAdditionsWidgetViewHolder$fieldsAdapter$2 extends C7735q implements Function1<Long, Unit> {
    HotelsBookAdditionsWidgetViewHolder$fieldsAdapter$2(Object obj) {
        super(1, obj, HotelsBookAdditionsViewModel.class, "onSelectorClicked", "onSelectorClicked(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((HotelsBookAdditionsViewModel) this.receiver).onSelectorClicked(j11);
    }
}
