package ru.ozon.app.android.composer.domain.cache;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerResponseStorageImpl$validateCache$1 extends AbstractC7737t implements Function1<File, Boolean> {
    final /* synthetic */ ComposerResponseStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerResponseStorageImpl$validateCache$1(ComposerResponseStorageImpl composerResponseStorageImpl) {
        super(1);
        this.this$0 = composerResponseStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(File it) {
        boolean z11;
        DateTime timestamp;
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            ComposerResponseStorageImpl composerResponseStorageImpl = this.this$0;
            timestamp = composerResponseStorageImpl.getTimestamp(it);
            z11 = composerResponseStorageImpl.isFileOld(timestamp);
        } catch (FileNotFoundException unused) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
