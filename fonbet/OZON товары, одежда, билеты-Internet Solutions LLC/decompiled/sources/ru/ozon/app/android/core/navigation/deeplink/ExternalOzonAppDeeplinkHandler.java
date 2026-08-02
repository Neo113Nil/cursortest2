package ru.ozon.app.android.core.navigation.deeplink;

import GZ.c;
import GZ.j;
import IZ.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.core.navigation.destinations.ExternalAppDestination;
import ru.ozon.app.android.whitelist.common.WhiteListDomainsOzonAppsHandler;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/ExternalOzonAppDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/whitelist/common/WhiteListDomainsOzonAppsHandler;", "whiteListDomainsOzonAppsHandler", "<init>", "(Lru/ozon/app/android/whitelist/common/WhiteListDomainsOzonAppsHandler;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/whitelist/common/WhiteListDomainsOzonAppsHandler;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalOzonAppDeeplinkHandler implements a {

    @NotNull
    private final WhiteListDomainsOzonAppsHandler whiteListDomainsOzonAppsHandler;

    public ExternalOzonAppDeeplinkHandler(@NotNull WhiteListDomainsOzonAppsHandler whiteListDomainsOzonAppsHandler) {
        Intrinsics.checkNotNullParameter(whiteListDomainsOzonAppsHandler, "whiteListDomainsOzonAppsHandler");
        this.whiteListDomainsOzonAppsHandler = whiteListDomainsOzonAppsHandler;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (route.c() == c.INTERNAL) {
            String host = route.b().getHost();
            if (host != null ? this.whiteListDomainsOzonAppsHandler.canHandleLink(host) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter("new_task");
        return new ExternalAppDestination(route.b(), queryParameter != null ? Boolean.parseBoolean(queryParameter) : false);
    }
}
