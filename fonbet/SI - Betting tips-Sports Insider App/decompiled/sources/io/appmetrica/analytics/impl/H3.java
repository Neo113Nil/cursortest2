package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class H3 {

    /* renamed from: a, reason: collision with root package name */
    public final Bf f12300a;

    /* renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f12301b;

    public H3(Bf bf2, CounterConfiguration counterConfiguration) {
        this.f12300a = bf2;
        this.f12301b = counterConfiguration;
    }

    public static H3 a(@NonNull Context context, @NonNull Bundle bundle) {
        Bf bf2;
        CounterConfiguration fromBundle;
        String str = Bf.f12059c;
        if (bundle != null) {
            try {
                bf2 = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && bf2 != null && context.getPackageName().equals(bf2.f12060a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && bf2.f12060a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new H3(bf2, fromBundle);
            }
            return null;
        }
        bf2 = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.f12301b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f12300a + ", mCounterConfiguration=" + this.f12301b + '}';
    }

    @NonNull
    public final Bf a() {
        return this.f12300a;
    }
}
