package qe;

import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qe.y;

/* loaded from: classes10.dex */
final class z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f82012a = new z();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qd.m mVar = (qd.m) obj;
        y.b bVar = y.b.f82010c;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Y z11 = mVar.z();
        Intrinsics.checkNotNullExpressionValue(z11, "getIntType(...)");
        return z11;
    }
}
