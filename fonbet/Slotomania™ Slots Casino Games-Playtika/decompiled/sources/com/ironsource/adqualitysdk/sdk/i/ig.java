package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* loaded from: classes5.dex */
public final class ig {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private hx f2492;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ii f2493;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private e f2494;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m7971(int i, int i2) {
        return i >= i2;
    }

    /* synthetic */ ig(byte b) {
        this();
    }

    private ig() {
        this.f2494 = new e();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ii m7979() {
        return this.f2493;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final hx m7980() {
        return this.f2492;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m7975() {
        return this.f2494.f2505;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m7973() {
        return this.f2494.f2506;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m7976(int i) {
        return m7971(i, this.f2494.f2504);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m7977(int i) {
        if (m7971(i, this.f2494.f2502)) {
            return this.f2494.f2503;
        }
        return 0;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m7974(int i) {
        return m7971(i, this.f2494.f2501);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7981(int i) {
        return m7971(i, this.f2494.f2498);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m7983(int i) {
        return m7971(i, this.f2494.f2497);
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m7972(int i) {
        return m7971(i, this.f2494.f2500);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m7982() {
        return this.f2494.f2499;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final e m7978(Class cls) {
        this.f2494.f2509 = cls;
        return this.f2494;
    }

    static class e {

        /* renamed from: ﭖ, reason: contains not printable characters */
        private Object f2496;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private List<String> f2505;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private int f2506;

        /* renamed from: ｋ, reason: contains not printable characters */
        private Class f2507;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private Class f2508;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private Class f2509;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private int f2504 = -1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private int f2502 = -1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private int f2503 = -1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private int f2501 = -1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private int f2500 = Integer.MAX_VALUE;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private int f2498 = Integer.MAX_VALUE;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private int f2497 = Integer.MAX_VALUE;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private boolean f2499 = true;

        e() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f2506 != eVar.f2506 || this.f2504 != eVar.f2504 || this.f2502 != eVar.f2502 || this.f2503 != eVar.f2503 || this.f2501 != eVar.f2501 || this.f2500 != eVar.f2500 || this.f2498 != eVar.f2498 || this.f2497 != eVar.f2497 || this.f2499 != eVar.f2499) {
                    return false;
                }
                Class cls = this.f2509;
                if (cls == null ? eVar.f2509 != null : !cls.equals(eVar.f2509)) {
                    return false;
                }
                Class cls2 = this.f2508;
                if (cls2 == null ? eVar.f2508 != null : !cls2.equals(eVar.f2508)) {
                    return false;
                }
                Class cls3 = this.f2507;
                if (cls3 == null ? eVar.f2507 != null : !cls3.equals(eVar.f2507)) {
                    return false;
                }
                List<String> list = this.f2505;
                if (list == null ? eVar.f2505 != null : !list.equals(eVar.f2505)) {
                    return false;
                }
                Object obj2 = this.f2496;
                Object obj3 = eVar.f2496;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f2509;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f2508;
            int hashCode2 = (hashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f2507;
            int hashCode3 = (hashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f2505;
            int hashCode4 = (((((((((((((((((((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2506) * 31) + this.f2504) * 31) + this.f2502) * 31) + this.f2503) * 31) + this.f2501) * 31) + this.f2500) * 31) + this.f2498) * 31) + this.f2497) * 31) + (this.f2499 ? 1 : 0)) * 31;
            Object obj = this.f2496;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ig f2495 = new ig(0);

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final d m7997(int i) {
            this.f2495.f2494.f2504 = i;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final d m7989(int i) {
            this.f2495.f2494.f2502 = i;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final d m7991(int i) {
            this.f2495.f2494.f2503 = i;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final d m7994(int i) {
            this.f2495.f2494.f2501 = i;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final d m7987(int i) {
            this.f2495.f2494.f2498 = i;
            return this;
        }

        /* renamed from: ﱟ, reason: contains not printable characters */
        public final d m7984(int i) {
            this.f2495.f2494.f2500 = i;
            return this;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final d m7986(int i) {
            this.f2495.f2494.f2497 = i;
            return this;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        public final d m7985(boolean z) {
            this.f2495.f2494.f2499 = z;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final d m7992(Object obj) {
            this.f2495.f2494.f2496 = obj;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final ig m7999(ii iiVar, List<String> list, int i) {
            return m7996(iiVar, null, list, i);
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final ig m7996(ii iiVar, hx hxVar, List<String> list, int i) {
            this.f2495.f2493 = iiVar;
            this.f2495.f2492 = hxVar;
            this.f2495.f2494.f2505 = list;
            this.f2495.f2494.f2506 = i;
            this.f2495.f2494.f2508 = iiVar.getClass();
            this.f2495.f2494.f2507 = hxVar != null ? hxVar.getClass() : null;
            return this.f2495;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final d m7993(boolean z) {
            this.f2495.f2494.f2502 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final d m7995(boolean z) {
            this.f2495.f2494.f2501 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final d m7990(boolean z) {
            this.f2495.f2494.f2498 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final d m7988(boolean z) {
            this.f2495.f2494.f2500 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final d m7998(boolean z) {
            this.f2495.f2494.f2497 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }
}
