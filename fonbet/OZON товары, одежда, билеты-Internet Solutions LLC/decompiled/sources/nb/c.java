package nb;

import Pl0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76720a;

    public c() {
        e loggerProvider = e.f22650a;
        Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
        this.f76720a = k.b(new C8482b(0));
    }

    public static final Za.d a(c cVar) {
        return (Za.d) cVar.f76720a.getValue();
    }

    public final Object b(@NotNull String str, @NotNull am0.c cVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new C8481a(str, this, null), cVar);
    }
}
