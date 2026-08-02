package p30;

import We.B;
import We.G;
import We.L;
import org.jetbrains.annotations.NotNull;

/* renamed from: p30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8849a implements B {
    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        aVar2.a("Authorization", "Bearer vQ8Oxb8WBDDYgugck54Zpnkh9TFemSLTknRlYBkvFQUqvk3ThWt9grc31UELrxy0");
        return aVar.proceed(aVar2.b());
    }
}
