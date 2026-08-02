package ah;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class M {
    public static final boolean a(L l10) {
        Intrinsics.checkNotNullParameter(l10, "<this>");
        return Intrinsics.areEqual(l10.d(), "https") || Intrinsics.areEqual(l10.d(), "wss");
    }

    public static final boolean b(L l10) {
        Intrinsics.checkNotNullParameter(l10, "<this>");
        return Intrinsics.areEqual(l10.d(), "ws") || Intrinsics.areEqual(l10.d(), "wss");
    }
}
