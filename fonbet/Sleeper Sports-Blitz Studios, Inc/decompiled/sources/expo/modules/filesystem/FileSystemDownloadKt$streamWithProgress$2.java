package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FileSystemDownload.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class FileSystemDownloadKt$streamWithProgress$2 extends FunctionReferenceImpl implements Function0<Long> {
    public static final FileSystemDownloadKt$streamWithProgress$2 INSTANCE = new FileSystemDownloadKt$streamWithProgress$2();

    FileSystemDownloadKt$streamWithProgress$2() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
