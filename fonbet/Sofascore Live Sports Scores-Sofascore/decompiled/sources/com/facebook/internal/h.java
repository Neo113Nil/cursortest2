package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import com.ironsource.C4324ta;
import com.ironsource.U3;
import defpackage.cw3;
import defpackage.lnb;
import defpackage.ogj;
import defpackage.ph0;
import defpackage.sub;
import defpackage.yhk;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class h {
    public static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final /* synthetic */ int b = 0;

    public static o a(int i) {
        for (o oVar : o.values()) {
            if (oVar.a == i) {
                return oVar;
            }
        }
        return o.Unknown;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:30:0x00c2, B:32:0x00d0, B:34:0x00d4, B:37:0x00ec, B:39:0x0106, B:41:0x0111, B:43:0x012e, B:45:0x0134, B:47:0x0140, B:49:0x0144, B:51:0x014d, B:87:0x011b, B:89:0x0126, B:91:0x01b0, B:92:0x01b7), top: B:29:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:30:0x00c2, B:32:0x00d0, B:34:0x00d4, B:37:0x00ec, B:39:0x0106, B:41:0x0111, B:43:0x012e, B:45:0x0134, B:47:0x0140, B:49:0x0144, B:51:0x014d, B:87:0x011b, B:89:0x0126, B:91:0x01b0, B:92:0x01b7), top: B:29:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:30:0x00c2, B:32:0x00d0, B:34:0x00d4, B:37:0x00ec, B:39:0x0106, B:41:0x0111, B:43:0x012e, B:45:0x0134, B:47:0x0140, B:49:0x0144, B:51:0x014d, B:87:0x011b, B:89:0x0126, B:91:0x01b0, B:92:0x01b7), top: B:29:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:30:0x00c2, B:32:0x00d0, B:34:0x00d4, B:37:0x00ec, B:39:0x0106, B:41:0x0111, B:43:0x012e, B:45:0x0134, B:47:0x0140, B:49:0x0144, B:51:0x014d, B:87:0x011b, B:89:0x0126, B:91:0x01b0, B:92:0x01b7), top: B:29:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d A[Catch: all -> 0x00e3, Exception -> 0x00e7, TRY_LEAVE, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:30:0x00c2, B:32:0x00d0, B:34:0x00d4, B:37:0x00ec, B:39:0x0106, B:41:0x0111, B:43:0x012e, B:45:0x0134, B:47:0x0140, B:49:0x0144, B:51:0x014d, B:87:0x011b, B:89:0x0126, B:91:0x01b0, B:92:0x01b7), top: B:29:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TRY_ENTER, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:30:0x00c2, B:32:0x00d0, B:34:0x00d4, B:37:0x00ec, B:39:0x0106, B:41:0x0111, B:43:0x012e, B:45:0x0134, B:47:0x0140, B:49:0x0144, B:51:0x014d, B:87:0x011b, B:89:0x0126, B:91:0x01b0, B:92:0x01b7), top: B:29:0x00c2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c b(Context context) {
        c cVar;
        Exception exc;
        Cursor cursor;
        Throwable th;
        Uri uri;
        Uri parse;
        String installerPackageName;
        Method t;
        Object v;
        Cursor cursor2 = null;
        try {
        } catch (Exception unused) {
            com.facebook.w wVar = com.facebook.w.a;
        }
        try {
            if (g(context) && (t = k0.t("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) != null && (v = k0.v(null, t, context)) != null) {
                Method s = k0.s(v.getClass(), "getId", new Class[0]);
                Method s2 = k0.s(v.getClass(), U3.j.M, new Class[0]);
                if (s != null && s2 != null) {
                    cVar = new c();
                    cVar.a = (String) k0.v(v, s, new Object[0]);
                    Boolean bool = (Boolean) k0.v(v, s2, new Object[0]);
                    cVar.e = bool != null ? bool.booleanValue() : false;
                    if (cVar == null) {
                        if (g(context)) {
                            b bVar = new b();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            if (context.bindService(intent, bVar, 1)) {
                                try {
                                    try {
                                        a aVar = new a(bVar.l());
                                        c cVar2 = new c();
                                        cVar2.a = aVar.J();
                                        cVar2.e = aVar.S1();
                                        context.unbindService(bVar);
                                        cVar = cVar2;
                                    } catch (Exception unused2) {
                                        com.facebook.w wVar2 = com.facebook.w.a;
                                        context.unbindService(bVar);
                                    }
                                    if (cVar == null) {
                                        cVar = new c();
                                    }
                                } catch (Throwable th2) {
                                    context.unbindService(bVar);
                                    throw th2;
                                }
                            }
                        }
                        cVar = null;
                        if (cVar == null) {
                        }
                    }
                    if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                        throw new com.facebook.q("getAttributionIdentifiers cannot be called on the main thread.");
                    }
                    c cVar3 = c.f;
                    if (cVar3 != null && System.currentTimeMillis() - cVar3.b < 3600000) {
                        return cVar3;
                    }
                    String[] strArr = {C4324ta.b, "androidid", "limit_tracking"};
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                    ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                    if (resolveContentProvider != null) {
                        String str = resolveContentProvider.packageName;
                        str.getClass();
                        if (l.a(context, str)) {
                            parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                            uri = parse;
                            PackageManager packageManager = context.getPackageManager();
                            installerPackageName = packageManager != null ? packageManager.getInstallerPackageName(context.getPackageName()) : null;
                            if (installerPackageName != null) {
                                cVar.d = installerPackageName;
                            }
                            if (uri == null) {
                                cVar.b = System.currentTimeMillis();
                                c.f = cVar;
                            } else {
                                Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            int columnIndex = query.getColumnIndex(C4324ta.b);
                                            int columnIndex2 = query.getColumnIndex("androidid");
                                            int columnIndex3 = query.getColumnIndex("limit_tracking");
                                            cVar.c = query.getString(columnIndex);
                                            if (columnIndex2 > 0 && columnIndex3 > 0 && cVar.a() == null) {
                                                cVar.a = query.getString(columnIndex2);
                                                cVar.e = Boolean.parseBoolean(query.getString(columnIndex3));
                                            }
                                            query.close();
                                            cVar.b = System.currentTimeMillis();
                                            c.f = cVar;
                                            return cVar;
                                        }
                                    } catch (Exception e) {
                                        cursor = query;
                                        exc = e;
                                        try {
                                            exc.toString();
                                            com.facebook.w wVar3 = com.facebook.w.a;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            return null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor2 = query;
                                        th = th;
                                        if (cursor2 != null) {
                                        }
                                    }
                                }
                                cVar.b = System.currentTimeMillis();
                                c.f = cVar;
                                if (query != null) {
                                    query.close();
                                }
                            }
                            return cVar;
                        }
                    }
                    if (resolveContentProvider2 != null) {
                        String str2 = resolveContentProvider2.packageName;
                        str2.getClass();
                        if (l.a(context, str2)) {
                            parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = parse;
                            PackageManager packageManager2 = context.getPackageManager();
                            if (packageManager2 != null) {
                            }
                            if (installerPackageName != null) {
                            }
                            if (uri == null) {
                            }
                            return cVar;
                        }
                    }
                    uri = null;
                    PackageManager packageManager22 = context.getPackageManager();
                    if (packageManager22 != null) {
                    }
                    if (installerPackageName != null) {
                    }
                    if (uri == null) {
                    }
                    return cVar;
                }
            }
            if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            }
        } catch (Exception e2) {
            exc = e2;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
        }
        cVar = null;
        if (cVar == null) {
        }
    }

    public static final String c() {
        if (!cw3.a.contains(h.class)) {
            try {
                Context a2 = com.facebook.w.a();
                List<ResolveInfo> queryIntentServices = a2.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                queryIntentServices.getClass();
                String[] strArr = a;
                HashSet hashSet = new HashSet(sub.c(3));
                ph0.S(strArr, hashSet);
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th) {
                cw3.a(h.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String d() {
        if (cw3.a.contains(h.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + com.facebook.w.a().getPackageName();
        } catch (Throwable th) {
            cw3.a(h.class, th);
            return null;
        }
    }

    public static final String e(String str) {
        if (cw3.a.contains(h.class)) {
            return null;
        }
        try {
            return f(com.facebook.w.a(), str) ? str : f(com.facebook.w.a(), d()) ? d() : "";
        } catch (Throwable th) {
            cw3.a(h.class, th);
            return null;
        }
    }

    public static final boolean f(Context context, String str) {
        List<ResolveInfo> list;
        str.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list != null) {
            Iterator<ResolveInfo> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (Intrinsics.c(activityInfo.name, "com.facebook.CustomTabActivity") && Intrinsics.c(activityInfo.packageName, context.getPackageName())) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    public static boolean g(Context context) {
        Method t = k0.t("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (t != null) {
            Object v = k0.v(null, t, context);
            if ((v instanceof Integer) && v.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final void h(String str, String str2) {
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        ogj.h(lnb.o("Argument '", str2, "' cannot be empty"));
    }

    public static final void i(com.facebook.f0 f0Var) {
        Iterator it = f0Var.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                yhk.s("Container 'requests' cannot contain null values");
                return;
            }
        }
        if (f0Var.isEmpty()) {
            ogj.h("Container 'requests' cannot be empty");
        }
    }

    public static final void j(String str, String str2) {
        if (str == null || str.length() <= 0) {
            ogj.h(lnb.o("Argument '", str2, "' cannot be null or empty"));
        }
    }

    public static final void k() {
        if (!com.facebook.w.q.get()) {
            throw new com.facebook.n("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
