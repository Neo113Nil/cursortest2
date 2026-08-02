package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oek extends yq9 {
    public final String b;
    public final String c;

    public oek(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oek.class != obj.getClass()) {
            return false;
        }
        oek oekVar = (oek) obj;
        return this.a.equals(oekVar.a) && Objects.equals(this.b, oekVar.b) && this.c.equals(oekVar.c);
    }

    public final int hashCode() {
        int c = dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.yq9
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
