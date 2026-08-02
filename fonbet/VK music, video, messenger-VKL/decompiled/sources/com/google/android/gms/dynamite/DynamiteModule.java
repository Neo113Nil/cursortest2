package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import xsna.b101;
import xsna.b801;
import xsna.bq70;
import xsna.dq70;
import xsna.eo01;
import xsna.exc0;
import xsna.gm01;
import xsna.h4k;
import xsna.ln01;
import xsna.m601;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class DynamiteModule {
    public static Boolean f = null;
    public static String g = null;
    public static boolean h = false;
    public static int i = -1;
    public static Boolean j;
    public static ln01 n;
    public static eo01 o;
    public final Context a;
    public static final ThreadLocal k = new ThreadLocal();
    public static final b801 l = new b801();
    public static final com.google.android.gms.dynamite.a m = new com.google.android.gms.dynamite.a();

    @NonNull
    public static final b b = new b();

    @NonNull
    public static final c c = new c();

    @NonNull
    public static final d d = new d();

    @NonNull
    public static final e e = new e();

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public static class LoadingException extends Exception {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public interface a {

        /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        public interface InterfaceC0115a {
            int a(@NonNull Context context, @NonNull String str);

            int b(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        @NonNull
        b a(@NonNull Context context, @NonNull String str, @NonNull InterfaceC0115a interfaceC0115a) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        this.a = context;
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (dq70.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(String.valueOf(str).length() + 45);
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    @NonNull
    public static DynamiteModule c(@NonNull Context context, @NonNull a aVar, @NonNull String str) throws LoadingException {
        long j2;
        DynamiteModule dynamiteModule;
        int i2;
        Boolean bool;
        vnv H1;
        eo01 eo01Var;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context");
        }
        ThreadLocal threadLocal = k;
        gm01 gm01Var = (gm01) threadLocal.get();
        gm01 gm01Var2 = new gm01();
        threadLocal.set(gm01Var2);
        b801 b801Var = l;
        Long l2 = (Long) b801Var.get();
        long longValue = l2.longValue();
        try {
            j2 = longValue;
            try {
                b801Var.set(Long.valueOf(SystemClock.uptimeMillis()));
                a.b a2 = aVar.a(context, str, m);
                new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(a2.a).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(a2.b).length());
                int i3 = a2.c;
                if (i3 != 0) {
                    if (i3 == -1) {
                        if (a2.a != 0) {
                            i3 = -1;
                        }
                    }
                    if (i3 != 1 || a2.b != 0) {
                        if (i3 == -1) {
                            "Selected local version of ".concat(String.valueOf(str));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                            if (j2 == 0) {
                                b801Var.remove();
                            } else {
                                b801Var.set(l2);
                            }
                            Cursor cursor = gm01Var2.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(gm01Var);
                            return dynamiteModule2;
                        }
                        if (i3 != 1) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 36);
                            sb.append("VersionPolicy returned invalid code:");
                            sb.append(i3);
                            throw new LoadingException(sb.toString());
                        }
                        try {
                            i2 = a2.b;
                        } catch (LoadingException e2) {
                            new StringBuilder(String.valueOf(e2.getMessage()).length() + 30);
                            int i4 = a2.a;
                            if (i4 == 0 || aVar.a(context, str, new f(i4)).c != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e2);
                            }
                            "Selected local version of ".concat(String.valueOf(str));
                            dynamiteModule = new DynamiteModule(applicationContext);
                        }
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!e(context)) {
                                    throw new LoadingException("Remote loading disabled");
                                }
                                bool = f;
                            }
                            if (bool == null) {
                                throw new LoadingException("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                synchronized (DynamiteModule.class) {
                                    eo01Var = o;
                                }
                                if (eo01Var == null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                gm01 gm01Var3 = (gm01) threadLocal.get();
                                if (gm01Var3 == null || gm01Var3.a == null) {
                                    throw new LoadingException("No result cursor");
                                }
                                Context applicationContext2 = context.getApplicationContext();
                                Cursor cursor2 = gm01Var3.a;
                                new bq70(null);
                                synchronized (DynamiteModule.class) {
                                    z = i >= 2;
                                }
                                Context context2 = (Context) bq70.g(z ? eo01Var.g(new bq70(applicationContext2), str, i2, new bq70(cursor2)) : eo01Var.f(new bq70(applicationContext2), str, i2, new bq70(cursor2)));
                                if (context2 == null) {
                                    throw new LoadingException("Failed to get module context");
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                ln01 h2 = h(context);
                                if (h2 == null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.");
                                }
                                int zzi = h2.zzi();
                                if (zzi >= 3) {
                                    gm01 gm01Var4 = (gm01) threadLocal.get();
                                    if (gm01Var4 == null) {
                                        throw new LoadingException("No cached result cursor holder");
                                    }
                                    H1 = h2.K1(new bq70(context), str, i2, new bq70(gm01Var4.a));
                                } else {
                                    H1 = zzi == 2 ? h2.H1(new bq70(context), str, i2) : h2.f(new bq70(context), str, i2);
                                }
                                Object g2 = bq70.g(H1);
                                if (g2 == null) {
                                    throw new LoadingException("Failed to load remote module.");
                                }
                                dynamiteModule = new DynamiteModule((Context) g2);
                            }
                            if (j2 == 0) {
                                l.remove();
                            } else {
                                l.set(l2);
                            }
                            Cursor cursor3 = gm01Var2.a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            k.set(gm01Var);
                            return dynamiteModule;
                        } catch (RemoteException e3) {
                            throw new LoadingException("Failed to load remote module.", e3);
                        } catch (LoadingException e4) {
                            throw e4;
                        } catch (Throwable th) {
                            h4k.a(context, th);
                            throw new LoadingException("Failed to load remote module.", th);
                        }
                    }
                }
                int i5 = a2.a;
                int i6 = a2.b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i5).length() + 23 + String.valueOf(i6).length() + 1);
                sb2.append("No acceptable module ");
                sb2.append(str);
                sb2.append(" found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(".");
                throw new LoadingException(sb2.toString());
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    l.remove();
                } else {
                    l.set(l2);
                }
                Cursor cursor4 = gm01Var2.a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                k.set(gm01Var);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = longValue;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015c, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(@NonNull Context context, @NonNull String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f;
                boolean z2 = true;
                Cursor cursor2 = null;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        new StringBuilder(e2.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!h) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f2 = f(context, str, z, true);
                                        String str2 = g;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a2 = b101.a();
                                            if (a2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = g;
                                                    exc0.i(str3);
                                                    a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = g;
                                                    exc0.i(str4);
                                                    a2 = new m601(ClassLoader.getSystemClassLoader(), str4);
                                                }
                                            }
                                            g(a2);
                                            declaredField.set(null, a2);
                                            f = bool2;
                                            return f2;
                                        }
                                        return f2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (LoadingException e3) {
                        new StringBuilder(String.valueOf(e3.getMessage()).length() + 42);
                        return 0;
                    }
                }
                ln01 h2 = h(context);
                if (h2 != null) {
                    try {
                        try {
                            int zzi = h2.zzi();
                            if (zzi >= 3) {
                                ThreadLocal threadLocal = k;
                                gm01 gm01Var = (gm01) threadLocal.get();
                                if (gm01Var == null || (cursor = gm01Var.a) == null) {
                                    Cursor cursor3 = (Cursor) bq70.g(h2.J1(new bq70(context), str, z, ((Long) l.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i3 = cursor3.getInt(0);
                                                if (i3 > 0) {
                                                    gm01 gm01Var2 = (gm01) threadLocal.get();
                                                    if (gm01Var2 == null || gm01Var2.a != null) {
                                                        z2 = false;
                                                    } else {
                                                        gm01Var2.a = cursor3;
                                                    }
                                                }
                                                cursor2 = cursor3;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e4) {
                                            remoteException = e4;
                                            cursor2 = cursor3;
                                            new StringBuilder(String.valueOf(remoteException.getMessage()).length() + 42);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    i2 = cursor.getInt(0);
                                }
                            } else {
                                i2 = zzi == 2 ? h2.I1(new bq70(context), str, z) : h2.g(new bq70(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            remoteException = e5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return i2;
            }
        } catch (Throwable th4) {
            h4k.a(context, th4);
            throw th4;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (com.google.android.gms.common.a.b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            j = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z, boolean z2) throws LoadingException {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri build = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) l.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z5 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i2 = 0; i2 < count; i2++) {
                                if (!query.moveToPosition(i2)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i3 = 0; i3 < columnCount; i3++) {
                                    int type = query.getType(i3);
                                    if (type == 0) {
                                        objArr[i3] = null;
                                    } else if (type == 1) {
                                        objArr[i3] = Long.valueOf(query.getLong(i3));
                                    } else if (type == 2) {
                                        objArr[i3] = Double.valueOf(query.getDouble(i3));
                                    } else if (type == 3) {
                                        objArr[i3] = query.getString(i3);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i3] = query.getBlob(i3);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i4 = matrixCursor.getInt(0);
                                        if (i4 > 0) {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    g = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        i = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z3 = matrixCursor.getInt(columnIndex2) != 0;
                                                        h = z3;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            gm01 gm01Var = (gm01) k.get();
                                            if (gm01Var == null || gm01Var.a != null) {
                                                z4 = false;
                                            } else {
                                                gm01Var.a = matrixCursor;
                                            }
                                            z5 = z3;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z5) {
                                            throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof LoadingException) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new LoadingException(sb.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void g(ClassLoader classLoader) throws LoadingException {
        try {
            eo01 eo01Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                eo01Var = queryLocalInterface instanceof eo01 ? (eo01) queryLocalInterface : new eo01(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            o = eo01Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static ln01 h(Context context) {
        ln01 ln01Var;
        synchronized (DynamiteModule.class) {
            ln01 ln01Var2 = n;
            if (ln01Var2 != null) {
                return ln01Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ln01Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    ln01Var = queryLocalInterface instanceof ln01 ? (ln01) queryLocalInterface : new ln01(iBinder);
                }
                if (ln01Var != null) {
                    n = ln01Var;
                    return ln01Var;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    @NonNull
    public final IBinder b(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
