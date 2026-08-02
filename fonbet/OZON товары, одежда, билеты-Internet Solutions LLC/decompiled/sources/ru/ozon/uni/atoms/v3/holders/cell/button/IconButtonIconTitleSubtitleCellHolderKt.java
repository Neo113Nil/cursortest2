package ru.ozon.uni.atoms.v3.holders.cell.button;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.button.iconButtonIconTitleSubtitleCell.IconButtonIconTitleSubtitleCellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aO\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/IconButtonIconTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "button", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bindCellData", "(Lru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/IconButtonIconTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lkotlin/jvm/functions/Function1;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconButtonIconTitleSubtitleCellHolderKt {
    public static final void bindCellData(@NotNull IconButtonIconTitleSubtitleCellView iconButtonIconTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO, IconButtonDTO iconButtonDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(iconButtonIconTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        IconTitleSubtitleCellHolderKt.bindCellData(iconButtonIconTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO, iconDTO);
        IconButtonHolderKt.bindOrGone(iconButtonIconTitleSubtitleCellView.getAddonView(), iconButtonDTO, function1);
    }
}
