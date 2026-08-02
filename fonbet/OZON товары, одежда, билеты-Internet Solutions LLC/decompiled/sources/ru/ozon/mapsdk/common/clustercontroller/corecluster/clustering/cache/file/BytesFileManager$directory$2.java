package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BytesFileManager$directory$2 extends AbstractC7737t implements Function0<File> {
    final /* synthetic */ BytesFileManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BytesFileManager$directory$2(BytesFileManager bytesFileManager) {
        super(0);
        this.this$0 = bytesFileManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        Context context;
        String str;
        context = this.this$0.context;
        File filesDir = context.getFilesDir();
        str = this.this$0.subdirectory;
        File file = new File(filesDir, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
