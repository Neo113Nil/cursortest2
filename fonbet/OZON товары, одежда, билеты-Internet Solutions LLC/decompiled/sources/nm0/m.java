package nm0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import yl0.C10923h;
import yl0.InterfaceC10918c;

/* loaded from: classes4.dex */
public final class m {

    public static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C10923h<T>.a f77408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10923h<T>.a aVar) {
            super(1);
            this.f77408b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable error = th2;
            Intrinsics.checkNotNullParameter(error, "error");
            this.f77408b.a(error);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends AbstractC7737t implements Function1<T, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C10923h<T>.a f77409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10923h<T>.a aVar) {
            super(1);
            this.f77409b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            this.f77409b.b(obj);
            return Unit.f71690a;
        }
    }

    public static final <T> C10923h<T> a(AbstractC7971a<T> abstractC7971a) {
        Intrinsics.checkNotNullParameter(abstractC7971a, "<this>");
        C10923h c10923h = new C10923h(0);
        Pair pair = new Pair(c10923h, new C10923h.a());
        C10923h<T> c10923h2 = (C10923h) pair.a();
        C10923h.a aVar = (C10923h.a) pair.b();
        final jm0.i a11 = lm0.q.a(abstractC7971a, new a(aVar), new b(aVar));
        c10923h2.g(new InterfaceC10918c() { // from class: nm0.l
            @Override // yl0.InterfaceC10918c
            public final void onComplete() {
                jm0.i disposable = jm0.i.this;
                Intrinsics.checkNotNullParameter(disposable, "$disposable");
                disposable.dispose();
            }
        });
        return c10923h2;
    }
}
