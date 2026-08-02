package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class V3 {

    /* renamed from: c, reason: collision with root package name */
    public static final V3 f33699c = new V3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f33700a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33701b;

    public V3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(U3.class);
        this.f33700a = enumMap;
        enumMap.put((EnumMap) U3.AD_STORAGE, (U3) h(null));
        enumMap.put((EnumMap) U3.ANALYTICS_STORAGE, (U3) h(null));
        this.f33701b = i10;
    }

    public static V3 a(S3 s32, S3 s33, int i10) {
        EnumMap enumMap = new EnumMap(U3.class);
        enumMap.put((EnumMap) U3.AD_STORAGE, (U3) s32);
        enumMap.put((EnumMap) U3.ANALYTICS_STORAGE, (U3) s33);
        return new V3(enumMap, -10);
    }

    public static String d(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static V3 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new V3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(U3.class);
        for (U3 u32 : T3.STORAGE.b()) {
            enumMap.put((EnumMap) u32, (U3) g(bundle.getString(u32.f33682a)));
        }
        return new V3(enumMap, i10);
    }

    public static V3 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(U3.class);
        U3[] a10 = T3.STORAGE.a();
        for (int i11 = 0; i11 < a10.length; i11++) {
            String str2 = str == null ? "" : str;
            U3 u32 = a10[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) u32, (U3) j(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) u32, (U3) S3.UNINITIALIZED);
            }
        }
        return new V3(enumMap, i10);
    }

    public static S3 g(String str) {
        return str == null ? S3.UNINITIALIZED : str.equals("granted") ? S3.GRANTED : str.equals("denied") ? S3.DENIED : S3.UNINITIALIZED;
    }

    public static S3 h(Boolean bool) {
        return bool == null ? S3.UNINITIALIZED : bool.booleanValue() ? S3.GRANTED : S3.DENIED;
    }

    public static String i(S3 s32) {
        int ordinal = s32.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public static S3 j(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? S3.UNINITIALIZED : S3.GRANTED : S3.DENIED : S3.POLICY;
    }

    public static char m(S3 s32) {
        if (s32 == null) {
            return '-';
        }
        int ordinal = s32.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.f33701b;
    }

    public final boolean c() {
        Iterator it = this.f33700a.values().iterator();
        while (it.hasNext()) {
            if (((S3) it.next()) != S3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof V3)) {
            return false;
        }
        V3 v32 = (V3) obj;
        for (U3 u32 : T3.STORAGE.b()) {
            if (this.f33700a.get(u32) != v32.f33700a.get(u32)) {
                return false;
            }
        }
        return this.f33701b == v32.f33701b;
    }

    public final int hashCode() {
        Iterator it = this.f33700a.values().iterator();
        int i10 = this.f33701b * 17;
        while (it.hasNext()) {
            i10 = (i10 * 31) + ((S3) it.next()).hashCode();
        }
        return i10;
    }

    public final String k() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (U3 u32 : T3.STORAGE.a()) {
            S3 s32 = (S3) this.f33700a.get(u32);
            char c10 = '-';
            if (s32 != null && (ordinal = s32.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (U3 u32 : T3.STORAGE.a()) {
            sb2.append(m((S3) this.f33700a.get(u32)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f33700a.entrySet()) {
            String i10 = i((S3) entry.getValue());
            if (i10 != null) {
                bundle.putString(((U3) entry.getKey()).f33682a, i10);
            }
        }
        return bundle;
    }

    public final boolean o(U3 u32) {
        return ((S3) this.f33700a.get(u32)) != S3.DENIED;
    }

    public final S3 p() {
        S3 s32 = (S3) this.f33700a.get(U3.AD_STORAGE);
        return s32 == null ? S3.UNINITIALIZED : s32;
    }

    public final S3 q() {
        S3 s32 = (S3) this.f33700a.get(U3.ANALYTICS_STORAGE);
        return s32 == null ? S3.UNINITIALIZED : s32;
    }

    public final boolean r(V3 v32) {
        EnumMap enumMap = this.f33700a;
        for (U3 u32 : (U3[]) enumMap.keySet().toArray(new U3[0])) {
            S3 s32 = (S3) enumMap.get(u32);
            S3 s33 = (S3) v32.f33700a.get(u32);
            S3 s34 = S3.DENIED;
            if (s32 == s34 && s33 != s34) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V3 s(V3 v32) {
        EnumMap enumMap = new EnumMap(U3.class);
        for (U3 u32 : T3.STORAGE.b()) {
            S3 s32 = (S3) this.f33700a.get(u32);
            S3 s33 = (S3) v32.f33700a.get(u32);
            if (s32 != null) {
                if (s33 != null) {
                    S3 s34 = S3.UNINITIALIZED;
                    if (s32 != s34) {
                        if (s33 != s34) {
                            S3 s35 = S3.POLICY;
                            if (s32 != s35) {
                                if (s33 != s35) {
                                    S3 s36 = S3.DENIED;
                                    s32 = (s32 == s36 || s33 == s36) ? s36 : S3.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (s32 == null) {
                    enumMap.put((EnumMap) u32, (U3) s32);
                }
            }
            s32 = s33;
            if (s32 == null) {
            }
        }
        return new V3(enumMap, 100);
    }

    public final V3 t(V3 v32) {
        EnumMap enumMap = new EnumMap(U3.class);
        for (U3 u32 : T3.STORAGE.b()) {
            S3 s32 = (S3) this.f33700a.get(u32);
            if (s32 == S3.UNINITIALIZED) {
                s32 = (S3) v32.f33700a.get(u32);
            }
            if (s32 != null) {
                enumMap.put((EnumMap) u32, (U3) s32);
            }
        }
        return new V3(enumMap, this.f33701b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f33701b));
        for (U3 u32 : T3.STORAGE.b()) {
            sb2.append(",");
            sb2.append(u32.f33682a);
            sb2.append("=");
            S3 s32 = (S3) this.f33700a.get(u32);
            if (s32 == null) {
                s32 = S3.UNINITIALIZED;
            }
            sb2.append(s32);
        }
        return sb2.toString();
    }

    public V3(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(U3.class);
        this.f33700a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f33701b = i10;
    }
}
