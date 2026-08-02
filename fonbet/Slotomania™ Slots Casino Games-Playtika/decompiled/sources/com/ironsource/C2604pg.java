package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.pg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2604pg {
    private final InterfaceC2592p4 a;

    public C2604pg(InterfaceC2592p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = currentTimeProvider;
    }

    public final boolean a(long j, long j2) {
        long a = this.a.a();
        return j2 <= 0 || j <= 0 || a < j || a - j > j2;
    }
}
