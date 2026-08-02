package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelCarriageSelectV3View$setupRoot$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ TravelCarriageSelectV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCarriageSelectV3View$setupRoot$1(TravelCarriageSelectV3View travelCarriageSelectV3View) {
        super(1);
        this.this$0 = travelCarriageSelectV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(it, "it");
        function0 = this.this$0.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
