package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.logosCarousel;

import L2.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/LogosCarouselSplitVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel;", DynamicElementDTO.LOGOS_CAROUSEL, "scrollToItem", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel;)V", "item", "bind", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorAdapter;", "selectorAdapter", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/CarouselSelectorAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogosCarouselSplitVH extends RecyclerView.C {

    @NotNull
    private final LinearLayoutManager linearLayoutManager;

    @NotNull
    private final CarouselSelectorAdapter selectorAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int padding = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/logosCarousel/LogosCarouselSplitVH$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogosCarouselSplitVH(@NotNull RecyclerView view, @NotNull Function1<? super AtomAction, Unit> onAtomAction, @NotNull AppType appType) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        Intrinsics.checkNotNullParameter(appType, "appType");
        CarouselSelectorAdapter carouselSelectorAdapter = new CarouselSelectorAdapter(onAtomAction, appType);
        this.selectorAdapter = carouselSelectorAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        this.linearLayoutManager = linearLayoutManager;
        view.setClipToPadding(false);
        int i11 = padding;
        view.setPadding(i11, view.getPaddingTop(), i11, view.getPaddingBottom());
        view.setLayoutManager(linearLayoutManager);
        view.setAdapter(carouselSelectorAdapter);
        view.setItemAnimator(null);
        view.addItemDecoration(new LogosCarouselItemDecoration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToItem(SplitDynamicElementVO.LogosCarousel logosCarousel) {
        Object obj;
        Integer scrollPosition = logosCarousel.getScrollPosition();
        if (scrollPosition != null) {
            int intValue = scrollPosition.intValue();
            if (((SplitDynamicElementVO.LogosCarousel.LogosElement) C7714v.Q(intValue, logosCarousel.getElements())) == null) {
                return;
            }
            this.linearLayoutManager.scrollToPositionWithOffset(intValue, 0);
            return;
        }
        List<SplitDynamicElementVO.LogosCarousel.LogosElement> elements = logosCarousel.getElements();
        Iterator<T> it = logosCarousel.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SplitDynamicElementVO.LogosCarousel.LogosElement) obj).getIsSelected()) {
                    break;
                }
            }
        }
        this.linearLayoutManager.scrollToPositionWithOffset(C7714v.S(obj, elements), 0);
    }

    public final void bind(@NotNull SplitDynamicElementVO.LogosCarousel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.selectorAdapter.submitList(item.getElements(), new c(5, this, item));
    }
}
