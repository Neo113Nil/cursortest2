package ru.ozon.app.android.partnerBanks.presentation;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "widgetId", "", "externalAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PartnerBanksVOKt {
    @NotNull
    public static final PartnerBanksVO toVO(@NotNull PartnerBanksDTO partnerBanksDTO, long j11, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(partnerBanksDTO, "<this>");
        TextDTO title = partnerBanksDTO.getTitle();
        List<PartnerBanksDTO.BankIcon> icons = partnerBanksDTO.getIcons();
        int iconsSize = partnerBanksDTO.getIconsSize();
        int iconsPadding = partnerBanksDTO.getIconsPadding();
        BadgeDTO badge = partnerBanksDTO.getBadge();
        AtomActionDTO action = partnerBanksDTO.getAction();
        if (action != null) {
            atomActionDTO = action;
        }
        AtomAction atomAction = atomActionDTO != null ? AtomActionMapperKt.toAtomAction(atomActionDTO, partnerBanksDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = partnerBanksDTO.getTrackingInfo();
        return new PartnerBanksVO(title, icons, iconsSize, iconsPadding, badge, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, partnerBanksDTO.getTestInfo());
    }

    public static /* synthetic */ PartnerBanksVO toVO$default(PartnerBanksDTO partnerBanksDTO, long j11, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            atomActionDTO = null;
        }
        return toVO(partnerBanksDTO, j11, atomActionDTO);
    }
}
