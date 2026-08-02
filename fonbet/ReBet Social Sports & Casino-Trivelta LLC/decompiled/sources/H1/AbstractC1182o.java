package H1;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.C2338G;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.AudioFormat;
import e1.Z;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;

/* renamed from: H1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1182o {
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, AudioFormat.AUDIO_SAMPLE_RATE_8000, AudioFormat.AUDIO_SAMPLE_RATE_16000, AudioFormat.AUDIO_SAMPLE_RATE_32000, -1, -1, 11025, 22050, AudioFormat.AUDIO_SAMPLE_RATE_44100, -1, -1, 12000, AudioFormat.AUDIO_SAMPLE_RATE_24000, AudioFormat.AUDIO_SAMPLE_RATE_48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] SAMPLE_RATE_BY_INDEX = {AudioFormat.AUDIO_SAMPLE_RATE_8000, AudioFormat.AUDIO_SAMPLE_RATE_16000, AudioFormat.AUDIO_SAMPLE_RATE_32000, 64000, 128000, 22050, AudioFormat.AUDIO_SAMPLE_RATE_44100, 88200, 176400, 352800, 12000, AudioFormat.AUDIO_SAMPLE_RATE_24000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 96000, 192000, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    /* renamed from: H1.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f4471a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4472b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4473c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4474d;

        /* renamed from: e, reason: collision with root package name */
        public final long f4475e;

        /* renamed from: f, reason: collision with root package name */
        public final int f4476f;

        public b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f4471a = str;
            this.f4473c = i10;
            this.f4472b = i11;
            this.f4474d = i12;
            this.f4475e = j10;
            this.f4476f = i13;
        }
    }

    public static void a(byte[] bArr, int i10) {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & UByte.MAX_VALUE) | ((bArr[i11] << 8) & 65535)) != Z.u(bArr, 0, i11, 65535)) {
            throw C2338G.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & UByte.MAX_VALUE) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & UByte.MAX_VALUE) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & UByte.MAX_VALUE) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            return !z10 ? (i11 * 16) / 14 : i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & UByte.MAX_VALUE) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (!z10) {
        }
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static e1.I d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == Byte.MAX_VALUE || b10 == 100 || b10 == 64 || b10 == 113) {
            return new e1.I(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b11 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b11;
            }
        }
        e1.I i12 = new e1.I(copyOf);
        if (copyOf[0] == 31) {
            e1.I i13 = new e1.I(copyOf);
            while (i13.b() >= 16) {
                i13.r(2);
                i12.f(i13.h(14), 14);
            }
        }
        i12.n(copyOf);
        return i12;
    }

    public static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b12 = byteBuffer.get(position);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                b11 = byteBuffer.get(position + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(position + 4) & 1) << 6;
                b10 = byteBuffer.get(position + 5);
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                b11 = byteBuffer.get(position + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(position + 5) & 1) << 6;
        b10 = byteBuffer.get(position + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static androidx.media3.common.a h(byte[] bArr, String str, String str2, int i10, String str3, DrmInitData drmInitData) {
        e1.I d10 = d(bArr);
        d10.r(60);
        int i11 = CHANNELS_BY_AMODE[d10.h(6)];
        int i12 = SAMPLE_RATE_BY_SFREQ[d10.h(4)];
        int h10 = d10.h(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i13 = h10 >= iArr.length ? -1 : (iArr[h10] * 1000) / 2;
        d10.r(10);
        return new a.b().j0(str).W(str3).y0("audio/vnd.dts").S(i13).T(i11 + (d10.h(2) > 0 ? 1 : 0)).z0(i12).c0(drmInitData).n0(str2).w0(i10).P();
    }

    public static b i(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        int i14;
        e1.I d10 = d(bArr);
        d10.r(40);
        int h10 = d10.h(2);
        if (d10.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        d10.r(i11);
        int h11 = d10.h(i10) + 1;
        boolean g10 = d10.g();
        int i15 = -1;
        int i16 = 0;
        if (g10) {
            i12 = d10.h(2);
            int h12 = (d10.h(3) + 1) * 512;
            if (d10.g()) {
                d10.r(36);
            }
            int h13 = d10.h(3) + 1;
            int h14 = d10.h(3) + 1;
            if (h13 != 1 || h14 != 1) {
                throw C2338G.d("Multiple audio presentations or assets not supported");
            }
            int i17 = h10 + 1;
            int h15 = d10.h(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                if (((h15 >> i18) & 1) == 1) {
                    d10.r(8);
                }
            }
            if (d10.g()) {
                d10.r(2);
                int h16 = (d10.h(2) + 1) << 2;
                int h17 = d10.h(2) + 1;
                while (i16 < h17) {
                    d10.r(h16);
                    i16++;
                }
            }
            i16 = h12;
        } else {
            i12 = -1;
        }
        d10.r(i10);
        d10.r(12);
        if (g10) {
            if (d10.g()) {
                d10.r(4);
            }
            if (d10.g()) {
                d10.r(24);
            }
            if (d10.g()) {
                d10.s(d10.h(10) + 1);
            }
            d10.r(5);
            i13 = SAMPLE_RATE_BY_INDEX[d10.h(4)];
            i15 = d10.h(8) + 1;
        } else {
            i13 = -2147483647;
        }
        int i19 = i13;
        if (g10) {
            if (i12 == 0) {
                i14 = AudioFormat.AUDIO_SAMPLE_RATE_32000;
            } else if (i12 == 1) {
                i14 = AudioFormat.AUDIO_SAMPLE_RATE_44100;
            } else {
                if (i12 != 2) {
                    throw C2338G.a("Unsupported reference clock code in DTS HD header: " + i12, null);
                }
                i14 = AudioFormat.AUDIO_SAMPLE_RATE_48000;
            }
            j10 = Z.p1(i16, 1000000L, i14);
        } else {
            j10 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", i15, i19, h11, j10, 0);
    }

    public static int j(byte[] bArr) {
        e1.I d10 = d(bArr);
        d10.r(42);
        return d10.h(d10.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) {
        int i10;
        long j10;
        AtomicInteger atomicInteger2;
        int i11;
        int i12;
        e1.I d10 = d(bArr);
        int i13 = d10.h(32) == 1078008818 ? 1 : 0;
        int m10 = m(d10, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        if (i13 == 0) {
            i10 = -2147483647;
            j10 = -9223372036854775807L;
        } else {
            if (!d10.g()) {
                throw C2338G.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, m10);
            int h10 = d10.h(2);
            if (h10 == 0) {
                i11 = 512;
            } else if (h10 == 1) {
                i11 = 480;
            } else {
                if (h10 != 2) {
                    throw C2338G.a("Unsupported base duration index in DTS UHD header: " + h10, null);
                }
                i11 = 384;
            }
            int h11 = i11 * (d10.h(3) + 1);
            int h12 = d10.h(2);
            if (h12 == 0) {
                i12 = AudioFormat.AUDIO_SAMPLE_RATE_32000;
            } else if (h12 == 1) {
                i12 = AudioFormat.AUDIO_SAMPLE_RATE_44100;
            } else {
                if (h12 != 2) {
                    throw C2338G.a("Unsupported clock rate index in DTS UHD header: " + h12, null);
                }
                i12 = AudioFormat.AUDIO_SAMPLE_RATE_48000;
            }
            if (d10.g()) {
                d10.r(36);
            }
            i10 = (1 << d10.h(2)) * i12;
            j10 = Z.p1(h11, 1000000L, i12);
        }
        int i14 = i10;
        long j11 = j10;
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            i15 += m(d10, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        if (i13 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(d10, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i14, m10 + i15 + (atomicInteger2.get() != 0 ? m(d10, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true) : 0), j11, 0);
    }

    public static int l(byte[] bArr) {
        e1.I d10 = d(bArr);
        d10.r(32);
        return m(d10, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    public static int m(e1.I i10, int[] iArr, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 3 && i10.g(); i13++) {
            i12++;
        }
        if (z10) {
            int i14 = 0;
            while (i11 < i12) {
                i14 += 1 << iArr[i11];
                i11++;
            }
            i11 = i14;
        }
        return i11 + i10.h(iArr[i12]);
    }
}
