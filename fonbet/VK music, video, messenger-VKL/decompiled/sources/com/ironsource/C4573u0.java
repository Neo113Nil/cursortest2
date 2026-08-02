package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.epx;
import xsna.zcl;

/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4573u0 {
    private final AbstractC4502q0 a;
    private final LevelPlayAdInfo b;

    public C4573u0(AbstractC4502q0 abstractC4502q0, LevelPlayAdInfo levelPlayAdInfo) {
        this.a = abstractC4502q0;
        this.b = levelPlayAdInfo;
    }

    public final AbstractC4502q0 a() {
        return this.a;
    }

    public final LevelPlayAdInfo b() {
        return this.b;
    }

    public final LevelPlayAdInfo c() {
        return this.b;
    }

    public final AbstractC4502q0 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4573u0)) {
            return false;
        }
        C4573u0 c4573u0 = (C4573u0) obj;
        return epx.f(this.a, c4573u0.a) && epx.f(this.b, c4573u0.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C4573u0(AbstractC4502q0 abstractC4502q0, LevelPlayAdInfo levelPlayAdInfo, int i, zcl zclVar) {
        this(abstractC4502q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C4573u0 a(AbstractC4502q0 abstractC4502q0, LevelPlayAdInfo levelPlayAdInfo) {
        return new C4573u0(abstractC4502q0, levelPlayAdInfo);
    }

    public static /* synthetic */ C4573u0 a(C4573u0 c4573u0, AbstractC4502q0 abstractC4502q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC4502q0 = c4573u0.a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c4573u0.b;
        }
        return c4573u0.a(abstractC4502q0, levelPlayAdInfo);
    }
}
