package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: FileSystemPath.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.FileSystemPath", f = "FileSystemPath.kt", i = {}, l = {Opcodes.JSR}, m = "move", n = {}, s = {})
/* loaded from: classes8.dex */
final class FileSystemPath$move$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileSystemPath this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystemPath$move$1(FileSystemPath fileSystemPath, Continuation<? super FileSystemPath$move$1> continuation) {
        super(continuation);
        this.this$0 = fileSystemPath;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.move(null, null, this);
    }
}
