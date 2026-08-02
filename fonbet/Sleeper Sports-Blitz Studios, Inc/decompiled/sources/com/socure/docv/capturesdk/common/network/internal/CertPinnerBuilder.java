package com.socure.docv.capturesdk.common.network.internal;

import com.socure.docv.capturesdk.BuildConfig;
import kotlin.Metadata;
import okhttp3.CertificatePinner;

/* compiled from: CertPinnerBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/internal/CertPinnerBuilder;", "", "()V", "getBuilder", "Lokhttp3/CertificatePinner;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CertPinnerBuilder {
    public static final int $stable = 0;
    public static final CertPinnerBuilder INSTANCE = new CertPinnerBuilder();

    private CertPinnerBuilder() {
    }

    public final CertificatePinner getBuilder() {
        return new CertificatePinner.Builder().add(BuildConfig.CERT_PIN_DOMAIN, BuildConfig.CERT_PIN_SOCURE).add(BuildConfig.CERT_PIN_DOMAIN, BuildConfig.CERT_PIN_AMAZON_INTERMEDIATE).add(BuildConfig.CERT_PIN_DOMAIN, BuildConfig.CERT_PIN_AMAZON_ROOT).build();
    }
}
