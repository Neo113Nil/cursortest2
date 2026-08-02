package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper;

import Bm.C2665a;
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
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewHolder.ReturnCreationDeliveryViewHolder;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewObject.DeliveryVO;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.recyclerView.ReturnCreationDeliveryOffsetDecoration;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/di/DeliveryGroupComponent;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewObject/DeliveryVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewHolder/ReturnCreationDeliveryViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryMapper;", "getMapper", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryMapper;", "mapper", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationDeliveryViewMapper extends WidgetViewMapper2<DeliveryGroupComponent, TextDTO, DeliveryVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ReturnCreationDeliveryViewHolder> holderProducer = ReturnCreationDeliveryViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeliveryGroupComponent widgetComponent$lambda$1(C7475g c7475g) {
        return DeliveryGroupComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TextDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setBackgroundColor(parent.getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()));
        return textAtomV2View;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ReturnCreationDeliveryOffsetDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ReturnCreationDeliveryViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryGroupComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(DeliveryGroupComponent.class), new C2665a(storage, 2));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ReturnCreationDeliveryMapper getMapper() {
        return component().getDeliveryMapper();
    }
}
