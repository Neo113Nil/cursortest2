package com.vk.superapp.provider;

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
import io.reactivex.rxjava3.subjects.c;
import java.io.FileNotFoundException;
import xsna.gz80;
import xsna.i5s;
import xsna.par0;
import xsna.qq;
import xsna.rq;
import xsna.t33;

/* compiled from: SakFileProvider.kt */
/* loaded from: classes11.dex */
public final class SakFileProvider extends FileProvider {
    public static final a b;

    /* compiled from: SakFileProvider.kt */
    public static final class a {
        public static String a(Context context) {
            Context applicationContext;
            return i5s.a(new StringBuilder(), (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageName(), ".vk.superappkit.file_provider");
        }
    }

    static {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.superapp.provider.SakFileProvider.<clinit>(SakFileProvider.kt)");
        try {
            b = new a();
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.<clinit>(SakFileProvider.kt)");
        }
    }

    public SakFileProvider() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.superapp.provider.SakFileProvider.<init>(SakFileProvider.kt:50)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.<init>(SakFileProvider.kt:50)");
        }
    }

    public static void b(SecurityException securityException) {
        par0.a.getClass();
        par0.d(securityException);
    }

    public final boolean a(Uri uri, String str, boolean z) {
        Context applicationContext;
        PackageManager packageManager = getContext().getPackageManager();
        if (str != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (((applicationInfo != null ? applicationInfo.flags : 0) & 129) == 0) {
                    Context context = getContext();
                    String packageName = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageName();
                    if (packageName != null && !str.equals(packageName)) {
                        if (z) {
                            StringBuilder a2 = t33.a("Application with package {", str, "} with flags ");
                            ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                            a2.append(applicationInfo2 != null ? applicationInfo2.flags : -1);
                            a2.append(" has tried to get access to VkFileProvider uri - ");
                            a2.append(uri);
                            a2.append('!');
                            b(new SecurityException(a2.toString()));
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
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.superapp.provider.SakFileProvider.attachInfo(SakFileProvider.kt:53)");
        try {
            try {
                super.attachInfo(context, providerInfo);
            } catch (Exception e) {
                par0.a.getClass();
                par0.c("attachInfo Exception", e);
            }
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.attachInfo(SakFileProvider.kt:53)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        Integer num;
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        int i = gz80.a;
        if (i == 26 || i == 27) {
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
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        int i = gz80.a;
        if (i != 26 && i != 27) {
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
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        if (uri.getPath() == null) {
            par0.a("Can not find file for " + uri);
            return super.delete(uri, str, strArr);
        }
        if (a(uri, callingPackage, false)) {
            return super.delete(uri, str, strArr);
        }
        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
        return -1;
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        int i = gz80.a;
        if (i != 26 && i != 27) {
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
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        if (uri.getPath() == null) {
            par0.a("Can not find file for " + uri);
            return super.insert(uri, contentValues);
        }
        if (a(uri, callingPackage, false)) {
            return super.insert(uri, contentValues);
        }
        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
        return null;
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return super.openAssetFile(uri, str);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        if (uri.getPath() == null) {
            par0.a("Can not find file for " + uri);
            return super.openFile(uri, str);
        }
        if (a(uri, callingPackage, false)) {
            return super.openFile(uri, str);
        }
        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
        return null;
    }

    @Override // android.content.ContentProvider
    public final <T> ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, T t, ContentProvider.PipeDataWriter<T> pipeDataWriter) throws FileNotFoundException {
        ParcelFileDescriptor openPipeHelper;
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        int i = gz80.a;
        if (i == 26 || i == 27) {
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
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        int i = gz80.a;
        if (i != 26 && i != 27) {
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
        Cursor cursor;
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:113)");
        try {
            String callingPackage = getCallingPackage();
            par0.a.getClass();
            par0.a("Checking access permission to uri [" + uri + "] from package [" + callingPackage + "].");
            int i = gz80.a;
            if (i == 26 || i == 27) {
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
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:113)");
        }
    }

    @Override // android.content.ContentProvider
    public final Uri uncanonicalize(Uri uri) {
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        int i = gz80.a;
        if (i != 26 && i != 27) {
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
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        if (uri.getPath() == null) {
            par0.a("Can not find file for " + uri);
            return super.update(uri, contentValues, str, strArr);
        }
        if (a(uri, callingPackage, false)) {
            return super.update(uri, contentValues, str, strArr);
        }
        b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
        return -1;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        Cursor query;
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:126)");
        try {
            String callingPackage = getCallingPackage();
            par0.a.getClass();
            par0.a("Checking access permission to uri [" + uri + "] from package [" + callingPackage + "].");
            int i = gz80.a;
            if (i == 26 || i == 27) {
                if (callingPackage == null) {
                    b(new SecurityException("Application with empty package has tried to get access to VkFileProvider uri - " + uri + '!'));
                } else if (!a(uri, callingPackage, true)) {
                    b(new SecurityException("Unsafe operation from " + callingPackage + " - " + uri + '!'));
                } else {
                    query = super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
                }
                query = null;
            } else {
                try {
                    query = super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:126)");
                    throw th2;
                }
            }
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:126)");
            return query;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:138)");
        try {
            String callingPackage = getCallingPackage();
            par0.a.getClass();
            par0.a("Checking access permission to uri [" + uri + "] from package [" + callingPackage + "].");
            int i = gz80.a;
            if (i == 26 || i == 27) {
                if (callingPackage == null) {
                    b(new SecurityException("Application with empty package has tried to get access to VkFileProvider uri - " + uri + '!'));
                } else if (!a(uri, callingPackage, true)) {
                    b(new SecurityException("Unsafe operation from " + callingPackage + " - " + uri + '!'));
                } else {
                    query = super.query(uri, strArr, str, strArr2, str2);
                }
                query = null;
            } else {
                try {
                    query = super.query(uri, strArr, str, strArr2, str2);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:138)");
                    throw th2;
                }
            }
            if (query == null) {
                query = new MatrixCursor(new String[0], 0);
            }
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.superapp.provider.SakFileProvider.query(SakFileProvider.kt:138)");
            return query;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking safety permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        if (uri.getPath() == null) {
            par0.a("Can not find file for " + uri);
            return super.openFile(uri, str, cancellationSignal);
        }
        if (!a(uri, callingPackage, false)) {
            b(new SecurityException(rq.b("Unsafe system operation from ", callingPackage, " - ", uri, '!')));
            return null;
        }
        return super.openFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) throws FileNotFoundException {
        String callingPackage = getCallingPackage();
        par0 par0Var = par0.a;
        String b2 = qq.b("Checking access permission to uri [", uri, "] from package [", callingPackage, "].");
        par0Var.getClass();
        par0.a(b2);
        int i = gz80.a;
        if (i != 26 && i != 27) {
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
}
