package ru.ozon.app.android.account.orders.clicktodeliverymodal.core.delivery;

import EV.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.DeliveryDTO;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery.DeliveryDecoration;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery.DeliveryVI;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery.DeliveryView;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery.DeliveryWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/delivery/DeliveryViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/di/ClickToDeliveryWidgetComponent;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/DeliveryDTO;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryVI;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryView;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/delivery/DeliveryMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/delivery/DeliveryMapper;", "mapper", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryViewMapper extends WidgetViewMapper2<ClickToDeliveryWidgetComponent, DeliveryDTO, DeliveryVI> {

    @NotNull
    private final Function2<View, ComposerReferences, DeliveryWidgetViewHolder> holderProducer = new DeliveryViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClickToDeliveryWidgetComponent widgetComponent$lambda$1(C7475g c7475g) {
        return ClickToDeliveryWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof DeliveryDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<DeliveryDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new DeliveryDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, DeliveryWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ClickToDeliveryWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ClickToDeliveryWidgetComponent.class), new a(storage, 17));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public DeliveryView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DeliveryView deliveryView = new DeliveryView(context, null, 0, 0, 14, null);
        deliveryView.setLayoutParams(new RecyclerView.p(-1, -2));
        return deliveryView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public DeliveryMapper getMapper() {
        return component().getDeliveryMapper();
    }
}
