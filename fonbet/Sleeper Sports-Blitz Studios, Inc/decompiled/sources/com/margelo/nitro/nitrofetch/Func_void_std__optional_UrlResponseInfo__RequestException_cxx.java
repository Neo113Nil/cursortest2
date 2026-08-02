package com.margelo.nitro.nitrofetch;

import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Func_void_std__optional_UrlResponseInfo__RequestException.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0097\u0002J\u001b\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0083 R\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo__RequestException_cxx;", "Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo__RequestException;", "hybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "mHybridData", "invoke", "", "info", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "error", "Lcom/margelo/nitro/nitrofetch/RequestException;", "invoke_cxx", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Func_void_std__optional_UrlResponseInfo__RequestException_cxx implements Func_void_std__optional_UrlResponseInfo__RequestException {
    private final HybridData mHybridData;

    @FastNative
    private final native void invoke_cxx(UrlResponseInfo info, RequestException error);

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UrlResponseInfo urlResponseInfo, RequestException requestException) {
        invoke2(urlResponseInfo, requestException);
        return Unit.INSTANCE;
    }

    private Func_void_std__optional_UrlResponseInfo__RequestException_cxx(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.margelo.nitro.nitrofetch.Func_void_std__optional_UrlResponseInfo__RequestException
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(UrlResponseInfo info, RequestException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        invoke_cxx(info, error);
    }
}
