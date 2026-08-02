package ru.ozon.app.android.account.orders.clicktodeliverymodal.core.buttons;

import AB.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
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
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.buttons.ButtonsViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.ButtonsDTO;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.buttons.ButtonsVI;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.buttons.ButtonsWidgetViewHolder;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001 B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/buttons/ButtonsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/di/ClickToDeliveryWidgetComponent;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/ButtonsDTO;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/buttons/ButtonsVI;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/ButtonsDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonsViewMapper extends OverlayWidgetScreenViewItemMapper2<ClickToDeliveryWidgetComponent, ButtonsDTO, ButtonsVI> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int HORIZONTAL_PADDING = ResourceExtKt.toPx(16);
    private static final int VERTICAL_PADDING = ResourceExtKt.toPx(10);

    @NotNull
    private final r.a viewType = r.a.MULTIPLE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/buttons/ButtonsViewMapper$Companion;", "", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(VerticalAtomsLayout verticalAtomsLayout, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return verticalAtomsLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClickToDeliveryWidgetComponent widgetComponent$lambda$2(C7475g c7475g) {
        return ClickToDeliveryWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ButtonsDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ButtonsVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        final VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(L11, null, 0, 6, null);
        verticalAtomsLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i11 = HORIZONTAL_PADDING;
        int i12 = VERTICAL_PADDING;
        verticalAtomsLayout.setPadding(i11, i12, i11, i12);
        Context L12 = container.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        verticalAtomsLayout.setBackgroundColor(ThemeExtKt.themeColor(L12, R$attr.layerFloor1));
        return new ButtonsWidgetViewHolder(verticalAtomsLayout, container, new InterfaceC6068e() { // from class: wk.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$1;
                createHolder$lambda$1 = ButtonsViewMapper.createHolder$lambda$1(VerticalAtomsLayout.this, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ClickToDeliveryWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ClickToDeliveryWidgetComponent.class), new b(storage, 16));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ButtonsVI> map(@NotNull ButtonsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getButtonsMapper().invoke(state, info);
    }
}
