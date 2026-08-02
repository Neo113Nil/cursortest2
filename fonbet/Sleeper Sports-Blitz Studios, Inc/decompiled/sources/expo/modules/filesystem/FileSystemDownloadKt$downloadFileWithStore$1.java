package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileSystemDownload.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.FileSystemDownloadKt", f = "FileSystemDownload.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {73, 99}, m = "downloadFileWithStore", n = {"url", "to", "options", "downloadUUID", "downloadStore", "emitProgress", "downloadUUID", "downloadStore", "destination"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$3"})
/* loaded from: classes8.dex */
final class FileSystemDownloadKt$downloadFileWithStore$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    FileSystemDownloadKt$downloadFileWithStore$1(Continuation<? super FileSystemDownloadKt$downloadFileWithStore$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FileSystemDownloadKt.downloadFileWithStore(null, null, null, null, null, null, this);
    }
}
