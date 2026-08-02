package h5;

import androidx.annotation.NonNull;
import g5.C6627B;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class r<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<T> f64994a = androidx.work.impl.utils.futures.c.k();

    @NonNull
    public static r a(@NonNull androidx.work.impl.C c11) {
        return new q(c11);
    }

    @NonNull
    public final androidx.work.impl.utils.futures.c b() {
        return this.f64994a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.utils.futures.c<T> cVar = this.f64994a;
        try {
            cVar.j((List) C6627B.f63798v.apply(((q) this).f64993b.n().f().u()));
        } catch (Throwable th2) {
            cVar.l(th2);
        }
    }
}
