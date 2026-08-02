package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m4k extends o4k {
    public final String a;
    public final String b;

    public m4k(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4k)) {
            return false;
        }
        m4k m4kVar = (m4k) obj;
        return Intrinsics.c(this.a, m4kVar.a) && Intrinsics.c(this.b, m4kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("TwitterImageItem(imageId=", this.a, ", imageUrl=", this.b, ")");
    }
}
