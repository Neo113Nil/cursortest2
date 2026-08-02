package qe;

import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qe.y;

/* renamed from: qe.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9026A implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C9026A f81936a = new C9026A();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qd.m mVar = (qd.m) obj;
        y.c cVar = y.c.f82011c;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Y P11 = mVar.P();
        Intrinsics.checkNotNullExpressionValue(P11, "getUnitType(...)");
        return P11;
    }
}
