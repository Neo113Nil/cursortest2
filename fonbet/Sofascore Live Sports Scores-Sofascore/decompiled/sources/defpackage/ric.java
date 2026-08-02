package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ric {
    public final lic[] a;
    public final long b;

    public ric(List list) {
        this((lic[]) list.toArray(new lic[0]));
    }

    public final ric a(lic... licVarArr) {
        if (licVarArr.length == 0) {
            return this;
        }
        String str = nik.a;
        lic[] licVarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(licVarArr2, licVarArr2.length + licVarArr.length);
        System.arraycopy(licVarArr, 0, copyOf, licVarArr2.length, licVarArr.length);
        return new ric(this.b, (lic[]) copyOf);
    }

    public final ric b(ric ricVar) {
        return ricVar == null ? this : a(ricVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ric.class == obj.getClass()) {
            ric ricVar = (ric) obj;
            if (Arrays.equals(this.a, ricVar.a) && this.b == ricVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return jaa.F(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public ric(long j, lic... licVarArr) {
        this.b = j;
        this.a = licVarArr;
    }

    public ric(lic... licVarArr) {
        this(C.TIME_UNSET, licVarArr);
    }
}
