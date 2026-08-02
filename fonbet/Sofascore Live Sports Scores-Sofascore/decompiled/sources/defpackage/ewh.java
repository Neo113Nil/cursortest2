package defpackage;

import java.io.IOException;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ewh implements db2 {
    public final w52 b;

    @Nullable
    private volatile gz2 closed;

    public ewh(w52 w52Var) {
        this.b = w52Var;
    }

    @Override // defpackage.db2
    public final void a(Throwable th) {
        if (this.closed != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new gz2(new IOException(message, th));
    }

    @Override // defpackage.db2
    public final Throwable b() {
        gz2 gz2Var = this.closed;
        if (gz2Var != null) {
            return gz2Var.a(fz2.b);
        }
        return null;
    }

    @Override // defpackage.db2
    public final w52 f() {
        Throwable b = b();
        if (b == null) {
            return this.b;
        }
        throw b;
    }

    @Override // defpackage.db2
    public final Object g(int i, sq3 sq3Var) {
        Throwable b = b();
        if (b == null) {
            return Boolean.valueOf(this.b.request(i));
        }
        throw b;
    }

    @Override // defpackage.db2
    public final boolean h() {
        return this.b.w();
    }
}
