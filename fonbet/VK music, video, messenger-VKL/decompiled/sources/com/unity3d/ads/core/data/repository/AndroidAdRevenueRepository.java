package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.lyd;
import xsna.sh50;

/* compiled from: AndroidAdRevenueRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidAdRevenueRepository implements AdRevenueRepository {
    private final sh50<AdRevenueEventRequestOuterClass.AdRevenueEventRequest> adRevenueEvents = lyd.a(0, 64, BufferOverflow.DROP_OLDEST);

    @Override // com.unity3d.ads.core.data.repository.AdRevenueRepository
    public sh50<AdRevenueEventRequestOuterClass.AdRevenueEventRequest> getAdRevenueEvents() {
        return this.adRevenueEvents;
    }
}
