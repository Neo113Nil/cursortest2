package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.composer.ComposerReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderHolder$checkIfAddressChanged$1", f = "FreshMiniappHeaderHolder.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshMiniappHeaderHolder$checkIfAddressChanged$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ FreshMiniappHeaderHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshMiniappHeaderHolder$checkIfAddressChanged$1(FreshMiniappHeaderHolder freshMiniappHeaderHolder, d<? super FreshMiniappHeaderHolder$checkIfAddressChanged$1> dVar) {
        super(2, dVar);
        this.this$0 = freshMiniappHeaderHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshMiniappHeaderHolder$checkIfAddressChanged$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddressUiInfoViewModel addressUiInfoViewModel;
        boolean filterUnchanged;
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            addressUiInfoViewModel = this.this$0.addressViewModel;
            InterfaceC2395h<AddressCell> addressCellFlow = addressUiInfoViewModel.getAddressCellFlow();
            this.label = 1;
            obj = C2399j.w(addressCellFlow, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        AddressCell addressCell = (AddressCell) obj;
        if (addressCell == null || (addressCell.getCell() instanceof AddressCell.RightLeftTitlesCell24Icon)) {
            return Unit.f71690a;
        }
        Object cell = addressCell.getCell();
        CellAtom.CellRegular24IconPicker cellRegular24IconPicker = cell instanceof CellAtom.CellRegular24IconPicker ? (CellAtom.CellRegular24IconPicker) cell : null;
        if (cellRegular24IconPicker != null) {
            filterUnchanged = this.this$0.filterUnchanged(cellRegular24IconPicker);
            if (!filterUnchanged) {
                composerReferences = this.this$0.references;
                InterfaceC7851b.a.e(composerReferences.getController(), null, null, null, 7);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshMiniappHeaderHolder$checkIfAddressChanged$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
