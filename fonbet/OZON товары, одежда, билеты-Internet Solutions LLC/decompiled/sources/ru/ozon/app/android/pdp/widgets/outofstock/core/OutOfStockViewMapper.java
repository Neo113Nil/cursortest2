package ru.ozon.app.android.pdp.widgets.outofstock.core;

import A00.a;
import Kk.c;
import android.content.Context;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.outofstock.data.OutOfStockDTO;
import ru.ozon.app.android.pdp.widgets.outofstock.di.OutOfStockComponent;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockVO;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewHolder;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002./B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001e0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R2\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R,\u0010,\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/core/OutOfStockViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/outofstock/di/OutOfStockComponent;", "Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;)Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewHolder;", "holderProducer", "getHolderProducer", "AddToCart", "RemoveFromCart", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OutOfStockViewMapper extends WidgetViewMapper2<OutOfStockComponent, OutOfStockDTO, OutOfStockVO> {
    private final int layout = R$layout.pdp_widget_out_of_stock;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AddToCart.class, RemoveFromCart.class);

    @NotNull
    private final Function2<OutOfStockDTO, d, List<OutOfStockVO>> mapper = new OutOfStockViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, OutOfStockViewHolder> holderProducer = new OutOfStockViewMapper$holderProducer$1(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/core/OutOfStockViewMapper$AddToCart;", "LA00/a$J$a;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddToCart implements a.J.InterfaceC0007a {

        @NotNull
        public static final AddToCart INSTANCE = new AddToCart();

        private AddToCart() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/core/OutOfStockViewMapper$RemoveFromCart;", "LA00/a$J$a;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoveFromCart implements a.J.InterfaceC0007a {

        @NotNull
        public static final RemoveFromCart INSTANCE = new RemoveFromCart();

        private RemoveFromCart() {
        }
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, OutOfStockViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OutOfStockDTO, d, List<OutOfStockVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OutOfStockComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return OutOfStockComponent.INSTANCE.createComponent(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public OutOfStockVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull OutOfStockVO oldItem) {
        OutOfStockVO copy;
        OutOfStockVO copy2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AddToCart) {
            copy2 = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.sku : 0L, (r29 & 4) != 0 ? oldItem.deeplink : null, (r29 & 8) != 0 ? oldItem.image : null, (r29 & 16) != 0 ? oldItem.price : null, (r29 & 32) != 0 ? oldItem.deliveryInfo : null, (r29 & 64) != 0 ? oldItem.sellerInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isInCart : true, (r29 & 256) != 0 ? oldItem.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.rawTrackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.params : null, (r29 & 2048) != 0 ? oldItem.selectedDeliverySchema : null);
            return copy2;
        }
        if (!(update instanceof RemoveFromCart)) {
            return null;
        }
        copy = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.sku : 0L, (r29 & 4) != 0 ? oldItem.deeplink : null, (r29 & 8) != 0 ? oldItem.image : null, (r29 & 16) != 0 ? oldItem.price : null, (r29 & 32) != 0 ? oldItem.deliveryInfo : null, (r29 & 64) != 0 ? oldItem.sellerInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isInCart : false, (r29 & 256) != 0 ? oldItem.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.rawTrackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.params : null, (r29 & 2048) != 0 ? oldItem.selectedDeliverySchema : null);
        return copy;
    }
}
