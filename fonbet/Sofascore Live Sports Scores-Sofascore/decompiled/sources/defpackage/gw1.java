package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gw1 {
    public final /* synthetic */ int a = 2;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public gw1(int i, Object obj, Object obj2, String str) {
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        bwo.e.a.a.add(this);
    }

    public static int c(ml6 ml6Var, long j, b78 b78Var) {
        if (j == ml6Var.getPosition()) {
            return 0;
        }
        b78Var.a = j;
        return 1;
    }

    public static int d(nl6 nl6Var, long j, b78 b78Var) {
        if (j == nl6Var.getPosition()) {
            return 0;
        }
        b78Var.a = j;
        return 1;
    }

    public static kwo j(int i, int i2, String str) {
        return new kwo(1, str, Integer.valueOf(i), Integer.valueOf(i2), 1);
    }

    public static kwo k(long j, long j2, String str) {
        return new kwo(1, str, Long.valueOf(j), Long.valueOf(j2), 2);
    }

    public static void l(String str, float f, float f2) {
        new kwo(1, str, Float.valueOf(f), Float.valueOf(f2), 3);
    }

    public static void m() {
        bwo.e.a.b.add(new kwo(1, "gads:sdk_core_constants:experiment_id", null, null, 4));
    }

    public static void n() {
        bwo.e.a.c.add(new kwo(1, "gads:sdk_core_constants_service:experiment_id", null, null, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        return c(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(ml6 ml6Var, b78 b78Var) {
        ew1 ew1Var = (ew1) this.d;
        while (true) {
            aw1 aw1Var = (aw1) this.e;
            qx9.u(aw1Var);
            long j = aw1Var.f;
            long j2 = aw1Var.g;
            long j3 = aw1Var.h;
            if (j2 - j <= this.b) {
                this.e = null;
                ew1Var.e();
                return c(ml6Var, j, b78Var);
            }
            long position = j3 - ml6Var.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            ml6Var.skipFully((int) position);
            ml6Var.resetPeekPosition();
            dw1 j4 = ew1Var.j(ml6Var, aw1Var.b);
            int i = j4.b;
            long j5 = j4.c;
            long j6 = j4.d;
            if (i == -3) {
                this.e = null;
                ew1Var.e();
                return c(ml6Var, j3, b78Var);
            }
            if (i == -2) {
                aw1Var.d = j5;
                aw1Var.f = j6;
                aw1Var.h = aw1.a(aw1Var.b, j5, aw1Var.e, j6, aw1Var.g, aw1Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        a70.r("Invalid case");
                        return 0;
                    }
                    long position2 = j6 - ml6Var.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        ml6Var.skipFully((int) position2);
                    }
                    this.e = null;
                    ew1Var.e();
                    return c(ml6Var, j6, b78Var);
                }
                aw1Var.e = j5;
                aw1Var.g = j6;
                aw1Var.h = aw1.a(aw1Var.b, aw1Var.d, j5, aw1Var.f, j6, aw1Var.c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        return d(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(nl6 nl6Var, b78 b78Var) {
        fw1 fw1Var = (fw1) this.d;
        while (true) {
            aw1 aw1Var = (aw1) this.e;
            aw1Var.getClass();
            long j = aw1Var.f;
            long j2 = aw1Var.g;
            long j3 = aw1Var.h;
            if (j2 - j <= this.b) {
                this.e = null;
                fw1Var.e();
                return d(nl6Var, j, b78Var);
            }
            long position = j3 - nl6Var.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            nl6Var.skipFully((int) position);
            nl6Var.resetPeekPosition();
            dw1 a = fw1Var.a(nl6Var, aw1Var.b);
            int i = a.b;
            long j4 = a.c;
            long j5 = a.d;
            if (i == -3) {
                this.e = null;
                fw1Var.e();
                return d(nl6Var, j3, b78Var);
            }
            if (i == -2) {
                aw1Var.d = j4;
                aw1Var.f = j5;
                aw1Var.h = aw1.b(aw1Var.b, j4, aw1Var.e, j5, aw1Var.g, aw1Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        a70.r("Invalid case");
                        return 0;
                    }
                    long position2 = j5 - nl6Var.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        nl6Var.skipFully((int) position2);
                    }
                    this.e = null;
                    fw1Var.e();
                    return d(nl6Var, j5, b78Var);
                }
                aw1Var.e = j4;
                aw1Var.g = j5;
                aw1Var.h = aw1.b(aw1Var.b, aw1Var.d, j4, aw1Var.f, j5, aw1Var.c);
            }
        }
    }

    public void e(long j) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                aw1 aw1Var = (aw1) this.e;
                if (aw1Var == null || aw1Var.a != j) {
                    yv1 yv1Var = (yv1) obj;
                    this.e = new aw1(j, yv1Var.a.a(j), yv1Var.c, yv1Var.d, yv1Var.e, yv1Var.f, 0);
                    break;
                }
                break;
            default:
                aw1 aw1Var2 = (aw1) this.e;
                if (aw1Var2 == null || aw1Var2.a != j) {
                    zv1 zv1Var = (zv1) obj;
                    this.e = new aw1(j, zv1Var.a.a(j), zv1Var.c, zv1Var.d, zv1Var.e, zv1Var.f, 1);
                    break;
                }
                break;
        }
    }

    public abstract Object f(Bundle bundle);

    public abstract Object g(JSONObject jSONObject);

    public abstract Object h(SharedPreferences sharedPreferences);

    public Object i() {
        return bwo.e.c.i ? this.e : this.d;
    }

    public gw1(bw1 bw1Var, ew1 ew1Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = ew1Var;
        this.b = i;
        this.c = new yv1(bw1Var, j, j2, j3, j4, j5);
    }

    public gw1(cw1 cw1Var, fw1 fw1Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = fw1Var;
        this.b = i;
        this.c = new zv1(cw1Var, j, j2, j3, j4, j5);
    }
}
