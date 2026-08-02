package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewMapper;

import A00.a;
import Sc.o;
import Tc.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.CellListUpdateKey;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.cellList.CellListDTO;
import ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewHolder.CellListDisableScrollUpdateKey;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewItem.CellListVI;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR<\u0010 \u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001ej\b\u0012\u0004\u0012\u00020\u0004`\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010#¨\u0006-"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewMapper/CellListViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/di/CmlCellListComponent;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/cellList/CellListDTO;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;)Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CellListViewMapper extends WidgetViewMapper2<CmlCellListComponent, CellListDTO, CellListVI> {

    @NotNull
    private final Function2<View, ComposerReferences, k<CellListVI>> holderProducer = new CellListViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(CellListUpdateKey.Append.class, CellListUpdateKey.Replace.class, CellListDisableScrollUpdateKey.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CellListDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new FrameLayout(parent.getContext());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CellListVI>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CellListDTO, d, List<CellListVI>> getMapper() {
        return component().getCellListMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CmlCellListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CmlCellListComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CellListVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CellListVI oldItem) {
        CmlCellListMoleculeDTO copy;
        CellListVI copy$default;
        CmlCellListMoleculeDTO copy2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof CellListDisableScrollUpdateKey) {
            return CellListVI.copy$default(oldItem, 0L, null, null, null, 0, false, 31, null);
        }
        if (!(update instanceof CellListUpdateKey)) {
            return null;
        }
        CellListUpdateKey cellListUpdateKey = (CellListUpdateKey) update;
        if (cellListUpdateKey.getItemId() != oldItem.getId()) {
            return null;
        }
        if (cellListUpdateKey instanceof CellListUpdateKey.Append) {
            CmlCellListMoleculeDTO cellList = oldItem.getCellList();
            b builder = C7714v.B();
            builder.addAll(oldItem.getCellList().getCells());
            builder.addAll(((CellListUpdateKey.Append) update).getCells());
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            copy2 = cellList.copy((r32 & 1) != 0 ? cellList.islandCornerRadius : null, (r32 & 2) != 0 ? cellList.topIslandCornerRadius : null, (r32 & 4) != 0 ? cellList.bottomIslandCornerRadius : null, (r32 & 8) != 0 ? cellList.islandColor : null, (r32 & 16) != 0 ? cellList.backgroundColor : null, (r32 & 32) != 0 ? cellList.leftMargin : null, (r32 & 64) != 0 ? cellList.rightMargin : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellList.topMargin : null, (r32 & 256) != 0 ? cellList.bottomMargin : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellList.leftPadding : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellList.rightPadding : null, (r32 & 2048) != 0 ? cellList.trackingInfo : null, (r32 & 4096) != 0 ? cellList.enableHtmlTags : null, (r32 & 8192) != 0 ? cellList.enableCellsSeparators : null, (r32 & 16384) != 0 ? cellList.cells : builder.B());
            copy$default = CellListVI.copy$default(oldItem, 0L, copy2, null, null, 0, false, 61, null);
        } else {
            if (!(cellListUpdateKey instanceof CellListUpdateKey.Replace)) {
                throw new o();
            }
            copy = r2.copy((r32 & 1) != 0 ? r2.islandCornerRadius : null, (r32 & 2) != 0 ? r2.topIslandCornerRadius : null, (r32 & 4) != 0 ? r2.bottomIslandCornerRadius : null, (r32 & 8) != 0 ? r2.islandColor : null, (r32 & 16) != 0 ? r2.backgroundColor : null, (r32 & 32) != 0 ? r2.leftMargin : null, (r32 & 64) != 0 ? r2.rightMargin : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r2.topMargin : null, (r32 & 256) != 0 ? r2.bottomMargin : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r2.leftPadding : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r2.rightPadding : null, (r32 & 2048) != 0 ? r2.trackingInfo : null, (r32 & 4096) != 0 ? r2.enableHtmlTags : null, (r32 & 8192) != 0 ? r2.enableCellsSeparators : null, (r32 & 16384) != 0 ? oldItem.getCellList().cells : ((CellListUpdateKey.Replace) update).getCells());
            copy$default = CellListVI.copy$default(oldItem, 0L, copy, null, null, 0, true, 29, null);
        }
        CellListVI cellListVI = copy$default;
        return CellListVI.copy$default(cellListVI, 0L, null, component().getCellListMoleculeMapper().map(cellListVI.getCellList()), null, 0, false, 59, null);
    }
}
