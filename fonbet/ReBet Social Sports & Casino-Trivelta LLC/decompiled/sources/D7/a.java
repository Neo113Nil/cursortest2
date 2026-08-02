package D7;

import D6.k;
import com.facebook.imagepipeline.producers.AbstractC3019c;
import com.facebook.imagepipeline.producers.InterfaceC3030n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a extends M6.a {

    /* renamed from: h, reason: collision with root package name */
    public final l0 f2573h;

    /* renamed from: i, reason: collision with root package name */
    public final J7.d f2574i;

    /* renamed from: D7.a$a, reason: collision with other inner class name */
    public static final class C0054a extends AbstractC3019c {
        public C0054a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        public void f() {
            a.this.C();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        public void g(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a.this.D(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        public void h(Object obj, int i10) {
            a aVar = a.this;
            aVar.E(obj, i10, aVar.B());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        public void i(float f10) {
            a.this.r(f10);
        }
    }

    public a(d0 producer, l0 settableProducerContext, J7.d requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f2573h = settableProducerContext;
        this.f2574i = requestListener;
        if (!N7.b.d()) {
            n(settableProducerContext.getExtras());
            if (N7.b.d()) {
                N7.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (!N7.b.d()) {
                producer.b(z(), settableProducerContext);
                return;
            }
            N7.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.b(z(), settableProducerContext);
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
            }
        }
        N7.b.a("AbstractProducerToDataSourceAdapter()");
        try {
            n(settableProducerContext.getExtras());
            if (N7.b.d()) {
                N7.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    Unit unit3 = Unit.INSTANCE;
                    N7.b.b();
                } finally {
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (N7.b.d()) {
                N7.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.b(z(), settableProducerContext);
                    Unit unit4 = Unit.INSTANCE;
                    N7.b.b();
                } finally {
                }
            } else {
                producer.b(z(), settableProducerContext);
            }
            Unit unit5 = Unit.INSTANCE;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Map A(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    public final l0 B() {
        return this.f2573h;
    }

    public final synchronized void C() {
        k.i(j());
    }

    public final void D(Throwable th2) {
        if (super.p(th2, A(this.f2573h))) {
            this.f2574i.i(this.f2573h, th2);
        }
    }

    public void E(Object obj, int i10, e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean d10 = AbstractC3019c.d(i10);
        if (super.t(obj, d10, A(producerContext)) && d10) {
            this.f2574i.e(this.f2573h);
        }
    }

    @Override // M6.a, M6.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.d()) {
            return true;
        }
        this.f2574i.g(this.f2573h);
        this.f2573h.f();
        return true;
    }

    public final InterfaceC3030n z() {
        return new C0054a();
    }
}
