package com.margelo.nitro.nitrofetch;

import com.margelo.nitro.core.ArrayBuffer;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0097\u0002R&\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double_java;", "Lcom/margelo/nitro/nitrofetch/Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double;", SentryStackFrame.JsonKeys.FUNCTION, "Lkotlin/Function3;", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "Lcom/margelo/nitro/core/ArrayBuffer;", "", "", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "invoke", "info", "byteBuffer", "bytesRead", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double_java implements Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double {
    private final Function3<UrlResponseInfo, ArrayBuffer, Double, Unit> function;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(UrlResponseInfo urlResponseInfo, ArrayBuffer arrayBuffer, Double d) {
        invoke(urlResponseInfo, arrayBuffer, d.doubleValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double_java(Function3<? super UrlResponseInfo, ? super ArrayBuffer, ? super Double, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // com.margelo.nitro.nitrofetch.Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double
    public void invoke(UrlResponseInfo info, ArrayBuffer byteBuffer, double bytesRead) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        this.function.invoke(info, byteBuffer, Double.valueOf(bytesRead));
    }
}
