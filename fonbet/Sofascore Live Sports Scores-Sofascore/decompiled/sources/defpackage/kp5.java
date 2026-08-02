package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kp5 extends u4 implements jp5, RandomAccess, Serializable {
    public final Enum[] a;

    public kp5(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new mp5(this.a);
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) ph0.F(r3.ordinal(), this.a)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q4 q4Var = u4.Companion;
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        q4Var.getClass();
        q4.b(i, length);
        return enumArr[i];
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.u4, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ph0.F(ordinal, this.a)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.u4, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ph0.F(ordinal, this.a)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
