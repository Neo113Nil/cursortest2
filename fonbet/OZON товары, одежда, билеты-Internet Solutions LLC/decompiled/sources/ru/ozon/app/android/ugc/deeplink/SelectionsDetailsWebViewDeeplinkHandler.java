package ru.ozon.app.android.ugc.deeplink;

import GZ.j;
import IZ.a;
import Kk.c;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.web.WebBottomSheetFragment;
import uZ.C9992d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/SelectionsDetailsWebViewDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "<init>", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "parseUrl", "(LGZ/j;)Ljava/lang/String;", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LuZ/d;", "getDestination", "(Landroid/content/Context;LGZ/j;)LuZ/d;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionsDetailsWebViewDeeplinkHandler implements a {

    @NotNull
    private final DomainsInteractor domainsInteractor;
    public static final int $stable = 8;

    public SelectionsDetailsWebViewDeeplinkHandler(@NotNull DomainsInteractor domainsInteractor) {
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        this.domainsInteractor = domainsInteractor;
    }

    private final String parseUrl(j route) {
        String queryParameter = route.b().getQueryParameter(ImagesContract.URL);
        return queryParameter == null ? c.c(route, "toString(...)") : queryParameter;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        String parseUrl = parseUrl(route);
        return Lh.a.f(route, "web") && Intrinsics.d(route.b().getScheme(), "ozon") && this.domainsInteractor.isUrlSubdomainOfWebDomains(parseUrl) && SelectionsDetailsWebViewDeeplinkHandlerKt.isUrlSelectionDetails(parseUrl);
    }

    @Override // IZ.a
    @NotNull
    public C9992d getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new C9992d(new sZ.c(c.c(route, "toString(...)"), WebBottomSheetFragment.Companion.newInstance$default(WebBottomSheetFragment.INSTANCE, parseUrl(route), null, false, false, false, 28, null), null, false, false, null, false, false, false, 508, null), C9992d.b.c.f100438a);
    }
}
