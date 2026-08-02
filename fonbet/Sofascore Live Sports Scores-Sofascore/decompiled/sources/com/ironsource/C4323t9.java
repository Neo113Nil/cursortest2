package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.t9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4323t9 implements InterfaceC4046e0<InterstitialAd> {

    @NotNull
    private final InterfaceC4262q1 a;

    @NotNull
    private final Executor b;

    public C4323t9(@NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull Executor executor) {
        interfaceC4262q1.getClass();
        executor.getClass();
        this.a = interfaceC4262q1;
        this.b = executor;
    }

    @Override // com.ironsource.InterfaceC4046e0
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(@NotNull J9 j9, @NotNull W1 w1) {
        ConcurrentHashMap concurrentHashMap;
        j9.getClass();
        w1.getClass();
        C4028d0 c4028d0 = new C4028d0(new Ac());
        InterfaceC4262q1 interfaceC4262q1 = this.a;
        concurrentHashMap = C4341u9.a;
        return new InterstitialAd(new C4359v9(j9, c4028d0, w1, interfaceC4262q1, null, null, null, null, concurrentHashMap, 240, null));
    }
}
