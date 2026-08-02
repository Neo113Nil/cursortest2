package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z68 implements kl6 {
    public ol6 e;
    public usj f;
    public Metadata h;
    public g78 i;
    public int j;
    public int k;
    public x68 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final nkk b = new nkk(new byte[32768], 0);
    public final boolean c = false;
    public final b78 d = new b78();
    public int g = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, byte, int] */
    @Override // defpackage.kl6
    public final int b(ml6 ml6Var, b78 b78Var) {
        int i;
        int i2;
        int i3;
        g78 g78Var;
        Metadata metadata;
        int i4;
        a0h aw0Var;
        long j;
        long j2;
        long j3;
        boolean z;
        int i5 = this.g;
        if (i5 == 0) {
            boolean z2 = !this.c;
            ((ap4) ml6Var).f = 0;
            ap4 ap4Var = (ap4) ml6Var;
            long peekPosition = ap4Var.getPeekPosition();
            Metadata M = oyn.M(ml6Var, z2);
            ap4Var.skipFully((int) (ap4Var.getPeekPosition() - peekPosition));
            this.h = M;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        int i6 = 2;
        if (i5 == 1) {
            ((ap4) ml6Var).peekFully(bArr, 0, bArr.length, false);
            ((ap4) ml6Var).f = 0;
            this.g = 2;
            return 0;
        }
        int i7 = 24;
        int i8 = 3;
        if (i5 == 2) {
            ((ap4) ml6Var).readFully(new byte[4], 0, 4, false);
            if (((r2[3] & 255) | ((r2[0] & 255) << 24) | ((r2[1] & 255) << 16) | ((r2[2] & 255) << 8)) != 1716281667) {
                throw r9e.a("Failed to read FLAC stream marker.", null);
            }
            this.g = 3;
            return 0;
        }
        if (i5 == 3) {
            ?? r15 = 0;
            g78 g78Var2 = this.i;
            boolean z3 = false;
            while (!z3) {
                ((ap4) ml6Var).f = r15;
                byte[] bArr2 = new byte[4];
                nm2 nm2Var = new nm2(bArr2, 4, i6, r15);
                ap4 ap4Var2 = (ap4) ml6Var;
                ap4Var2.peekFully(bArr2, r15, 4, r15);
                boolean h = nm2Var.h();
                int i9 = nm2Var.i(r13);
                int i10 = nm2Var.i(i7) + 4;
                if (i9 == 0) {
                    byte[] bArr3 = new byte[38];
                    ap4Var2.readFully(bArr3, r15, 38, r15);
                    g78Var2 = new g78(bArr3, 4, r15);
                    i = i6;
                    i2 = i7;
                    i3 = i8;
                } else {
                    if (g78Var2 == null) {
                        ilg.c();
                        return 0;
                    }
                    Metadata metadata2 = (Metadata) g78Var2.m;
                    if (i9 == i8) {
                        nkk nkkVar = new nkk(i10);
                        ap4Var2.readFully(nkkVar.a, r15, i10, r15);
                        i2 = i7;
                        i = i6;
                        g78Var = new g78(g78Var2.b, g78Var2.c, g78Var2.d, g78Var2.e, g78Var2.f, g78Var2.h, g78Var2.i, g78Var2.k, oyn.O(nkkVar), (Metadata) g78Var2.m);
                        i3 = i8;
                    } else {
                        i = i6;
                        i2 = i7;
                        if (i9 == 4) {
                            nkk nkkVar2 = new nkk(i10);
                            ap4Var2.readFully(nkkVar2.a, 0, i10, false);
                            nkkVar2.F(4);
                            Metadata a = xxk.a(Arrays.asList((String[]) xxk.b(nkkVar2, false, false).b));
                            if (metadata2 == null) {
                                metadata = a;
                            } else {
                                if (a != null) {
                                    metadata2 = metadata2.a(a.a);
                                }
                                metadata = metadata2;
                            }
                            g78Var = new g78(g78Var2.b, g78Var2.c, g78Var2.d, g78Var2.e, g78Var2.f, g78Var2.h, g78Var2.i, g78Var2.k, (f78) g78Var2.l, metadata);
                            i3 = i8;
                        } else {
                            int i11 = i8;
                            if (i9 == 6) {
                                nkk nkkVar3 = new nkk(i10);
                                ap4Var2.readFully(nkkVar3.a, 0, i10, false);
                                nkkVar3.F(4);
                                Metadata metadata3 = new Metadata(hv9.z(PictureFrame.a(nkkVar3)));
                                if (metadata2 != null) {
                                    metadata3 = metadata2.a(metadata3.a);
                                }
                                i3 = i11;
                                g78Var = new g78(g78Var2.b, g78Var2.c, g78Var2.d, g78Var2.e, g78Var2.f, g78Var2.h, g78Var2.i, g78Var2.k, (f78) g78Var2.l, metadata3);
                            } else {
                                i3 = i11;
                                ap4Var2.skipFully(i10);
                            }
                        }
                    }
                    g78Var2 = g78Var;
                }
                int i12 = lik.a;
                this.i = g78Var2;
                i8 = i3;
                z3 = h;
                i7 = i2;
                i6 = i;
                r13 = 7;
                r15 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.d, 6);
            usj usjVar = this.f;
            int i13 = lik.a;
            usjVar.a(this.i.d(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long j4 = 0;
        if (i5 == 4) {
            ((ap4) ml6Var).f = 0;
            byte[] bArr4 = new byte[2];
            ap4 ap4Var3 = (ap4) ml6Var;
            ap4Var3.peekFully(bArr4, 0, 2, false);
            int i14 = (bArr4[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr4[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            if ((i14 >> 2) != 16382) {
                ap4Var3.f = 0;
                throw r9e.a("First frame does not start with sync code.", null);
            }
            ap4Var3.f = 0;
            this.k = i14;
            ol6 ol6Var = this.e;
            int i15 = lik.a;
            long j5 = ap4Var3.d;
            long j6 = ap4Var3.c;
            this.i.getClass();
            g78 g78Var3 = this.i;
            if (((f78) g78Var3.l) != null) {
                aw0Var = new aw0(g78Var3, j5, 1);
                i4 = 0;
            } else if (j6 == -1 || g78Var3.k <= 0) {
                i4 = 0;
                aw0Var = new aw0(g78Var3.c());
            } else {
                int i16 = this.k;
                int i17 = g78Var3.d;
                kt4 kt4Var = new kt4(g78Var3, 23);
                v68 v68Var = new v68(g78Var3, i16);
                long c = g78Var3.c();
                long j7 = g78Var3.k;
                int i18 = g78Var3.e;
                if (i18 > 0) {
                    i4 = 0;
                    j = j7;
                    j2 = ((i18 + i17) / 2) + 1;
                } else {
                    j = j7;
                    i4 = 0;
                    int i19 = g78Var3.b;
                    j2 = (((((i19 != g78Var3.c || i19 <= 0) ? 4096L : i19) * g78Var3.h) * g78Var3.i) / 8) + 64;
                }
                x68 x68Var = new x68(kt4Var, v68Var, c, j, j5, j6, j2, Math.max(6, i17));
                this.l = x68Var;
                aw0Var = (yv1) x68Var.c;
            }
            ol6Var.d(aw0Var);
            this.g = 5;
            return i4;
        }
        if (i5 != 5) {
            zzl.s();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        x68 x68Var2 = this.l;
        if (x68Var2 != null && ((aw1) x68Var2.e) != null) {
            return x68Var2.a(ml6Var, b78Var);
        }
        if (this.n == -1) {
            g78 g78Var4 = this.i;
            ((ap4) ml6Var).f = 0;
            ap4 ap4Var4 = (ap4) ml6Var;
            ap4Var4.b(1, false);
            byte[] bArr5 = new byte[1];
            ap4Var4.peekFully(bArr5, 0, 1, false);
            boolean z4 = (bArr5[0] & 1) == 1;
            ap4Var4.b(2, false);
            r13 = z4 ? 7 : 6;
            nkk nkkVar4 = new nkk(r13);
            byte[] bArr6 = nkkVar4.a;
            int i20 = 0;
            while (i20 < r13) {
                int a2 = ap4Var4.a(i20, r13 - i20, bArr6);
                if (a2 == -1) {
                    break;
                }
                i20 += a2;
            }
            nkkVar4.D(i20);
            ap4Var4.f = 0;
            try {
                long A = nkkVar4.A();
                if (!z4) {
                    A *= g78Var4.c;
                }
                j4 = A;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            long j8 = j4;
            if (!r3) {
                throw r9e.a(null, null);
            }
            this.n = j8;
        } else {
            nkk nkkVar5 = this.b;
            int i21 = nkkVar5.c;
            if (i21 < 32768) {
                int read = ((ap4) ml6Var).read(nkkVar5.a, i21, 32768 - i21);
                r3 = read == -1;
                if (!r3) {
                    nkkVar5.D(i21 + read);
                } else if (nkkVar5.c() == 0) {
                    long j9 = this.n * 1000000;
                    g78 g78Var5 = this.i;
                    int i22 = lik.a;
                    this.f.c(j9 / g78Var5.f, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i23 = nkkVar5.b;
            int i24 = this.m;
            int i25 = this.j;
            if (i24 < i25) {
                nkkVar5.F(Math.min(i25 - i24, nkkVar5.c()));
            }
            this.i.getClass();
            int i26 = nkkVar5.b;
            while (true) {
                int i27 = nkkVar5.c - 16;
                b78 b78Var2 = this.d;
                if (i26 <= i27) {
                    nkkVar5.E(i26);
                    if (wkn.r(nkkVar5, this.i, this.k, b78Var2)) {
                        nkkVar5.E(i26);
                        j3 = b78Var2.a;
                        break;
                    }
                    i26++;
                } else {
                    if (r3) {
                        while (true) {
                            int i28 = nkkVar5.c;
                            if (i26 > i28 - this.j) {
                                nkkVar5.E(i28);
                                break;
                            }
                            nkkVar5.E(i26);
                            try {
                                z = wkn.r(nkkVar5, this.i, this.k, b78Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (nkkVar5.b > nkkVar5.c) {
                                z = false;
                            }
                            if (z) {
                                nkkVar5.E(i26);
                                j3 = b78Var2.a;
                                break;
                            }
                            i26++;
                        }
                    } else {
                        nkkVar5.E(i26);
                    }
                    j3 = -1;
                }
            }
            int i29 = nkkVar5.b - i23;
            nkkVar5.E(i23);
            this.f.d(i29, nkkVar5);
            int i30 = this.m + i29;
            this.m = i30;
            if (j3 != -1) {
                long j10 = this.n * 1000000;
                g78 g78Var6 = this.i;
                int i31 = lik.a;
                this.f.c(j10 / g78Var6.f, 1, i30, 0, null);
                this.m = 0;
                this.n = j3;
            }
            if (nkkVar5.c() < 16) {
                int c2 = nkkVar5.c();
                byte[] bArr7 = nkkVar5.a;
                System.arraycopy(bArr7, nkkVar5.b, bArr7, 0, c2);
                nkkVar5.E(0);
                nkkVar5.D(c2);
            }
        }
        return 0;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.e = ol6Var;
        this.f = ol6Var.track(0, 1);
        ol6Var.endTracks();
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        oyn.M(ml6Var, false);
        byte[] bArr = new byte[4];
        ((ap4) ml6Var).peekFully(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            x68 x68Var = this.l;
            if (x68Var != null) {
                x68Var.e(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.B(0);
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
