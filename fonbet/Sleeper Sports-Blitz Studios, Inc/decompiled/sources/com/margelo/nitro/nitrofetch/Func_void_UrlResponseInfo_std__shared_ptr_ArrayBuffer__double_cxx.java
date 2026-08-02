package com.margelo.nitro.nitrofetch;

import com.facebook.jni.HybridData;
import com.margelo.nitro.core.ArrayBuffer;
import dalvik.annotation.optimization.FastNative;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0097\u0002J!\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0083 R\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double_cxx;", "Lcom/margelo/nitro/nitrofetch/Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double;", "hybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "mHybridData", "invoke", "", "info", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "byteBuffer", "Lcom/margelo/nitro/core/ArrayBuffer;", "bytesRead", "", "invoke_cxx", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double_cxx implements Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double {
    private final HybridData mHybridData;

    @FastNative
    private final native void invoke_cxx(UrlResponseInfo info, ArrayBuffer byteBuffer, double bytesRead);

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(UrlResponseInfo urlResponseInfo, ArrayBuffer arrayBuffer, Double d) {
        invoke(urlResponseInfo, arrayBuffer, d.doubleValue());
        return Unit.INSTANCE;
    }

    private Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double_cxx(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.margelo.nitro.nitrofetch.Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double
    public void invoke(UrlResponseInfo info, ArrayBuffer byteBuffer, double bytesRead) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        invoke_cxx(info, byteBuffer, bytesRead);
    }
}
