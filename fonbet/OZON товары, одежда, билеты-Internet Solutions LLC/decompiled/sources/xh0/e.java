package xh0;

import We.B;
import We.G;
import We.L;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements B {
    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        aVar2.d("x-o3-sdk-versions", "push_sdk_android/19.8.1");
        return aVar.proceed(aVar2.b());
    }
}
