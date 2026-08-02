package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30789a;

    public final class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0 f30790c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, InterfaceC3030n consumer) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f30790c = j0Var;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            H6.a aVar = null;
            try {
                if (H7.k.isValid(kVar) && kVar != null) {
                    aVar = kVar.J();
                }
                o().b(aVar, i10);
                H6.a.U(aVar);
            } catch (Throwable th2) {
                H6.a.U(aVar);
                throw th2;
            }
        }
    }

    public j0(d0 inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f30789a = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30789a.b(new a(this, consumer), context);
    }
}
