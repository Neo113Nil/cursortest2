package ru.ozon.app.android.ugc.widgets.profileHeader.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.profileHeader.data.ProfileHeaderDTO;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;", "", "id", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;", "toVo", "(Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;J)Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileHeaderMapper implements Function2<ProfileHeaderDTO, d, List<? extends ProfileHeaderVO>> {
    private final ProfileHeaderVO.ProfileHeaderStatVO toVo(ProfileHeaderDTO.ProfileHeaderStatDTO profileHeaderStatDTO, long j11) {
        TextDTO blockNumber = profileHeaderStatDTO.getBlockNumber();
        TextDTO blockTitle = profileHeaderStatDTO.getBlockTitle();
        AtomActionDTO blockAction = profileHeaderStatDTO.getBlockAction();
        AtomAction atomAction = blockAction != null ? AtomActionMapperKt.toAtomAction(blockAction, profileHeaderStatDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = profileHeaderStatDTO.getTrackingInfo();
        return new ProfileHeaderVO.ProfileHeaderStatVO(blockNumber, blockTitle, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProfileHeaderVO> invoke(@NotNull ProfileHeaderDTO state, @NotNull d widgetInfo) {
        AtomAction atomAction;
        ProfileHeaderVO.ProfileHeaderStatVO profileHeaderStatVO;
        t tVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        IconDTO avatar = state.getAvatar();
        AtomActionDTO avatarAction = state.getAvatarAction();
        AtomAction atomAction2 = avatarAction != null ? AtomActionMapperKt.toAtomAction(avatarAction, state.getAvatarTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> avatarTrackingInfo = state.getAvatarTrackingInfo();
        t tokenizedEvent$default = avatarTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(avatarTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        ProfileHeaderVO.ProfileHeaderStatVO vo = toVo(state.getLeftCount(), hashCode);
        ProfileHeaderVO.ProfileHeaderStatVO vo2 = toVo(state.getMiddleCount(), hashCode);
        ProfileHeaderVO.ProfileHeaderStatVO vo3 = toVo(state.getRightCount(), hashCode);
        IconButtonV3DTO shareButton = state.getShareButton();
        IconButtonV3DTO settingsButton = state.getSettingsButton();
        boolean isActionPositive = state.isActionPositive();
        ButtonV3DTO positiveActionButton = state.getPositiveActionButton();
        ButtonV3DTO negativeActionButton = state.getNegativeActionButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        if (trackingInfo != null) {
            atomAction = atomAction2;
            profileHeaderStatVO = vo;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            atomAction = atomAction2;
            profileHeaderStatVO = vo;
            tVar = null;
        }
        return C7714v.a0(new ProfileHeaderVO(hashCode, avatar, atomAction, tokenizedEvent$default, profileHeaderStatVO, vo2, vo3, shareButton, settingsButton, isActionPositive, positiveActionButton, negativeActionButton, tVar));
    }
}
