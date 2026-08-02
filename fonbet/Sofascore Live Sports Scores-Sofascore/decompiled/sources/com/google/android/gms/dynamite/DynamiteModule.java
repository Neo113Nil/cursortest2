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
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zzc;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.byn;
import defpackage.j40;
import defpackage.nyo;
import defpackage.x5n;
import defpackage.ye5;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class DynamiteModule {
    public static Boolean f = null;
    public static String g = null;
    public static boolean h = false;
    public static int i = -1;
    public static Boolean j;
    public static zzp n;
    public static zzq o;
    public final Context a;
    public static final ThreadLocal k = new ThreadLocal();
    public static final j40 l = new j40(9);
    public static final a m = new a();
    public static final b b = new b();
    public static final c c = new c();
    public static final d d = new d();
    public static final e e = new e();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static class LoadingException extends Exception {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface VersionPolicy {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @KeepForSdk
        public interface IVersions {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @KeepForSdk
        public static class SelectionResult {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        SelectionResult a(Context context, String str, IVersions iVersions);
    }

    public DynamiteModule(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + str.length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(str.length() + 45);
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, VersionPolicy versionPolicy, String str) {
        long j2;
        DynamiteModule dynamiteModule;
        int i2;
        Boolean bool;
        IObjectWrapper l2;
        zzq zzqVar;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context");
        }
        ThreadLocal threadLocal = k;
        nyo nyoVar = (nyo) threadLocal.get();
        nyo nyoVar2 = new nyo();
        threadLocal.set(nyoVar2);
        j40 j40Var = l;
        Long l3 = (Long) j40Var.get();
        long longValue = l3.longValue();
        try {
            j2 = longValue;
        } catch (Throwable th) {
            th = th;
            j2 = longValue;
        }
        try {
            j40Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult a = versionPolicy.a(context, str, m);
            new StringBuilder(str.length() + 26 + String.valueOf(a.a).length() + 19 + str.length() + 1 + String.valueOf(a.b).length());
            int i3 = a.c;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (a.a != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || a.b != 0) {
                    if (i3 == -1) {
                        "Selected local version of ".concat(str);
                        DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                        if (j2 == 0) {
                            j40Var.remove();
                        } else {
                            j40Var.set(l3);
                        }
                        Cursor cursor = nyoVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(nyoVar);
                        return dynamiteModule2;
                    }
                    if (i3 != 1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 36);
                        sb.append("VersionPolicy returned invalid code:");
                        sb.append(i3);
                        throw new LoadingException(sb.toString());
                    }
                    try {
                        i2 = a.b;
                    } catch (LoadingException e2) {
                        new StringBuilder(String.valueOf(e2.getMessage()).length() + 30);
                        int i4 = a.a;
                        if (i4 == 0 || versionPolicy.a(context, str, new f(i4)).c != -1) {
                            throw new LoadingException("Remote load failed. No local fallback found.", e2);
                        }
                        "Selected local version of ".concat(str);
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
                            new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                            synchronized (DynamiteModule.class) {
                                zzqVar = o;
                            }
                            if (zzqVar == null) {
                                throw new LoadingException("DynamiteLoaderV2 was not cached.");
                            }
                            nyo nyoVar3 = (nyo) threadLocal.get();
                            if (nyoVar3 == null || nyoVar3.a == null) {
                                throw new LoadingException("No result cursor");
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Cursor cursor2 = nyoVar3.a;
                            new ObjectWrapper(null);
                            synchronized (DynamiteModule.class) {
                                z = i >= 2;
                            }
                            Context context2 = (Context) ObjectWrapper.Z1(z ? zzqVar.l2(new ObjectWrapper(applicationContext2), str, i2, new ObjectWrapper(cursor2)) : zzqVar.Z1(new ObjectWrapper(applicationContext2), str, i2, new ObjectWrapper(cursor2)));
                            if (context2 == null) {
                                throw new LoadingException("Failed to get module context");
                            }
                            dynamiteModule = new DynamiteModule(context2);
                        } else {
                            new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                            zzp h2 = h(context);
                            if (h2 == null) {
                                throw new LoadingException("Failed to create IDynamiteLoader.");
                            }
                            Parcel J = h2.J(h2.S1(), 6);
                            int readInt = J.readInt();
                            J.recycle();
                            if (readInt >= 3) {
                                nyo nyoVar4 = (nyo) threadLocal.get();
                                if (nyoVar4 == null) {
                                    throw new LoadingException("No cached result cursor holder");
                                }
                                l2 = h2.D4(new ObjectWrapper(context), str, i2, new ObjectWrapper(nyoVar4.a));
                            } else {
                                l2 = readInt == 2 ? h2.l2(new ObjectWrapper(context), str, i2) : h2.Z1(new ObjectWrapper(context), str, i2);
                            }
                            Object Z1 = ObjectWrapper.Z1(l2);
                            if (Z1 == null) {
                                throw new LoadingException("Failed to load remote module.");
                            }
                            dynamiteModule = new DynamiteModule((Context) Z1);
                        }
                        if (j2 == 0) {
                            l.remove();
                        } else {
                            l.set(l3);
                        }
                        Cursor cursor3 = nyoVar2.a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        k.set(nyoVar);
                        return dynamiteModule;
                    } catch (RemoteException e3) {
                        throw new LoadingException("Failed to load remote module.", e3);
                    } catch (LoadingException e4) {
                        throw e4;
                    } catch (Throwable th2) {
                        throw new LoadingException("Failed to load remote module.", th2);
                    }
                }
            }
            int i5 = a.a;
            int i6 = a.b;
            StringBuilder sb2 = new StringBuilder(str.length() + 46 + String.valueOf(i5).length() + 23 + String.valueOf(i6).length() + 1);
            sb2.append("No acceptable module ");
            sb2.append(str);
            sb2.append(" found. Local version is ");
            sb2.append(i5);
            sb2.append(" and remote version is ");
            sb2.append(i6);
            sb2.append(".");
            throw new LoadingException(sb2.toString());
        } catch (Throwable th3) {
            th = th3;
            if (j2 == 0) {
                l.remove();
            } else {
                l.set(l3);
            }
            Cursor cursor4 = nyoVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            k.set(nyoVar);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0179, code lost:
    
        if (r2 != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        new StringBuilder(e3.toString().length() + 30);
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
                                            ClassLoader a = zzb.a();
                                            if (a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    ye5.c();
                                                    String str3 = g;
                                                    Preconditions.i(str3);
                                                    a = ye5.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = g;
                                                    Preconditions.i(str4);
                                                    a = new byn(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(a);
                                            declaredField.set(null, a);
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
                    } catch (LoadingException e4) {
                        new StringBuilder(String.valueOf(e4.getMessage()).length() + 42);
                        return 0;
                    }
                }
                zzp h2 = h(context);
                try {
                    if (h2 == null) {
                        return 0;
                    }
                    try {
                        Parcel J = h2.J(h2.S1(), 6);
                        int readInt2 = J.readInt();
                        J.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = k;
                            nyo nyoVar = (nyo) threadLocal.get();
                            if (nyoVar != null && (cursor = nyoVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            ObjectWrapper objectWrapper = new ObjectWrapper(context);
                            long longValue = ((Long) l.get()).longValue();
                            Parcel S1 = h2.S1();
                            zzc.b(S1, objectWrapper);
                            S1.writeString(str);
                            S1.writeInt(z ? 1 : 0);
                            S1.writeLong(longValue);
                            Cursor cursor3 = (Cursor) ObjectWrapper.Z1(x5n.i(h2.J(S1, 7)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            nyo nyoVar2 = (nyo) threadLocal.get();
                                            if (nyoVar2 == null || nyoVar2.a != null) {
                                                z2 = false;
                                            } else {
                                                nyoVar2.a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    cursor2 = cursor3;
                                    new StringBuilder(String.valueOf(e2.getMessage()).length() + 42);
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                            Parcel S12 = h2.S1();
                            zzc.b(S12, objectWrapper2);
                            S12.writeString(str);
                            S12.writeInt(z ? 1 : 0);
                            Parcel J2 = h2.J(S12, 5);
                            readInt = J2.readInt();
                            J2.recycle();
                        } else {
                            ObjectWrapper objectWrapper3 = new ObjectWrapper(context);
                            Parcel S13 = h2.S1();
                            zzc.b(S13, objectWrapper3);
                            S13.writeString(str);
                            S13.writeInt(z ? 1 : 0);
                            Parcel J3 = h2.J(S13, 3);
                            readInt = J3.readInt();
                            J3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            try {
                Preconditions.i(context);
            } catch (Exception unused3) {
            }
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
            if (GoogleApiAvailabilityLight.b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            j = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                h = true;
            }
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
    public static int f(Context context, String str, boolean z, boolean z2) {
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
                                            nyo nyoVar = (nyo) k.get();
                                            if (nyoVar == null || nyoVar.a != null) {
                                                z4 = false;
                                            } else {
                                                nyoVar.a = matrixCursor;
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

    public static void g(ClassLoader classLoader) {
        try {
            zzq zzqVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            o = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static zzp h(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = n;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (zzpVar != null) {
                    n = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e2) {
                new StringBuilder(String.valueOf(e2.getMessage()).length() + 45);
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2);
        }
    }
}
