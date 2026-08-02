package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aih implements trg {
    public final Object a;
    public final e7d b;
    public final List c;
    public final List d;
    public final tc3 e = new tc3(-322904035, new fvg(this, 10), true);

    public aih(Object obj, e7d e7dVar, List list) {
        this.a = obj;
        this.b = e7dVar;
        this.c = list;
        this.d = a.c(e7dVar);
    }

    @Override // defpackage.trg
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aih.class == obj.getClass()) {
            aih aihVar = (aih) obj;
            if (Intrinsics.c(this.a, aihVar.a) && Intrinsics.c(this.b, aihVar.b) && Intrinsics.c(this.c, aihVar.c) && Intrinsics.c(this.d, aihVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.trg
    public final tc3 getContent() {
        return this.e;
    }

    @Override // defpackage.trg
    public final List getEntries() {
        return this.d;
    }

    @Override // defpackage.trg
    public final Object getKey() {
        return this.a;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SinglePaneScene(key=");
        sb.append(this.a);
        sb.append(", entry=");
        sb.append(this.b);
        sb.append(", previousEntries=");
        sb.append(this.c);
        sb.append(", entries=");
        return fc6.p(sb, this.d, ')');
    }
}
