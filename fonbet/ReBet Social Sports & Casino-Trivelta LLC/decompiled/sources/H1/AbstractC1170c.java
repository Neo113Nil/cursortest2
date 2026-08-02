package H1;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.C2338G;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4156x;
import e1.Z;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* renamed from: H1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1170c {
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: H1.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4387a;

        /* renamed from: b, reason: collision with root package name */
        public int f4388b;

        /* renamed from: c, reason: collision with root package name */
        public int f4389c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4390d;

        /* renamed from: e, reason: collision with root package name */
        public int f4391e;

        /* renamed from: f, reason: collision with root package name */
        public int f4392f;

        /* renamed from: g, reason: collision with root package name */
        public int f4393g;

        public b() {
            this.f4387a = true;
            this.f4388b = -1;
            this.f4389c = -1;
            this.f4390d = true;
            this.f4391e = 2;
            this.f4392f = 1;
            this.f4393g = 0;
        }
    }

    /* renamed from: H1.c$c, reason: collision with other inner class name */
    public static final class C0096c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4394a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4395b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4396c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4397d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4398e;

        public C0096c(int i10, int i11, int i12, int i13, int i14) {
            this.f4394a = i10;
            this.f4396c = i11;
            this.f4395b = i12;
            this.f4397d = i13;
            this.f4398e = i14;
        }
    }

    public static String a(int i10, int i11, int i12) {
        return Z.G("ac-4.%02d.%02d.%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static void b(int i10, e1.J j10) {
        j10.X(7);
        byte[] f10 = j10.f();
        f10[0] = -84;
        f10[1] = 64;
        f10[2] = -1;
        f10[3] = -1;
        f10[4] = (byte) ((i10 >> 16) & 255);
        f10[5] = (byte) ((i10 >> 8) & 255);
        f10[6] = (byte) (i10 & 255);
    }

    public static int c(int i10, boolean z10, int i11) {
        int d10 = d(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return d10;
        }
        if (!z10) {
            d10 -= 2;
        }
        return i11 != 0 ? i11 != 1 ? d10 : d10 - 2 : d10 - 4;
    }

    public static int d(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x011c, code lost:
    
        if (r5 == 2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.media3.common.a e(e1.J j10, String str, String str2, DrmInitData drmInitData) {
        int i10;
        int i11;
        int i12;
        boolean g10;
        int i13;
        int h10;
        int h11;
        int i14;
        int i15;
        boolean z10;
        boolean g11;
        int i16;
        e1.I i17 = new e1.I();
        i17.m(j10);
        int b10 = i17.b();
        int h12 = i17.h(3);
        if (h12 > 1) {
            throw C2338G.d("Unsupported AC-4 DSI version: " + h12);
        }
        int h13 = i17.h(7);
        int i18 = i17.g() ? AudioFormat.AUDIO_SAMPLE_RATE_48000 : AudioFormat.AUDIO_SAMPLE_RATE_44100;
        i17.r(4);
        int h14 = i17.h(9);
        if (h13 > 1) {
            if (h12 == 0) {
                throw C2338G.d("Invalid AC-4 DSI version: " + h12);
            }
            if (i17.g()) {
                i17.r(16);
                if (i17.g()) {
                    i17.r(128);
                }
            }
        }
        if (h12 == 1) {
            if (!l(i17)) {
                throw C2338G.d("Invalid AC-4 DSI bitrate.");
            }
            i17.c();
        }
        b bVar = new b();
        for (int i19 = 0; i19 < h14; i19++) {
            if (h12 == 0) {
                g10 = i17.g();
                i13 = 8;
                h10 = i17.h(5);
                h11 = i17.h(5);
                i14 = 0;
                i15 = 0;
                z10 = false;
            } else {
                int h15 = i17.h(8);
                i14 = i17.h(8);
                i13 = 8;
                if (i14 == 255) {
                    i14 += i17.h(16);
                }
                if (h15 > 2) {
                    i17.r(i14 * 8);
                } else {
                    int b11 = (b10 - i17.b()) / 8;
                    int h16 = i17.h(5);
                    h11 = h15;
                    h10 = h16;
                    z10 = h16 == 31;
                    i15 = b11;
                    g10 = false;
                }
            }
            bVar.f4392f = h11;
            if (g10 || z10 || h10 != 6) {
                bVar.f4393g = i17.h(3);
                if (i17.g()) {
                    i17.r(5);
                }
                i17.r(2);
                int i20 = 1;
                if (h12 == 1 && (h11 == 1 || h11 == 2)) {
                    i17.r(2);
                }
                i17.r(5);
                i17.r(10);
                if (h12 == 1) {
                    if (h11 > 0) {
                        bVar.f4387a = i17.g();
                    }
                    if (bVar.f4387a) {
                        if (h11 != 1) {
                            i16 = 2;
                        }
                        int h17 = i17.h(5);
                        if (h17 >= 0 && h17 <= 15) {
                            bVar.f4388b = h17;
                        }
                        if (h17 < 11 || h17 > 14) {
                            i16 = 2;
                        } else {
                            bVar.f4390d = i17.g();
                            i16 = 2;
                            bVar.f4391e = i17.h(2);
                        }
                        i17.r(24);
                        i20 = 1;
                    } else {
                        i16 = 2;
                    }
                    if (h11 == i20 || h11 == i16) {
                        if (i17.g() && i17.g()) {
                            i17.r(i16);
                        }
                        if (i17.g()) {
                            i17.q();
                            int i21 = i13;
                            int h18 = i17.h(i21);
                            int i22 = 0;
                            while (i22 < h18) {
                                i17.r(i21);
                                i22++;
                                i21 = 8;
                            }
                        }
                    }
                }
                if (!g10 && !z10) {
                    i17.q();
                    if (h10 == 0 || h10 == 1 || h10 == 2) {
                        if (h11 == 0) {
                            for (int i23 = 0; i23 < 2; i23++) {
                                i(i17, bVar);
                            }
                        } else {
                            for (int i24 = 0; i24 < 2; i24++) {
                                j(i17, bVar);
                            }
                        }
                    } else if (h10 == 3 || h10 == 4) {
                        if (h11 == 0) {
                            for (int i25 = 0; i25 < 3; i25++) {
                                i(i17, bVar);
                            }
                        } else {
                            for (int i26 = 0; i26 < 3; i26++) {
                                j(i17, bVar);
                            }
                        }
                    } else if (h10 != 5) {
                        int h19 = i17.h(7);
                        for (int i27 = 0; i27 < h19; i27++) {
                            i17.r(8);
                        }
                    } else if (h11 == 0) {
                        i(i17, bVar);
                    } else {
                        int h20 = i17.h(3);
                        for (int i28 = 0; i28 < h20 + 2; i28++) {
                            j(i17, bVar);
                        }
                    }
                } else if (h11 == 0) {
                    i(i17, bVar);
                } else {
                    j(i17, bVar);
                }
                i17.q();
                g11 = i17.g();
            } else {
                g11 = true;
            }
            if (g11) {
                int h21 = i17.h(7);
                for (int i29 = 0; i29 < h21; i29++) {
                    i17.r(15);
                }
            }
            if (h11 > 0) {
                if (i17.g() && !l(i17)) {
                    throw C2338G.d("Can't parse bitrate DSI.");
                }
                if (i17.g()) {
                    i17.c();
                    i17.s(i17.h(16));
                    int h22 = i17.h(5);
                    for (int i30 = 0; i30 < h22; i30++) {
                        i17.r(3);
                        i17.r(8);
                    }
                }
            }
            i10 = 8;
            i17.c();
            if (h12 == 1) {
                int b12 = ((b10 - i17.b()) / 8) - i15;
                if (i14 < b12) {
                    throw C2338G.d("pres_bytes is smaller than presentation bytes read.");
                }
                i17.s(i14 - b12);
            }
            if (bVar.f4387a && bVar.f4388b == -1) {
                throw C2338G.d("Can't determine channel mode of presentation " + i19);
            }
            if (bVar.f4387a) {
                int i31 = bVar.f4389c;
                if (i31 > 0) {
                    int i32 = i31 + 1;
                    if (bVar.f4393g == 4 && i32 == 17) {
                        i32 = 21;
                    }
                    i12 = i32;
                } else {
                    int i33 = bVar.f4393g;
                    if (i33 == 0) {
                        i11 = 2;
                    } else if (i33 != 1) {
                        i11 = 2;
                        if (i33 == 2) {
                            i12 = i10;
                        } else if (i33 == 3) {
                            i12 = 10;
                        } else if (i33 != 4) {
                            AbstractC4156x.i("Ac4Util", "AC-4 level " + bVar.f4393g + " has not been defined.");
                        } else {
                            i12 = 12;
                        }
                    } else {
                        i12 = 6;
                    }
                    i12 = i11;
                }
            } else {
                i12 = c(bVar.f4388b, bVar.f4390d, bVar.f4391e);
            }
            if (i12 <= 0) {
                return new a.b().j0(str).y0("audio/ac4").T(i12).z0(i18).c0(drmInitData).n0(str2).U(a(h13, bVar.f4392f, bVar.f4393g)).P();
            }
            throw C2338G.d("Cannot determine channel count of presentation.");
        }
        i10 = 8;
        if (bVar.f4387a) {
        }
        if (i12 <= 0) {
        }
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return g(new e1.I(bArr)).f4398e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0096c g(e1.I i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int h10 = i10.h(16);
        int h11 = i10.h(16);
        if (h11 == 65535) {
            h11 = i10.h(24);
            i11 = 7;
        } else {
            i11 = 4;
        }
        int i15 = h11 + i11;
        if (h10 == 44097) {
            i15 += 2;
        }
        int i16 = i15;
        int h12 = i10.h(2);
        if (h12 == 3) {
            h12 += k(i10, 2);
        }
        int i17 = h12;
        int h13 = i10.h(10);
        if (i10.g() && i10.h(3) > 0) {
            i10.r(2);
        }
        boolean g10 = i10.g();
        int i18 = AudioFormat.AUDIO_SAMPLE_RATE_48000;
        if (g10) {
            i12 = 48000;
        } else {
            i12 = 48000;
            i18 = 44100;
        }
        int h14 = i10.h(4);
        if (i18 == 44100 && h14 == 13) {
            i13 = SAMPLE_COUNT[h14];
        } else {
            if (i18 == i12) {
                int[] iArr = SAMPLE_COUNT;
                if (h14 < iArr.length) {
                    int i19 = iArr[h14];
                    int i20 = h13 % 5;
                    if (i20 != 1) {
                        if (i20 == 2) {
                            if (h14 != 8) {
                            }
                            i13 = i19 + 1;
                        } else if (i20 != 3) {
                            if (i20 == 4) {
                                if (h14 != 3) {
                                    if (h14 != 8) {
                                    }
                                }
                                i13 = i19 + 1;
                            }
                            i14 = i19;
                        }
                        return new C0096c(i17, 2, i18, i16, i14);
                    }
                    if (h14 != 3) {
                    }
                    i13 = i19 + 1;
                }
            }
            i13 = 0;
        }
        i14 = i13;
        return new C0096c(i17, 2, i18, i16, i14);
    }

    public static int h(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        if (i12 == 65535) {
            i12 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    public static void i(e1.I i10, b bVar) {
        int h10 = i10.h(5);
        i10.r(2);
        if (i10.g()) {
            i10.r(5);
        }
        if (h10 >= 7 && h10 <= 10) {
            i10.q();
        }
        if (i10.g()) {
            int h11 = i10.h(3);
            if (bVar.f4388b == -1 && h10 >= 0 && h10 <= 15 && (h11 == 0 || h11 == 1)) {
                bVar.f4388b = h10;
            }
            if (i10.g()) {
                m(i10);
            }
        }
    }

    public static void j(e1.I i10, b bVar) {
        i10.r(2);
        boolean g10 = i10.g();
        int h10 = i10.h(8);
        for (int i11 = 0; i11 < h10; i11++) {
            i10.r(2);
            if (i10.g()) {
                i10.r(5);
            }
            if (g10) {
                i10.r(24);
            } else {
                if (i10.g()) {
                    if (!i10.g()) {
                        i10.r(4);
                    }
                    bVar.f4389c = i10.h(6) + 1;
                }
                i10.r(4);
            }
        }
        if (i10.g()) {
            i10.r(3);
            if (i10.g()) {
                m(i10);
            }
        }
    }

    public static int k(e1.I i10, int i11) {
        int i12 = 0;
        while (true) {
            int h10 = i12 + i10.h(i11);
            if (!i10.g()) {
                return h10;
            }
            i12 = (h10 + 1) << i11;
        }
    }

    public static boolean l(e1.I i10) {
        if (i10.b() < 66) {
            return false;
        }
        i10.r(66);
        return true;
    }

    public static void m(e1.I i10) {
        int h10 = i10.h(6);
        if (h10 < 2 || h10 > 42) {
            throw C2338G.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(h10)));
        }
        i10.r(h10 * 8);
    }
}
