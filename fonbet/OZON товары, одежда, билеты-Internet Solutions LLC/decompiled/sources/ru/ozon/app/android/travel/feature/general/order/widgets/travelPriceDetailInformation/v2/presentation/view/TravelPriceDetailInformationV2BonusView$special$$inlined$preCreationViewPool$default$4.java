package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<TextAtomView, Unit> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ TravelPriceDetailInformationV2BonusView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$4(Context context, TravelPriceDetailInformationV2BonusView travelPriceDetailInformationV2BonusView) {
        super(1);
        this.$context$inlined = context;
        this.this$0 = travelPriceDetailInformationV2BonusView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomView textAtomView) {
        invoke(textAtomView);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomView PreCreationViewPoolDelegate) {
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TextAtomView textAtomView = PreCreationViewPoolDelegate;
        textAtomView.setId(R$id.travelPriceDetailInfoBonusPriceText);
        int themeColor = ThemeExtKt.themeColor(this.$context$inlined, R$attr.textMarketing);
        f7 = this.this$0.dp6F;
        ViewExtensionsKt.applyRoundedOutline(textAtomView, themeColor, f7);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        i11 = this.this$0.dp12;
        i12 = this.this$0.dp8;
        bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, i11, i12, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
        i13 = this.this$0.dp8;
        i14 = this.this$0.dp8;
        i15 = this.this$0.dp2;
        i16 = this.this$0.dp2;
        textAtomView.setPadding(i14, i15, i13, i16);
        bVar.f41616W = true;
        bVar.f41598E = 0.0f;
        textAtomView.setLayoutParams(bVar);
        this.this$0.addToLayout(textAtomView);
    }
}
