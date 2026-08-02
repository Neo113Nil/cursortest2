package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2440gd extends AbstractC2555n3 {
    private String e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2440gd(int i, String placementName, boolean z, String rewardName, int i2, C2458hd c2458hd) {
        super(i, placementName, z, c2458hd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f = i2;
        this.e = rewardName;
    }

    public final int e() {
        return this.f;
    }

    public final String f() {
        return this.e;
    }

    @Override // com.ironsource.AbstractC2555n3
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2440gd(AbstractC2555n3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.e = "";
    }
}
