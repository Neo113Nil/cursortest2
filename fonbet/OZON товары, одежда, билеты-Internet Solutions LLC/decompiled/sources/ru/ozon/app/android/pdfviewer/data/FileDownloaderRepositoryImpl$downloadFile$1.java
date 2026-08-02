package ru.ozon.app.android.pdfviewer.data;

import We.M;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LWe/M;", "Lkotlin/jvm/internal/EnhancedNullability;", "responseBody", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(LWe/M;)Ljava/io/File;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class FileDownloaderRepositoryImpl$downloadFile$1 extends AbstractC7737t implements Function1<M, File> {
    final /* synthetic */ String $extension;
    final /* synthetic */ boolean $useExternalStorage;
    final /* synthetic */ FileDownloaderRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileDownloaderRepositoryImpl$downloadFile$1(FileDownloaderRepositoryImpl fileDownloaderRepositoryImpl, boolean z11, String str) {
        super(1);
        this.this$0 = fileDownloaderRepositoryImpl;
        this.$useExternalStorage = z11;
        this.$extension = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final File invoke(M responseBody) {
        File saveToFile;
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        saveToFile = this.this$0.saveToFile(responseBody, this.$useExternalStorage, this.$extension);
        return saveToFile;
    }
}
