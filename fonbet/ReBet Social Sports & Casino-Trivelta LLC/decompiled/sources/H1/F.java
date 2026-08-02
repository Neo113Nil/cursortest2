package H1;

import com.twilio.voice.AudioFormat;

/* loaded from: classes.dex */
public abstract class F {
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {AudioFormat.AUDIO_SAMPLE_RATE_44100, AudioFormat.AUDIO_SAMPLE_RATE_48000, AudioFormat.AUDIO_SAMPLE_RATE_32000};
    private static final int[] BITRATE_V1_L1 = {AudioFormat.AUDIO_SAMPLE_RATE_32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {AudioFormat.AUDIO_SAMPLE_RATE_32000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] BITRATE_V1_L2 = {AudioFormat.AUDIO_SAMPLE_RATE_32000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] BITRATE_V1_L3 = {AudioFormat.AUDIO_SAMPLE_RATE_32000, 40000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] BITRATE_V2 = {AudioFormat.AUDIO_SAMPLE_RATE_8000, AudioFormat.AUDIO_SAMPLE_RATE_16000, AudioFormat.AUDIO_SAMPLE_RATE_24000, AudioFormat.AUDIO_SAMPLE_RATE_32000, 40000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4326a;

        /* renamed from: b, reason: collision with root package name */
        public String f4327b;

        /* renamed from: c, reason: collision with root package name */
        public int f4328c;

        /* renamed from: d, reason: collision with root package name */
        public int f4329d;

        /* renamed from: e, reason: collision with root package name */
        public int f4330e;

        /* renamed from: f, reason: collision with root package name */
        public int f4331f;

        /* renamed from: g, reason: collision with root package name */
        public int f4332g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!F.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f4326a = i11;
            this.f4327b = F.MIME_TYPE_BY_LAYER[3 - i12];
            int i15 = F.SAMPLING_RATE_V1[i14];
            this.f4329d = i15;
            if (i11 == 2) {
                this.f4329d = i15 / 2;
            } else if (i11 == 0) {
                this.f4329d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f4332g = F.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? F.BITRATE_V1_L1[i13 - 1] : F.BITRATE_V2_L1[i13 - 1];
                this.f4331f = i17;
                this.f4328c = (((i17 * 12) / this.f4329d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? F.BITRATE_V1_L2[i13 - 1] : F.BITRATE_V1_L3[i13 - 1];
                    this.f4331f = i18;
                    this.f4328c = ((i18 * 144) / this.f4329d) + i16;
                } else {
                    int i19 = F.BITRATE_V2[i13 - 1];
                    this.f4331f = i19;
                    this.f4328c = (((i12 == 1 ? 72 : 144) * i19) / this.f4329d) + i16;
                }
            }
            this.f4330e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f4326a = aVar.f4326a;
            this.f4327b = aVar.f4327b;
            this.f4328c = aVar.f4328c;
            this.f4329d = aVar.f4329d;
            this.f4330e = aVar.f4330e;
            this.f4331f = aVar.f4331f;
            this.f4332g = aVar.f4332g;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = SAMPLING_RATE_V1[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? BITRATE_V1_L1[i13 - 1] : BITRATE_V2_L1[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? BITRATE_V1_L2[i13 - 1] : BITRATE_V1_L3[i13 - 1] : BITRATE_V2[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
