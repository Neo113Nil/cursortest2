package ru.ozon.app.android.ugc.widgets.profileInputs.core;

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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.R$string;
import ru.ozon.app.android.ugc.widgets.profileInputs.data.ProfileInputsDTO;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/core/ProfileInputsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO;J)Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsVO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "createDefaultNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO;Ll20/d;)Ljava/util/List;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileInputsMapper implements Function2<ProfileInputsDTO, d, List<? extends ProfileInputsVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/core/ProfileInputsMapper$Companion;", "", "<init>", "()V", "NOTIFICATION_ICON", "", "MAX_LINES", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final NotificationDTO createDefaultNotification() {
        return new NotificationDTO(StringProvider.getString(R$string.reviews_failed_to_save), StringProvider.getString(R$string.reviews_please_try_again), 1, 1, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_400, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", UniColors.BG_WARNING_PRIMARY.getToken()), null, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65450, null), NotificationDTO.Alignment.CENTER), null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), null, null, 6, null), null, null, 864, null);
    }

    private final ProfileInputsVO toVO(ProfileInputsDTO profileInputsDTO, long j11) {
        ProfileInputsDTO.InputField inputField = profileInputsDTO.getInputField();
        ButtonV3DTO submitButton = profileInputsDTO.getSubmitButton();
        NotificationDTO createDefaultNotification = createDefaultNotification();
        Map<String, TokenizedTrackingInfo> trackingInfo = profileInputsDTO.getTrackingInfo();
        return new ProfileInputsVO(j11, inputField, submitButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, createDefaultNotification);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProfileInputsVO> invoke(@NotNull ProfileInputsDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, widgetInfo.d().hashCode()));
    }
}
