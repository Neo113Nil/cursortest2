package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.core;

import AN.a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.data.OrderDoneCrossButtonDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di.OrderDoneCrossButtonWidgetComponent;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.presentation.OrderDoneCrossButtonNewWidgetViewHolder;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.presentation.OrderDoneCrossButtonVO;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/core/OrderDoneCrossButtonWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/di/OrderDoneCrossButtonWidgetComponent;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/data/OrderDoneCrossButtonDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/presentation/OrderDoneCrossButtonVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/data/OrderDoneCrossButtonDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDoneCrossButtonWidgetViewMapper extends OverlayWidgetScreenViewItemMapper2<OrderDoneCrossButtonWidgetComponent, OrderDoneCrossButtonDTO, OrderDoneCrossButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int buttonSize = UiExtKt.toPx(32);
    private static final int buttonMargin = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/core/OrderDoneCrossButtonWidgetViewMapper$Companion;", "", "<init>", "()V", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDoneCrossButtonWidgetComponent widgetComponent$lambda$2(C7475g c7475g) {
        return OrderDoneCrossButtonWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<OrderDoneCrossButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        CoordinatorLayout f7 = C10183a.f(container.Z());
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(L11, null, 0, 0, 14, null);
        int i11 = buttonSize;
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(i11, i11);
        fVar.f41884c = 8388661;
        int i12 = buttonMargin;
        fVar.setMargins(((ViewGroup.MarginLayoutParams) fVar).leftMargin, i12, i12, ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        iconButtonV3View.setLayoutParams(fVar);
        return new OrderDoneCrossButtonNewWidgetViewHolder(f7, iconButtonV3View, component().getRouter(), component().getMiniAppConfigHolder(), container);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderDoneCrossButtonWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OrderDoneCrossButtonWidgetComponent.class), new a(storage, 13));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OrderDoneCrossButtonVO> map(@NotNull OrderDoneCrossButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
