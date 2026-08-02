package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.logosCarousel;

import VD.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$drawable;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorView;", "view", "Lru/ozon/app/android/utils/AppType;", "appType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorView;Lru/ozon/app/android/utils/AppType;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel$LogosElement;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel$LogosElement;)V", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorView;", "Lru/ozon/app/android/utils/AppType;", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel$LogosElement;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselSelectorVH extends RecyclerView.C {

    @NotNull
    private final AppType appType;
    private SplitDynamicElementVO.LogosCarousel.LogosElement currentItem;

    @NotNull
    private final CarouselSelectorView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSelectorVH(@NotNull CarouselSelectorView view, @NotNull AppType appType, @NotNull Function1<? super AtomAction, Unit> onAtomAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        this.view = view;
        this.appType = appType;
        view.setOnClickListener(new a(3, this, onAtomAction));
        view.getTitle().setTextIsSelectable(false);
        view.getSubtitle().setTextIsSelectable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(CarouselSelectorVH carouselSelectorVH, Function1 function1, View view) {
        AtomActionDTO action;
        SplitDynamicElementVO.LogosCarousel.LogosElement logosElement = carouselSelectorVH.currentItem;
        if (logosElement == null || (action = logosElement.getAction()) == null) {
            return;
        }
        SplitDynamicElementVO.LogosCarousel.LogosElement logosElement2 = carouselSelectorVH.currentItem;
        function1.invoke(AtomActionMapperKt.toAtomAction(action, logosElement2 != null ? logosElement2.getTrackingInfo() : null));
    }

    public final void bind(@NotNull SplitDynamicElementVO.LogosCarousel.LogosElement item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CarouselSelectorView carouselSelectorView = this.view;
        this.currentItem = item;
        TextHolderKt.bindOrGone$default(carouselSelectorView.getTitle(), item.getTitle(), null, 2, null);
        carouselSelectorView.getTitle().setMovementMethod(null);
        TextHolderKt.bindOrGone$default(carouselSelectorView.getSubtitle(), item.getSubtitle(), null, 2, null);
        carouselSelectorView.getSubtitle().setMovementMethod(null);
        carouselSelectorView.setBackgroundResource(item.getIsSelectable() ? this.appType == AppType.SELECT ? R$drawable.switch_logos_rounded_select_bg : R$drawable.switch_logos_rounded_bg : R$drawable.switch_logos_btn_not_selectable);
        carouselSelectorView.setActivated(item.getIsSelected());
    }
}
