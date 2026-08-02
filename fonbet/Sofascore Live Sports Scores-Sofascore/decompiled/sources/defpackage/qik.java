package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qik implements WildcardType {
    public final Type a;
    public final Type b;

    public qik(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            ilg.c();
            throw null;
        }
        if (typeArr.length != 1) {
            ilg.c();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            kik.l(typeArr[0]);
            this.b = null;
            this.a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        kik.l(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            ilg.c();
            throw null;
        }
        this.b = typeArr2[0];
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && kik.o(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : kik.p;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (this.a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + kik.c0(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + kik.c0(type2);
    }
}
