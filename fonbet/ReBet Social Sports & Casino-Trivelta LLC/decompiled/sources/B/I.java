package B;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I implements B {

    /* renamed from: a, reason: collision with root package name */
    public static final I f490a = new I();

    @Override // B.B
    public boolean a(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
