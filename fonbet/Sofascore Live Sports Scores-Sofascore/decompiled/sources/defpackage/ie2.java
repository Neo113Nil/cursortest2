package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ie2 implements Closeable, Flushable {
    public final l45 a;

    public ie2(File file, long j) {
        file.getClass();
        uha uhaVar = s18.a;
        String str = uae.b;
        uae k = tnf.k(file);
        uhaVar.getClass();
        cui cuiVar = cui.l;
        cuiVar.getClass();
        this.a = new l45(uhaVar, k, j, cuiVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void e(qzf qzfVar) {
        qzfVar.getClass();
        l45 l45Var = this.a;
        String B = ktm.B(qzfVar.a);
        synchronized (l45Var) {
            B.getClass();
            l45Var.m();
            l45Var.h();
            l45.Z(B);
            a45 a45Var = (a45) l45Var.i.get(B);
            if (a45Var == null) {
                return;
            }
            l45Var.M(a45Var);
            if (l45Var.g <= l45Var.c) {
                l45Var.o = false;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
