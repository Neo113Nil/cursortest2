package defpackage;

import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import java.io.EOFException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lr4 implements xnd, ynd, shn {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final long c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public final Object l;
    public final Object m;

    public lr4(qgi qgiVar, long j, long j2, long j3, long j4, boolean z, char c) {
        zzguk.a(j >= 0 && j2 > j);
        this.m = qgiVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.e = j4;
            this.d = 4;
        } else {
            this.d = 0;
        }
        this.l = new wnd(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // defpackage.ynd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long a(nl6 nl6Var) {
        long j;
        long j2;
        long k;
        wnd wndVar = (wnd) this.l;
        int i = this.d;
        long j3 = this.c;
        if (i == 0) {
            j = 0;
            long position = nl6Var.getPosition();
            this.f = position;
            this.d = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.h == this.i) {
                    k = -1;
                } else {
                    long position2 = nl6Var.getPosition();
                    if (wndVar.d(nl6Var, this.i)) {
                        wndVar.b(nl6Var, false);
                        nl6Var.resetPeekPosition();
                        long j5 = this.g;
                        long j6 = wndVar.b;
                        long j7 = j5 - j6;
                        j2 = 2;
                        int i2 = wndVar.d + wndVar.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.i = position2;
                                this.k = j6;
                            } else {
                                this.h = nl6Var.getPosition() + i2;
                                this.j = wndVar.b;
                            }
                            long j8 = this.i;
                            long j9 = this.h;
                            if (j8 - j9 < 100000) {
                                this.i = j9;
                                k = j9;
                            } else {
                                long position3 = nl6Var.getPosition() - (i2 * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.i;
                                long j11 = this.h;
                                k = nik.k((((j10 - j11) * j7) / (this.k - this.j)) + position3, j11, j10 - 1);
                            }
                        } else {
                            k = -1;
                        }
                        if (k == -1) {
                            return k;
                        }
                        this.d = 3;
                    } else {
                        k = this.h;
                        if (k == position2) {
                            is8.e("No ogg page can be found.");
                            return 0L;
                        }
                    }
                }
                j2 = 2;
                if (k == -1) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    zzl.s();
                    return 0L;
                }
                j2 = 2;
            }
            while (true) {
                wndVar.d(nl6Var, -1L);
                wndVar.b(nl6Var, false);
                if (wndVar.b > this.g) {
                    nl6Var.resetPeekPosition();
                    this.d = 4;
                    return -(this.j + j2);
                }
                nl6Var.skipFully(wndVar.d + wndVar.e);
                this.h = nl6Var.getPosition();
                this.j = wndVar.b;
            }
        } else {
            j = 0;
        }
        wndVar.a = 0;
        wndVar.b = j;
        wndVar.c = 0;
        wndVar.d = 0;
        wndVar.e = 0;
        if (!wndVar.d(nl6Var, -1L)) {
            a70.q();
            return 0L;
        }
        wndVar.b(nl6Var, false);
        nl6Var.skipFully(wndVar.d + wndVar.e);
        long j12 = wndVar.b;
        while ((wndVar.a & 4) != 4 && wndVar.d(nl6Var, -1L) && nl6Var.getPosition() < j3 && wndVar.b(nl6Var, true)) {
            try {
                nl6Var.skipFully(wndVar.d + wndVar.e);
                j12 = wndVar.b;
            } catch (EOFException unused) {
            }
        }
        this.e = j12;
        this.d = 4;
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // defpackage.shn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long c(zzagi zzagiVar) {
        long j;
        ?? r3;
        long j2;
        long j3;
        long max;
        long j4;
        wnd wndVar = (wnd) this.l;
        int i = this.d;
        long j5 = this.c;
        if (i == 0) {
            j = 0;
            long zzn = zzagiVar.zzn();
            this.f = zzn;
            this.d = 1;
            long j6 = (-65307) + j5;
            if (j6 > zzn) {
                return j6;
            }
            r3 = 0;
        } else if (i != 1) {
            if (i == 2) {
                long j7 = this.h;
                long j8 = this.i;
                if (j7 == j8) {
                    max = -1;
                    j3 = -1;
                } else {
                    long zzn2 = zzagiVar.zzn();
                    if (wndVar.e(zzagiVar, j8)) {
                        wndVar.f(zzagiVar, false);
                        zzagiVar.zzl();
                        long j9 = this.g;
                        long j10 = wndVar.b;
                        long j11 = j9 - j10;
                        j2 = 2;
                        int i2 = wndVar.d + wndVar.e;
                        if (j11 < 0 || j11 >= 72000) {
                            if (j11 < 0) {
                                this.i = zzn2;
                                this.k = j10;
                            } else {
                                this.h = zzagiVar.zzn() + i2;
                                this.j = j10;
                            }
                            long j12 = this.i;
                            long j13 = this.h;
                            long j14 = j12 - j13;
                            if (j14 < 100000) {
                                this.i = j13;
                                j3 = -1;
                                max = j13;
                            } else {
                                long zzn3 = zzagiVar.zzn() - (i2 * (j11 <= 0 ? 2L : 1L));
                                j3 = -1;
                                String str = zzfm.a;
                                max = Math.max(j13, Math.min(((j11 * j14) / (this.k - this.j)) + zzn3, j12 - 1));
                            }
                        } else {
                            max = -1;
                            j3 = -1;
                        }
                        if (max == j3) {
                            return max;
                        }
                        this.d = 3;
                        j4 = j3;
                    } else {
                        max = this.h;
                        if (max == zzn2) {
                            is8.e("No ogg page can be found.");
                            return 0L;
                        }
                        j3 = -1;
                    }
                }
                j2 = 2;
                if (max == j3) {
                }
            } else {
                if (i != 3) {
                    return -1L;
                }
                j4 = -1;
                j2 = 2;
            }
            while (true) {
                wndVar.e(zzagiVar, j4);
                wndVar.f(zzagiVar, false);
                if (wndVar.b > this.g) {
                    zzagiVar.zzl();
                    this.d = 4;
                    return -(this.j + j2);
                }
                zzagiVar.zzf(wndVar.d + wndVar.e);
                this.h = zzagiVar.zzn();
                this.j = wndVar.b;
                j4 = -1;
            }
        } else {
            j = 0;
            r3 = 0;
        }
        wndVar.a = r3;
        wndVar.b = j;
        wndVar.c = r3;
        wndVar.d = r3;
        wndVar.e = r3;
        if (!wndVar.e(zzagiVar, -1L)) {
            a70.q();
            return 0L;
        }
        wndVar.f(zzagiVar, r3);
        zzagiVar.zzf(wndVar.d + wndVar.e);
        long j15 = wndVar.b;
        while ((wndVar.a & 4) != 4 && wndVar.e(zzagiVar, -1L) && zzagiVar.zzn() < j5 && wndVar.f(zzagiVar, true)) {
            try {
                zzagiVar.zzf(wndVar.d + wndVar.e);
                j15 = wndVar.b;
            } catch (EOFException unused) {
            }
        }
        this.e = j15;
        this.d = 4;
        return this.f;
    }

    @Override // defpackage.xnd
    public a0h createSeekMap() {
        if (this.e != 0) {
            return new jr4(this);
        }
        return null;
    }

    @Override // defpackage.shn
    public void e(long j) {
        long j2 = this.e - 1;
        String str = zzfm.a;
        this.g = Math.max(0L, Math.min(j, j2));
        this.d = 2;
        this.h = this.b;
        this.i = this.c;
        this.j = 0L;
        this.k = this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // defpackage.xnd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long g(ml6 ml6Var) {
        long j;
        long j2;
        long i;
        wnd wndVar = (wnd) this.l;
        int i2 = this.d;
        long j3 = this.c;
        if (i2 == 0) {
            j = 0;
            long position = ml6Var.getPosition();
            this.f = position;
            this.d = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                if (this.h == this.i) {
                    i = -1;
                } else {
                    long position2 = ml6Var.getPosition();
                    if (wndVar.c(ml6Var, this.i)) {
                        wndVar.a(ml6Var, false);
                        ml6Var.resetPeekPosition();
                        long j5 = this.g;
                        long j6 = wndVar.b;
                        long j7 = j5 - j6;
                        j2 = 2;
                        int i3 = wndVar.d + wndVar.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.i = position2;
                                this.k = j6;
                            } else {
                                this.h = ml6Var.getPosition() + i3;
                                this.j = wndVar.b;
                            }
                            long j8 = this.i;
                            long j9 = this.h;
                            if (j8 - j9 < 100000) {
                                this.i = j9;
                                i = j9;
                            } else {
                                long position3 = ml6Var.getPosition() - (i3 * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.i;
                                long j11 = this.h;
                                i = lik.i((((j10 - j11) * j7) / (this.k - this.j)) + position3, j11, j10 - 1);
                            }
                        } else {
                            i = -1;
                        }
                        if (i == -1) {
                            return i;
                        }
                        this.d = 3;
                    } else {
                        i = this.h;
                        if (i == position2) {
                            is8.e("No ogg page can be found.");
                            return 0L;
                        }
                    }
                }
                j2 = 2;
                if (i == -1) {
                }
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return -1L;
                    }
                    zzl.s();
                    return 0L;
                }
                j2 = 2;
            }
            while (true) {
                wndVar.c(ml6Var, -1L);
                wndVar.a(ml6Var, false);
                if (wndVar.b > this.g) {
                    ml6Var.resetPeekPosition();
                    this.d = 4;
                    return -(this.j + j2);
                }
                ml6Var.skipFully(wndVar.d + wndVar.e);
                this.h = ml6Var.getPosition();
                this.j = wndVar.b;
            }
        } else {
            j = 0;
        }
        wndVar.a = 0;
        wndVar.b = j;
        wndVar.c = 0;
        wndVar.d = 0;
        wndVar.e = 0;
        if (!wndVar.c(ml6Var, -1L)) {
            a70.q();
            return 0L;
        }
        wndVar.a(ml6Var, false);
        ml6Var.skipFully(wndVar.d + wndVar.e);
        long j12 = wndVar.b;
        while ((wndVar.a & 4) != 4 && wndVar.c(ml6Var, -1L) && ml6Var.getPosition() < j3 && wndVar.a(ml6Var, true)) {
            try {
                ml6Var.skipFully(wndVar.d + wndVar.e);
                j12 = wndVar.b;
            } catch (EOFException unused) {
            }
        }
        this.e = j12;
        this.d = 4;
        return this.f;
    }

    @Override // defpackage.xnd, defpackage.ynd
    public void startSeek(long j) {
        switch (this.a) {
            case 0:
                this.g = lik.i(j, 0L, this.e - 1);
                this.d = 2;
                this.h = this.b;
                this.i = this.c;
                this.j = 0L;
                this.k = this.e;
                break;
            default:
                this.g = nik.k(j, 0L, this.e - 1);
                this.d = 2;
                this.h = this.b;
                this.i = this.c;
                this.j = 0L;
                this.k = this.e;
                break;
        }
    }

    @Override // defpackage.shn
    public /* bridge */ /* synthetic */ zzahk zzc() {
        if (this.e != 0) {
            return new qhn(this);
        }
        return null;
    }

    @Override // defpackage.ynd
    /* renamed from: createSeekMap */
    public b0h mo18createSeekMap() {
        if (this.e != 0) {
            return new kr4(this);
        }
        return null;
    }

    public lr4(qgi qgiVar, long j, long j2, long j3, long j4, boolean z) {
        qx9.r(j >= 0 && j2 > j);
        this.m = qgiVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.d = 0;
        } else {
            this.e = j4;
            this.d = 4;
        }
        this.l = new wnd(0);
    }

    public lr4(qgi qgiVar, long j, long j2, long j3, long j4, boolean z, byte b) {
        z1a.s(j >= 0 && j2 > j);
        this.m = qgiVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.d = 0;
        } else {
            this.e = j4;
            this.d = 4;
        }
        this.l = new wnd(1);
    }
}
