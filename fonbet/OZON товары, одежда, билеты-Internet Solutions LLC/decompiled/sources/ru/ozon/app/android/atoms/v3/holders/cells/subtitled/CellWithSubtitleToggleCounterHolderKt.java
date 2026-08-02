package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleCounterView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleCounterView;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "isSelect", "bind", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleCounterView;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;Lkotlin/jvm/functions/Function1;Z)V", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellWithSubtitleToggleCounterHolderKt {
    public static final void bind(@NotNull CellWithSubtitleToggleCounterView cellWithSubtitleToggleCounterView, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter dto, Function1<? super AtomAction, Unit> function1, boolean z11) {
        Intrinsics.checkNotNullParameter(cellWithSubtitleToggleCounterView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(cellWithSubtitleToggleCounterView, dto, new CellWithSubtitleToggleCounterHolderKt$bind$provider$1(cellWithSubtitleToggleCounterView, z11), function1);
        int i11 = z11 ? R$attr.textPrimary : R$attr.oz_semantic_accent_primary;
        TextAtomView subtitleTav = cellWithSubtitleToggleCounterView.getSubtitleTav();
        Context context = cellWithSubtitleToggleCounterView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        subtitleTav.setLinkTextColor(ThemeExtKt.themeColor(context, i11));
    }
}
