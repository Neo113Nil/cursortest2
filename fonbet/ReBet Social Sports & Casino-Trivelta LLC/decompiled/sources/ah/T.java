package ah;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class T {
    public static final String a(P p10) {
        Intrinsics.checkNotNullParameter(p10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b(p10));
        if (p10.l() == 0 || p10.l() == p10.k().c()) {
            sb2.append(p10.g());
        } else {
            sb2.append(N.f(p10));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String b(P p10) {
        Intrinsics.checkNotNullParameter(p10, "<this>");
        StringBuilder sb2 = new StringBuilder();
        N.e(sb2, p10.f(), p10.c());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
