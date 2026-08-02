package o2;

import b1.C2338G;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public abstract class v {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f59277a;

        /* renamed from: b, reason: collision with root package name */
        public long f59278b;

        /* renamed from: c, reason: collision with root package name */
        public int f59279c;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f59280a;

        /* renamed from: b, reason: collision with root package name */
        public final int f59281b;

        /* renamed from: c, reason: collision with root package name */
        public final int f59282c;
        public final byte[] compatibleProfileLevelSet;

        public c(int i10, int i11, int i12, byte[] bArr) {
            this.f59280a = i10;
            this.f59281b = i11;
            this.f59282c = i12;
            this.compatibleProfileLevelSet = bArr;
        }
    }

    public static int a(int i10) {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return 1024;
        }
        if (i10 == 2 || i10 == 3) {
            return 2048;
        }
        if (i10 == 4) {
            return 4096;
        }
        throw C2338G.d("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    public static double b(int i10) {
        switch (i10) {
            case 14700:
            case AudioFormat.AUDIO_SAMPLE_RATE_16000 /* 16000 */:
                return 3.0d;
            case 22050:
            case AudioFormat.AUDIO_SAMPLE_RATE_24000 /* 24000 */:
                return 2.0d;
            case 29400:
            case AudioFormat.AUDIO_SAMPLE_RATE_32000 /* 32000 */:
            case 58800:
            case 64000:
                return 1.5d;
            case AudioFormat.AUDIO_SAMPLE_RATE_44100 /* 44100 */:
            case AudioFormat.AUDIO_SAMPLE_RATE_48000 /* 48000 */:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw C2338G.d("Unsupported sampling rate " + i10);
        }
    }

    public static int c(int i10) {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return AudioFormat.AUDIO_SAMPLE_RATE_48000;
            case 4:
                return AudioFormat.AUDIO_SAMPLE_RATE_44100;
            case 5:
                return AudioFormat.AUDIO_SAMPLE_RATE_32000;
            case 6:
                return AudioFormat.AUDIO_SAMPLE_RATE_24000;
            case 7:
                return 22050;
            case 8:
                return AudioFormat.AUDIO_SAMPLE_RATE_16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return AudioFormat.AUDIO_SAMPLE_RATE_8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw C2338G.d("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static int d(int i10) {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw C2338G.d("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & 16777215) == 12583333;
    }

    public static int f(e1.I i10) {
        if (!i10.g()) {
            return 0;
        }
        i10.r(2);
        return i10.h(13);
    }

    public static boolean g(e1.I i10, b bVar) {
        i10.d();
        int k10 = k(i10, 3, 8, 8);
        bVar.f59277a = k10;
        if (k10 == -1) {
            return false;
        }
        long l10 = l(i10, 2, 8, 32);
        bVar.f59278b = l10;
        if (l10 == -1) {
            return false;
        }
        if (l10 > 16) {
            throw C2338G.d("Contains sub-stream with an invalid packet label " + bVar.f59278b);
        }
        if (l10 == 0) {
            int i11 = bVar.f59277a;
            if (i11 == 1) {
                throw C2338G.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i11 == 2) {
                throw C2338G.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i11 == 17) {
                throw C2338G.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int k11 = k(i10, 11, 24, 24);
        bVar.f59279c = k11;
        return k11 != -1;
    }

    public static c h(e1.I i10) {
        int h10 = i10.h(8);
        int h11 = i10.h(5);
        int h12 = h11 == 31 ? i10.h(24) : c(h11);
        int h13 = i10.h(3);
        int a10 = a(h13);
        int d10 = d(h13);
        i10.r(2);
        p(i10);
        m(i10, j(i10), d10);
        byte[] bArr = null;
        if (i10.g()) {
            int k10 = k(i10, 2, 4, 8) + 1;
            for (int i11 = 0; i11 < k10; i11++) {
                int k11 = k(i10, 4, 8, 16);
                int k12 = k(i10, 4, 8, 16);
                if (k11 == 7) {
                    int h14 = i10.h(4) + 1;
                    i10.r(4);
                    byte[] bArr2 = new byte[h14];
                    for (int i12 = 0; i12 < h14; i12++) {
                        bArr2[i12] = (byte) i10.h(8);
                    }
                    bArr = bArr2;
                } else {
                    i10.r(k12 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double b10 = b(h12);
        return new c(h10, (int) (h12 * b10), (int) (a10 * b10), bArr3);
    }

    public static boolean i(e1.I i10) {
        i10.r(3);
        boolean g10 = i10.g();
        if (g10) {
            i10.r(13);
        }
        return g10;
    }

    public static int j(e1.I i10) {
        int h10 = i10.h(5);
        int i11 = 0;
        for (int i12 = 0; i12 < h10 + 1; i12++) {
            int h11 = i10.h(3);
            i11 += k(i10, 5, 8, 16) + 1;
            if ((h11 == 0 || h11 == 2) && i10.g()) {
                p(i10);
            }
        }
        return i11;
    }

    public static int k(e1.I i10, int i11, int i12, int i13) {
        AbstractC4134a.a(Math.max(Math.max(i11, i12), i13) <= 31);
        int i14 = (1 << i11) - 1;
        int i15 = (1 << i12) - 1;
        com.google.common.math.d.a(com.google.common.math.d.a(i14, i15), 1 << i13);
        if (i10.b() < i11) {
            return -1;
        }
        int h10 = i10.h(i11);
        if (h10 != i14) {
            return h10;
        }
        if (i10.b() < i12) {
            return -1;
        }
        int h11 = i10.h(i12);
        int i16 = h10 + h11;
        if (h11 != i15) {
            return i16;
        }
        if (i10.b() < i13) {
            return -1;
        }
        return i16 + i10.h(i13);
    }

    public static long l(e1.I i10, int i11, int i12, int i13) {
        AbstractC4134a.a(Math.max(Math.max(i11, i12), i13) <= 63);
        long j10 = (1 << i11) - 1;
        long j11 = (1 << i12) - 1;
        com.google.common.math.e.a(com.google.common.math.e.a(j10, j11), 1 << i13);
        if (i10.b() < i11) {
            return -1L;
        }
        long j12 = i10.j(i11);
        if (j12 != j10) {
            return j12;
        }
        if (i10.b() < i12) {
            return -1L;
        }
        long j13 = i10.j(i12);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (i10.b() < i13) {
            return -1L;
        }
        return j14 + i10.j(i13);
    }

    public static void m(e1.I i10, int i11, int i12) {
        int i13;
        int k10 = k(i10, 4, 8, 16) + 1;
        i10.q();
        for (int i14 = 0; i14 < k10; i14++) {
            int h10 = i10.h(2);
            if (h10 == 0) {
                i(i10);
                if (i12 > 0) {
                    o(i10);
                }
            } else if (h10 == 1) {
                if (i(i10)) {
                    i10.q();
                }
                if (i12 > 0) {
                    o(i10);
                    i13 = i10.h(2);
                } else {
                    i13 = 0;
                }
                if (i13 > 0) {
                    i10.r(6);
                    int h11 = i10.h(2);
                    i10.r(4);
                    if (i10.g()) {
                        i10.r(5);
                    }
                    if (i13 == 2 || i13 == 3) {
                        i10.r(6);
                    }
                    if (h11 == 2) {
                        i10.q();
                    }
                }
                int floor = ((int) Math.floor(Math.log(i11 - 1) / Math.log(2.0d))) + 1;
                int h12 = i10.h(2);
                if (h12 > 0 && i10.g()) {
                    i10.r(floor);
                }
                if (i10.g()) {
                    i10.r(floor);
                }
                if (i12 == 0 && h12 == 0) {
                    i10.q();
                }
            } else if (h10 == 3) {
                k(i10, 4, 8, 16);
                int k11 = k(i10, 4, 8, 16);
                if (i10.g()) {
                    k(i10, 8, 16, 0);
                }
                i10.q();
                if (k11 > 0) {
                    i10.r(k11 * 8);
                }
            }
        }
    }

    public static void n(e1.I i10, int i11) {
        int h10;
        boolean g10 = i10.g();
        int i12 = g10 ? 1 : 5;
        int i13 = g10 ? 7 : 5;
        int i14 = g10 ? 8 : 6;
        int i15 = 0;
        while (i15 < i11) {
            if (i10.g()) {
                i10.r(7);
                h10 = 0;
            } else {
                if (i10.h(2) == 3 && i10.h(i13) * i12 != 0) {
                    i10.q();
                }
                h10 = i10.h(i14) * i12;
                if (h10 != 0 && h10 != 180) {
                    i10.q();
                }
                i10.q();
            }
            if (h10 != 0 && h10 != 180 && i10.g()) {
                i15++;
            }
            i15++;
        }
    }

    public static void o(e1.I i10) {
        i10.r(3);
        i10.r(8);
        boolean g10 = i10.g();
        boolean g11 = i10.g();
        if (g10) {
            i10.r(5);
        }
        if (g11) {
            i10.r(6);
        }
    }

    public static void p(e1.I i10) {
        int h10 = i10.h(2);
        if (h10 == 0) {
            i10.r(6);
            return;
        }
        int k10 = k(i10, 5, 8, 16) + 1;
        if (h10 == 1) {
            i10.r(k10 * 7);
        } else if (h10 == 2) {
            n(i10, k10);
        }
    }
}
