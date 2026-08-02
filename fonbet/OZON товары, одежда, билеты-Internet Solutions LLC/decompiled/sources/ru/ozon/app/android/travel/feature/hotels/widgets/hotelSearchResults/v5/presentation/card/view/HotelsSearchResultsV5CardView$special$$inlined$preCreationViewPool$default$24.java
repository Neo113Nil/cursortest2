package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$24 extends AbstractC7737t implements Function1<TextAtomV2View, Unit> {
    public HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$24() {
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
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setVisibility(8);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41616W = true;
        bVar.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(bVar);
    }
}
