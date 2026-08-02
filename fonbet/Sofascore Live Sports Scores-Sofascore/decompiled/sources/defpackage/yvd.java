package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yvd extends qgi {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean k(nkk nkkVar, byte[] bArr) {
        if (nkkVar.c() < bArr.length) {
            return false;
        }
        int i = nkkVar.b;
        byte[] bArr2 = new byte[bArr.length];
        nkkVar.e(bArr2, 0, bArr.length);
        nkkVar.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.qgi
    public final long c(nkk nkkVar) {
        int i;
        byte[] bArr = nkkVar.a;
        byte b = bArr[0];
        int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return (this.f * (i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // defpackage.qgi
    public final boolean e(nkk nkkVar, long j, y3g y3gVar) {
        if (k(nkkVar, p)) {
            byte[] copyOf = Arrays.copyOf(nkkVar.a, nkkVar.c);
            int i = copyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            ArrayList r = hda.r(copyOf);
            if (((sm8) y3gVar.b) == null) {
                pm8 pm8Var = new pm8();
                pm8Var.k = MimeTypes.AUDIO_OPUS;
                pm8Var.x = i;
                pm8Var.y = 48000;
                pm8Var.m = r;
                y3gVar.b = new sm8(pm8Var);
                return true;
            }
        } else {
            boolean k = k(nkkVar, q);
            sm8 sm8Var = (sm8) y3gVar.b;
            if (!k) {
                qx9.u(sm8Var);
                return false;
            }
            qx9.u(sm8Var);
            if (!this.o) {
                this.o = true;
                nkkVar.F(8);
                Metadata a = xxk.a(hv9.w((String[]) xxk.b(nkkVar, false, false).b));
                if (a != null) {
                    pm8 a2 = ((sm8) y3gVar.b).a();
                    Metadata metadata = ((sm8) y3gVar.b).j;
                    if (metadata != null) {
                        a = a.a(metadata.a);
                    }
                    a2.i = a;
                    y3gVar.b = new sm8(a2);
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
