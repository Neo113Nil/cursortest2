package com.mattermost.pasteinputtext;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: RealPathUtil.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J-\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0002¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¨\u0006\u001c"}, d2 = {"Lcom/mattermost/pasteinputtext/RealPathUtil;", "", "<init>", "()V", "getRealPathFromURI", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getPathFromSavingTempFile", "sanitizeFilename", "filename", "getDataColumn", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;)Ljava/lang/String;", "isExternalStorageDocument", "", "isDownloadsDocument", "isMediaDocument", "isGooglePhotosUri", "deleteTempFiles", "", "dir", "Ljava/io/File;", "deleteRecursive", "fileOrDirectory", "mattermost_react-native-paste-input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealPathUtil {
    public static final RealPathUtil INSTANCE;

    private RealPathUtil() {
    }

    static {
        RealPathUtil realPathUtil = new RealPathUtil();
        INSTANCE = realPathUtil;
        realPathUtil.deleteTempFiles(new File(PasteTextInputManager.CACHE_DIR_NAME));
    }

    public final String getRealPathFromURI(Context context, Uri uri) {
        List emptyList;
        Uri uri2;
        List emptyList2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkNotNull(documentId);
                List<String> split = new Regex(":").split(documentId, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            emptyList2 = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList2 = CollectionsKt.emptyList();
                String[] strArr = (String[]) emptyList2.toArray(new String[0]);
                if (StringsKt.equals("primary", strArr[0], true)) {
                    File externalFilesDir = context.getExternalFilesDir(strArr[1]);
                    if (externalFilesDir != null) {
                        return externalFilesDir.getAbsolutePath();
                    }
                    return null;
                }
            } else if (isDownloadsDocument(uri)) {
                String documentId2 = DocumentsContract.getDocumentId(uri);
                String str = documentId2;
                if (!TextUtils.isEmpty(str)) {
                    Intrinsics.checkNotNull(documentId2);
                    if (StringsKt.startsWith$default(documentId2, "raw:", false, 2, (Object) null)) {
                        return new Regex("raw:").replaceFirst(str, "");
                    }
                    try {
                        return getPathFromSavingTempFile(context, uri);
                    } catch (NumberFormatException unused) {
                        Log.e("ReactNative", "DownloadsProvider unexpected uri " + uri);
                        return null;
                    }
                }
            } else if (isMediaDocument(uri)) {
                String documentId3 = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkNotNull(documentId3);
                List<String> split2 = new Regex(":").split(documentId3, 0);
                if (!split2.isEmpty()) {
                    ListIterator<String> listIterator2 = split2.listIterator(split2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            emptyList = CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList = CollectionsKt.emptyList();
                String[] strArr2 = (String[]) emptyList.toArray(new String[0]);
                String str2 = strArr2[0];
                int hashCode = str2.hashCode();
                if (hashCode == 93166550) {
                    if (str2.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    uri2 = null;
                } else if (hashCode != 100313435) {
                    if (hashCode == 112202875 && str2.equals("video")) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    }
                    uri2 = null;
                } else {
                    if (str2.equals("image")) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    }
                    uri2 = null;
                }
                String[] strArr3 = {strArr2[1]};
                if (uri2 != null) {
                    return INSTANCE.getDataColumn(context, uri2, strArr3);
                }
                return null;
            }
        }
        if (StringsKt.equals("content", uri.getScheme(), true)) {
            if (isGooglePhotosUri(uri)) {
                return uri.getLastPathSegment();
            }
            return getPathFromSavingTempFile(context, uri);
        }
        if (StringsKt.equals("file", uri.getScheme(), true)) {
            return uri.getPath();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: IOException -> 0x00b6, TryCatch #0 {IOException -> 0x00b6, blocks: (B:35:0x003d, B:16:0x0053, B:18:0x0064, B:20:0x0069, B:21:0x0070, B:23:0x0084, B:24:0x008a, B:26:0x00ae), top: B:34:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: IOException -> 0x00b6, TryCatch #0 {IOException -> 0x00b6, blocks: (B:35:0x003d, B:16:0x0053, B:18:0x0064, B:20:0x0069, B:21:0x0070, B:23:0x0084, B:24:0x008a, B:26:0x00ae), top: B:34:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: IOException -> 0x00b6, TryCatch #0 {IOException -> 0x00b6, blocks: (B:35:0x003d, B:16:0x0053, B:18:0x0064, B:20:0x0069, B:21:0x0070, B:23:0x0084, B:24:0x008a, B:26:0x00ae), top: B:34:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[Catch: IOException -> 0x00b6, TRY_LEAVE, TryCatch #0 {IOException -> 0x00b6, blocks: (B:35:0x003d, B:16:0x0053, B:18:0x0064, B:20:0x0069, B:21:0x0070, B:23:0x0084, B:24:0x008a, B:26:0x00ae), top: B:34:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getPathFromSavingTempFile(Context context, Uri uri) {
        Uri uri2;
        String str;
        File file;
        ParcelFileDescriptor openFileDescriptor;
        try {
            uri2 = uri;
            try {
                Cursor query = context.getContentResolver().query(uri2, null, null, null, null);
                Integer valueOf = query != null ? Integer.valueOf(query.getColumnIndex("_display_name")) : null;
                if (query != null) {
                    query.moveToFirst();
                }
                str = sanitizeFilename(valueOf != null ? query.getString(valueOf.intValue()) : null);
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                str = null;
                if (str == null) {
                }
                file = new File(context.getCacheDir(), PasteTextInputManager.CACHE_DIR_NAME);
                if (!file.exists()) {
                }
                if (str == null) {
                }
                Intrinsics.checkNotNull(r3);
                r3.createNewFile();
                openFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
                FileChannel channel = new FileInputStream(openFileDescriptor == null ? openFileDescriptor.getFileDescriptor() : null).getChannel();
                FileChannel channel2 = new FileOutputStream(r3).getChannel();
                channel2.transferFrom(channel, 0L, channel.size());
                channel.close();
                channel2.close();
                if (openFileDescriptor != null) {
                }
                return r3.getAbsolutePath();
            }
        } catch (Exception unused3) {
            uri2 = uri;
        }
        if (str == null) {
            try {
                str = sanitizeFilename(StringsKt.trim((CharSequence) String.valueOf(uri2.getLastPathSegment())).toString());
            } catch (IOException unused4) {
                return null;
            }
        }
        file = new File(context.getCacheDir(), PasteTextInputManager.CACHE_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = str == null ? new File(file, str) : null;
        Intrinsics.checkNotNull(file2);
        file2.createNewFile();
        openFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        FileChannel channel3 = new FileInputStream(openFileDescriptor == null ? openFileDescriptor.getFileDescriptor() : null).getChannel();
        FileChannel channel22 = new FileOutputStream(file2).getChannel();
        channel22.transferFrom(channel3, 0L, channel3.size());
        channel3.close();
        channel22.close();
        if (openFileDescriptor != null) {
            openFileDescriptor.close();
        }
        return file2.getAbsolutePath();
    }

    private final String sanitizeFilename(String filename) {
        if (filename == null) {
            return null;
        }
        return new File(filename).getName();
    }

    private final String getDataColumn(Context context, Uri uri, String[] selectionArgs) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, "_id=?", selectionArgs, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final boolean isExternalStorageDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    private final boolean isDownloadsDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    private final boolean isMediaDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    private final boolean isGooglePhotosUri(Uri uri) {
        return Intrinsics.areEqual("com.google.android.apps.photos.content", uri.getAuthority());
    }

    private final void deleteTempFiles(File dir) {
        try {
            if (dir.isDirectory()) {
                deleteRecursive(dir);
            }
        } catch (Exception unused) {
        }
    }

    private final void deleteRecursive(File fileOrDirectory) {
        if (fileOrDirectory.isDirectory()) {
            File[] listFiles = fileOrDirectory.listFiles();
            Intrinsics.checkNotNull(listFiles);
            for (File file : listFiles) {
                Intrinsics.checkNotNull(file);
                deleteRecursive(file);
            }
        }
        fileOrDirectory.delete();
    }
}
