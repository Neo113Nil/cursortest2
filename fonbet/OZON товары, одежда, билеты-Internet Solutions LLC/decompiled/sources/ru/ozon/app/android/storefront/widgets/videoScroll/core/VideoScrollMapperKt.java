package ru.ozon.app.android.storefront.widgets.videoScroll.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.videoScroll.data.HeaderDTO;
import ru.ozon.app.android.storefront.widgets.videoScroll.data.ItemDTO;
import ru.ozon.app.android.storefront.widgets.videoScroll.data.VideoScrollDTO;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.Header;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.Item;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.VideoScrollVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"toVO", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/VideoScrollVO;", "Lru/ozon/app/android/storefront/widgets/videoScroll/data/VideoScrollDTO;", "voId", "", "toVo", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Header;", "Lru/ozon/app/android/storefront/widgets/videoScroll/data/HeaderDTO;", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Item;", "Lru/ozon/app/android/storefront/widgets/videoScroll/data/ItemDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoScrollMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoScrollVO toVO(VideoScrollDTO videoScrollDTO, long j11) {
        HeaderDTO header = videoScrollDTO.getHeader();
        Header vo = header != null ? toVo(header, j11) : null;
        List<ItemDTO> items = videoScrollDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((ItemDTO) it.next(), j11));
        }
        return new VideoScrollVO(j11, vo, arrayList);
    }

    private static final Header toVo(HeaderDTO headerDTO, long j11) {
        TextAtom title = headerDTO.getTitle();
        AtomActionDTO action = headerDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, headerDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = headerDTO.getTrackingInfo();
        return new Header(title, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, headerDTO.getDisclosure());
    }

    private static final Item toVo(ItemDTO itemDTO, long j11) {
        String image = itemDTO.getImage();
        Badge timeBadge = itemDTO.getTimeBadge();
        String title = itemDTO.getTitle();
        AtomActionDTO action = itemDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, itemDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
        return new Item(image, timeBadge, title, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, itemDTO.getAdBadge());
    }
}
