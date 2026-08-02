package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b implements ParameterizedType, Serializable {
    public final /* synthetic */ int a;
    public final Type b;
    public final Object c;
    public final Serializable d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Serializable, java.lang.reflect.Type[]] */
    public b(Type type, Class cls, Type[] typeArr, int i) {
        this.a = i;
        switch (i) {
            case 2:
                cls.getClass();
                z1a.s(typeArr.length == cls.getTypeParameters().length);
                z6k.a(typeArr, "type parameter");
                this.b = type;
                this.d = cls;
                this.c = u6k.c.c(typeArr);
                return;
            default:
                Objects.requireNonNull(cls);
                if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                    a70.p("Must specify owner type for ".concat(String.valueOf(cls)));
                    throw null;
                }
                this.b = type != null ? ktm.M(type) : null;
                this.c = ktm.M(cls);
                ?? r3 = (Type[]) typeArr.clone();
                this.d = r3;
                int length = r3.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Objects.requireNonNull(((Type[]) this.d)[i2]);
                    ktm.Q(((Type[]) this.d)[i2]);
                    Type[] typeArr2 = (Type[]) this.d;
                    typeArr2[i2] = ktm.M(typeArr2[i2]);
                }
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof ParameterizedType) || !k53.e0(this, (ParameterizedType) obj)) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof ParameterizedType) || !ktm.O(this, (ParameterizedType) obj)) {
                    break;
                }
                break;
            default:
                if (obj instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) obj;
                    if (((Class) this.d).equals(parameterizedType.getRawType()) && sha.r(this.b, parameterizedType.getOwnerType()) && Arrays.equals((Type[]) ((vvf) this.c).toArray(new Type[0]), parameterizedType.getActualTypeArguments())) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (Type[]) ((Type[]) obj).clone();
            case 1:
                return (Type[]) ((Type[]) obj).clone();
            default:
                return (Type[]) ((vvf) this.c).toArray(new Type[0]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch (this.a) {
            case 0:
                return (Type) this.c;
            case 1:
                return (Type) this.c;
            default:
                return (Class) this.d;
        }
    }

    public final int hashCode() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Type type = this.b;
        switch (i) {
            case 0:
                return (Arrays.hashCode((Type[]) obj) ^ ((Type) obj2).hashCode()) ^ (type != null ? type.hashCode() : 0);
            case 1:
                return (Arrays.hashCode((Type[]) obj) ^ ((Type) obj2).hashCode()) ^ (type != null ? type.hashCode() : 0);
            default:
                return (((vvf) obj2).hashCode() ^ (type != null ? type.hashCode() : 0)) ^ ((Class) obj).hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [w6k] */
    public final String toString() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Type type = (Type) obj;
                Type[] typeArr = (Type[]) obj2;
                int length = typeArr.length;
                if (length == 0) {
                    return k53.A0(type);
                }
                StringBuilder sb = new StringBuilder((length + 1) * 30);
                sb.append(k53.A0(type));
                sb.append("<");
                sb.append(k53.A0(typeArr[0]));
                while (i2 < length) {
                    sb.append(", ");
                    sb.append(k53.A0(typeArr[i2]));
                    i2++;
                }
                sb.append(">");
                return sb.toString();
            case 1:
                Type type2 = (Type) obj;
                Type[] typeArr2 = (Type[]) obj2;
                int length2 = typeArr2.length;
                if (length2 == 0) {
                    return ktm.P(type2);
                }
                StringBuilder sb2 = new StringBuilder((length2 + 1) * 30);
                sb2.append(ktm.P(type2));
                sb2.append("<");
                sb2.append(ktm.P(typeArr2[0]));
                while (i2 < length2) {
                    sb2.append(", ");
                    sb2.append(ktm.P(typeArr2[i2]));
                    i2++;
                }
                sb2.append(">");
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                Type type3 = this.b;
                if (type3 != null) {
                    u6k u6kVar = u6k.c;
                    u6kVar.getClass();
                    if (!(u6kVar instanceof r6k)) {
                        sb3.append(u6kVar.b(type3));
                        sb3.append('.');
                    }
                }
                sb3.append(((Class) obj2).getName());
                sb3.append('<');
                uea ueaVar = z6k.a;
                vvf vvfVar = (vvf) obj;
                final u6k u6kVar2 = u6k.c;
                Objects.requireNonNull(u6kVar2);
                ?? r2 = new xs8() { // from class: w6k
                    @Override // defpackage.xs8
                    public final Object apply(Object obj3) {
                        return u6k.this.b((Type) obj3);
                    }
                };
                vvfVar.getClass();
                sb3.append(ueaVar.e(new ica(vvfVar, (w6k) r2)));
                sb3.append('>');
                return sb3.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Serializable, java.lang.reflect.Type[]] */
    public b(Type type, Type type2, Type[] typeArr) {
        this.a = 0;
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            c5n.w(z);
        }
        this.b = type == null ? null : k53.Y(type);
        this.c = k53.Y(type2);
        ?? r5 = (Type[]) typeArr.clone();
        this.d = r5;
        int length = r5.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(((Type[]) this.d)[i]);
            k53.Z(((Type[]) this.d)[i]);
            Type[] typeArr2 = (Type[]) this.d;
            typeArr2[i] = k53.Y(typeArr2[i]);
        }
    }
}
