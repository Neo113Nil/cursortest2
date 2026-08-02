package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel;

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
import ru.ozon.app.android.domain.flags.NaviBlocksCompactSizeEnabledFeatureFlag;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel;
import ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR<\u0010 \u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001ej\b\u0012\u0004\u0012\u00020\u0004`\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060$j\u0002`%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/di/NaviBlocksComponent;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CarouselNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CarouselNaviBlockModel;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockVO;)Lru/ozon/composer/ui/widget/h;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CarouselNaviBlockViewMapper extends WidgetViewMapper2<NaviBlocksComponent, NaviBlockModel.CarouselNaviBlockModel, CarouselNaviBlockVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<CarouselNaviBlockVO>> holderProducer = CarouselNaviBlockViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof NaviBlockModel.CarouselNaviBlockModel) && !component().getFeatureChecker().isEnabled(NaviBlocksCompactSizeEnabledFeatureFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CarouselView carouselView = new CarouselView(context, null, 0, 6, null);
        carouselView.setId(R$id.rootCv);
        carouselView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return carouselView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CarouselNaviBlockVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NaviBlockModel.CarouselNaviBlockModel, d, List<CarouselNaviBlockVO>> getMapper() {
        return component().getCarouselBlockTypeMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NaviBlocksComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return NaviBlocksComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull NaviBlockModel.CarouselNaviBlockModel state, @NotNull CarouselNaviBlockVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
