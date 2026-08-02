package ru.ozon.app.android.geo.splitShortInfoWidgetKey.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.data.SplitShortInfoDTO;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.data.SplitShortInfoVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO;", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoDTO;", "stateId", "", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO$Item;", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoDTO$Item;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SplitShortInfoDTOKt {
    @NotNull
    public static final SplitShortInfoVO toVO(@NotNull SplitShortInfoDTO splitShortInfoDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(splitShortInfoDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        TextAtom copy$default = TextAtom.copy$default(splitShortInfoDTO.getTitle(), null, null, null, 1, null, null, null, 119, null);
        TextAtom copy$default2 = TextAtom.copy$default(splitShortInfoDTO.getSubtitle(), null, null, null, 1, null, null, null, 119, null);
        List<SplitShortInfoDTO.Item> items = splitShortInfoDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SplitShortInfoDTO.Item) it.next()));
        }
        AtomActionDTO action = splitShortInfoDTO.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = splitShortInfoDTO.getTrackingInfo();
        return new SplitShortInfoVO(hashCode, copy$default, copy$default2, arrayList, action, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @NotNull
    public static final SplitShortInfoVO.Item toVO(@NotNull SplitShortInfoDTO.Item item) {
        Intrinsics.checkNotNullParameter(item, "<this>");
        return new SplitShortInfoVO.Item(item.getImage());
    }
}
