package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Lc implements InterfaceC0465rn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12532a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f12533b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f12534c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f12535d;

    public Lc(@NotNull Context context) {
        this.f12532a = context;
        this.f12533b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0353na.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f12534c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f12535d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0465rn
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Kc a() {
        Kc kc2;
        try {
            kc2 = (Kc) this.f12535d.getData();
            if (kc2 != null) {
                if (this.f12535d.shouldUpdateData()) {
                }
            }
            kc2 = new Kc(this.f12533b.hasNecessaryPermissions(this.f12532a) ? this.f12534c.getNetworkType() : "unknown");
            this.f12535d.setData(kc2);
        } catch (Throwable th2) {
            throw th2;
        }
        return kc2;
    }
}
