package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class M7 {

    /* renamed from: a, reason: collision with root package name */
    public final U f12571a;

    /* renamed from: b, reason: collision with root package name */
    public final C0012a2 f12572b;

    public M7(U u10, C0012a2 c0012a2) {
        this.f12571a = u10;
        this.f12572b = c0012a2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        U u10 = this.f12571a;
        Jn jn = new Jn(5, 500);
        synchronized (u10) {
            try {
                u10.a((Gi) jn, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u10.f12950k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id2 = this.f12572b.getAppSetId().getId();
            if (id2 != null && id2.length() != 0) {
                try {
                    UUID.fromString(id2);
                    if (!Intrinsics.areEqual(id2, "00000000-0000-0000-0000-000000000000")) {
                        return kotlin.text.z.m(id2, "-", "");
                    }
                } catch (Throwable unused2) {
                }
            }
            return kotlin.text.z.m(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        Intrinsics.checkNotNull(adTrackingInfo);
        String str = adTrackingInfo.advId;
        Intrinsics.checkNotNull(str);
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8));
        } catch (NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public M7() {
        this(C0353na.k().c(), C0353na.k().d());
    }
}
