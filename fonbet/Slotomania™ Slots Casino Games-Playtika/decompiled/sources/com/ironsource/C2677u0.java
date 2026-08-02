package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2677u0 {
    private final AbstractC2606q0 a;
    private final LevelPlayAdInfo b;

    public C2677u0(AbstractC2606q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = levelPlayAdInfo;
    }

    public final AbstractC2606q0 a() {
        return this.a;
    }

    public final LevelPlayAdInfo b() {
        return this.b;
    }

    public final LevelPlayAdInfo c() {
        return this.b;
    }

    public final AbstractC2606q0 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2677u0)) {
            return false;
        }
        C2677u0 c2677u0 = (C2677u0) obj;
        return Intrinsics.areEqual(this.a, c2677u0.a) && Intrinsics.areEqual(this.b, c2677u0.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C2677u0(AbstractC2606q0 abstractC2606q0, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2606q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C2677u0 a(AbstractC2606q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C2677u0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C2677u0 a(C2677u0 c2677u0, AbstractC2606q0 abstractC2606q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC2606q0 = c2677u0.a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c2677u0.b;
        }
        return c2677u0.a(abstractC2606q0, levelPlayAdInfo);
    }
}
