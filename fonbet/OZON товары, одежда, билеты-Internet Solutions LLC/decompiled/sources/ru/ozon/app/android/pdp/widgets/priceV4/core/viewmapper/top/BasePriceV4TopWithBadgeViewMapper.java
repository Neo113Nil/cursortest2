package ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.top;

import Kk.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DtoWrapper$TopWithFinBadge;
import ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.PriceV4TopWithBadgeView;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.PriceV4TopWithBadgeViewHolder;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b!\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R6\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0014\u0010&\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/core/viewmapper/top/BasePriceV4TopWithBadgeViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/priceV4/di/PriceV4Component;", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$TopWithFinBadge;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$TopWithFinBadge;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceV4TopWithBadgeView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceV4TopWithBadgeView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceV4TopWithBadgeViewHolder;", "holderProducer", "getHolderProducer", "", "isStars", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BasePriceV4TopWithBadgeViewMapper extends WidgetViewMapper2<PriceV4Component, PriceV4DtoWrapper$TopWithFinBadge, PriceV4VoWrapper.TopWithFinBadge> {

    @NotNull
    private final Function2<PriceV4DtoWrapper$TopWithFinBadge, d, List<PriceV4VoWrapper.TopWithFinBadge>> mapper = BasePriceV4TopWithBadgeViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, PriceV4TopWithBadgeViewHolder> holderProducer = new BasePriceV4TopWithBadgeViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, PriceV4TopWithBadgeViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PriceV4DtoWrapper$TopWithFinBadge, d, List<PriceV4VoWrapper.TopWithFinBadge>> getMapper() {
        return this.mapper;
    }

    public abstract boolean isStars();

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PriceV4Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PriceV4Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public PriceV4TopWithBadgeView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceV4TopWithBadgeView priceV4TopWithBadgeView = new PriceV4TopWithBadgeView(context, isStars());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
        marginLayoutParams.setMarginStart(sellerV4DisclosureViewFactory.getDp16());
        marginLayoutParams.setMarginEnd(sellerV4DisclosureViewFactory.getDp16());
        priceV4TopWithBadgeView.setLayoutParams(marginLayoutParams);
        return priceV4TopWithBadgeView;
    }
}
