package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderVO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/HeaderMapper;", "", "<init>", "()V", "map", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "state", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "replaceBadgeAction", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HeaderMapper {
    private final BadgeDTO replaceBadgeAction(BadgeDTO badgeDTO, HeaderDTO headerDTO) {
        return headerDTO.getAction() != null ? BadgeDTO.copy$default(badgeDTO, null, null, null, null, null, new CommonControlSettings(headerDTO.getAction(), headerDTO.getTrackingInfo(), null, 4, null), null, null, null, null, null, null, 4063, null) : BadgeDTO.copy$default(badgeDTO, null, null, null, null, null, null, null, null, null, null, null, null, 4063, null);
    }

    @NotNull
    public final HeaderVO map(@NotNull HeaderDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        long hashCode = state.hashCode();
        BadgeDTO badge = state.getBadge();
        TextDTO title = state.getTitle();
        title.setTagSupported(true);
        TextDTO subtitle = state.getSubtitle();
        if (subtitle != null) {
            subtitle.setTagSupported(true);
        } else {
            subtitle = null;
        }
        BadgeDTO replaceBadgeAction = badge != null ? replaceBadgeAction(badge, state) : null;
        boolean isTopRounded = state.isTopRounded();
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return new HeaderVO(hashCode, title, subtitle, replaceBadgeAction, atomAction, isTopRounded, state.getBackgroundColor(), trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, UiExtKt.toPxF(state.getTopIslandCornerRadius().getPx()), ResourceExtKt.toPx(state.getLeftMargin().getPx()), ResourceExtKt.toPx(state.getTopMargin().getPx()), ResourceExtKt.toPx(state.getRightMargin().getPx()), ResourceExtKt.toPx(state.getBottomMargin().getPx()));
    }
}
