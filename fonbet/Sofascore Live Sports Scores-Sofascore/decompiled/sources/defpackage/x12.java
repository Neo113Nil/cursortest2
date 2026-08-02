package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class x12 {
    public final r9k a;
    public final r9k b;
    public final boolean c;
    public final boolean d;

    public x12(r9k r9kVar, r9k r9kVar2, boolean z, boolean z2) {
        r9kVar.getClass();
        r9kVar2.getClass();
        this.a = r9kVar;
        this.b = r9kVar2;
        this.c = z;
        this.d = z2;
    }

    public r9k a() {
        return this.b;
    }

    public r9k b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x12) {
            return Intrinsics.c(b(), ((x12) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
