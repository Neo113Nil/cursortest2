package com.google.android.gms.dynamite;

import K9.n;
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
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.util.DynamiteApi;
import com.plaid.internal.EnumC3631g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f32845h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f32846i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f32847j = false;

    /* renamed from: k, reason: collision with root package name */
    public static int f32848k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static Boolean f32849l;

    /* renamed from: r, reason: collision with root package name */
    public static O9.h f32855r;

    /* renamed from: s, reason: collision with root package name */
    public static O9.i f32856s;

    /* renamed from: a, reason: collision with root package name */
    public final Context f32857a;

    /* renamed from: m, reason: collision with root package name */
    public static final ThreadLocal f32850m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f32851n = new O9.f();

    /* renamed from: o, reason: collision with root package name */
    public static final b.a f32852o = new com.google.android.gms.dynamite.b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f32839b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final b f32840c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final b f32841d = new e();

    /* renamed from: e, reason: collision with root package name */
    public static final b f32842e = new f();

    /* renamed from: f, reason: collision with root package name */
    public static final b f32843f = new g();

    /* renamed from: g, reason: collision with root package name */
    public static final b f32844g = new h();

    /* renamed from: p, reason: collision with root package name */
    public static final b f32853p = new i();

    /* renamed from: q, reason: collision with root package name */
    public static final b f32854q = new com.google.android.gms.dynamite.a();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, Throwable th2, byte[] bArr) {
            super(str, th2);
        }

        public /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0492b {

            /* renamed from: a, reason: collision with root package name */
            public int f32858a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f32859b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f32860c = 0;
        }

        C0492b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        AbstractC3191o.m(context);
        this.f32857a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC3189m.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02df A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d6 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule e(Context context, b bVar, String str) {
        Context context2;
        int i10;
        DynamiteModule j10;
        int i11;
        Boolean bool;
        N9.b c10;
        O9.i iVar;
        boolean z10;
        N9.b c11;
        ?? r42 = ":";
        Context applicationContext = context.getApplicationContext();
        byte[] bArr = null;
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f32850m;
        O9.g gVar = (O9.g) threadLocal.get();
        O9.g gVar2 = new O9.g(null);
        threadLocal.set(gVar2);
        ThreadLocal threadLocal2 = f32851n;
        Long l10 = (Long) threadLocal2.get();
        long longValue = l10.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0492b a10 = bVar.a(context, str, f32852o);
            int i12 = a10.f32858a;
            int i13 = a10.f32859b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i12).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i13).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i12);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i13);
            Log.i("DynamiteModule", sb2.toString());
            int i14 = a10.f32860c;
            if (i14 != 0) {
                if (i14 == -1) {
                    if (a10.f32858a != 0) {
                        i14 = -1;
                    }
                }
                if (i14 != 1 || a10.f32859b != 0) {
                    if (i14 == -1) {
                        DynamiteModule j11 = j(applicationContext, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l10);
                        }
                        Cursor cursor = gVar2.f8578a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(gVar);
                        return j11;
                    }
                    if (i14 != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 36);
                        sb3.append("VersionPolicy returned invalid code:");
                        sb3.append(i14);
                        throw new a(sb3.toString(), null);
                    }
                    try {
                        try {
                            i11 = a10.f32859b;
                        } catch (a e10) {
                            e = e10;
                            context2 = r42;
                            String message = e.getMessage();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            Log.w("DynamiteModule", sb4.toString());
                            i10 = a10.f32858a;
                            if (i10 != 0 || bVar.a(context2, str, new j(i10, 0)).f32860c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e, null);
                            }
                            j10 = j(applicationContext, str);
                            return j10;
                        }
                    } catch (a e11) {
                        e = e11;
                        context2 = context;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb42.append("Failed to load remote module: ");
                        sb42.append(message2);
                        Log.w("DynamiteModule", sb42.toString());
                        i10 = a10.f32858a;
                        if (i10 != 0) {
                        }
                        throw new a("Remote load failed. No local fallback found.", e, null);
                    }
                    try {
                        synchronized (DynamiteModule.class) {
                            if (!g(context)) {
                                throw new a("Remote loading disabled", null);
                            }
                            bool = f32845h;
                        }
                        if (bool == null) {
                            throw new a("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                            sb5.append("Selected remote version of ");
                            sb5.append(str);
                            sb5.append(", version >= ");
                            sb5.append(i11);
                            Log.i("DynamiteModule", sb5.toString());
                            synchronized (DynamiteModule.class) {
                                iVar = f32856s;
                            }
                            if (iVar == null) {
                                throw new a("DynamiteLoaderV2 was not cached.", null);
                            }
                            O9.g gVar3 = (O9.g) threadLocal.get();
                            if (gVar3 == null || gVar3.f8578a == null) {
                                throw new a("No result cursor", null);
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Cursor cursor2 = gVar3.f8578a;
                            N9.d.i(null);
                            synchronized (DynamiteModule.class) {
                                z10 = f32848k >= 2;
                            }
                            if (z10) {
                                c11 = iVar.g(N9.d.i(applicationContext2), str, i11, N9.d.i(cursor2));
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                c11 = iVar.c(N9.d.i(applicationContext2), str, i11, N9.d.i(cursor2));
                            }
                            Context context3 = (Context) N9.d.g(c11);
                            if (context3 == null) {
                                throw new a("Failed to get module context", bArr);
                            }
                            j10 = new DynamiteModule(context3);
                        } else {
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                            sb6.append("Selected remote version of ");
                            sb6.append(str);
                            sb6.append(", version >= ");
                            sb6.append(i11);
                            Log.i("DynamiteModule", sb6.toString());
                            O9.h l11 = l(context);
                            if (l11 == null) {
                                throw new a("Failed to create IDynamiteLoader.", null);
                            }
                            int zzi = l11.zzi();
                            if (zzi >= 3) {
                                O9.g gVar4 = (O9.g) threadLocal.get();
                                if (gVar4 == null) {
                                    throw new a("No cached result cursor holder", null);
                                }
                                c10 = l11.M0(N9.d.i(context), str, i11, N9.d.i(gVar4.f8578a));
                            } else if (zzi == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                c10 = l11.i(N9.d.i(context), str, i11);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                c10 = l11.c(N9.d.i(context), str, i11);
                            }
                            Object g10 = N9.d.g(c10);
                            if (g10 == null) {
                                throw new a("Failed to load remote module.", null);
                            }
                            j10 = new DynamiteModule((Context) g10);
                        }
                        return j10;
                    } catch (RemoteException e12) {
                        throw new a("Failed to load remote module.", e12, null);
                    } catch (a e13) {
                        throw e13;
                    } catch (Throwable th2) {
                        K9.g.a(context, th2);
                        throw new a("Failed to load remote module.", th2, null);
                    }
                }
            }
            int i15 = a10.f32858a;
            int i16 = a10.f32859b;
            StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i15).length() + 23 + String.valueOf(i16).length() + 1);
            sb7.append("No acceptable module ");
            sb7.append(str);
            sb7.append(" found. Local version is ");
            sb7.append(i15);
            sb7.append(" and remote version is ");
            sb7.append(i16);
            sb7.append(".");
            throw new a(sb7.toString(), null);
        } finally {
            if (longValue == 0) {
                f32851n.remove();
            } else {
                f32851n.set(l10);
            }
            Cursor cursor3 = gVar2.f8578a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f32850m.set(gVar);
        }
    }

    public static int f(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th2;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f32845h;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String obj = e10.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                k(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f32847j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int h10 = h(context, str, z10, true);
                                        String str2 = f32846i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a10 = O9.d.a();
                                            if (a10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    O9.b.a();
                                                    String str3 = f32846i;
                                                    AbstractC3191o.m(str3);
                                                    a10 = O9.a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f32846i;
                                                    AbstractC3191o.m(str4);
                                                    a10 = new O9.e(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            k(a10);
                                            declaredField.set(null, a10);
                                            f32845h = bool2;
                                            return h10;
                                        }
                                        return h10;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f32845h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return h(context, str, z10, false);
                    } catch (a e11) {
                        String message = e11.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                O9.h l10 = l(context);
                if (l10 != null) {
                    try {
                        try {
                            int zzi = l10.zzi();
                            if (zzi >= 3) {
                                O9.g gVar = (O9.g) f32850m.get();
                                if (gVar == null || (cursor = gVar.f8578a) == null) {
                                    Cursor cursor2 = (Cursor) N9.d.g(l10.L0(N9.d.i(context), str, z10, ((Long) f32851n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i11 = cursor2.getInt(0);
                                                r4 = (i11 <= 0 || !i(cursor2)) ? cursor2 : null;
                                                if (r4 != null) {
                                                    r4.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e12) {
                                            remoteException = e12;
                                            r4 = cursor2;
                                            String message2 = remoteException.getMessage();
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb4.append("Failed to retrieve remote module version: ");
                                            sb4.append(message2);
                                            Log.w("DynamiteModule", sb4.toString());
                                            if (r4 != null) {
                                                r4.close();
                                            }
                                            return i10;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            r4 = cursor2;
                                            if (r4 == null) {
                                                throw th2;
                                            }
                                            r4.close();
                                            throw th2;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                }
                            } else if (zzi == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = l10.i0(N9.d.i(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = l10.g(N9.d.i(context), str, z10);
                            }
                        } catch (RemoteException e13) {
                            remoteException = e13;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                return i10;
            }
        } catch (Throwable th5) {
            K9.g.a(context, th5);
            throw th5;
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f32849l)) {
            return true;
        }
        boolean z10 = false;
        if (f32849l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != n.g() ? 0 : 268435456);
            if (C3171d.h().j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            f32849l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f32847j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:328), block:B:114:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:15:0x00ef, B:17:0x00f5, B:20:0x00fd, B:33:0x012a, B:40:0x0133, B:44:0x0139, B:45:0x0140, B:11:0x014f, B:12:0x015d, B:51:0x015f, B:53:0x0163, B:54:0x0185, B:55:0x0186), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:15:0x00ef, B:17:0x00f5, B:20:0x00fd, B:33:0x012a, B:40:0x0133, B:44:0x0139, B:45:0x0140, B:11:0x014f, B:12:0x015d, B:51:0x015f, B:53:0x0163, B:54:0x0185, B:55:0x0186), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(Context context, String str, boolean z10, boolean z11) {
        Throwable th2;
        Exception exc;
        Cursor cursor;
        Cursor query;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z12 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f32851n.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z13 = false;
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
                            for (int i10 = 0; i10 < count; i10++) {
                                if (!query.moveToPosition(i10)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr4 = new Object[columnCount];
                                for (int i11 = 0; i11 < columnCount; i11++) {
                                    int type = query.getType(i11);
                                    if (type == 0) {
                                        objArr4[i11] = null;
                                    } else if (type == 1) {
                                        objArr4[i11] = Long.valueOf(query.getLong(i11));
                                    } else if (type == 2) {
                                        objArr4[i11] = Double.valueOf(query.getDouble(i11));
                                    } else if (type == 3) {
                                        objArr4[i11] = query.getString(i11);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr4[i11] = query.getBlob(i11);
                                    }
                                }
                                matrixCursor.addRow(objArr4);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i12 = matrixCursor.getInt(0);
                                        if (i12 > 0) {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    f32846i = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f32848k = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                                            z12 = false;
                                                        }
                                                        f32847j = z12;
                                                        z13 = z12;
                                                    }
                                                } finally {
                                                }
                                            }
                                            if (i(matrixCursor)) {
                                                matrixCursor = null;
                                            }
                                        }
                                        if (z11 && z13) {
                                            throw new a("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                                        }
                                        return i12;
                                    }
                                } catch (Exception e10) {
                                    exc = e10;
                                    if (!(exc instanceof a)) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb2.append("V2 version check failed: ");
                                    sb2.append(message);
                                    throw new a(sb2.toString(), exc, objArr == true ? 1 : 0);
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
                        } finally {
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th4) {
                th2 = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th2;
                }
                cursor2.close();
                throw th2;
            }
        } catch (Exception e11) {
            exc = e11;
            if (!(exc instanceof a)) {
            }
        } catch (Throwable th5) {
            th2 = th5;
            if (cursor2 != null) {
            }
        }
    }

    public static boolean i(Cursor cursor) {
        O9.g gVar = (O9.g) f32850m.get();
        if (gVar == null || gVar.f8578a != null) {
            return false;
        }
        gVar.f8578a = cursor;
        return true;
    }

    public static DynamiteModule j(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    public static void k(ClassLoader classLoader) {
        O9.i iVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = queryLocalInterface instanceof O9.i ? (O9.i) queryLocalInterface : new O9.i(iBinder);
            }
            f32856s = iVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    public static O9.h l(Context context) {
        O9.h hVar;
        synchronized (DynamiteModule.class) {
            O9.h hVar2 = f32855r;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof O9.h ? (O9.h) queryLocalInterface : new O9.h(iBinder);
                }
                if (hVar != null) {
                    f32855r = hVar;
                    return hVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public Context b() {
        return this.f32857a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f32857a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
