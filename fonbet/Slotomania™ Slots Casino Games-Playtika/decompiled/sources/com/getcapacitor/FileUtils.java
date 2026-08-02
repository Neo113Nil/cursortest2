package com.getcapacitor;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class FileUtils {
    private static String CapacitorFileScheme = "/_capacitor_file_";

    public enum Type {
        IMAGE("image");

        private String type;

        Type(String str) {
            this.type = str;
        }
    }

    public static String getPortablePath(Context context, String str, Uri uri) {
        String fileUrlForUri = getFileUrlForUri(context, uri);
        if (fileUrlForUri.startsWith(AdPayload.FILE_SCHEME)) {
            fileUrlForUri = fileUrlForUri.replace(AdPayload.FILE_SCHEME, "");
        } else {
            fileUrlForUri.startsWith("/");
        }
        return str + Bridge.CAPACITOR_FILE_START + fileUrlForUri;
    }

    public static String getFileUrlForUri(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                String[] split = documentId.split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
                int indexOf = documentId.indexOf(58, 1);
                String substring = documentId.substring(0, indexOf);
                String substring2 = documentId.substring(indexOf + 1);
                String pathToNonPrimaryVolume = getPathToNonPrimaryVolume(context, substring);
                if (pathToNonPrimaryVolume != null) {
                    String str = pathToNonPrimaryVolume + "/" + substring2;
                    File file = new File(str);
                    if (file.exists() && file.canRead()) {
                        return str;
                    }
                    return null;
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (isMediaDocument(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (isGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                return getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Uri uri2;
        Throwable th;
        Cursor cursor = null;
        r8 = null;
        String string = null;
        cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                uri2 = uri;
                try {
                    Cursor query = context.getContentResolver().query(uri2, new String[]{"_data"}, str, strArr, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                string = query.getString(query.getColumnIndexOrThrow("_data"));
                            }
                        } catch (IllegalArgumentException unused) {
                            cursor = query;
                            String copyFilePath = getCopyFilePath(uri2, context);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return copyFilePath;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = query;
                            if (cursor2 != null) {
                                cursor2.close();
                                throw th;
                            }
                            throw th;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    return string == null ? getCopyFilePath(uri2, context) : string;
                } catch (IllegalArgumentException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IllegalArgumentException unused3) {
            uri2 = uri;
        }
    }

    private static String getCopyFilePath(Uri uri, Context context) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        File file = new File(context.getFilesDir(), query.getString(columnIndex));
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Math.min(openInputStream.available(), 1048576)];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            openInputStream.close();
            fileOutputStream.close();
            if (query != null) {
                query.close();
            }
            return file.getPath();
        } catch (Exception unused) {
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
                throw th;
            }
            throw th;
        }
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static String getPathToNonPrimaryVolume(Context context, String str) {
        String absolutePath;
        int indexOf;
        File[] externalCacheDirs = context.getExternalCacheDirs();
        if (externalCacheDirs == null) {
            return null;
        }
        for (File file : externalCacheDirs) {
            if (file != null && (absolutePath = file.getAbsolutePath()) != null && (indexOf = absolutePath.indexOf(str)) != -1) {
                return absolutePath.substring(0, indexOf) + str;
            }
        }
        return null;
    }
}
