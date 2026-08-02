package ru.ozon.app.android.pdp.view.photo360.data;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0015\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001aJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/data/Photo360Repository;", "", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360ContentDataSet;", "contentDataSet", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet;", "imagesDataSet", "<init>", "(Lru/ozon/app/android/pdp/view/photo360/data/Photo360ContentDataSet;Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet;)V", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360Response;", "loadInitialState", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "width", "height", "", "", "urls", "", "loadImages", "(IILjava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "index", "loadImageOriginalSize", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "", "checkIfNotOriginalSize", "(I)Z", "checkIfRequestIsNotActive", "addCurrentRequest", "", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet$PhotoData;", "getCachedImages", "()Ljava/util/List;", "Landroid/graphics/drawable/Drawable;", "getCachedImage", "(I)Landroid/graphics/drawable/Drawable;", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360ContentDataSet;", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Photo360Repository {

    @NotNull
    private final Photo360ContentDataSet contentDataSet;

    @NotNull
    private final Photo360ImagesDataSet imagesDataSet;

    public Photo360Repository(@NotNull Photo360ContentDataSet contentDataSet, @NotNull Photo360ImagesDataSet imagesDataSet) {
        Intrinsics.checkNotNullParameter(contentDataSet, "contentDataSet");
        Intrinsics.checkNotNullParameter(imagesDataSet, "imagesDataSet");
        this.contentDataSet = contentDataSet;
        this.imagesDataSet = imagesDataSet;
    }

    public final boolean addCurrentRequest(int index) {
        return this.imagesDataSet.getCurrentRequests().add(Integer.valueOf(index));
    }

    public final boolean checkIfNotOriginalSize(int index) {
        return !this.imagesDataSet.getCachedImages().get(index).getIsOriginalSize();
    }

    public final boolean checkIfRequestIsNotActive(int index) {
        return !this.imagesDataSet.getCurrentRequests().contains(Integer.valueOf(index));
    }

    @NotNull
    public final Drawable getCachedImage(int index) {
        return this.imagesDataSet.getCachedImages().get(index).getDrawable();
    }

    @NotNull
    public final List<Photo360ImagesDataSet.PhotoData> getCachedImages() {
        return this.imagesDataSet.getCachedImages();
    }

    public final Object loadImageOriginalSize(int i11, @NotNull d<? super Result<Unit>> dVar) {
        return this.imagesDataSet.loadImageOriginalSize(i11, dVar);
    }

    public final Object loadImages(int i11, int i12, @NotNull List<String> list, @NotNull d<? super Result<Unit>> dVar) {
        return this.imagesDataSet.loadImages(i11, i12, list, dVar);
    }

    public final Object loadInitialState(@NotNull d<? super Result<Photo360Response>> dVar) {
        return this.contentDataSet.loadInitialState(dVar);
    }
}
