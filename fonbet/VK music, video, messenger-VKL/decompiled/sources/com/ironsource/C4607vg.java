package com.ironsource;

/* renamed from: com.ironsource.vg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4607vg {
    private final InterfaceC4488p4 a;

    public C4607vg(InterfaceC4488p4 interfaceC4488p4) {
        this.a = interfaceC4488p4;
    }

    public final boolean a(long j, long j2) {
        long a = this.a.a();
        return j2 <= 0 || j <= 0 || a < j || a - j > j2;
    }
}
