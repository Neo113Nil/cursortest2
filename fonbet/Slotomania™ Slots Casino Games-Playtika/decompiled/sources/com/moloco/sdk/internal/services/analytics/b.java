package com.moloco.sdk.internal.services.analytics;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class b implements com.moloco.sdk.internal.services.analytics.a {
    public static final int d = 0;
    public final i a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c c;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.analytics.AnalyticsServiceImpl$recordApplicationBackground$1", f = "AnalyticsService.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2 = b.this.b;
                long j = this.c;
                a.AbstractC0383a.C0384a c0384a = a.AbstractC0383a.C0384a.b;
                String a = b.this.c.a();
                this.a = 1;
                aVar = this;
                obj = aVar2.a(j, c0384a, a, aVar);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                aVar = this;
            }
            b.this.a.a((String) obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.analytics.AnalyticsServiceImpl$recordApplicationForeground$1", f = "AnalyticsService.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.services.analytics.b$b, reason: collision with other inner class name */
    public static final class C0261b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0261b(long j, long j2, Continuation<? super C0261b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0261b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0261b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C0261b c0261b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = b.this.b;
                long j = this.c;
                a.AbstractC0383a.b bVar = new a.AbstractC0383a.b(this.d);
                String d = b.this.c.d();
                this.a = 1;
                c0261b = this;
                obj = aVar.a(j, bVar, d, c0261b);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c0261b = this;
            }
            b.this.a.a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public b(i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c configService) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(configService, "configService");
        this.a = persistentHttpRequest;
        this.b = customUserEventBuilderService;
        this.c = configService;
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j, long j2) {
        if (!this.c.c() || this.c.d().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, c.a, "Recording applicationForeground with timestamp: " + j + ", lastBgTimestamp: " + j2, false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.c.a.b(), null, null, new C0261b(j, j2, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j) {
        if (!this.c.c() || this.c.a().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, c.a, "Recording applicationBackground with timestamp: " + j, false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.c.a.b(), null, null, new a(j, null), 3, null);
    }
}
