package ru.ozon.app.android.fresh.navigation.deeplinks;

import GZ.j;
import IZ.a;
import Kk.c;
import NZ.d;
import android.content.Context;
import android.net.Uri;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.fintech.ui.input.CounterView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u00182\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/navigation/deeplinks/FreshFaqDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "<init>", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "Landroid/content/Context;", "context", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "LsZ/c;", "Lru/ozon/app/android/web/WebFragment;", "webDestination", "(Landroid/content/Context;LGZ/j;)LsZ/c;", "", "removeBottomSheet", "(Landroid/content/Context;)V", "", "parseUrl", "(LGZ/j;)Ljava/lang/String;", "parseDismissAndRedirectUrl", "Landroid/net/Uri;", "deeplink", "", "isBackStackDisabled", "(Landroid/net/Uri;)Z", "canHandle", "(LGZ/j;)Z", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshFaqDeeplinkHandler implements a {

    @NotNull
    private final DomainsInteractor domainsInteractor;

    public FreshFaqDeeplinkHandler(@NotNull DomainsInteractor domainsInteractor) {
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        this.domainsInteractor = domainsInteractor;
    }

    private final boolean isBackStackDisabled(Uri deeplink) {
        return !deeplink.getBooleanQueryParameter("isBackStackEnabled", false);
    }

    private final String parseDismissAndRedirectUrl(j route) {
        return route.b().getQueryParameter("dismissAndRedirectUrl");
    }

    private final String parseUrl(j route) {
        String queryParameter = route.b().getQueryParameter(ImagesContract.URL);
        return queryParameter == null ? c.c(route, "toString(...)") : queryParameter;
    }

    private final void removeBottomSheet(Context context) {
        G supportFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        G childFragmentManager;
        ComponentCallbacksC5392m componentCallbacksC5392m = null;
        g gVar = context instanceof g ? (g) context : null;
        if (gVar == null || (supportFragmentManager = gVar.getSupportFragmentManager()) == null || (r02 = supportFragmentManager.r0()) == null) {
            return;
        }
        ListIterator<ComponentCallbacksC5392m> listIterator = r02.listIterator(r02.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            ComponentCallbacksC5392m previous = listIterator.previous();
            if (previous instanceof d) {
                componentCallbacksC5392m = previous;
                break;
            }
        }
        ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m;
        if (componentCallbacksC5392m2 == null || (childFragmentManager = componentCallbacksC5392m2.getChildFragmentManager()) == null) {
            return;
        }
        List<ComponentCallbacksC5392m> r03 = childFragmentManager.r0();
        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
        for (ComponentCallbacksC5392m componentCallbacksC5392m3 : r03) {
            if (componentCallbacksC5392m3 instanceof BottomSheetComposerFragment) {
                Q p11 = childFragmentManager.p();
                p11.q(componentCallbacksC5392m3);
                p11.i();
            }
        }
    }

    private final sZ.c<WebFragment> webDestination(Context context, j route) {
        boolean z11;
        removeBottomSheet(context);
        String c11 = c.c(route, "toString(...)");
        Uri b11 = route.b();
        String queryParameter = b11.getQueryParameter("flag");
        if (queryParameter != null) {
            if (!queryParameter.equals("no_history")) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                z11 = true;
                return new sZ.c<>(c11, WebFragment.Companion.newInstance$default(WebFragment.INSTANCE, parseUrl(route), false, parseDismissAndRedirectUrl(route), false, isBackStackDisabled(b11), true, true, false, false, false, false, false, 3976, null), null, !z11, false, null, false, false, false, CounterView.COUNTER_MAX_DEFAULT, null);
            }
        }
        z11 = false;
        return new sZ.c<>(c11, WebFragment.Companion.newInstance$default(WebFragment.INSTANCE, parseUrl(route), false, parseDismissAndRedirectUrl(route), false, isBackStackDisabled(b11), true, true, false, false, false, false, false, 3976, null), null, !z11, false, null, false, false, false, CounterView.COUNTER_MAX_DEFAULT, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        String parseUrl = parseUrl(route);
        return Lh.a.f(route, "web") && Intrinsics.d(route.b().getScheme(), "ozon") && this.domainsInteractor.isUrlSubdomainOfWebDomains(parseUrl) && FreshFaqDeeplinkHandlerKt.isUrlFaqExpress(parseUrl);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return webDestination(context, route);
    }
}
