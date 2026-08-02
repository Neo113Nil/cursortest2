package com.vk.superapp.advertisement;

import xsna.pmi0;
import xsna.sni;
import xsna.zcl;

/* compiled from: AdvertisementWaterfallImpl.kt */
/* loaded from: classes6.dex */
public abstract class TimeoutConfig {

    @pmi0("timeout_end_ms")
    private final long timeoutEndMs;

    /* compiled from: AdvertisementWaterfallImpl.kt */
    public static final class a extends TimeoutConfig {
    }

    /* compiled from: AdvertisementWaterfallImpl.kt */
    public static final class b extends TimeoutConfig {
    }

    public /* synthetic */ TimeoutConfig(long j, zcl zclVar) {
        this(j);
    }

    public final boolean a(sni sniVar) {
        return sniVar.i() >= this.timeoutEndMs;
    }

    private TimeoutConfig(long j) {
        this.timeoutEndMs = j;
    }
}
