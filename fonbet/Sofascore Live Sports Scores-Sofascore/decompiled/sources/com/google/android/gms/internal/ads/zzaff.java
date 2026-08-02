package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.fn0;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaff {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r12 != 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafe a(zzet zzetVar, boolean z) {
        int i;
        int h = zzetVar.h(5);
        if (h == 31) {
            h = zzetVar.h(6) + 32;
        }
        int b2 = b(zzetVar);
        int h2 = zzetVar.h(4);
        String g = me4.g(h, "mp4a.40.", new StringBuilder(String.valueOf(h).length() + 8));
        if (h == 5 || h == 29) {
            b2 = b(zzetVar);
            int h3 = zzetVar.h(5);
            if (h3 == 31) {
                h3 = zzetVar.h(6) + 32;
            }
            h = h3;
            if (h == 22) {
                h2 = zzetVar.h(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (h != 1 && h != 2 && h != 3 && h != 4 && h != 6 && h != 7 && h != 17) {
                switch (h) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 31);
                        sb.append("Unsupported audio object type: ");
                        sb.append(h);
                        throw zzat.b(sb.toString());
                }
            }
            if (zzetVar.g()) {
                zzeh.c("Unexpected frameLengthFlag = 1");
            }
            if (zzetVar.g()) {
                zzetVar.f(14);
            }
            boolean g2 = zzetVar.g();
            if (h2 == 0) {
                a70.i();
                return null;
            }
            if (h != 6) {
                if (h == 20) {
                    h = 20;
                }
                if (g2) {
                    if (h == 22) {
                        zzetVar.f(16);
                        i = 22;
                    } else {
                        i = h;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzetVar.f(3);
                    }
                    zzetVar.f(1);
                }
                switch (h) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int h4 = zzetVar.h(2);
                        if (h4 == 2) {
                            i2 = h4;
                        }
                        StringBuilder sb2 = new StringBuilder(fn0.a(i2, 22));
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(i2);
                        throw zzat.b(sb2.toString());
                }
            }
            zzetVar.f(3);
            if (g2) {
            }
            switch (h) {
            }
        }
        int i3 = b[h2];
        if (i3 != -1) {
            return new zzafe(b2, i3, g);
        }
        throw zzat.a(null, null);
    }

    public static int b(zzet zzetVar) {
        int h = zzetVar.h(4);
        if (h == 15) {
            if (zzetVar.b() >= 24) {
                return zzetVar.h(24);
            }
            throw zzat.a(null, "AAC header insufficient data");
        }
        if (h < 13) {
            return a[h];
        }
        throw zzat.a(null, "AAC header wrong Sampling Frequency Index");
    }
}
