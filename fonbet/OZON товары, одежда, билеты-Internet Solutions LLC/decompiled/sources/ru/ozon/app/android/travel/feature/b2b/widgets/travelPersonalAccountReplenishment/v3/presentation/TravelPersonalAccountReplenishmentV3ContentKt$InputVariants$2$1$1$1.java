package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import B1.B;
import c1.w;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LB1/B;", "coordinates", "", "invoke", "(LB1/B;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$1$1 extends AbstractC7737t implements Function1<B, Unit> {
    final /* synthetic */ ParsedTag $parsedTag;
    final /* synthetic */ w<String, Float> $tagPositions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$1$1(ParsedTag parsedTag, w<String, Float> wVar) {
        super(1);
        this.$parsedTag = parsedTag;
        this.$tagPositions = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(B b11) {
        invoke2(b11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(B coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        String amountCents = this.$parsedTag.getAmountCents();
        if (amountCents != null) {
            w<String, Float> wVar = this.$tagPositions;
            B w11 = coordinates.w();
            float g10 = C7459e.g(w11 != null ? w11.W(coordinates, 0L) : 0L);
            if (Intrinsics.b(wVar.get(amountCents), g10)) {
                return;
            }
            wVar.put(amountCents, Float.valueOf(g10));
        }
    }
}
