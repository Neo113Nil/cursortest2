package ru.ozon.app.android.core.navigation.interceptors.tab.apps;

import BZ.a;
import BZ.e;
import CZ.b;
import CZ.c;
import CZ.g;
import GZ.j;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.net.Uri;
import c8.C5766e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.fresh.common.flags.FreshRestoreMiniAppStateEnabledFlag;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/tab/apps/ExpressAppHandler;", "LBZ/a;", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LBZ/e;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "miniAppName", "referrerMiniAppName", "Landroid/net/Uri;", "deeplink", "", "restoreState", "LpZ/f;", "redirect", "LCZ/e;", "createOpenDestination", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ZLpZ/f;)LCZ/e;", "LCZ/c;", "handleRedirectFromFakeOzon", "(Landroid/net/Uri;)LCZ/c;", "isRestoreStateEnabled", "(Landroid/net/Uri;)Z", "isFreshTab", "canSwitchApp", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "LEZ/e;", "LCZ/g;", "response", "isSaved", "getMiniAppDestination", "(Landroid/content/Context;Ljava/lang/String;LEZ/e;Z)LCZ/c;", "LBZ/e;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpressAppHandler implements a {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final e miniAppConfigHolder;

    public ExpressAppHandler(@NotNull e miniAppConfigHolder, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.featureChecker = featureChecker;
    }

    private final CZ.e createOpenDestination(String miniAppName, String referrerMiniAppName, Uri deeplink, boolean restoreState, f redirect) {
        InterfaceC4008j b11 = k.b(new ExpressAppHandler$createOpenDestination$1(this, miniAppName, referrerMiniAppName, deeplink));
        if (!restoreState || isFreshTab(deeplink)) {
            redirect = null;
        }
        return CZ.f.a(this, miniAppName, b11, redirect, restoreState);
    }

    private final c handleRedirectFromFakeOzon(Uri deeplink) {
        pZ.e eVar;
        if (deeplink == null || isFreshTab(deeplink)) {
            eVar = null;
        } else {
            String uri = deeplink.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            eVar = new pZ.e(uri);
        }
        return new b(eVar, b.a.CURRENT, 4);
    }

    private final boolean isFreshTab(Uri deeplink) {
        if (deeplink == null) {
            return true;
        }
        if (Intrinsics.d(deeplink.getAuthority(), "category")) {
            List<String> pathSegments = deeplink.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (!pathSegments.isEmpty() && C5766e.c(deeplink, "getPathSegments(...)", 0, "25000") && deeplink.getQueryParameterNames().contains("miniapp")) {
                String queryParameter = deeplink.getQueryParameter("miniapp");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (queryParameter.equals("supermarket")) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isRestoreStateEnabled(Uri deeplink) {
        if (this.featureChecker.isEnabled(FreshRestoreMiniAppStateEnabledFlag.INSTANCE)) {
            return (deeplink != null ? deeplink.getQueryParameter("restoresMiniappState") : null) != null;
        }
        return false;
    }

    @Override // BZ.a
    public boolean canSwitchApp(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return Intrinsics.d(miniAppName, "supermarket");
    }

    @Override // BZ.a
    public c getMiniAppDestination(@NotNull Context context, @NotNull String miniAppName, @NotNull EZ.e<g> response, boolean isSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(response, "response");
        if (context instanceof OzonFreshActivity) {
            return null;
        }
        j c11 = response.c();
        Uri d11 = c11 != null ? c11.d() : null;
        String a11 = BZ.f.a(this.miniAppConfigHolder);
        if (Intrinsics.d(a11, "fakeMain")) {
            return handleRedirectFromFakeOzon(d11);
        }
        boolean z11 = isSaved && isRestoreStateEnabled(d11);
        if (Intrinsics.d(a11, "regularDraw")) {
            return createOpenDestination(miniAppName, a11, d11, z11, response.b().b());
        }
        return new b(createOpenDestination(miniAppName, a11, d11, z11, response.b().b()), h.e0(a11, "express_seller", false) ? b.a.CURRENT : b.a.ALL, 4);
    }
}
