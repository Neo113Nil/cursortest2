package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h5k {
    public final KClass a;
    public final KType b;

    public h5k(KClass kClass, KType kType) {
        kClass.getClass();
        this.a = kClass;
        this.b = kType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5k)) {
            return false;
        }
        KType kType = this.b;
        if (kType == null) {
            h5k h5kVar = (h5k) obj;
            if (h5kVar.b == null) {
                return Intrinsics.c(this.a, h5kVar.a);
            }
        }
        return Intrinsics.c(kType, ((h5k) obj).b);
    }

    public final int hashCode() {
        KType kType = this.b;
        return kType != null ? kType.hashCode() : this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
