package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7719a implements InterfaceC7733o, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C7719a(int i11, Class cls, String str, String str2, int i12) {
        this(i11, AbstractC7724f.NO_RECEIVER, cls, str, str2, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7719a)) {
            return false;
        }
        C7719a c7719a = (C7719a) obj;
        return this.isTopLevel == c7719a.isTopLevel && this.arity == c7719a.arity && this.flags == c7719a.flags && Intrinsics.d(this.receiver, c7719a.receiver) && Intrinsics.d(this.owner, c7719a.owner) && this.name.equals(c7719a.name) && this.signature.equals(c7719a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC7733o
    public int getArity() {
        return this.arity;
    }

    public kotlin.reflect.g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? N.c(cls) : N.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((G.g.a(G.g.a((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return N.j(this);
    }

    public C7719a(int i11, Object obj, Class cls, String str, String str2, int i12) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i12 & 1) == 1;
        this.arity = i11;
        this.flags = i12 >> 1;
    }
}
