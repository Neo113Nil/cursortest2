package com.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.twilio.voice.EventKeys;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import l0.AbstractC5338c;
import l0.AbstractC5339d;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static String f39037a = "rn_image_picker_lib_temp_";

    /* renamed from: b, reason: collision with root package name */
    public static String f39038b = "camera_unavailable";

    /* renamed from: c, reason: collision with root package name */
    public static String f39039c = "permission";

    /* renamed from: d, reason: collision with root package name */
    public static String f39040d = "others";

    /* renamed from: e, reason: collision with root package name */
    public static String f39041e = "photo";

    /* renamed from: f, reason: collision with root package name */
    public static String f39042f = "video";

    /* renamed from: g, reason: collision with root package name */
    public static String f39043g = "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same.";

    public static boolean A(Context context, Activity activity) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && Arrays.asList(strArr).contains("android.permission.CAMERA")) {
                if (AbstractC5338c.checkSelfPermission(activity, "android.permission.CAMERA") != 0) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    public static boolean B(String str, Uri uri, Context context) {
        String s10 = s(uri, context);
        if (s10 != null) {
            return s10.contains(str);
        }
        return false;
    }

    public static boolean C(Uri uri, Context context) {
        return B("image/", uri, context);
    }

    public static boolean D(int i10) {
        switch (i10) {
            case RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS /* 13001 */:
            case 13002:
            case 13003:
                return true;
            default:
                return false;
        }
    }

    public static boolean E(Uri uri, Context context) {
        return B("video/", uri, context);
    }

    public static boolean F(String str) {
        return str.equals(String.valueOf(6)) || str.equals(String.valueOf(8));
    }

    public static Uri G(Uri uri, Context context, j jVar) {
        int i10;
        try {
            int[] q10 = q(uri, context);
            String s10 = s(uri, context);
            if (L(q10[0], q10[1], jVar)) {
                i10 = jVar.f39028e;
            } else {
                if (!K(s10, jVar)) {
                    return uri;
                }
                s10 = ClipboardModule.MIMETYPE_JPEG;
                i10 = jVar.f39029f;
            }
            int[] p10 = p(q10[0], q10[1], jVar);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                String u10 = u(uri, context);
                Bitmap createScaledBitmap = F(u10) ? Bitmap.createScaledBitmap(decodeStream, p10[1], p10[0], true) : Bitmap.createScaledBitmap(decodeStream, p10[0], p10[1], true);
                File c10 = c(context, o(s10));
                OutputStream openOutputStream = context.getContentResolver().openOutputStream(Uri.fromFile(c10));
                try {
                    createScaledBitmap.compress(h(s10), i10, openOutputStream);
                    if (openOutputStream != null) {
                        openOutputStream.close();
                    }
                    J(c10, u10, context);
                    e(uri);
                    Uri fromFile = Uri.fromFile(c10);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return fromFile;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return uri;
        }
    }

    public static void H(Uri uri, Context context, String str) {
        Uri insert;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (str.equals("video")) {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        b(uri, insert, contentResolver);
    }

    public static void I(Intent intent) {
        int i10 = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i10 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    public static void J(File file, String str, Context context) {
        if (str.equals(String.valueOf(1)) || str.equals(String.valueOf(0))) {
            return;
        }
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(file);
        aVar.a0("Orientation", str);
        aVar.W();
    }

    public static boolean K(String str, j jVar) {
        if (!jVar.f39030g.booleanValue() || str == null) {
            return false;
        }
        return str.equals(ClipboardModule.MIMETYPE_HEIC) || str.equals(ClipboardModule.MIMETYPE_HEIF);
    }

    public static boolean L(int i10, int i11, j jVar) {
        int i12 = jVar.f39031h;
        if ((i12 == 0 || jVar.f39032i == 0) && jVar.f39028e == 100) {
            return false;
        }
        return i12 < i10 || jVar.f39032i < i11 || jVar.f39028e != 100;
    }

    public static List a(Intent intent) {
        if (intent.getClipData() == null) {
            return Collections.singletonList(intent.getData());
        }
        ClipData clipData = intent.getClipData();
        ArrayList arrayList = new ArrayList(clipData.getItemCount());
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            arrayList.add(clipData.getItemAt(i10).getUri());
        }
        return arrayList;
    }

    public static void b(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(uri2);
            try {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            openOutputStream.write(bArr, 0, read);
                        }
                    }
                    openInputStream.close();
                    if (openOutputStream != null) {
                        openOutputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static File c(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), f39037a + UUID.randomUUID() + "." + str);
            file.createNewFile();
            return file;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Uri d(File file, Context context) {
        return AbstractC5339d.getUriForFile(context, context.getApplicationContext().getPackageName() + ".imagepickerprovider", file);
    }

    public static void e(Uri uri) {
        new File(uri.getPath()).delete();
    }

    public static Uri f(Uri uri, Context context) {
        Uri uri2;
        String string;
        int lastIndexOf;
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String o10 = o(contentResolver.getType(uri));
        if (o10 == null) {
            uri2 = uri;
            Cursor query = contentResolver.query(uri2, null, null, null, null);
            if (query.moveToFirst() && (lastIndexOf = (string = query.getString(query.getColumnIndex("_display_name"))).lastIndexOf(46)) != -1) {
                o10 = string.substring(lastIndexOf + 1);
            }
        } else {
            uri2 = uri;
        }
        Uri fromFile = Uri.fromFile(c(context, o10));
        b(uri2, fromFile, contentResolver);
        return fromFile;
    }

    public static String g(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            byteArrayOutputStream.close();
                            openInputStream.close();
                            return encodeToString;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bitmap.CompressFormat h(String str) {
        str.getClass();
        return !str.equals(ClipboardModule.MIMETYPE_JPEG) ? !str.equals(ClipboardModule.MIMETYPE_PNG) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public static ReadableMap i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("didCancel", true);
        return createMap;
    }

    public static ReadableMap j(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorCode", str);
        if (str2 != null) {
            createMap.putString("errorMessage", str2);
        }
        return createMap;
    }

    public static String k(Uri uri, Context context) {
        return uri.getScheme().equals("file") ? uri.getLastPathSegment() : uri.getScheme().equals("content") ? l(uri, context) : "Unknown";
    }

    public static String l(Uri uri, Context context) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        String lastPathSegment = uri.getLastPathSegment();
        try {
            if (query.moveToFirst()) {
                lastPathSegment = query.getString(query.getColumnIndex("_display_name"));
            }
            query.close();
            return lastPathSegment;
        } catch (Throwable th2) {
            query.close();
            throw th2;
        }
    }

    public static String m(Uri uri, Context context) {
        Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        try {
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex == -1) {
                query.close();
                return null;
            }
            query.moveToFirst();
            String string = query.getString(columnIndex);
            query.close();
            return string;
        } catch (Throwable th2) {
            if (query == null) {
                throw th2;
            }
            try {
                query.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static double n(Uri uri, Context context) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            try {
                double statSize = openFileDescriptor.getStatSize();
                openFileDescriptor.close();
                return statSize;
            } finally {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0d;
        }
    }

    public static String o(String str) {
        if (str == null) {
            return "jpg";
        }
        switch (str) {
            case "image/jpeg":
                return "jpg";
            case "image/gif":
                return "gif";
            case "image/png":
                return "png";
            default:
                return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
    }

    public static int[] p(int i10, int i11, j jVar) {
        int i12;
        int i13 = jVar.f39031h;
        if (i13 == 0 || (i12 = jVar.f39032i) == 0) {
            return new int[]{i10, i11};
        }
        if (i13 < i10) {
            i11 = (int) ((i13 / i10) * i11);
            i10 = i13;
        }
        if (i12 < i11) {
            i10 = (int) ((i12 / i11) * i10);
        } else {
            i12 = i11;
        }
        return new int[]{i10, i12};
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] q(Uri uri, Context context) {
        int[] iArr;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                String u10 = u(uri, context);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openInputStream, null, options);
                if (F(u10)) {
                    iArr = new int[]{options.outHeight, options.outWidth};
                    if (openInputStream == null) {
                        return iArr;
                    }
                } else {
                    iArr = new int[]{options.outWidth, options.outHeight};
                }
                openInputStream.close();
                return iArr;
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return new int[]{0, 0};
        }
    }

    public static ReadableMap r(Uri uri, Uri uri2, j jVar, Context context) {
        b bVar = new b(uri2, context);
        int[] q10 = q(uri2, context);
        String k10 = k(uri, context);
        String v10 = v(uri, context);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", uri2.toString());
        createMap.putDouble("fileSize", n(uri2, context));
        createMap.putString("fileName", k10);
        createMap.putInt("width", q10[0]);
        createMap.putInt("height", q10[1]);
        createMap.putString("type", s(uri2, context));
        createMap.putString("originalPath", v10);
        if (jVar.f39025b.booleanValue()) {
            createMap.putString("base64", g(uri2, context));
        }
        if (jVar.f39026c.booleanValue()) {
            createMap.putString(EventKeys.TIMESTAMP, bVar.b());
            createMap.putString(StackTraceHelper.ID_KEY, k10);
        }
        return createMap;
    }

    public static String s(Uri uri, Context context) {
        if (uri.getScheme().equals("file")) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        }
        if (!uri.getScheme().equals("content")) {
            return "Unknown";
        }
        String type = context.getContentResolver().getType(uri);
        return k.a(type) ? t(uri, context) : type;
    }

    public static String t(Uri uri, Context context) {
        String l10 = l(uri, context);
        int lastIndexOf = l10.lastIndexOf(46);
        return lastIndexOf != -1 ? l10.substring(lastIndexOf + 1) : "Unknown";
    }

    public static String u(Uri uri, Context context) {
        return new androidx.exifinterface.media.a(context.getContentResolver().openInputStream(uri)).h("Orientation");
    }

    public static String v(Uri uri, Context context) {
        if (!uri.getScheme().contains("content")) {
            return uri.toString();
        }
        String m10 = m(uri, context);
        f(uri, context);
        return m10;
    }

    public static ReadableMap w(List list, j jVar, Context context) {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = (Uri) list.get(i10);
            Uri f10 = uri.getScheme().contains("content") ? f(uri, context) : uri;
            if (C(uri, context)) {
                createArray.pushMap(r(uri, G(f10, context, jVar), jVar, context));
            } else {
                if (!E(uri, context)) {
                    throw new RuntimeException("Unsupported file type");
                }
                if (uri.getScheme().contains("content")) {
                    f10 = f(uri, context);
                }
                createArray.pushMap(x(uri, f10, jVar, context));
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("assets", createArray);
        return createMap;
    }

    public static ReadableMap x(Uri uri, Uri uri2, j jVar, Context context) {
        WritableMap createMap = Arguments.createMap();
        m mVar = new m(uri2, context);
        String k10 = k(uri, context);
        String v10 = v(uri, context);
        createMap.putString("uri", uri2.toString());
        createMap.putDouble("fileSize", n(uri2, context));
        createMap.putInt("duration", mVar.d());
        createMap.putInt("bitrate", mVar.b());
        createMap.putString("fileName", k10);
        createMap.putString("type", s(uri2, context));
        createMap.putInt("width", mVar.f());
        createMap.putInt("height", mVar.e());
        createMap.putString("originalPath", v10);
        if (jVar.f39026c.booleanValue()) {
            createMap.putString(EventKeys.TIMESTAMP, mVar.c());
            createMap.putString(StackTraceHelper.ID_KEY, k10);
        }
        return createMap;
    }

    public static boolean y(Activity activity) {
        return AbstractC5338c.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean z(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera") || context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }
}
