package u6;

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
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.sports.insider.data.repository.room.metric.EventsTable;
import e6.g0;
import g6.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import s7.s;
import s7.t;
import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f24057e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f24058f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f24059g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f24060h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f24061i;

    /* renamed from: m, reason: collision with root package name */
    public static l f24064m;

    /* renamed from: n, reason: collision with root package name */
    public static m f24065n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24066a;
    public static final ThreadLocal j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f24062k = new g0(4);

    /* renamed from: l, reason: collision with root package name */
    public static final u f24063l = new u(18);

    /* renamed from: b, reason: collision with root package name */
    public static final s f24054b = new s(19);

    /* renamed from: c, reason: collision with root package name */
    public static final t f24055c = new t(19);

    /* renamed from: d, reason: collision with root package name */
    public static final u f24056d = new u(19);

    public f(Context context) {
        this.f24066a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (v.k(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + str.length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            w0.d("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(str.length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            w0.m("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e7) {
            w0.d("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02fa A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0309 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0300 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v1, types: [e6.g0, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f c(Context context, e eVar, String str) {
        Context context2;
        int i5;
        f fVar;
        int i10;
        t6.a U;
        m mVar;
        boolean z5;
        t6.a U2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = j;
        j jVar = (j) threadLocal.get();
        j jVar2 = new j();
        threadLocal.set(jVar2);
        ?? r72 = f24062k;
        Long l6 = (Long) r72.get();
        long longValue = l6.longValue();
        try {
            r72.set(Long.valueOf(SystemClock.uptimeMillis()));
            d d10 = eVar.d(context, str, f24063l);
            int i11 = d10.f24051a;
            int i12 = d10.f24052b;
            StringBuilder sb2 = new StringBuilder(str.length() + 26 + String.valueOf(i11).length() + 19 + str.length() + 1 + String.valueOf(i12).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i11);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i12);
            Log.i("DynamiteModule", sb2.toString());
            int i13 = d10.f24053c;
            if (i13 != 0) {
                if (i13 == -1) {
                    if (d10.f24051a != 0) {
                        i13 = -1;
                    }
                }
                if (i13 != 1 || d10.f24052b != 0) {
                    if (i13 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        f fVar2 = new f(applicationContext);
                        if (longValue == 0) {
                            r72.remove();
                        } else {
                            r72.set(l6);
                        }
                        Cursor cursor = jVar2.f24069a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(jVar);
                        return fVar2;
                    }
                    if (i13 != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 36);
                        sb3.append("VersionPolicy returned invalid code:");
                        sb3.append(i13);
                        throw new b(sb3.toString());
                    }
                    try {
                        try {
                            i10 = d10.f24052b;
                        } catch (b e7) {
                            e = e7;
                            context2 = r72;
                            String message = e.getMessage();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            w0.m("DynamiteModule", sb4.toString());
                            i5 = d10.f24051a;
                            if (i5 != 0 || eVar.d(context2, str, new k(i5)).f24053c != -1) {
                                throw new b("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            fVar = new f(applicationContext);
                            return fVar;
                        }
                    } catch (b e9) {
                        e = e9;
                        context2 = context;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb42.append("Failed to load remote module: ");
                        sb42.append(message2);
                        w0.m("DynamiteModule", sb42.toString());
                        i5 = d10.f24051a;
                        if (i5 != 0) {
                        }
                        throw new b("Remote load failed. No local fallback found.", e);
                    }
                    try {
                        try {
                            try {
                                synchronized (f.class) {
                                    try {
                                        if (!e(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        Boolean bool = f24057e;
                                        if (bool == null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            StringBuilder sb5 = new StringBuilder(str.length() + 40 + String.valueOf(i10).length());
                                            sb5.append("Selected remote version of ");
                                            sb5.append(str);
                                            sb5.append(", version >= ");
                                            sb5.append(i10);
                                            Log.i("DynamiteModule", sb5.toString());
                                            synchronized (f.class) {
                                                mVar = f24065n;
                                            }
                                            if (mVar == null) {
                                                throw new b("DynamiteLoaderV2 was not cached.");
                                            }
                                            j jVar3 = (j) threadLocal.get();
                                            if (jVar3 == null || jVar3.f24069a == null) {
                                                throw new b("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = jVar3.f24069a;
                                            new t6.b(null);
                                            synchronized (f.class) {
                                                z5 = f24060h >= 2;
                                            }
                                            if (z5) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                U2 = mVar.V(new t6.b(applicationContext2), str, i10, new t6.b(cursor2));
                                            } else {
                                                w0.m("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                U2 = mVar.U(new t6.b(applicationContext2), str, i10, new t6.b(cursor2));
                                            }
                                            Context context3 = (Context) t6.b.W(U2);
                                            if (context3 == null) {
                                                throw new b("Failed to get module context");
                                            }
                                            fVar = new f(context3);
                                        } else {
                                            StringBuilder sb6 = new StringBuilder(str.length() + 40 + String.valueOf(i10).length());
                                            sb6.append("Selected remote version of ");
                                            sb6.append(str);
                                            sb6.append(", version >= ");
                                            sb6.append(i10);
                                            Log.i("DynamiteModule", sb6.toString());
                                            l h10 = h(context);
                                            if (h10 == null) {
                                                throw new b("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel f6 = h10.f(h10.O(), 6);
                                            int readInt = f6.readInt();
                                            f6.recycle();
                                            if (readInt >= 3) {
                                                j jVar4 = (j) threadLocal.get();
                                                if (jVar4 == null) {
                                                    throw new b("No cached result cursor holder");
                                                }
                                                U = h10.X(new t6.b(context), str, i10, new t6.b(jVar4.f24069a));
                                            } else if (readInt == 2) {
                                                w0.m("DynamiteModule", "IDynamite loader version = 2");
                                                U = h10.V(new t6.b(context), str, i10);
                                            } else {
                                                w0.m("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                U = h10.U(new t6.b(context), str, i10);
                                            }
                                            Object W = t6.b.W(U);
                                            if (W == null) {
                                                throw new b("Failed to load remote module.");
                                            }
                                            fVar = new f((Context) W);
                                        }
                                        return fVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (RemoteException e10) {
                            e = e10;
                            throw new b("Failed to load remote module.", e);
                        } catch (b e11) {
                            throw e11;
                        } catch (Throwable th4) {
                            th = th4;
                            throw new b("Failed to load remote module.", th);
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        throw new b("Failed to load remote module.", e);
                    } catch (b e13) {
                        throw e13;
                    } catch (Throwable th5) {
                        th = th5;
                        throw new b("Failed to load remote module.", th);
                    }
                }
            }
            int i14 = d10.f24051a;
            int i15 = d10.f24052b;
            StringBuilder sb7 = new StringBuilder(str.length() + 46 + String.valueOf(i14).length() + 23 + String.valueOf(i15).length() + 1);
            sb7.append("No acceptable module ");
            sb7.append(str);
            sb7.append(" found. Local version is ");
            sb7.append(i14);
            sb7.append(" and remote version is ");
            sb7.append(i15);
            sb7.append(".");
            throw new b(sb7.toString());
        } finally {
            if (longValue == 0) {
                f24062k.remove();
            } else {
                f24062k.set(l6);
            }
            Cursor cursor3 = jVar2.f24069a;
            if (cursor3 != null) {
                cursor3.close();
            }
            j.set(jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018e, code lost:
    
        if (r4 != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z5) {
        Field declaredField;
        Throwable th2;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (f.class) {
                Boolean bool = f24057e;
                boolean z7 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e7) {
                        String obj = e7.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        w0.m("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (b unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!f24059g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f6 = f(context, str, z5, true);
                                        String str2 = f24058f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader z10 = h.z();
                                            if (z10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.b();
                                                    String str3 = f24058f;
                                                    v.h(str3);
                                                    z10 = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = f24058f;
                                                    v.h(str4);
                                                    z10 = new i(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(z10);
                                            declaredField.set(null, z10);
                                            f24057e = bool2;
                                            return f6;
                                        }
                                        return f6;
                                    } catch (b unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f24057e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z5, false);
                    } catch (b e9) {
                        String message = e9.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        w0.m("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                l h10 = h(context);
                try {
                    if (h10 == null) {
                        return 0;
                    }
                    try {
                        Parcel f10 = h10.f(h10.O(), 6);
                        int readInt2 = f10.readInt();
                        f10.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = j;
                            j jVar = (j) threadLocal.get();
                            if (jVar != null && (cursor = jVar.f24069a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) t6.b.W(h10.W(new t6.b(context), str, z5, ((Long) f24062k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            j jVar2 = (j) threadLocal.get();
                                            if (jVar2 == null || jVar2.f24069a != null) {
                                                z7 = false;
                                            } else {
                                                jVar2.f24069a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e10) {
                                    remoteException = e10;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb4.append("Failed to retrieve remote module version: ");
                                    sb4.append(message2);
                                    w0.m("DynamiteModule", sb4.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th2;
                                    }
                                    cursor2.close();
                                    throw th2;
                                }
                            }
                            w0.m("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            w0.m("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            t6.b bVar = new t6.b(context);
                            Parcel O = h10.O();
                            j7.g.b(O, bVar);
                            O.writeString(str);
                            O.writeInt(z5 ? 1 : 0);
                            Parcel f11 = h10.f(O, 5);
                            readInt = f11.readInt();
                            f11.recycle();
                        } else {
                            w0.m("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            t6.b bVar2 = new t6.b(context);
                            Parcel O2 = h10.O();
                            j7.g.b(O2, bVar2);
                            O2.writeString(str);
                            O2.writeInt(z5 ? 1 : 0);
                            Parcel f12 = h10.f(O2, 3);
                            readInt = f12.readInt();
                            f12.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e11) {
                        remoteException = e11;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } finally {
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f24061i)) {
            return true;
        }
        boolean z5 = false;
        if (f24061i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (c6.d.f3660b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z5 = true;
            }
            f24061i = Boolean.valueOf(z5);
            if (z5 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f24059g = true;
            }
        }
        if (!z5) {
            w0.d("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z5, boolean z7) {
        Exception exc;
        Throwable th2;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z10;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z11 = true;
                Uri build = new Uri.Builder().scheme(EventsTable.contentColumn).authority("com.google.android.gms.chimera").path(true != z5 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f24062k.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z12 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        acquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i5 = 0; i5 < count; i5++) {
                                if (!query.moveToPosition(i5)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i10 = 0; i10 < columnCount; i10++) {
                                    int type = query.getType(i10);
                                    if (type == 0) {
                                        objArr[i10] = null;
                                    } else if (type == 1) {
                                        objArr[i10] = Long.valueOf(query.getLong(i10));
                                    } else if (type == 2) {
                                        objArr[i10] = Double.valueOf(query.getDouble(i10));
                                    } else if (type == 3) {
                                        objArr[i10] = query.getString(i10);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i10] = query.getBlob(i10);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i11 = matrixCursor.getInt(0);
                                        if (i11 > 0) {
                                            synchronized (f.class) {
                                                try {
                                                    f24058f = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f24060h = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z10 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f24059g = z10;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            j jVar = (j) j.get();
                                            if (jVar == null || jVar.f24069a != null) {
                                                z11 = false;
                                            } else {
                                                jVar.f24069a = matrixCursor;
                                            }
                                            z12 = z10;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z7 && z12) {
                                            throw new b("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i11;
                                    }
                                } catch (Exception e7) {
                                    exc = e7;
                                    if (exc instanceof b) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb2.append("V2 version check failed: ");
                                    sb2.append(message);
                                    throw new b(sb2.toString(), exc);
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th2;
                                    }
                                    matrixCursor2.close();
                                    throw th2;
                                }
                            }
                            w0.m("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new b("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th5) {
                            try {
                                query.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                w0.m("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th2 = th7;
            }
        } catch (Exception e9) {
            exc = e9;
        }
    }

    public static void g(ClassLoader classLoader) {
        try {
            m mVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 4);
            }
            f24065n = mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            throw new b("Failed to instantiate dynamite loader", e7);
        }
    }

    public static l h(Context context) {
        l lVar;
        synchronized (f.class) {
            l lVar2 = f24064m;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 4);
                }
                if (lVar != null) {
                    f24064m = lVar;
                    return lVar;
                }
            } catch (Exception e7) {
                String message = e7.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                w0.d("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f24066a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new b("Failed to instantiate module class: ".concat(str), e7);
        }
    }
}
