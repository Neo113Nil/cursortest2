package com.orkestapay.orkestapay.core.googlepay;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.orkestapay.orkestapay.core.googlepay.GooglePayClient", f = "GooglePayClient.kt", i = {0}, l = {87}, m = "possiblyShowGooglePayButton", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class GooglePayClient$possiblyShowGooglePayButton$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayClient$possiblyShowGooglePayButton$1(GooglePayClient googlePayClient, Continuation<? super GooglePayClient$possiblyShowGooglePayButton$1> continuation) {
        super(continuation);
        this.this$0 = googlePayClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object possiblyShowGooglePayButton;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        possiblyShowGooglePayButton = this.this$0.possiblyShowGooglePayButton(this);
        return possiblyShowGooglePayButton;
    }
}
