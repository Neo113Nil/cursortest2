package com.reactnativecommunity.asyncstorage.next;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ErrorHelpersKt$createExceptionHandler$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ Callback $cb$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorHelpersKt$createExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Companion companion, Callback callback) {
        super(companion);
        this.$cb$inlined = callback;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        WritableMap createMap = Arguments.createMap();
        if (!(exception instanceof AsyncStorageError)) {
            createMap.putString("message", "Unexpected AsyncStorage error: " + exception.getLocalizedMessage());
        } else {
            createMap.putString("message", ((AsyncStorageError) exception).getErrorMessage());
        }
        this.$cb$inlined.invoke(createMap);
    }
}
