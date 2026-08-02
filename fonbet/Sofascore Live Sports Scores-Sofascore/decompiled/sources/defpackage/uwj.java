package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uwj implements twj {
    public final Object a;
    public final Object b;

    public uwj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.twj
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.twj
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof twj)) {
            return false;
        }
        twj twjVar = (twj) obj;
        return Intrinsics.c(this.a, twjVar.b()) && Intrinsics.c(this.b, twjVar.a());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
