package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle40IconCheckboxRadioView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle40IconCheckboxRadioView;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle40IconCheckboxRadioView;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;Lkotlin/jvm/functions/Function1;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitle40IconCheckboxRadioHolderKt {
    public static final void bind(@NotNull CellWithSubtitle40IconCheckboxRadioView cellWithSubtitle40IconCheckboxRadioView, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(cellWithSubtitle40IconCheckboxRadioView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(cellWithSubtitle40IconCheckboxRadioView, dto, new CellWithSubtitle40IconCheckboxRadioHolderKt$bind$provider$1(cellWithSubtitle40IconCheckboxRadioView), function1);
    }

    public static /* synthetic */ void bind$default(CellWithSubtitle40IconCheckboxRadioView cellWithSubtitle40IconCheckboxRadioView, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(cellWithSubtitle40IconCheckboxRadioView, cellWithSubtitle40IconCheckboxRadio, function1);
    }
}
