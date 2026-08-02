package com.vk.security.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import com.vk.metrics.performance.appstart.content_provider.a;
import io.reactivex.rxjava3.subjects.c;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.drm0;
import xsna.e43;
import xsna.gz80;
import xsna.i6n0;
import xsna.qq;
import xsna.rq;
import xsna.t33;
import xsna.u790;
import xsna.z2i0;

/* compiled from: VKFileProvider.kt */
/* loaded from: classes11.dex */
public final class VKFileProvider extends FileProvider {
    public final List<String> b;

    static {
        a.b("com.vk.security.content.VKFileProvider.<clinit>(VKFileProvider.kt)");
        try {
        } finally {
            a.a("com.vk.security.content.VKFileProvider.<clinit>(VKFileProvider.kt)");
        }
    }

    public VKFileProvider() {
        a.b("com.vk.security.content.VKFileProvider.<init>(VKFileProvider.kt:32)");
        try {
            this.b = Collections.singletonList("/internal/splitcompat/");
        } finally {
            a.a("com.vk.security.content.VKFileProvider.<init>(VKFileProvider.kt:32)");
        }
    }

    public static void b(SecurityException securityException) {
        b.a.q(securityException);
    }

    public final boolean a(Uri uri, String str, boolean z) {
        Context applicationContext;
        PackageManager packageManager = getContext().getPackageManager();
        if (str != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (((applicationInfo != null ? applicationInfo.flags : 0) & 129) == 0 && !u790.a(packageInfo, e43.l("A197F9212F2FED64F0FF9C2A4EDF24B9C8801C8C", "86259288a43f6c409a922bc3ce40ba08085bbadb", "48761eef50ee53afc4cc9c5f10e6bde7f8f5b82f"))) {
                    Context context = getContext();
                    String packageName = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageName();
                    if (packageName != null && !str.equals(packageName)) {
                        if (z) {
                            StringBuilder a = t33.a("Application with package {", str, "} with flags ");
                            ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                            a.append(applicationInfo2 != null ? applicationInfo2.flags : -1);
                            a.append(" has tried to get access to VkFileProvider uri - ");
                            a.append(uri);
                            a.append('!');
                            b(new SecurityException(a.toString()));
                        }
                        return false;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        a.b("com.vk.security.content.VKFileProvider.attachInfo(VKFileProvider.kt:50)");
        try {
            try {
                super.attachInfo(context, providerInfo);
            } catch (Exception e) {
                L.g("attachInfo Exception", e);
            }
        } finally {
            a.a("com.vk.security.content.VKFileProvider.attachInfo(VKFileProvider.kt:50)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        Context context;
        Integer num;
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "]."));
        int i = gz80.a;
        if ((i == 26 || i == 27) && ((context = getContext()) == null || !new z2i0(context).b(uri))) {
            if (callingPackage == null) {
                b(new SecurityException(c.c("Application with empty package has tried to get access to VkFileProvider uri - ", uri, '!')));
            } else if (!a(uri, callingPackage, true)) {
                b(new SecurityException(rq.b("Unsafe operation from ", callingPackage, " - ", uri, '!')));
            }
            num = null;
            return num == null ? num.intValue() : contentValuesArr.length;
        }
        num = Integer.valueOf(super.bulkInsert(uri, contentValuesArr));
        if (num == null) {
        }
    }

    @Override // android.content.ContentProvider
    public final Uri canonicalize(Uri uri) {
        Context context;
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "]."));
        int i = gz80.a;
        if ((i != 26 && i != 27) || ((context = getContext()) != null && new z2i0(context).b(uri))) {
            return super.canonicalize(uri);
        }
        if (callingPackage == null) {
            b(new SecurityException(c.c("Application with empty package has tried to get access to VkFileProvider uri - ", uri, '!')));
            return null;
        }
        if (a(uri, callingPackage, true)) {
            return super.canonicalize(uri);
        }
        b(new SecurityException(rq.b("Unsafe operation from ", callingPackage, " - ", uri, '!')));
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "]."));
        String path = uri.getPath();
        if (path == null) {
            L.e(i6n0.a(uri, "Can not find file for "));
            return super.delete(uri, str, strArr);
        }
        if (!a(uri, callingPackage, false)) {
            List<String> list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (drm0.D(path, (CharSequence) it.next(), false)) {
                        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
                        return -1;
                    }
                }
            }
        }
        return super.delete(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        Context context;
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "]."));
        int i = gz80.a;
        if ((i != 26 && i != 27) || ((context = getContext()) != null && new z2i0(context).b(uri))) {
            return super.getStreamTypes(uri, str);
        }
        if (callingPackage == null) {
            b(new SecurityException(c.c("Application with empty package has tried to get access to VkFileProvider uri - ", uri, '!')));
            return null;
        }
        if (a(uri, callingPackage, true)) {
            return super.getStreamTypes(uri, str);
        }
        b(new SecurityException(rq.b("Unsafe operation from ", callingPackage, " - ", uri, '!')));
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "]."));
        String path = uri.getPath();
        if (path == null) {
            L.e(i6n0.a(uri, "Can not find file for "));
            return super.insert(uri, contentValues);
        }
        if (!a(uri, callingPackage, false)) {
            List<String> list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (drm0.D(path, (CharSequence) it.next(), false)) {
                        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
                        return null;
                    }
                }
            }
        }
        return super.insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return super.openAssetFile(uri, str);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "]."));
        String path = uri.getPath();
        if (path == null) {
            L.e(i6n0.a(uri, "Can not find file for "));
            return super.openFile(uri, str);
        }
        if (!a(uri, callingPackage, false)) {
            List<String> list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (drm0.D(path, (CharSequence) it.next(), false)) {
                        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
                        return null;
                    }
                }
            }
        }
        return super.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public final <T> ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, T t, ContentProvider.PipeDataWriter<T> pipeDataWriter) throws FileNotFoundException {
        Context context;
        ParcelFileDescriptor openPipeHelper;
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "]."));
        int i = gz80.a;
        if ((i == 26 || i == 27) && ((context = getContext()) == null || !new z2i0(context).b(uri))) {
            if (callingPackage == null) {
                b(new SecurityException(c.c("Application with empty package has tried to get access to VkFileProvider uri - ", uri, '!')));
            } else if (a(uri, callingPackage, true)) {
                openPipeHelper = super.openPipeHelper(uri, str, bundle, t, pipeDataWriter);
            } else {
                b(new SecurityException(rq.b("Unsafe operation from ", callingPackage, " - ", uri, '!')));
            }
            openPipeHelper = null;
        } else {
            openPipeHelper = super.openPipeHelper(uri, str, bundle, t, pipeDataWriter);
        }
        if (openPipeHelper != null) {
            return openPipeHelper;
        }
        throw new FileNotFoundException("Can't find file from " + getCallingPackage());
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) throws FileNotFoundException {
        Context context;
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "]."));
        int i = gz80.a;
        if ((i != 26 && i != 27) || ((context = getContext()) != null && new z2i0(context).b(uri))) {
            return super.openTypedAssetFile(uri, str, bundle);
        }
        if (callingPackage == null) {
            b(new SecurityException(c.c("Application with empty package has tried to get access to VkFileProvider uri - ", uri, '!')));
            return null;
        }
        if (a(uri, callingPackage, true)) {
            return super.openTypedAssetFile(uri, str, bundle);
        }
        b(new SecurityException(rq.b("Unsafe operation from ", callingPackage, " - ", uri, '!')));
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        Context context;
        Cursor cursor;
        a.b("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:110)");
        try {
            String callingPackage = getCallingPackage();
            L.e("Checking access permission to uri [" + uri + "] from package [" + callingPackage + "].");
            int i = gz80.a;
            if ((i == 26 || i == 27) && ((context = getContext()) == null || !new z2i0(context).b(uri))) {
                if (callingPackage == null) {
                    b(new SecurityException("Application with empty package has tried to get access to VkFileProvider uri - " + uri + '!'));
                } else if (!a(uri, callingPackage, true)) {
                    b(new SecurityException("Unsafe operation from " + callingPackage + " - " + uri + '!'));
                }
                cursor = null;
                return cursor;
            }
            cursor = super.query(uri, strArr, bundle, cancellationSignal);
            return cursor;
        } finally {
            a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:110)");
        }
    }

    @Override // android.content.ContentProvider
    public final Uri uncanonicalize(Uri uri) {
        Context context;
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "]."));
        int i = gz80.a;
        if ((i != 26 && i != 27) || ((context = getContext()) != null && new z2i0(context).b(uri))) {
            return super.uncanonicalize(uri);
        }
        if (callingPackage == null) {
            b(new SecurityException(c.c("Application with empty package has tried to get access to VkFileProvider uri - ", uri, '!')));
            return null;
        }
        if (a(uri, callingPackage, true)) {
            return super.uncanonicalize(uri);
        }
        b(new SecurityException(rq.b("Unsafe operation from ", callingPackage, " - ", uri, '!')));
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "]."));
        String path = uri.getPath();
        if (path == null) {
            L.e(i6n0.a(uri, "Can not find file for "));
            return super.update(uri, contentValues, str, strArr);
        }
        if (!a(uri, callingPackage, false)) {
            List<String> list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (drm0.D(path, (CharSequence) it.next(), false)) {
                        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
                        return -1;
                    }
                }
            }
        }
        return super.update(uri, contentValues, str, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (new xsna.z2i0(r2).b(r9) == true) goto L34;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        Cursor query;
        a.b("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:123)");
        try {
            String callingPackage = getCallingPackage();
            L.e("Checking access permission to uri [" + uri + "] from package [" + callingPackage + "].");
            int i = gz80.a;
            try {
                if (i == 26 || i == 27) {
                    Context context = getContext();
                    if (context != null) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:123)");
                            throw th2;
                        }
                    }
                    if (callingPackage == null) {
                        b(new SecurityException("Application with empty package has tried to get access to VkFileProvider uri - " + uri + '!'));
                    } else if (!a(uri, callingPackage, true)) {
                        b(new SecurityException("Unsafe operation from " + callingPackage + " - " + uri + '!'));
                    } else {
                        query = super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
                        a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:123)");
                        return query;
                    }
                    query = null;
                    a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:123)");
                    return query;
                }
                query = super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
                a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:123)");
                return query;
            } catch (Throwable th3) {
                th = th3;
                Throwable th22 = th;
                a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:123)");
                throw th22;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (new xsna.z2i0(r2).b(r9) == true) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ae A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:3:0x000b, B:11:0x00ae, B:12:0x00b6, B:22:0x0039, B:28:0x0064, B:30:0x007f, B:32:0x0085, B:33:0x00a5), top: B:2:0x000b }] */
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        a.b("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:135)");
        try {
            String callingPackage = getCallingPackage();
            L.e("Checking access permission to uri [" + uri + "] from package [" + callingPackage + "].");
            int i = gz80.a;
            try {
                if (i == 26 || i == 27) {
                    Context context = getContext();
                    if (context != null) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:135)");
                            throw th2;
                        }
                    }
                    if (callingPackage == null) {
                        b(new SecurityException("Application with empty package has tried to get access to VkFileProvider uri - " + uri + '!'));
                    } else if (!a(uri, callingPackage, true)) {
                        b(new SecurityException("Unsafe operation from " + callingPackage + " - " + uri + '!'));
                    } else {
                        query = super.query(uri, strArr, str, strArr2, str2);
                        if (query == null) {
                            query = new MatrixCursor(new String[0], 0);
                        }
                        a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:135)");
                        return query;
                    }
                    query = null;
                    if (query == null) {
                    }
                    a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:135)");
                    return query;
                }
                query = super.query(uri, strArr, str, strArr2, str2);
                if (query == null) {
                }
                a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:135)");
                return query;
            } catch (Throwable th3) {
                th = th3;
                Throwable th22 = th;
                a.a("com.vk.security.content.VKFileProvider.query(VKFileProvider.kt:135)");
                throw th22;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) throws FileNotFoundException {
        Context context;
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "]."));
        int i = gz80.a;
        if ((i != 26 && i != 27) || ((context = getContext()) != null && new z2i0(context).b(uri))) {
            return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
        }
        if (callingPackage == null) {
            b(new SecurityException(c.c("Application with empty package has tried to get access to VkFileProvider uri - ", uri, '!')));
            return null;
        }
        if (!a(uri, callingPackage, true)) {
            b(new SecurityException(rq.b("Unsafe operation from ", callingPackage, " - ", uri, '!')));
            return null;
        }
        return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        String callingPackage = getCallingPackage();
        L.e(qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "]."));
        String path = uri.getPath();
        if (path == null) {
            L.e(i6n0.a(uri, "Can not find file for "));
            return super.openFile(uri, str, cancellationSignal);
        }
        if (!a(uri, callingPackage, false)) {
            List<String> list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (drm0.D(path, (CharSequence) it.next(), false)) {
                        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
                        return null;
                    }
                }
            }
        }
        return super.openFile(uri, str, cancellationSignal);
    }
}
