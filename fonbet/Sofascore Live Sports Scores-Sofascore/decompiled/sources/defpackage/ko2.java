package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ko2 extends yq9 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final yq9[] g;

    public ko2(String str, int i, int i2, long j, long j2, yq9[] yq9VarArr) {
        super(ChapterFrame.ID);
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = yq9VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ko2.class != obj.getClass()) {
            return false;
        }
        ko2 ko2Var = (ko2) obj;
        return this.c == ko2Var.c && this.d == ko2Var.d && this.e == ko2Var.e && this.f == ko2Var.f && this.b.equals(ko2Var.b) && Arrays.equals(this.g, ko2Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
