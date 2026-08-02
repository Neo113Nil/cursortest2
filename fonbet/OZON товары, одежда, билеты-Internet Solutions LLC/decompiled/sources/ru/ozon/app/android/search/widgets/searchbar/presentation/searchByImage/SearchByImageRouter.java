package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Ci.C2779a;
import Ci.b;
import Ci.g;
import Ci.k;
import Ci.l;
import Hi.h;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.utils.AppType;
import sZ.c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u001a\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageRouter;", "", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "<init>", "(Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;)V", "LBi/k;", "galleryLauncher", "Lkotlin/Function1;", "LHi/g;", "", "handleGalleryResult", "Landroidx/fragment/app/m;", "fragment", "openGallery", "(LBi/k;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/m;)V", "checkIfSearchOnboarding", "(Landroidx/fragment/app/m;)V", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Landroid/net/Uri;", "uri", "openSearchByImageLoadFragment", "(Lru/ozon/app/android/composer/ComposerNavigator;Landroid/net/Uri;)V", "", "deeplink", "startSearchByImage", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerNavigator;Ljava/lang/String;LBi/k;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "LCi/k;", "galleryConfig", "LCi/k;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchByImageRouter {

    @NotNull
    private final AndroidPlatformComponentApi androidPlatformComponentApi;

    @NotNull
    private final k galleryConfig;

    public SearchByImageRouter(@NotNull AndroidPlatformComponentApi androidPlatformComponentApi) {
        Intrinsics.checkNotNullParameter(androidPlatformComponentApi, "androidPlatformComponentApi");
        this.androidPlatformComponentApi = androidPlatformComponentApi;
        k b11 = C2779a.b();
        this.galleryConfig = k.b(b11, androidPlatformComponentApi.getAppType() == AppType.SELECT ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, h.d.f11018a, b.a(b11.d(), g.a(b11.d().f(), null, null, l.RESULT_API_ONLY, 31), null, 1, 1918), C2779a.a(), 242);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIfSearchOnboarding(ComponentCallbacksC5392m fragment) {
        ComponentCallbacksC5392m parentFragment = fragment != null ? fragment.getParentFragment() : null;
        if (parentFragment instanceof com.google.android.material.bottomsheet.b) {
            ((com.google.android.material.bottomsheet.b) parentFragment).dismiss();
        }
    }

    private final void openGallery(Bi.k galleryLauncher, Function1<? super Hi.g, Unit> handleGalleryResult, ComponentCallbacksC5392m fragment) {
        if (galleryLauncher != null) {
            galleryLauncher.b(this.galleryConfig, new SearchByImageRouter$openGallery$1(this, fragment, handleGalleryResult));
        }
    }

    public final void openSearchByImageLoadFragment(@NotNull ComposerNavigator navigator, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullExpressionValue("SearchByImageLoadFragment", "getSimpleName(...)");
        navigator.navigate(new c("SearchByImageLoadFragment", SearchByImageLoadFragment.INSTANCE.newInstance(uri), null, false, false, null, false, false, false, 492, null), 9001);
    }

    public final void startSearchByImage(ComponentCallbacksC5392m fragment, @NotNull ComposerNavigator navigator, String deeplink, Bi.k galleryLauncher, @NotNull Function1<? super Hi.g, Unit> handleGalleryResult) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(handleGalleryResult, "handleGalleryResult");
        if (SearchBarUtilsKt.isPhotoPermissionGranted(fragment != null ? fragment.getContext() : null)) {
            openGallery(galleryLauncher, handleGalleryResult, fragment);
        } else if (deeplink != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, deeplink, null, 2, null);
        }
    }
}
