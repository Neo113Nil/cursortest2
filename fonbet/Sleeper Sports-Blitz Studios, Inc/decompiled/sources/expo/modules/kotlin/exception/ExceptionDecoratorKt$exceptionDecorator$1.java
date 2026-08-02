package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: ExceptionDecorator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = Opcodes.ARETURN)
@DebugMetadata(c = "expo.modules.kotlin.exception.ExceptionDecoratorKt", f = "ExceptionDecorator.kt", i = {0}, l = {23}, m = "exceptionDecorator", n = {"decoratorBlock"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class ExceptionDecoratorKt$exceptionDecorator$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ExceptionDecoratorKt$exceptionDecorator$1(Continuation<? super ExceptionDecoratorKt$exceptionDecorator$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ExceptionDecoratorKt.exceptionDecorator(null, null, null, this);
    }
}
