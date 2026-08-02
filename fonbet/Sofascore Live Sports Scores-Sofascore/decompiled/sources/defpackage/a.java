package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a implements GenericArrayType, Serializable {
    public final /* synthetic */ int a;
    public final Type b;

    public a(int i, Type type) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = u6k.c.d(type);
                break;
            case 2:
                Objects.requireNonNull(type);
                this.b = ktm.M(type);
                break;
            default:
                Objects.requireNonNull(type);
                this.b = k53.Y(type);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return (obj instanceof GenericArrayType) && k53.e0(this, (GenericArrayType) obj);
            case 1:
                if (obj instanceof GenericArrayType) {
                    return sha.r(this.b, ((GenericArrayType) obj).getGenericComponentType());
                }
                return false;
            default:
                return (obj instanceof GenericArrayType) && ktm.O(this, (GenericArrayType) obj);
        }
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        Type type = this.b;
        switch (i) {
            case 0:
                return k53.A0(type) + "[]";
            case 1:
                StringBuilder sb = new StringBuilder();
                uea ueaVar = z6k.a;
                return mz1.o(sb, type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
            default:
                return String.valueOf(ktm.P(type)).concat("[]");
        }
    }
}
