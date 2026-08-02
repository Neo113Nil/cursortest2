package com.ironsource;

import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* renamed from: com.ironsource.ke, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractRunnableC4408ke implements Runnable {
    public static final a a = new a(null);

    /* renamed from: com.ironsource.ke$a */
    public static final class a {

        /* renamed from: com.ironsource.ke$a$a, reason: collision with other inner class name */
        public static final class C0222a extends AbstractRunnableC4408ke {
            final /* synthetic */ gzs<s3q0> b;

            public C0222a(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // com.ironsource.AbstractRunnableC4408ke
            public void a() {
                this.b.invoke();
            }
        }

        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final AbstractRunnableC4408ke a(gzs<s3q0> gzsVar) {
            return new C0222a(gzsVar);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(Throwable th) {
        If.a(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            C4452n4.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                C4452n4.d().a(th2);
            }
        }
    }
}
