package T7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import g6.C4331C;
import g6.C4357q;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1662b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f11059f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f11060g = C1662b.class.getCanonicalName();

    /* renamed from: h, reason: collision with root package name */
    public static C1662b f11061h;

    /* renamed from: a, reason: collision with root package name */
    public String f11062a;

    /* renamed from: b, reason: collision with root package name */
    public long f11063b;

    /* renamed from: c, reason: collision with root package name */
    public String f11064c;

    /* renamed from: d, reason: collision with root package name */
    public String f11065d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11066e;

    /* renamed from: T7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1662b a(C1662b c1662b) {
            c1662b.f11063b = System.currentTimeMillis();
            C1662b.f11061h = c1662b;
            return c1662b;
        }

        public final C1662b b(Context context) {
            C1662b c10 = c(context);
            if (c10 != null) {
                return c10;
            }
            C1662b d10 = d(context);
            return d10 == null ? new C1662b() : d10;
        }

        public final C1662b c(Context context) {
            Method L10;
            Object U10;
            try {
                if (!g(context) || (L10 = Y.L("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (U10 = Y.U(null, L10, context)) == null) {
                    return null;
                }
                boolean z10 = false;
                Method K10 = Y.K(U10.getClass(), "getId", new Class[0]);
                Method K11 = Y.K(U10.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (K10 != null && K11 != null) {
                    C1662b c1662b = new C1662b();
                    c1662b.f11062a = (String) Y.U(U10, K10, new Object[0]);
                    Boolean bool = (Boolean) Y.U(U10, K11, new Object[0]);
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    }
                    c1662b.f11066e = z10;
                    return c1662b;
                }
                return null;
            } catch (Exception e10) {
                Y.j0("android_id", e10);
                return null;
            }
        }

        public final C1662b d(Context context) {
            if (!g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        C0211b c0211b = new C0211b(cVar.a());
                        C1662b c1662b = new C1662b();
                        c1662b.f11062a = c0211b.c();
                        c1662b.f11066e = c0211b.g();
                        return c1662b;
                    }
                } catch (Exception e10) {
                    Y.j0("android_id", e10);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008d A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003c, B:13:0x0057, B:15:0x0066, B:17:0x0087, B:19:0x008d, B:21:0x0092, B:23:0x0097, B:60:0x0070, B:62:0x007f, B:64:0x00f6, B:65:0x00fd), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003c, B:13:0x0057, B:15:0x0066, B:17:0x0087, B:19:0x008d, B:21:0x0092, B:23:0x0097, B:60:0x0070, B:62:0x007f, B:64:0x00f6, B:65:0x00fd), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[Catch: all -> 0x0033, Exception -> 0x0037, TRY_LEAVE, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003c, B:13:0x0057, B:15:0x0066, B:17:0x0087, B:19:0x008d, B:21:0x0092, B:23:0x0097, B:60:0x0070, B:62:0x007f, B:64:0x00f6, B:65:0x00fd), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C1662b e(Context context) {
            Exception exc;
            Cursor cursor;
            Throwable th2;
            Uri uri;
            Uri parse;
            String f10;
            Intrinsics.checkNotNullParameter(context, "context");
            C1662b b10 = b(context);
            Cursor cursor2 = null;
            try {
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new C4357q("getAttributionIdentifiers cannot be called on the main thread.");
                }
                C1662b c1662b = C1662b.f11061h;
                if (c1662b != null && System.currentTimeMillis() - c1662b.f11063b < 3600000) {
                    return c1662b;
                }
                String[] strArr = {"aid", "androidid", "limit_tracking"};
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (resolveContentProvider != null) {
                    C1676p c1676p = C1676p.f11158a;
                    String str = resolveContentProvider.packageName;
                    Intrinsics.checkNotNullExpressionValue(str, "contentProviderInfo.packageName");
                    if (C1676p.a(context, str)) {
                        parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        uri = parse;
                        f10 = f(context);
                        if (f10 != null) {
                            b10.f11065d = f10;
                        }
                        if (uri == null) {
                            return a(b10);
                        }
                        Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    int columnIndex = query.getColumnIndex("aid");
                                    int columnIndex2 = query.getColumnIndex("androidid");
                                    int columnIndex3 = query.getColumnIndex("limit_tracking");
                                    b10.f11064c = query.getString(columnIndex);
                                    if (columnIndex2 > 0 && columnIndex3 > 0 && b10.h() == null) {
                                        b10.f11062a = query.getString(columnIndex2);
                                        b10.f11066e = Boolean.parseBoolean(query.getString(columnIndex3));
                                    }
                                    query.close();
                                    return a(b10);
                                }
                            } catch (Exception e10) {
                                cursor = query;
                                exc = e10;
                                try {
                                    Y y10 = Y.f11042a;
                                    Y.k0(C1662b.f11060g, Intrinsics.stringPlus("Caught unexpected exception in getAttributionId(): ", exc));
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return null;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        throw th2;
                                    }
                                    cursor2.close();
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor2 = query;
                                th2 = th;
                                if (cursor2 != null) {
                                }
                            }
                        }
                        C1662b a10 = a(b10);
                        if (query == null) {
                            return a10;
                        }
                        query.close();
                        return a10;
                    }
                }
                if (resolveContentProvider2 != null) {
                    C1676p c1676p2 = C1676p.f11158a;
                    String str2 = resolveContentProvider2.packageName;
                    Intrinsics.checkNotNullExpressionValue(str2, "wakizashiProviderInfo.packageName");
                    if (C1676p.a(context, str2)) {
                        parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        uri = parse;
                        f10 = f(context);
                        if (f10 != null) {
                        }
                        if (uri == null) {
                        }
                    }
                }
                uri = null;
                f10 = f(context);
                if (f10 != null) {
                }
                if (uri == null) {
                }
            } catch (Exception e11) {
                exc = e11;
                cursor = null;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        public final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        public final boolean g(Context context) {
            Method L10 = Y.L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (L10 == null) {
                return false;
            }
            Object U10 = Y.U(null, L10, context);
            return (U10 instanceof Integer) && Intrinsics.areEqual(U10, (Object) 0);
        }

        public final boolean h(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C1662b e10 = e(context);
            return e10 != null && e10.l();
        }

        public a() {
        }
    }

    /* renamed from: T7.b$b, reason: collision with other inner class name */
    public static final class C0211b implements IInterface {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11067b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final IBinder f11068a;

        /* renamed from: T7.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public C0211b(IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.f11068a = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f11068a;
        }

        public final String c() {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f11068a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean g() {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f11068a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static final C1662b k(Context context) {
        return f11059f.e(context);
    }

    public final String h() {
        if (C4331C.G() && C4331C.k()) {
            return this.f11062a;
        }
        return null;
    }

    public final String i() {
        return this.f11065d;
    }

    public final String j() {
        return this.f11064c;
    }

    public final boolean l() {
        return this.f11066e;
    }

    /* renamed from: T7.b$c */
    public static final class c implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f11069a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        public final BlockingQueue f11070b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (this.f11069a.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object take = this.f11070b.take();
            Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
            return (IBinder) take;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f11070b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
