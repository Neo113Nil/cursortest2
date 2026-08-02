package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.cellWithTimer.CellWithTimerView;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CellWithTimerWidgetViewHolder$observeLiveData$1$1 extends AbstractC7737t implements Function1<OzonSpannableString, Unit> {
    final /* synthetic */ CellWithTimerWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellWithTimerWidgetViewHolder$observeLiveData$1$1(CellWithTimerWidgetViewHolder cellWithTimerWidgetViewHolder) {
        super(1);
        this.this$0 = cellWithTimerWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OzonSpannableString ozonSpannableString) {
        invoke2(ozonSpannableString);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OzonSpannableString ozonSpannableString) {
        CellWithTimerView cellWithTimerView;
        cellWithTimerView = this.this$0.view;
        if (cellWithTimerView != null) {
            Intrinsics.f(ozonSpannableString);
            cellWithTimerView.updateTimerText(ozonSpannableString);
        }
    }
}
