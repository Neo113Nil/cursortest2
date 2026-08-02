package H1;

import b1.C2338G;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4156x;

/* renamed from: H1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1168a {
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {96000, 88200, 64000, AudioFormat.AUDIO_SAMPLE_RATE_48000, AudioFormat.AUDIO_SAMPLE_RATE_44100, AudioFormat.AUDIO_SAMPLE_RATE_32000, AudioFormat.AUDIO_SAMPLE_RATE_24000, 22050, AudioFormat.AUDIO_SAMPLE_RATE_16000, 12000, 11025, AudioFormat.AUDIO_SAMPLE_RATE_8000, 7350};
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: H1.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4377a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4378b;

        /* renamed from: c, reason: collision with root package name */
        public final String f4379c;

        public b(int i10, int i11, String str) {
            this.f4377a = i10;
            this.f4378b = i11;
            this.f4379c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static int c(e1.I i10) {
        int h10 = i10.h(5);
        return h10 == 31 ? i10.h(6) + 32 : h10;
    }

    public static int d(e1.I i10) {
        int h10 = i10.h(4);
        if (h10 == 15) {
            if (i10.b() >= 24) {
                return i10.h(24);
            }
            throw C2338G.a("AAC header insufficient data", null);
        }
        if (h10 < 13) {
            return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[h10];
        }
        throw C2338G.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(e1.I i10, boolean z10) {
        int c10 = c(i10);
        int d10 = d(i10);
        int h10 = i10.h(4);
        String str = "mp4a.40." + c10;
        if (c10 == 5 || c10 == 29) {
            d10 = d(i10);
            c10 = c(i10);
            if (c10 == 22) {
                h10 = i10.h(4);
            }
        }
        if (z10) {
            if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4 && c10 != 6 && c10 != 7 && c10 != 17) {
                switch (c10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C2338G.d("Unsupported audio object type: " + c10);
                }
            }
            g(i10, c10, h10);
            switch (c10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h11 = i10.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw C2338G.d("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i11 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[h10];
        if (i11 != -1) {
            return new b(d10, i11, str);
        }
        throw C2338G.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new e1.I(bArr), false);
    }

    public static void g(e1.I i10, int i11, int i12) {
        if (i10.g()) {
            AbstractC4156x.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (i10.g()) {
            i10.r(14);
        }
        boolean g10 = i10.g();
        if (i12 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i11 == 6 || i11 == 20) {
            i10.r(3);
        }
        if (g10) {
            if (i11 == 22) {
                i10.r(16);
            }
            if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                i10.r(3);
            }
            i10.r(1);
        }
    }
}
