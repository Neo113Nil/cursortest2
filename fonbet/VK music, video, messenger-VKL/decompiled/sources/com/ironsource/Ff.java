package com.ironsource;

import com.ironsource.Hf;
import java.lang.ref.WeakReference;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes13.dex */
public interface Ff {

    public static final class a {
        private final Hf.a a;
        private boolean b;

        public a(Hf.a aVar) {
            this.a = aVar;
        }

        public final void a() {
            this.a.cancel();
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public static final class b {
        public static final a b = new a(null);
        private final AbstractRunnableC4408ke a;

        public static final class a {

            /* renamed from: com.ironsource.Ff$b$a$a, reason: collision with other inner class name */
            public static final class C0200a extends AbstractRunnableC4408ke {
                final /* synthetic */ WeakReference<T> b;
                final /* synthetic */ izs<T, s3q0> c;

                /* JADX WARN: Multi-variable type inference failed */
                public C0200a(WeakReference<T> weakReference, izs<? super T, s3q0> izsVar) {
                    this.b = weakReference;
                    this.c = izsVar;
                }

                @Override // com.ironsource.AbstractRunnableC4408ke
                public void a() {
                    Object obj = this.b.get();
                    if (obj != null) {
                        this.c.invoke(obj);
                    }
                }
            }

            public /* synthetic */ a(zcl zclVar) {
                this();
            }

            public final <T> b a(T t, izs<? super T, s3q0> izsVar) {
                return new b(new C0200a(new WeakReference(t), izsVar), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(AbstractRunnableC4408ke abstractRunnableC4408ke, zcl zclVar) {
            this(abstractRunnableC4408ke);
        }

        public final AbstractRunnableC4408ke a() {
            return this.a;
        }

        private b(AbstractRunnableC4408ke abstractRunnableC4408ke) {
            this.a = abstractRunnableC4408ke;
        }
    }

    default a a(b bVar, long j) {
        return a(bVar.a(), j);
    }

    a a(Runnable runnable, long j);
}
