package ru.ozon.app.android.abtool.presentation.abvariants;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantItem;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class VariantsFragment$onViewCreated$adapter$1 extends C7735q implements Function1<VariantItem, Unit> {
    VariantsFragment$onViewCreated$adapter$1(Object obj) {
        super(1, obj, VariantsViewModel.class, "onRemoveVariantClick", "onRemoveVariantClick(Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VariantItem variantItem) {
        invoke2(variantItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VariantItem p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((VariantsViewModel) this.receiver).onRemoveVariantClick(p02);
    }
}
