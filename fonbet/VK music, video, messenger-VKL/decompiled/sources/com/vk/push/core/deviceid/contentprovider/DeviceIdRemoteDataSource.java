package com.vk.push.core.deviceid.contentprovider;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.push.core.deviceid.DeviceIdReadOnlyDataSource;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.box;
import xsna.epx;
import xsna.er;
import xsna.gzs;
import xsna.i5g;
import xsna.izs;
import xsna.jw5;
import xsna.myc0;
import xsna.oxo0;
import xsna.qli0;
import xsna.rli0;
import xsna.s3q0;
import xsna.spj;
import xsna.ulp0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: DeviceIdRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class DeviceIdRemoteDataSource implements DeviceIdReadOnlyDataSource {

    @Deprecated
    public static final long QUERY_TIMEOUT_MS = 10000;
    public final Context a;

    /* compiled from: DeviceIdRemoteDataSource.kt */
    @b6l(c = "com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource", f = "DeviceIdRemoteDataSource.kt", l = {27}, m = "getDeviceId-IoAF18A")
    /* loaded from: classes5.dex */
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object mo96getDeviceIdIoAF18A = DeviceIdRemoteDataSource.this.mo96getDeviceIdIoAF18A(this);
            return mo96getDeviceIdIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? mo96getDeviceIdIoAF18A : new Result(mo96getDeviceIdIoAF18A);
        }
    }

    /* compiled from: DeviceIdRemoteDataSource.kt */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements izs<PackageInfo, Boolean> {
        public b() {
            super(1);
        }

        @Override // xsna.izs
        public final Boolean invoke(PackageInfo packageInfo) {
            return Boolean.valueOf(DeviceIdRemoteDataSource.access$hasProvider(DeviceIdRemoteDataSource.this, packageInfo));
        }
    }

    /* compiled from: DeviceIdRemoteDataSource.kt */
    /* loaded from: classes5.dex */
    public static final class c extends Lambda implements izs<PackageInfo, String> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final String invoke(PackageInfo packageInfo) {
            return packageInfo.packageName;
        }
    }

    /* compiled from: DeviceIdRemoteDataSource.kt */
    @b6l(c = "com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource", f = "DeviceIdRemoteDataSource.kt", l = {55}, m = "getDeviceIdFromProvider")
    /* loaded from: classes5.dex */
    public static final class d extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(spj<? super d> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceIdRemoteDataSource.this.a(null, this);
        }
    }

    /* compiled from: DeviceIdRemoteDataSource.kt */
    @b6l(c = "com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource$getDeviceIdFromProvider$2", f = "DeviceIdRemoteDataSource.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super Cursor>, Object> {
        final /* synthetic */ Uri $uri;
        int label;

        /* compiled from: DeviceIdRemoteDataSource.kt */
        public static final class a extends Lambda implements gzs<Cursor> {
            final /* synthetic */ Uri $uri;
            final /* synthetic */ DeviceIdRemoteDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceIdRemoteDataSource deviceIdRemoteDataSource, Uri uri) {
                super(0);
                this.this$0 = deviceIdRemoteDataSource;
                this.$uri = uri;
            }

            @Override // xsna.gzs
            public final Cursor invoke() {
                return this.this$0.a.getContentResolver().query(this.$uri, new String[]{DeviceIdUriMatcher.Companion.getVirtualColumnName()}, null, null, null, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return DeviceIdRemoteDataSource.this.new e(this.$uri, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Cursor> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            a aVar = new a(DeviceIdRemoteDataSource.this, this.$uri);
            this.label = 1;
            Object k = myc0.k(EmptyCoroutineContext.b, new box(aVar, null), this);
            return k == coroutineSingletons ? coroutineSingletons : k;
        }
    }

    public DeviceIdRemoteDataSource(Context context) {
        this.a = context;
    }

    public static final boolean access$hasProvider(DeviceIdRemoteDataSource deviceIdRemoteDataSource, PackageInfo packageInfo) {
        deviceIdRemoteDataSource.getClass();
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        if (providerInfoArr != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (epx.f(providerInfo.authority, DeviceIdUriMatcher.Companion.getAuthority(providerInfo.packageName))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(6:(2:3|(10:5|6|7|(1:(2:10|11)(2:36|37))(3:38|39|(1:41)(1:42))|12|14|15|(1:17)(2:22|(1:24)(1:25))|(1:19)|20))|14|15|(0)(0)|(0)|20)|45|6|7|(0)(0)|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002e, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002c, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x008f, Exception -> 0x0097, TryCatch #3 {Exception -> 0x0097, all -> 0x008f, blocks: (B:15:0x006e, B:22:0x0074, B:25:0x0085), top: B:14:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, spj<? super String> spjVar) {
        d dVar;
        int i;
        Cursor cursor;
        Cursor cursor2;
        DeviceIdRemoteDataSource deviceIdRemoteDataSource;
        try {
            if (spjVar instanceof d) {
                dVar = (d) spjVar;
                int i2 = dVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dVar.label;
                    cursor = null;
                    r4 = null;
                    String string = null;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        e eVar = new e(Uri.withAppendedPath(er.a(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(DeviceIdUriMatcher.Companion.getAuthority(str)).build(), DeviceIdUriMatcher.Companion.getPath()), null);
                        dVar.L$0 = this;
                        dVar.label = 1;
                        obj = oxo0.b(10000L, eVar, dVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        deviceIdRemoteDataSource = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        deviceIdRemoteDataSource = (DeviceIdRemoteDataSource) dVar.L$0;
                        kotlin.a.a(obj);
                    }
                    cursor2 = (Cursor) obj;
                    deviceIdRemoteDataSource.getClass();
                    if (cursor2 == null) {
                        cursor2.moveToFirst();
                        int columnIndex = cursor2.getColumnIndex(DeviceIdUriMatcher.Companion.getVirtualColumnName());
                        if (columnIndex != -1) {
                            string = cursor2.getString(columnIndex);
                        }
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return string;
                }
            }
            deviceIdRemoteDataSource.getClass();
            if (cursor2 == null) {
            }
            if (cursor2 != null) {
            }
            return string;
        } catch (Exception unused) {
            if (cursor2 != null) {
                cursor2.close();
            }
            return null;
        } catch (Throwable th) {
            th = th;
            cursor = cursor2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        dVar = new d(spjVar);
        Object obj2 = dVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.label;
        cursor = null;
        string = null;
        String string2 = null;
        if (i != 0) {
        }
        cursor2 = (Cursor) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0096, B:14:0x0070, B:16:0x0076, B:21:0x0089, B:30:0x003c), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:12:0x0096). Please report as a decompilation issue!!! */
    @Override // com.vk.push.core.deviceid.DeviceIdReadOnlyDataSource
    /* renamed from: getDeviceId-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96getDeviceIdIoAF18A(spj<? super Result<String>> spjVar) {
        a aVar;
        int i;
        DeviceIdRemoteDataSource deviceIdRemoteDataSource;
        Iterator aVar2;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        deviceIdRemoteDataSource = this;
                        aVar2 = new ulp0.a(new ulp0(new qli0(rli0.j(new i5g(this.a.getPackageManager().getInstalledPackages(8)), new b()), new Comparator() { // from class: com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return jw5.b(Long.valueOf(((PackageInfo) t).firstInstallTime), Long.valueOf(((PackageInfo) t2).firstInstallTime));
                            }
                        }), c.i));
                        if (aVar2.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (Iterator) aVar.L$1;
                        deviceIdRemoteDataSource = (DeviceIdRemoteDataSource) aVar.L$0;
                        kotlin.a.a(obj);
                        String str = (String) obj;
                        if (str != null) {
                            return str;
                        }
                        if (aVar2.hasNext()) {
                            String str2 = (String) aVar2.next();
                            if (epx.f(str2, deviceIdRemoteDataSource.a.getPackageName())) {
                                return "";
                            }
                            aVar.L$0 = deviceIdRemoteDataSource;
                            aVar.L$1 = aVar2;
                            aVar.label = 1;
                            obj = deviceIdRemoteDataSource.a(str2, aVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            String str3 = (String) obj;
                            if (str3 != null) {
                            }
                            if (aVar2.hasNext()) {
                                return "";
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }
}
