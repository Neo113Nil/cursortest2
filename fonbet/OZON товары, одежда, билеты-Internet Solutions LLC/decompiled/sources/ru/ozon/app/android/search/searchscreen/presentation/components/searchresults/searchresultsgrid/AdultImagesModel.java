package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import G.g;
import Kk.C3532b;
import Lh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "imageItems", "blurPlaceholderImage", "<init>", "(ZZLjava/util/List;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "Ljava/util/List;", "getImageItems", "()Ljava/util/List;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "getBlurPlaceholderImage", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AdultImagesModel implements AdultVO {
    private final SearchResultsGalleryModel.GalleryItem blurPlaceholderImage;

    @NotNull
    private final List<SearchResultsGalleryModel.GalleryItem> imageItems;
    private final boolean isAdult;
    private boolean shouldBlur;

    /* JADX WARN: Multi-variable type inference failed */
    public AdultImagesModel(boolean z11, boolean z12, @NotNull List<? extends SearchResultsGalleryModel.GalleryItem> imageItems, SearchResultsGalleryModel.GalleryItem galleryItem) {
        Intrinsics.checkNotNullParameter(imageItems, "imageItems");
        this.shouldBlur = z11;
        this.isAdult = z12;
        this.imageItems = imageItems;
        this.blurPlaceholderImage = galleryItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdultImagesModel)) {
            return false;
        }
        AdultImagesModel adultImagesModel = (AdultImagesModel) other;
        return this.shouldBlur == adultImagesModel.shouldBlur && this.isAdult == adultImagesModel.isAdult && Intrinsics.d(this.imageItems, adultImagesModel.imageItems) && Intrinsics.d(this.blurPlaceholderImage, adultImagesModel.blurPlaceholderImage);
    }

    public final SearchResultsGalleryModel.GalleryItem getBlurPlaceholderImage() {
        return this.blurPlaceholderImage;
    }

    @NotNull
    public final List<SearchResultsGalleryModel.GalleryItem> getImageItems() {
        return this.imageItems;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public int hashCode() {
        int b11 = g.b(C3532b.a(Boolean.hashCode(this.shouldBlur) * 31, 31, this.isAdult), 31, this.imageItems);
        SearchResultsGalleryModel.GalleryItem galleryItem = this.blurPlaceholderImage;
        return b11 + (galleryItem == null ? 0 : galleryItem.hashCode());
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.shouldBlur;
        boolean z12 = this.isAdult;
        List<SearchResultsGalleryModel.GalleryItem> list = this.imageItems;
        SearchResultsGalleryModel.GalleryItem galleryItem = this.blurPlaceholderImage;
        StringBuilder d11 = a.d("AdultImagesModel(shouldBlur=", ", isAdult=", ", imageItems=", z11, z12);
        d11.append(list);
        d11.append(", blurPlaceholderImage=");
        d11.append(galleryItem);
        d11.append(")");
        return d11.toString();
    }
}
