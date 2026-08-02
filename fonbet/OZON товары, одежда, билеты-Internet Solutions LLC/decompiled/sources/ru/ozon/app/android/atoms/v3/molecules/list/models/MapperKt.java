package ru.ozon.app.android.atoms.v3.molecules.list.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.list.models.GalleryItem;
import ru.ozon.app.android.atoms.v3.molecules.list.models.OpenGalleryParams;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"toVO", "", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryModel;", "toGalleryImageItem", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageItem;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/OpenGalleryParams$GalleryImage;", "toGalleryItemCounter", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageCountItem;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapperKt {
    private static final GalleryItem.GalleryImageItem toGalleryImageItem(OpenGalleryParams.GalleryImage galleryImage) {
        return new GalleryItem.GalleryImageItem(galleryImage.hashCode(), galleryImage.getUrl());
    }

    private static final GalleryItem.GalleryImageCountItem toGalleryItemCounter(GalleryModel galleryModel) {
        return new GalleryItem.GalleryImageCountItem(galleryModel.hashCode(), galleryModel.getItems().size() - galleryModel.getMaxCount());
    }

    @NotNull
    public static final List<GalleryItem> toVO(@NotNull GalleryModel galleryModel) {
        Intrinsics.checkNotNullParameter(galleryModel, "<this>");
        if (galleryModel.getItems().size() <= galleryModel.getMaxCount()) {
            List<OpenGalleryParams.GalleryImage> items = galleryModel.getItems();
            ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(toGalleryImageItem((OpenGalleryParams.GalleryImage) it.next()));
            }
            return arrayList;
        }
        List<OpenGalleryParams.GalleryImage> subList = galleryModel.getItems().subList(0, galleryModel.getMaxCount());
        ArrayList arrayList2 = new ArrayList(C7714v.z(subList, 10));
        Iterator<T> it2 = subList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toGalleryImageItem((OpenGalleryParams.GalleryImage) it2.next()));
        }
        ArrayList W02 = C7714v.W0(arrayList2);
        W02.add(toGalleryItemCounter(galleryModel));
        return W02;
    }
}
