package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ou0 extends pib {
    public final long a;
    public final Integer b;
    public final hb3 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final x9d h;
    public final si6 i;

    public ou0(long j, Integer num, hb3 hb3Var, long j2, byte[] bArr, String str, long j3, x9d x9dVar, si6 si6Var) {
        this.a = j;
        this.b = num;
        this.c = hb3Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = x9dVar;
        this.i = si6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pib) {
            pib pibVar = (pib) obj;
            ou0 ou0Var = (ou0) pibVar;
            if (this.a == ou0Var.a) {
                Integer num = ou0Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    hb3 hb3Var = ou0Var.c;
                    hb3 hb3Var2 = this.c;
                    if (hb3Var2 != null ? hb3Var2.equals(hb3Var) : hb3Var == null) {
                        if (this.d == ou0Var.d) {
                            if (Arrays.equals(this.e, pibVar instanceof ou0 ? ((ou0) pibVar).e : ou0Var.e)) {
                                String str = ou0Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == ou0Var.g) {
                                        x9d x9dVar = ou0Var.h;
                                        x9d x9dVar2 = this.h;
                                        if (x9dVar2 != null ? x9dVar2.equals(x9dVar) : x9dVar == null) {
                                            si6 si6Var = ou0Var.i;
                                            si6 si6Var2 = this.i;
                                            if (si6Var2 != null ? si6Var2.equals(si6Var) : si6Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        hb3 hb3Var = this.c;
        int hashCode2 = (hashCode ^ (hb3Var == null ? 0 : hb3Var.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        x9d x9dVar = this.h;
        int hashCode5 = (i2 ^ (x9dVar == null ? 0 : x9dVar.hashCode())) * 1000003;
        si6 si6Var = this.i;
        return hashCode5 ^ (si6Var != null ? si6Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
