package com.ironsource;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.t9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2668t9 implements InterfaceC2391e0<InterstitialAd> {
    private final InterfaceC2642s1 a;
    private final Executor b;

    public C2668t9(InterfaceC2642s1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC2391e0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(J9 adInstance, Y1 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        C2373d0 c2373d0 = new C2373d0(new Ac());
        InterfaceC2642s1 interfaceC2642s1 = this.a;
        concurrentHashMap = C2686u9.a;
        return new InterstitialAd(new C2704v9(adInstance, c2373d0, auctionDataReporter, interfaceC2642s1, null, null, null, null, concurrentHashMap, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
