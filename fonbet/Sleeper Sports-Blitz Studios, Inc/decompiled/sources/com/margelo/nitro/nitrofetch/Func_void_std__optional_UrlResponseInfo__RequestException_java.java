package com.margelo.nitro.nitrofetch;

import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Func_void_std__optional_UrlResponseInfo__RequestException.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0097\u0002R\"\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo__RequestException_java;", "Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo__RequestException;", SentryStackFrame.JsonKeys.FUNCTION, "Lkotlin/Function2;", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "Lcom/margelo/nitro/nitrofetch/RequestException;", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "invoke", "info", "error", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Func_void_std__optional_UrlResponseInfo__RequestException_java implements Func_void_std__optional_UrlResponseInfo__RequestException {
    private final Function2<UrlResponseInfo, RequestException, Unit> function;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UrlResponseInfo urlResponseInfo, RequestException requestException) {
        invoke2(urlResponseInfo, requestException);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Func_void_std__optional_UrlResponseInfo__RequestException_java(Function2<? super UrlResponseInfo, ? super RequestException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // com.margelo.nitro.nitrofetch.Func_void_std__optional_UrlResponseInfo__RequestException
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(UrlResponseInfo info, RequestException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.function.invoke(info, error);
    }
}
