package defpackage;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q5k {
    public final TypeVariable a;

    public q5k(TypeVariable typeVariable) {
        this.a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q5k)) {
            return false;
        }
        TypeVariable typeVariable = ((q5k) obj).a;
        TypeVariable typeVariable2 = this.a;
        return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
    }

    public final int hashCode() {
        TypeVariable typeVariable = this.a;
        return Arrays.hashCode(new Object[]{typeVariable.getGenericDeclaration(), typeVariable.getName()});
    }

    public final String toString() {
        return this.a.toString();
    }
}
