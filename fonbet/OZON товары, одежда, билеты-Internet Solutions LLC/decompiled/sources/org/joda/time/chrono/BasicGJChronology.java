package org.joda.time.chrono;

/* loaded from: classes6.dex */
abstract class BasicGJChronology extends BasicChronology {
    private static final long serialVersionUID = 538276888268L;

    /* renamed from: y0, reason: collision with root package name */
    private static final int[] f79147y0 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: z0, reason: collision with root package name */
    private static final int[] f79148z0 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: A0, reason: collision with root package name */
    private static final long[] f79145A0 = new long[12];

    /* renamed from: B0, reason: collision with root package name */
    private static final long[] f79146B0 = new long[12];

    static {
        long j11 = 0;
        int i11 = 0;
        long j12 = 0;
        while (i11 < 11) {
            j11 += f79147y0[i11] * 86400000;
            int i12 = i11 + 1;
            f79145A0[i12] = j11;
            j12 += f79148z0[i11] * 86400000;
            f79146B0[i12] = j12;
            i11 = i12;
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long E0(long j11, long j12) {
        int D02 = D0(j11);
        int D03 = D0(j12);
        long F02 = j11 - F0(D02);
        long F03 = j12 - F0(D03);
        if (F03 >= 5097600000L) {
            if (I0(D03)) {
                if (!I0(D02)) {
                    F03 -= 86400000;
                }
            } else if (F02 >= 5097600000L && I0(D02)) {
                F02 -= 86400000;
            }
        }
        int i11 = D02 - D03;
        if (F02 < F03) {
            i11--;
        }
        return i11;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final boolean H0(long j11) {
        return g().d(j11) == 29 && L().D(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (I0(r6) == false) goto L13;
     */
    @Override // org.joda.time.chrono.BasicChronology
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final long J0(int i11, long j11) {
        int D02 = D0(j11);
        int F02 = (int) ((j11 - F0(D02)) / 86400000);
        int i12 = F02 + 1;
        int v02 = BasicChronology.v0(j11);
        if (i12 > 59) {
            if (!I0(D02)) {
                if (I0(i11)) {
                    F02 += 2;
                }
            }
            return G0(i11, 1, F02) + v02;
        }
        F02 = i12;
        return G0(i11, 1, F02) + v02;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final int r0(int i11, long j11) {
        if (i11 <= 28 && i11 >= 1) {
            return 28;
        }
        int D02 = D0(j11);
        return s0(D02, y0(D02, j11));
    }

    @Override // org.joda.time.chrono.BasicChronology
    final int s0(int i11, int i12) {
        return I0(i11) ? f79148z0[i12 - 1] : f79147y0[i12 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    final int y0(int i11, long j11) {
        int F02 = (int) ((j11 - F0(i11)) >> 10);
        if (I0(i11)) {
            if (F02 < 15356250) {
                if (F02 < 7678125) {
                    if (F02 < 2615625) {
                        return 1;
                    }
                    return F02 < 5062500 ? 2 : 3;
                }
                if (F02 < 10209375) {
                    return 4;
                }
                return F02 < 12825000 ? 5 : 6;
            }
            if (F02 < 23118750) {
                if (F02 < 17971875) {
                    return 7;
                }
                return F02 < 20587500 ? 8 : 9;
            }
            if (F02 >= 25734375) {
                return F02 < 28265625 ? 11 : 12;
            }
        } else {
            if (F02 < 15271875) {
                if (F02 < 7593750) {
                    if (F02 < 2615625) {
                        return 1;
                    }
                    return F02 < 4978125 ? 2 : 3;
                }
                if (F02 < 10125000) {
                    return 4;
                }
                return F02 < 12740625 ? 5 : 6;
            }
            if (F02 < 23034375) {
                if (F02 < 17887500) {
                    return 7;
                }
                return F02 < 20503125 ? 8 : 9;
            }
            if (F02 >= 25650000) {
                return F02 < 28181250 ? 11 : 12;
            }
        }
        return 10;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long z0(int i11, int i12) {
        return I0(i11) ? f79146B0[i12 - 1] : f79145A0[i12 - 1];
    }
}
