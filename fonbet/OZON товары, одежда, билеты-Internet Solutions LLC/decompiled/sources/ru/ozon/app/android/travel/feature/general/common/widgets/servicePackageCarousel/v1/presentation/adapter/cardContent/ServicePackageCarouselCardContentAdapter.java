package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.viewHolders.ServicePackageCarouselBenefitViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.viewHolders.ServicePackageCarouselHorizontalBadgesViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.viewHolders.ServicePackageCarouselPriceViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.viewHolders.ServicePackageCarouselTextViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselHorizontalBadgesView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselHorizontalBadgesView;", "getHorizontalBadgesView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselHorizontalBadgesView;", "Lru/ozon/uni/android/cell/CellView;", "getCardContentBenefitCell", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCardContentTextView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getCardContentPriceView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentViewHolder;I)V", "getItemViewType", "(I)I", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselCardContentAdapter extends t<ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO, ServicePackageCarouselCardContentViewHolder> {
    public ServicePackageCarouselCardContentAdapter() {
        super(new i.d<ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.ServicePackageCarouselCardContentAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO oldItem, ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO oldItem, ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    private final CellView getCardContentBenefitCell(ViewGroup parent) {
        CellView cellView = (CellView) q.f64554a.i(N.b(CellView.class), parent.getContext());
        if (cellView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        }
        cellView.setLayoutParams(new RecyclerView.p(-1, -2));
        return cellView;
    }

    private final PriceAtomView getCardContentPriceView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setLayoutParams(new RecyclerView.p(-1, -2));
        return priceAtomView;
    }

    private final TextAtomV2View getCardContentTextView(ViewGroup parent) {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        textAtomV2View.setLayoutParams(new RecyclerView.p(-1, -2));
        return textAtomV2View;
    }

    private final ServicePackageCarouselHorizontalBadgesView getHorizontalBadgesView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ServicePackageCarouselHorizontalBadgesView servicePackageCarouselHorizontalBadgesView = new ServicePackageCarouselHorizontalBadgesView(context);
        servicePackageCarouselHorizontalBadgesView.setLayoutParams(new RecyclerView.p(-1, -2));
        return servicePackageCarouselHorizontalBadgesView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO item = getItem(position);
        if (item instanceof ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Text) {
            return ServicePackageCarouselCardContentViewType.TEXT.getType();
        }
        if (item instanceof ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.HorizontalBadges) {
            return ServicePackageCarouselCardContentViewType.HORIZONTAL_BADGES.getType();
        }
        if (item instanceof ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Benefit) {
            return ServicePackageCarouselCardContentViewType.BENEFIT.getType();
        }
        if (item instanceof ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Price) {
            return ServicePackageCarouselCardContentViewType.PRICE.getType();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ServicePackageCarouselCardContentViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO servicePackageCarouselCardItemVO = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(servicePackageCarouselCardItemVO, "get(...)");
        holder.bind(servicePackageCarouselCardItemVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ServicePackageCarouselCardContentViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ServicePackageCarouselCardContentViewType.TEXT.getType()) {
            return new ServicePackageCarouselTextViewHolder(getCardContentTextView(parent));
        }
        if (viewType == ServicePackageCarouselCardContentViewType.PRICE.getType()) {
            return new ServicePackageCarouselPriceViewHolder(getCardContentPriceView(parent));
        }
        if (viewType == ServicePackageCarouselCardContentViewType.HORIZONTAL_BADGES.getType()) {
            return new ServicePackageCarouselHorizontalBadgesViewHolder(getHorizontalBadgesView(parent));
        }
        if (viewType == ServicePackageCarouselCardContentViewType.BENEFIT.getType()) {
            return new ServicePackageCarouselBenefitViewHolder(getCardContentBenefitCell(parent));
        }
        throw new IllegalStateException(("Illegal item viewType: " + viewType).toString());
    }
}
