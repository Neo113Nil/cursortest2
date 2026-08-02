package com.plaid.internal;

import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.C3556a6;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogSender$sendEvents$2", f = "RemoteLogSender.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class M6 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N6 f39378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f39379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6(N6 n62, ArrayList arrayList, String str, Continuation continuation) {
        super(2, continuation);
        this.f39378b = n62;
        this.f39379c = arrayList;
        this.f39380d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new M6(this.f39378b, this.f39379c, this.f39380d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((M6) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        i8 i8Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39377a;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Workflow$LinkWorkflowEventRequest a10 = N6.a(this.f39378b, this.f39379c, this.f39380d);
                i8Var = this.f39378b.f39458a;
                this.f39377a = 1;
                obj = i8Var.a(a10, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AbstractC3654i4 abstractC3654i4 = (AbstractC3654i4) obj;
            if (abstractC3654i4 instanceof AbstractC3654i4.c) {
                C3556a6.a.a(C3556a6.f39823a, "Successfully sent " + this.f39379c.size() + " remote log events for session: " + this.f39380d);
            } else {
                C3556a6.a.b(C3556a6.f39823a, "Failed to send remote log events: " + abstractC3654i4);
            }
        } catch (IOException e10) {
            C3556a6.a.b(C3556a6.f39823a, "IOException while sending remote log events", new Object[]{e10});
        } catch (RuntimeException e11) {
            if (e11 instanceof CancellationException) {
                throw e11;
            }
            C3556a6.a.b(C3556a6.f39823a, "RuntimeException while sending remote log events", new Object[]{e11});
        }
        return Unit.INSTANCE;
    }
}
