package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class T3 {

    /* renamed from: a, reason: collision with root package name */
    public final Am f12900a;

    /* renamed from: b, reason: collision with root package name */
    public final U f12901b;

    public T3(Am am, U u10) {
        this.f12900a = am;
        this.f12901b = u10;
    }

    public final S3 a(HashMap hashMap) {
        AdvertisingIdsHolder a7;
        C0161fm e7 = this.f12900a.e();
        U u10 = this.f12901b;
        synchronized (u10) {
            a7 = u10.a(new Xd());
        }
        return new S3(S3.a(e7.f13756d), S3.a(e7.f13753a), S3.a(e7.f13754b), S3.a(e7.j), S3.a(e7.f13761i), S3.a(AbstractC0176gb.a(Fm.a(e7.f13762k))), S3.a(AbstractC0176gb.a(hashMap)), new IdentifiersResult(a7.getGoogle().mAdTrackingInfo == null ? null : a7.getGoogle().mAdTrackingInfo.advId, a7.getGoogle().mStatus, a7.getGoogle().mErrorExplanation), new IdentifiersResult(a7.getHuawei().mAdTrackingInfo == null ? null : a7.getHuawei().mAdTrackingInfo.advId, a7.getHuawei().mStatus, a7.getHuawei().mErrorExplanation), new IdentifiersResult(a7.getYandex().mAdTrackingInfo == null ? null : a7.getYandex().mAdTrackingInfo.advId, a7.getYandex().mStatus, a7.getYandex().mErrorExplanation), S3.a(AbstractC0176gb.a(e7.f13760h)), In.a(), e7.f13766o + e7.f13776z.f12119a, S3.a(e7.f13765n.f14169f), new Bundle());
    }
}
