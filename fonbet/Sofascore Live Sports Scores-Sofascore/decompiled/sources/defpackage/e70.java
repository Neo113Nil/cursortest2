package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e70 {
    public final KClass a;
    public final Object b;

    public e70(trg trgVar) {
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(trgVar.getClass());
        Object key = trgVar.getKey();
        this.a = orCreateKotlinClass;
        this.b = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e70)) {
            return false;
        }
        e70 e70Var = (e70) obj;
        return Intrinsics.c(this.a, e70Var.a) && Intrinsics.c(this.b, e70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatedSceneKey(clazz=");
        sb.append(this.a);
        sb.append(", key=");
        return lnb.p(sb, this.b, ')');
    }
}
