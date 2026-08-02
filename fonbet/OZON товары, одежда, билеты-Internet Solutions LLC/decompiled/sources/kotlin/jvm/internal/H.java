package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class H extends AbstractC7724f implements kotlin.reflect.m {
    private final boolean syntheticJavaProperty;

    public H() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public kotlin.reflect.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H) {
            H h11 = (H) obj;
            return getOwner().equals(h11.getOwner()) && getName().equals(h11.getName()) && getSignature().equals(h11.getSignature()) && Intrinsics.d(getBoundReceiver(), h11.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.m) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public String toString() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC7724f
    public kotlin.reflect.m getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (kotlin.reflect.m) super.getReflected();
    }

    public H(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.syntheticJavaProperty = (i11 & 2) == 2;
    }
}
