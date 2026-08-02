package com.plaid.internal;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$removeData$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3637g5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3655i5 f40629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3637g5(C3655i5 c3655i5, String str, Continuation<? super C3637g5> continuation) {
        super(2, continuation);
        this.f40629a = c3655i5;
        this.f40630b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3637g5(this.f40629a, this.f40630b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3637g5(this.f40629a, this.f40630b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File file = new File(this.f40629a.f40678a.toString(), this.f40630b);
        if (file.exists()) {
            file.delete();
        }
        return Unit.INSTANCE;
    }
}
