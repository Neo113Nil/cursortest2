package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddDTO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddMapper;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di.ParcelPhotoAddComponent;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.view.ParcelPhotoAddView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/di/ParcelPhotoAddComponent;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddMapper;", "getMapper", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddMapper;", "mapper", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParcelPhotoAddViewMapper extends WidgetViewMapper2<ParcelPhotoAddComponent, ParcelPhotoAddDTO, ParcelPhotoAddVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ParcelPhotoAddWidgetViewHolder> holderProducer = new ParcelPhotoAddViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ParcelPhotoAddDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ParcelPhotoAddWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ParcelPhotoAddComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ParcelPhotoAddComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public ParcelPhotoAddView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ParcelPhotoAddView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ParcelPhotoAddMapper getMapper() {
        return component().getParcelPhotoAddMapper();
    }
}
