package ru.ozon.app.android.core.navigation.deeplink.storefront.web;

import B0.C2454a;
import GZ.j;
import IZ.c;
import Lh.a;
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
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshFaqDeeplinkHandlerKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.auth.flags.LogWebViewUrlIsHttp;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.deeplink.ReviewFormPolicyWebViewDeeplinkHandlerKt;
import ru.ozon.app.android.ugc.deeplink.SelectionsDetailsWebViewDeeplinkHandlerKt;
import ru.ozon.app.android.web.TransparentNavbarWebFragment;
import ru.ozon.app.android.web.WebBottomSheetFragment;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.app.android.web.webview.ai.CheckAiConversation;
import ru.ozon.app.android.web.webview.client.WebViewUrlChecker;
import ru.ozon.app.android.web.zoomWebView.WebBottomSheetZoomEnabledFragment;
import ru.ozon.fintech.ui.input.CounterView;
import uZ.C9992d;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJi\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020)2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b1\u00102J\u0013\u0010!\u001a\u00020\u000f*\u000203H\u0002¢\u0006\u0004\b!\u00104J#\u00108\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b:\u00100J#\u0010;\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b;\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/storefront/web/WebViewDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "checkAiConversation", "Lru/ozon/app/android/core/navigation/deeplink/storefront/web/WebViewAuthDestinationInterceptor;", "webViewAuthDestinationInterceptor", "<init>", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/web/webview/ai/CheckAiConversation;Lru/ozon/app/android/core/navigation/deeplink/storefront/web/WebViewAuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkIsHttpUrl", "", "parseUrl", "(LGZ/j;Z)Ljava/lang/String;", "parseDismissAndRedirectUrl", "(LGZ/j;)Ljava/lang/String;", "Landroid/content/Context;", "context", "LpZ/f;", "webDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "hasOverlayNavbar", ImagesContract.URL, "dismissAndRedirectUrl", "isBackStackDisabled", "isFullScreen", "isShareEnabled", "isZoomEnabled", "isRegularDrawWebView", "hasTeeth", "shouldShowNavBar", "isAiConversation", "Landroidx/fragment/app/m;", "createWebFragment", "(ZLjava/lang/String;Ljava/lang/String;ZZZZZZZZ)Landroidx/fragment/app/m;", "LuZ/d;", "webBottomSheetDestination", "(LGZ/j;)LuZ/d;", "", "removeBottomSheet", "(Landroid/content/Context;)V", "fixAuthRedirectBackStack", "(LGZ/j;)Z", "isOzonWebDeeplink", "(LGZ/j;Ljava/lang/String;)Z", "Landroid/net/Uri;", "(Landroid/net/Uri;)Z", "queryParam", "LuZ/d$b;", "fallback", "mapQueryParamToDialogNavigationMode", "(Ljava/lang/String;LuZ/d$b;)LuZ/d$b;", "canHandle", "getDestination", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewDeeplinkHandler extends c {

    @NotNull
    private final CheckAiConversation checkAiConversation;

    @NotNull
    private final DomainsInteractor domainsInteractor;

    @NotNull
    private final FeatureChecker featureChecker;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewDeeplinkHandler(@NotNull DomainsInteractor domainsInteractor, @NotNull FeatureChecker featureChecker, @NotNull CheckAiConversation checkAiConversation, @NotNull WebViewAuthDestinationInterceptor webViewAuthDestinationInterceptor) {
        super(webViewAuthDestinationInterceptor, null);
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(checkAiConversation, "checkAiConversation");
        Intrinsics.checkNotNullParameter(webViewAuthDestinationInterceptor, "webViewAuthDestinationInterceptor");
        this.domainsInteractor = domainsInteractor;
        this.featureChecker = featureChecker;
        this.checkAiConversation = checkAiConversation;
    }

    private final ComponentCallbacksC5392m createWebFragment(boolean hasOverlayNavbar, String url, String dismissAndRedirectUrl, boolean isBackStackDisabled, boolean isFullScreen, boolean isShareEnabled, boolean isZoomEnabled, boolean isRegularDrawWebView, boolean hasTeeth, boolean shouldShowNavBar, boolean isAiConversation) {
        return hasOverlayNavbar ? TransparentNavbarWebFragment.INSTANCE.newInstance(url, false, dismissAndRedirectUrl, true, isBackStackDisabled, isFullScreen, true, isShareEnabled, isZoomEnabled, false) : WebFragment.INSTANCE.newInstance(url, false, dismissAndRedirectUrl, shouldShowNavBar, isBackStackDisabled, isFullScreen, true, isShareEnabled, isZoomEnabled, isRegularDrawWebView, hasTeeth, isAiConversation);
    }

    private final boolean fixAuthRedirectBackStack(j route) {
        Uri parse = Uri.parse(route.b().toString());
        return Intrinsics.d(parse.getAuthority(), "web") && parse.getPathSegments().size() == 1 && C2454a.h(parse, "auth", 0);
    }

    private final boolean isOzonWebDeeplink(j route, String url) {
        return a.f(route, "web") && Intrinsics.d(route.b().getScheme(), "ozon") && this.domainsInteractor.isUrlSubdomainOfWebDomains(url);
    }

    private final boolean isZoomEnabled(Uri uri) {
        return uri.getBooleanQueryParameter("zoom_enabled", false);
    }

    private final C9992d.b mapQueryParamToDialogNavigationMode(String queryParam, C9992d.b fallback) {
        String str;
        if (queryParam != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            str = queryParam.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        return Intrinsics.d(str, "dismiss") ? C9992d.b.a.f100436a : Intrinsics.d(str, "keep") ? C9992d.b.c.f100438a : fallback;
    }

    static /* synthetic */ C9992d.b mapQueryParamToDialogNavigationMode$default(WebViewDeeplinkHandler webViewDeeplinkHandler, String str, C9992d.b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = C9992d.b.a.f100436a;
        }
        return webViewDeeplinkHandler.mapQueryParamToDialogNavigationMode(str, bVar);
    }

    private final String parseDismissAndRedirectUrl(j route) {
        return route.b().getQueryParameter("dismissAndRedirectUrl");
    }

    private final String parseUrl(j route, boolean checkIsHttpUrl) {
        String queryParameter = route.b().getQueryParameter(ImagesContract.URL);
        if (queryParameter == null) {
            queryParameter = Kk.c.c(route, "toString(...)");
        }
        if (checkIsHttpUrl) {
            WebViewUrlChecker.INSTANCE.checkUrl(queryParameter);
        }
        return queryParameter;
    }

    static /* synthetic */ String parseUrl$default(WebViewDeeplinkHandler webViewDeeplinkHandler, j jVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = webViewDeeplinkHandler.featureChecker.isEnabled(LogWebViewUrlIsHttp.INSTANCE);
        }
        return webViewDeeplinkHandler.parseUrl(jVar, z11);
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

    private final C9992d webBottomSheetDestination(j route) {
        Uri b11 = route.b();
        String parseUrl$default = parseUrl$default(this, route, false, 2, null);
        String parseDismissAndRedirectUrl = parseDismissAndRedirectUrl(route);
        boolean d11 = Intrinsics.d(b11.getQueryParameter("style"), "halfCurtain");
        boolean z11 = !b11.getBooleanQueryParameter("hidesTitle", false);
        boolean z12 = !b11.getBooleanQueryParameter("hidesCloseButton", false);
        return new C9992d(new sZ.c(Kk.c.c(route, "toString(...)"), isZoomEnabled(b11) ? WebBottomSheetZoomEnabledFragment.INSTANCE.newInstance(parseUrl$default, parseDismissAndRedirectUrl, d11, z11, z12) : WebBottomSheetFragment.INSTANCE.newInstance(parseUrl$default, parseDismissAndRedirectUrl, d11, z11, z12), null, false, false, null, false, false, false, 508, null), mapQueryParamToDialogNavigationMode$default(this, b11.getQueryParameter("navigationMode"), null, 2, null));
    }

    private final f webDestination(Context context, j route) {
        boolean z11;
        boolean z12;
        boolean z13;
        removeBottomSheet(context);
        String c11 = Kk.c.c(route, "toString(...)");
        Uri b11 = route.b();
        String parseUrl$default = parseUrl$default(this, route, false, 2, null);
        boolean t2 = h.t(c11, "results-of-the-year-2025", false);
        boolean z14 = h.t(c11, "gameapp", false) && !t2;
        boolean check = this.checkAiConversation.check(c11);
        boolean d11 = Intrinsics.d(b11.getQueryParameter("flag"), "no_history");
        boolean z15 = b11.getBooleanQueryParameter("isFullScreen", false) || z14 || t2 || check;
        boolean z16 = b11.getBooleanQueryParameter("isBackStackEnabled", false) || fixAuthRedirectBackStack(route) || z14 || t2;
        if (route.b().getBooleanQueryParameter("enable_sharing", false) || t2) {
            z11 = false;
            z12 = z15;
            z13 = true;
        } else {
            z11 = false;
            z12 = z15;
            z13 = false;
        }
        boolean isZoomEnabled = isZoomEnabled(b11);
        if (!t2 && !z14 && AppTypeResolver.INSTANCE.isSelect(context)) {
            z11 = true;
        }
        return new sZ.c(c11, createWebFragment(t2, parseUrl$default, parseDismissAndRedirectUrl(route), !z16, z12, z13, isZoomEnabled, z14, z11, !check, check), null, !d11, false, null, false, false, false, CounterView.COUNTER_MAX_DEFAULT, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        String parseUrl = parseUrl(route, false);
        return (!WebViewUrlChecker.INSTANCE.checkScheme(parseUrl) || !isOzonWebDeeplink(route, parseUrl) || FreshFaqDeeplinkHandlerKt.isUrlFaqExpress(parseUrl) || ReviewFormPolicyWebViewDeeplinkHandlerKt.isUrlPolicy(parseUrl) || SelectionsDetailsWebViewDeeplinkHandlerKt.isUrlSelectionDetails(parseUrl)) ? false : true;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter("style");
        return (Intrinsics.d(queryParameter, "curtain") || Intrinsics.d(queryParameter, "halfCurtain")) ? webBottomSheetDestination(route) : webDestination(context, route);
    }
}
