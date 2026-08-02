package com.usercentrics.sdk.v2.async.dispatcher;

import air.com.playtika.android.common.GameActivity$$ExternalSyntheticLambda1;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DispatcherCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005J\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherCallback;", "T", "", "()V", "failureBlock", "Lkotlin/Function1;", "", "", "result", "Lkotlin/Result;", "successBlock", "onFailure", "block", "onSuccess", "setResult", "setResult$usercentrics_release", "(Ljava/lang/Object;)V", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DispatcherCallback<T> {
    private Function1<? super Throwable, Unit> failureBlock;
    private Result<? extends T> result;
    private Function1<? super T, Unit> successBlock;

    public final DispatcherCallback<T> onFailure(Function1<? super Throwable, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Result<? extends T> result = this.result;
        if (result == null) {
            this.failureBlock = block;
            return this;
        }
        Object value = result.getValue();
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(value);
        if (m11183exceptionOrNullimpl != null) {
            block.invoke(m11183exceptionOrNullimpl);
        }
        Result.m11179boximpl(value);
        return this;
    }

    public final DispatcherCallback<T> onSuccess(Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Result<? extends T> result = this.result;
        if (result == null) {
            this.successBlock = block;
            return this;
        }
        GameActivity$$ExternalSyntheticLambda1 gameActivity$$ExternalSyntheticLambda1 = (Object) result.getValue();
        if (Result.m11187isSuccessimpl(gameActivity$$ExternalSyntheticLambda1)) {
            block.invoke(gameActivity$$ExternalSyntheticLambda1);
        }
        Result.m11179boximpl(gameActivity$$ExternalSyntheticLambda1);
        return this;
    }

    public final void setResult$usercentrics_release(Object result) {
        this.result = Result.m11179boximpl(result);
        Function1<? super Throwable, Unit> function1 = this.failureBlock;
        if (function1 != null) {
            this.failureBlock = null;
            Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(result);
            if (m11183exceptionOrNullimpl != null) {
                function1.invoke(m11183exceptionOrNullimpl);
            }
            Result.m11179boximpl(result);
        }
        Function1<? super T, Unit> function12 = this.successBlock;
        if (function12 != null) {
            this.successBlock = null;
            if (Result.m11187isSuccessimpl(result)) {
                function12.invoke(result);
            }
            Result.m11179boximpl(result);
        }
    }
}
