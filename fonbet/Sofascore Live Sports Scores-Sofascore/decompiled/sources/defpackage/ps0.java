package defpackage;

import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ps0 {
    public final os0 a;
    public final String b;
    public final File c;

    public ps0(os0 os0Var, String str, File file) {
        this.a = os0Var;
        if (str == null) {
            yhk.s("Null sessionId");
            throw null;
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ps0)) {
            return false;
        }
        ps0 ps0Var = (ps0) obj;
        return this.a.equals(ps0Var.a) && this.b.equals(ps0Var.b) && this.c.equals(ps0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
