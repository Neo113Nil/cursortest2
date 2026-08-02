package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class PassengersDirectoryV2WidgetViewHolder$textWatcher$1 extends C7735q implements Function1<CharSequence, Unit> {
    PassengersDirectoryV2WidgetViewHolder$textWatcher$1(Object obj) {
        super(1, obj, PassengersDirectoryV2ViewModel.class, "processInputValue", "processInputValue(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        ((PassengersDirectoryV2ViewModel) this.receiver).processInputValue(charSequence);
    }
}
