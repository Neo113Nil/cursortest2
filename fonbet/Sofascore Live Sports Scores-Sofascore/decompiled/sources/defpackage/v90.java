package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v90 extends yq9 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public v90(String str, String str2, int i, byte[] bArr) {
        super(ApicFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v90.class != obj.getClass()) {
            return false;
        }
        v90 v90Var = (v90) obj;
        return this.d == v90Var.d && this.b.equals(v90Var.b) && Objects.equals(this.c, v90Var.c) && Arrays.equals(this.e, v90Var.e);
    }

    public final int hashCode() {
        int c = dmi.c((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.yq9
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // defpackage.lic
    public final void u(o6c o6cVar) {
        o6cVar.a(this.d, this.e);
    }
}
