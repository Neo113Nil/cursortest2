package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.sticky;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2StickyMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.sticky.TravelPriceDetailInformationV2NoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.TravelPriceDetailInformationV2StickyView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/TravelPriceDetailInformationV2NoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/di/TravelPriceDetailInformationV2Component;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/PriceDetailInformationV2StickyVO;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/view/View;", "createView", "(Landroid/content/Context;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/TravelPriceDetailInformationV2StickyWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/TravelPriceDetailInformationV2StickyWidgetViewHolder;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2StickyMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2StickyMapper;", "mapper", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPriceDetailInformationV2NoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<TravelPriceDetailInformationV2Component, TravelPriceDetailInformationV2DTO, PriceDetailInformationV2StickyVO> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(TravelPriceDetailInformationV2NoUiViewMapper travelPriceDetailInformationV2NoUiViewMapper, i iVar, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return travelPriceDetailInformationV2NoUiViewMapper.createView(L11);
    }

    private final View createView(Context context) {
        int px = ResourceExtKt.toPx(12, context);
        float pxF = ResourceExtKt.toPxF(12, context);
        int px2 = ResourceExtKt.toPx(16, context);
        float pxF2 = ResourceExtKt.toPxF(16, context);
        TravelPriceDetailInformationV2StickyView travelPriceDetailInformationV2StickyView = new TravelPriceDetailInformationV2StickyView(context);
        travelPriceDetailInformationV2StickyView.setTag(Integer.valueOf(R$string.common_tag_not_affect_offset));
        travelPriceDetailInformationV2StickyView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        travelPriceDetailInformationV2StickyView.setPadding(px2, px, px2, px);
        travelPriceDetailInformationV2StickyView.setElevation(pxF2);
        travelPriceDetailInformationV2StickyView.setBackground(RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF, pxF, 0.0f, 0.0f, 24, null));
        return travelPriceDetailInformationV2StickyView;
    }

    private final TravelPriceDetailInformationV2StickyMapper getMapper() {
        return component().getStickyMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TravelPriceDetailInformationV2DTO) && ((TravelPriceDetailInformationV2DTO) state).getStickyInformation() != null;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelPriceDetailInformationV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelPriceDetailInformationV2Component.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public TravelPriceDetailInformationV2StickyWidgetViewHolder createHolder(@NotNull final i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new TravelPriceDetailInformationV2StickyWidgetViewHolder(component().getWidgetVisibilityObservable(), container, component().getCustomActionHandlersStoreFactory(), component().getHandlersInhibitor(), new InterfaceC6068e() { // from class: nR.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$0;
                createHolder$lambda$0 = TravelPriceDetailInformationV2NoUiViewMapper.createHolder$lambda$0(TravelPriceDetailInformationV2NoUiViewMapper.this, container, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            }
        });
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PriceDetailInformationV2StickyVO> map(@NotNull TravelPriceDetailInformationV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
