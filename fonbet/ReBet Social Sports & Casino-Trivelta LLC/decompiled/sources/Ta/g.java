package Ta;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class g extends f implements o {

    public static abstract class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final o f11379a;

        public a(o oVar) {
            this.f11379a = (o) Ra.n.k(oVar);
        }

        @Override // Ta.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final o b() {
            return this.f11379a;
        }
    }

    /* renamed from: c */
    public abstract o a();

    @Override // Ta.o
    public void l(Runnable runnable, Executor executor) {
        a().l(runnable, executor);
    }
}
