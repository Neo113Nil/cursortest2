package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sd implements InterfaceC4046e0<RewardedAd> {

    @NotNull
    private final InterfaceC4262q1 a;

    @NotNull
    private final Executor b;

    public Sd(@NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull Executor executor) {
        interfaceC4262q1.getClass();
        executor.getClass();
        this.a = interfaceC4262q1;
        this.b = executor;
    }

    @Override // com.ironsource.InterfaceC4046e0
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(@NotNull J9 j9, @NotNull W1 w1) {
        ConcurrentHashMap concurrentHashMap;
        j9.getClass();
        w1.getClass();
        C4028d0 c4028d0 = new C4028d0(new Ac());
        InterfaceC4262q1 interfaceC4262q1 = this.a;
        concurrentHashMap = Td.a;
        return new RewardedAd(new Vd(j9, c4028d0, w1, interfaceC4262q1, null, null, null, null, concurrentHashMap, 240, null));
    }
}
