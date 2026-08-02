package n5;

import org.jetbrains.annotations.NotNull;
import sf.C9684j;
import sf.InterfaceC9683i;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9684j f76543a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C9684j f76544b;

    static {
        C9684j c9684j = C9684j.f98719d;
        f76543a = C9684j.a.c("<svg");
        f76544b = C9684j.a.c("<");
    }

    public static final boolean a(@NotNull InterfaceC9683i interfaceC9683i) {
        long j11;
        if (interfaceC9683i.w1(0L, f76544b)) {
            C9684j c9684j = f76543a;
            if (c9684j.g() <= 0) {
                throw new IllegalArgumentException("bytes is empty");
            }
            byte n11 = c9684j.n(0);
            long g10 = 1024 - c9684j.g();
            long j12 = 0;
            while (true) {
                if (j12 >= g10) {
                    j11 = -1;
                    break;
                }
                InterfaceC9683i interfaceC9683i2 = interfaceC9683i;
                j11 = interfaceC9683i2.b1(n11, j12, g10);
                if (j11 == -1 || interfaceC9683i2.w1(j11, c9684j)) {
                    break;
                }
                j12 = 1 + j11;
                interfaceC9683i = interfaceC9683i2;
            }
            if (j11 != -1) {
                return true;
            }
        }
        return false;
    }
}
