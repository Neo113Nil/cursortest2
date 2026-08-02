package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jv0 {
    public final String a;
    public final byte[] b;
    public final i7f c;

    public jv0(String str, byte[] bArr, i7f i7fVar) {
        this.a = str;
        this.b = bArr;
        this.c = i7fVar;
    }

    public static hcc a() {
        hcc hccVar = new hcc(3, false);
        hccVar.d = i7f.a;
        return hccVar;
    }

    public final jv0 b(i7f i7fVar) {
        hcc a = a();
        a.Y(this.a);
        if (i7fVar == null) {
            yhk.s("Null priority");
            return null;
        }
        a.d = i7fVar;
        a.c = this.b;
        return a.H();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jv0) {
            jv0 jv0Var = (jv0) obj;
            if (this.a.equals(jv0Var.a) && Arrays.equals(this.b, jv0Var.b) && this.c.equals(jv0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return mz1.o(sb, encodeToString, ")");
    }
}
