package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.utils;

import Lm0.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data.OpenGalleryModel;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/utils/GalleryUtils;", "", "<init>", "()V", "openGalleryModelAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/OpenGalleryModel;", "parseImageUrlsFromEncodedModel", "", "", "encodedModel", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryUtils {

    @NotNull
    public static final GalleryUtils INSTANCE = new GalleryUtils();

    @NotNull
    private static final JsonAdapter<OpenGalleryModel> openGalleryModelAdapter = new Moshi(new Moshi.a()).c(OpenGalleryModel.class);
    public static final int $stable = 8;

    private GalleryUtils() {
    }

    public final List<String> parseImageUrlsFromEncodedModel(String encodedModel) {
        List<OpenGalleryModel.GalleryItem> items;
        if (encodedModel == null) {
            return null;
        }
        try {
            OpenGalleryModel fromJson = openGalleryModelAdapter.fromJson(encodedModel);
            if (fromJson == null || (items = fromJson.getItems()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                String image = ((OpenGalleryModel.GalleryItem) it.next()).getImage();
                if (image != null) {
                    arrayList.add(image);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            a.f17149a.e("GalleryUtils", "Error parsing encodedModel", e11);
            return null;
        }
    }
}
