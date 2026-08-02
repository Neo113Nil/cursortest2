package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532uf {

    /* renamed from: a, reason: collision with root package name */
    public final C0433qf f14728a;

    public C0532uf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z5) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f14728a = new C0433qf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z5, S7.f12862c);
            }
        }
    }
}
