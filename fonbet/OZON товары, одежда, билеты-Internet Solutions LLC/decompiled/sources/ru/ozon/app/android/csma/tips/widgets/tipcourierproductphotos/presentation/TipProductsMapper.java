package ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation;

import Ej.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.data.TipProductPhotosDTO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.ProductPhotoItem;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0013B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/data/TipProductPhotosDTO;", "Ll20/d;", "", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductPhotosVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/ProductPhotoItem;", "getPhotos", "(Ljava/util/List;)Ljava/util/List;", "getMoreCount", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/data/TipProductPhotosDTO;Ll20/d;)Ljava/util/List;", "Companion", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipProductsMapper implements Function2<TipProductPhotosDTO, d, List<? extends TipProductPhotosVO>> {
    private final List<ProductPhotoItem> getMoreCount(List<String> list) {
        List D11 = C7714v.D(list, 5);
        List list2 = D11;
        return C7714v.c0(list2.size() > 1 ? new ProductPhotoItem.MoreCountItem(b.a(list2.size(), "+")) : list2.size() == 1 ? new ProductPhotoItem.PhotoItem((String) C7714v.K(D11)) : null);
    }

    private final List<ProductPhotoItem> getPhotos(List<String> list) {
        List K02 = C7714v.K0(list, 5);
        ArrayList arrayList = new ArrayList(C7714v.z(K02, 10));
        Iterator it = K02.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductPhotoItem.PhotoItem((String) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TipProductPhotosVO> invoke(@NotNull TipProductPhotosDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ArrayList arrayList = new ArrayList();
        C7714v.p(getPhotos(dto.getProductPhotos()), arrayList);
        C7714v.p(getMoreCount(dto.getProductPhotos()), arrayList);
        return C7714v.a0(new TipProductPhotosVO(hashCode, arrayList));
    }
}
