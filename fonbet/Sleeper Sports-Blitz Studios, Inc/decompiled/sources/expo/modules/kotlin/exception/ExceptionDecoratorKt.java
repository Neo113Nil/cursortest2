package expo.modules.kotlin.exception;

import androidx.exifinterface.media.ExifInterface;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExceptionDecorator.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012#\b\u0004\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001ah\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\f2#\b\u0004\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032)\b\u0004\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0080H¢\u0006\u0002\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"exceptionDecorator", ExifInterface.GPS_DIRECTION_TRUE, "decoratorBlock", "Lkotlin/Function1;", "Lexpo/modules/kotlin/exception/CodedException;", "Lkotlin/ParameterName;", "name", JWKParameterNames.RSA_EXPONENT, "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExceptionDecoratorKt {
    public static final <T> T exceptionDecorator(Function1<? super CodedException, ? extends Throwable> decoratorBlock, Function0<? extends T> block) throws CodedException {
        UnexpectedException unexpectedException;
        Intrinsics.checkNotNullParameter(decoratorBlock, "decoratorBlock");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke();
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw decoratorBlock.invoke(unexpectedException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object exceptionDecorator(CoroutineScope coroutineScope, Function1<? super CodedException, ? extends Throwable> function1, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws CodedException {
        ExceptionDecoratorKt$exceptionDecorator$1 exceptionDecoratorKt$exceptionDecorator$1;
        int i;
        UnexpectedException unexpectedException;
        try {
            if (continuation instanceof ExceptionDecoratorKt$exceptionDecorator$1) {
                exceptionDecoratorKt$exceptionDecorator$1 = (ExceptionDecoratorKt$exceptionDecorator$1) continuation;
                if ((exceptionDecoratorKt$exceptionDecorator$1.label & Integer.MIN_VALUE) != 0) {
                    exceptionDecoratorKt$exceptionDecorator$1.label -= Integer.MIN_VALUE;
                    Object obj = exceptionDecoratorKt$exceptionDecorator$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = exceptionDecoratorKt$exceptionDecorator$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    exceptionDecoratorKt$exceptionDecorator$1.L$0 = function1;
                    exceptionDecoratorKt$exceptionDecorator$1.label = 1;
                    Object invoke = function2.invoke(coroutineScope, exceptionDecoratorKt$exceptionDecorator$1);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw function1.invoke(unexpectedException);
        }
        exceptionDecoratorKt$exceptionDecorator$1 = new ExceptionDecoratorKt$exceptionDecorator$1(continuation);
        Object obj2 = exceptionDecoratorKt$exceptionDecorator$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = exceptionDecoratorKt$exceptionDecorator$1.label;
    }

    private static final <T> Object exceptionDecorator$$forInline(CoroutineScope coroutineScope, Function1<? super CodedException, ? extends Throwable> function1, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws CodedException {
        UnexpectedException unexpectedException;
        try {
            return function2.invoke(coroutineScope, continuation);
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw function1.invoke(unexpectedException);
        }
    }
}
