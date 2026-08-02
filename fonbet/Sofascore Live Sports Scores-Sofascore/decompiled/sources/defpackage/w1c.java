package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w1c implements f2c {
    public final r5c a;

    public w1c(r5c r5cVar) {
        r5cVar.getClass();
        this.a = r5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1c) && Intrinsics.c(this.a, ((w1c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HighlightClickAction(item=" + this.a + ")";
    }
}
