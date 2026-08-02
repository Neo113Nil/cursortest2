package Qg;

import Ph.AbstractC1477t0;
import Ph.L;
import java.io.Closeable;

/* loaded from: classes3.dex */
public abstract class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(L l10) {
        try {
            if (l10 instanceof AbstractC1477t0) {
                ((AbstractC1477t0) l10).close();
            } else if (l10 instanceof Closeable) {
                ((Closeable) l10).close();
            }
        } catch (Throwable unused) {
        }
    }
}
