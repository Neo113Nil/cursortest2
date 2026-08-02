package H1;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.AudioFormat;
import e1.Z;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* renamed from: H1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1169b {
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {AudioFormat.AUDIO_SAMPLE_RATE_48000, AudioFormat.AUDIO_SAMPLE_RATE_44100, AudioFormat.AUDIO_SAMPLE_RATE_32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {AudioFormat.AUDIO_SAMPLE_RATE_24000, 22050, AudioFormat.AUDIO_SAMPLE_RATE_16000};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 192, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, 256, EnumC3631g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, 384, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, EnumC3631g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 208, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC3631g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 348, 417, 487, 557, 696, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    /* renamed from: H1.b$b, reason: collision with other inner class name */
    public static final class C0095b {

        /* renamed from: a, reason: collision with root package name */
        public final String f4380a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4381b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4382c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4383d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4384e;

        /* renamed from: f, reason: collision with root package name */
        public final int f4385f;

        /* renamed from: g, reason: collision with root package name */
        public final int f4386g;

        public C0095b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f4380a = str;
            this.f4381b = i10;
            this.f4383d = i11;
            this.f4382c = i12;
            this.f4384e = i13;
            this.f4385f = i14;
            this.f4386g = i15;
        }
    }

    public static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((Z.R(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    public static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = SAMPLE_RATE_BY_FSCOD;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = BITRATE_BY_HALF_FRMSIZECOD[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static androidx.media3.common.a d(e1.J j10, String str, String str2, DrmInitData drmInitData) {
        e1.I i10 = new e1.I();
        i10.m(j10);
        int i11 = SAMPLE_RATE_BY_FSCOD[i10.h(2)];
        i10.r(8);
        int i12 = CHANNEL_COUNT_BY_ACMOD[i10.h(3)];
        if (i10.h(1) != 0) {
            i12++;
        }
        int i13 = BITRATE_BY_HALF_FRMSIZECOD[i10.h(5)] * 1000;
        i10.c();
        j10.b0(i10.d());
        return new a.b().j0(str).y0("audio/ac3").T(i12).z0(i11).c0(drmInitData).n0(str2).S(i13).t0(i13).P();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0095b f(e1.I i10) {
        int c10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int e10 = i10.e();
        i10.r(40);
        boolean z10 = i10.h(5) > 10;
        i10.p(e10);
        int i20 = -1;
        if (z10) {
            i10.r(16);
            int h10 = i10.h(2);
            if (h10 == 0) {
                i20 = 0;
            } else if (h10 == 1) {
                i20 = 1;
            } else if (h10 == 2) {
                i20 = 2;
            }
            i10.r(3);
            c10 = (i10.h(11) + 1) * 2;
            int h11 = i10.h(2);
            if (h11 == 3) {
                i11 = SAMPLE_RATE_BY_FSCOD2[i10.h(2)];
                i15 = 3;
                i16 = 6;
            } else {
                int h12 = i10.h(2);
                int i21 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[h12];
                i15 = h12;
                i11 = SAMPLE_RATE_BY_FSCOD[h11];
                i16 = i21;
            }
            i13 = i16 * 256;
            int a10 = a(c10, i11, i16);
            int h13 = i10.h(3);
            boolean g10 = i10.g();
            i12 = CHANNEL_COUNT_BY_ACMOD[h13] + (g10 ? 1 : 0);
            i10.r(10);
            if (i10.g()) {
                i10.r(8);
            }
            if (h13 == 0) {
                i10.r(5);
                if (i10.g()) {
                    i10.r(8);
                }
            }
            if (i20 == 1 && i10.g()) {
                i10.r(16);
            }
            if (i10.g()) {
                if (h13 > 2) {
                    i10.r(2);
                }
                if ((h13 & 1) == 0 || h13 <= 2) {
                    i18 = 6;
                } else {
                    i18 = 6;
                    i10.r(6);
                }
                if ((h13 & 4) != 0) {
                    i10.r(i18);
                }
                if (g10 && i10.g()) {
                    i10.r(5);
                }
                if (i20 == 0) {
                    if (i10.g()) {
                        i19 = 6;
                        i10.r(6);
                    } else {
                        i19 = 6;
                    }
                    if (h13 == 0 && i10.g()) {
                        i10.r(i19);
                    }
                    if (i10.g()) {
                        i10.r(i19);
                    }
                    int h14 = i10.h(2);
                    if (h14 == 1) {
                        i10.r(5);
                    } else if (h14 == 2) {
                        i10.r(12);
                    } else if (h14 == 3) {
                        int h15 = i10.h(5);
                        if (i10.g()) {
                            i10.r(5);
                            if (i10.g()) {
                                i10.r(4);
                            }
                            if (i10.g()) {
                                i10.r(4);
                            }
                            if (i10.g()) {
                                i10.r(4);
                            }
                            if (i10.g()) {
                                i10.r(4);
                            }
                            if (i10.g()) {
                                i10.r(4);
                            }
                            if (i10.g()) {
                                i10.r(4);
                            }
                            if (i10.g()) {
                                i10.r(4);
                            }
                            if (i10.g()) {
                                if (i10.g()) {
                                    i10.r(4);
                                }
                                if (i10.g()) {
                                    i10.r(4);
                                }
                            }
                        }
                        if (i10.g()) {
                            i10.r(5);
                            if (i10.g()) {
                                i10.r(7);
                                if (i10.g()) {
                                    i10.r(8);
                                }
                            }
                        }
                        i10.r((h15 + 2) * 8);
                        i10.c();
                    }
                    if (h13 < 2) {
                        if (i10.g()) {
                            i10.r(14);
                        }
                        if (h13 == 0 && i10.g()) {
                            i10.r(14);
                        }
                    }
                    if (i10.g()) {
                        if (i15 == 0) {
                            i10.r(5);
                        } else {
                            for (int i22 = 0; i22 < i16; i22++) {
                                if (i10.g()) {
                                    i10.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (i10.g()) {
                i10.r(5);
                if (h13 == 2) {
                    i10.r(4);
                }
                if (h13 >= 6) {
                    i10.r(2);
                }
                if (i10.g()) {
                    i10.r(8);
                }
                if (h13 == 0 && i10.g()) {
                    i10.r(8);
                }
                if (h11 < 3) {
                    i10.q();
                }
            }
            if (i20 == 0 && i15 != 3) {
                i10.q();
            }
            if (i20 == 2 && (i15 == 3 || i10.g())) {
                i17 = 6;
                i10.r(6);
            } else {
                i17 = 6;
            }
            str = (i10.g() && i10.h(i17) == 1 && i10.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = a10;
        } else {
            i10.r(32);
            int h16 = i10.h(2);
            String str2 = h16 == 3 ? null : "audio/ac3";
            int h17 = i10.h(6);
            int i23 = BITRATE_BY_HALF_FRMSIZECOD[h17 / 2] * 1000;
            c10 = c(h16, h17);
            i10.r(8);
            int h18 = i10.h(3);
            if ((h18 & 1) != 0 && h18 != 1) {
                i10.r(2);
            }
            if ((h18 & 4) != 0) {
                i10.r(2);
            }
            if (h18 == 2) {
                i10.r(2);
            }
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            i11 = h16 < iArr.length ? iArr[h16] : -1;
            i12 = CHANNEL_COUNT_BY_ACMOD[h18] + (i10.g() ? 1 : 0);
            i13 = 1536;
            str = str2;
            i14 = i23;
        }
        return new C0095b(str, i20, i12, i11, c10, i13, i14);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & UByte.MAX_VALUE) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    public static androidx.media3.common.a h(e1.J j10, String str, String str2, DrmInitData drmInitData) {
        String str3;
        e1.I i10 = new e1.I();
        i10.m(j10);
        int h10 = i10.h(13) * 1000;
        i10.r(3);
        int i11 = SAMPLE_RATE_BY_FSCOD[i10.h(2)];
        i10.r(10);
        int i12 = CHANNEL_COUNT_BY_ACMOD[i10.h(3)];
        if (i10.h(1) != 0) {
            i12++;
        }
        i10.r(3);
        int h11 = i10.h(4);
        i10.r(1);
        if (h11 > 0) {
            i10.r(6);
            if (i10.h(1) != 0) {
                i12 += 2;
            }
            i10.r(1);
        }
        if (i10.b() > 7) {
            i10.r(7);
            if (i10.h(1) != 0) {
                str3 = "audio/eac3-joc";
                i10.c();
                j10.b0(i10.d());
                return new a.b().j0(str).y0(str3).T(i12).z0(i11).c0(drmInitData).n0(str2).t0(h10).P();
            }
        }
        str3 = "audio/eac3";
        i10.c();
        j10.b0(i10.d());
        return new a.b().j0(str).y0(str3).T(i12).z0(i11).c0(drmInitData).n0(str2).t0(h10).P();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & UByte.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
