package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nsj implements i72 {
    public static final ogj f = new ogj(4);
    public final int a;
    public final String b;
    public final int c;
    public final sm8[] d;
    public int e;

    public nsj(String str, sm8... sm8VarArr) {
        qx9.r(sm8VarArr.length > 0);
        this.b = str;
        this.d = sm8VarArr;
        this.a = sm8VarArr.length;
        int f2 = rjc.f(sm8VarArr[0].l);
        this.c = f2 == -1 ? rjc.f(sm8VarArr[0].k) : f2;
        String str2 = sm8VarArr[0].c;
        str2 = (str2 == null || str2.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str2;
        int i = sm8VarArr[0].e | 16384;
        for (int i2 = 1; i2 < sm8VarArr.length; i2++) {
            String str3 = sm8VarArr[i2].c;
            if (!str2.equals((str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3)) {
                a(i2, "languages", sm8VarArr[0].c, sm8VarArr[i2].c);
                return;
            } else {
                if (i != (sm8VarArr[i2].e | 16384)) {
                    a(i2, "role flags", Integer.toBinaryString(sm8VarArr[0].e), Integer.toBinaryString(sm8VarArr[i2].e));
                    return;
                }
            }
        }
    }

    public static void a(int i, String str, String str2, String str3) {
        StringBuilder s = mz1.s("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        s.append(str3);
        s.append("' (track ");
        s.append(i);
        s.append(")");
        m6k.C("", new IllegalStateException(s.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nsj.class == obj.getClass()) {
            nsj nsjVar = (nsj) obj;
            if (this.b.equals(nsjVar.b) && Arrays.equals(this.d, nsjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int c = dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b) + Arrays.hashCode(this.d);
        this.e = c;
        return c;
    }
}
