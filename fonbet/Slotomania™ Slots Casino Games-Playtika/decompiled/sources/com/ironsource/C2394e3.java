package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2394e3 extends AbstractC2555n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2394e3(int i, String placementName, boolean z, C2458hd c2458hd) {
        super(i, placementName, z, c2458hd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC2555n3
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
