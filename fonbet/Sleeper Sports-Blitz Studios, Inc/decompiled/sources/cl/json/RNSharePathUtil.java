package cl.json;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import androidx.loader.content.CursorLoader;
import androidx.media3.common.MimeTypes;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class RNSharePathUtil {
    private static final ArrayList<String> authorities = new ArrayList<>();

    public static void compileAuthorities(ReactContext reactContext) {
        ArrayList<String> arrayList = authorities;
        if (arrayList.size() == 0) {
            ComponentCallbacks2 componentCallbacks2 = (Application) reactContext.getApplicationContext();
            if (componentCallbacks2 instanceof ShareApplication) {
                arrayList.add(((ShareApplication) componentCallbacks2).getFileProviderAuthority());
            }
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    public static Uri compatUriFromFile(ReactContext reactContext, File file) {
        compileAuthorities(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && authorities.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith("content://")) {
            return Uri.fromFile(file);
        }
        Uri uri = null;
        int i = 0;
        while (true) {
            ArrayList<String> arrayList = authorities;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                uri = FileProvider.getUriForFile(reactContext, arrayList.get(i), file);
            } catch (Exception e) {
                System.out.println("RNSharePathUtil::compatUriFromFile ERROR " + e.getMessage());
            }
            if (uri != null) {
                break;
            }
            i++;
        }
        return uri;
    }

    public static String getRealPathFromURI(Context context, Uri uri, Boolean bool) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                String str = split[0];
                if ("primary".equalsIgnoreCase(str) || AppEventsConstants.EVENT_PARAM_VALUE_NO.equalsIgnoreCase(str)) {
                    return "" + (bool.booleanValue() ? context.getCacheDir() : context.getExternalCacheDir()) + "/" + split[1];
                }
                if ("raw".equalsIgnoreCase(str)) {
                    return "" + split[1];
                }
                if (!TextUtils.isEmpty(str)) {
                    return "/storage/" + str + "/" + split[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return "" + documentId.replaceFirst("raw:", "");
                    }
                    return "" + getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                }
                if (isMediaDocument(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (MimeTypes.BASE_TYPE_AUDIO.equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else if ("raw".equalsIgnoreCase(str2)) {
                        return "" + split2[1];
                    }
                    return "" + getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (isGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                return "" + getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        Exception exc;
        Cursor cursor;
        ?? r8 = 0;
        try {
            try {
                cursor = new CursorLoader(context, uri, new String[]{"_data"}, str, strArr, null).loadInBackground();
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return string;
                        }
                    } catch (Exception e) {
                        exc = e;
                        exc.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                r8 = context;
                if (r8 == 0) {
                    r8.close();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r8 == 0) {
            }
        }
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }
}
