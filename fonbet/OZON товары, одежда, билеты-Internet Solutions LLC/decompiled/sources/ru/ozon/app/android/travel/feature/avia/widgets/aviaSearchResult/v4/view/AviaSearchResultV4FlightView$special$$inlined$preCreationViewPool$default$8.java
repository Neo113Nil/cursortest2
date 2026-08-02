package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view;

import Bi.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
public final class AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$8 extends AbstractC7737t implements Function1<TextAtomV2View, Unit> {
    final /* synthetic */ AviaSearchResultV4FlightView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$8(AviaSearchResultV4FlightView aviaSearchResultV4FlightView) {
        super(1);
        this.this$0 = aviaSearchResultV4FlightView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomV2View textAtomV2View) {
        invoke(textAtomV2View);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomV2View PreCreationViewPoolDelegate) {
        int i11;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TextAtomV2View textAtomV2View = PreCreationViewPoolDelegate;
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.aviaSearchResultV4AdditionalInfoTextTAV, -2, -2);
        d11.f41616W = true;
        d11.f41598E = 0.0f;
        d11.f41603J = 2;
        i11 = this.this$0.dp16;
        d11.f41595B = i11;
        textAtomV2View.setLayoutParams(d11);
    }
}
