package xh0;

import We.B;
import We.G;
import We.L;
import Zg0.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xh0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10777b implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e.b.AbstractC0682b.C0683b f105570a;

    public C10777b(@NotNull e.b.AbstractC0682b.C0683b authData) {
        Intrinsics.checkNotNullParameter(authData, "authData");
        this.f105570a = authData;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        G b11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        if (Intrinsics.d(request.d("No-Authorization"), "true")) {
            G.a aVar = new G.a(request);
            aVar.h("No-Authorization");
            b11 = aVar.b();
        } else {
            G.a aVar2 = new G.a(request);
            this.f105570a.getClass();
            aVar2.d("Authorization", V.e.b(new Object[]{null}, 1, "Bearer %s", "format(...)"));
            b11 = aVar2.b();
        }
        return chain.proceed(b11);
    }
}
