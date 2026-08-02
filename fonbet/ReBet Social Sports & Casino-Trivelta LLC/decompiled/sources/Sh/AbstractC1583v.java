package Sh;

import Ph.M0;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: Sh.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1583v {
    public static final w a(Throwable th2, String str) {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ w b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(M0 m02) {
        return m02.e2() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final M0 e(InterfaceC1581t interfaceC1581t, List list) {
        try {
            return interfaceC1581t.b(list);
        } catch (Throwable th2) {
            return a(th2, interfaceC1581t.a());
        }
    }
}
