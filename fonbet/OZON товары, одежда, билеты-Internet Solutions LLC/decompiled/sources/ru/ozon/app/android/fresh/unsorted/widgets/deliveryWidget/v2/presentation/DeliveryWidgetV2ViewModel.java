package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import De.C2862e;
import De.s;
import Ge.n;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import h20.InterfaceC6786a;
import io.reactivex.p;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.domain.DeliveryWidgetV2Repository;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00014B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\u0011\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001c\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020,0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/domain/DeliveryWidgetV2Repository;", "repository", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/domain/DeliveryWidgetV2Repository;Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "addedItems", "updatedItems", "removedItems", "", "sendAsyncUpdate", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "onCleared", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "isExpressContext", "", "allowedDeliverySchemas", "setInitialData", "(Ll20/d;ZLjava/util/List;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/domain/DeliveryWidgetV2Repository;", "Lxe/M;", "scope", "Lxe/M;", "Lxe/B0;", "job", "Lxe/B0;", "", "asyncUpdateKey", "Ljava/lang/String;", "Ll20/d;", "Z", "Ljava/util/List;", "LAe/w0;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction;", "_deliveryWidgetAction", "LAe/w0;", "LAe/B0;", "deliveryWidgetAction", "LAe/B0;", "getDeliveryWidgetAction", "()LAe/B0;", "DeliveryWidgetAction", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV2ViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final Ae.w0<DeliveryWidgetAction> _deliveryWidgetAction;

    @NotNull
    private List<Long> allowedDeliverySchemas;
    private String asyncUpdateKey;

    @NotNull
    private final B0<DeliveryWidgetAction> deliveryWidgetAction;
    private boolean isExpressContext;
    private xe.B0 job;

    @NotNull
    private final DeliveryWidgetV2Repository repository;

    @NotNull
    private final M scope;
    private d widgetInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2ViewModel$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements InterfaceC6511n<Map<Long, ? extends CartItemInfo>, Map<Long, ? extends CartItemInfo>, Map<Long, ? extends CartItemInfo>, Unit> {
        AnonymousClass1(Object obj) {
            super(3, obj, DeliveryWidgetV2ViewModel.class, "sendAsyncUpdate", "sendAsyncUpdate(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", 0);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(Map<Long, ? extends CartItemInfo> map, Map<Long, ? extends CartItemInfo> map2, Map<Long, ? extends CartItemInfo> map3) {
            invoke2((Map<Long, CartItemInfo>) map, (Map<Long, CartItemInfo>) map2, (Map<Long, CartItemInfo>) map3);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<Long, CartItemInfo> p02, Map<Long, CartItemInfo> p12, Map<Long, CartItemInfo> p22) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            ((DeliveryWidgetV2ViewModel) this.receiver).sendAsyncUpdate(p02, p12, p22);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction;", "", "CloseAction", "CurtainAction", "ShowAction", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction$CloseAction;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction$CurtainAction;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction$ShowAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DeliveryWidgetAction {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction$CloseAction;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CloseAction implements DeliveryWidgetAction {

            @NotNull
            public static final CloseAction INSTANCE = new CloseAction();

            private CloseAction() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CloseAction);
            }

            public int hashCode() {
                return 570838482;
            }

            @NotNull
            public String toString() {
                return "CloseAction";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction$CurtainAction;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;", "getValue", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CurtainAction implements DeliveryWidgetAction {

            @NotNull
            private final DeliveryWidgetV2VO.SellerVOWidget value;

            public CurtainAction(@NotNull DeliveryWidgetV2VO.SellerVOWidget value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CurtainAction) && Intrinsics.d(this.value, ((CurtainAction) other).value);
            }

            @NotNull
            public final DeliveryWidgetV2VO.SellerVOWidget getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return "CurtainAction(value=" + this.value + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction$ShowAction;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "getValue", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowAction implements DeliveryWidgetAction {

            @NotNull
            private final DeliveryWidgetV2VO value;

            public ShowAction(@NotNull DeliveryWidgetV2VO value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowAction) && Intrinsics.d(this.value, ((ShowAction) other).value);
            }

            @NotNull
            public final DeliveryWidgetV2VO getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowAction(value=" + this.value + ")";
            }
        }
    }

    public DeliveryWidgetV2ViewModel(@NotNull DeliveryWidgetV2Repository repository, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.repository = repository;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(s.f6650a.x().plus(X0.b()));
        this.scope = a11;
        this.allowedDeliverySchemas = K.f71697a;
        C0 b11 = E0.b(0, 1, EnumC11113a.SUSPEND, 1);
        this._deliveryWidgetAction = b11;
        this.deliveryWidgetAction = b11;
        xe.B0 b02 = this.job;
        if (b02 != null) {
            xe.E0.e(b02);
        }
        this.job = null;
        p<CartState> skip = cartService.observeCartState(true).skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "skip(...)");
        this.job = C2399j.C(ExtensionsKt.collectRemoteUpdates(n.a(skip), new AnonymousClass1(this)), a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAsyncUpdate(Map<Long, CartItemInfo> addedItems, Map<Long, CartItemInfo> updatedItems, Map<Long, CartItemInfo> removedItems) {
        if (this.widgetInfo == null || this.asyncUpdateKey == null) {
            return;
        }
        C10727i.c(this.scope, null, null, new DeliveryWidgetV2ViewModel$sendAsyncUpdate$1(this, addedItems, updatedItems, removedItems, null), 3);
    }

    @NotNull
    public final B0<DeliveryWidgetAction> getDeliveryWidgetAction() {
        return this.deliveryWidgetAction;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        xe.E0.d(this.scope.getCoroutineContext());
    }

    public final void setInitialData(@NotNull d widgetInfo, boolean isExpressContext, @NotNull List<Long> allowedDeliverySchemas) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(allowedDeliverySchemas, "allowedDeliverySchemas");
        this.widgetInfo = widgetInfo;
        this.allowedDeliverySchemas = allowedDeliverySchemas;
        this.isExpressContext = isExpressContext;
        this.asyncUpdateKey = widgetInfo.c().a();
    }
}
