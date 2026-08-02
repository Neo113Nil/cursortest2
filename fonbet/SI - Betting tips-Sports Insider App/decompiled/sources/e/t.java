package e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8437a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8438b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8439c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8440d;

    public t(Executor executor, c reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f8437a = executor;
        this.f8438b = new Object();
        this.f8440d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f8438b) {
            try {
                this.f8439c = true;
                Iterator it = this.f8440d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f8440d.clear();
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
