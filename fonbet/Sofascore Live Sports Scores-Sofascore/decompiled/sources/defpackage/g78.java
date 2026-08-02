package defpackage;

import androidx.media3.common.b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g78 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;

    public g78(byte[] bArr, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                nm2 nm2Var = new nm2(bArr, bArr.length, 3, (byte) 0);
                nm2Var.q(i * 8);
                this.b = nm2Var.i(16);
                this.c = nm2Var.i(16);
                this.d = nm2Var.i(24);
                this.e = nm2Var.i(24);
                int i3 = nm2Var.i(20);
                this.f = i3;
                this.g = g(i3);
                this.h = nm2Var.i(3) + 1;
                int i4 = nm2Var.i(5) + 1;
                this.i = i4;
                this.j = b(i4);
                this.k = nm2Var.k(36);
                this.l = null;
                this.m = null;
                break;
            default:
                nm2 nm2Var2 = new nm2(bArr, bArr.length, 2, (byte) 0);
                nm2Var2.q(i * 8);
                this.b = nm2Var2.i(16);
                this.c = nm2Var2.i(16);
                this.d = nm2Var2.i(24);
                this.e = nm2Var2.i(24);
                int i5 = nm2Var2.i(20);
                this.f = i5;
                this.g = f(i5);
                this.h = nm2Var2.i(3) + 1;
                int i6 = nm2Var2.i(5) + 1;
                this.i = i6;
                this.j = a(i6);
                int i7 = nm2Var2.i(4);
                int i8 = nm2Var2.i(32);
                int i9 = lik.a;
                this.k = ((i7 & 4294967295L) << 32) | (i8 & 4294967295L);
                this.l = null;
                this.m = null;
                break;
        }
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int f(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        switch (this.a) {
            case 0:
                long j = this.k;
                return j == 0 ? C.TIME_UNSET : (j * 1000000) / this.f;
            default:
                long j2 = this.k;
                return j2 == 0 ? C.TIME_UNSET : (j2 * 1000000) / this.f;
        }
    }

    public sm8 d(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.e;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = (Metadata) this.m;
        if (metadata2 != null) {
            metadata = metadata == null ? metadata2 : metadata2.a(metadata.a);
        }
        pm8 pm8Var = new pm8();
        pm8Var.k = MimeTypes.AUDIO_FLAC;
        pm8Var.l = i;
        pm8Var.x = this.h;
        pm8Var.y = this.f;
        pm8Var.m = Collections.singletonList(bArr);
        pm8Var.i = metadata;
        return new sm8(pm8Var);
    }

    public b e(byte[] bArr, ric ricVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.e;
        if (i <= 0) {
            i = -1;
        }
        ric ricVar2 = (ric) this.m;
        if (ricVar2 != null) {
            ricVar = ricVar2.b(ricVar);
        }
        qm8 qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.AUDIO_FLAC);
        qm8Var.o = i;
        qm8Var.F = this.h;
        qm8Var.G = this.f;
        String str = nik.a;
        qm8Var.H = nik.E(this.i, ByteOrder.LITTLE_ENDIAN);
        qm8Var.q = Collections.singletonList(bArr);
        qm8Var.k = ricVar;
        return new b(qm8Var);
    }

    public g78(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, f78 f78Var, Metadata metadata) {
        this.a = 0;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = f(i5);
        this.h = i6;
        this.i = i7;
        this.j = a(i7);
        this.k = j;
        this.l = f78Var;
        this.m = metadata;
    }

    public g78(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, f78 f78Var, ric ricVar) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = g(i5);
        this.h = i6;
        this.i = i7;
        this.j = b(i7);
        this.k = j;
        this.l = f78Var;
        this.m = ricVar;
    }
}
