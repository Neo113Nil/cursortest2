package defpackage;

import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zvd extends qgi {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean k(j9e j9eVar, byte[] bArr) {
        if (j9eVar.a() < bArr.length) {
            return false;
        }
        int i = j9eVar.b;
        byte[] bArr2 = new byte[bArr.length];
        j9eVar.k(bArr2, 0, bArr.length);
        j9eVar.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.qgi
    public final long b(j9e j9eVar) {
        byte[] bArr = j9eVar.a;
        return (this.f * kda.C(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.qgi
    public final boolean d(j9e j9eVar, long j, y3g y3gVar) {
        if (k(j9eVar, p)) {
            byte[] copyOf = Arrays.copyOf(j9eVar.a, j9eVar.c);
            int i = copyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            ArrayList s = kda.s(copyOf);
            if (((b) y3gVar.b) == null) {
                qm8 qm8Var = new qm8();
                qm8Var.m = sjc.p("audio/ogg");
                qm8Var.n = sjc.p(MimeTypes.AUDIO_OPUS);
                qm8Var.F = i;
                qm8Var.G = 48000;
                qm8Var.q = s;
                y3gVar.b = new b(qm8Var);
                return true;
            }
        } else {
            boolean k = k(j9eVar, q);
            b bVar = (b) y3gVar.b;
            if (!k) {
                bVar.getClass();
                return false;
            }
            bVar.getClass();
            if (!this.o) {
                this.o = true;
                j9eVar.O(8);
                ric B = w1a.B(hv9.w(w1a.C(j9eVar, false, false).b));
                if (B != null) {
                    qm8 a = ((b) y3gVar.b).a();
                    a.k = B.b(((b) y3gVar.b).l);
                    y3gVar.b = new b(a);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.qgi
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = false;
        }
    }
}
