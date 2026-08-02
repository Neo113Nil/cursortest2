package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafu {
    public static void a(long j, zzeu zzeuVar, zzaht[] zzahtVarArr) {
        int i;
        int i2;
        while (true) {
            if (zzeuVar.B() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (zzeuVar.B() == 0) {
                    i = -1;
                    break;
                }
                int I = zzeuVar.I();
                i3 += I;
                if (I != 255) {
                    i = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (zzeuVar.B() == 0) {
                    i4 = -1;
                    break;
                }
                int I2 = zzeuVar.I();
                i4 += I2;
                if (I2 != 255) {
                    break;
                }
            }
            int i5 = zzeuVar.b + i4;
            if (i4 == -1 || i4 > zzeuVar.B()) {
                zzeh.c("Skipping remainder of malformed SEI NAL unit.");
                i5 = zzeuVar.c;
            } else if (i == 4 && i4 >= 8) {
                int I3 = zzeuVar.I();
                int J = zzeuVar.J();
                if (J == 49) {
                    i2 = zzeuVar.b();
                    J = 49;
                } else {
                    i2 = 0;
                }
                int I4 = zzeuVar.I();
                if (J == 47) {
                    zzeuVar.E(1);
                    J = 47;
                }
                boolean z = I3 == 181 && (J == 49 || J == 47) && I4 == 3;
                if (J == 49) {
                    z &= i2 == 1195456820;
                }
                if (z) {
                    b(j, zzeuVar, zzahtVarArr);
                }
            }
            zzeuVar.D(i5);
        }
    }

    public static void b(long j, zzeu zzeuVar, zzaht[] zzahtVarArr) {
        int I = zzeuVar.I();
        if ((I & 64) != 0) {
            int i = I & 31;
            zzeuVar.E(1);
            int i2 = zzeuVar.b;
            for (zzaht zzahtVar : zzahtVarArr) {
                int i3 = i * 3;
                zzeuVar.D(i2);
                zzahtVar.b(i3, zzeuVar);
                zzguk.f(j != C.TIME_UNSET);
                zzahtVar.f(j, 1, i3, 0, null);
            }
        }
    }
}
