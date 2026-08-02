package ru.ozon.app.android.network.version;

import Fb0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/network/version/AppVersionService;", "", "appName", "", "getAppName", "()Ljava/lang/String;", "version", "getVersion", "userAgent", "getUserAgent", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppVersionService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0015\u0010\t\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/network/version/AppVersionService$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/network/version/AppVersionService;", "", "isFresh", "(Lru/ozon/app/android/network/version/AppVersionService;)Z", "isSelect", "isTravel", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final boolean isFresh(@NotNull AppVersionService appVersionService) {
            Intrinsics.checkNotNullParameter(appVersionService, "<this>");
            return Intrinsics.d(appVersionService.getAppName(), f.a.FRESH_APP.a());
        }

        public final boolean isSelect(@NotNull AppVersionService appVersionService) {
            Intrinsics.checkNotNullParameter(appVersionService, "<this>");
            return Intrinsics.d(appVersionService.getAppName(), f.a.SELECT_APP.a());
        }

        public final boolean isTravel(@NotNull AppVersionService appVersionService) {
            Intrinsics.checkNotNullParameter(appVersionService, "<this>");
            return Intrinsics.d(appVersionService.getAppName(), "travelapp_android");
        }
    }

    @NotNull
    String getAppName();

    @NotNull
    String getUserAgent();

    @NotNull
    String getVersion();
}
