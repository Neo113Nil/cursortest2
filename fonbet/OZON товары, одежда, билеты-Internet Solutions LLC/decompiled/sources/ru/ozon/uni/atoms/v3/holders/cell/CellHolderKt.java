package ru.ozon.uni.atoms.v3.holders.cell;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHolderKt {
    public static final void bind(@NotNull CellView cellView, @NotNull CellDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(cellView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(cellView, dto, new CellHolderKt$bind$provider$1(cellView), function1);
    }

    public static /* synthetic */ void bind$default(CellView cellView, CellDTO cellDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(cellView, cellDTO, function1);
    }

    public static final void bindOrGone(@NotNull CellView cellView, CellDTO cellDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(cellView, "<this>");
        if (cellDTO == null) {
            ViewExtKt.gone(cellView);
        } else {
            bind(cellView, cellDTO, function1);
            ViewExtKt.show(cellView);
        }
    }

    public static /* synthetic */ void bindOrGone$default(CellView cellView, CellDTO cellDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(cellView, cellDTO, function1);
    }
}
