package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation;

import A00.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.TotalStickyV2DTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;", "oldVo", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TotalStickyV2ViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, TotalStickyV2VO, TotalStickyV2VO> {
    public static final TotalStickyV2ViewMapper$updateConsumer$1 INSTANCE = new TotalStickyV2ViewMapper$updateConsumer$1();

    TotalStickyV2ViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TotalStickyV2VO invoke(a.J.InterfaceC0007a update, TotalStickyV2VO oldVo) {
        TotalStickyV2VO copy;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVo, "oldVo");
        if (!(update instanceof TotalStickyV2StateUpdate)) {
            return null;
        }
        TotalStickyV2DTO updatedDTO = ((TotalStickyV2StateUpdate) update).getUpdatedDTO();
        Price price = updatedDTO.getSummary().getPrice();
        TextAtom infoText = updatedDTO.getSummary().getInfoText();
        ButtonV3Atom.SmallButton button = updatedDTO.getButton();
        Badge badgeInfo = updatedDTO.getBadgeInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = updatedDTO.getTrackingInfo();
        copy = oldVo.copy((r32 & 1) != 0 ? oldVo.id : 0L, (r32 & 2) != 0 ? oldVo.price : price, (r32 & 4) != 0 ? oldVo.infoText : infoText, (r32 & 8) != 0 ? oldVo.button : button, (r32 & 16) != 0 ? oldVo.badgeInfo : badgeInfo, (r32 & 32) != 0 ? oldVo.asyncData : null, (r32 & 64) != 0 ? oldVo.tokenizedEvent : trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(oldVo.getId()), null, 2, null) : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVo.disableSeparator : false, (r32 & 256) != 0 ? oldVo.backgroundColor : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVo.showIsland : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVo.disabledButtonStyle : null, (r32 & 2048) != 0 ? oldVo.newButton : null, (r32 & 4096) != 0 ? oldVo.secondPrice : null, (r32 & 8192) != 0 ? oldVo.partnerBanksMolecule : null);
        return copy;
    }
}
