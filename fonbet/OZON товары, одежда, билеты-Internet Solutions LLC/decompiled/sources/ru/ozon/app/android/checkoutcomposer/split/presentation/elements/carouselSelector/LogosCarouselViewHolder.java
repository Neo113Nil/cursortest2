package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector;

import Lo.b;
import Vg.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector.LogosCarouselVO;
import ru.ozon.app.android.checkoutgeo.checkout.data.PaddingsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LVg/d;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/composer/ComposerReferences;)V", DynamicElementDTO.LOGOS_CAROUSEL, "", "scrollToItem", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO;Ll20/d;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/CarouselSelectorAdapter;", "selectorAdapter", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/CarouselSelectorAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogosCarouselViewHolder extends k<LogosCarouselVO> {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;

    @NotNull
    private final CarouselSelectorAdapter selectorAdapter;

    @NotNull
    private final RecyclerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogosCarouselViewHolder(@NotNull RecyclerView view, @NotNull d customActionHandlersStoreFactory, @NotNull AppType appType, @NotNull ComposerReferences ref) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.view = view;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new LogosCarouselViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new LogosCarouselViewHolder$actionHandler$2(ref)).buildHandler();
        this.actionHandler = buildHandler;
        CarouselSelectorAdapter carouselSelectorAdapter = new CarouselSelectorAdapter(buildHandler, appType);
        this.selectorAdapter = carouselSelectorAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        this.linearLayoutManager = linearLayoutManager;
        view.setClipToPadding(false);
        view.setLayoutManager(linearLayoutManager);
        view.setAdapter(carouselSelectorAdapter);
        view.setItemAnimator(null);
        view.addItemDecoration(new LogosCarouselItemDecoration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToItem(LogosCarouselVO logosCarousel) {
        Object obj;
        Integer scrollPosition = logosCarousel.getScrollPosition();
        if (scrollPosition != null) {
            int intValue = scrollPosition.intValue();
            if (((LogosCarouselVO.LogosElementVO) C7714v.Q(intValue, logosCarousel.getElements())) == null) {
                return;
            }
            this.linearLayoutManager.scrollToPositionWithOffset(intValue, 0);
            return;
        }
        List<LogosCarouselVO.LogosElementVO> elements = logosCarousel.getElements();
        Iterator<T> it = logosCarousel.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((LogosCarouselVO.LogosElementVO) obj).getIsSelected()) {
                    break;
                }
            }
        }
        this.linearLayoutManager.scrollToPositionWithOffset(C7714v.S(obj, elements), 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LogosCarouselVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PaddingsKt.updatePadding(this.view, item.getPaddings());
        this.selectorAdapter.submitList(item.getElements(), new b(0, this, item));
    }
}
