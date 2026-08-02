package com.google.android.gms.internal.ads;

import defpackage.j9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafk {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, com.ironsource.mediationsdk.metadata.a.o};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r10 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafj a(zzet zzetVar) {
        int i;
        int i2;
        int h = zzetVar.h(16);
        int h2 = zzetVar.h(16);
        if (h2 == 65535) {
            h2 = zzetVar.h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = h2 + i;
        if (h == 44097) {
            i3 += 2;
        }
        if (zzetVar.h(2) == 3) {
            do {
                zzetVar.h(2);
            } while (zzetVar.g());
        }
        int h3 = zzetVar.h(10);
        if (zzetVar.g() && zzetVar.h(3) > 0) {
            zzetVar.f(2);
        }
        int i4 = true != zzetVar.g() ? 44100 : 48000;
        int h4 = zzetVar.h(4);
        int[] iArr = a;
        if (i4 == 44100 && h4 == 13) {
            i2 = iArr[13];
        } else if (i4 != 48000 || h4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[h4];
            int i6 = h3 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (h4 != 8) {
                    }
                    i2 = i5 + 1;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (h4 != 3) {
                            if (h4 != 8) {
                            }
                        }
                        i2 = i5 + 1;
                    }
                    i2 = i5;
                }
            }
            if (h4 != 3) {
            }
            i2 = i5 + 1;
        }
        return new zzafj(i4, i3, i2);
    }

    public static void b(int i, zzeu zzeuVar) {
        zzeuVar.y(7);
        byte[] bArr = zzeuVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static void c(zzet zzetVar, j9 j9Var) {
        int h = zzetVar.h(5);
        zzetVar.f(2);
        if (zzetVar.g()) {
            zzetVar.f(5);
        }
        if (h >= 7 && h <= 10) {
            zzetVar.e();
        }
        if (zzetVar.g()) {
            int h2 = zzetVar.h(3);
            if (j9Var.b == -1 && h >= 0 && h <= 15 && (h2 == 0 || h2 == 1)) {
                j9Var.b = h;
            }
            if (zzetVar.g()) {
                e(zzetVar);
            }
        }
    }

    public static void d(zzet zzetVar, j9 j9Var) {
        zzetVar.f(2);
        boolean g = zzetVar.g();
        int h = zzetVar.h(8);
        for (int i = 0; i < h; i++) {
            zzetVar.f(2);
            if (zzetVar.g()) {
                zzetVar.f(5);
            }
            if (g) {
                zzetVar.f(24);
            } else {
                if (zzetVar.g()) {
                    if (!zzetVar.g()) {
                        zzetVar.f(4);
                    }
                    j9Var.c = zzetVar.h(6) + 1;
                }
                zzetVar.f(4);
            }
        }
        if (zzetVar.g()) {
            zzetVar.f(3);
            if (zzetVar.g()) {
                e(zzetVar);
            }
        }
    }

    public static void e(zzet zzetVar) {
        int h = zzetVar.h(6);
        if (h < 2 || h > 42) {
            throw zzat.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(h)));
        }
        zzetVar.f(h * 8);
    }
}
