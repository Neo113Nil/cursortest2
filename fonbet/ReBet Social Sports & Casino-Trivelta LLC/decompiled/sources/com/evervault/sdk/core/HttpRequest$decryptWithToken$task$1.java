package com.evervault.sdk.core;

import Ph.AbstractC1459k;
import Ph.P;
import Ph.X;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPh/P;", "LPh/X;", "", "<anonymous>", "(LPh/P;)LPh/X;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.evervault.sdk.core.HttpRequest$decryptWithToken$task$1", f = "HttpRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HttpRequest$decryptWithToken$task$1 extends SuspendLambda implements Function2<P, Continuation<? super X>, Object> {
    final /* synthetic */ Object $data;
    final /* synthetic */ String $token;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HttpRequest this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.evervault.sdk.core.HttpRequest$decryptWithToken$task$1$1", f = "HttpRequest.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.evervault.sdk.core.HttpRequest$decryptWithToken$task$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<P, Continuation<? super Object>, Object> {
        final /* synthetic */ Object $data;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ HttpRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequest httpRequest, String str, Object obj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = httpRequest;
            this.$token = str;
            this.$data = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$token, this.$data, continuation);
        }

        @Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull P p10, @Nullable Continuation<Object> continuation) {
            return ((AnonymousClass1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpRequest httpRequest = this.this$0;
                    String str = this.$token;
                    Object obj2 = this.$data;
                    this.label = 1;
                    obj = httpRequest.executeDecryptWithToken(str, obj2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.activeTask = null;
                return obj;
            } catch (Error e10) {
                this.this$0.activeTask = null;
                throw e10;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(P p10, Continuation<? super Object> continuation) {
            return invoke2(p10, (Continuation<Object>) continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequest$decryptWithToken$task$1(HttpRequest httpRequest, String str, Object obj, Continuation<? super HttpRequest$decryptWithToken$task$1> continuation) {
        super(2, continuation);
        this.this$0 = httpRequest;
        this.$token = str;
        this.$data = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HttpRequest$decryptWithToken$task$1 httpRequest$decryptWithToken$task$1 = new HttpRequest$decryptWithToken$task$1(this.this$0, this.$token, this.$data, continuation);
        httpRequest$decryptWithToken$task$1.L$0 = obj;
        return httpRequest$decryptWithToken$task$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super X> continuation) {
        return ((HttpRequest$decryptWithToken$task$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        X b10;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        b10 = AbstractC1459k.b((P) this.L$0, null, null, new AnonymousClass1(this.this$0, this.$token, this.$data, null), 3, null);
        return b10;
    }
}
