package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9v implements InterfaceC3061np, InterfaceC3062nq {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC3062nq A03;
    public C3065nt[] A04 = new C3065nt[0];
    public final InterfaceC3061np A05;

    public C9v(InterfaceC3061np interfaceC3061np, boolean z, long j, long j2) {
        this.A05 = interfaceC3061np;
        this.A02 = z ? j : C.TIME_UNSET;
        this.A01 = j;
        this.A00 = j2;
    }

    private C15367u A00(long j, C15367u c15367u) {
        long toleranceBeforeUs = C5C.A0T(c15367u.A01, 0L, j - this.A01);
        long A0T = C5C.A0T(c15367u.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j);
        if (toleranceBeforeUs == c15367u.A01) {
            long j2 = c15367u.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (A0T == j2) {
                return c15367u;
            }
        }
        return new C15367u(toleranceBeforeUs, A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.DW
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC3061np interfaceC3061np) {
        ((InterfaceC3062nq) AbstractC14363y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j, InterfaceC3024nE[] interfaceC3024nEArr) {
        if (j != 0) {
            for (InterfaceC3024nE interfaceC3024nE : interfaceC3024nEArr) {
                if (interfaceC3024nE != null) {
                    C3212qI A92 = interfaceC3024nE.A92();
                    if (!C3J.A0G(A92.A0W, A92.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != C.TIME_UNSET;
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
        this.A05.A4s(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final boolean A5C(long j) {
        return this.A05.A5C(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final void A60(long j, boolean z) {
        this.A05.A60(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final long A6r(long j, C15367u c15367u) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j, A00(j, c15367u));
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        return this.A05.A76(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final long A78() {
        long A78 = this.A05.A78();
        if (A78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A78;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final long A8b() {
        long A8b = this.A05.A8b();
        if (A8b != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || A8b < this.A00) {
                return A8b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final C3042nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final void ACS() throws IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3062nq
    public final void AFS(InterfaceC3061np interfaceC3061np) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC3062nq) AbstractC14363y.A01(this.A03)).AFS(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final void AH5(InterfaceC3062nq interfaceC3062nq, long j) {
        this.A03 = interfaceC3062nq;
        this.A05.AH5(this, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = C.TIME_UNSET;
            long AHQ = AHQ();
            return AHQ != C.TIME_UNSET ? AHQ : childDiscontinuityUs;
        }
        InterfaceC3061np interfaceC3061np = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long AHQ2 = interfaceC3061np.AHQ();
        if (AHQ2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long discontinuityUs = this.A01;
        boolean z = true;
        AbstractC14363y.A08(AHQ2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (AHQ2 > discontinuityUs2) {
                z = false;
            }
        }
        AbstractC14363y.A08(z);
        return AHQ2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final void AHW(long j) {
        this.A05.AHW(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z) {
        this.A02 = C.TIME_UNSET;
        boolean z2 = false;
        for (C3065nt c3065nt : this.A04) {
            if (c3065nt != null) {
                c3065nt.A00();
            }
        }
        long AJ8 = this.A05.AJ8(j, z);
        if (AJ8 == j || (AJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ8 <= this.A00))) {
            z2 = true;
        }
        AbstractC14363y.A08(z2);
        return AJ8;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3061np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AJ9(InterfaceC3024nE[] interfaceC3024nEArr, boolean[] zArr, DT[] dtArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.A04 = new C3065nt[dtArr.length];
        DT[] dtArr2 = new DT[dtArr.length];
        int i2 = 0;
        while (true) {
            DT dt = null;
            if (i2 >= dtArr.length) {
                break;
            }
            this.A04[i2] = (C3065nt) dtArr[i2];
            DT[] childStreams = this.A04;
            if (childStreams[i2] != null) {
                dt = this.A04[i2].A01;
            }
            dtArr2[i2] = dt;
            i2++;
        }
        long AJ9 = this.A05.AJ9(interfaceC3024nEArr, zArr, dtArr2, zArr2, j);
        if (A03() && j == this.A01) {
            long j3 = this.A01;
            String[] strArr = A06;
            if (strArr[4].charAt(5) == strArr[3].charAt(5)) {
                String[] strArr2 = A06;
                strArr2[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
                strArr2[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
                if (A02(j3, interfaceC3024nEArr)) {
                    j2 = AJ9;
                    this.A02 = j2;
                    AbstractC14363y.A08(AJ9 != j || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
                    i = 0;
                    while (true) {
                        int length = dtArr.length;
                        if (A06[1].length() == 30) {
                            String[] strArr3 = A06;
                            strArr3[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                            strArr3[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                                C3065nt[] c3065ntArr = this.A04;
                                String[] strArr4 = A06;
                                if (strArr4[4].charAt(5) != strArr4[3].charAt(5)) {
                                    break;
                                }
                                A06[6] = "ocXNdzhjsFv";
                                c3065ntArr[i] = null;
                            } else {
                                DT[] childStreams2 = this.A04;
                                if (childStreams2[i] != null) {
                                    DT dt2 = this.A04[i].A01;
                                    DT dt3 = dtArr2[i];
                                    if (A06[1].length() != 30) {
                                        String[] strArr5 = A06;
                                        strArr5[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                        strArr5[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                        if (dt2 == dt3) {
                                        }
                                    } else if (dt2 == dt3) {
                                    }
                                }
                                this.A04[i] = new C3065nt(this, dtArr2[i]);
                            }
                            DT[] childStreams3 = this.A04;
                            dtArr[i] = childStreams3[i];
                            i++;
                        } else {
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                            }
                            DT[] childStreams32 = this.A04;
                            dtArr[i] = childStreams32[i];
                            i++;
                        }
                    }
                    return AJ9;
                }
            }
            throw new RuntimeException();
        }
        j2 = C.TIME_UNSET;
        this.A02 = j2;
        AbstractC14363y.A08(AJ9 != j || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
        i = 0;
        while (true) {
            int length2 = dtArr.length;
            if (A06[1].length() == 30) {
            }
            DT[] childStreams322 = this.A04;
            dtArr[i] = childStreams322[i];
            i++;
        }
        return AJ9;
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z) {
        this.A05.AJc(z);
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b) {
        this.A05.AKb(b);
    }
}
