package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lo2 extends yq9 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final yq9[] f;

    public lo2(String str, boolean z, boolean z2, String[] strArr, yq9[] yq9VarArr) {
        super(ChapterTocFrame.ID);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = yq9VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lo2.class != obj.getClass()) {
            return false;
        }
        lo2 lo2Var = (lo2) obj;
        return this.c == lo2Var.c && this.d == lo2Var.d && this.b.equals(lo2Var.b) && Arrays.equals(this.e, lo2Var.e) && Arrays.equals(this.f, lo2Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
