package fi0;

import We.B;
import We.G;
import We.L;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<h> f63489a;

    public d(@NotNull List<h> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f63489a = headers;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        for (h hVar : this.f63489a) {
            hVar.getClass();
            aVar2.d("x-o3-internal-headers-token", hVar.a());
        }
        return aVar.proceed(aVar2.b());
    }
}
