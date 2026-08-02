package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s1h implements t1h {
    public final Object a;
    public final String b;
    public final boolean c;

    public s1h(Object obj, String str, boolean z) {
        str.getClass();
        this.a = obj;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1h)) {
            return false;
        }
        s1h s1hVar = (s1h) obj;
        return Intrinsics.c(this.a, s1hVar.a) && Intrinsics.c(this.b, s1hVar.b) && this.c == s1hVar.c;
    }

    @Override // defpackage.t1h
    public final Object getItem() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(this.c) + dmi.c((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b);
    }

    @Override // defpackage.t1h
    public final boolean isEnabled() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(item=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return wt3.p(sb, this.c, ")");
    }
}
