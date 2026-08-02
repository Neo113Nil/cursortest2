package ru.ozon.app.android.ugc.widgets.selectionItemForm.cell;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data.SelectionFormCellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormPlatformUpdateKey;", "LA00/a$J$a;", "Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;", "cellDTO", "<init>", "(Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;)V", "Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;", "getCellDTO", "()Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionFormPlatformUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final SelectionFormCellDTO cellDTO;

    public SelectionFormPlatformUpdateKey(@NotNull SelectionFormCellDTO cellDTO) {
        Intrinsics.checkNotNullParameter(cellDTO, "cellDTO");
        this.cellDTO = cellDTO;
    }

    @NotNull
    public final SelectionFormCellDTO getCellDTO() {
        return this.cellDTO;
    }
}
