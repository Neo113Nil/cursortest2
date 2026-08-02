package ru.ozon.uni.atoms.v3.holders.cell.image;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.image.ImageTitleSubtitleCellV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/cell/image/ImageTitleSubtitleCellV2View;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "bindCellData", "(Lru/ozon/uni/android/cell/image/ImageTitleSubtitleCellV2View;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/cell/image/ImageTitleSubtitleCellV2View;Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;Lkotlin/jvm/functions/Function1;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageTitleSubtitleCellV2HolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View, @NotNull ImageTitleSubtitleCellDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(imageTitleSubtitleCellV2View, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(imageTitleSubtitleCellV2View, dto, new ImageTitleSubtitleCellV2HolderKt$bind$provider$1(imageTitleSubtitleCellV2View), function1);
    }

    public static /* synthetic */ void bind$default(ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View, ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(imageTitleSubtitleCellV2View, imageTitleSubtitleCellDTO, function1);
    }

    @InterfaceC3999a
    public static final void bindCellData(@NotNull ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, ImageDTO imageDTO) {
        Intrinsics.checkNotNullParameter(imageTitleSubtitleCellV2View, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(imageTitleSubtitleCellV2View.getMainView(), title, commonAtomLabelDTO);
        imageTitleSubtitleCellV2View.setImageVisible(imageDTO != null);
        ImageHolderKt.bindOrGone$default(imageTitleSubtitleCellV2View.getAddonView(), imageDTO, null, 2, null);
    }
}
