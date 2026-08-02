package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.ahn;
import xsna.dvf;
import xsna.fxc0;
import xsna.nms0;
import xsna.vmr;
import xsna.y2r0;

/* compiled from: VideoFrameReleaseControl.java */
/* loaded from: classes12.dex */
public final class e {
    public final c a;
    public final nms0 b;
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
    public dvf l = dvf.a;

    /* compiled from: VideoFrameReleaseControl.java */
    public static class a {
        public long a = C.TIME_UNSET;
        public long b = C.TIME_UNSET;
    }

    public e(Context context, c cVar, long j) {
        this.a = cVar;
        this.c = j;
        this.b = new nms0(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0154, code lost:
    
        if (r3 > 100000) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0164, code lost:
    
        if (r33 >= r37) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0080, code lost:
    
        if ((r9 == 0 ? false : r7.g[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, a aVar) throws ExoPlaybackException {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        int i3;
        long j8;
        int i4;
        long j9;
        long j10;
        long j11;
        float f;
        float f2;
        long j12;
        aVar.a = C.TIME_UNSET;
        aVar.b = C.TIME_UNSET;
        if (this.d && this.f == C.TIME_UNSET) {
            this.f = j2;
        }
        if (this.h != j) {
            nms0 nms0Var = this.b;
            j5 = -9223372036854775807L;
            long j13 = nms0Var.n;
            if (j13 != -1) {
                nms0Var.q = j13;
                nms0Var.r = nms0Var.o;
                nms0Var.s = nms0Var.p;
                nms0Var.k = nms0Var.l;
            }
            nms0Var.m++;
            vmr vmrVar = nms0Var.a;
            j6 = 1000;
            long j14 = j * 1000;
            vmrVar.a.b(j14);
            if (vmrVar.a.a()) {
                vmrVar.c = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (vmrVar.d != C.TIME_UNSET) {
                    if (vmrVar.c) {
                        vmr.a aVar2 = vmrVar.b;
                        long j15 = aVar2.d;
                    }
                    vmrVar.b.c();
                    vmrVar.b.b(vmrVar.d);
                    vmrVar.c = true;
                    vmrVar.b.b(j14);
                }
            }
            if (vmrVar.c && vmrVar.b.a()) {
                vmr.a aVar3 = vmrVar.a;
                vmrVar.a = vmrVar.b;
                vmrVar.b = aVar3;
                vmrVar.c = false;
            }
            vmrVar.d = j14;
            vmrVar.e = vmrVar.a.a() ? 0 : vmrVar.e + 1;
            nms0Var.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long j16 = (long) ((j - j2) / this.k);
        if (this.d) {
            j16 -= y2r0.S(this.l.elapsedRealtime()) - j3;
        }
        aVar.a = j16;
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
                                throw new IllegalStateException();
                            }
                            i = 3;
                            i2 = 5;
                            long S = y2r0.S(this.l.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j17 = this.f;
                                if (j17 != j5) {
                                    if (j17 != j2) {
                                        if (j16 < -30000) {
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
                        long a2 = this.l.a();
                        nms0 nms0Var2 = this.b;
                        long j18 = (aVar.a * j6) + a2;
                        if (nms0Var2.q != -1) {
                            if (nms0Var2.a.a.a()) {
                                vmr vmrVar2 = nms0Var2.a;
                                if (vmrVar2.a.a()) {
                                    vmr.a aVar4 = vmrVar2.a;
                                    j8 = -30000;
                                    long j19 = aVar4.e;
                                    i3 = 1;
                                    j12 = j19 == j7 ? j7 : aVar4.f / j19;
                                } else {
                                    i3 = 1;
                                    j8 = -30000;
                                    j12 = j5;
                                }
                                i4 = 2;
                                f = (nms0Var2.m - nms0Var2.q) * j12;
                                f2 = nms0Var2.i;
                            } else {
                                i3 = 1;
                                j8 = -30000;
                                i4 = 2;
                                f = (j - nms0Var2.s) * j6;
                                f2 = nms0Var2.i;
                            }
                            long j20 = nms0Var2.r + ((long) (f / f2));
                            if (Math.abs(j18 - j20) <= 20000000) {
                                j18 = j20;
                            } else {
                                nms0Var2.b();
                            }
                        } else {
                            i3 = 1;
                            j8 = -30000;
                            i4 = 2;
                        }
                        nms0Var2.n = nms0Var2.m;
                        nms0Var2.o = j18;
                        nms0Var2.p = j;
                        nms0.a aVar5 = nms0Var2.c;
                        if (aVar5 != null) {
                            long j21 = aVar5.d;
                            long j22 = nms0Var2.c.e;
                            if (j21 != j5 && j22 != j5) {
                                long j23 = (((j18 - j21) / j22) * j22) + j21;
                                if (j18 <= j23) {
                                    j9 = j23 - j22;
                                } else {
                                    j23 += j22;
                                    j9 = j23;
                                }
                                long j24 = j23 - j18;
                                long j25 = j18 - j9;
                                long abs = Math.abs(j24 - j25);
                                if (abs < j22 / 2) {
                                    j11 = j22;
                                    long j26 = j11 / 4;
                                    if (abs < j26) {
                                        j10 = j9;
                                        long j27 = nms0Var2.k;
                                        if (j27 != j7) {
                                            nms0Var2.l = j27;
                                        } else {
                                            if (j24 < j25) {
                                                j26 = -j26;
                                            }
                                            nms0Var2.l = j26;
                                        }
                                    } else {
                                        j10 = j9;
                                        nms0Var2.l = j7;
                                    }
                                } else {
                                    j10 = j9;
                                    j11 = j22;
                                    nms0Var2.l = nms0Var2.k;
                                }
                                if (j24 + nms0Var2.l >= j25) {
                                    j23 = j10;
                                }
                                j18 = j23 - ((j11 * 80) / 100);
                            }
                        }
                        aVar.b = j18;
                        long j28 = (j18 - a2) / j6;
                        aVar.a = j28;
                        boolean z4 = (this.i == j5 || this.j) ? 0 : i3;
                        if (this.a.L0(j28, j2, z2, z4)) {
                            return 4;
                        }
                        long j29 = aVar.a;
                        if (((j29 >= j8 || z2) ? 0 : i3) != 0) {
                            return z4 != 0 ? i : i4;
                        }
                        if (j29 <= 50000) {
                            return i3;
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
                if (this.a.L0(j16, j2, z2, true)) {
                    return 4;
                }
                if (!this.d || aVar.a >= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                    this.n = true;
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = C.TIME_UNSET;
            return true;
        }
        if (this.i == C.TIME_UNSET) {
            return false;
        }
        if (this.l.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = C.TIME_UNSET;
        return false;
    }

    public final void c(boolean z) {
        this.j = z;
        long j = this.c;
        this.i = j > 0 ? this.l.elapsedRealtime() + j : C.TIME_UNSET;
    }

    public final void d() {
        this.d = true;
        this.g = y2r0.S(this.l.elapsedRealtime());
        nms0 nms0Var = this.b;
        nms0Var.d = true;
        nms0Var.b();
        DisplayManager displayManager = (DisplayManager) nms0Var.b.getSystemService("display");
        nms0.a aVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                aVar = Build.VERSION.SDK_INT >= 33 ? new nms0.c(choreographer, displayManager) : new nms0.b(choreographer, displayManager);
            } catch (RuntimeException e) {
                ahn.G("Vsync sampling disabled due to platform error", e);
            }
        }
        nms0Var.c = aVar;
        if (aVar != null) {
            aVar.a();
        }
        nms0Var.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        nms0 nms0Var = this.b;
        nms0Var.f = f;
        vmr vmrVar = nms0Var.a;
        vmrVar.a.c();
        vmrVar.b.c();
        vmrVar.c = false;
        vmrVar.d = C.TIME_UNSET;
        vmrVar.e = 0;
        nms0Var.c();
    }

    public final void g(@Nullable Surface surface) {
        this.m = surface != null;
        this.n = false;
        nms0 nms0Var = this.b;
        if (nms0Var.e != surface) {
            nms0Var.a();
            nms0Var.e = surface;
            nms0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        fxc0.p(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f == this.k) {
            return;
        }
        this.k = f;
        nms0 nms0Var = this.b;
        nms0Var.i = f;
        nms0Var.d(false);
    }
}
