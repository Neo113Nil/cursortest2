package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation;

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
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.data.ProfileTilesDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.domain.ProfileTilesVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/ProfileTilesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Purchases;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Purchases;)Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Bonuses;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Bonuses;)Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileTilesMapper implements Function2<ProfileTilesDTO, d, List<? extends ProfileTilesVO>> {
    private final ProfileTilesVO toVO(ProfileTilesDTO profileTilesDTO, long j11) {
        ProfileTilesVO.Purchases vo = toVO(profileTilesDTO.getPurchases());
        ProfileTilesVO.Bonuses vo2 = toVO(profileTilesDTO.getBonuses());
        Map<String, TokenizedTrackingInfo> trackingInfo = profileTilesDTO.getTrackingInfo();
        return new ProfileTilesVO(j11, vo, vo2, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProfileTilesVO> invoke(@NotNull ProfileTilesDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final ProfileTilesVO.Purchases toVO(ProfileTilesDTO.Purchases purchases) {
        Integer num;
        AtomAction atomAction;
        TextDTO title = purchases.getTitle();
        boolean z11 = purchases.getProductMedia().getCollage() != null;
        ProductMediaVO vo = ProductMediaMapperKt.toVO(purchases.getProductMedia(), FreshTileType.MINI, false);
        CornerRadius cornerRadius = purchases.getCornerRadius();
        if (cornerRadius != null) {
            num = Integer.valueOf(cornerRadius.getPx());
            atomAction = null;
        } else {
            num = null;
            atomAction = null;
        }
        String backgroundColor = purchases.getBackgroundColor();
        AtomAction atomAction2 = atomAction;
        TagButtonDTO tagButton = purchases.getTagButton();
        CommonControlSettings common = purchases.getCommon();
        if (common != null) {
            atomAction2 = common.toAtomAction();
        }
        return new ProfileTilesVO.Purchases(title, z11, vo, num, backgroundColor, tagButton, atomAction2);
    }

    private final ProfileTilesVO.Bonuses toVO(ProfileTilesDTO.Bonuses bonuses) {
        Integer num;
        AtomAction atomAction;
        TextDTO title = bonuses.getTitle();
        String image = bonuses.getImage();
        List<BadgeDTO> badges = bonuses.getBadges();
        CornerRadius cornerRadius = bonuses.getCornerRadius();
        if (cornerRadius != null) {
            num = Integer.valueOf(cornerRadius.getPx());
            atomAction = null;
        } else {
            num = null;
            atomAction = null;
        }
        String backgroundColor = bonuses.getBackgroundColor();
        CommonControlSettings common = bonuses.getCommon();
        if (common != null) {
            atomAction = common.toAtomAction();
        }
        return new ProfileTilesVO.Bonuses(title, image, badges, num, backgroundColor, atomAction);
    }
}
