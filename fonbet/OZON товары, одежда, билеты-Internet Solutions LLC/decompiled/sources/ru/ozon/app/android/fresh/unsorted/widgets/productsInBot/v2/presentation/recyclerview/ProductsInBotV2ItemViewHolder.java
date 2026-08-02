package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.recyclerview;

import WZ.l;
import WZ.t;
import fd.InterfaceC6511n;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.item.ProductsInBotV2ItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00126\u0010\u000e\u001a2\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aRD\u0010\u000e\u001a2\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/recyclerview/ProductsInBotV2ItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/item/ProductsInBotV2ItemView;", "contentView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function3;", "", "", "quantityActionHandler", "Lkotlin/Function2;", "setProduct", "removeProduct", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/item/ProductsInBotV2ItemView;LWZ/l;Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;)Lkotlin/Unit;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/item/ProductsInBotV2ItemView;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "Lfd/n;", "Lkotlin/jvm/functions/Function2;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2ItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ProductsInBotV2ItemView contentView;

    @NotNull
    private final InterfaceC6511n<Long, Integer, Function1<? super Integer, Unit>, Function1<AtomAction, Unit>> quantityActionHandler;

    @NotNull
    private final Function1<Long, Unit> removeProduct;

    @NotNull
    private final Function2<Long, Integer, Unit> setProduct;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductsInBotV2ItemViewHolder(@NotNull ProductsInBotV2ItemView contentView, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6511n<? super Long, ? super Integer, ? super Function1<? super Integer, Unit>, ? extends Function1<? super AtomAction, Unit>> quantityActionHandler, @NotNull Function2<? super Long, ? super Integer, Unit> setProduct, @NotNull Function1<? super Long, Unit> removeProduct) {
        super(contentView);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(quantityActionHandler, "quantityActionHandler");
        Intrinsics.checkNotNullParameter(setProduct, "setProduct");
        Intrinsics.checkNotNullParameter(removeProduct, "removeProduct");
        this.contentView = contentView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.quantityActionHandler = quantityActionHandler;
        this.setProduct = setProduct;
        this.removeProduct = removeProduct;
    }

    public final Unit bind(@NotNull ProductsInBotV2VO.ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.contentView.bind(item, this.actionHandler, this.quantityActionHandler, this.setProduct, this.removeProduct, this.tokenizedAnalytics);
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        return Unit.f71690a;
    }
}
