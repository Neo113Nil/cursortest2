package com.ironsource;

import com.ironsource.InterfaceC2452h7;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2640s implements InterfaceC2452h7, InterfaceC2452h7.a {
    private final Map<IronSource.a, AtomicBoolean> a = MapsKt.mapOf(TuplesKt.to(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), TuplesKt.to(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), TuplesKt.to(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC2452h7.a
    public void a(IronSource.a adFormat, boolean z) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC2452h7
    public boolean a(IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
