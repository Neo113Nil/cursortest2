package Sh;

/* renamed from: Sh.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1576n {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final Ph.L b(Ph.L l10, String str) {
        return str != null ? new y(l10, str) : l10;
    }
}
