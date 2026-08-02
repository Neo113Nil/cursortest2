package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import B0.A0;
import E10.c;
import Ob0.a;
import U20.b;
import androidx.activity.ActivityC5043j;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import ru.ozon.app.android.debugmenu.ozondebugmenu.support.OzonDebugMenuEvents;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.storage.auth.AuthTokenDataSource;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import xe.C10727i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/InformationGroupProvider;", "Lr20/c;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "authTokenDataSource", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "cookieEvents", "Lru/ozon/app/android/push/OzonPushManager;", "ozonPushManager", "LE10/c;", "prefetchManager", "Lru/ozon/app/android/debugmenu/ozondebugmenu/support/OzonDebugMenuEvents;", "ozonDebugMenuEvents", "LOb0/a;", "ozonIdAppApi", "<init>", "(Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;Lru/ozon/app/android/storage/auth/AuthTokenDataSource;Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;Lru/ozon/app/android/push/OzonPushManager;LE10/c;Lru/ozon/app/android/debugmenu/ozondebugmenu/support/OzonDebugMenuEvents;LOb0/a;)V", "Landroidx/activity/j;", "activity", "", "onActivityCreated", "(Landroidx/activity/j;)V", "LU20/a;", "provide", "()LU20/a;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "Lru/ozon/app/android/push/OzonPushManager;", "LE10/c;", "Lru/ozon/app/android/debugmenu/ozondebugmenu/support/OzonDebugMenuEvents;", "LOb0/a;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InformationGroupProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ApplicationInfoDataSource applicationInfoDataSource;

    @NotNull
    private final AuthTokenDataSource authTokenDataSource;

    @NotNull
    private final OzonIdCookieEvents cookieEvents;

    @NotNull
    private final OzonDebugMenuEvents ozonDebugMenuEvents;

    @NotNull
    private final a ozonIdAppApi;

    @NotNull
    private final OzonPushManager ozonPushManager;

    @NotNull
    private final c prefetchManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/InformationGroupProvider$Companion;", "", "<init>", "()V", "INFO", "", "GROUP", "PUSH_TOKEN", "JWT_TOKEN", "APP_UUID", "SESSION_ID", "PREFETCH_DEPTH", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InformationGroupProvider(@NotNull ApplicationInfoDataSource applicationInfoDataSource, @NotNull AuthTokenDataSource authTokenDataSource, @NotNull OzonIdCookieEvents cookieEvents, @NotNull OzonPushManager ozonPushManager, @NotNull c prefetchManager, @NotNull OzonDebugMenuEvents ozonDebugMenuEvents, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(authTokenDataSource, "authTokenDataSource");
        Intrinsics.checkNotNullParameter(cookieEvents, "cookieEvents");
        Intrinsics.checkNotNullParameter(ozonPushManager, "ozonPushManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(ozonDebugMenuEvents, "ozonDebugMenuEvents");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.applicationInfoDataSource = applicationInfoDataSource;
        this.authTokenDataSource = authTokenDataSource;
        this.cookieEvents = cookieEvents;
        this.ozonPushManager = ozonPushManager;
        this.prefetchManager = prefetchManager;
        this.ozonDebugMenuEvents = ozonDebugMenuEvents;
        this.ozonIdAppApi = ozonIdAppApi;
    }

    @Override // r20.AbstractC9166c
    public void onActivityCreated(@NotNull ActivityC5043j activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C10727i.c(K.a(activity), null, null, new InformationGroupProvider$onActivityCreated$1(this, activity, null), 3);
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public U20.a provide() {
        List<Pair<String, String>> pushTokens = this.ozonPushManager.getPushTokens();
        ArrayList arrayList = new ArrayList(C7714v.z(pushTokens, 10));
        Iterator<T> it = pushTokens.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            arrayList.add(new b.e(Nk.a.b("infoPushToken", str), A0.b("Push Token (", str, ")"), (String) pair.b()));
        }
        b.e eVar = new b.e("infoJwtToken", "JWT Token", this.authTokenDataSource.mo1006getTokenAZpst64());
        b.e eVar2 = new b.e("infoAppUuid", "Application UUID", this.applicationInfoDataSource.getUniqueApplicationId());
        String sessionId = this.ozonIdAppApi.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        return new U20.a("infoGroup", "Information", C7714v.p0(C7714v.b0(eVar, eVar2, new b.e("infoSessionId", "SessionID", sessionId), new b.e("infoPrefetchDepth", "Default Prefetch Depth", String.valueOf(this.prefetchManager.getPrefetchDepth(null).b()))), arrayList));
    }
}
