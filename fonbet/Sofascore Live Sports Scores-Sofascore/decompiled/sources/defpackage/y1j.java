package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y1j implements z1j {
    public final q9k a;
    public final String b;
    public final bfe c;

    public y1j(q9k q9kVar, String str, bfe bfeVar) {
        this.a = q9kVar;
        this.b = str;
        this.c = bfeVar;
    }

    @Override // defpackage.z1j
    public final wv9 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1j)) {
            return false;
        }
        y1j y1jVar = (y1j) obj;
        return this.a.equals(y1jVar.a) && this.b.equals(y1jVar.b) && this.c.equals(y1jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ValueHeader(labelText=" + this.a + ", value=" + this.b + ", visibleForChips=" + this.c + ")";
    }
}
