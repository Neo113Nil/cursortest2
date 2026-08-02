package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import K1.Q;
import K1.S;
import Q1.K;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ1/K;", "newValue", "", "invoke", "(LQ1/K;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$2$1 extends AbstractC7737t implements Function1<K, Unit> {
    final /* synthetic */ CommonInputV2VO.TextInputV2 $input;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$2$1(Function1<? super K, Unit> function1, CommonInputV2VO.TextInputV2 textInputV2, l lVar) {
        super(1);
        this.$onValueChange = function1;
        this.$input = textInputV2;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(K k11) {
        invoke2(k11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(K newValue) {
        int i11;
        Regex regex;
        String checkAmountInput;
        l lVar;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String Y11 = h.Y(newValue.f(), '.', ',');
        if (h.f0(Y11, ',')) {
            Y11 = "0".concat(Y11);
            i11 = 1;
        } else {
            i11 = 0;
        }
        regex = TravelPersonalAccountReplenishmentV3ContentKt.AMOUNT_REGEX;
        if (regex.f(Y11)) {
            long e11 = newValue.e();
            int i12 = Q.f15010c;
            int i13 = ((int) (e11 >> 32)) + i11;
            int length = Y11.length();
            if (i13 > length) {
                i13 = length;
            }
            int e12 = ((int) (newValue.e() & 4294967295L)) + i11;
            int length2 = Y11.length();
            if (e12 > length2) {
                e12 = length2;
            }
            this.$onValueChange.invoke(new K(4, S.a(i13, e12), Y11));
        } else {
            checkAmountInput = TravelPersonalAccountReplenishmentV3ContentKt.checkAmountInput(newValue.f());
            long e13 = newValue.e();
            int i14 = Q.f15010c;
            int i15 = ((int) (e13 >> 32)) + i11;
            int length3 = checkAmountInput.length();
            if (i15 > length3) {
                i15 = length3;
            }
            this.$onValueChange.invoke(new K(4, S.a(i15, i15), checkAmountInput));
        }
        t textChangeEvent = this.$input.getTextChangeEvent();
        if (textChangeEvent == null || (lVar = this.$tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, textChangeEvent, null, 2, null);
    }
}
