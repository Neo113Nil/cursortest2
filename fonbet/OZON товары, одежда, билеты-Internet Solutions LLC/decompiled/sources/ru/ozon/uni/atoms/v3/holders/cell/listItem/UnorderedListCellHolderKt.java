package ru.ozon.uni.atoms.v3.holders.cell.listItem;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.listItem.UnorderedListCellView;
import ru.ozon.uni.android.cell.listItem.data.ListCellWrapperPreset;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.UnorderedListCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/cell/listItem/UnorderedListCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "", "bindCellData", "(Lru/ozon/uni/android/cell/listItem/UnorderedListCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;)V", "Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "preset", "bind", "(Lru/ozon/uni/android/cell/listItem/UnorderedListCellView;Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnorderedListCellHolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull UnorderedListCellView unorderedListCellView, @NotNull UnorderedListCellDTO dto, Function1<? super AtomAction, Unit> function1, ListCellWrapperPreset listCellWrapperPreset) {
        Intrinsics.checkNotNullParameter(unorderedListCellView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (listCellWrapperPreset != null) {
            unorderedListCellView.setPreset(listCellWrapperPreset);
        }
        BindExtKt.bindHolder(unorderedListCellView, dto, new UnorderedListCellHolderKt$bind$provider$1(unorderedListCellView), function1);
    }

    @InterfaceC3999a
    public static final void bindCellData(@NotNull UnorderedListCellView unorderedListCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO) {
        Intrinsics.checkNotNullParameter(unorderedListCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(unorderedListCellView.getMainView(), title, commonAtomLabelDTO);
    }
}
