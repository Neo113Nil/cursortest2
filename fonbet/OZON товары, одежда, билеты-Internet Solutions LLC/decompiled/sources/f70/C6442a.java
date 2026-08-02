package f70;

import We.B;
import We.G;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: f70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6442a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z60.a f62944a;

    public C6442a(@NotNull Z60.a localDataSource) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        this.f62944a = localDataSource;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        String q11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        boolean d11 = Intrinsics.d(request.j().c(), "mobile/offline/curtains");
        Z60.a aVar = this.f62944a;
        if (d11) {
            G.a aVar2 = new G.a(request);
            String n11 = aVar.n();
            if (n11 != null) {
                if (h.K(n11)) {
                    n11 = null;
                }
                if (n11 != null) {
                    aVar2.d("ETag", n11);
                }
            }
            request = aVar2.b();
        }
        L proceed = chain.proceed(request);
        if (d11 && (q11 = L.q(proceed, "If-None_Match")) != null) {
            String str = h.K(q11) ? null : q11;
            if (str != null) {
                aVar.b(str);
            }
        }
        return proceed;
    }
}
