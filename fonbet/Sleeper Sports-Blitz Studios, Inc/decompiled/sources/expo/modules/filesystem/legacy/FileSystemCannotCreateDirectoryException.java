package expo.modules.filesystem.legacy;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;

/* compiled from: FileSystemExceptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemCannotCreateDirectoryException;", "Lexpo/modules/kotlin/exception/CodedException;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileSystemCannotCreateDirectoryException extends CodedException {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0015, code lost:
    
        if (r3 == null) goto L5;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileSystemCannotCreateDirectoryException(Uri uri) {
        super(r3, null, 2, null);
        String str;
        if (uri != null) {
            str = "Directory '" + uri + "' could not be created or already exists";
        }
        str = "Unknown error";
    }
}
