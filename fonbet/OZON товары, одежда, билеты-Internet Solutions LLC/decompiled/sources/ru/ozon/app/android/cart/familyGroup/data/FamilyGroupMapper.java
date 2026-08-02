package ru.ozon.app.android.cart.familyGroup.data;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.familyGroup.data.FamilyGroupDTO;
import ru.ozon.app.android.cart.familyGroup.presentation.FamilyGroupVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010\n\u001a\u00020\r*\u00020\u000eH\u0002J$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\f\u0010\u000f\u001a\u00020\u0011*\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupMapper;", "", "<init>", "()V", "invoke", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "state", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "stateId", "", "toVO", "id", "", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$RightBlock;", "toTokenizedTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FamilyGroupMapper {
    private final TokenizedTrackingInfo toTokenizedTrackingInfo(TokenizedTrackingInfo tokenizedTrackingInfo) {
        ArrayList arrayList;
        String actionType = tokenizedTrackingInfo.getActionType();
        String key = tokenizedTrackingInfo.getKey();
        String sliceKey = tokenizedTrackingInfo.getSliceKey();
        List<TokenizedTrackingInfo> nested = tokenizedTrackingInfo.getNested();
        if (nested != null) {
            List<TokenizedTrackingInfo> list = nested;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toTokenizedTrackingInfo((TokenizedTrackingInfo) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new TokenizedTrackingInfo(actionType, key, sliceKey, arrayList, tokenizedTrackingInfo.getCustom());
    }

    private final FamilyGroupVO toVO(FamilyGroupDTO familyGroupDTO, long j11) {
        TextDTO textDTO;
        AtomAction atomAction;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        TextDTO title = familyGroupDTO.getTitle();
        title.setTagSupported(true);
        Unit unit = Unit.f71690a;
        TextDTO subtitle = familyGroupDTO.getSubtitle();
        if (subtitle != null) {
            subtitle.setTagSupported(true);
            textDTO = subtitle;
        } else {
            textDTO = null;
        }
        FamilyGroupDTO.RightBlock rightBlock = familyGroupDTO.getRightBlock();
        FamilyGroupVO.RightBlock vo = rightBlock != null ? toVO(rightBlock) : null;
        FamilyGroupDTO.FamilyGroupSettingsDTO settings = familyGroupDTO.getSettings();
        FamilyGroupDTO.FamilyGroupCommonControlSettings common = familyGroupDTO.getCommon();
        if (common == null || (action = common.getAction()) == null) {
            atomAction = null;
        } else {
            Map<String, TokenizedTrackingInfo> trackingInfo2 = familyGroupDTO.getCommon().getTrackingInfo();
            atomAction = AtomActionMapperKt.toAtomAction(action, trackingInfo2 != null ? toTokenizedTrackingInfo(trackingInfo2) : null);
        }
        FamilyGroupDTO.FamilyGroupCommonControlSettings common2 = familyGroupDTO.getCommon();
        t mapToTokenizedEvent$default = (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        FamilyGroupDTO.FamilyGroupCommonControlSettings common3 = familyGroupDTO.getCommon();
        return new FamilyGroupVO(j11, title, textDTO, vo, settings, atomAction, mapToTokenizedEvent$default, common3 != null ? common3.getTestInfo() : null);
    }

    @NotNull
    public final FamilyGroupVO invoke(@NotNull FamilyGroupDTO state, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return toVO(state, stateId.hashCode());
    }

    private final FamilyGroupVO.RightBlock toVO(FamilyGroupDTO.RightBlock rightBlock) {
        return new FamilyGroupVO.RightBlock(rightBlock.getIcons(), rightBlock.getIndicator());
    }

    private final Map<String, TokenizedTrackingInfo> toTokenizedTrackingInfo(Map<String, TokenizedTrackingInfo> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toTokenizedTrackingInfo((TokenizedTrackingInfo) entry.getValue()));
        }
        return linkedHashMap;
    }
}
