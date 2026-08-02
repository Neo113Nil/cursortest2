package com.ironsource;

import com.ironsource.InterfaceC4053e7;
import com.ironsource.mediationsdk.IronSource;
import defpackage.tub;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4295s implements InterfaceC4053e7, InterfaceC4053e7.a {

    @NotNull
    private final Map<IronSource.a, AtomicBoolean> a = tub.h(new Pair(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), new Pair(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), new Pair(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC4053e7
    public boolean a(@NotNull IronSource.a aVar) {
        aVar.getClass();
        AtomicBoolean atomicBoolean = this.a.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4053e7.a
    public void a(@NotNull IronSource.a aVar, boolean z) {
        aVar.getClass();
        AtomicBoolean atomicBoolean = this.a.get(aVar);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }
}
