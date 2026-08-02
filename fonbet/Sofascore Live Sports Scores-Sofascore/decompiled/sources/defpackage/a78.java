package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a78 implements ll6 {
    public pl6 e;
    public vsj f;
    public ric h;
    public g78 i;
    public int j;
    public int k;
    public y68 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final j9e b = new j9e(new byte[32768], 0);
    public final boolean c = false;
    public final b78 d = new b78();
    public int g = 0;

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        ric l = new t9d(26).l(nl6Var, xq9.i, 0);
        if (l != null) {
            int length = l.a.length;
        }
        j9e j9eVar = new j9e(4);
        ((bp4) nl6Var).peekFully(j9eVar.a, 0, 4, false);
        return j9eVar.C() == 1716281667;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        boolean z;
        g78 g78Var;
        int i;
        b0h bw0Var;
        long j;
        long j2;
        long j3;
        long j4;
        boolean z2;
        long I;
        long j5;
        int i2 = this.g;
        ric ricVar = null;
        if (i2 == 0) {
            nl6Var.resetPeekPosition();
            long peekPosition = nl6Var.getPeekPosition();
            ric l = new t9d(26).l(nl6Var, !this.c ? null : xq9.i, 0);
            if (l != null && l.a.length != 0) {
                ricVar = l;
            }
            nl6Var.skipFully((int) (nl6Var.getPeekPosition() - peekPosition));
            this.h = ricVar;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            nl6Var.peekFully(bArr, 0, bArr.length);
            nl6Var.resetPeekPosition();
            this.g = 2;
            return 0;
        }
        if (i2 == 2) {
            j9e j9eVar = new j9e(4);
            nl6Var.readFully(j9eVar.a, 0, 4);
            if (j9eVar.C() != 1716281667) {
                throw s9e.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i3 = 24;
        if (i2 == 3) {
            byte b = 0;
            g78 g78Var2 = this.i;
            boolean z3 = false;
            while (!z3) {
                nl6Var.resetPeekPosition();
                byte[] bArr2 = new byte[4];
                nm2 nm2Var = new nm2(bArr2, 4, 3, b);
                nl6Var.peekFully(bArr2, b, 4);
                boolean h = nm2Var.h();
                int i4 = nm2Var.i(r11);
                int i5 = nm2Var.i(i3) + 4;
                if (i4 == 0) {
                    byte[] bArr3 = new byte[38];
                    nl6Var.readFully(bArr3, b, 38);
                    g78Var2 = new g78(bArr3, 4, r4);
                    z = h;
                } else {
                    if (g78Var2 == null) {
                        ilg.c();
                        return 0;
                    }
                    ric ricVar2 = (ric) g78Var2.m;
                    if (i4 == 3) {
                        j9e j9eVar2 = new j9e(i5);
                        nl6Var.readFully(j9eVar2.a, b, i5);
                        z = h;
                        g78Var = new g78(g78Var2.b, g78Var2.c, g78Var2.d, g78Var2.e, g78Var2.f, g78Var2.h, g78Var2.i, g78Var2.k, n4o.P(j9eVar2), (ric) g78Var2.m);
                    } else {
                        z = h;
                        if (i4 == 4) {
                            j9e j9eVar3 = new j9e(i5);
                            nl6Var.readFully(j9eVar3.a, 0, i5);
                            j9eVar3.O(4);
                            ric B = w1a.B(Arrays.asList(w1a.C(j9eVar3, false, false).b));
                            if (ricVar2 != null) {
                                B = ricVar2.b(B);
                            }
                            g78Var = new g78(g78Var2.b, g78Var2.c, g78Var2.d, g78Var2.e, g78Var2.f, g78Var2.h, g78Var2.i, g78Var2.k, (f78) g78Var2.l, B);
                        } else if (i4 == 6) {
                            j9e j9eVar4 = new j9e(i5);
                            nl6Var.readFully(j9eVar4.a, 0, i5);
                            j9eVar4.O(4);
                            ric ricVar3 = new ric(hv9.z(pge.a(j9eVar4)));
                            if (ricVar2 != null) {
                                ricVar3 = ricVar2.b(ricVar3);
                            }
                            g78Var = new g78(g78Var2.b, g78Var2.c, g78Var2.d, g78Var2.e, g78Var2.f, g78Var2.h, g78Var2.i, g78Var2.k, (f78) g78Var2.l, ricVar3);
                        } else {
                            nl6Var.skipFully(i5);
                        }
                    }
                    g78Var2 = g78Var;
                }
                String str = nik.a;
                this.i = g78Var2;
                z3 = z;
                r4 = 1;
                i3 = 24;
                r11 = 7;
                b = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.d, 6);
            b e = this.i.e(bArr, this.h);
            vsj vsjVar = this.f;
            String str2 = nik.a;
            qm8 a = e.a();
            a.m = sjc.p(MimeTypes.AUDIO_FLAC);
            w1l.r(a, vsjVar);
            this.f.f(this.i.c());
            this.g = 4;
            return 0;
        }
        long j6 = 0;
        if (i2 == 4) {
            nl6Var.resetPeekPosition();
            j9e j9eVar5 = new j9e(2);
            nl6Var.peekFully(j9eVar5.a, 0, 2);
            int H = j9eVar5.H();
            if ((H >> 2) != 16382) {
                nl6Var.resetPeekPosition();
                throw s9e.a(null, "First frame does not start with sync code.");
            }
            nl6Var.resetPeekPosition();
            this.k = H;
            pl6 pl6Var = this.e;
            String str3 = nik.a;
            long position = nl6Var.getPosition();
            long length = nl6Var.getLength();
            this.i.getClass();
            g78 g78Var3 = this.i;
            f78 f78Var = (f78) g78Var3.l;
            if (f78Var != null && f78Var.a.length > 0) {
                bw0Var = new bw0(g78Var3, position, 1);
                i = 0;
            } else if (length == -1 || g78Var3.k <= 0) {
                i = 0;
                bw0Var = new bw0(g78Var3.c());
            } else {
                int i6 = this.k;
                int i7 = g78Var3.d;
                kt4 kt4Var = new kt4(g78Var3, i3);
                w68 w68Var = new w68(g78Var3, i6);
                long c = g78Var3.c();
                long j7 = g78Var3.k;
                int i8 = g78Var3.e;
                if (i8 > 0) {
                    i = 0;
                    j = j7;
                    j2 = (i8 + i7) / 2;
                    j3 = 1;
                } else {
                    i = 0;
                    j = j7;
                    int i9 = g78Var3.b;
                    j2 = ((((i9 != g78Var3.c || i9 <= 0) ? 4096L : i9) * g78Var3.h) * g78Var3.i) / 8;
                    j3 = 64;
                }
                y68 y68Var = new y68(kt4Var, w68Var, c, j, position, length, j2 + j3, Math.max(6, i7));
                this.l = y68Var;
                bw0Var = (zv1) y68Var.c;
            }
            pl6Var.m(bw0Var);
            this.g = 5;
            return i;
        }
        if (i2 != 5) {
            zzl.s();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        y68 y68Var2 = this.l;
        if (y68Var2 != null && ((aw1) y68Var2.e) != null) {
            return y68Var2.b(nl6Var, b78Var);
        }
        if (this.n == -1) {
            g78 g78Var4 = this.i;
            nl6Var.resetPeekPosition();
            nl6Var.advancePeekPosition(1);
            byte[] bArr4 = new byte[1];
            nl6Var.peekFully(bArr4, 0, 1);
            boolean z4 = (bArr4[0] & 1) == 1;
            nl6Var.advancePeekPosition(2);
            r11 = z4 ? 7 : 6;
            j9e j9eVar6 = new j9e(r11);
            byte[] bArr5 = j9eVar6.a;
            int i10 = 0;
            while (i10 < r11) {
                int a2 = nl6Var.a(i10, r11 - i10, bArr5);
                if (a2 == -1) {
                    break;
                }
                i10 += a2;
            }
            j9eVar6.M(i10);
            nl6Var.resetPeekPosition();
            try {
                I = j9eVar6.I();
                if (!z4) {
                    I *= g78Var4.c;
                }
                j5 = g78Var4.k;
            } catch (NumberFormatException unused) {
            }
            if (j5 == 0 || I <= j5) {
                j6 = I;
                if (r4 != 0) {
                    throw s9e.a(null, null);
                }
                this.n = j6;
            }
            r4 = 0;
            if (r4 != 0) {
            }
        } else {
            j9e j9eVar7 = this.b;
            int i11 = j9eVar7.c;
            if (i11 < 32768) {
                int read = nl6Var.read(j9eVar7.a, i11, 32768 - i11);
                r4 = read != -1 ? 0 : 1;
                if (r4 == 0) {
                    j9eVar7.M(i11 + read);
                } else if (j9eVar7.a() == 0) {
                    long j8 = this.n * 1000000;
                    g78 g78Var5 = this.i;
                    String str4 = nik.a;
                    this.f.a(j8 / g78Var5.f, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r4 = 0;
            }
            int i12 = j9eVar7.b;
            int i13 = this.m;
            int i14 = this.j;
            if (i13 < i14) {
                j9eVar7.O(Math.min(i14 - i13, j9eVar7.a()));
            }
            this.i.getClass();
            int i15 = j9eVar7.b;
            while (true) {
                int i16 = j9eVar7.c - 16;
                b78 b78Var2 = this.d;
                if (i15 <= i16) {
                    j9eVar7.N(i15);
                    if (wnn.z(j9eVar7, this.i, this.k, b78Var2)) {
                        j9eVar7.N(i15);
                        j4 = b78Var2.a;
                        break;
                    }
                    i15++;
                } else {
                    if (r4 != 0) {
                        while (true) {
                            int i17 = j9eVar7.c;
                            if (i15 > i17 - this.j) {
                                j9eVar7.N(i17);
                                break;
                            }
                            j9eVar7.N(i15);
                            try {
                                z2 = wnn.z(j9eVar7, this.i, this.k, b78Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z2 = false;
                            }
                            if (j9eVar7.b > j9eVar7.c) {
                                z2 = false;
                            }
                            if (z2) {
                                j9eVar7.N(i15);
                                j4 = b78Var2.a;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        j9eVar7.N(i15);
                    }
                    j4 = -1;
                }
            }
            int i18 = j9eVar7.b - i12;
            j9eVar7.N(i12);
            this.f.g(i18, j9eVar7);
            int i19 = this.m + i18;
            this.m = i19;
            if (j4 != -1) {
                long j9 = this.n * 1000000;
                g78 g78Var6 = this.i;
                String str5 = nik.a;
                this.f.a(j9 / g78Var6.f, 1, i19, 0, null);
                this.m = 0;
                this.n = j4;
            }
            int length2 = j9eVar7.a.length - j9eVar7.c;
            if (j9eVar7.a() < 16 && length2 < 16) {
                int a3 = j9eVar7.a();
                byte[] bArr6 = j9eVar7.a;
                System.arraycopy(bArr6, j9eVar7.b, bArr6, 0, a3);
                j9eVar7.N(0);
                j9eVar7.M(a3);
            }
        }
        return 0;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.e = pl6Var;
        this.f = pl6Var.mo2track(0, 1);
        pl6Var.endTracks();
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            y68 y68Var = this.l;
            if (y68Var != null) {
                y68Var.e(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.K(0);
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
