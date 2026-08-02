package com.ironsource;

import com.ironsource.InterfaceC4366i7;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import xsna.pn00;

/* renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4536s implements InterfaceC4366i7, InterfaceC4366i7.a {
    private final Map<IronSource.a, AtomicBoolean> a = pn00.k(new Pair(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), new Pair(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), new Pair(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC4366i7.a
    public void a(IronSource.a aVar, boolean z) {
        AtomicBoolean atomicBoolean = this.a.get(aVar);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC4366i7
    public boolean a(IronSource.a aVar) {
        AtomicBoolean atomicBoolean = this.a.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
