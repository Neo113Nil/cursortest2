package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCounterView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleCounterView;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleCounterView;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitleCounterHolderKt {
    public static final void bind(@NotNull CellWithSubtitleCounterView cellWithSubtitleCounterView, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(cellWithSubtitleCounterView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(cellWithSubtitleCounterView, dto, new CellWithSubtitleCounterHolderKt$bind$provider$1(cellWithSubtitleCounterView), function1);
    }

    public static final void bindOrGone(@NotNull CellWithSubtitleCounterView cellWithSubtitleCounterView, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(cellWithSubtitleCounterView, "<this>");
        if (cellWithSubtitleCounter == null) {
            ViewExtKt.gone(cellWithSubtitleCounterView);
        } else {
            bind(cellWithSubtitleCounterView, cellWithSubtitleCounter, function1);
            ViewExtKt.show(cellWithSubtitleCounterView);
        }
    }
}
