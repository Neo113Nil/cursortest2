package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import K1.S;
import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "centsStr", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$2$4$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ InterfaceC3978p0<K> $amountInputState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$2$4$1(InterfaceC3978p0<K> interfaceC3978p0) {
        super(1);
        this.$amountInputState$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String centsStr) {
        String formatCentsToAmountString;
        Intrinsics.checkNotNullParameter(centsStr, "centsStr");
        formatCentsToAmountString = TravelPersonalAccountReplenishmentV3ContentKt.formatCentsToAmountString(centsStr);
        InterfaceC3978p0<K> interfaceC3978p0 = this.$amountInputState$delegate;
        int length = formatCentsToAmountString.length();
        interfaceC3978p0.setValue(new K(4, S.a(length, length), formatCentsToAmountString));
    }
}
