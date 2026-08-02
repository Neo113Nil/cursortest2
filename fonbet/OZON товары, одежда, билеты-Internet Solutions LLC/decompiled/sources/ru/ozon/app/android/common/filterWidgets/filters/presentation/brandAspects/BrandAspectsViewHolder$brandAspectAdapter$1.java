package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class BrandAspectsViewHolder$brandAspectAdapter$1 extends C7735q implements Function1<BrandAspectsVO.AspectBrand, Unit> {
    BrandAspectsViewHolder$brandAspectAdapter$1(Object obj) {
        super(1, obj, BrandAspectsViewHolder.class, "trackAspectClick", "trackAspectClick(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BrandAspectsVO.AspectBrand aspectBrand) {
        invoke2(aspectBrand);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BrandAspectsVO.AspectBrand p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((BrandAspectsViewHolder) this.receiver).trackAspectClick(p02);
    }
}
