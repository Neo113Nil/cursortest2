package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.viewHolders;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.ServicePackageCarouselCardContentViewHolder;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/viewHolders/ServicePackageCarouselBenefitViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentViewHolder;", "view", "Lru/ozon/uni/android/cell/CellView;", "<init>", "(Lru/ozon/uni/android/cell/CellView;)V", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselBenefitViewHolder extends ServicePackageCarouselCardContentViewHolder {
    public static final int $stable = CellView.$stable;

    @NotNull
    private final CellView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackageCarouselBenefitViewHolder(@NotNull CellView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.ServicePackageCarouselCardContentViewHolder
    public void bind(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Benefit benefit = item instanceof ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Benefit ? (ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Benefit) item : null;
        if (benefit != null) {
            CellHolderKt.bind$default(this.view, benefit.getBenefit(), null, 2, null);
        }
    }
}
