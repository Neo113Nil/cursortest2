package sb;

import Sc.r;
import Sc.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import qb.C9017a;
import rb.InterfaceC9240a;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9240a f98503a;

    public b(@NotNull InterfaceC9240a callingAppRepository) {
        Intrinsics.checkNotNullParameter(callingAppRepository, "callingAppRepository");
        this.f98503a = callingAppRepository;
    }

    @NotNull
    public final Object a(@NotNull C9017a callingAppIds) {
        InterfaceC9240a interfaceC9240a = this.f98503a;
        Intrinsics.checkNotNullParameter(callingAppIds, "callingAppIds");
        try {
            r.Companion companion = r.INSTANCE;
            String c11 = interfaceC9240a.c(callingAppIds.b());
            if (c11 != null) {
                if (h.K(c11)) {
                }
                if (c11 != null || h.K(c11)) {
                    throw new IllegalStateException("Could not retrieve caller package name");
                }
                String a11 = interfaceC9240a.a(c11);
                if (a11 == null || h.K(a11)) {
                    throw new IllegalStateException("Could not retrieve caller pub key");
                }
                return new Za.a(c11, a11);
            }
            c11 = interfaceC9240a.b(callingAppIds.a());
            if (c11 != null) {
            }
            throw new IllegalStateException("Could not retrieve caller package name");
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            return s.a(th2);
        }
    }
}
