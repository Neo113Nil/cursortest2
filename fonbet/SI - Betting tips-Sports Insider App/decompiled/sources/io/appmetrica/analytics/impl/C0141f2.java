package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141f2 {
    public static final boolean a(Throwable th2) {
        return true;
    }

    @NotNull
    public final Fa a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull Ta ta2) {
        return new Bh(new C0151fc(ta2, appMetricaConfig), new ap(3), appMetricaConfig.crashTransformer, new M9(context));
    }
}
