package defpackage;

import java.net.SocketTimeoutException;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hh9 extends yk0 {
    public final /* synthetic */ ih9 n;

    public hh9(ih9 ih9Var) {
        this.n = ih9Var;
    }

    @Override // defpackage.yk0
    public final void j() {
        this.n.e(tp5.CANCEL);
        zg9 zg9Var = this.n.b;
        synchronized (zg9Var) {
            long j = zg9Var.o;
            long j2 = zg9Var.n;
            if (j < j2) {
                return;
            }
            zg9Var.n = j2 + 1;
            zg9Var.p = System.nanoTime() + 1000000000;
            Unit unit = Unit.a;
            bui.c(zg9Var.h, mz1.o(new StringBuilder(), zg9Var.c, " ping"), new sr8(zg9Var, 7));
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
