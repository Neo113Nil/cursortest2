package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o7f extends yq9 {
    public final String b;
    public final byte[] c;

    public o7f(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o7f.class != obj.getClass()) {
            return false;
        }
        o7f o7fVar = (o7f) obj;
        return this.b.equals(o7fVar.b) && Arrays.equals(this.c, o7fVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
    }

    @Override // defpackage.yq9
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
