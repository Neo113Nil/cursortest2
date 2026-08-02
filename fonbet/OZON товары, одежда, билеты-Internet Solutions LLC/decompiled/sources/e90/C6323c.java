package e90;

import We.B;
import We.G;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: e90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6323c implements B {
    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        boolean t2 = h.t(chain.request().j().h(), "api.finance.", false);
        G request = chain.request();
        request.getClass();
        G.a aVar = new G.a(request);
        aVar.d("x-obank-newapi", String.valueOf(t2));
        return chain.proceed(aVar.b());
    }
}
