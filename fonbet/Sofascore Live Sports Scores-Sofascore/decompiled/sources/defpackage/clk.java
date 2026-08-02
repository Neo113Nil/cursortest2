package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class clk {
    public final String a;
    public final wkk b;

    public clk(String str, wkk wkkVar) {
        this.a = str;
        this.b = wkkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clk)) {
            return false;
        }
        clk clkVar = (clk) obj;
        return Intrinsics.c(this.a, clkVar.a) && this.b.equals(clkVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.a.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Extension(type=" + this.a + ", adVerifications=" + this.b + ')';
    }
}
