package ru.ozon.uni.atoms.v3.holders.cell.disclosureCell;

import Sc.InterfaceC3999a;
import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureCellApi;
import ru.ozon.uni.android.cell.disclosure.disclosureBadgeIconTitleSubtitleCell.DisclosureBadgeIconTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.cell.badge.BadgeIconTitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/disclosureBadgeIconTitleSubtitleCell/DisclosureBadgeIconTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "commonAtomIcon", "", "bindCellData", "(Lru/ozon/uni/android/cell/disclosure/disclosureBadgeIconTitleSubtitleCell/DisclosureBadgeIconTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclosureBadgeIconTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bindCellData(@NotNull DisclosureBadgeIconTitleSubtitleCellView disclosureBadgeIconTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO, BadgeDTO badgeDTO, CommonAtomIconDTO commonAtomIconDTO) {
        Intrinsics.checkNotNullParameter(disclosureBadgeIconTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        BadgeIconTitleSubtitleCellHolderKt.bindCellData(disclosureBadgeIconTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO, iconDTO, badgeDTO);
        if (commonAtomIconDTO != null) {
            Context context = disclosureBadgeIconTitleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            disclosureBadgeIconTitleSubtitleCellView.setDisclosureIcon(TokensExtKt.getIconResByToken(context, commonAtomIconDTO.getIcon()));
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = disclosureBadgeIconTitleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer mapColor = styleParser.mapColor(context2, commonAtomIconDTO.getTintColor());
            if (mapColor != null) {
                DisclosureCellApi.DefaultImpls.setDisclosureIconColor$default(disclosureBadgeIconTitleSubtitleCellView, a.getColor(disclosureBadgeIconTitleSubtitleCellView.getContext(), mapColor.intValue()), 0.0f, 2, null);
            }
        }
        disclosureBadgeIconTitleSubtitleCellView.setDisclosureVisible(commonAtomIconDTO != null);
    }
}
