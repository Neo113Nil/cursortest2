package ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation;

import Ej.b;
import G.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.data.DeliveryReviewHeaderDTO;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos.HeaderItem;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004*\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/DeliveryReviewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/data/DeliveryReviewHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/DeliveryReviewHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/data/DeliveryReviewHeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/DeliveryReviewHeaderVO;", "makeInfo", "(Ljava/util/List;)Ljava/lang/String;", "", "maxCount", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "makeItems", "(Ljava/util/List;I)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/data/DeliveryReviewHeaderDTO;Ll20/d;)Ljava/util/List;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryReviewMapper implements Function2<DeliveryReviewHeaderDTO, d, List<? extends DeliveryReviewHeaderVO>> {
    private final String makeInfo(List<String> list) {
        String str = "";
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String str2 = (String) obj;
            str = i11 == 0 ? str2 : g.c(str, " • ", str2);
            i11 = i12;
        }
        return str;
    }

    private final List<HeaderItem> makeItems(List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        List<String> subList = list.subList(0, Math.min(i11, list.size()));
        ArrayList arrayList2 = new ArrayList(C7714v.z(subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new HeaderItem.PhotoItem((String) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (list.size() > i11) {
            arrayList.add(new HeaderItem.MoreCountItem(b.a(list.size() - i11, "+")));
        }
        return arrayList;
    }

    private final DeliveryReviewHeaderVO toVO(DeliveryReviewHeaderDTO deliveryReviewHeaderDTO, String str) {
        List<HeaderItem> list;
        long hashCode = str.hashCode();
        String title = deliveryReviewHeaderDTO.getTitle();
        List<String> photos = deliveryReviewHeaderDTO.getPhotos();
        if (photos != null) {
            Integer maxCount = deliveryReviewHeaderDTO.getMaxCount();
            list = makeItems(photos, maxCount != null ? maxCount.intValue() : 0);
        } else {
            list = null;
        }
        List<String> info = deliveryReviewHeaderDTO.getInfo();
        return new DeliveryReviewHeaderVO(hashCode, title, list, info != null ? makeInfo(info) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryReviewHeaderVO> invoke(@NotNull DeliveryReviewHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
