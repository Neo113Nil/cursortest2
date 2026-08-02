package ru.ozon.uni.atoms.v3.holders.cell.disclosureCell;

import Sc.InterfaceC3999a;
import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureCellApi;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u0010\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "commonAtomIcon", "", "bindCellData", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;Lkotlin/jvm/functions/Function1;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclosureIconTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView, @NotNull DisclosureIconTitleSubtitleCellDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(disclosureIconTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(disclosureIconTitleSubtitleCellView, dto, new DisclosureIconTitleSubtitleCellHolderKt$bind$provider$1(disclosureIconTitleSubtitleCellView), function1);
    }

    public static /* synthetic */ void bind$default(DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView, DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(disclosureIconTitleSubtitleCellView, disclosureIconTitleSubtitleCellDTO, function1);
    }

    @InterfaceC3999a
    public static final void bindCellData(@NotNull DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO, CommonAtomIconDTO commonAtomIconDTO) {
        Intrinsics.checkNotNullParameter(disclosureIconTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        IconTitleSubtitleCellHolderKt.bindCellData(disclosureIconTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO, iconDTO);
        if (commonAtomIconDTO != null) {
            Context context = disclosureIconTitleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            disclosureIconTitleSubtitleCellView.setDisclosureIcon(TokensExtKt.getIconResByToken(context, commonAtomIconDTO.getIcon()));
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = disclosureIconTitleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer mapColor = styleParser.mapColor(context2, commonAtomIconDTO.getTintColor());
            if (mapColor != null) {
                DisclosureCellApi.DefaultImpls.setDisclosureIconColor$default(disclosureIconTitleSubtitleCellView, a.getColor(disclosureIconTitleSubtitleCellView.getContext(), mapColor.intValue()), 0.0f, 2, null);
            }
        }
        disclosureIconTitleSubtitleCellView.setDisclosureVisible(commonAtomIconDTO != null);
    }
}
