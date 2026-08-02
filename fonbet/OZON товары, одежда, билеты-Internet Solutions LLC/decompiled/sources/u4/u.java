package u4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import m3.C8049B;

/* loaded from: classes8.dex */
final class u {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f100257a;

        /* renamed from: b, reason: collision with root package name */
        public long f100258b;

        /* renamed from: c, reason: collision with root package name */
        public int f100259c;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f100260a;

        /* renamed from: b, reason: collision with root package name */
        public final int f100261b;

        /* renamed from: c, reason: collision with root package name */
        public final int f100262c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f100263d;

        b(int i11, byte[] bArr, int i12, int i13) {
            this.f100260a = i11;
            this.f100261b = i12;
            this.f100262c = i13;
            this.f100263d = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(C8049B c8049b, a aVar) throws j3.v {
        long j11;
        c8049b.d();
        int c11 = c(c8049b, 3, 8, 8);
        aVar.f100257a = c11;
        if (c11 != -1) {
            G10.a.c(Math.max(Math.max(2, 8), 32) <= 63);
            Q7.d.a(Q7.d.a(3L, 255L), 4294967296L);
            if (c8049b.b() >= 2) {
                j11 = c8049b.j(2);
                if (j11 == 3) {
                    if (c8049b.b() >= 8) {
                        long j12 = c8049b.j(8);
                        j11 += j12;
                        if (j12 == 255) {
                            if (c8049b.b() >= 32) {
                                j11 += c8049b.j(32);
                            }
                        }
                    }
                }
                aVar.f100258b = j11;
                if (j11 != -1) {
                    if (j11 > 16) {
                        throw j3.v.e("Contains sub-stream with an invalid packet label " + aVar.f100258b);
                    }
                    if (j11 == 0) {
                        int i11 = aVar.f100257a;
                        if (i11 == 1) {
                            throw j3.v.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                        }
                        if (i11 == 2) {
                            throw j3.v.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                        }
                        if (i11 == 17) {
                            throw j3.v.a(null, "AudioTruncation packet with invalid packet label 0");
                        }
                    }
                    int c12 = c(c8049b, 11, 24, 24);
                    aVar.f100259c = c12;
                    if (c12 != -1) {
                        return true;
                    }
                }
            }
            j11 = -1;
            aVar.f100258b = j11;
            if (j11 != -1) {
            }
        }
        return false;
    }

    public static b b(C8049B c8049b) throws j3.v {
        int i11;
        int i12;
        char c11;
        int i13;
        int i14;
        int i15;
        int h11 = c8049b.h(8);
        int h12 = c8049b.h(5);
        if (h12 != 31) {
            switch (h12) {
                case 0:
                    i11 = 96000;
                    break;
                case 1:
                    i11 = 88200;
                    break;
                case 2:
                    i11 = 64000;
                    break;
                case 3:
                    i11 = 48000;
                    break;
                case 4:
                    i11 = 44100;
                    break;
                case 5:
                    i11 = 32000;
                    break;
                case 6:
                    i11 = 24000;
                    break;
                case 7:
                    i11 = 22050;
                    break;
                case 8:
                    i11 = 16000;
                    break;
                case 9:
                    i11 = 12000;
                    break;
                case 10:
                    i11 = 11025;
                    break;
                case 11:
                    i11 = 8000;
                    break;
                case 12:
                    i11 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw j3.v.e("Unsupported sampling rate index " + h12);
                case 15:
                    i11 = 57600;
                    break;
                case 16:
                    i11 = 51200;
                    break;
                case 17:
                    i11 = 40000;
                    break;
                case 18:
                    i11 = 38400;
                    break;
                case 19:
                    i11 = 34150;
                    break;
                case 20:
                    i11 = 28800;
                    break;
                case 21:
                    i11 = 25600;
                    break;
                case 22:
                    i11 = 20000;
                    break;
                case 23:
                    i11 = 19200;
                    break;
                case 24:
                    i11 = 17075;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    i11 = 14400;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    i11 = 12800;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i11 = 9600;
                    break;
            }
        } else {
            i11 = c8049b.h(24);
        }
        int h13 = c8049b.h(3);
        int i16 = 1;
        if (h13 == 0) {
            i12 = 768;
        } else if (h13 == 1) {
            i12 = UserVerificationMethods.USER_VERIFY_ALL;
        } else if (h13 == 2 || h13 == 3) {
            i12 = 2048;
        } else {
            if (h13 != 4) {
                throw j3.v.e("Unsupported coreSbrFrameLengthIndex " + h13);
            }
            i12 = 4096;
        }
        if (h13 == 0 || h13 == 1) {
            c11 = 0;
        } else if (h13 == 2) {
            c11 = 2;
        } else if (h13 == 3) {
            c11 = 3;
        } else {
            if (h13 != 4) {
                throw j3.v.e("Unsupported coreSbrFrameLengthIndex " + h13);
            }
            c11 = 1;
        }
        c8049b.p(2);
        e(c8049b);
        int h14 = c8049b.h(5);
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = 16;
            if (i17 < h14 + 1) {
                int h15 = c8049b.h(3);
                i18 += c(c8049b, 5, 8, 16) + 1;
                if ((h15 == 0 || h15 == 2) && c8049b.g()) {
                    e(c8049b);
                }
                i17++;
            } else {
                int c12 = c(c8049b, 4, 8, 16) + 1;
                c8049b.o();
                int i21 = 0;
                while (true) {
                    double d11 = 2.0d;
                    if (i21 >= c12) {
                        byte[] bArr = null;
                        if (c8049b.g()) {
                            int c13 = c(c8049b, 2, 4, 8) + 1;
                            for (int i22 = 0; i22 < c13; i22++) {
                                int c14 = c(c8049b, 4, 8, 16);
                                int c15 = c(c8049b, 4, 8, 16);
                                if (c14 == 7) {
                                    int h16 = c8049b.h(4) + 1;
                                    c8049b.p(4);
                                    byte[] bArr2 = new byte[h16];
                                    for (int i23 = 0; i23 < h16; i23++) {
                                        bArr2[i23] = (byte) c8049b.h(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c8049b.p(c15 * 8);
                                }
                            }
                        }
                        switch (i11) {
                            case 14700:
                            case 16000:
                                d11 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d11 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d11 = 1.0d;
                                break;
                            default:
                                throw j3.v.e("Unsupported sampling rate " + i11);
                        }
                        return new b(h11, bArr, (int) (i11 * d11), (int) (i12 * d11));
                    }
                    int h17 = c8049b.h(2);
                    if (h17 == 0) {
                        i13 = i16;
                        i14 = i21;
                        c8049b.p(3);
                        if (c8049b.g()) {
                            c8049b.p(13);
                        }
                        if (c11 > 0) {
                            d(c8049b);
                        }
                    } else if (h17 != i16) {
                        if (h17 == 3) {
                            c(c8049b, 4, 8, i19);
                            int c16 = c(c8049b, 4, 8, i19);
                            if (c8049b.g()) {
                                c(c8049b, 8, i19, 0);
                            }
                            c8049b.o();
                            if (c16 > 0) {
                                c8049b.p(c16 * 8);
                            }
                        }
                        i13 = i16;
                        i14 = i21;
                    } else {
                        c8049b.p(3);
                        boolean g10 = c8049b.g();
                        if (g10) {
                            c8049b.p(13);
                        }
                        if (g10) {
                            c8049b.o();
                        }
                        if (c11 > 0) {
                            d(c8049b);
                            i15 = c8049b.h(2);
                        } else {
                            i15 = 0;
                        }
                        i13 = i16;
                        if (i15 > 0) {
                            c8049b.p(6);
                            int h18 = c8049b.h(2);
                            c8049b.p(4);
                            if (c8049b.g()) {
                                c8049b.p(5);
                            }
                            if (i15 == 2 || i15 == 3) {
                                c8049b.p(6);
                            }
                            if (h18 == 2) {
                                c8049b.o();
                            }
                        }
                        i14 = i21;
                        int floor = ((int) Math.floor(Math.log(i18 - 1) / Math.log(2.0d))) + 1;
                        int h19 = c8049b.h(2);
                        if (h19 > 0 && c8049b.g()) {
                            c8049b.p(floor);
                        }
                        if (c8049b.g()) {
                            c8049b.p(floor);
                        }
                        if (c11 == 0 && h19 == 0) {
                            c8049b.o();
                        }
                    }
                    i21 = i14 + 1;
                    i16 = i13;
                    i19 = 16;
                }
            }
        }
    }

    private static int c(C8049B c8049b, int i11, int i12, int i13) {
        G10.a.c(Math.max(Math.max(i11, i12), i13) <= 31);
        int i14 = (1 << i11) - 1;
        int i15 = (1 << i12) - 1;
        Q7.c.a(Q7.c.a(i14, i15), 1 << i13);
        if (c8049b.b() < i11) {
            return -1;
        }
        int h11 = c8049b.h(i11);
        if (h11 == i14) {
            if (c8049b.b() < i12) {
                return -1;
            }
            int h12 = c8049b.h(i12);
            h11 += h12;
            if (h12 == i15) {
                if (c8049b.b() < i13) {
                    return -1;
                }
                return c8049b.h(i13) + h11;
            }
        }
        return h11;
    }

    private static void d(C8049B c8049b) {
        c8049b.p(3);
        c8049b.p(8);
        boolean g10 = c8049b.g();
        boolean g11 = c8049b.g();
        if (g10) {
            c8049b.p(5);
        }
        if (g11) {
            c8049b.p(6);
        }
    }

    private static void e(C8049B c8049b) {
        int h11;
        int h12 = c8049b.h(2);
        if (h12 == 0) {
            c8049b.p(6);
            return;
        }
        int c11 = c(c8049b, 5, 8, 16) + 1;
        if (h12 == 1) {
            c8049b.p(c11 * 7);
            return;
        }
        if (h12 == 2) {
            boolean g10 = c8049b.g();
            int i11 = g10 ? 1 : 5;
            int i12 = g10 ? 7 : 5;
            int i13 = g10 ? 8 : 6;
            int i14 = 0;
            while (i14 < c11) {
                if (c8049b.g()) {
                    c8049b.p(7);
                    h11 = 0;
                } else {
                    if (c8049b.h(2) == 3 && c8049b.h(i12) * i11 != 0) {
                        c8049b.o();
                    }
                    h11 = c8049b.h(i13) * i11;
                    if (h11 != 0 && h11 != 180) {
                        c8049b.o();
                    }
                    c8049b.o();
                }
                if (h11 != 0 && h11 != 180 && c8049b.g()) {
                    i14++;
                }
                i14++;
            }
        }
    }
}
