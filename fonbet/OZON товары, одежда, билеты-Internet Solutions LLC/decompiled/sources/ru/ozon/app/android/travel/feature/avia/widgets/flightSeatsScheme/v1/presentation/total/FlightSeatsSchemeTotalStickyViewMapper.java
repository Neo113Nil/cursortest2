package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.total.FlightSeatsSchemeTotalMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalStickyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/di/FlightSeatsSchemeComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalVO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalWidgetViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/total/FlightSeatsSchemeTotalMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/total/FlightSeatsSchemeTotalMapper;", "mapper", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlightSeatsSchemeTotalStickyViewMapper extends OverlayWidgetScreenViewItemMapper2<FlightSeatsSchemeComponent, FlightSeatsSchemeDTO, FlightSeatsSchemeTotalVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<FlightSeatsSchemeTotalVO>> supportedUpdates = C7714v.a0(FlightSeatsSchemeTotalVO.class);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OrderTotalView orderTotalView = new OrderTotalView(context, null, 2, 0 == true ? 1 : 0);
        orderTotalView.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
        Context context2 = orderTotalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(12, context2);
        orderTotalView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Context context3 = orderTotalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        orderTotalView.setElevation(ResourceExtKt.toPxF(8, context3));
        Context context4 = orderTotalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context4);
        orderTotalView.setPadding(px, px, px, px);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context5 = orderTotalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        orderTotalView.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context5, R$attr.layerFloor1), pxF, pxF, 0.0f, 0.0f, 24, null));
        orderTotalView.setClickable(true);
        orderTotalView.setFocusable(true);
        return orderTotalView;
    }

    private final FlightSeatsSchemeTotalMapper getMapper() {
        return component().getFlightSeatsSchemeTotalMapper();
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<FlightSeatsSchemeTotalVO>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FlightSeatsSchemeComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FlightSeatsSchemeComponent.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public FlightSeatsSchemeTotalWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        v b02 = container.b0();
        final a<FlightSeatsSchemeViewModel> viewModelProvider = component().getViewModelProvider();
        w0 a11 = new z0(b02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total.FlightSeatsSchemeTotalStickyViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FlightSeatsSchemeViewModel flightSeatsSchemeViewModel = (FlightSeatsSchemeViewModel) a.this.get();
                Intrinsics.g(flightSeatsSchemeViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return flightSeatsSchemeViewModel;
            }
        }).a(FlightSeatsSchemeViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new FlightSeatsSchemeTotalWidgetViewHolder(container, (FlightSeatsSchemeViewModel) a11, component().getCustomActionHandlersStoreFactory(), new ET.a(2));
    }

    @Override // c20.r, I00.d
    public FlightSeatsSchemeTotalVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FlightSeatsSchemeTotalVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof FlightSeatsSchemeTotalVO) {
            return (FlightSeatsSchemeTotalVO) update;
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<FlightSeatsSchemeTotalVO> map(@NotNull FlightSeatsSchemeDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
