package expo.modules.filesystem;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.facebook.common.util.UriUtil;
import expo.modules.filesystem.fsops.DestinationSpec;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FileSystemPath.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u000f"}, d2 = {"isContentUri", "", "Landroid/net/Uri;", "(Landroid/net/Uri;)Z", "isAssetUri", "isSAFUri", "context", "Landroid/content/Context;", "slashifyFilePath", "", "path", "asCopyOrMoveDestination", "Lexpo/modules/filesystem/fsops/DestinationSpec;", "Lexpo/modules/filesystem/FileSystemPath;", "overwrite", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileSystemPathKt {
    public static final boolean isContentUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual(uri.getScheme(), "content");
    }

    public static final boolean isAssetUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual(uri.getScheme(), UriUtil.LOCAL_ASSET_SCHEME);
    }

    public static final boolean isSAFUri(Uri uri, Context context) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (isContentUri(uri)) {
            return DocumentsContract.isDocumentUri(context, uri) || DocumentsContract.isTreeUri(uri);
        }
        return false;
    }

    public static final String slashifyFilePath(String str) {
        if (str == null) {
            return null;
        }
        return StringsKt.startsWith$default(str, "file:///", false, 2, (Object) null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }

    public static final DestinationSpec asCopyOrMoveDestination(FileSystemPath fileSystemPath, boolean z) {
        Intrinsics.checkNotNullParameter(fileSystemPath, "<this>");
        return new DestinationSpec(fileSystemPath.getFile(), z, fileSystemPath instanceof FileSystemDirectory);
    }

    public static /* synthetic */ DestinationSpec asCopyOrMoveDestination$default(FileSystemPath fileSystemPath, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return asCopyOrMoveDestination(fileSystemPath, z);
    }
}
