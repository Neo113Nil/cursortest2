package com.reactnativecommunity.asyncstorage.next;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: ErrorHelpers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"createExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "cb", "Lcom/facebook/react/bridge/Callback;", "react-native-async-storage_async-storage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ErrorHelpersKt {
    public static final CoroutineExceptionHandler createExceptionHandler(Callback cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        return new ErrorHelpersKt$createExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, cb);
    }
}
