package Sh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class E {
    public static final D b(Object obj) {
        if (obj == AbstractC1564b.f10782a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (D) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC1564b.f10782a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
