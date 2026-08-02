package com.margelo.nitro.nitrofetch;

import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Func_void_std__optional_UrlResponseInfo_.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0097\u0002R\u001c\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo__java;", "Lcom/margelo/nitro/nitrofetch/Func_void_std__optional_UrlResponseInfo_;", SentryStackFrame.JsonKeys.FUNCTION, "Lkotlin/Function1;", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "info", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Func_void_std__optional_UrlResponseInfo__java implements Func_void_std__optional_UrlResponseInfo_ {
    private final Function1<UrlResponseInfo, Unit> function;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UrlResponseInfo urlResponseInfo) {
        invoke2(urlResponseInfo);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Func_void_std__optional_UrlResponseInfo__java(Function1<? super UrlResponseInfo, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // com.margelo.nitro.nitrofetch.Func_void_std__optional_UrlResponseInfo_
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(UrlResponseInfo info) {
        this.function.invoke(info);
    }
}
