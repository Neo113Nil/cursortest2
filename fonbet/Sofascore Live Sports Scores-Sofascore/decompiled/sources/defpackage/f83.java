package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f83 implements l83 {
    public final tee a;

    public f83(tee teeVar) {
        teeVar.getClass();
        this.a = teeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f83) && Intrinsics.c(this.a, ((f83) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeatmapRow(bitmaps=" + this.a + ")";
    }
}
