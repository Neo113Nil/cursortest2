package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes13.dex */
public final class Td implements InterfaceC4287e0<RewardedAd> {
    private final InterfaceC4538s1 a;
    private final Executor b;

    public Td(InterfaceC4538s1 interfaceC4538s1, Executor executor) {
        this.a = interfaceC4538s1;
        this.b = executor;
    }

    @Override // com.ironsource.InterfaceC4287e0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(K9 k9, Y1 y1) {
        ConcurrentHashMap concurrentHashMap;
        C4269d0 c4269d0 = new C4269d0(new Bc());
        InterfaceC4538s1 interfaceC4538s1 = this.a;
        concurrentHashMap = Ud.a;
        return new RewardedAd(new Wd(k9, c4269d0, y1, interfaceC4538s1, null, null, null, null, concurrentHashMap, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
