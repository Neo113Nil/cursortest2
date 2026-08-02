package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.messenger.databinding.MFragmentBottomSheetRateOperatorBinding;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f86199b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.rateoperator.b f86200c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MFragmentBottomSheetRateOperatorBinding f86201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a aVar, ru.ozon.android.messenger.blocks.rateoperator.b bVar, MFragmentBottomSheetRateOperatorBinding mFragmentBottomSheetRateOperatorBinding) {
        super(1);
        this.f86199b = aVar;
        this.f86200c = bVar;
        this.f86201d = mFragmentBottomSheetRateOperatorBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ArrayList arrayList;
        int intValue = num.intValue();
        a aVar = this.f86199b;
        arrayList = aVar.f86180i;
        arrayList.clear();
        ru.ozon.android.messenger.blocks.rateoperator.d dVar = (ru.ozon.android.messenger.blocks.rateoperator.d) ((ArrayList) this.f86200c.c()).get(intValue - 1);
        this.f86201d.rateOperatorRatingVrb.setContentDescription("rateOperatorRatingVrb_" + dVar.a());
        a.F(aVar, dVar);
        return Unit.f71690a;
    }
}
