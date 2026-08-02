package defpackage;

import android.text.TextUtils;
import androidx.media3.common.b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class osj {
    public final int a;
    public final String b;
    public final int c;
    public final b[] d;
    public int e;

    static {
        nik.N(0);
        nik.N(1);
    }

    public osj(String str, b... bVarArr) {
        z1a.s(bVarArr.length > 0);
        this.b = str;
        this.d = bVarArr;
        this.a = bVarArr.length;
        String str2 = bVarArr[0].o;
        this.c = TextUtils.isEmpty(str2) ? sjc.i(bVarArr[0].n) : sjc.i(str2);
        String str3 = bVarArr[0].d;
        str3 = (str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3;
        int i = bVarArr[0].f | 16384;
        for (int i2 = 1; i2 < bVarArr.length; i2++) {
            String str4 = bVarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str4)) {
                b(i2, "languages", bVarArr[0].d, bVarArr[i2].d);
                return;
            } else {
                if (i != (bVarArr[i2].f | 16384)) {
                    b(i2, "role flags", Integer.toBinaryString(bVarArr[0].f), Integer.toBinaryString(bVarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void b(int i, String str, String str2, String str3) {
        StringBuilder s = mz1.s("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        s.append(str3);
        s.append("' (track ");
        s.append(i);
        s.append(")");
        tgj.A("", new IllegalStateException(s.toString()));
    }

    public final int a(b bVar) {
        int i = 0;
        while (true) {
            b[] bVarArr = this.d;
            if (i >= bVarArr.length) {
                return -1;
            }
            if (bVar == bVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && osj.class == obj.getClass()) {
            osj osjVar = (osj) obj;
            if (this.b.equals(osjVar.b) && Arrays.equals(this.d, osjVar.d)) {
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
        int hashCode = Arrays.hashCode(this.d) + dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
        this.e = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
