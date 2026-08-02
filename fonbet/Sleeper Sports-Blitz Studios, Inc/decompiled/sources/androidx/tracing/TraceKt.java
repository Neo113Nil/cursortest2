package androidx.tracing;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Trace.kt */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0007\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001aA\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001aG\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H\u0086Hø\u0001\u0001¢\u0006\u0002\u0010\u0013\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"trace", ExifInterface.GPS_DIRECTION_TRUE, "lazyLabel", "Lkotlin/Function0;", "", "block", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "traceAsync", "lazyMethodName", "lazyCookie", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "methodName", "cookie", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracing-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TraceKt {
    public static final <T> T trace(String label, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace.beginSection(label);
        try {
            return block.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final <T> T trace(Function0<String> lazyLabel, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(lazyLabel, "lazyLabel");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean isEnabled = Trace.isEnabled();
        if (isEnabled) {
            Trace.beginSection(lazyLabel.invoke());
        }
        try {
            return block.invoke();
        } finally {
            if (isEnabled) {
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object traceAsync(String str, int i, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        TraceKt$traceAsync$1 traceKt$traceAsync$1;
        int i2;
        try {
            if (continuation instanceof TraceKt$traceAsync$1) {
                traceKt$traceAsync$1 = (TraceKt$traceAsync$1) continuation;
                if ((traceKt$traceAsync$1.label & Integer.MIN_VALUE) != 0) {
                    traceKt$traceAsync$1.label -= Integer.MIN_VALUE;
                    Object obj = traceKt$traceAsync$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = traceKt$traceAsync$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Trace.beginAsyncSection(str, i);
                        traceKt$traceAsync$1.L$0 = str;
                        traceKt$traceAsync$1.I$0 = i;
                        traceKt$traceAsync$1.label = 1;
                        obj = function1.invoke(traceKt$traceAsync$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = traceKt$traceAsync$1.I$0;
                        str = (String) traceKt$traceAsync$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            return obj;
        } finally {
            Trace.endAsyncSection(str, i);
        }
        traceKt$traceAsync$1 = new TraceKt$traceAsync$1(continuation);
        Object obj2 = traceKt$traceAsync$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = traceKt$traceAsync$1.label;
    }

    private static final <T> Object traceAsync$$forInline(String str, int i, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Trace.beginAsyncSection(str, i);
        try {
            return function1.invoke(continuation);
        } finally {
            Trace.endAsyncSection(str, i);
        }
    }

    public static final <T> T traceAsync(Function0<String> lazyMethodName, Function0<Integer> lazyCookie, Function0<? extends T> block) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(lazyMethodName, "lazyMethodName");
        Intrinsics.checkNotNullParameter(lazyCookie, "lazyCookie");
        Intrinsics.checkNotNullParameter(block, "block");
        if (Trace.isEnabled()) {
            str = lazyMethodName.invoke();
            i = lazyCookie.invoke().intValue();
            Trace.beginAsyncSection(str, i);
        } else {
            str = null;
            i = 0;
        }
        try {
            return block.invoke();
        } finally {
            if (str != null) {
                Trace.endAsyncSection(str, i);
            }
        }
    }
}
