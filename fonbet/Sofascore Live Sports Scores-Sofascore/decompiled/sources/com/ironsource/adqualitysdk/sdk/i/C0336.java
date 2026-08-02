package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˮ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0336 extends AbstractC0271 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0337 f826;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0981 f827;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0981 f828;

    public C0336(C0981 c0981, C0981 c09812, C0337 c0337) {
        this.f828 = c0981;
        this.f827 = c09812;
        this.f826 = c0337;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0336 c0336 = (C0336) obj;
        C0981 c0981 = this.f828;
        if (c0981 == null ? c0336.f828 != null : !c0981.equals(c0336.f828)) {
            return false;
        }
        C0981 c09812 = this.f827;
        if (c09812 == null ? c0336.f827 != null : !c09812.equals(c0336.f827)) {
            return false;
        }
        C0337 c0337 = this.f826;
        return c0337 != null ? c0337.equals(c0336.f826) : c0336.f826 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final int hashCode() {
        C0981 c0981 = this.f828;
        int hashCode = (c0981 != null ? Arrays.hashCode(c0981.f3211) : 0) * 31;
        C0981 c09812 = this.f827;
        int hashCode2 = (hashCode + (c09812 != null ? Arrays.hashCode(c09812.f3211) : 0)) * 31;
        C0337 c0337 = this.f826;
        return hashCode2 + (c0337 != null ? c0337.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("3y2okw==\n", "q1/RsyasbCo=\n") + this.f828 + StringFog.decrypt("+nsi9hrRH+U=\n", "2hhDgnm5P80=\n") + this.f826 + StringFog.decrypt("jo8=\n", "p6/qfh4mUDo=\n") + this.f827;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final C1068 mo74(C0950 c0950, C1102 c1102) {
        try {
            C0981 c0981 = this.f828;
            if (c0981 != null) {
                return c0981.m141(new C0950(new HashMap(), c0950, false), c1102);
            }
        } catch (Throwable th) {
            if (this.f827 != null) {
                c0950.f3160.add(this);
                HashMap hashMap = new HashMap();
                C0337 c0337 = this.f826;
                if (c0337 != null) {
                    hashMap.put(AbstractC1088.m645(c0337.f829), th);
                }
                return this.f827.m141(new C0950(hashMap, c0950, false), c1102);
            }
        }
        return new C1068(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo72() {
        return (this.f827.mo72() + this.f828.mo72()) - 1;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo73(C0950 c0950) {
        if (c0950.f3160.contains(this)) {
            return this.f828.mo72() - 1;
        }
        return 0;
    }
}
