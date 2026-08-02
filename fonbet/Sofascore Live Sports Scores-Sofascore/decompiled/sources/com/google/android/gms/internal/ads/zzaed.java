package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pbn;
import defpackage.sbn;
import defpackage.vpk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaed {
    public final zzadn a;
    public final zzaek b;
    public boolean c;
    public long f;
    public boolean i;
    public boolean j;
    public int d = 0;
    public long e = C.TIME_UNSET;
    public float g = 1.0f;
    public zzdp h = zzdp.a;

    public zzaed(Context context, zzadn zzadnVar) {
        this.a = zzadnVar;
        this.b = new zzaek(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.d = 1;
        } else if (i != 1) {
            this.d = Math.min(this.d, 2);
        } else {
            this.d = 0;
        }
        this.b.a();
    }

    public final void b() {
        this.c = true;
        this.f = zzfm.u(this.h.zzb());
        zzaek zzaekVar = this.b;
        zzaekVar.c = true;
        zzaekVar.a();
        DisplayManager displayManager = (DisplayManager) zzaekVar.a.getSystemService(U3.i.d);
        vpk vpkVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                vpkVar = Build.VERSION.SDK_INT >= 33 ? new sbn(choreographer, displayManager) : new pbn(choreographer, displayManager, 1);
            } catch (RuntimeException e) {
                zzeh.d("Vsync sampling disabled due to platform error", e);
            }
        }
        zzaekVar.b = vpkVar;
        if (vpkVar != null) {
            vpkVar.g();
        }
        zzaekVar.b(false);
    }

    public final void c(Surface surface) {
        this.i = surface != null;
        this.j = false;
        zzaek zzaekVar = this.b;
        if (zzaekVar.d != surface) {
            zzaekVar.c();
            zzaekVar.d = surface;
            zzaekVar.b(true);
        }
        this.d = Math.min(this.d, 1);
    }

    public final boolean d(boolean z) {
        if (!z) {
            return false;
        }
        if (this.d != 3) {
            return this.j && !this.i;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00a2, code lost:
    
        if (r29 >= r33) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a9, code lost:
    
        if (r26.c != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r18 > 100000) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, zzaeb zzaebVar) {
        long j7;
        int i;
        long j8;
        int i2;
        long j9;
        long j10;
        float f;
        long j11;
        zzaebVar.a = C.TIME_UNSET;
        zzaebVar.b = C.TIME_UNSET;
        boolean z3 = this.c;
        if (z3 && this.e == C.TIME_UNSET) {
            this.e = j2;
        }
        long j12 = (long) ((j - j2) / this.g);
        if (z3) {
            j12 -= zzfm.u(this.h.zzb()) - j3;
        }
        zzaebVar.a = j12;
        if (!z || z2) {
            if (this.i) {
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            j7 = -9223372036854775807L;
                        } else {
                            if (i3 != 3) {
                                defpackage.zzl.s();
                                return 0;
                            }
                            j7 = -9223372036854775807L;
                            long u = zzfm.u(this.h.zzb()) - this.f;
                            if (this.c) {
                                long j13 = this.e;
                                if (j13 != C.TIME_UNSET) {
                                    if (j13 != j2) {
                                        if (j12 < -30000) {
                                        }
                                    }
                                }
                            }
                            if (!this.c || j2 == this.e) {
                                return 5;
                            }
                            long zzc = this.h.zzc();
                            zzaek zzaekVar = this.b;
                            long j14 = (zzaebVar.a * 1000) + zzc;
                            long j15 = zzaekVar.m;
                            if (j != j15) {
                                i = 1;
                                zzaekVar.n = zzaekVar.k;
                                zzaekVar.o = zzaekVar.l;
                                zzaekVar.p = j15;
                                zzaekVar.i = zzaekVar.j;
                            } else {
                                i = 1;
                            }
                            long j16 = zzaekVar.n;
                            if (j16 != -1) {
                                if (j5 != j7) {
                                    f = zzaekVar.g;
                                    j11 = (j6 - j16) * j5;
                                } else {
                                    long j17 = j - zzaekVar.p;
                                    f = zzaekVar.g;
                                    j11 = j17 * 1000;
                                }
                                long j18 = zzaekVar.o + ((long) (j11 / f));
                                if (Math.abs(j14 - j18) > 20000000) {
                                    zzaekVar.a();
                                } else {
                                    j14 = j18;
                                }
                            }
                            zzaekVar.k = j6;
                            zzaekVar.l = j14;
                            zzaekVar.m = j;
                            vpk vpkVar = zzaekVar.b;
                            if (vpkVar != null) {
                                long j19 = vpkVar.d;
                                long j20 = zzaekVar.b.e;
                                if (j19 != j7 && j20 != j7) {
                                    long j21 = (((j14 - j19) / j20) * j20) + j19;
                                    if (j14 <= j21) {
                                        j8 = j21 - j20;
                                    } else {
                                        j21 += j20;
                                        j8 = j21;
                                    }
                                    long j22 = j20 / 2;
                                    long j23 = j21 - j14;
                                    long j24 = j14 - j8;
                                    long abs = Math.abs(j23 - j24);
                                    if (abs < j22) {
                                        long j25 = j20 / 4;
                                        i2 = 2;
                                        if (abs < j25) {
                                            j9 = zzaekVar.i;
                                            if (j9 == 0) {
                                                if (j23 < j24) {
                                                    j25 = -j25;
                                                }
                                                zzaekVar.j = j25;
                                                j9 = j25;
                                                if (j23 + j9 >= j24) {
                                                    j21 = j8;
                                                }
                                                j14 = j21 - ((j20 * 80) / 100);
                                                zzaebVar.b = j14;
                                                j10 = (j14 - zzc) / 1000;
                                                zzaebVar.a = j10;
                                                if (this.a.A0(j10, j2, z2, false)) {
                                                    return 4;
                                                }
                                                long j26 = zzaebVar.a;
                                                if (j26 < -30000 && !z2) {
                                                    return i2;
                                                }
                                                if (j26 > 50000) {
                                                    return 5;
                                                }
                                                return i;
                                            }
                                        } else {
                                            j9 = 0;
                                        }
                                    } else {
                                        i2 = 2;
                                        j9 = zzaekVar.i;
                                    }
                                    zzaekVar.j = j9;
                                    if (j23 + j9 >= j24) {
                                    }
                                    j14 = j21 - ((j20 * 80) / 100);
                                    zzaebVar.b = j14;
                                    j10 = (j14 - zzc) / 1000;
                                    zzaebVar.a = j10;
                                    if (this.a.A0(j10, j2, z2, false)) {
                                    }
                                }
                            }
                            i2 = 2;
                            zzaebVar.b = j14;
                            j10 = (j14 - zzc) / 1000;
                            zzaebVar.a = j10;
                            if (this.a.A0(j10, j2, z2, false)) {
                            }
                        }
                    }
                    return 0;
                }
                j7 = -9223372036854775807L;
            } else {
                if (this.a.A0(j12, j2, z2, true)) {
                    return 4;
                }
                if (!this.c || zzaebVar.a >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    this.j = true;
                    return 5;
                }
            }
        }
        return 3;
    }

    public final void f(float f) {
        zzguk.a(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f == this.g) {
            return;
        }
        this.g = f;
        zzaek zzaekVar = this.b;
        zzaekVar.g = f;
        zzaekVar.b(false);
    }
}
