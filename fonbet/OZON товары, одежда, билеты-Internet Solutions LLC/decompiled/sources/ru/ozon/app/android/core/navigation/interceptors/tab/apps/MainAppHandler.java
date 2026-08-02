package ru.ozon.app.android.core.navigation.interceptors.tab.apps;

import BZ.a;
import BZ.e;
import BZ.f;
import CZ.c;
import CZ.g;
import GZ.j;
import Sc.k;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.ContextUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ7\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/tab/apps/MainAppHandler;", "LBZ/a;", "LBZ/e;", "miniAppConfigHolder", "<init>", "(LBZ/e;)V", "", "deeplink", "", "webInFakeMain", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "isStandaloneApplication", "(Landroid/content/Context;)Z", "miniAppName", "canSwitchApp", "LEZ/e;", "LCZ/g;", "response", "isSaved", "LCZ/c;", "getMiniAppDestination", "(Landroid/content/Context;Ljava/lang/String;LEZ/e;Z)LCZ/c;", "LBZ/e;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainAppHandler implements a {

    @NotNull
    private final e miniAppConfigHolder;

    public MainAppHandler(@NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.miniAppConfigHolder = miniAppConfigHolder;
    }

    private final boolean isStandaloneApplication(Context context) {
        return ContextUtilsKt.isOzonTravelApplication(context) || ContextUtilsKt.isOzonFreshApplication(context);
    }

    private final boolean webInFakeMain(String deeplink) {
        return Intrinsics.d(f.a(this.miniAppConfigHolder), "fakeMain") && deeplink != null && h.t(deeplink, "web", false);
    }

    @Override // BZ.a
    public boolean canSwitchApp(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return Intrinsics.d(miniAppName, "main");
    }

    @Override // BZ.a
    public c getMiniAppDestination(@NotNull Context context, @NotNull String miniAppName, @NotNull EZ.e<g> response, boolean isSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(response, "response");
        j c11 = response.c();
        Uri d11 = c11 != null ? c11.d() : null;
        if (!isStandaloneApplication(context)) {
            if (!webInFakeMain(d11 != null ? d11.toString() : null)) {
                return CZ.f.a(this, miniAppName, k.b(MainAppHandler$getMiniAppDestination$1.INSTANCE), response.b().b(), isSaved);
            }
        }
        return null;
    }
}
