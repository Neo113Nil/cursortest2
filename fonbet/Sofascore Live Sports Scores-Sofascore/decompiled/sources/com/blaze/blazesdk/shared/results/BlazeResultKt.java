package com.blaze.blazesdk.shared.results;

import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.results.BlazeResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00060\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a?\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"T", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "Lkotlin/Function2;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "callback", "doOnFailure", "(Lcom/blaze/blazesdk/shared/results/BlazeResult;Lkotlin/jvm/functions/Function2;)Lcom/blaze/blazesdk/shared/results/BlazeResult;", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/shared/results/BlazeResult$Error;", "(Lcom/blaze/blazesdk/shared/results/BlazeResult;Lkotlin/jvm/functions/Function1;)Lcom/blaze/blazesdk/shared/results/BlazeResult;", "doOnSuccess", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeResultKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public static final /* synthetic */ <T> BlazeResult<T> doOnFailure(BlazeResult<? extends T> blazeResult, Function2<? super String, ? super Exception, Unit> function2) {
        blazeResult.getClass();
        function2.getClass();
        if (blazeResult instanceof BlazeResult.Error) {
            BlazeResult.Error error = (BlazeResult.Error) blazeResult;
            function2.invoke(error.getMessage(), error.getCause());
        }
        return blazeResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public static final /* synthetic */ <T> BlazeResult<T> doOnSuccess(BlazeResult<? extends T> blazeResult, Function1<? super T, Unit> function1) {
        blazeResult.getClass();
        function1.getClass();
        if (blazeResult instanceof BlazeResult.Success) {
            function1.invoke(((BlazeResult.Success) blazeResult).getValue());
        }
        return blazeResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public static final /* synthetic */ <T> BlazeResult<T> doOnFailure(BlazeResult<? extends T> blazeResult, Function1<? super BlazeResult.Error, Unit> function1) {
        blazeResult.getClass();
        function1.getClass();
        if (blazeResult instanceof BlazeResult.Error) {
            function1.invoke(blazeResult);
        }
        return blazeResult;
    }
}
