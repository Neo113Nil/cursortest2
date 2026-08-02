package ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation;

import GZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarRouter;", "", "LGZ/g;", "router", "<init>", "(LGZ/g;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarVO;", "item", "", "routeToSearch", "(Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarVO;)V", "", "deeplink", "routeToDeeplink", "(Ljava/lang/String;)V", "LGZ/g;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchBarRouter {

    @NotNull
    private final g router;

    public SearchBarRouter(@NotNull g router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.router = router;
    }

    public final void routeToDeeplink(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        g.a.a(this.router, deeplink, null, null, 6);
    }

    public final void routeToSearch(SearchBarVO item) {
        String uri = LinkGenerator.INSTANCE.searchSuggestions(item != null ? item.getText() : null, item != null ? item.getDeeplink() : null, item != null ? item.getLink() : null, item != null ? item.getPlaceholder() : null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        g.a.a(this.router, uri, null, null, 6);
    }
}
