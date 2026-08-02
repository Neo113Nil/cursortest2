package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation;

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
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.data.ProfileAvatarDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.domain.ProfileAvatarVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/ProfileAvatarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/data/ProfileAvatarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/domain/ProfileAvatarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/data/ProfileAvatarDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/domain/ProfileAvatarVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/data/ProfileAvatarDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileAvatarMapper implements Function2<ProfileAvatarDTO, d, List<? extends ProfileAvatarVO>> {
    private final ProfileAvatarVO toVO(ProfileAvatarDTO profileAvatarDTO, long j11) {
        IconDTO avatar = profileAvatarDTO.getAvatar();
        IconDTO edit = profileAvatarDTO.getEdit();
        IconButtonV3DTO notification = profileAvatarDTO.getNotification();
        IndicatorDTO label = profileAvatarDTO.getLabel();
        TextDTO title = profileAvatarDTO.getTitle();
        String backgroundImage = profileAvatarDTO.getBackgroundImage();
        String backgroundColor = profileAvatarDTO.getBackgroundColor();
        boolean z11 = profileAvatarDTO.getEdit() != null;
        boolean z12 = profileAvatarDTO.getAvatar().getBackgroundImage() == null;
        boolean z13 = profileAvatarDTO.getTitle() == null;
        Map<String, TokenizedTrackingInfo> trackingInfo = profileAvatarDTO.getTrackingInfo();
        return new ProfileAvatarVO(j11, avatar, edit, notification, label, title, backgroundImage, backgroundColor, z12, z11, z13, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProfileAvatarVO> invoke(@NotNull ProfileAvatarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }
}
