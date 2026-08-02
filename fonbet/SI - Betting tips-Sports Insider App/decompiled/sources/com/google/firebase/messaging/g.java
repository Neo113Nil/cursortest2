package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.app.v0;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import eg.e1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.j6;
import io.sentry.k1;
import io.sentry.p3;
import io.sentry.r3;
import io.sentry.u3;
import io.sentry.v1;
import io.sentry.z0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnCompleteListener, w7.a, u.i, o8.d, v1, r3, u3, io.sentry.instrumentation.file.a, p3, w7.f, m5.b, l5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6126c;

    public /* synthetic */ g(int i5, Object obj, Object obj2) {
        this.f6124a = i5;
        this.f6125b = obj;
        this.f6126c = obj2;
    }

    private final Object j(Task task) {
        l lVar = (l) this.f6125b;
        String str = (String) this.f6126c;
        synchronized (lVar) {
            ((s.e) lVar.f6157b).remove(str);
        }
        return task;
    }

    private final Object k(Task task) {
        j9.h hVar = (j9.h) this.f6125b;
        Date date = (Date) this.f6126c;
        if (task.isSuccessful()) {
            j9.m mVar = hVar.f18322g;
            synchronized (mVar.f18354b) {
                mVar.f18353a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof i9.e) {
            hVar.f18322g.i();
            return task;
        }
        hVar.f18322g.h();
        return task;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // u.i
    public Object a(u.h completer) {
        switch (this.f6124a) {
            case 2:
                CoroutineContext coroutineContext = (CoroutineContext) this.f6125b;
                eg.a0 a0Var = eg.a0.f9136a;
                ?? r22 = (mf.i) this.f6126c;
                Intrinsics.checkNotNullParameter(completer, "completer");
                aa.c cVar = new aa.c(18, (e1) coroutineContext.r(eg.x.f9237b));
                e3.m mVar = e3.m.f8543a;
                u.m mVar2 = completer.f24000c;
                if (mVar2 != null) {
                    mVar2.a(cVar, mVar);
                }
                return eg.c0.t(eg.c0.b(coroutineContext), null, a0Var, new androidx.lifecycle.o((Function2) r22, completer, (Continuation) null), 1);
            case 3:
                Executor executor = (Executor) this.f6125b;
                n3.q qVar = (n3.q) this.f6126c;
                Intrinsics.checkNotNullParameter(completer, "completer");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final int i5 = 0;
                Runnable runnable = new Runnable() { // from class: e3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                atomicBoolean.set(true);
                                break;
                            default:
                                atomicBoolean.set(true);
                                break;
                        }
                    }
                };
                e3.m mVar3 = e3.m.f8543a;
                u.m mVar4 = completer.f24000c;
                if (mVar4 != null) {
                    mVar4.a(runnable, mVar3);
                }
                executor.execute(new androidx.fragment.app.d(atomicBoolean, completer, qVar, 9));
                return "setForegroundAsync";
            default:
                Executor executor2 = (Executor) this.f6125b;
                Function0 function0 = (Function0) this.f6126c;
                Intrinsics.checkNotNullParameter(completer, "it");
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final int i10 = 1;
                Runnable runnable2 = new Runnable() { // from class: e3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                atomicBoolean2.set(true);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                break;
                        }
                    }
                };
                e3.m mVar5 = e3.m.f8543a;
                u.m mVar6 = completer.f24000c;
                if (mVar6 != null) {
                    mVar6.a(runnable2, mVar5);
                }
                executor2.execute(new androidx.fragment.app.d(atomicBoolean2, completer, function0, 10));
                return Unit.f19194a;
        }
    }

    @Override // l5.g
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f6125b;
        e5.i iVar2 = (e5.i) this.f6126c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        l5.a aVar = iVar.f19383d;
        ArrayList r5 = iVar.r(sQLiteDatabase, iVar2, aVar.f19367b);
        for (b5.d dVar : b5.d.values()) {
            if (dVar != iVar2.f8643c) {
                int size = aVar.f19367b - r5.size();
                if (size <= 0) {
                    break;
                }
                v0 a7 = e5.i.a();
                a7.Y(iVar2.f8641a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a7.f366d = dVar;
                a7.f365c = iVar2.f8642b;
                r5.addAll(iVar.r(sQLiteDatabase, a7.d(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i5 = 0; i5 < r5.size(); i5++) {
            sb2.append(((l5.b) r5.get(i5)).f19371a);
            if (i5 < r5.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new l5.h(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = r5.listIterator();
            while (listIterator.hasNext()) {
                l5.b bVar = (l5.b) listIterator.next();
                long j6 = bVar.f19371a;
                if (hashMap.containsKey(Long.valueOf(j6))) {
                    androidx.appcompat.widget.a0 c2 = bVar.f19373c.c();
                    for (l5.h hVar : (Set) hashMap.get(Long.valueOf(j6))) {
                        c2.j(hVar.f19377a, hVar.f19378b);
                    }
                    listIterator.set(new l5.b(j6, bVar.f19372b, c2.p()));
                }
            }
            return r5;
        } catch (Throwable th2) {
            query.close();
            throw th2;
        }
    }

    @Override // io.sentry.r3
    public void b(k1 k1Var) {
        switch (this.f6124a) {
            case 7:
                j6 j6Var = (j6) this.f6125b;
                z0 z0Var = (z0) this.f6126c;
                j6Var.getClass();
                if (k1Var == j6Var) {
                    z0Var.t();
                    break;
                }
                break;
            case 8:
                k1 k1Var2 = (k1) this.f6125b;
                z0 z0Var2 = (z0) this.f6126c;
                if (k1Var == k1Var2) {
                    z0Var2.t();
                    break;
                }
                break;
            default:
                io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) this.f6125b;
                z0 z0Var3 = (z0) this.f6126c;
                if (k1Var == gVar.f15651e) {
                    z0Var3.t();
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.v1
    public Object c() {
        com.android.billingclient.api.m mVar = (com.android.billingclient.api.m) this.f6125b;
        b2 b2Var = (b2) this.f6126c;
        mVar.getClass();
        try {
            try {
                return Integer.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f16208b).O());
            } catch (Exception unused) {
                return Double.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f16208b).N());
            }
        } catch (Exception unused2) {
            return Long.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f16208b).R());
        }
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        switch (this.f6124a) {
            case 13:
                return Integer.valueOf(((io.sentry.instrumentation.file.e) this.f6125b).f16507a.read((byte[]) this.f6126c));
            case 14:
                io.sentry.instrumentation.file.e eVar = (io.sentry.instrumentation.file.e) this.f6125b;
                AtomicInteger atomicInteger = (AtomicInteger) this.f6126c;
                int read = eVar.f16507a.read();
                atomicInteger.set(read);
                return Integer.valueOf(read != -1 ? 1 : 0);
            default:
                io.sentry.instrumentation.file.f fVar = (io.sentry.instrumentation.file.f) this.f6125b;
                byte[] bArr = (byte[]) this.f6126c;
                fVar.f16509a.write(bArr);
                return Integer.valueOf(bArr.length);
        }
    }

    @Override // io.sentry.p3
    public void d(v0 v0Var) {
        z0 z0Var = (z0) this.f6125b;
        b6 b6Var = (b6) this.f6126c;
        io.sentry.c cVar = (io.sentry.c) v0Var.f366d;
        if (cVar.f16223f) {
            v0 y5 = z0Var.y();
            io.sentry.protocol.v k6 = z0Var.k();
            cVar.d("sentry-trace_id", ((io.sentry.protocol.v) y5.f364b).toString());
            cVar.d("sentry-public_key", b6Var.retrieveParsedDsn().f17267b);
            cVar.d("sentry-release", b6Var.getRelease());
            cVar.d("sentry-environment", b6Var.getEnvironment());
            if (!io.sentry.protocol.v.f16922b.equals(k6)) {
                cVar.d("sentry-replay_id", k6.toString());
            }
            cVar.d("sentry-transaction", null);
            if (cVar.f16223f) {
                cVar.f16220c = null;
            }
            cVar.d("sentry-sampled", null);
            cVar.f16223f = false;
        }
    }

    @Override // w7.f
    public Task e(Object obj) {
        j9.d dVar = (j9.d) this.f6125b;
        j9.e eVar = (j9.e) this.f6126c;
        synchronized (dVar) {
            dVar.f18300c = d5.q(eVar);
        }
        return d5.q(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[Catch: all -> 0x0055, TryCatch #3 {all -> 0x0055, blocks: (B:34:0x003c, B:38:0x0041, B:39:0x0042, B:43:0x005d, B:45:0x00d1, B:47:0x00d5, B:64:0x00d9), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:34:0x003c, B:38:0x0041, B:39:0x0042, B:43:0x005d, B:45:0x00d1, B:47:0x00d5, B:64:0x00d9), top: B:4:0x0018 }] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v3, types: [j9.k] */
    @Override // w7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(Task task) {
        InputStream inputStream;
        Integer num;
        Throwable th2;
        ?? r10;
        boolean z5;
        int responseCode;
        boolean z7;
        switch (this.f6124a) {
            case 1:
                j(task);
                return task;
            case 19:
                return ((j9.h) this.f6125b).b(task, 0L, (HashMap) this.f6126c);
            case 20:
                k(task);
                return task;
            default:
                ?? r14 = (j9.k) this.f6125b;
                ?? r02 = (Task) this.f6126c;
                q6.a aVar = r14.f18347p;
                try {
                    try {
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (IOException e7) {
                    e = e7;
                    r02 = 0;
                    inputStream = null;
                } catch (Throwable th4) {
                    inputStream = null;
                    num = null;
                    th2 = th4;
                    r02 = 0;
                }
                if (!r02.isSuccessful()) {
                    throw new IOException(r02.getException());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) r02.getResult();
                r14.f18338f = httpURLConnection;
                r02 = httpURLConnection.getInputStream();
                try {
                    inputStream = r14.f18338f.getErrorStream();
                } catch (IOException e9) {
                    e = e9;
                    inputStream = null;
                    r02 = r02;
                    r10 = inputStream;
                    if (r14.f18337e) {
                    }
                    r14.b(r02, inputStream);
                    r14.j(false);
                    if (r14.f18337e) {
                    }
                    if (z5) {
                    }
                    if (!z5) {
                        String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[]{r10});
                        if (r10.intValue() == 403) {
                        }
                        new i9.f(r10.intValue(), format, 0);
                        r14.g();
                        r14.f18338f = null;
                        r14.f18339g = null;
                        return d5.q(null);
                    }
                    r14.i();
                    r14.f18338f = null;
                    r14.f18339g = null;
                    return d5.q(null);
                } catch (Throwable th5) {
                    num = null;
                    th2 = th5;
                    inputStream = null;
                }
                try {
                    responseCode = r14.f18338f.getResponseCode();
                    r10 = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            synchronized (r14) {
                                r14.f18335c = 8;
                            }
                            r14.q.g(0, j9.m.f18352f);
                            j9.c m6 = r14.m(r14.f18338f);
                            r14.f18339g = m6;
                            m6.c();
                        } catch (IOException e10) {
                            e = e10;
                            if (r14.f18337e) {
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            } else {
                                r14.h();
                            }
                            r14.b(r02, inputStream);
                            r14.j(false);
                            z5 = r14.f18337e && (r10 == 0 || j9.k.d(r10.intValue()));
                            if (z5) {
                                aVar.getClass();
                                r14.n(new Date(System.currentTimeMillis()));
                            }
                            if (!z5 && r10.intValue() != 200) {
                                String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[]{r10});
                                if (r10.intValue() == 403) {
                                    format2 = j9.k.f(r14.f18338f.getErrorStream());
                                }
                                new i9.f(r10.intValue(), format2, 0);
                                r14.g();
                                r14.f18338f = null;
                                r14.f18339g = null;
                                return d5.q(null);
                            }
                            r14.i();
                            r14.f18338f = null;
                            r14.f18339g = null;
                            return d5.q(null);
                        }
                    }
                    r14.b(r02, inputStream);
                    r14.j(false);
                    z7 = !r14.f18337e && j9.k.d(responseCode);
                    if (z7) {
                        aVar.getClass();
                        r14.n(new Date(System.currentTimeMillis()));
                    }
                } catch (IOException e11) {
                    e = e11;
                    r10 = 0;
                } catch (Throwable th6) {
                    num = null;
                    th2 = th6;
                    r14.b(r02, inputStream);
                    r14.j(false);
                    boolean z10 = !r14.f18337e && (num == null || j9.k.d(num.intValue()));
                    if (z10) {
                        aVar.getClass();
                        r14.n(new Date(System.currentTimeMillis()));
                    }
                    if (z10 || num.intValue() == 200) {
                        r14.i();
                    } else {
                        String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                        if (num.intValue() == 403) {
                            format3 = j9.k.f(r14.f18338f.getErrorStream());
                        }
                        new i9.f(num.intValue(), format3, 0);
                        r14.g();
                    }
                    throw th2;
                }
                if (!z7 && responseCode != 200) {
                    String format4 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[]{r10});
                    if (responseCode == 403) {
                        format4 = j9.k.f(r14.f18338f.getErrorStream());
                    }
                    new i9.f(responseCode, format4, 0);
                    r14.g();
                    r14.f18338f = null;
                    r14.f18339g = null;
                    return d5.q(null);
                }
                r14.i();
                r14.f18338f = null;
                r14.f18339g = null;
                return d5.q(null);
        }
    }

    @Override // io.sentry.u3
    public void g(z0 z0Var) {
        switch (this.f6124a) {
            case 9:
                z0Var.K(new io.sentry.android.core.e((ActivityLifecycleIntegration) this.f6125b, z0Var, (k1) this.f6126c));
                break;
            case 11:
                z0Var.K(new androidx.transition.i((io.sentry.android.core.internal.gestures.g) this.f6125b, z0Var, (k1) this.f6126c, 7));
                break;
            case 16:
                ((i2.d) this.f6125b).f10882b = z0Var.I(new g(17, z0Var, (b6) this.f6126c));
                break;
            default:
                io.sentry.e eVar = (io.sentry.e) this.f6125b;
                String str = (String) this.f6126c;
                if (eVar != null) {
                    z0Var.c(eVar);
                }
                if (str != null) {
                    z0Var.f("catch_fun", str);
                }
                Intrinsics.checkNotNull(z0Var);
                if (Build.VERSION.SDK_INT >= 25) {
                    try {
                        com.logrocket.core.e0.b(new io.sentry.util.m(z0Var));
                    } catch (Exception unused) {
                    }
                }
                z0Var.r(b5.INFO);
                break;
        }
    }

    @Override // o8.d
    public Object h(x xVar) {
        String valueOf;
        switch (this.f6124a) {
            case 5:
                String str = (String) this.f6125b;
                k kVar = (k) this.f6126c;
                Context context = (Context) xVar.a(Context.class);
                switch (kVar.f6147a) {
                    case 21:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                        valueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                        int i5 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i5 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new h9.a(str, valueOf);
            default:
                String str2 = (String) this.f6125b;
                o8.b bVar = (o8.b) this.f6126c;
                try {
                    Trace.beginSection(str2);
                    return bVar.f21107f.h(xVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // m5.b
    public Object i() {
        switch (this.f6124a) {
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                k5.h hVar = (k5.h) this.f6125b;
                Iterable iterable = (Iterable) this.f6126c;
                l5.i iVar = (l5.i) hVar.f18835c;
                iVar.getClass();
                if (iterable.iterator().hasNext()) {
                    iVar.c().compileStatement("DELETE FROM events WHERE _id in " + l5.i.y(iterable)).execute();
                    break;
                }
                break;
            default:
                k5.h hVar2 = (k5.h) this.f6125b;
                for (Map.Entry entry : ((HashMap) this.f6126c).entrySet()) {
                    ((l5.i) hVar2.f18841i).t(((Integer) entry.getValue()).intValue(), h5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((h) this.f6125b).a((Intent) this.f6126c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(CoroutineContext coroutineContext, Function2 function2) {
        this.f6124a = 2;
        eg.a0 a0Var = eg.a0.f9136a;
        this.f6125b = coroutineContext;
        this.f6126c = (mf.i) function2;
    }
}
