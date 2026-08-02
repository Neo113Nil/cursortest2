package ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.annotation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryErrorUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliverySuccessUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR<\u0010#\u001a$\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040!j\b\u0012\u0004\u0012\u00020\u0004`\"0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/annotation/DeliveryV6HeaderAnnotationViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Annotation;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Annotation;)Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Annotation;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "getMapper", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryV6HeaderAnnotationViewMapper extends WidgetViewMapper2<DeliveryV6WidgetComponent, DeliveryDTOHolder, DeliveryV6VO.Header.Annotation> {

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AsyncDeliverySuccessUpdateKey.class, AsyncDeliveryErrorUpdateKey.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<DeliveryV6VO.Header.Annotation>> holderProducer = new DeliveryV6HeaderAnnotationViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DeliveryV6VO.Header.Annotation>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DeliveryDTOHolder, d, List<DeliveryV6VO.Header.Annotation>> getMapper() {
        return component().getDeliveryV6HeaderAnnotationMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryV6WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return DeliveryV6WidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public DisclaimerContainer createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DisclaimerContainer disclaimerContainer = new DisclaimerContainer(context, null, 0, 6, null);
        disclaimerContainer.setId(R$id.deliveryV6HeaderAnnotation);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, 0);
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
        marginLayoutParams.setMargins(sellerV4DisclosureViewFactory.getDp16(), 0, sellerV4DisclosureViewFactory.getDp16(), 0);
        disclaimerContainer.setLayoutParams(marginLayoutParams);
        return disclaimerContainer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public DeliveryV6VO.Header.Annotation handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DeliveryV6VO.Header.Annotation oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof AsyncDeliverySuccessUpdateKey)) {
            if (update instanceof AsyncDeliveryErrorUpdateKey) {
                return null;
            }
            return oldItem;
        }
        AsyncDeliverySuccessUpdateKey asyncDeliverySuccessUpdateKey = (AsyncDeliverySuccessUpdateKey) update;
        if (asyncDeliverySuccessUpdateKey.getVo() instanceof DeliveryV6VO.Header.Annotation) {
            return (DeliveryV6VO.Header.Annotation) asyncDeliverySuccessUpdateKey.getVo();
        }
        return null;
    }
}
