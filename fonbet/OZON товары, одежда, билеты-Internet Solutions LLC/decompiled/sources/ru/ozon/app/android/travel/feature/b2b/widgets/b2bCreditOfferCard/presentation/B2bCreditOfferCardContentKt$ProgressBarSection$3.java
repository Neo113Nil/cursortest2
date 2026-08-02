package ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation.B2bCreditOfferCardVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B2bCreditOfferCardContentKt$ProgressBarSection$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Context $context;
    final /* synthetic */ B2bCreditOfferCardVI.ProgressBarVI $progressBarVI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bCreditOfferCardContentKt$ProgressBarSection$3(B2bCreditOfferCardVI.ProgressBarVI progressBarVI, Context context, int i11) {
        super(2);
        this.$progressBarVI = progressBarVI;
        this.$context = context;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        B2bCreditOfferCardContentKt.ProgressBarSection(this.$progressBarVI, this.$context, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
