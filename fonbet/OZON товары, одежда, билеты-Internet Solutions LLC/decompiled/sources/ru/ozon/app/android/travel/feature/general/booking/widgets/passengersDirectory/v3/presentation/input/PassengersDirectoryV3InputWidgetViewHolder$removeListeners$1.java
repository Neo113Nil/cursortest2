package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input;

import androidx.recyclerview.widget.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/recyclerview/widget/g;", "", "invoke", "(Landroidx/recyclerview/widget/g;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class PassengersDirectoryV3InputWidgetViewHolder$removeListeners$1 extends AbstractC7737t implements Function1<g, Unit> {
    public static final PassengersDirectoryV3InputWidgetViewHolder$removeListeners$1 INSTANCE = new PassengersDirectoryV3InputWidgetViewHolder$removeListeners$1();

    PassengersDirectoryV3InputWidgetViewHolder$removeListeners$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
        invoke2(gVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(g recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "$this$recyclerView");
        recyclerView.setOnTouchListener(null);
    }
}
