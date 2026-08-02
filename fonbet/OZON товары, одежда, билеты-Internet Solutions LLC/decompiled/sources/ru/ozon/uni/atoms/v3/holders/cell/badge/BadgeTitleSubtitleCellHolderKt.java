package ru.ozon.uni.atoms.v3.holders.cell.badge;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.badge.badgeTitleSubtitleCell.BadgeTitleSubtitleCellView;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/BadgeTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "bindCellData", "(Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/BadgeTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bindCellData(@NotNull BadgeTitleSubtitleCellView badgeTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(badgeTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(badgeTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO);
        badgeTitleSubtitleCellView.setBadgeVisible(badgeDTO != null);
        BadgeHolderKt.bindOrGone$default(badgeTitleSubtitleCellView.getAddonView(), badgeDTO != null ? BadgeDTO.copy$default(badgeDTO, null, null, badgeTitleSubtitleCellView.getPreset().getBadgeAddonWrapperPreset().getBadgeSize(), null, null, null, null, null, null, null, null, null, 4091, null) : null, (Function1) null, 2, (Object) null);
    }
}
