package ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation;

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
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.data.CellListDTO;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.di.CellListDIComponent;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/CellListViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/di/CellListDIComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;)Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/CellListViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/CellListMapper;", "getMapper", "()Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/CellListMapper;", "mapper", "", "Ljava/lang/Class;", "getSupportedUpdates", "()Ljava/util/List;", "supportedUpdates", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CellListViewMapper extends WidgetViewMapper2<CellListDIComponent, CellListDTO, FreshCellVO> {

    @NotNull
    private final Function2<View, ComposerReferences, CellListViewHolder> holderProducer = new CellListViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new FreshCellView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CellListViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return C7714v.a0(FreshCellRadioUpdate.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CellListDIComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CellListDIComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CellListMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public FreshCellVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FreshCellVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof FreshCellRadioUpdate)) {
            return oldItem;
        }
        CellDTO cell = oldItem.getCell();
        CellDTO.RightBlock rightBlock = oldItem.getCell().getRightBlock();
        CellDTO.RightBlock rightBlock2 = null;
        if (rightBlock != null) {
            CellDTO.RightBlock rightBlock3 = oldItem.getCell().getRightBlock();
            AtomDTO control = rightBlock3 != null ? rightBlock3.getControl() : null;
            Intrinsics.g(control, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO");
            rightBlock2 = CellDTO.RightBlock.copy$default(rightBlock, null, null, null, null, null, null, null, null, null, null, RadioDTO.copy$default((RadioDTO) control, null, Boolean.valueOf(oldItem.getId() == ((FreshCellRadioUpdate) update).getItemId()), null, null, null, null, 61, null), null, 3071, null);
        }
        return FreshCellVO.copy$default(oldItem, 0L, CellDTO.copy$default(cell, null, null, null, rightBlock2, null, 23, null), null, null, null, null, null, null, 0.0f, null, null, 2045, null);
    }
}
