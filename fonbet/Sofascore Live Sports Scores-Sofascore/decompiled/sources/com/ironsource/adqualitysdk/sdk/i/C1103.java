package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1103 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C0499 f3467;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f3476;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public List f3477;

    /* renamed from: ｋ, reason: contains not printable characters */
    public Class f3478;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public Class f3479;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Class f3480;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public int f3475 = -1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public int f3474 = -1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public int f3473 = -1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public int f3472 = -1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public int f3471 = Integer.MAX_VALUE;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public int f3470 = Integer.MAX_VALUE;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public int f3469 = Integer.MAX_VALUE;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public boolean f3468 = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1103.class == obj.getClass()) {
            C1103 c1103 = (C1103) obj;
            if (this.f3476 != c1103.f3476 || this.f3475 != c1103.f3475 || this.f3474 != c1103.f3474 || this.f3473 != c1103.f3473 || this.f3472 != c1103.f3472 || this.f3471 != c1103.f3471 || this.f3470 != c1103.f3470 || this.f3469 != c1103.f3469 || this.f3468 != c1103.f3468) {
                return false;
            }
            Class cls = this.f3480;
            Class cls2 = c1103.f3480;
            if (cls == null ? cls2 != null : !cls.equals(cls2)) {
                return false;
            }
            Class cls3 = this.f3479;
            Class cls4 = c1103.f3479;
            if (cls3 == null ? cls4 != null : !cls3.equals(cls4)) {
                return false;
            }
            Class cls5 = this.f3478;
            Class cls6 = c1103.f3478;
            if (cls5 == null ? cls6 != null : !cls5.equals(cls6)) {
                return false;
            }
            List list = this.f3477;
            List list2 = c1103.f3477;
            if (list == null ? list2 != null : !list.equals(list2)) {
                return false;
            }
            C0499 c0499 = this.f3467;
            C0499 c04992 = c1103.f3467;
            if (c0499 != null) {
                return c0499 == c04992;
            }
            if (c04992 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Class cls = this.f3480;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        Class cls2 = this.f3479;
        int hashCode2 = (hashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
        Class cls3 = this.f3478;
        int hashCode3 = (hashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
        List list = this.f3477;
        int hashCode4 = (((((((((((((((((((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f3476) * 31) + this.f3475) * 31) + this.f3474) * 31) + this.f3473) * 31) + this.f3472) * 31) + this.f3471) * 31) + this.f3470) * 31) + this.f3469) * 31) + (this.f3468 ? 1 : 0)) * 31;
        C0499 c0499 = this.f3467;
        return hashCode4 + (c0499 != null ? c0499.hashCode() : 0);
    }
}
