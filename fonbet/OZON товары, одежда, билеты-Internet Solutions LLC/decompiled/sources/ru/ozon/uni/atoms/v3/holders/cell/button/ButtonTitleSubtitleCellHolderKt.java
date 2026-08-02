package ru.ozon.uni.atoms.v3.holders.cell.button;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.button.buttonTitleSubtitleCell.ButtonTitleSubtitleCellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/ButtonTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "button", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bindCellData", "(Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/ButtonTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lkotlin/jvm/functions/Function1;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonTitleSubtitleCellHolderKt {
    public static final void bindCellData(@NotNull ButtonTitleSubtitleCellView buttonTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, ButtonDTO buttonDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(buttonTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(buttonTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO);
        ButtonHolderKt.bindOrGone(buttonTitleSubtitleCellView.getAddonView(), buttonDTO, function1);
    }
}
