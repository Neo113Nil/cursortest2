package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.core.HybridObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridUrlRequestBuilderSpec.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 52\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u0005H'J\b\u0010\u000f\u001a\u00020\u0005H'J+\u0010\u0010\u001a\u00020\u00052!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u0012H&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0017H\u0003JB\u0010\u0018\u001a\u00020\u000528\u0010\u0011\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00050\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001dH\u0003J-\u0010\u001e\u001a\u00020\u00052#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u0012H&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020 H\u0003J@\u0010!\u001a\u00020\u000526\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00050\u0019H&J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020$H\u0003J+\u0010%\u001a\u00020\u00052!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u0012H&J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0017H\u0003JU\u0010'\u001a\u00020\u00052K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b\u0014\u0012\b\b\t\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00050(H&J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020.H\u0003J\b\u0010/\u001a\u000200H'J\b\u00101\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u000203H\u0014¨\u00066"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridUrlRequestBuilderSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "setHttpMethod", "", "httpMethod", "", "addHeader", "name", "value", "setUploadBody", "body", "Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String;", "disableCache", "disableCookies", "onSucceeded", "callback", "Lkotlin/Function1;", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "Lkotlin/ParameterName;", "info", "onSucceeded_cxx", "Lcom/margelo/nitro/nitrofetch/Func_void_UrlResponseInfo;", "onFailed", "Lkotlin/Function2;", "Lcom/margelo/nitro/nitrofetch/RequestException;", "error", "onFailed_cxx", "Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo__RequestException;", "onCanceled", "onCanceled_cxx", "Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo_;", "onRedirectReceived", "newLocationUrl", "onRedirectReceived_cxx", "Lcom/margelo/nitro/nitrofetch/Func_void_UrlResponseInfo_std__string;", "onResponseStarted", "onResponseStarted_cxx", "onReadCompleted", "Lkotlin/Function3;", "Lcom/margelo/nitro/core/ArrayBuffer;", "byteBuffer", "", "bytesRead", "onReadCompleted_cxx", "Lcom/margelo/nitro/nitrofetch/Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double;", "build", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec;", InAppPurchaseConstants.METHOD_TO_STRING, "createCxxPart", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestBuilderSpec$CxxPart;", "CxxPart", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HybridUrlRequestBuilderSpec extends HybridObject {
    protected static final String TAG = "HybridUrlRequestBuilderSpec";

    public abstract void addHeader(String name, String value);

    public abstract HybridUrlRequestSpec build();

    public abstract void disableCache();

    public abstract void disableCookies();

    public abstract void onCanceled(Function1<? super UrlResponseInfo, Unit> callback);

    public abstract void onFailed(Function2<? super UrlResponseInfo, ? super RequestException, Unit> callback);

    public abstract void onReadCompleted(Function3<? super UrlResponseInfo, ? super ArrayBuffer, ? super Double, Unit> callback);

    public abstract void onRedirectReceived(Function2<? super UrlResponseInfo, ? super String, Unit> callback);

    public abstract void onResponseStarted(Function1<? super UrlResponseInfo, Unit> callback);

    public abstract void onSucceeded(Function1<? super UrlResponseInfo, Unit> callback);

    public abstract void setHttpMethod(String httpMethod);

    public abstract void setUploadBody(Variant_ArrayBuffer_String body);

    private final void onSucceeded_cxx(Func_void_UrlResponseInfo callback) {
        onSucceeded(callback);
        Unit unit = Unit.INSTANCE;
    }

    private final void onFailed_cxx(Func_void_std__optional_UrlResponseInfo__RequestException callback) {
        onFailed(callback);
        Unit unit = Unit.INSTANCE;
    }

    private final void onCanceled_cxx(Func_void_std__optional_UrlResponseInfo_ callback) {
        onCanceled(callback);
        Unit unit = Unit.INSTANCE;
    }

    private final void onRedirectReceived_cxx(Func_void_UrlResponseInfo_std__string callback) {
        onRedirectReceived(callback);
        Unit unit = Unit.INSTANCE;
    }

    private final void onResponseStarted_cxx(Func_void_UrlResponseInfo callback) {
        onResponseStarted(callback);
        Unit unit = Unit.INSTANCE;
    }

    private final void onReadCompleted_cxx(Func_void_UrlResponseInfo_std__shared_ptr_ArrayBuffer__double callback) {
        onReadCompleted(callback);
        Unit unit = Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject UrlRequestBuilder]";
    }

    /* compiled from: HybridUrlRequestBuilderSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridUrlRequestBuilderSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestBuilderSpec;", "<init>", "(Lcom/margelo/nitro/nitrofetch/HybridUrlRequestBuilderSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridUrlRequestBuilderSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.margelo.nitro.core.HybridObject
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
