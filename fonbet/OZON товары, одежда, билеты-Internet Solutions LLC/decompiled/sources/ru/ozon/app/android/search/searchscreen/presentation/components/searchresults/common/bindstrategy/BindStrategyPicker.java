package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.bindstrategy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AdultImagesModel;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/bindstrategy/BindStrategyPicker;", "", "T", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "adultListDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "getAdultListDelegate", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AdultImagesModel;", "adultDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "getAdultDelegate", "()Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BindStrategyPicker<T> {

    @NotNull
    private final AdultDelegate<AdultImagesModel> adultDelegate;

    @NotNull
    private final AdultListDelegate<SearchResultsGalleryModel.GalleryItem> adultListDelegate;

    public BindStrategyPicker(@NotNull FeatureChecker featureChecker, @NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.adultListDelegate = new AdultListDelegate<>(adultHandler, featureChecker);
        this.adultDelegate = new AdultDelegate<>(adultHandler, featureChecker);
    }

    @NotNull
    protected final AdultDelegate<AdultImagesModel> getAdultDelegate() {
        return this.adultDelegate;
    }
}
