package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f4962i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f4963a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4964b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4965c;

    /* renamed from: g, reason: collision with root package name */
    public volatile Map f4969g;

    /* renamed from: d, reason: collision with root package name */
    public a1.a f4966d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f4967e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4968f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4970h = new ArrayList();

    public d4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f4963a = contentResolver;
        this.f4964b = uri;
        this.f4965c = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d4 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        d4 d4Var;
        if (Build.VERSION.SDK_INT >= 24) {
            d4Var = (d4) ConcurrentMap$EL.computeIfAbsent(f4962i, uri, new Function() { // from class: com.google.android.gms.internal.measurement.c4
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return new d4(contentResolver, uri, runnable);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            ConcurrentHashMap concurrentHashMap = f4962i;
            d4 d4Var2 = (d4) concurrentHashMap.get(uri);
            if (d4Var2 == null) {
                d4Var2 = new d4(contentResolver, uri, runnable);
                d4Var = (d4) concurrentHashMap.putIfAbsent(uri, d4Var2);
            }
            d4Var = d4Var2;
        }
        try {
            if (!d4Var.f4967e) {
                return d4Var;
            }
            synchronized (d4Var) {
                try {
                    if (d4Var.f4967e) {
                        a1.a aVar = new a1.a(d4Var);
                        d4Var.f4963a.registerContentObserver(d4Var.f4964b, false, aVar);
                        d4Var.f4966d = aVar;
                        d4Var.f4967e = false;
                    }
                } finally {
                }
            }
            return d4Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = f4962i.values().iterator();
        while (it.hasNext()) {
            d4 d4Var = (d4) it.next();
            synchronized (d4Var) {
                try {
                    if (d4Var.f4967e) {
                        d4Var.f4967e = false;
                    } else {
                        a1.a aVar = d4Var.f4966d;
                        if (aVar != null) {
                            d4Var.f4963a.unregisterContentObserver(aVar);
                            d4Var.f4966d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b() {
        Map map;
        Map map2;
        Object c2;
        Map map3 = this.f4969g;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f4968f) {
                ?? r02 = this.f4969g;
                map2 = r02;
                if (r02 == 0) {
                    try {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                u5 u5Var = new u5(this);
                                try {
                                    c2 = u5Var.c();
                                } catch (SecurityException unused) {
                                    long clearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        c2 = u5Var.c();
                                    } finally {
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                    }
                                }
                                map = (Map) c2;
                            } catch (SecurityException e7) {
                                e = e7;
                                io.sentry.android.core.w0.n("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                this.f4969g = map;
                                map2 = map;
                                map4 = map2;
                                if (map4 == null) {
                                }
                            }
                        } catch (SQLiteException e9) {
                            e = e9;
                            io.sentry.android.core.w0.n("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.f4969g = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        } catch (IllegalStateException e10) {
                            e = e10;
                            io.sentry.android.core.w0.n("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.f4969g = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        this.f4969g = map;
                        map2 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(r02);
                        throw th2;
                    }
                }
            }
            map4 = map2;
        }
        return map4 == null ? map4 : Collections.EMPTY_MAP;
    }
}
