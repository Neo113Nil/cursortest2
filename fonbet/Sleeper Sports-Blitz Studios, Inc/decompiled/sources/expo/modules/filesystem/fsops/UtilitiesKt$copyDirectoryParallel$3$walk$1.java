package expo.modules.filesystem.fsops;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Utilities.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.fsops.UtilitiesKt$copyDirectoryParallel$3", f = "Utilities.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {155, 159}, m = "invokeSuspend$walk", n = {"semaphore", "$this$coroutineScope", "$copyFile", "dst", "semaphore", "$this$coroutineScope", "$copyFile", "dst", "child", "childName"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6"})
/* loaded from: classes8.dex */
final class UtilitiesKt$copyDirectoryParallel$3$walk$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;

    UtilitiesKt$copyDirectoryParallel$3$walk$1(Continuation<? super UtilitiesKt$copyDirectoryParallel$3$walk$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend$walk;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        invokeSuspend$walk = UtilitiesKt$copyDirectoryParallel$3.invokeSuspend$walk(null, null, null, null, null, this);
        return invokeSuspend$walk;
    }
}
