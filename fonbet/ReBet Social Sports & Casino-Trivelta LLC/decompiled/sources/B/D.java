package B;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class D {
    public static final B a() {
        t tVar = t.f518a;
        Intrinsics.checkNotNull(tVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return tVar;
    }

    public static final B b() {
        z zVar = z.f528a;
        Intrinsics.checkNotNull(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return zVar;
    }

    public static final B c() {
        I i10 = I.f490a;
        Intrinsics.checkNotNull(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return i10;
    }
}
