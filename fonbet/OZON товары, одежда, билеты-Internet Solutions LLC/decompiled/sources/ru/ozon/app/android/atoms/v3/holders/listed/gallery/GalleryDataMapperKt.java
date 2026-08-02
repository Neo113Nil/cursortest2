package ru.ozon.app.android.atoms.v3.holders.listed.gallery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.atoms.data.gallery.GalleryImage;
import ru.ozon.app.android.atoms.v3.molecules.list.models.GalleryModel;
import ru.ozon.app.android.atoms.v3.molecules.list.models.OpenGalleryParams;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toGalleryModel", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryModel;", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryDataMapperKt {
    @NotNull
    public static final GalleryModel toGalleryModel(@NotNull Gallery gallery) {
        Intrinsics.checkNotNullParameter(gallery, "<this>");
        int maxCount = gallery.getMaxCount();
        List<GalleryImage> items = gallery.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new OpenGalleryParams.GalleryImage(((GalleryImage) it.next()).getImage()));
        }
        return new GalleryModel(maxCount, arrayList);
    }
}
