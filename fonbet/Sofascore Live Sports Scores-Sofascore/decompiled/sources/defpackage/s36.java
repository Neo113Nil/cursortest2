package defpackage;

import androidx.media3.common.b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s36 implements lic {
    public static final b g;
    public static final b h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        qm8 qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.APPLICATION_ID3);
        g = new b(qm8Var);
        qm8 qm8Var2 = new qm8();
        qm8Var2.n = sjc.p(MimeTypes.APPLICATION_SCTE35);
        h = new b(qm8Var2);
    }

    public s36(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s36.class != obj.getClass()) {
            return false;
        }
        s36 s36Var = (s36) obj;
        return this.c == s36Var.c && this.d == s36Var.d && Objects.equals(this.a, s36Var.a) && this.b.equals(s36Var.b) && Arrays.equals(this.e, s36Var.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int c = dmi.c((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
        long j = this.c;
        int i2 = (c + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int hashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        this.f = hashCode;
        return hashCode;
    }

    @Override // defpackage.lic
    public final b m() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.lic
    public final byte[] t() {
        if (m() != null) {
            return this.e;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
