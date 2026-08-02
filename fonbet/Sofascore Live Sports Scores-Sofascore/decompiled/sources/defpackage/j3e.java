package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class j3e implements rv2 {
    public final Class a;

    public j3e(Class cls, String str) {
        cls.getClass();
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j3e) {
            return Intrinsics.c(this.a, ((j3e) obj).a);
        }
        return false;
    }

    @Override // defpackage.rv2
    public final Class getJClass() {
        return this.a;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        throw new hka();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
