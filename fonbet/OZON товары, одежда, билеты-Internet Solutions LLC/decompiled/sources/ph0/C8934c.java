package ph0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ph0.InterfaceC8932a;

/* renamed from: ph0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8934c extends AbstractC7737t implements Function1<InterfaceC8932a.C1363a.C1364a, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final C8934c f80548b = new C8934c(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(InterfaceC8932a.C1363a.C1364a c1364a) {
        InterfaceC8932a.C1363a.C1364a packageInfo = c1364a;
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        return packageInfo.a();
    }
}
