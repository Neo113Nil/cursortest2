package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class P3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12723b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12724c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12725d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f12726e;

    public P3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f12722a = str;
        this.f12723b = str2;
        this.f12724c = num;
        this.f12725d = str3;
        this.f12726e = counterConfigurationReporterType;
    }

    public static P3 a(H3 h32) {
        return new P3(h32.f12301b.getApiKey(), h32.f12300a.f12060a.getAsString("PROCESS_CFG_PACKAGE_NAME"), h32.f12300a.f12060a.getAsInteger("PROCESS_CFG_PROCESS_ID"), h32.f12300a.f12060a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), h32.f12301b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P3.class == obj.getClass()) {
            P3 p32 = (P3) obj;
            String str = this.f12722a;
            if (str == null ? p32.f12722a != null : !str.equals(p32.f12722a)) {
                return false;
            }
            if (!this.f12723b.equals(p32.f12723b)) {
                return false;
            }
            Integer num = this.f12724c;
            if (num == null ? p32.f12724c != null : !num.equals(p32.f12724c)) {
                return false;
            }
            String str2 = this.f12725d;
            if (str2 == null ? p32.f12725d != null : !str2.equals(p32.f12725d)) {
                return false;
            }
            if (this.f12726e == p32.f12726e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12722a;
        int j = r4.k.j((str != null ? str.hashCode() : 0) * 31, 31, this.f12723b);
        Integer num = this.f12724c;
        int hashCode = (j + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f12725d;
        return this.f12726e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f12722a + "', mPackageName='" + this.f12723b + "', mProcessID=" + this.f12724c + ", mProcessSessionID='" + this.f12725d + "', mReporterType=" + this.f12726e + '}';
    }
}
