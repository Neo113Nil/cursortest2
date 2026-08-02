package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.presentation;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.databinding.WidgetTravelCarriageDetailsBinding;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.presentation.TravelCarriageDetailsVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/railway/databinding/WidgetTravelCarriageDetailsBinding;", "binding", "Lru/ozon/app/android/travel/feature/railway/databinding/WidgetTravelCarriageDetailsBinding;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageDetailsWidgetViewHolder extends k<TravelCarriageDetailsVO> {

    @NotNull
    private final WidgetTravelCarriageDetailsBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCarriageDetailsWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetTravelCarriageDetailsBinding bind = WidgetTravelCarriageDetailsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelCarriageDetailsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView carriageDetailsHeaderTextView = this.binding.carriageDetailsHeaderTextView;
        Intrinsics.checkNotNullExpressionValue(carriageDetailsHeaderTextView, "carriageDetailsHeaderTextView");
        TextAtomHolderKt.bind$default(carriageDetailsHeaderTextView, item.getHeader(), null, 2, null);
        TextAtomView carriageDetailsMainInfoTextView = this.binding.carriageDetailsMainInfoTextView;
        Intrinsics.checkNotNullExpressionValue(carriageDetailsMainInfoTextView, "carriageDetailsMainInfoTextView");
        TextAtomHolderKt.bind$default(carriageDetailsMainInfoTextView, item.getMainInfo(), null, 2, null);
        Group carriageDetailsServicesGroup = this.binding.carriageDetailsServicesGroup;
        Intrinsics.checkNotNullExpressionValue(carriageDetailsServicesGroup, "carriageDetailsServicesGroup");
        carriageDetailsServicesGroup.setVisibility(item.getIsServiceGroupVisible() ? 0 : 8);
        TravelCarriageDetailsVO.CarriageServiceInfo serviceInfo = item.getServiceInfo();
        TextAtomView carriageDetailsServicesHeader = this.binding.carriageDetailsServicesHeader;
        Intrinsics.checkNotNullExpressionValue(carriageDetailsServicesHeader, "carriageDetailsServicesHeader");
        TextAtomHolderKt.bind$default(carriageDetailsServicesHeader, serviceInfo.getTitle(), null, 2, null);
        this.binding.carriageDetailsServices.bind(serviceInfo.getServices());
        TextAtomView serviceDetailsAdditionalInfoTextView = this.binding.serviceDetailsAdditionalInfoTextView;
        Intrinsics.checkNotNullExpressionValue(serviceDetailsAdditionalInfoTextView, "serviceDetailsAdditionalInfoTextView");
        TextAtomHolderKt.bind$default(serviceDetailsAdditionalInfoTextView, item.getAdditionalInfo(), null, 2, null);
    }
}
