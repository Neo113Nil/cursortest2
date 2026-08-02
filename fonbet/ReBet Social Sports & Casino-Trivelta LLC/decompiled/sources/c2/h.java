package c2;

import H1.H;
import H1.S;
import androidx.media3.common.a;
import b1.C2334C;
import c2.i;
import com.google.common.collect.AbstractC3445z;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;
import e1.J;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: n, reason: collision with root package name */
    public boolean f26885n;
    private static final byte[] OPUS_ID_HEADER_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean n(J j10, byte[] bArr) {
        if (j10.a() < bArr.length) {
            return false;
        }
        int g10 = j10.g();
        byte[] bArr2 = new byte[bArr.length];
        j10.q(bArr2, 0, bArr.length);
        j10.b0(g10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(J j10) {
        return n(j10, OPUS_ID_HEADER_SIGNATURE);
    }

    @Override // c2.i
    public long f(J j10) {
        return c(H.e(j10.f()));
    }

    @Override // c2.i
    public boolean i(J j10, long j11, i.b bVar) {
        if (n(j10, OPUS_ID_HEADER_SIGNATURE)) {
            byte[] copyOf = Arrays.copyOf(j10.f(), j10.j());
            int c10 = H.c(copyOf);
            List a10 = H.a(copyOf);
            if (bVar.f26899a != null) {
                return true;
            }
            bVar.f26899a = new a.b().W("audio/ogg").y0("audio/opus").T(c10).z0(AudioFormat.AUDIO_SAMPLE_RATE_48000).k0(a10).P();
            return true;
        }
        byte[] bArr = OPUS_COMMENT_HEADER_SIGNATURE;
        if (!n(j10, bArr)) {
            AbstractC4134a.i(bVar.f26899a);
            return false;
        }
        AbstractC4134a.i(bVar.f26899a);
        if (this.f26885n) {
            return true;
        }
        this.f26885n = true;
        j10.c0(bArr.length);
        C2334C d10 = S.d(AbstractC3445z.q(S.k(j10, false, false).comments));
        if (d10 == null) {
            return true;
        }
        bVar.f26899a = bVar.f26899a.b().r0(d10.b(bVar.f26899a.f20540l)).P();
        return true;
    }

    @Override // c2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f26885n = false;
        }
    }
}
