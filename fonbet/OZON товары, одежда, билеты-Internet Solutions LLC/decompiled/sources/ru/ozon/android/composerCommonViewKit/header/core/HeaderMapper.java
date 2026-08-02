package ru.ozon.android.composerCommonViewKit.header.core;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderVO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/android/composerCommonViewKit/header/core/HeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "Ll20/d;", "", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "Lru/ozon/android/composerCommonViewKit/parsing/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "state", "replaceBadgeAction", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "widgetInfo", "invoke", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ll20/d;)Ljava/util/List;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HeaderMapper implements Function2<HeaderDTO, d, List<? extends HeaderVO>> {
    private final BadgeDTO replaceBadgeAction(BadgeDTO badgeDTO, HeaderDTO headerDTO) {
        return headerDTO.getAction() != null ? BadgeDTO.copy$default(badgeDTO, null, null, null, null, null, new CommonControlSettings(headerDTO.getAction(), headerDTO.getTrackingInfo(), null, 4, null), null, null, null, null, null, null, 4063, null) : BadgeDTO.copy$default(badgeDTO, null, null, null, null, null, null, null, null, null, null, null, null, 4063, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HeaderVO> invoke(@NotNull HeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
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
        return C7714v.a0(new HeaderVO(hashCode, title, subtitle, replaceBadgeAction, atomAction, isTopRounded, state.getBackgroundColor(), trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, UiExtKt.toPxF(state.getTopIslandCornerRadius().getPx()), UiExtKt.toPx(state.getLeftMargin().getPx()), UiExtKt.toPx(state.getTopMargin().getPx()), UiExtKt.toPx(state.getRightMargin().getPx()), UiExtKt.toPx(state.getBottomMargin().getPx())));
    }
}
