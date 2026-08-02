package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzagp {
    public static boolean a(zzeu zzeuVar, zzagu zzaguVar, int i, zzago zzagoVar) {
        long N = zzeuVar.N();
        long j = N >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = N >> 12;
        long j3 = N >> 8;
        long j4 = N >> 4;
        long j5 = N >> 1;
        long j6 = N & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzaguVar.g - 1) {
                return false;
            }
        } else if (i2 > 10 || zzaguVar.g != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzaguVar.i) || j6 == 1 || !c(zzeuVar, zzaguVar, z, zzagoVar)) {
            return false;
        }
        long j7 = zzagoVar.a;
        int b = b((int) (j2 & 15), zzeuVar);
        long j8 = zzaguVar.j;
        boolean z2 = j8 == 0 || j7 + ((long) b) >= j8;
        if (b == -1) {
            return false;
        }
        if ((!z2 && b < zzaguVar.a) || b > zzaguVar.b) {
            return false;
        }
        int i4 = zzaguVar.e;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzaguVar.f) {
                    return false;
                }
            } else if (i5 != 12) {
                if (i5 > 14) {
                    return false;
                }
                int J = zzeuVar.J();
                if (i5 == 14) {
                    J *= 10;
                }
                if (J != i4) {
                    return false;
                }
            } else if (zzeuVar.I() * 1000 != i4) {
                return false;
            }
        }
        int I = zzeuVar.I();
        int i6 = zzeuVar.b;
        byte[] bArr = zzeuVar.a;
        int i7 = i6 - 1;
        int i8 = 0;
        for (int i9 = zzeuVar.b; i9 < i7; i9++) {
            i8 = zzfm.i[i8 ^ (bArr[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
        }
        String str = zzfm.a;
        if (I != i8) {
            return false;
        }
        if (zzeuVar.B() != 0) {
            int G = zzeuVar.G();
            if ((G & 128) != 0) {
                return false;
            }
            int i10 = (G & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) >> 1;
            if ((i10 >= 2 && i10 <= 7) || (i10 >= 13 && i10 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i10);
                zzeh.b(sb.toString());
                return false;
            }
        }
        return true;
    }

    public static int b(int i, zzeu zzeuVar) {
        switch (i) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzeuVar.I() + 1;
            case 7:
                return zzeuVar.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean c(zzeu zzeuVar, zzagu zzaguVar, boolean z, zzago zzagoVar) {
        try {
            long o = zzeuVar.o();
            if (!z) {
                o *= zzaguVar.b;
            }
            long j = zzaguVar.j;
            if (j != 0 && o > j) {
                return false;
            }
            zzagoVar.a = o;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
