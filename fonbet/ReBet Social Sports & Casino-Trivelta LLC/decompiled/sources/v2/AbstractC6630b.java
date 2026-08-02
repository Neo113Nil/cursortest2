package v2;

import Ph.X;
import Ta.o;
import f0.AbstractC4222c;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6630b {

    /* renamed from: v2.b$a */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC4222c.a f67004d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ X f67005e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4222c.a aVar, X x10) {
            super(1);
            this.f67004d = aVar;
            this.f67005e = x10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            if (th2 == null) {
                this.f67004d.c(this.f67005e.getCompleted());
            } else if (th2 instanceof CancellationException) {
                this.f67004d.d();
            } else {
                this.f67004d.f(th2);
            }
        }
    }

    public static final o b(final X x10, final Object obj) {
        Intrinsics.checkNotNullParameter(x10, "<this>");
        o a10 = AbstractC4222c.a(new AbstractC4222c.InterfaceC0669c() { // from class: v2.a
            @Override // f0.AbstractC4222c.InterfaceC0669c
            public final Object a(AbstractC4222c.a aVar) {
                Object d10;
                d10 = AbstractC6630b.d(X.this, obj, aVar);
                return d10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture { completer ->…      }\n        tag\n    }");
        return a10;
    }

    public static /* synthetic */ o c(X x10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(x10, obj);
    }

    public static final Object d(X this_asListenableFuture, Object obj, AbstractC4222c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}
