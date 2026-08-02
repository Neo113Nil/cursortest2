package com.facebook.imagepipeline.producers;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o0 implements d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30829c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30830a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f30831b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String c(e0 e0Var) {
            if (!I7.a.b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + e0Var.getId();
        }

        public final boolean d(e0 e0Var) {
            return e0Var.r().G().k() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        public a() {
        }
    }

    public static final class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f30832a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o0 f30833b;

        public b(m0 m0Var, o0 o0Var) {
            this.f30832a = m0Var;
            this.f30833b = o0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f30832a.a();
            this.f30833b.d().a(this.f30832a);
        }
    }

    public static final class c extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3030n f30834f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g0 f30835g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e0 f30836h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ o0 f30837i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3030n interfaceC3030n, g0 g0Var, e0 e0Var, o0 o0Var) {
            super(interfaceC3030n, g0Var, e0Var, "BackgroundThreadHandoffProducer");
            this.f30834f = interfaceC3030n;
            this.f30835g = g0Var;
            this.f30836h = e0Var;
            this.f30837i = o0Var;
        }

        @Override // B6.h
        public void b(Object obj) {
        }

        @Override // B6.h
        public Object c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.m0, B6.h
        public void f(Object obj) {
            this.f30835g.j(this.f30836h, "BackgroundThreadHandoffProducer", null);
            this.f30837i.c().b(this.f30834f, this.f30836h);
        }
    }

    public o0(d0 inputProducer, p0 threadHandoffProducerQueue) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f30830a = inputProducer;
        this.f30831b = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!N7.b.d()) {
            g0 z02 = context.z0();
            a aVar = f30829c;
            if (aVar.d(context)) {
                z02.d(context, "BackgroundThreadHandoffProducer");
                z02.j(context, "BackgroundThreadHandoffProducer", null);
                this.f30830a.b(consumer, context);
                return;
            } else {
                c cVar = new c(consumer, z02, context, this);
                context.k(new b(cVar, this));
                this.f30831b.b(I7.a.a(cVar, aVar.c(context)));
                return;
            }
        }
        N7.b.a("ThreadHandoffProducer#produceResults");
        try {
            g0 z03 = context.z0();
            a aVar2 = f30829c;
            if (aVar2.d(context)) {
                z03.d(context, "BackgroundThreadHandoffProducer");
                z03.j(context, "BackgroundThreadHandoffProducer", null);
                this.f30830a.b(consumer, context);
            } else {
                c cVar2 = new c(consumer, z03, context, this);
                context.k(new b(cVar2, this));
                this.f30831b.b(I7.a.a(cVar2, aVar2.c(context)));
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            N7.b.b();
        }
    }

    public final d0 c() {
        return this.f30830a;
    }

    public final p0 d() {
        return this.f30831b;
    }
}
