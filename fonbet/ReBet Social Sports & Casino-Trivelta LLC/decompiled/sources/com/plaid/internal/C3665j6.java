package com.plaid.internal;

import com.plaid.link.SubmissionData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$setSubmissionData$2", f = "PreloadLinkController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.j6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3665j6 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P5 f40709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubmissionData f40710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3665j6(P5 p52, SubmissionData submissionData, Continuation<? super C3665j6> continuation) {
        super(2, continuation);
        this.f40709a = p52;
        this.f40710b = submissionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3665j6(this.f40709a, this.f40710b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3665j6(this.f40709a, this.f40710b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f40709a.a(this.f40710b.getPhoneNumber(), this.f40710b.getDateOfBirth(), this.f40710b.getParams());
        return Unit.INSTANCE;
    }
}
