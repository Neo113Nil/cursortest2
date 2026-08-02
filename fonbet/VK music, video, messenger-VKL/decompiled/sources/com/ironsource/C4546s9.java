package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* renamed from: com.ironsource.s9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4546s9 {
    public static final a a = new a(null);
    private static final AtomicReference<InterfaceC4374ig> b = new AtomicReference<>(new U6(new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper())));

    /* renamed from: com.ironsource.s9$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final void a() {
            if (Kb.u.d().h().B()) {
                C4546s9.b.set(new L5());
            }
        }

        private a() {
        }
    }

    /* renamed from: com.ironsource.s9$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        public b(Object obj) {
            super(0, obj, Runnable.class, "run", "run()V", 0);
        }

        public final void a() {
            ((Runnable) this.receiver).run();
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            a();
            return s3q0.a;
        }
    }

    public final void a(Runnable runnable) {
        AbstractRunnableC4408ke abstractRunnableC4408ke = runnable instanceof AbstractRunnableC4408ke ? (AbstractRunnableC4408ke) runnable : null;
        if (abstractRunnableC4408ke == null) {
            abstractRunnableC4408ke = AbstractRunnableC4408ke.a.a(new b(runnable));
        }
        InterfaceC4374ig interfaceC4374ig = b.get();
        if (interfaceC4374ig.a()) {
            abstractRunnableC4408ke.run();
        } else {
            interfaceC4374ig.a(abstractRunnableC4408ke);
        }
    }
}
