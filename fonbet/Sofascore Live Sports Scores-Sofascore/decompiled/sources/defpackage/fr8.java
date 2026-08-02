package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fr8 extends kn8 {
    public static final gc2 c;
    public final x52 b;

    static {
        gc2 gc2Var = gc2.d;
        c = q1f.m("0021F904");
    }

    public fr8(l62 l62Var) {
        super(l62Var);
        this.b = new x52();
    }

    public final boolean f(long j) {
        x52 x52Var = this.b;
        long j2 = x52Var.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.read(x52Var, j3) == j3;
    }

    @Override // defpackage.kn8, defpackage.cwh
    public final long read(x52 x52Var, long j) {
        long j2;
        long j3;
        f(j);
        x52 x52Var2 = this.b;
        long j4 = 0;
        if (x52Var2.b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long j6 = -1;
            while (true) {
                gc2 gc2Var = c;
                j2 = j4;
                j6 = x52Var2.C(gc2Var.a[0], j6 + 1, Long.MAX_VALUE);
                if (j6 == -1 || (f(gc2Var.a.length) && x52Var2.g0(j6, gc2Var, gc2Var.h()))) {
                    break;
                }
                j4 = j2;
            }
            if (j6 == -1) {
                break;
            }
            long read = x52Var2.read(x52Var, j6 + 4);
            if (read < j2) {
                read = j2;
            }
            j5 += read;
            if (f(5L) && x52Var2.t(4L) == 0) {
                byte t = x52Var2.t(2L);
                o7k o7kVar = p7k.b;
                if ((((t & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (x52Var2.t(1L) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) < 2) {
                    x52Var.Y0(x52Var2.t(j2));
                    x52Var.Y0(10);
                    x52Var.Y0(0);
                    x52Var2.skip(3L);
                }
            }
            j4 = 0;
        }
        if (j5 < j) {
            long read2 = x52Var2.read(x52Var, j - j5);
            j3 = 0;
            if (read2 < 0) {
                read2 = 0;
            }
            j5 += read2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
