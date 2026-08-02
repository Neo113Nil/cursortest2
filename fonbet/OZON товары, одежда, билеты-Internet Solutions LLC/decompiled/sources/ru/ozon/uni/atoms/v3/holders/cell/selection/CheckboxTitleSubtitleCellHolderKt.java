package ru.ozon.uni.atoms.v3.holders.cell.selection;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "checkBox", "", "bindCellData", "(Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckboxTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, @NotNull CheckboxTitleSubtitleCellDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(checkboxTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(checkboxTitleSubtitleCellView, dto, new CheckboxTitleSubtitleCellHolderKt$bind$provider$1(checkboxTitleSubtitleCellView), function1);
    }

    public static /* synthetic */ void bind$default(CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(checkboxTitleSubtitleCellView, checkboxTitleSubtitleCellDTO, function1);
    }

    @InterfaceC3999a
    public static final void bindCellData(@NotNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CheckBoxDTO checkBoxDTO) {
        Intrinsics.checkNotNullParameter(checkboxTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(checkboxTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO);
        CheckBoxHolderKt.bindOrGone$default(checkboxTitleSubtitleCellView.getAddonView(), checkBoxDTO, null, 2, null);
        if (checkBoxDTO != null) {
            checkboxTitleSubtitleCellView.getAddonView().initListener(false);
        }
    }

    @InterfaceC3999a
    public static final void bindOrGone(@NotNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(checkboxTitleSubtitleCellView, "<this>");
        if (checkboxTitleSubtitleCellDTO == null) {
            checkboxTitleSubtitleCellView.setVisibility(8);
        } else {
            checkboxTitleSubtitleCellView.setVisibility(0);
            bind(checkboxTitleSubtitleCellView, checkboxTitleSubtitleCellDTO, function1);
        }
    }
}
