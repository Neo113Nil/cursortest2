package com.vk.core.files;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.bd3;
import xsna.bpn0;
import xsna.cqm0;
import xsna.dag0;
import xsna.drm0;
import xsna.e43;
import xsna.e8r;
import xsna.eqm0;
import xsna.fr6;
import xsna.hl10;
import xsna.kgf;
import xsna.oeq0;
import xsna.r11;
import xsna.seq;
import xsna.sua;
import xsna.vhk0;
import xsna.z2i0;
import xsna.z4g;

/* compiled from: FileUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static final Regex a = new Regex("(\\d+).+/");
    public static final seq b = new seq();
    public static final z2i0 c = new z2i0(e43.a);
    public static final String[] d = {"jpg", "jpeg", "png"};
    public static final String[] e = {"mp3"};
    public static final String[] f = {"avi", "mp4", "3gp", "mpeg", "mov", "flv", "wmv"};
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final bpn0 h = new bpn0(new fr6(2));

    /* compiled from: FileUtils.java */
    /* renamed from: com.vk.core.files.a$a, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public static class C0764a {
        public void a(@NonNull ArrayList<Uri> arrayList) {
            throw null;
        }

        public void b(@Nullable Exception exc) {
            throw null;
        }
    }

    /* compiled from: FileUtils.java */
    public static class c {
        public static void a(@Nullable Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }

        public static void b(@Nullable Closeable... closeableArr) {
            for (Closeable closeable : closeableArr) {
                a(closeable);
            }
        }

        @Nullable
        public static OutputStream c(@NonNull Context context, @NonNull Uri uri) {
            try {
                return context.getContentResolver().openOutputStream(uri);
            } catch (IOException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                L.B("vk", e.getMessage(), e);
                return null;
            }
        }
    }

    public static boolean A(@NonNull String str) {
        try {
            return Environment.isExternalStorageRemovable(new File(str));
        } catch (Exception e2) {
            L.i(e2);
            return str.toUpperCase().contains("SD");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable, java.io.DataInputStream] */
    @Nullable
    public static byte[] B(@Nullable File file, @Nullable byte[] bArr) {
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        ?? r3;
        Closeable closeable = null;
        if (file != null && file.isFile()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    try {
                        r3 = new DataInputStream(bufferedInputStream);
                        try {
                            int I = (int) I(file);
                            if (bArr == null) {
                                bArr = new byte[I];
                            }
                            r3.readFully(bArr, 0, I);
                            c.a(r3);
                            c.a(bufferedInputStream);
                            c.a(fileInputStream);
                            return bArr;
                        } catch (IOException unused) {
                            c.a(r3);
                            c.a(bufferedInputStream);
                            c.a(fileInputStream);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            closeable = r3;
                            c.a(closeable);
                            c.a(bufferedInputStream);
                            c.a(fileInputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        r3 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException unused3) {
                    bufferedInputStream = null;
                    r3 = bufferedInputStream;
                    c.a(r3);
                    c.a(bufferedInputStream);
                    c.a(fileInputStream);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                }
            } catch (IOException unused4) {
                fileInputStream = null;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                bufferedInputStream = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Nullable
    public static String C(@NonNull File file) {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        ?? r2;
        Throwable th;
        InputStreamReader inputStreamReader3;
        String str = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                inputStreamReader2 = new InputStreamReader(fileInputStream);
                try {
                    r2 = new BufferedReader(inputStreamReader2);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = r2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        str = sb.toString();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader3 = r2;
                        c.a(inputStreamReader3);
                        c.a(inputStreamReader2);
                        c.a(fileInputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                    r2 = 0;
                } catch (Throwable th3) {
                    inputStreamReader3 = null;
                    th = th3;
                }
            } catch (IOException unused3) {
                inputStreamReader2 = null;
                r2 = 0;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
                th = th;
                inputStreamReader2 = inputStreamReader;
                inputStreamReader3 = inputStreamReader;
                c.a(inputStreamReader3);
                c.a(inputStreamReader2);
                c.a(fileInputStream);
                throw th;
            }
        } catch (IOException unused4) {
            inputStreamReader2 = null;
            fileInputStream = null;
            r2 = 0;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            inputStreamReader = null;
        }
        c.a(r2);
        c.a(inputStreamReader2);
        c.a(fileInputStream);
        return str;
    }

    public static void D(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.exists()) {
                file.delete();
            }
            c(file);
        } catch (Exception unused) {
        }
    }

    @Nullable
    public static String E(@NonNull Uri uri) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(e43.a.getContentResolver().getType(uri));
    }

    @NonNull
    public static String F(Uri uri) {
        return ((dag0) h.getValue()).b(uri);
    }

    public static int G(@NonNull Uri uri) {
        String E;
        String scheme = uri.getScheme();
        if (scheme == null) {
            return 0;
        }
        if (X3.i.b.equalsIgnoreCase(scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 0;
            }
            String[] split = lastPathSegment.split("\\.");
            E = split[split.length - 1].toLowerCase();
        } else {
            E = E(uri);
        }
        if (E == null) {
            return (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(scheme) || TextUtils.isEmpty(F(uri))) ? 0 : 4;
        }
        if (Arrays.asList(e).contains(E)) {
            return 1;
        }
        if (Arrays.asList(d).contains(E)) {
            return 2;
        }
        return Arrays.asList(f).contains(E) ? 3 : 4;
    }

    public static void H(@NonNull Bitmap bitmap, @NonNull OutputStream outputStream) {
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
        } finally {
            c.a(outputStream);
        }
    }

    public static long I(File file) {
        File[] listFiles;
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                j += I(file2);
            }
        }
        return j;
    }

    public static long J(File file) {
        List<String> b2;
        long j = -1;
        try {
            hl10 b3 = a.b(a0a.b(new InputStreamReader(Runtime.getRuntime().exec("du " + file.toString() + " -s").getInputStream())));
            if (b3 != null && (b2 = b3.b()) != null && !b2.isEmpty()) {
                j = Integer.parseInt((String) ((hl10.a) b2).get(1)) * 1024;
            }
        } catch (Exception unused) {
        }
        return j > 0 ? j : I(file);
    }

    @Nullable
    public static String K(Uri uri) {
        String str = null;
        if (e43.a.getString(R.string.vk_file_provider_authority).equals(uri.getHost()) && uri.getPath().startsWith("/external_storage")) {
            File externalFilesDir = e43.a.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                oeq0.d(e43.a, uri);
            }
            str = externalFilesDir.getAbsolutePath() + uri.getPath().substring(17);
        }
        if (str == null) {
            str = oeq0.d(e43.a, uri);
        }
        L.e(String.format("Converted %s to %s", uri, str));
        return str;
    }

    public static File L(String str) {
        PrivateFiles.a b2;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.LARGE_TEMP_UPLOADS;
        privateFiles.getClass();
        b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        File file = new File(b2.a, str);
        return (!file.exists() || file.length() <= 0) ? file : L(eqm0.b(str));
    }

    public static ArrayList M(File file, File file2, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (z) {
            vhk0.b(file);
        }
        if (!file.exists()) {
            file.mkdir();
        }
        ZipFile zipFile = new ZipFile(file2);
        try {
            byte[] bArr = new byte[8192];
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (z(nextElement.getName())) {
                    throw new IllegalArgumentException("Failed! incorrect path!");
                }
                File file3 = new File(file, nextElement.getName());
                File parentFile = nextElement.isDirectory() ? file3 : file3.getParentFile();
                if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                    throw new FileNotFoundException("Failed to ensure directory: " + parentFile.getAbsolutePath());
                }
                if (!nextElement.isDirectory()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    InputStream inputStream = zipFile.getInputStream(nextElement);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (Throwable th) {
                            c.a(fileOutputStream);
                            c.a(inputStream);
                            throw th;
                        }
                    }
                    c.a(fileOutputStream);
                    c.a(inputStream);
                    arrayList.add(nextElement.getName());
                }
            }
            c.a(zipFile);
            return arrayList;
        } catch (Throwable th2) {
            c.a(zipFile);
            throw th2;
        }
    }

    @Nullable
    public static Uri N(File file) {
        try {
            return FileProvider.getUriForFile(e43.a, BuildInfo.f, file);
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.q(e2);
            return null;
        }
    }

    public static void O(@NonNull File file, @NonNull byte[] bArr) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        D(file);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            c.a(bufferedOutputStream);
        } catch (IOException unused3) {
            bufferedOutputStream2 = bufferedOutputStream;
            c.a(bufferedOutputStream2);
            c.a(fileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            c.a(bufferedOutputStream2);
            c.a(fileOutputStream);
            throw th;
        }
        c.a(fileOutputStream);
    }

    public static boolean P(@NonNull File file, @NonNull String str) {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        FileOutputStream fileOutputStream = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            if (file.createNewFile()) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    dataOutputStream2 = new DataOutputStream(fileOutputStream2);
                    try {
                        dataOutputStream2.write(str.getBytes());
                        fileOutputStream = fileOutputStream2;
                    } catch (Exception unused) {
                        fileOutputStream = fileOutputStream2;
                        c.a(fileOutputStream);
                        c.a(dataOutputStream2);
                        return false;
                    } catch (Throwable th) {
                        dataOutputStream = dataOutputStream2;
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        c.a(fileOutputStream);
                        c.a(dataOutputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                    dataOutputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = null;
                }
            } else {
                dataOutputStream2 = null;
            }
            c.a(fileOutputStream);
            c.a(dataOutputStream2);
            return true;
        } catch (Exception unused3) {
            dataOutputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
        }
    }

    public static void a(File file, File file2) throws IOException {
        if (!file2.exists()) {
            c(file2);
        }
        if (!b.b(file, file2)) {
            throw new IOException();
        }
    }

    public static void b(File file, File file2) throws IOException {
        if (!file2.exists()) {
            c(file2);
        }
        if (!b.e(file, file2, null)) {
            throw new IOException();
        }
    }

    public static boolean c(File file) {
        if (file != null) {
            if (z(file.getAbsolutePath())) {
                L.G("relative path found in " + file.getAbsolutePath());
                return false;
            }
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    return file.createNewFile();
                }
            } catch (Exception unused) {
                L.G("can't create " + file.getAbsolutePath());
                return false;
            }
        }
        return false;
    }

    @NonNull
    public static File d(@NonNull Uri uri) {
        String F = F(uri);
        PrivateFiles privateFiles = e8r.a;
        if ("unknown".equals(F)) {
            PrivateSubdir privateSubdir = PrivateSubdir.TEMP_UPLOADS;
            String E = E(uri);
            privateFiles.getClass();
            return PrivateFiles.e(privateFiles, privateSubdir, null, E, 24);
        }
        String[] split = F.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : null;
        if (str == null || str.length() == 0) {
            str = E(uri);
        }
        PrivateSubdir privateSubdir2 = PrivateSubdir.TEMP_UPLOADS;
        String str2 = split[0];
        privateFiles.getClass();
        return PrivateFiles.e(privateFiles, privateSubdir2, str2, str, 24);
    }

    public static void e(File file) {
        PrivateFiles.a b2;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.LARGE_TEMP_UPLOADS;
        privateFiles.getClass();
        b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        if (file.getAbsolutePath().startsWith(b2.a.getAbsolutePath())) {
            try {
                L.e(String.format("Deleted %s", file.getAbsoluteFile()));
                file.delete();
            } catch (Exception e2) {
                L.i(e2);
            }
        }
    }

    public static String f(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, null, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        L.e(String.format("Converted %s to %s", uri, string));
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

    @Nullable
    public static String g(String str) {
        if (str == null) {
            return null;
        }
        String p = cqm0.p(str);
        String m0 = drm0.m0('?', p, p);
        int lastIndexOf = m0.lastIndexOf(46);
        if (Math.max(m0.lastIndexOf(47), m0.lastIndexOf(92)) > lastIndexOf) {
            lastIndexOf = -1;
        }
        return lastIndexOf == -1 ? "" : m0.substring(lastIndexOf + 1);
    }

    public static File h(Context context, Uri uri, String str) {
        File L = L(str);
        L.e(String.format("Copied %s to %s", uri.toString(), L.getAbsoluteFile()));
        if (b.a(context, uri, L, null)) {
            return L;
        }
        return null;
    }

    public static File i(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        PermissionHelper.a.getClass();
        if (!PermissionHelper.q(context)) {
            String scheme = uri.getScheme();
            if (!TextUtils.isEmpty(scheme) && !X3.i.b.equals(scheme)) {
                return h(e43.a, uri, System.currentTimeMillis() + "." + E(uri));
            }
        }
        String m = m(context, uri);
        if (m != null) {
            return new File(m);
        }
        return null;
    }

    public static File j() {
        return ((Context) c.a).getCacheDir();
    }

    public static File k(String str, String str2) {
        PrivateFiles.a b2;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.LARGE_TEMP_UPLOADS;
        privateFiles.getClass();
        b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        File file = b2.a;
        StringBuilder c2 = r11.c("TEMP_TRIM_", str);
        c2.append(".".concat(str2));
        return new File(file, c2.toString());
    }

    public static String l(File file) {
        String g2 = g(file.getName());
        if (TextUtils.isEmpty(g2)) {
            return "application/*";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(g2);
        return !TextUtils.isEmpty(mimeTypeFromExtension) ? mimeTypeFromExtension : "application/*";
    }

    @Nullable
    public static String m(Context context, Uri uri) {
        File externalFilesDir;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] split = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if ("primary".equalsIgnoreCase(split[0]) && (externalFilesDir = e43.a.getExternalFilesDir(null)) != null) {
                    return externalFilesDir + DomExceptionUtils.SEPARATOR + split[1];
                }
            } else {
                if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    return f(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return f(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(uri.getScheme())) {
                if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                    return uri.getLastPathSegment();
                }
                try {
                    return f(context, uri, null, null);
                } catch (IllegalArgumentException | SecurityException unused) {
                    return null;
                }
            }
            if (X3.i.b.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    @Nullable
    public static String n(Uri uri) {
        Uri uri2;
        String K = K(uri);
        if (K == null) {
            uri2 = uri;
            Cursor query = e43.a.getContentResolver().query(uri2, new String[]{"_data"}, null, null, null);
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                query.moveToFirst();
                K = query.getString(columnIndexOrThrow);
                query.close();
            } finally {
            }
        } else {
            uri2 = uri;
        }
        L.e(String.format("Converted %s to %s", uri2, K));
        return K;
    }

    public static long o(int i) {
        PrivateFiles.a b2;
        PrivateFiles.a b3;
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            PrivateFiles privateFiles = e8r.a;
            PrivateSubdir privateSubdir = PrivateSubdir.BASE;
            privateFiles.getClass();
            b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
            b3 = privateFiles.b(r3, PrivateSubdir.BASE_CACHE.h(), true);
            PrivateFiles.StorageType storageType = b2.b;
            PrivateFiles.StorageType storageType2 = PrivateFiles.StorageType.INTERNAL;
            if (storageType != storageType2) {
                arrayList.add(b2.a);
            }
            if (b3.b != storageType2) {
                arrayList.add(b3.a);
            }
        } else {
            arrayList.add(((Context) c.a).getCacheDir());
            arrayList.add(e43.a.getFilesDir());
        }
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += z4g.g((File) it.next());
        }
        return (j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static File p() {
        PrivateFiles.a b2;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.TEMP_UPLOADS;
        privateFiles.getClass();
        b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        return new File(b2.a, "TEMP_TRIM_" + System.currentTimeMillis() + ".".concat("tmp"));
    }

    public static File q() {
        PrivateFiles.a b2;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.TEMP_UPLOADS;
        privateFiles.getClass();
        b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        return new File(b2.a, "GRAF_" + System.currentTimeMillis() + ".".concat("png"));
    }

    public static File r() {
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.STORIES_TEMP;
        String str = w() + "_output";
        privateFiles.getClass();
        return PrivateFiles.e(privateFiles, privateSubdir, str, "mp4", 24);
    }

    public static File s() {
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.TEMP_UPLOADS;
        String str = w() + "";
        privateFiles.getClass();
        return PrivateFiles.e(privateFiles, privateSubdir, str, "jpg", 24);
    }

    public static File t() {
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.STORIES_TEMP;
        String str = w() + "";
        privateFiles.getClass();
        return PrivateFiles.e(privateFiles, privateSubdir, str, "jpg", 24);
    }

    public static File u() {
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.TEMP_UPLOADS;
        String str = w() + "";
        privateFiles.getClass();
        return PrivateFiles.e(privateFiles, privateSubdir, str, "mp4", 24);
    }

    public static File v() {
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.STORIES_TEMP;
        String str = w() + "";
        privateFiles.getClass();
        return PrivateFiles.e(privateFiles, privateSubdir, str, "mp4", 24);
    }

    public static long w() {
        long currentTimeMillis = System.currentTimeMillis();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return currentTimeMillis;
    }

    public static boolean x(String str) {
        return !TextUtils.isEmpty(str) && bd3.d(str);
    }

    public static boolean y(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return vhk0.g(new File(drm0.U(str, "file://")));
    }

    public static boolean z(String str) {
        if (str != null) {
            return str.contains("../") || str.matches("(.*)/lib(.*)/(.*)") || str.matches("(.*)\\.so$");
        }
        return false;
    }

    /* compiled from: FileUtils.java */
    /* loaded from: classes17.dex */
    public static class b {

        /* compiled from: FileUtils.java */
        /* renamed from: com.vk.core.files.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC0765a {
            void onComplete();

            void onError(Throwable th);

            void onStart();
        }

        public static boolean a(@NonNull Context context, @NonNull Uri uri, @NonNull File file, @Nullable InterfaceC0765a interfaceC0765a) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                e.getMessage();
                fileOutputStream = null;
            }
            return c(context, uri, fileOutputStream, interfaceC0765a);
        }

        public static boolean b(@NonNull File file, @NonNull File file2) {
            FileInputStream fileInputStream;
            FileOutputStream fileOutputStream;
            Uri fromFile = Uri.fromFile(file);
            z2i0 z2i0Var = a.c;
            boolean b = z2i0Var.b(fromFile);
            boolean b2 = z2i0Var.b(Uri.fromFile(file2));
            if (b && !b2) {
                return false;
            }
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.getMessage();
                fileInputStream = null;
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException e2) {
                e2.getMessage();
                fileOutputStream = null;
            }
            return d(fileInputStream, fileOutputStream, null);
        }

        public static boolean c(@NonNull Context context, @NonNull Uri uri, @Nullable OutputStream outputStream, @Nullable InterfaceC0765a interfaceC0765a) {
            InputStream inputStream;
            if (!a.c.b(uri)) {
                return false;
            }
            try {
                inputStream = sua.k(context, uri);
            } catch (IOException e) {
                e.getMessage();
                inputStream = null;
            }
            return d(inputStream, outputStream, interfaceC0765a);
        }

        public static boolean d(@Nullable InputStream inputStream, @Nullable OutputStream outputStream, @Nullable InterfaceC0765a interfaceC0765a) {
            if (inputStream != null) {
                if (outputStream != null) {
                    if (interfaceC0765a != null) {
                        interfaceC0765a.onStart();
                    }
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            outputStream.write(bArr, 0, read);
                        }
                        if (interfaceC0765a != null) {
                            interfaceC0765a.onComplete();
                        }
                        c.b(inputStream, outputStream);
                        return true;
                    } catch (Throwable th) {
                        try {
                            L.B("vk", th.getMessage(), th);
                            if (interfaceC0765a != null) {
                                interfaceC0765a.onError(th);
                            }
                            c.b(inputStream, outputStream);
                            return false;
                        } catch (Throwable th2) {
                            c.b(inputStream, outputStream);
                            throw th2;
                        }
                    }
                }
                if (interfaceC0765a != null) {
                    interfaceC0765a.onError(null);
                    return false;
                }
            } else if (interfaceC0765a != null) {
                interfaceC0765a.onError(null);
            }
            return false;
        }

        public static boolean e(@NonNull File file, @NonNull File file2, @Nullable kgf kgfVar) {
            FileInputStream fileInputStream;
            FileOutputStream fileOutputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.getMessage();
                fileInputStream = null;
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException e2) {
                e2.getMessage();
            }
            return d(fileInputStream, fileOutputStream, kgfVar);
        }

        /* compiled from: FileUtils.java */
        /* renamed from: com.vk.core.files.a$b$b, reason: collision with other inner class name */
        public static class C0766b implements InterfaceC0765a {
            @Override // com.vk.core.files.a.b.InterfaceC0765a
            public void onComplete() {
            }

            @Override // com.vk.core.files.a.b.InterfaceC0765a
            public final void onStart() {
            }
        }
    }
}
