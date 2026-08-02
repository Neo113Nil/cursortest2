package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rja {
    public final Float a;
    public ig5 b;

    public rja(Float f, ig5 ig5Var) {
        this.a = f;
        this.b = ig5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rja)) {
            return false;
        }
        rja rjaVar = (rja) obj;
        return rjaVar.a.equals(this.a) && Intrinsics.c(rjaVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + wv8.a(0, this.a.hashCode() * 31, 31);
    }
}
