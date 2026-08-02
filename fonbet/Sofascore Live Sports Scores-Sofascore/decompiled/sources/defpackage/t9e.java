package defpackage;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t9e {
    public final InputStream a;
    public final String b;

    public t9e(InputStream inputStream, String str) {
        inputStream.getClass();
        this.a = inputStream;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9e)) {
            return false;
        }
        t9e t9eVar = (t9e) obj;
        return Intrinsics.c(this.a, t9eVar.a) && Intrinsics.c(this.b, t9eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParserInput(inputStream=");
        sb.append(this.a);
        sb.append(", baseUrl=");
        return lnb.q(sb, this.b, ')');
    }
}
