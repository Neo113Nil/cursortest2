package qe;

import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qe.y;

/* loaded from: classes10.dex */
final class x implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f82006a = new x();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qd.m mVar = (qd.m) obj;
        y.a aVar = y.a.f82009c;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Y n11 = mVar.n();
        Intrinsics.checkNotNullExpressionValue(n11, "getBooleanType(...)");
        return n11;
    }
}
