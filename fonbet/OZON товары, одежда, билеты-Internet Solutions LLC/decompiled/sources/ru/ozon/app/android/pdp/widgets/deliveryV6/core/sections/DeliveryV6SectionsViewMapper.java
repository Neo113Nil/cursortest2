package ru.ozon.app.android.pdp.widgets.deliveryV6.core.sections;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryErrorUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliverySuccessUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R<\u0010\u001d\u001a$\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001bj\b\u0012\u0004\u0012\u00020\u0004`\u001c0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070%0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/core/sections/DeliveryV6SectionsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;)Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "Ljava/lang/Class;", "getSupportedUpdates", "()Ljava/util/List;", "supportedUpdates", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryV6SectionsViewMapper extends WidgetViewMapper2<DeliveryV6WidgetComponent, DeliveryDTOHolder, DeliveryV6VO.Sections> {

    @NotNull
    private final Function2<View, ComposerReferences, k<DeliveryV6VO.Sections>> holderProducer = new DeliveryV6SectionsViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DeliveryV6VO.Sections>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DeliveryDTOHolder, d, List<DeliveryV6VO.Sections>> getMapper() {
        return component().getDeliveryV6SectionsMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return C7714v.b0(AsyncDeliverySuccessUpdateKey.class, AsyncDeliveryErrorUpdateKey.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryV6WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return DeliveryV6WidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public RecyclerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.deliveryRvV6);
        recyclerView.setNestedScrollingEnabled(false);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext()));
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public DeliveryV6VO.Sections handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DeliveryV6VO.Sections oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AsyncDeliverySuccessUpdateKey) {
            AsyncDeliverySuccessUpdateKey asyncDeliverySuccessUpdateKey = (AsyncDeliverySuccessUpdateKey) update;
            if (asyncDeliverySuccessUpdateKey.getVo() instanceof DeliveryV6VO.Sections) {
                return (DeliveryV6VO.Sections) asyncDeliverySuccessUpdateKey.getVo();
            }
        } else if (update instanceof AsyncDeliveryErrorUpdateKey) {
            return null;
        }
        return oldItem;
    }
}
