package defpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nf2 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;

    public nf2() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        this.a = linkedHashSet;
        this.b = linkedHashSet2;
        this.c = linkedHashSet3;
        this.d = linkedHashSet4;
        this.e = linkedHashSet5;
        this.f = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf2)) {
            return false;
        }
        nf2 nf2Var = (nf2) obj;
        return this.a.equals(nf2Var.a) && this.b.equals(nf2Var.b) && this.c.equals(nf2Var.c) && this.d.equals(nf2Var.d) && this.e.equals(nf2Var.e) && this.f.equals(nf2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CachedFeedData(mlMediaListIds=" + this.a + ", newsListIds=" + this.b + ", videoListIds=" + this.c + ", influencerVideoListIds=" + this.d + ", shortVideoListIds=" + this.e + ", feedbackPostIds=" + this.f + ")";
    }
}
