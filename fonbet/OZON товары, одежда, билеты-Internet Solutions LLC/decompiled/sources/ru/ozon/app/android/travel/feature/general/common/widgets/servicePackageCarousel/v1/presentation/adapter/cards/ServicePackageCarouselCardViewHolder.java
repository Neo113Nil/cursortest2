package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselCardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u000fJ+\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselCardView;", "view", "Lkotlin/Function1;", "", "", "onCardClick", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselCardView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "item", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;Lkotlin/jvm/functions/Function1;)V", "servicePackageCarouselCardVO", "bindIsActive", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;)V", "bindSmsToggle", "bindButton", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselCardView;", "Lkotlin/jvm/functions/Function1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselCardViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<Integer, Unit> onCardClick;

    @NotNull
    private final ServicePackageCarouselCardView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ServicePackageCarouselCardViewHolder(@NotNull ServicePackageCarouselCardView view, @NotNull Function1<? super Integer, Unit> onCardClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        this.view = view;
        this.onCardClick = onCardClick;
    }

    public final void bind(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, actionHandler, this.onCardClick);
    }

    public final void bindButton(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO servicePackageCarouselCardVO, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(servicePackageCarouselCardVO, "servicePackageCarouselCardVO");
        this.view.bindButton(servicePackageCarouselCardVO, actionHandler);
    }

    public final void bindIsActive(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO servicePackageCarouselCardVO) {
        Intrinsics.checkNotNullParameter(servicePackageCarouselCardVO, "servicePackageCarouselCardVO");
        this.view.bindIsActive(servicePackageCarouselCardVO);
    }

    public final void bindSmsToggle(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO servicePackageCarouselCardVO, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(servicePackageCarouselCardVO, "servicePackageCarouselCardVO");
        this.view.bindSmsToggle(servicePackageCarouselCardVO, actionHandler);
    }
}
