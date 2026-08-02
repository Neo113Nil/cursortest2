package H1;

import b1.C2338G;
import com.twilio.voice.AudioFormat;
import java.io.EOFException;

/* renamed from: H1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1185s {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw C2338G.a(str, null);
        }
    }

    public static int b(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return AudioFormat.AUDIO_SAMPLE_RATE_16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return AudioFormat.AUDIO_SAMPLE_RATE_8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean c(InterfaceC1184q interfaceC1184q, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return interfaceC1184q.e(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int d(InterfaceC1184q interfaceC1184q, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int k10 = interfaceC1184q.k(bArr, i10 + i12, i11 - i12);
            if (k10 == -1) {
                break;
            }
            i12 += k10;
        }
        return i12;
    }

    public static boolean e(InterfaceC1184q interfaceC1184q, byte[] bArr, int i10, int i11) {
        try {
            interfaceC1184q.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(InterfaceC1184q interfaceC1184q, int i10) {
        try {
            interfaceC1184q.l(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
