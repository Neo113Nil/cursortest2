package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.logosCarousel;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel$LogosElement;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorVH;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/utils/AppType;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorVH;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorVH;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/utils/AppType;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselSelectorAdapter extends t<SplitDynamicElementVO.LogosCarousel.LogosElement, CarouselSelectorVH> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final Function1<AtomAction, Unit> onAtomAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSelectorAdapter(@NotNull Function1<? super AtomAction, Unit> onAtomAction, @NotNull AppType appType) {
        super(new LogosElementItemCallback());
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.onAtomAction = onAtomAction;
        this.appType = appType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CarouselSelectorVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SplitDynamicElementVO.LogosCarousel.LogosElement item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CarouselSelectorVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CarouselSelectorView carouselSelectorView = new CarouselSelectorView(context, null, 0, 0, 14, null);
        carouselSelectorView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new CarouselSelectorVH(carouselSelectorView, this.appType, this.onAtomAction);
    }
}
