package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tq9 implements lic {
    public final byte[] a;
    public final String b;
    public final String c;

    public tq9(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tq9.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((tq9) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return fc6.h(this.a.length, "\"", mz1.s("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }

    @Override // defpackage.lic
    public final void u(o6c o6cVar) {
        String str = this.b;
        if (str != null) {
            o6cVar.a = str;
        }
    }
}
