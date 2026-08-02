package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u33 extends yq9 {
    public final String b;
    public final String c;
    public final String d;

    public u33(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u33.class != obj.getClass()) {
            return false;
        }
        u33 u33Var = (u33) obj;
        return this.c.equals(u33Var.c) && this.b.equals(u33Var.b) && Objects.equals(this.d, u33Var.d);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.yq9
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
