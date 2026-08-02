package cf;

import We.B;
import We.L;
import ef.C6357g;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: cf.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5820a implements B {

    /* renamed from: a, reason: collision with root package name */
    public static final C5820a f57066a = new C5820a();

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6357g c6357g = (C6357g) chain;
        return C6357g.a(c6357g, 0, c6357g.b().n(c6357g), null, 0, 0, 61).proceed(c6357g.f());
    }
}
