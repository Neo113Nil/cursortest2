package di;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4110q0 extends c1 {
    public abstract String f0(String str, String str2);

    public String g0(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.e(i10);
    }

    @Override // di.c1
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final String a0(bi.f fVar, int i10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return i0(g0(fVar, i10));
    }

    public final String i0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) Z();
        if (str == null) {
            str = "";
        }
        return f0(str, nestedName);
    }

    public final String j0() {
        return b0().isEmpty() ? "$" : CollectionsKt.joinToString$default(b0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
