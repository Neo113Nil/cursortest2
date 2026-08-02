package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151fc extends Wn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f13730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151fc(@NonNull Ta ta2, @NonNull AppMetricaConfig appMetricaConfig) {
        super(ta2);
        String str = appMetricaConfig.apiKey;
        this.f13730b = appMetricaConfig;
    }

    @NonNull
    public final Ua a() {
        return this.f13135a.a().a(this.f13730b);
    }
}
