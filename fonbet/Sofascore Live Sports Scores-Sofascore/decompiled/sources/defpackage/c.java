package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements WildcardType, Serializable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public c(Type[] typeArr, Type[] typeArr2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                int length = typeArr2.length;
                if (length > 1) {
                    a70.p("At most one lower bound is supported");
                    throw null;
                }
                if (typeArr.length != 1) {
                    a70.p("Exactly one upper bound must be specified");
                    throw null;
                }
                if (length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    ktm.Q(typeArr[0]);
                    this.c = null;
                    this.b = ktm.M(typeArr[0]);
                    return;
                }
                Objects.requireNonNull(typeArr2[0]);
                ktm.Q(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    a70.p("When lower bound is specified, upper bound must be Object");
                    throw null;
                }
                this.c = ktm.M(typeArr2[0]);
                this.b = Object.class;
                return;
            case 2:
                z6k.a(typeArr, "lower bound for wildcard");
                z6k.a(typeArr2, "upper bound for wildcard");
                u6k u6kVar = u6k.c;
                this.b = u6kVar.c(typeArr);
                this.c = u6kVar.c(typeArr2);
                return;
            default:
                c5n.w(typeArr2.length <= 1);
                c5n.w(typeArr.length == 1);
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    k53.Z(typeArr[0]);
                    this.c = null;
                    this.b = k53.Y(typeArr[0]);
                    return;
                }
                Objects.requireNonNull(typeArr2[0]);
                k53.Z(typeArr2[0]);
                c5n.w(typeArr[0] == Object.class);
                this.c = k53.Y(typeArr2[0]);
                this.b = Object.class;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof WildcardType) || !k53.e0(this, (WildcardType) obj)) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof WildcardType) || !ktm.O(this, (WildcardType) obj)) {
                    break;
                }
                break;
            default:
                if (obj instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) obj;
                    if (((vvf) this.b).equals(Arrays.asList(wildcardType.getLowerBounds())) && ((vvf) this.c).equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                Type type = (Type) obj;
                return type != null ? new Type[]{type} : k53.b;
            case 1:
                Type type2 = (Type) obj;
                return type2 != null ? new Type[]{type2} : ktm.u;
            default:
                vvf vvfVar = (vvf) this.b;
                uea ueaVar = z6k.a;
                return (Type[]) vvfVar.toArray(new Type[0]);
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new Type[]{(Type) obj};
            case 1:
                return new Type[]{(Type) obj};
            default:
                vvf vvfVar = (vvf) this.c;
                uea ueaVar = z6k.a;
                return (Type[]) vvfVar.toArray(new Type[0]);
        }
    }

    public final int hashCode() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Type type = (Type) obj;
                return (((Type) obj2).hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
            case 1:
                Type type2 = (Type) obj;
                return (((Type) obj2).hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
            default:
                return ((vvf) obj2).hashCode() ^ ((vvf) obj).hashCode();
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Type type = (Type) obj2;
                Type type2 = (Type) obj;
                if (type2 != null) {
                    return "? super " + k53.A0(type2);
                }
                if (type == Object.class) {
                    return "?";
                }
                return "? extends " + k53.A0(type);
            case 1:
                Type type3 = (Type) obj;
                if (type3 != null) {
                    return "? super ".concat(String.valueOf(ktm.P(type3)));
                }
                Type type4 = (Type) obj2;
                return type4 == Object.class ? "?" : "? extends ".concat(String.valueOf(ktm.P(type4)));
            default:
                StringBuilder sb = new StringBuilder("?");
                av9 listIterator = ((vvf) obj2).listIterator(0);
                while (listIterator.hasNext()) {
                    Type type5 = (Type) listIterator.next();
                    sb.append(" super ");
                    sb.append(u6k.c.b(type5));
                }
                vvf vvfVar = (vvf) obj;
                uea ueaVar = z6k.a;
                p3f p3fVar = new p3f(new o3f());
                vvfVar.getClass();
                Iterator it = vvfVar.iterator();
                it.getClass();
                kca kcaVar = new kca(it, p3fVar);
                while (kcaVar.hasNext()) {
                    Type type6 = (Type) kcaVar.next();
                    sb.append(" extends ");
                    sb.append(u6k.c.b(type6));
                }
                return sb.toString();
        }
    }
}
