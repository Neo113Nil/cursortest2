package pe;

import je.K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8901b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8901b f80408a = new C8901b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        K0 k02 = (K0) obj;
        Intrinsics.f(k02);
        Intrinsics.checkNotNullParameter(k02, "<this>");
        return Boolean.valueOf(k02.H0() instanceof Wd.b);
    }
}
