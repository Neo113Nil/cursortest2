package defpackage;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e45 implements Closeable {
    public final b45 a;
    public boolean b;
    public final /* synthetic */ m45 c;

    public e45(m45 m45Var, b45 b45Var) {
        this.c = m45Var;
        this.a = b45Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        m45 m45Var = this.c;
        synchronized (m45Var) {
            try {
                b45 b45Var = this.a;
                int i = b45Var.h - 1;
                b45Var.h = i;
                if (i == 0 && b45Var.f) {
                    Regex regex = m45.q;
                    m45Var.t(b45Var);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
