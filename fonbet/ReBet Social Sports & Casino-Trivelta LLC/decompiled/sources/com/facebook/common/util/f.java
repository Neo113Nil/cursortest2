package com.facebook.common.util;

import D6.k;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f30359a = Uri.withAppendedPath((Uri) S7.a.e(ContactsContract.AUTHORITY_URI), "display_photo");

    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (m(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static String b(boolean z10) {
        return "_data";
    }

    public static Uri c(boolean z10) {
        return z10 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    public static String d(boolean z10) {
        return "_id";
    }

    public static String e(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String str2 = null;
        if (!m(uri)) {
            if (n(uri)) {
                return uri.getPath();
            }
            return null;
        }
        boolean z10 = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            k.g(documentId);
            uri2 = (Uri) k.g(c(z10));
            str = d(z10) + "=?";
            strArr = new String[]{documentId.split(":")[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor query = contentResolver.query(uri2, new String[]{b(z10)}, str, strArr, null);
        if (query != null) {
            try {
                if (query.moveToFirst() && (columnIndexOrThrow = query.getColumnIndexOrThrow(b(z10))) != -1) {
                    str2 = query.getString(columnIndexOrThrow);
                }
            } finally {
                query.close();
            }
        }
        if (query != null) {
        }
        return str2;
    }

    public static String f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri g(File file) {
        return Uri.fromFile(file);
    }

    public static Uri h(int i10) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i10)).build();
    }

    public static boolean i(Uri uri) {
        return EventKeys.DATA.equals(f(uri));
    }

    public static boolean j(Uri uri) {
        return "asset".equals(f(uri));
    }

    public static boolean k(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean l(Uri uri) {
        return uri.getPath() != null && m(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) S7.a.e(f30359a.getPath()));
    }

    public static boolean m(Uri uri) {
        return "content".equals(f(uri));
    }

    public static boolean n(Uri uri) {
        return "file".equals(f(uri));
    }

    public static boolean o(Uri uri) {
        return "res".equals(f(uri));
    }

    public static boolean p(Uri uri) {
        String f10 = f(uri);
        return "https".equals(f10) || "http".equals(f10);
    }

    public static boolean q(Uri uri) {
        return "android.resource".equals(f(uri));
    }

    public static URL r(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
