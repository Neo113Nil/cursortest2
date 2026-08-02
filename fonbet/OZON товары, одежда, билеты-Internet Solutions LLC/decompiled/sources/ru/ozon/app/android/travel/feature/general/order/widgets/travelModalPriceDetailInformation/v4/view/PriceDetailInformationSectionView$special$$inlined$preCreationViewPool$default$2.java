package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view;

import Bi.b;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class PriceDetailInformationSectionView$special$$inlined$preCreationViewPool$default$2 extends AbstractC7737t implements Function1<TextAtomV2View, Unit> {
    public PriceDetailInformationSectionView$special$$inlined$preCreationViewPool$default$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomV2View textAtomV2View) {
        invoke(textAtomV2View);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomV2View PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TextAtomV2View textAtomV2View = PreCreationViewPoolDelegate;
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.travelModalPriceDetailInformationSectionTitle, -2, -2);
        d11.setMargins(((ViewGroup.MarginLayoutParams) d11).leftMargin, ((ViewGroup.MarginLayoutParams) d11).topMargin, UiExtKt.toPx(8), ((ViewGroup.MarginLayoutParams) d11).bottomMargin);
        d11.f41616W = true;
        d11.f41598E = 0.0f;
        d11.f41595B = 0;
        textAtomV2View.setLayoutParams(d11);
    }
}
