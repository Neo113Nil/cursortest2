package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ls8 {
    public final Executor a;
    public final Object b;
    public boolean c;
    public final ArrayList d;

    public ls8(Executor executor, nb3 nb3Var) {
        executor.getClass();
        this.a = executor;
        this.b = new Object();
        this.d = new ArrayList();
    }

    public final void a() {
        synchronized (this.b) {
            try {
                this.c = true;
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.d.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
