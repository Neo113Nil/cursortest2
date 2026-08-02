package com.playtika.sharedsdk.shaded.okio;

import com.playtika.sharedsdk.shaded.okio.internal.ZipFilesKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ZlibOkio.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"openZip", "Lcom/playtika/sharedsdk/shaded/okio/FileSystem;", "zipPath", "Lcom/playtika/sharedsdk/shaded/okio/Path;", "com.playtika.sharedsdk.shaded.okio"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "com/playtika/sharedsdk/shaded/okio/Okio")
/* loaded from: classes2.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }
}
