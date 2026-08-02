package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ppk {
    public final b4c a;
    public final zpk b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public long i = C.TIME_UNSET;
    public float k = 1.0f;
    public tqi l = tqi.a;

    public ppk(Context context, b4c b4cVar, long j) {
        this.a = b4cVar;
        this.c = j;
        this.b = new zpk(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x016e, code lost:
    
        if (r3 > 100000) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x017c, code lost:
    
        if (r33 >= r37) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0086, code lost:
    
        if ((r9 == 0 ? false : r7.h[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, h12 h12Var) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z4;
        float f;
        float f2;
        long j14;
        h12Var.a = C.TIME_UNSET;
        h12Var.b = C.TIME_UNSET;
        if (this.d && this.f == C.TIME_UNSET) {
            this.f = j2;
        }
        if (this.h != j) {
            zpk zpkVar = this.b;
            j5 = -9223372036854775807L;
            long j15 = zpkVar.n;
            if (j15 != -1) {
                zpkVar.q = j15;
                zpkVar.r = zpkVar.o;
                zpkVar.s = zpkVar.p;
                zpkVar.k = zpkVar.l;
            }
            zpkVar.m++;
            h68 h68Var = zpkVar.a;
            j6 = 1000;
            long j16 = j * 1000;
            ((g68) h68Var.d).b(j16);
            if (((g68) h68Var.d).a()) {
                h68Var.a = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (h68Var.b != C.TIME_UNSET) {
                    if (h68Var.a) {
                        g68 g68Var = (g68) h68Var.e;
                        long j17 = g68Var.e;
                    }
                    ((g68) h68Var.e).c();
                    ((g68) h68Var.e).b(h68Var.b);
                    h68Var.a = true;
                    ((g68) h68Var.e).b(j16);
                }
            }
            if (h68Var.a && ((g68) h68Var.e).a()) {
                g68 g68Var2 = (g68) h68Var.d;
                h68Var.d = (g68) h68Var.e;
                h68Var.e = g68Var2;
                h68Var.a = false;
            }
            h68Var.b = j16;
            h68Var.c = ((g68) h68Var.d).a() ? 0 : h68Var.c + 1;
            zpkVar.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long j18 = (long) ((j - j2) / this.k);
        if (this.d) {
            this.l.getClass();
            j18 -= nik.T(SystemClock.elapsedRealtime()) - j3;
        }
        h12Var.a = j18;
        if (!z || z2) {
            if (this.m) {
                if (this.i == j5 || this.j) {
                    int i5 = this.e;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i5 == 2) {
                            i = 3;
                            i2 = 5;
                        } else {
                            if (i5 != 3) {
                                zzl.s();
                                return 0;
                            }
                            this.l.getClass();
                            i = 3;
                            i2 = 5;
                            long T = nik.T(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j19 = this.f;
                                if (j19 != j5) {
                                    if (j19 != j2) {
                                        if (j18 < -30000) {
                                        }
                                    }
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.d;
                    }
                    if (!z3) {
                        return 0;
                    }
                    if (this.d && j2 != this.f) {
                        this.l.getClass();
                        long nanoTime = System.nanoTime();
                        zpk zpkVar2 = this.b;
                        long j20 = (h12Var.a * j6) + nanoTime;
                        if (zpkVar2.q != -1) {
                            if (((g68) zpkVar2.a.d).a()) {
                                h68 h68Var2 = zpkVar2.a;
                                if (((g68) h68Var2.d).a()) {
                                    g68 g68Var3 = (g68) h68Var2.d;
                                    i4 = 2;
                                    long j21 = g68Var3.f;
                                    i3 = 1;
                                    j14 = j21 == j7 ? j7 : g68Var3.g / j21;
                                } else {
                                    i3 = 1;
                                    i4 = 2;
                                    j14 = j5;
                                }
                                j8 = -30000;
                                f = (zpkVar2.m - zpkVar2.q) * j14;
                                f2 = zpkVar2.i;
                            } else {
                                i3 = 1;
                                i4 = 2;
                                j8 = -30000;
                                f = (j - zpkVar2.s) * j6;
                                f2 = zpkVar2.i;
                            }
                            long j22 = zpkVar2.r + ((long) (f / f2));
                            if (Math.abs(j20 - j22) <= 20000000) {
                                j20 = j22;
                            } else {
                                zpkVar2.b();
                            }
                        } else {
                            i3 = 1;
                            i4 = 2;
                            j8 = -30000;
                        }
                        zpkVar2.n = zpkVar2.m;
                        zpkVar2.o = j20;
                        zpkVar2.p = j;
                        vpk vpkVar = zpkVar2.c;
                        if (vpkVar != null) {
                            long j23 = vpkVar.d;
                            long j24 = zpkVar2.c.e;
                            if (j23 != j5 && j24 != j5) {
                                long j25 = (((j20 - j23) / j24) * j24) + j23;
                                if (j20 <= j25) {
                                    j9 = j25 - j24;
                                } else {
                                    j25 += j24;
                                    j9 = j25;
                                }
                                long j26 = j25 - j20;
                                long j27 = j20 - j9;
                                long abs = Math.abs(j26 - j27);
                                if (abs < j24 / 2) {
                                    j10 = j9;
                                    j12 = j24 / 4;
                                    if (abs < j12) {
                                        j11 = nanoTime;
                                        long j28 = zpkVar2.k;
                                        if (j28 != j7) {
                                            zpkVar2.l = j28;
                                            j12 = j28;
                                        } else {
                                            if (j26 < j27) {
                                                j12 = -j12;
                                            }
                                            zpkVar2.l = j12;
                                        }
                                    } else {
                                        j11 = nanoTime;
                                        j12 = j7;
                                        zpkVar2.l = j12;
                                    }
                                } else {
                                    j10 = j9;
                                    j11 = nanoTime;
                                    j12 = zpkVar2.k;
                                    zpkVar2.l = j12;
                                }
                                if (j26 + j12 >= j27) {
                                    j25 = j10;
                                }
                                j20 = j25 - ((j24 * 80) / 100);
                                h12Var.b = j20;
                                j13 = (j20 - j11) / j6;
                                h12Var.a = j13;
                                z4 = (this.i != j5 || this.j) ? 0 : i3;
                                if (!this.a.M0(j13, j2, z2, z4)) {
                                    return 4;
                                }
                                long j29 = h12Var.a;
                                if (j29 < j8 && !z2) {
                                    return z4 != 0 ? i : i4;
                                }
                                if (j29 <= 50000) {
                                    return i3;
                                }
                            }
                        }
                        j11 = nanoTime;
                        h12Var.b = j20;
                        j13 = (j20 - j11) / j6;
                        h12Var.a = j13;
                        if (this.i != j5) {
                        }
                        if (!this.a.M0(j13, j2, z2, z4)) {
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (!z3) {
                }
            } else {
                if (this.a.M0(j18, j2, z2, true)) {
                    return 4;
                }
                if (!this.d || h12Var.a >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    this.n = true;
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.n && !this.m))) {
            this.i = C.TIME_UNSET;
            return true;
        }
        if (this.i == C.TIME_UNSET) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = C.TIME_UNSET;
        return false;
    }

    public final void c(boolean z) {
        long j;
        this.j = z;
        long j2 = this.c;
        if (j2 > 0) {
            this.l.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = C.TIME_UNSET;
        }
        this.i = j;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = nik.T(SystemClock.elapsedRealtime());
        zpk zpkVar = this.b;
        zpkVar.d = true;
        zpkVar.b();
        DisplayManager displayManager = (DisplayManager) zpkVar.b.getSystemService(U3.i.d);
        vpk vpkVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                vpkVar = Build.VERSION.SDK_INT >= 33 ? new xpk(choreographer, displayManager) : new wpk(choreographer, displayManager, 0);
            } catch (RuntimeException e) {
                tgj.e0("Vsync sampling disabled due to platform error", e);
            }
        }
        zpkVar.c = vpkVar;
        if (vpkVar != null) {
            vpkVar.e();
        }
        zpkVar.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                zzl.s();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        zpk zpkVar = this.b;
        zpkVar.f = f;
        h68 h68Var = zpkVar.a;
        ((g68) h68Var.d).c();
        ((g68) h68Var.e).c();
        h68Var.a = false;
        h68Var.b = C.TIME_UNSET;
        h68Var.c = 0;
        zpkVar.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        zpk zpkVar = this.b;
        if (zpkVar.e != surface) {
            zpkVar.a();
            zpkVar.e = surface;
            zpkVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        z1a.s(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f == this.k) {
            return;
        }
        this.k = f;
        zpk zpkVar = this.b;
        zpkVar.i = f;
        zpkVar.d(false);
    }
}
