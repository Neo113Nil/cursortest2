package l8;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;
import k8.e;

/* loaded from: classes.dex */
public final class b implements InterfaceC7893a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f72960b;

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final AppMeasurementSdk f72961a;

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f72961a = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    @NonNull
    @KeepForSdk
    public static InterfaceC7893a c(@NonNull e eVar, @NonNull Context context, @NonNull v8.d dVar) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f72960b == null) {
            synchronized (b.class) {
                try {
                    if (f72960b == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.r()) {
                            dVar.b(c.f72962a, d.f72963a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.q());
                        }
                        f72960b = new b(zzee.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return f72960b;
    }

    @Override // l8.InterfaceC7893a
    @KeepForSdk
    public final void a(@NonNull Bundle bundle, @NonNull String str) {
        if (com.google.firebase.analytics.connector.internal.b.c() && com.google.firebase.analytics.connector.internal.b.b(bundle, str) && com.google.firebase.analytics.connector.internal.b.a(bundle, str)) {
            this.f72961a.logEvent(AppMeasurement.FCM_ORIGIN, str, bundle);
        }
    }

    @Override // l8.InterfaceC7893a
    @KeepForSdk
    public final void b(@NonNull String str) {
        if (com.google.firebase.analytics.connector.internal.b.c()) {
            this.f72961a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", str);
        }
    }
}
