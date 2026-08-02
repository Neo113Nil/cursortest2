package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɩ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0271 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1068 m141(C0950 c0950, C1102 c1102) {
        try {
            c0950.f3161.add(this);
            C1068 mo74 = mo74(c0950, c1102);
            c0950.m565(this);
            return mo74;
        } catch (AbstractC0463 e) {
            throw e;
        } catch (Throwable th) {
            throw new C0240(c1102, c0950, StringFog.decrypt("NVTfwtjt0noVRdjZw6PQIgNSzNnPoNJsBAY=\n", "cCatrarNtwI=\n") + this + "\n" + th, th);
        }
    }

    /* renamed from: ﾒ */
    public int mo72() {
        return 1;
    }

    /* renamed from: ﾒ */
    public abstract C1068 mo74(C0950 c0950, C1102 c1102);

    /* renamed from: ﾒ */
    public int mo73(C0950 c0950) {
        return 1;
    }
}
