package ru.ozon.app.android.core.navigation.interceptors.tab.apps;

import BZ.a;
import BZ.e;
import CZ.c;
import CZ.f;
import CZ.g;
import GZ.j;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;
import ru.ozon.app.android.travel.feature.general.common.flags.TravelMiniAppStateRestoresFromCacheFlag;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u00020\n*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0018\u0010$\u001a\u00020\n*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\f¨\u0006&"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/tab/apps/TravelAppHandler;", "LBZ/a;", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LBZ/e;Lru/ozon/app/android/network/abtool/FeatureService;)V", "Landroid/net/Uri;", "deeplink", "", "shouldRestoreState", "(Landroid/net/Uri;)Z", "", "miniAppName", "canSwitchApp", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "LEZ/e;", "LCZ/g;", "response", "isSaved", "LCZ/c;", "getMiniAppDestination", "(Landroid/content/Context;Ljava/lang/String;LEZ/e;Z)LCZ/c;", "LBZ/e;", "Lru/ozon/app/android/network/abtool/FeatureService;", "", "restorableSegments$delegate", "LSc/j;", "getRestorableSegments", "()Ljava/util/List;", "restorableSegments", "getHasRestoreStateQueryParam", "hasRestoreStateQueryParam", "isMainPage", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TravelAppHandler implements a {

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final e miniAppConfigHolder;

    /* renamed from: restorableSegments$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j restorableSegments;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/tab/apps/TravelAppHandler$Companion;", "", "<init>", "()V", "RESTORE_STATE_ENABLED_WITH_QUERY", "", "RESTORE_STATE_ENABLED_WITH_QUERY_AND_HOME_PAGE_URL", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TravelAppHandler(@NotNull e miniAppConfigHolder, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.featureService = featureService;
        this.restorableSegments = LazyUtilsKt.unsafeLazy(new TravelAppHandler$restorableSegments$2(this));
    }

    private final boolean getHasRestoreStateQueryParam(Uri uri) {
        return uri.getBooleanQueryParameter("restoresMiniappState", false);
    }

    private final List<String> getRestorableSegments() {
        return (List) this.restorableSegments.getValue();
    }

    private final boolean isMainPage(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) C7714v.M(pathSegments);
        List<String> restorableSegments = getRestorableSegments();
        if ((restorableSegments instanceof Collection) && restorableSegments.isEmpty()) {
            return false;
        }
        Iterator<T> it = restorableSegments.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean shouldRestoreState(Uri deeplink) {
        if (deeplink == null) {
            return false;
        }
        String stringKey = this.featureService.getStringKey(TravelMiniAppStateRestoresFromCacheFlag.INSTANCE);
        if (Intrinsics.d(stringKey, "ENABLED_ONLY_FOR_LINKS_WITH_QUERY")) {
            return getHasRestoreStateQueryParam(deeplink);
        }
        if (Intrinsics.d(stringKey, "ENABLED_FOR_LINKS_WITH_QUERY_AND_HOME_PAGE_URL")) {
            return getHasRestoreStateQueryParam(deeplink) || isMainPage(deeplink);
        }
        return false;
    }

    @Override // BZ.a
    public boolean canSwitchApp(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return Intrinsics.d(miniAppName, "travel");
    }

    @Override // BZ.a
    public c getMiniAppDestination(@NotNull Context context, @NotNull String miniAppName, @NotNull EZ.e<g> response, boolean isSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(response, "response");
        if (context instanceof OzonTravelActivity) {
            return null;
        }
        j c11 = response.c();
        Uri d11 = c11 != null ? c11.d() : null;
        return f.b(this, miniAppName, k.b(new TravelAppHandler$getMiniAppDestination$1(d11, miniAppName, BZ.f.a(this.miniAppConfigHolder))), null, shouldRestoreState(d11), 4);
    }
}
