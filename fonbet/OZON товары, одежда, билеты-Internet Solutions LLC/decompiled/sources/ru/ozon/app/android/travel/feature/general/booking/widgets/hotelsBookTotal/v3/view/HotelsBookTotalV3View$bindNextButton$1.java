package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HotelsBookTotalV3View$bindNextButton$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HotelsBookTotalV3View$bindNextButton$1(AtomAction atomAction, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$action = atomAction;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AtomAction atomAction = this.$action;
        if (atomAction != null) {
            this.$actionHandler.invoke(atomAction);
        }
    }
}
