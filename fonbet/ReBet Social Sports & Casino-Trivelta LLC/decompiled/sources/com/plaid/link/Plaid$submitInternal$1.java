package com.plaid.link;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.P;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3665j6;
import com.plaid.internal.C3674k6;
import com.plaid.internal.C3704o0;
import com.plaid.internal.InterfaceC3553a3;
import com.plaid.internal.N5;
import com.plaid.internal.P5;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plaid.link.Plaid$submitInternal$1", f = "Plaid.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class Plaid$submitInternal$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubmissionData $submissionData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$submitInternal$1(SubmissionData submissionData, Continuation<? super Plaid$submitInternal$1> continuation) {
        super(2, continuation);
        this.$submissionData = submissionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Plaid$submitInternal$1 plaid$submitInternal$1 = new Plaid$submitInternal$1(this.$submissionData, continuation);
        plaid$submitInternal$1.L$0 = obj;
        return plaid$submitInternal$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC3553a3 interfaceC3553a3;
        Unit unit;
        C3674k6 c3674k6;
        Object g10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            P p10 = (P) this.L$0;
            interfaceC3553a3 = Plaid.tokenComponent;
            unit = null;
            if (interfaceC3553a3 != null && (c3674k6 = ((C3704o0) interfaceC3553a3).f40898q.get()) != null) {
                SubmissionData submissionData = this.$submissionData;
                this.L$0 = p10;
                this.label = 1;
                N5 n52 = c3674k6.f40734c;
                P5 p52 = n52.f39457b;
                if (p52 != null) {
                    if (p52.f39515f.get()) {
                        n52.f39457b = null;
                    }
                    if (p52 != null) {
                        c3674k6.f40738g = submissionData;
                        g10 = Unit.INSTANCE;
                    } else {
                        g10 = AbstractC1455i.g(C1452g0.b(), new C3665j6(p52, submissionData, null), this);
                        if (g10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            g10 = Unit.INSTANCE;
                        }
                    }
                    if (g10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                p52 = null;
                if (p52 != null) {
                }
                if (g10 == coroutine_suspended) {
                }
            }
            if (unit == null) {
                C3556a6.a.b(C3556a6.f39823a, "Token component is null, submit is has no effect");
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        unit = Unit.INSTANCE;
        if (unit == null) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Plaid$submitInternal$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
