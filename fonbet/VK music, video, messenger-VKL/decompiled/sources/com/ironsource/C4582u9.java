package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.ironsource.u9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4582u9 implements InterfaceC4287e0<InterstitialAd> {
    private final InterfaceC4538s1 a;
    private final Executor b;

    public C4582u9(InterfaceC4538s1 interfaceC4538s1, Executor executor) {
        this.a = interfaceC4538s1;
        this.b = executor;
    }

    @Override // com.ironsource.InterfaceC4287e0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(K9 k9, Y1 y1) {
        ConcurrentHashMap concurrentHashMap;
        C4269d0 c4269d0 = new C4269d0(new Bc());
        InterfaceC4538s1 interfaceC4538s1 = this.a;
        concurrentHashMap = C4600v9.a;
        return new InterstitialAd(new C4618w9(k9, c4269d0, y1, interfaceC4538s1, null, null, null, null, concurrentHashMap, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
