package dc0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dc0.r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6172r extends AbstractC7737t implements Function1<C6179y, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6172r f61580b = new C6172r(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C6179y c6179y) {
        String getAuthCookies = c6179y.b();
        Intrinsics.checkNotNullParameter(getAuthCookies, "$this$getAuthCookies");
        return Boolean.valueOf(C6171q.a(getAuthCookies));
    }
}
