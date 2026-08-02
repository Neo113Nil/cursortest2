package defpackage;

import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qg4 {
    public final String a;
    public final char b;
    public final String c;

    public qg4(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = c.r(str, String.valueOf(c), "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg4)) {
            return false;
        }
        qg4 qg4Var = (qg4) obj;
        return this.a.equals(qg4Var.a) && this.b == qg4Var.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
