package cl.json;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import io.agora.utils2.internal.CommonUtility;
import java.io.File;
import java.util.ArrayList;
import l0.AbstractC5339d;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f27881a = new ArrayList();

    public static Uri a(ReactContext reactContext, File file) {
        b(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && f27881a.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith(CommonUtility.PREFIX_URI)) {
            return Uri.fromFile(file);
        }
        Uri uri = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f27881a;
            if (i10 >= arrayList.size()) {
                break;
            }
            try {
                uri = AbstractC5339d.getUriForFile(reactContext, (String) arrayList.get(i10), file);
            } catch (Exception e10) {
                System.out.println("RNSharePathUtil::compatUriFromFile ERROR " + e10.getMessage());
            }
            if (uri != null) {
                break;
            }
            i10++;
        }
        return uri;
    }

    public static void b(ReactContext reactContext) {
        ArrayList arrayList = f27881a;
        if (arrayList.size() == 0) {
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(Context context, Uri uri, String str, String[] strArr) {
        Throwable th2;
        Exception exc;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = new androidx.loader.content.b(context, uri, new String[]{"_data"}, str, strArr, null).loadInBackground();
            if (cursor != null) {
                try {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                            cursor.close();
                            return string;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        exc.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        throw th2;
                    }
                    cursor2.close();
                    throw th2;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Exception e11) {
            exc = e11;
            cursor = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor2 != null) {
            }
        }
    }

    public static String d(Context context, Uri uri, Boolean bool) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (f(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                String str = split[0];
                if ("primary".equalsIgnoreCase(str) || "0".equalsIgnoreCase(str)) {
                    return "" + (bool.booleanValue() ? context.getCacheDir() : context.getExternalCacheDir()) + "/" + split[1];
                }
                if ("raw".equalsIgnoreCase(str)) {
                    return "" + split[1];
                }
                if (!TextUtils.isEmpty(str)) {
                    return "/storage/" + str + "/" + split[1];
                }
            } else {
                if (e(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return "" + documentId.replaceFirst("raw:", "");
                    }
                    return "" + c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                }
                if (h(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else if ("raw".equalsIgnoreCase(str2)) {
                        return "" + split2[1];
                    }
                    return "" + c(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (g(uri)) {
                    return uri.getLastPathSegment();
                }
                return "" + c(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean e(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
