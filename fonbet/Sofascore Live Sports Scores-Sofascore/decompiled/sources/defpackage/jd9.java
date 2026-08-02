package defpackage;

import androidx.media3.common.b;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jd9 {
    public final b a;
    public final String b;
    public final String c;

    public jd9(b bVar, String str, String str2) {
        qm8 a = bVar.a();
        a.a = null;
        a.k = null;
        this.a = new b(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd9)) {
            return false;
        }
        jd9 jd9Var = (jd9) obj;
        return this.a.equals(jd9Var.a) && Objects.equals(this.b, jd9Var.b) && Objects.equals(this.c, jd9Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
