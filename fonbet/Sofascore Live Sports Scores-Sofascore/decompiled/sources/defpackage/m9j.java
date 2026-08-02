package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m9j implements CharSequence {
    public final List a;
    public final List b;
    public final CharSequence c;
    public final long d;
    public final pej e;
    public final Pair f;

    public m9j(CharSequence charSequence, long j, pej pejVar, Pair pair, List list, List list2, int i) {
        pejVar = (i & 4) != 0 ? null : pejVar;
        pair = (i & 8) != 0 ? null : pair;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        this.a = list;
        this.b = list2;
        this.c = charSequence instanceof m9j ? ((m9j) charSequence).c : charSequence;
        this.d = t6a.q(charSequence.length(), j);
        this.e = pejVar != null ? new pej(t6a.q(charSequence.length(), pejVar.a)) : null;
        this.f = pair != null ? new Pair(pair.a, new pej(t6a.q(charSequence.length(), ((pej) pair.b).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m9j.class != obj.getClass()) {
            return false;
        }
        m9j m9jVar = (m9j) obj;
        if (pej.c(this.d, m9jVar.d) && Intrinsics.c(this.e, m9jVar.e) && Intrinsics.c(this.f, m9jVar.f) && Intrinsics.c(this.a, m9jVar.a)) {
            return c.j(this.c, m9jVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        int i = pej.c;
        int c = ljg.c(hashCode, 31, this.d);
        pej pejVar = this.e;
        int hashCode2 = (c + (pejVar != null ? Long.hashCode(pejVar.a) : 0)) * 31;
        Pair pair = this.f;
        int hashCode3 = (hashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        List list = this.a;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.c.toString();
    }
}
