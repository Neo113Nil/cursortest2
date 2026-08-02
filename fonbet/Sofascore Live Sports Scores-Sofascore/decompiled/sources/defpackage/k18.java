package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class k18 implements ynf {
    public final File a;
    public final c6h b;
    public final AtomicBoolean c;

    public k18(File file, c6h c6hVar) {
        c6hVar.getClass();
        this.a = file;
        this.b = c6hVar;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.ynf
    public final Object b(ff4 ff4Var) {
        rq3 rq3Var = null;
        if (this.c.get()) {
            a70.r("This scope has already been closed.");
            return null;
        }
        return l6g.T(this.a, new cl(this, rq3Var, 14), ff4Var);
    }

    @Override // defpackage.hz2
    public final void close() {
        this.c.set(true);
    }
}
