package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import com.moloco.sdk.Init;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.d;
import com.moloco.sdk.internal.ilrd.h;
import com.moloco.sdk.internal.services.bidtoken.providers.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes5.dex */
public final class f {
    public static final a f = new a(null);
    public static final int g = 8;
    public static final String h = "IlrdService";
    public final CoroutineScope a;
    public final com.moloco.sdk.internal.ilrd.b b;
    public final Lazy c;
    public final Set<d> d;
    public Job e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribe$1", f = "IlrdService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<d> a = f.this.a();
            f fVar = f.this;
            for (d dVar : a) {
                h value = dVar.getState().getValue();
                if (value instanceof h.a) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, f.h, "Failed to subscribe to " + dVar.a() + " ILRD: " + ((h.a) value).b(), null, false, 12, null);
                } else if (value instanceof h.c) {
                    fVar.a(dVar);
                } else if (!(value instanceof h.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribeToProvider$2$1", f = "IlrdService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<d.a, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d.a aVar, Continuation<? super Unit> continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = f.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            d.a aVar = (d.a) this.b;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f.h, "Revenue event: " + aVar, null, false, 12, null);
            f.this.b.b(aVar);
            return Unit.INSTANCE;
        }
    }

    public f(CoroutineScope scope, final Context context, com.moloco.sdk.internal.ilrd.b eventsRepository, final List<? extends Init.SDKInitResponse.SupportedNetworks> supportedNetworksList) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventsRepository, "eventsRepository");
        Intrinsics.checkNotNullParameter(supportedNetworksList, "supportedNetworksList");
        this.a = scope;
        this.b = eventsRepository;
        this.c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(supportedNetworksList, context, this);
            }
        });
        this.d = Collections.synchronizedSet(new LinkedHashSet());
    }

    public final synchronized void c() {
        Job launch$default;
        Job job = this.e;
        if (job == null || !job.isActive()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new b(null), 3, null);
            this.e = launch$default;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = com.moloco.sdk.internal.ilrd.g.b(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        p b2;
        com.moloco.sdk.internal.ilrd.b bVar = this.b;
        bVar.i();
        com.moloco.sdk.internal.ilrd.a e = bVar.e();
        if (e != null && b2 != null) {
            return b2;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, h, "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public final List<d> a() {
        return (List) this.c.getValue();
    }

    public static final List a(List list, Context context, f fVar) {
        ArrayList arrayList = new ArrayList();
        if (list.contains(Init.SDKInitResponse.SupportedNetworks.MAX)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, h, "Adding AppLovin as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.a(context, fVar.a));
        }
        if (list.contains(Init.SDKInitResponse.SupportedNetworks.LEVEL_PLAY)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, h, "Adding IronSource as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.b(context, fVar.a));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final void a(d dVar) {
        Object b2 = dVar.b();
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(b2);
        if (m11183exceptionOrNullimpl != null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, h, "Failed to subscribe to " + dVar.a() + " ILRD: " + m11183exceptionOrNullimpl, null, false, 12, null);
        }
        if (Result.m11187isSuccessimpl(b2)) {
            this.d.add(dVar);
            FlowKt.launchIn(FlowKt.onEach(dVar.c(), new c(null)), this.a);
        }
    }
}
