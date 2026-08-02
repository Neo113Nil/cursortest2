package com.reactnativecompressor.Utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.loader.content.CursorLoader;
import androidx.media3.common.MimeTypes;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: RealPathUtil.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0007JC\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010!\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010#\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/reactnativecompressor/Utils/RealPathUtil;", "", "<init>", "()V", "FIELD_NAME", "", "FIELD_TYPE", "FIELD_SIZE", "getRealPath", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "fileUri", "Landroid/net/Uri;", "getRealPathFromURI_API11to18", "Landroid/content/Context;", "contentUri", "getRealPathFromURI_BelowAPI11", "getRealPathFromURI_API19", "uri", "getDataColumn", "selection", "selectionArgs", "", "actualUri", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;", "getFileExtension", "fileName", "copyFileToLocalStorage", "copyFile", "destFile", "Ljava/io/File;", "isExternalStorageDocument", "", "isDownloadsDocument", "isMediaDocument", "isGooglePhotosUri", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealPathUtil {
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TYPE = "type";
    public static final RealPathUtil INSTANCE = new RealPathUtil();

    private RealPathUtil() {
    }

    public final String getRealPath(ReactApplicationContext context, Uri fileUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        return getRealPathFromURI_API19(context, fileUri);
    }

    public final String getRealPathFromURI_API11to18(Context context, Uri contentUri) {
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNull(contentUri);
        Cursor loadInBackground = new CursorLoader(context, contentUri, new String[]{"_data"}, null, null, null).loadInBackground();
        if (loadInBackground == null) {
            return null;
        }
        int columnIndexOrThrow = loadInBackground.getColumnIndexOrThrow("_data");
        loadInBackground.moveToFirst();
        String string = loadInBackground.getString(columnIndexOrThrow);
        loadInBackground.close();
        return string;
    }

    public final String getRealPathFromURI_BelowAPI11(Context context, Uri contentUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNull(contentUri);
        Cursor query = contentResolver.query(contentUri, new String[]{"_data"}, null, null, null);
        if (query != null) {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
            query.moveToFirst();
            String string = query.getString(columnIndexOrThrow);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            query.close();
            return string;
        }
        return "";
    }

    public final String getRealPathFromURI_API19(ReactApplicationContext context, Uri uri) {
        List emptyList;
        Uri contentUri;
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
                if (!StringsKt.equals("primary", strArr[0], true)) {
                    return null;
                }
                return Environment.getExternalStorageDirectory() + "/" + strArr[1];
            }
            if (isDownloadsDocument(uri)) {
                String documentId2 = DocumentsContract.getDocumentId(uri);
                Uri parse = Uri.parse("content://downloads/public_downloads");
                Long valueOf = Long.valueOf(documentId2);
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                Uri withAppendedId = ContentUris.withAppendedId(parse, valueOf.longValue());
                Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(...)");
                return getDataColumn(context, withAppendedId, null, null, uri);
            }
            if (!isMediaDocument(uri)) {
                return null;
            }
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
            String str = strArr2[0];
            if (Intrinsics.areEqual("image", str)) {
                contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if (Intrinsics.areEqual("video", str)) {
                contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if (Intrinsics.areEqual(MimeTypes.BASE_TYPE_AUDIO, str)) {
                contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            } else {
                contentUri = MediaStore.Files.getContentUri("external");
            }
            return getDataColumn(context, contentUri, "_id=?", new String[]{strArr2[1]}, uri);
        }
        if (StringsKt.equals("content", uri.getScheme(), true)) {
            return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null, uri);
        }
        if (StringsKt.equals("file", uri.getScheme(), true)) {
            return uri.getPath();
        }
        return null;
    }

    public final String getDataColumn(ReactApplicationContext context, Uri uri, String selection, String[] selectionArgs, Uri actualUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] strArr = {"_data"};
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNull(uri);
                Cursor query = contentResolver.query(uri, strArr, selection, selectionArgs, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    query.close();
                    return string;
                }
                Intrinsics.checkNotNull(actualUri);
                String copyFileToLocalStorage = copyFileToLocalStorage(actualUri, context);
                MediaCache.INSTANCE.addCompletedImagePath(copyFileToLocalStorage);
                if (query != null) {
                    query.close();
                }
                return copyFileToLocalStorage;
            } catch (Exception unused) {
                Intrinsics.checkNotNull(actualUri);
                String copyFileToLocalStorage2 = copyFileToLocalStorage(actualUri, context);
                MediaCache.INSTANCE.addCompletedImagePath(copyFileToLocalStorage2);
                if (0 != 0) {
                    cursor.close();
                }
                return copyFileToLocalStorage2;
            }
        } finally {
        }
    }

    public final String getFileExtension(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (StringsKt.contains$default((CharSequence) fileName, (CharSequence) ".", false, 2, (Object) null)) {
            return StringsKt.substringAfterLast$default(fileName, ".", (String) null, 2, (Object) null);
        }
        return "";
    }

    private final String copyFileToLocalStorage(Uri uri, ReactApplicationContext context) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        if (query != null) {
            query.moveToFirst();
        }
        Intrinsics.checkNotNull(query);
        String string = query.getString(query.getColumnIndex("_display_name"));
        Intrinsics.checkNotNull(string);
        String fileExtension = getFileExtension(string);
        new File(context.getCacheDir(), UUID.randomUUID().toString());
        try {
            String uri2 = copyFile(context, uri, new File(Utils.generateCacheFilePath(fileExtension, context))).toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            return uri2;
        } catch (Exception e) {
            e.printStackTrace();
            String uri3 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
            return uri3;
        }
    }

    public final Uri copyFile(Context context, Uri uri, File destFile) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNull(uri);
        FileOutputStream openInputStream = contentResolver.openInputStream(uri);
        try {
            InputStream inputStream = openInputStream;
            openInputStream = new FileOutputStream(destFile);
            try {
                FileOutputStream fileOutputStream = openInputStream;
                byte[] bArr = new byte[8192];
                while (true) {
                    Intrinsics.checkNotNull(inputStream);
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        Uri fromFile = Uri.fromFile(destFile);
                        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(...)");
                        CloseableKt.closeFinally(openInputStream, null);
                        CloseableKt.closeFinally(openInputStream, null);
                        return fromFile;
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    public final boolean isExternalStorageDocument(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    public final boolean isDownloadsDocument(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    public final boolean isMediaDocument(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    public final boolean isGooglePhotosUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("com.google.android.apps.photos.content", uri.getAuthority());
    }
}
