package di;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4111r0 extends d1 {
    public abstract String a0(String str, String str2);

    public abstract String b0(bi.f fVar, int i10);

    @Override // di.d1
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(bi.f fVar, int i10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return d0(b0(fVar, i10));
    }

    public final String d0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) W();
        if (str == null) {
            str = "";
        }
        return a0(str, nestedName);
    }
}
