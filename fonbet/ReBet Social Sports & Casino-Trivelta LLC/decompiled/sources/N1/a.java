package N1;

import H1.AbstractC1168a;
import H1.O;
import N1.e;
import androidx.media3.common.a;
import com.twilio.voice.AudioFormat;
import e1.J;
import java.util.Collections;

/* loaded from: classes.dex */
public final class a extends e {
    private static final int[] AUDIO_SAMPLING_RATE_TABLE = {5512, 11025, 22050, AudioFormat.AUDIO_SAMPLE_RATE_44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f7854b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7855c;

    /* renamed from: d, reason: collision with root package name */
    public int f7856d;

    public a(O o10) {
        super(o10);
    }

    @Override // N1.e
    public boolean b(J j10) {
        if (this.f7854b) {
            j10.c0(1);
        } else {
            int M10 = j10.M();
            int i10 = (M10 >> 4) & 15;
            this.f7856d = i10;
            if (i10 == 2) {
                this.f7875a.c(new a.b().W("video/x-flv").y0("audio/mpeg").T(1).z0(AUDIO_SAMPLING_RATE_TABLE[(M10 >> 2) & 3]).P());
                this.f7855c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f7875a.c(new a.b().W("video/x-flv").y0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").T(1).z0(AudioFormat.AUDIO_SAMPLE_RATE_8000).P());
                this.f7855c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f7856d);
            }
            this.f7854b = true;
        }
        return true;
    }

    @Override // N1.e
    public boolean c(J j10, long j11) {
        if (this.f7856d == 2) {
            int a10 = j10.a();
            this.f7875a.a(j10, a10);
            this.f7875a.g(j11, 1, a10, 0, null);
            return true;
        }
        int M10 = j10.M();
        if (M10 != 0 || this.f7855c) {
            if (this.f7856d == 10 && M10 != 1) {
                return false;
            }
            int a11 = j10.a();
            this.f7875a.a(j10, a11);
            this.f7875a.g(j11, 1, a11, 0, null);
            return true;
        }
        int a12 = j10.a();
        byte[] bArr = new byte[a12];
        j10.q(bArr, 0, a12);
        AbstractC1168a.b f10 = AbstractC1168a.f(bArr);
        this.f7875a.c(new a.b().W("video/x-flv").y0("audio/mp4a-latm").U(f10.f4379c).T(f10.f4378b).z0(f10.f4377a).k0(Collections.singletonList(bArr)).P());
        this.f7855c = true;
        return false;
    }
}
