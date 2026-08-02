package bo.app;

import com.braze.models.Banner;
import com.braze.storage.C2987a;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final C2987a f25921a;

    public q(C2987a bannersDataStoreProvider) {
        Intrinsics.checkNotNullParameter(bannersDataStoreProvider, "bannersDataStoreProvider");
        this.f25921a = bannersDataStoreProvider;
    }

    public static final String b(Banner banner) {
        return "Filtering expired banner for placement " + banner.getPlacementId() + ": expirationTimestampSeconds=" + banner.getExpirationTimestampSeconds() + ", now=" + DateTimeUtils.nowInSeconds();
    }

    public final boolean a(final Banner banner, final Long l10, Map map) {
        Long l11;
        if (l10 != null && (l11 = (Long) map.get(banner.getPlacementId())) != null) {
            final long longValue = l11.longValue();
            if (longValue > l10.longValue()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.e9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q.a(Banner.this, longValue, l10);
                    }
                }, 6, (Object) null);
                return false;
            }
        }
        return true;
    }

    public static final String a(Banner banner, long j10, Long l10) {
        return "Filtering stale banner for placement " + banner.getPlacementId() + ": lastRequestTime=" + j10 + " > responseRequestTime=" + l10;
    }

    public final boolean a(final Banner banner, Set set) {
        final String stableKey = banner.getStableKey();
        if (stableKey == null || !set.contains(stableKey)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.f9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q.a(Banner.this, stableKey);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a(Banner banner, String str) {
        return "Filtering dismissed banner for placement " + banner.getPlacementId() + ": stableKey=" + str + " has an unacknowledged pending dismissal";
    }

    public final boolean a(final Banner banner) {
        if (!banner.isExpired()) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.d9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q.b(Banner.this);
            }
        }, 6, (Object) null);
        return false;
    }
}
