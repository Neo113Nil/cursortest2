package ru.ozon.app.android.orderdetails.orderTotal.core;

import Bz.C2680a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalStickyViewMapper;
import ru.ozon.app.android.orderdetails.orderTotal.data.OrderTotalDTO;
import ru.ozon.app.android.orderdetails.orderTotal.data.StickyDTO;
import ru.ozon.app.android.orderdetails.orderTotal.di.OrderTotalComponent;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.sticky.OrderTotalStickyVO;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.sticky.OrderTotalStickyWidgetHolder;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.sticky.StickySummaryVO;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/core/OrderTotalStickyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/orderdetails/orderTotal/di/OrderTotalComponent;", "Lru/ozon/app/android/orderdetails/orderTotal/data/OrderTotalDTO;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/OrderTotalStickyVO;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/orderTotal/data/StickyDTO;", "", "stateId", "toVO", "(Lru/ozon/app/android/orderdetails/orderTotal/data/StickyDTO;Ljava/lang/String;)Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/OrderTotalStickyVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/orderdetails/orderTotal/data/OrderTotalDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTotalStickyViewMapper extends OverlayWidgetScreenViewItemMapper2<OrderTotalComponent, OrderTotalDTO, OrderTotalStickyVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/core/OrderTotalStickyViewMapper$Companion;", "", "<init>", "()V", "DEVICE_ID", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.widget_order_total_sticky_layout, (ViewGroup) parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final OrderTotalStickyVO toVO(StickyDTO stickyDTO, String str) {
        long hashCode = str.hashCode();
        ButtonV3Atom.PaymentButtonSmall smallPaymentButton = stickyDTO.getSmallPaymentButton();
        AtomActionDTO action = stickyDTO.getSmallPaymentButton().getAction();
        AtomActionDTO atomActionDTO = null;
        if (action != null) {
            AtomActionDTO action2 = stickyDTO.getSmallPaymentButton().getAction();
            Map<String, String> params = action2 != null ? action2.getParams() : null;
            if (params == null) {
                params = U.c();
            }
            atomActionDTO = AtomActionDTO.copy$default(action, null, null, null, U.n(params, new Pair("deviceId", component().getApplicationInfoDataSource().getUniqueApplicationId())), null, 23, null);
        }
        return new OrderTotalStickyVO(hashCode, ButtonV3Atom.PaymentButtonSmall.copy$default(smallPaymentButton, null, null, atomActionDTO, null, null, null, null, 123, null), new StickySummaryVO(stickyDTO.getSummary().getPrice(), stickyDTO.getSummary().getSubtitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTotalComponent widgetComponent$lambda$3(C7475g c7475g) {
        return OrderTotalComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<OrderTotalStickyVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new OrderTotalStickyWidgetHolder((CreateAndPayViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalStickyViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel createAndPayViewModel = OrderTotalStickyViewMapper.this.component().getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class), container, new InterfaceC6068e() { // from class: jB.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$1;
                createHolder$lambda$1 = OrderTotalStickyViewMapper.createHolder$lambda$1((LinearLayout) viewGroup);
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
    public C7473e<OrderTotalComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OrderTotalComponent.class), new C2680a(storage, 8));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OrderTotalStickyVO> map(@NotNull OrderTotalDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        StickyDTO sticky = state.getSticky();
        List<OrderTotalStickyVO> a02 = sticky != null ? C7714v.a0(toVO(sticky, info.d())) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
