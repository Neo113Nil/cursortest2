package com.ironsource;

import com.ironsource.Ff;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;
import xsna.zno;
import xsna.zs6;

/* loaded from: classes13.dex */
public final class Ef implements Ff {
    public static final a c = new a(null);
    private static Hf d = new M5(IronSourceThreadManager.INSTANCE.getLevelPlayThread());
    private final Hf a;
    private final InterfaceC4321fg b;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final Hf a() {
            return Ef.d;
        }

        private a() {
        }

        public final void a(Hf hf) {
            Ef.d = hf;
        }
    }

    public static final class b extends AbstractRunnableC4408ke {
        final /* synthetic */ Runnable b;

        public b(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            this.b.run();
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        public c(Object obj) {
            super(0, obj, AbstractRunnableC4408ke.class, "run", "run()V", 0);
        }

        public final void a() {
            ((AbstractRunnableC4408ke) this.receiver).run();
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            a();
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ef() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Ef(Hf hf, InterfaceC4321fg interfaceC4321fg) {
        this.a = hf;
        this.b = interfaceC4321fg;
    }

    @Override // com.ironsource.Ff
    public Ff.a a(Runnable runnable, long j) {
        return new Ff.a(this.a.a(zno.e(j), new zs6(1, this, a(runnable))));
    }

    public /* synthetic */ Ef(Hf hf, InterfaceC4321fg interfaceC4321fg, int i, zcl zclVar) {
        this((i & 1) != 0 ? d : hf, (i & 2) != 0 ? C4339gg.a(new C4546s9()) : interfaceC4321fg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ef ef, AbstractRunnableC4408ke abstractRunnableC4408ke) {
        ef.b.a(new c(abstractRunnableC4408ke));
    }

    private final AbstractRunnableC4408ke a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC4408ke ? (AbstractRunnableC4408ke) runnable : new b(runnable);
    }
}
