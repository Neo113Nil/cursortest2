package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d8a extends yq9 {
    public final String b;
    public final String c;
    public final String d;

    public d8a(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d8a.class != obj.getClass()) {
            return false;
        }
        d8a d8aVar = (d8a) obj;
        return this.c.equals(d8aVar.c) && this.b.equals(d8aVar.b) && this.d.equals(d8aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b), 31, this.c);
    }

    @Override // defpackage.yq9
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
