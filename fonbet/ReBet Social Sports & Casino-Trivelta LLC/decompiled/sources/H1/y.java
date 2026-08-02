package H1;

import androidx.media3.common.a;
import b1.C2334C;
import com.twilio.voice.AudioFormat;
import e1.Z;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f4483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4485c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4487e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4488f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4489g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4490h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4491i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4492j;

    /* renamed from: k, reason: collision with root package name */
    public final a f4493k;

    /* renamed from: l, reason: collision with root package name */
    public final C2334C f4494l;

    public static class a {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public a(long[] jArr, long[] jArr2) {
            this.pointSampleNumbers = jArr;
            this.pointOffsets = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        e1.I i11 = new e1.I(bArr);
        i11.p(i10 * 8);
        this.f4483a = i11.h(16);
        this.f4484b = i11.h(16);
        this.f4485c = i11.h(24);
        this.f4486d = i11.h(24);
        int h10 = i11.h(20);
        this.f4487e = h10;
        this.f4488f = j(h10);
        this.f4489g = i11.h(3) + 1;
        int h11 = i11.h(5) + 1;
        this.f4490h = h11;
        this.f4491i = e(h11);
        this.f4492j = i11.j(36);
        this.f4493k = null;
        this.f4494l = null;
    }

    public static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int j(int i10) {
        switch (i10) {
            case AudioFormat.AUDIO_SAMPLE_RATE_8000 /* 8000 */:
                return 4;
            case AudioFormat.AUDIO_SAMPLE_RATE_16000 /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case AudioFormat.AUDIO_SAMPLE_RATE_24000 /* 24000 */:
                return 7;
            case AudioFormat.AUDIO_SAMPLE_RATE_32000 /* 32000 */:
                return 8;
            case AudioFormat.AUDIO_SAMPLE_RATE_44100 /* 44100 */:
                return 9;
            case AudioFormat.AUDIO_SAMPLE_RATE_48000 /* 48000 */:
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

    public y a(List list) {
        return new y(this.f4483a, this.f4484b, this.f4485c, this.f4486d, this.f4487e, this.f4489g, this.f4490h, this.f4492j, this.f4493k, h(new C2334C(list)));
    }

    public y b(a aVar) {
        return new y(this.f4483a, this.f4484b, this.f4485c, this.f4486d, this.f4487e, this.f4489g, this.f4490h, this.f4492j, aVar, this.f4494l);
    }

    public y c(List list) {
        return new y(this.f4483a, this.f4484b, this.f4485c, this.f4486d, this.f4487e, this.f4489g, this.f4490h, this.f4492j, this.f4493k, h(S.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f4486d;
        if (i10 > 0) {
            j10 = (i10 + this.f4485c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f4483a;
            j10 = ((((i11 != this.f4484b || i11 <= 0) ? 4096L : i11) * this.f4489g) * this.f4490h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f4492j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f4487e;
    }

    public androidx.media3.common.a g(byte[] bArr, C2334C c2334c) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i10 = this.f4486d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new a.b().y0("audio/flac").o0(i10).T(this.f4489g).z0(this.f4487e).s0(Z.n0(this.f4490h)).k0(Collections.singletonList(bArr)).r0(h(c2334c)).P();
    }

    public C2334C h(C2334C c2334c) {
        C2334C c2334c2 = this.f4494l;
        return c2334c2 == null ? c2334c : c2334c2.b(c2334c);
    }

    public long i(long j10) {
        return Z.p((j10 * this.f4487e) / 1000000, 0L, this.f4492j - 1);
    }

    public y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, C2334C c2334c) {
        this.f4483a = i10;
        this.f4484b = i11;
        this.f4485c = i12;
        this.f4486d = i13;
        this.f4487e = i14;
        this.f4488f = j(i14);
        this.f4489g = i15;
        this.f4490h = i16;
        this.f4491i = e(i16);
        this.f4492j = j10;
        this.f4493k = aVar;
        this.f4494l = c2334c;
    }
}
