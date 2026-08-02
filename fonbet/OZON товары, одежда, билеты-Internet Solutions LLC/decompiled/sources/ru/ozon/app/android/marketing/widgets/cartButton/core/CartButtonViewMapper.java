package ru.ozon.app.android.marketing.widgets.cartButton.core;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.app.android.marketing.widgets.cartButton.presentation.CartButtonVO;
import ru.ozon.app.android.marketing.widgets.cartButton.presentation.CartButtonViewHolder;
import ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020!2\b\u0010\u0015\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J+\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00020'j\b\u0012\u0004\u0012\u00020\u0002`(2\n\u0010&\u001a\u00060$j\u0002`%H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/marketing/widgets/cartButton/core/CartButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/marketing/widgets/coupon/di/CouponWidgetComponent;", "Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;", "Lru/ozon/app/android/marketing/widgets/cartButton/presentation/CartButtonVO;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "createView", "(Landroid/content/Context;)Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "", "stateId", "toVO", "(Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;J)Lru/ozon/app/android/marketing/widgets/cartButton/presentation/CartButtonVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/cartButton/presentation/CartButtonVO;)Lru/ozon/app/android/marketing/widgets/cartButton/presentation/CartButtonVO;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/marketing/widgets/cartButton/core/CartButtonUpdateState;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<CouponWidgetComponent, CartButtonDTO, CartButtonVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int VIEW_HEIGHT = ResourceExtKt.toPx(48);
    private static final int HORIZONTAL_MARGIN = ResourceExtKt.toPx(16);
    private static final int VERTICAL_MARGIN = ResourceExtKt.toPx(8);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<CartButtonUpdateState>> supportedUpdates = C7714v.a0(CartButtonUpdateState.class);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/cartButton/core/CartButtonViewMapper$Companion;", "", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final LargeButtonView createView(Context context) {
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        largeButtonView.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, VIEW_HEIGHT);
        int i11 = HORIZONTAL_MARGIN;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        int i12 = VERTICAL_MARGIN;
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.bottomMargin = i12;
        largeButtonView.setLayoutParams(marginLayoutParams);
        return largeButtonView;
    }

    private final CartButtonVO toVO(CartButtonDTO cartButtonDTO, long j11) {
        return new CartButtonVO(j11, cartButtonDTO.getButton());
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CartButtonDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CartButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return new CartButtonViewHolder(container, createView(L11), component().getStateManager());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<CartButtonUpdateState>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CouponWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CouponWidgetComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public CartButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CartButtonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof CartButtonUpdateState) {
            return toVO(((CartButtonUpdateState) update).getButton(), oldItem.getId());
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CartButtonVO> map(@NotNull CartButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d().hashCode()));
    }
}
