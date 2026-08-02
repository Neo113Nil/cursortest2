package com.ironsource;

import com.ironsource.S6;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface Ef {

    public static final class a {
        private final S6.a.InterfaceC0185a a;
        private boolean b;

        public a(S6.a.InterfaceC0185a onCancel) {
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            this.a = onCancel;
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
        private final AbstractRunnableC2512ke a;

        public static final class a {

            /* renamed from: com.ironsource.Ef$b$a$a, reason: collision with other inner class name */
            public static final class C0174a extends AbstractRunnableC2512ke {
                final /* synthetic */ WeakReference<T> b;
                final /* synthetic */ Function1<T, Unit> c;

                /* JADX WARN: Multi-variable type inference failed */
                C0174a(WeakReference<T> weakReference, Function1<? super T, Unit> function1) {
                    this.b = weakReference;
                    this.c = function1;
                }

                @Override // com.ironsource.AbstractRunnableC2512ke
                public void a() {
                    Object obj = this.b.get();
                    if (obj != null) {
                        this.c.invoke(obj);
                    }
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T> b a(T t, Function1<? super T, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                return new b(new C0174a(new WeakReference(t), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(AbstractRunnableC2512ke abstractRunnableC2512ke, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractRunnableC2512ke);
        }

        public final AbstractRunnableC2512ke a() {
            return this.a;
        }

        private b(AbstractRunnableC2512ke abstractRunnableC2512ke) {
            this.a = abstractRunnableC2512ke;
        }
    }

    a a(b bVar, long j);

    a a(Runnable runnable, long j);
}
