package com.unity3d.ads.core.data.repository;

import defpackage.a62;
import defpackage.b1d;
import defpackage.beh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRevenueRepository;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "<init>", "()V", "Lb1d;", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "adRevenueEvents", "Lb1d;", "getAdRevenueEvents", "()Lb1d;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAdRevenueRepository implements AdRevenueRepository {

    @NotNull
    private final b1d adRevenueEvents = beh.a(0, 64, a62.b);

    @Override // com.unity3d.ads.core.data.repository.AdRevenueRepository
    @NotNull
    public b1d getAdRevenueEvents() {
        return this.adRevenueEvents;
    }
}
