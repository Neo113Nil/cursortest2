package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class us0 extends uw3 {
    public final List a;
    public final String b;

    public us0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uw3)) {
            return false;
        }
        us0 us0Var = (us0) ((uw3) obj);
        if (!this.a.equals(us0Var.a)) {
            return false;
        }
        String str = us0Var.b;
        String str2 = this.b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return mz1.o(sb, this.b, "}");
    }
}
