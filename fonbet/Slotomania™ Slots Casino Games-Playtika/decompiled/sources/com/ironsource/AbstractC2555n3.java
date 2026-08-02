package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2555n3 {
    private final int a;
    private final String b;
    private final boolean c;
    private final C2458hd d;

    public AbstractC2555n3(int i, String placementName, boolean z, C2458hd c2458hd) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = i;
        this.b = placementName;
        this.c = z;
        this.d = c2458hd;
    }

    public final C2458hd a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public String toString() {
        return "placement name: " + this.b;
    }

    public final boolean a(int i) {
        return this.a == i;
    }

    public /* synthetic */ AbstractC2555n3(int i, String str, boolean z, C2458hd c2458hd, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c2458hd);
    }
}
