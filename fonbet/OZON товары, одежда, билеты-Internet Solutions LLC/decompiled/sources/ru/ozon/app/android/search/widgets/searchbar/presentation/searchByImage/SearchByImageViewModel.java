package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Ae.C2406m0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Hi.g;
import Hi.l;
import android.content.ContentResolver;
import android.net.Uri;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.gallery.HandleGalleryResult;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepository;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepository;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0(8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/domain/gallery/HandleGalleryResult;", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageRepository;", "searchByImageRepository", "Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepository;", "searchOnboardingRepository", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchImageResizer;", "imageResizer", "<init>", "(Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageRepository;Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepository;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchImageResizer;)V", "LHi/g;", "galleryLaunchResult", "", "handleGalleryResult", "(LHi/g;)V", "Landroid/net/Uri;", "uri", "Landroid/content/ContentResolver;", "contentResolver", "searchByImage", "(Landroid/net/Uri;Landroid/content/ContentResolver;)V", "clearSubscribeStateFlow", "()V", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageRepository;", "Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepository;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchImageResizer;", "Lxe/J;", "errorHandler", "Lxe/J;", "LAe/w0;", "", "_openSearchResultFlow", "LAe/w0;", "LAe/x0;", "_showErrorNotificationFlow", "LAe/x0;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "_openPhotoLoad", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "LAe/h;", "getOpenSearchResultFlow", "()LAe/h;", "openSearchResultFlow", "getShowErrorNotificationFlow", "showErrorNotificationFlow", "Landroidx/lifecycle/P;", "getOpenPhotoLoad", "()Landroidx/lifecycle/P;", "openPhotoLoad", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchByImageViewModel extends w0 implements HandleGalleryResult {

    @NotNull
    private final SingleLiveEvent<Uri> _openPhotoLoad;

    @NotNull
    private final Ae.w0<String> _openSearchResultFlow;

    @NotNull
    private final x0<Unit> _showErrorNotificationFlow;

    @NotNull
    private final J errorHandler;

    @NotNull
    private final SearchImageResizer imageResizer;

    @NotNull
    private final SearchByImageRepository searchByImageRepository;

    @NotNull
    private final SearchOnboardingRepository searchOnboardingRepository;

    public SearchByImageViewModel(@NotNull SearchByImageRepository searchByImageRepository, @NotNull SearchOnboardingRepository searchOnboardingRepository, @NotNull SearchImageResizer imageResizer) {
        Intrinsics.checkNotNullParameter(searchByImageRepository, "searchByImageRepository");
        Intrinsics.checkNotNullParameter(searchOnboardingRepository, "searchOnboardingRepository");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        this.searchByImageRepository = searchByImageRepository;
        this.searchOnboardingRepository = searchOnboardingRepository;
        this.imageResizer = imageResizer;
        this.errorHandler = new SearchByImageViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
        this._openSearchResultFlow = E0.b(0, 0, null, 7);
        this._showErrorNotificationFlow = O0.a(null);
        this._openPhotoLoad = new SingleLiveEvent<>();
    }

    public final void clearSubscribeStateFlow() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SearchByImageViewModel$clearSubscribeStateFlow$1(this, null), 3);
    }

    @NotNull
    public final P<Uri> getOpenPhotoLoad() {
        return this._openPhotoLoad;
    }

    @NotNull
    public final InterfaceC2395h<String> getOpenSearchResultFlow() {
        return this._openSearchResultFlow;
    }

    @NotNull
    public final InterfaceC2395h<Unit> getShowErrorNotificationFlow() {
        return new C2406m0(this._showErrorNotificationFlow);
    }

    @Override // ru.ozon.app.android.domain.gallery.HandleGalleryResult
    public void handleGalleryResult(@NotNull g galleryLaunchResult) {
        Intrinsics.checkNotNullParameter(galleryLaunchResult, "galleryLaunchResult");
        l lVar = (l) C7714v.M(galleryLaunchResult.a());
        if (lVar == null) {
            return;
        }
        this._openPhotoLoad.setValue(lVar.getUri());
    }

    public final void searchByImage(@NotNull Uri uri, @NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.searchOnboardingRepository.saveShowingOnboarding();
        C10727i.c(androidx.lifecycle.x0.a(this), this.errorHandler, null, new SearchByImageViewModel$searchByImage$1(this, uri, contentResolver, null), 2);
    }
}
