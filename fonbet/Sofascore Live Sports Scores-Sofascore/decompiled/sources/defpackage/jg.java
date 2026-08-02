package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jg implements i72 {
    public static final jg f = new jg(new gg[0], 0, C.TIME_UNSET, 0);
    public static final gg g;
    public static final hc5 h;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final gg[] e;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, C.TIME_UNSET);
        g = new gg(0L, 0, -1, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0L, false);
        h = new hc5(23);
    }

    public jg(gg[] ggVarArr, long j, long j2, int i) {
        this.b = j;
        this.c = j2;
        this.a = ggVarArr.length + i;
        this.e = ggVarArr;
        this.d = i;
    }

    public final gg a(int i) {
        int i2 = this.d;
        return i < i2 ? g : this.e[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jg.class != obj.getClass()) {
            return false;
        }
        jg jgVar = (jg) obj;
        int i = lik.a;
        return this.a == jgVar.a && this.b == jgVar.b && this.c == jgVar.c && this.d == jgVar.d && Arrays.equals(this.e, jgVar.e);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            gg[] ggVarArr = this.e;
            if (i >= ggVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(ggVarArr[i].a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < ggVarArr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = ggVarArr[i].e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(ggVarArr[i].f[i2]);
                sb.append(')');
                if (i2 < ggVarArr[i].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < ggVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
