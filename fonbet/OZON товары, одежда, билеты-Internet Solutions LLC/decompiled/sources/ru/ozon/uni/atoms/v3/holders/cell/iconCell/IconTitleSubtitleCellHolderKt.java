package ru.ozon.uni.atoms.v3.holders.cell.iconCell;

import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "bindCellData", "(Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull IconTitleSubtitleCellView iconTitleSubtitleCellView, @NotNull IconTitleSubtitleCellDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(iconTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(iconTitleSubtitleCellView, dto, new IconTitleSubtitleCellHolderKt$bind$provider$1(iconTitleSubtitleCellView), function1);
    }

    public static /* synthetic */ void bind$default(IconTitleSubtitleCellView iconTitleSubtitleCellView, IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(iconTitleSubtitleCellView, iconTitleSubtitleCellDTO, function1);
    }

    @InterfaceC3999a
    public static final void bindCellData(@NotNull IconTitleSubtitleCellView iconTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO) {
        Intrinsics.checkNotNullParameter(iconTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(iconTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO);
        iconTitleSubtitleCellView.setIconVisible(iconDTO != null);
        IconHolderKt.bindOrGone$default(iconTitleSubtitleCellView.getAddonView(), iconDTO != null ? iconDTO.copy((r34 & 1) != 0 ? iconDTO.size : iconTitleSubtitleCellView.getPreset().getIconAddonWrapperPreset().getSize(), (r34 & 2) != 0 ? iconDTO.hasShape : null, (r34 & 4) != 0 ? iconDTO.shape : null, (r34 & 8) != 0 ? iconDTO.text : null, (r34 & 16) != 0 ? iconDTO.icon : null, (r34 & 32) != 0 ? iconDTO.backgroundImage : null, (r34 & 64) != 0 ? iconDTO.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iconDTO.textColor : null, (r34 & 256) != 0 ? iconDTO.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iconDTO.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iconDTO.borderWidth : null, (r34 & 2048) != 0 ? iconDTO.isBorderInside : null, (r34 & 4096) != 0 ? iconDTO.hasParanja : null, (r34 & 8192) != 0 ? iconDTO.getContext() : null, (r34 & 16384) != 0 ? iconDTO.getTestInfo() : null, (r34 & 32768) != 0 ? iconDTO.getTrackingInfo() : null) : null, null, 2, null);
    }

    @InterfaceC3999a
    public static final void bindOrGone(@NotNull IconTitleSubtitleCellView iconTitleSubtitleCellView, IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(iconTitleSubtitleCellView, "<this>");
        if (iconTitleSubtitleCellDTO == null) {
            iconTitleSubtitleCellView.setVisibility(8);
        } else {
            iconTitleSubtitleCellView.setVisibility(0);
            bind(iconTitleSubtitleCellView, iconTitleSubtitleCellDTO, function1);
        }
    }
}
