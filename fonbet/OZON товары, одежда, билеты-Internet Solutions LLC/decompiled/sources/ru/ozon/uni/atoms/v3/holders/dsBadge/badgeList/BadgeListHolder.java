package ru.ozon.uni.atoms.v3.holders.dsBadge.badgeList;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeCommonKt;
import ru.ozon.uni.android.atom.badge.badgeList.BadgeListView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/dsBadge/badgeList/BadgeListHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "Lru/ozon/uni/android/atom/badge/badgeList/BadgeListView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/badge/badgeList/BadgeListView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeListHolder extends AtomV3<BadgeListDTO, BadgeListView> implements WrappedAtomHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeListHolder(@NotNull BadgeListView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeListHolder(@NotNull Context context, String str) {
        this(new BadgeListView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull BadgeListDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((BadgeListHolder) item);
        BadgeListView containerView = getContainerView();
        Resources resources = containerView.getResources();
        CommonCellSettings.LayoutPadding topPadding = item.getTopPadding();
        int dimension = (int) resources.getDimension(topPadding != null ? topPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
        Resources resources2 = containerView.getResources();
        CommonCellSettings.LayoutPadding rightPadding = item.getRightPadding();
        int dimension2 = (int) resources2.getDimension(rightPadding != null ? rightPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
        Resources resources3 = containerView.getResources();
        CommonCellSettings.LayoutPadding bottomPadding = item.getBottomPadding();
        containerView.setPadding(0, dimension, dimension2, (int) resources3.getDimension(bottomPadding != null ? bottomPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone()));
        Resources resources4 = containerView.getResources();
        CommonCellSettings.LayoutPadding gap = item.getGap();
        containerView.setGap((int) resources4.getDimension(gap != null ? gap.getCellLayoutPadding() : CommonCellSettingsKt.getPadding200()));
        Resources resources5 = containerView.getResources();
        CommonCellSettings.LayoutPadding leftPadding = item.getLeftPadding();
        containerView.setLeftPadding((int) resources5.getDimension(leftPadding != null ? leftPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone()));
        BadgeDTO.BadgeSize badgesSize = item.getBadgesSize();
        if (badgesSize == null) {
            badgesSize = BadgeDTO.BadgeSize.SIZE_500;
        }
        containerView.setBadgesSize(badgesSize);
        containerView.setMinimumHeight(UiExtKt.toPx(BadgeCommonKt.getSize(containerView.getBadgesSize())));
        BadgeDTO.Style badgesStyle = item.getBadgesStyle();
        if (badgesStyle == null) {
            badgesStyle = BadgeDTO.Style.NEUTRAL_SECONDARY;
        }
        containerView.setBadgesStyle(badgesStyle);
        containerView.submitBadges(item.getBadges());
    }
}
