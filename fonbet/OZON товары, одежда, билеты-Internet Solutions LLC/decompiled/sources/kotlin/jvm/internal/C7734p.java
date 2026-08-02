package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7734p extends AbstractC7724f implements InterfaceC7733o, kotlin.reflect.h {
    private final int arity;
    private final int flags;

    public C7734p(int i11) {
        this(i11, AbstractC7724f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    protected kotlin.reflect.c computeReflected() {
        return N.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7734p) {
            C7734p c7734p = (C7734p) obj;
            return getName().equals(c7734p.getName()) && getSignature().equals(c7734p.getSignature()) && this.flags == c7734p.flags && this.arity == c7734p.arity && Intrinsics.d(getBoundReceiver(), c7734p.getBoundReceiver()) && Intrinsics.d(getOwner(), c7734p.getOwner());
        }
        if (obj instanceof kotlin.reflect.h) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7733o
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C7734p(int i11, Object obj) {
        this(i11, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC7724f
    public kotlin.reflect.h getReflected() {
        return (kotlin.reflect.h) super.getReflected();
    }

    public C7734p(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, (i12 & 1) == 1);
        this.arity = i11;
        this.flags = i12 >> 1;
    }
}
