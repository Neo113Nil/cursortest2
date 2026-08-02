package c;

import ai.verisoul.sdk.helpers.session.SessionData;
import android.content.Context;
import android.os.Build;
import com.appsflyer.AdRevenueScheme;
import com.surt.guardian.core.Configuration;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26486a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f26487b;

    /* renamed from: c, reason: collision with root package name */
    public final A0 f26488c;

    public P0(Context context, Configuration config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f26486a = context;
        this.f26487b = config;
        this.f26488c = new A0(context);
    }

    public final Map a() {
        long j10;
        Map mutableMap = MapsKt.toMutableMap(this.f26488c.a());
        if (this.f26487b.getCollectAppInstallTime()) {
            mutableMap.put("app_install_time", Long.valueOf(b()));
            try {
                j10 = this.f26486a.getPackageManager().getPackageInfo(this.f26486a.getPackageName(), 0).lastUpdateTime;
            } catch (Exception unused) {
                j10 = 0;
            }
            mutableMap.put("app_update_time", Long.valueOf(j10));
            long b10 = b();
            mutableMap.put("days_since_install", Long.valueOf(b10 != 0 ? (System.currentTimeMillis() - b10) / SessionData.EXPIRATION_TIME : 0L));
        }
        mutableMap.put("language", Locale.getDefault().getLanguage());
        mutableMap.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
        mutableMap.put("build_fingerprint", Build.FINGERPRINT);
        mutableMap.put("build_id", Build.ID);
        return mutableMap;
    }

    public final long b() {
        try {
            return this.f26486a.getPackageManager().getPackageInfo(this.f26486a.getPackageName(), 0).firstInstallTime;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
