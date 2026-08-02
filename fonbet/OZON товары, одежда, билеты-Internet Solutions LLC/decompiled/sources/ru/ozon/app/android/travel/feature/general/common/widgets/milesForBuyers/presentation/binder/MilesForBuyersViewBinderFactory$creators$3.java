package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view.MilesForBuyersView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "it", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MilesForBuyersViewBinderFactory$creators$3 extends AbstractC7737t implements Function1<MilesForBuyersView, BaseMilesForBuyersViewBinder> {
    public static final MilesForBuyersViewBinderFactory$creators$3 INSTANCE = new MilesForBuyersViewBinderFactory$creators$3();

    MilesForBuyersViewBinderFactory$creators$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final BaseMilesForBuyersViewBinder invoke(MilesForBuyersView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new MilesForBuyersProgressViewBinder(it);
    }
}
