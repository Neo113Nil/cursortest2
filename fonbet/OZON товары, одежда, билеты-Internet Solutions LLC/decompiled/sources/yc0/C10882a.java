package yc0;

import Sc.InterfaceC4008j;
import We.B;
import We.G;
import We.L;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10882a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<c> f106550a;

    public C10882a(@NotNull InterfaceC4008j<c> headersProvider) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        this.f106550a = headersProvider;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        for (Map.Entry<String, String> entry : this.f106550a.getValue().c().entrySet()) {
            aVar2.d(entry.getKey(), entry.getValue());
        }
        return aVar.proceed(aVar2.b());
    }
}
