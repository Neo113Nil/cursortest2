package td;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9860z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9814E<InterfaceC9810A> f99434a = new C9814E<>("InvalidModuleNotifier");

    public static final void a(@NotNull wd.L l11) {
        Intrinsics.checkNotNullParameter(l11, "<this>");
        InterfaceC9810A interfaceC9810A = (InterfaceC9810A) l11.F(f99434a);
        if (interfaceC9810A != null) {
            interfaceC9810A.a();
            return;
        }
        String message = "Accessing invalid module descriptor " + l11;
        Intrinsics.checkNotNullParameter(message, "message");
        throw new C9859y(message);
    }
}
