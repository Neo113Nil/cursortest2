package com.plaid.internal;

import Ph.AbstractC1455i;
import com.plaid.internal.C3556a6;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.w3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3778w3 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f41160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3787x3 f41161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClientEventOuterClass$ClientEvent.a f41162c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41163d;

    @DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {EnumC3631g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.w3$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f41164a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3787x3 f41165b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ClientEventOuterClass$ClientEvent.a f41166c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f41167d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3787x3 c3787x3, ClientEventOuterClass$ClientEvent.a aVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f41165b = c3787x3;
            this.f41166c = aVar;
            this.f41167d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f41165b, this.f41166c, this.f41167d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (com.plaid.internal.C3787x3.a(r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r6.a(r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41164a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                A3 a32 = this.f41165b.f41186b;
                ClientEventOuterClass$ClientEvent build = this.f41166c.a(this.f41167d).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                this.f41164a = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    C3556a6.f39823a.getClass();
                    C3556a6.a.a("events send", true);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            C3787x3 c3787x3 = this.f41165b;
            this.f41164a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3778w3(C3787x3 c3787x3, ClientEventOuterClass$ClientEvent.a aVar, String str, Continuation<? super C3778w3> continuation) {
        super(2, continuation);
        this.f41161b = c3787x3;
        this.f41162c = aVar;
        this.f41163d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3778w3(this.f41161b, this.f41162c, this.f41163d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((C3778w3) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f41160a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3787x3 c3787x3 = this.f41161b;
            Ph.L l10 = c3787x3.f41187c;
            a aVar = new a(c3787x3, this.f41162c, this.f41163d, null);
            this.f41160a = 1;
            if (AbstractC1455i.g(l10, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
