package E1;

import e1.InterfaceC4148o;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface b extends Executor {

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f2929a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4148o f2930b;

        public a(Executor executor, InterfaceC4148o interfaceC4148o) {
            this.f2929a = executor;
            this.f2930b = interfaceC4148o;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f2929a.execute(runnable);
        }

        @Override // E1.b
        public void release() {
            this.f2930b.accept(this.f2929a);
        }
    }

    static b B(Executor executor, InterfaceC4148o interfaceC4148o) {
        return new a(executor, interfaceC4148o);
    }

    void release();
}
