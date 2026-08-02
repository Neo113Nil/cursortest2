package ru.ozon.app.android.cabinet.profileAvatar.core;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cabinet.R$string;
import ru.ozon.app.android.cabinet.profileAvatar.data.ProfileAvatarDTO;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewItem.ProfileAvatarVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0018B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cabinet/profileAvatar/data/ProfileAvatarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/cabinet/profileAvatar/data/ProfileAvatarDTO;J)Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "createLoadingAvatar", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "createDefaultNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cabinet/profileAvatar/data/ProfileAvatarDTO;Ll20/d;)Ljava/util/List;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileAvatarMapper implements Function2<ProfileAvatarDTO, d, List<? extends ProfileAvatarVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarMapper$Companion;", "", "<init>", "()V", "NOTIFICATION_ICON", "", "MAX_LINES", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final NotificationDTO createDefaultNotification() {
        return new NotificationDTO(StringProvider.getString(R$string.notification_title_android), StringProvider.getString(R$string.notification_subtitle_android), 1, 1, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_400, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", UniColors.BG_WARNING_PRIMARY.getToken()), null, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65450, null), NotificationDTO.Alignment.CENTER), null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), null, null, 6, null), null, null, 864, null);
    }

    private final IconDTO createLoadingAvatar(IconDTO iconDTO) {
        IconDTO copy;
        copy = iconDTO.copy((r34 & 1) != 0 ? iconDTO.size : null, (r34 & 2) != 0 ? iconDTO.hasShape : null, (r34 & 4) != 0 ? iconDTO.shape : null, (r34 & 8) != 0 ? iconDTO.text : null, (r34 & 16) != 0 ? iconDTO.icon : null, (r34 & 32) != 0 ? iconDTO.backgroundImage : null, (r34 & 64) != 0 ? iconDTO.backgroundColor : UniColors.BG_SECONDARY.getToken(), (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iconDTO.textColor : null, (r34 & 256) != 0 ? iconDTO.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iconDTO.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iconDTO.borderWidth : null, (r34 & 2048) != 0 ? iconDTO.isBorderInside : null, (r34 & 4096) != 0 ? iconDTO.hasParanja : null, (r34 & 8192) != 0 ? iconDTO.getContext() : null, (r34 & 16384) != 0 ? iconDTO.getTestInfo() : null, (r34 & 32768) != 0 ? iconDTO.getTrackingInfo() : null);
        return copy;
    }

    private final ProfileAvatarVO toVO(ProfileAvatarDTO profileAvatarDTO, long j11) {
        IconDTO avatarIcon = profileAvatarDTO.getAvatarIcon();
        IconDTO createLoadingAvatar = createLoadingAvatar(profileAvatarDTO.getAvatarIcon());
        TextDTO copy$default = TextDTO.copy$default(profileAvatarDTO.getActionTitle(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
        boolean isDefaultPhoto = profileAvatarDTO.isDefaultPhoto();
        String backgroundColor = profileAvatarDTO.getBackgroundColor();
        NotificationDTO createDefaultNotification = createDefaultNotification();
        AtomActionDTO action = profileAvatarDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, profileAvatarDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = profileAvatarDTO.getTrackingInfo();
        return new ProfileAvatarVO(j11, avatarIcon, createLoadingAvatar, copy$default, isDefaultPhoto, backgroundColor, createDefaultNotification, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProfileAvatarVO> invoke(@NotNull ProfileAvatarDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, widgetInfo.d().hashCode()));
    }
}
