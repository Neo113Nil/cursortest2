package ru.ozon.app.android.travel.feature.hotels.interceptor;

import GZ.j;
import KZ.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.extensions.UriExtensionsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00060\bj\u0002`\t2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/interceptor/EnsureMiniappTravelDeeplinkInterceptor;", "LKZ/a;", "<init>", "()V", "Landroid/net/Uri;", "link", "ensureMiniappTravel", "(Landroid/net/Uri;)Landroid/net/Uri;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "intercept", "(LGZ/j;)LGZ/j;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EnsureMiniappTravelDeeplinkInterceptor implements a {
    private final Uri ensureMiniappTravel(Uri link) {
        if (Intrinsics.d(link.getQueryParameter("miniapp"), "travel")) {
            return link;
        }
        Uri build = UriExtensionsKt.replaceQueryParameter(link, "miniapp", "travel").build();
        Intrinsics.f(build);
        return build;
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return j.a(route, ensureMiniappTravel(route.b()));
    }
}
