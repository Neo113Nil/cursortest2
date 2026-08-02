package androidx.transition;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.widget.q4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sports.insider.MyApp;
import com.sports.insider.data.room.general.table.AccountTable;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C0679n;
import io.sentry.ILogger;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.j6;
import io.sentry.k1;
import io.sentry.k6;
import io.sentry.l6;
import io.sentry.m6;
import io.sentry.o6;
import io.sentry.q3;
import io.sentry.r3;
import io.sentry.t4;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements w7.f, FunctionWithThrowable, w7.a, q3, o6, r3, io.sentry.util.network.e, m5.b, l5.g, com.logrocket.core.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2708d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i5) {
        this.f2705a = i5;
        this.f2706b = obj;
        this.f2707c = obj2;
        this.f2708d = obj3;
    }

    @Override // io.sentry.q3
    public void a(l6 l6Var) {
        ConcurrentHashMap concurrentHashMap;
        com.android.billingclient.api.x0 x0Var = (com.android.billingclient.api.x0) this.f2706b;
        t4 t4Var = (t4) this.f2707c;
        io.sentry.h0 h0Var = (io.sentry.h0) this.f2708d;
        if (l6Var == null) {
            ((b6) x0Var.f4116b).getLogger().h(b5.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String str = null;
        k6 k6Var = t4Var.c() != null ? k6.Crashed : null;
        boolean z5 = k6.Crashed == k6Var || t4Var.d();
        io.sentry.protocol.p pVar = t4Var.f16458d;
        String str2 = (pVar == null || (concurrentHashMap = pVar.f16881f) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) t4Var.f16458d.f16881f.get("user-agent");
        Object b10 = h0Var.b("sentry:typeCheckHint");
        if (b10 instanceof io.sentry.hints.a) {
            str = ((io.sentry.hints.a) b10).e();
            k6Var = k6.Abnormal;
        }
        if (!l6Var.d(k6Var, str2, z5, str) || l6Var.f16616g == k6.Ok) {
            return;
        }
        l6Var.b(com.google.android.play.core.appupdate.b.n());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        l5.i iVar;
        h5.c cVar;
        h5.c cVar2;
        int i5 = this.f2705a;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        h5.c cVar3 = h5.c.CACHE_FULL;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        Object obj2 = this.f2708d;
        Object obj3 = this.f2707c;
        Object obj4 = this.f2706b;
        switch (i5) {
            case 2:
                return io.appmetrica.analytics.screenshot.impl.d0.a((io.appmetrica.analytics.screenshot.impl.g0) obj4, (io.appmetrica.analytics.screenshot.impl.d0) obj3, (C0679n) obj2, (ActivityManager) obj);
            case 11:
                l5.i iVar2 = (l5.i) obj4;
                e5.h hVar = (e5.h) obj3;
                e5.l lVar = hVar.f8637c;
                String str = hVar.f8635a;
                e5.i iVar3 = (e5.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = iVar2.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar2.c().compileStatement("PRAGMA page_count").simpleQueryForLong();
                l5.a aVar = iVar2.f19383d;
                if (simpleQueryForLong >= aVar.f19366a) {
                    iVar2.t(1L, cVar3, str);
                    return -1L;
                }
                Long k6 = l5.i.k(sQLiteDatabase, iVar3);
                if (k6 != null) {
                    insert = k6.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar3.f8641a);
                    contentValues.put("priority", Integer.valueOf(o5.a.a(iVar3.f8643c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar3.f8642b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.f19370e;
                byte[] bArr2 = lVar.f8652b;
                boolean z5 = bArr2.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f8638d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f8639e));
                contentValues2.put("payload_encoding", lVar.f8651a.f3025a);
                contentValues2.put("code", hVar.f8636b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z5));
                contentValues2.put("payload", z5 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z5) {
                    int ceil = (int) Math.ceil(bArr2.length / i16);
                    for (int i17 = 1; i17 <= ceil; i17++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar.f8640f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 12:
                l5.i iVar4 = (l5.i) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                e5.i iVar5 = (e5.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i15 : 0;
                    androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(7);
                    a0Var.f685g = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    a0Var.f680b = string;
                    a0Var.f683e = Long.valueOf(cursor2.getLong(i13));
                    a0Var.f684f = Long.valueOf(cursor2.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor2.getString(4);
                        a0Var.f682d = new e5.l(string2 == null ? l5.i.f19379f : new b5.c(string2), cursor2.getBlob(5));
                        iVar = iVar4;
                    } else {
                        String string3 = cursor2.getString(4);
                        b5.c cVar4 = string3 == null ? l5.i.f19379f : new b5.c(string3);
                        Cursor query = iVar4.c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = query;
                            ArrayList arrayList2 = new ArrayList();
                            int i19 = 0;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(0);
                                arrayList2.add(blob);
                                i19 += blob.length;
                            }
                            byte[] bArr3 = new byte[i19];
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i20);
                                l5.i iVar6 = iVar4;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, i21, bArr4.length);
                                    i21 += bArr4.length;
                                    i20++;
                                    query = cursor;
                                    iVar4 = iVar6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            iVar = iVar4;
                            query.close();
                            a0Var.f682d = new e5.l(cVar4, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        a0Var.f681c = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new l5.b(j, iVar5, a0Var.p()));
                    iVar4 = iVar;
                    i13 = 2;
                    i15 = 1;
                }
                return null;
            default:
                l5.i iVar7 = (l5.i) obj4;
                HashMap hashMap = (HashMap) obj3;
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) obj2;
                ArrayList arrayList3 = (ArrayList) xVar.f6184c;
                Cursor cursor4 = (Cursor) obj;
                iVar7.getClass();
                while (cursor4.moveToNext()) {
                    String string4 = cursor4.getString(i14);
                    int i22 = cursor4.getInt(1);
                    h5.c cVar5 = h5.c.REASON_UNKNOWN;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar5 = h5.c.MESSAGE_TOO_OLD;
                        } else if (i22 == 2) {
                            cVar = cVar3;
                            cVar2 = cVar;
                            long j6 = cursor4.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new h5.d(j6, cVar));
                            cVar3 = cVar2;
                            i10 = 5;
                            i11 = 4;
                            i12 = 3;
                            i14 = 0;
                        } else if (i22 == i12) {
                            cVar5 = h5.c.PAYLOAD_TOO_BIG;
                        } else if (i22 == i11) {
                            cVar5 = h5.c.MAX_RETRIES_REACHED;
                        } else if (i22 == i10) {
                            cVar5 = h5.c.INVALID_PAYLOD;
                        } else if (i22 == 6) {
                            cVar5 = h5.c.SERVER_ERROR;
                        } else {
                            ci.c.m(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar2 = cVar3;
                    cVar = cVar5;
                    long j62 = cursor4.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new h5.d(j62, cVar));
                    cVar3 = cVar2;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                    i14 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i23 = h5.e.f10378c;
                    new ArrayList();
                    arrayList3.add(new h5.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                final long time = iVar7.f19381b.getTime();
                xVar.f6183b = (h5.g) iVar7.n(new l5.g() { // from class: l5.f
                    @Override // l5.g
                    public final Object apply(Object obj5) {
                        long j10 = time;
                        Cursor rawQuery = ((SQLiteDatabase) obj5).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                        try {
                            Cursor cursor5 = rawQuery;
                            cursor5.moveToNext();
                            return new h5.g(cursor5.getLong(0), j10);
                        } finally {
                            rawQuery.close();
                        }
                    }
                });
                xVar.f6185d = new h5.b(new h5.f(iVar7.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar7.c().compileStatement("PRAGMA page_count").simpleQueryForLong(), l5.a.f19365f.f19366a));
                xVar.f6182a = (String) iVar7.f19384e.get();
                return new h5.a((h5.g) xVar.f6183b, DesugarCollections.unmodifiableList(arrayList3), (h5.b) xVar.f6185d, (String) xVar.f6182a);
        }
    }

    @Override // io.sentry.r3
    public void b(k1 k1Var) {
        io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) this.f2706b;
        io.sentry.z0 z0Var = (io.sentry.z0) this.f2707c;
        k1 k1Var2 = (k1) this.f2708d;
        if (k1Var == null) {
            z0Var.M(k1Var2);
        } else {
            gVar.f15649c.getLogger().h(b5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", k1Var2.getName());
        }
    }

    @Override // io.sentry.o6
    public void c(m6 m6Var) {
        io.sentry.android.core.c b10;
        j6 j6Var = (j6) this.f2706b;
        o6 o6Var = (o6) this.f2707c;
        AtomicReference atomicReference = (AtomicReference) this.f2708d;
        if (o6Var != null) {
            o6Var.c(m6Var);
        }
        io.sentry.android.core.e eVar = j6Var.f16583r.f17241i;
        if (eVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) eVar.f15569a;
            WeakReference weakReference = (WeakReference) eVar.f15570b;
            String str = (String) eVar.f15571c;
            Activity activity = (Activity) weakReference.get();
            int i5 = 1;
            if (activity != null) {
                q4 q4Var = activityLifecycleIntegration.q;
                io.sentry.protocol.v vVar = j6Var.f16568a;
                io.sentry.r a7 = ((io.sentry.util.a) q4Var.f897g).a();
                try {
                    if (q4Var.c()) {
                        io.sentry.android.core.b bVar = new io.sentry.android.core.b(q4Var, activity, i5);
                        io.sentry.android.core.c cVar = null;
                        q4Var.d(bVar, null);
                        io.sentry.android.core.c cVar2 = (io.sentry.android.core.c) ((WeakHashMap) q4Var.f895e).remove(activity);
                        if (cVar2 != null && (b10 = q4Var.b()) != null) {
                            cVar = new io.sentry.android.core.c(b10.f15548a - cVar2.f15548a, b10.f15549b - cVar2.f15549b, b10.f15550c - cVar2.f15550c);
                        }
                        if (cVar != null) {
                            int i10 = cVar.f15550c;
                            int i11 = cVar.f15549b;
                            int i12 = cVar.f15548a;
                            if (i12 != 0 || i11 != 0 || i10 != 0) {
                                io.sentry.protocol.l lVar = new io.sentry.protocol.l((Number) Integer.valueOf(i12), "none");
                                io.sentry.protocol.l lVar2 = new io.sentry.protocol.l((Number) Integer.valueOf(i11), "none");
                                io.sentry.protocol.l lVar3 = new io.sentry.protocol.l((Number) Integer.valueOf(i10), "none");
                                HashMap hashMap = new HashMap();
                                hashMap.put("frames_total", lVar);
                                hashMap.put("frames_slow", lVar2);
                                hashMap.put("frames_frozen", lVar3);
                                ((ConcurrentHashMap) q4Var.f894d).put(vVar, hashMap);
                            }
                        }
                    }
                    a7.close();
                } catch (Throwable th2) {
                    try {
                        a7.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f15451d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(b5.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        io.sentry.k kVar = j6Var.q;
        if (kVar != null) {
            atomicReference.set(kVar.f(j6Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.util.network.e
    public io.sentry.util.network.b d(Object obj) {
        String str;
        Charset a7;
        c4.d dVar = (c4.d) this.f2706b;
        Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f2707c;
        io.sentry.okhttp.g gVar = (io.sentry.okhttp.g) this.f2708d;
        gh.i0 req = (gh.i0) obj;
        Intrinsics.checkNotNullParameter(req, "req");
        gh.m0 m0Var = req.f10209d;
        if (m0Var != null) {
            Buffer buffer = new Buffer();
            m0Var.d(buffer);
            byte[] readByteArray = buffer.readByteArray();
            int i5 = gh.m0.f10243a;
            dVar.j(((gh.i0) objectRef.element).f10207b, gh.o.b(readByteArray.length, m0Var.b(), readByteArray));
            gh.b0 b10 = m0Var.b();
            ILogger logger = gVar.f16710a.m().getLogger();
            Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
            if (b10 != null) {
                try {
                    str = b10.f10119a;
                } catch (Exception e7) {
                    logger.h(b5.ERROR, "Failed to parse buffered request body: " + e7.getMessage(), new Object[0]);
                }
            } else {
                str = null;
            }
            String name = (b10 == null || (a7 = b10.a(Charsets.UTF_8)) == null) ? null : a7.name();
            if (name == null) {
                name = "UTF-8";
            }
            return com.google.android.play.core.appupdate.b.m(readByteArray, str, name, logger);
        }
        return null;
    }

    @Override // w7.f
    public Task e(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2706b;
        String str = (String) this.f2707c;
        com.google.firebase.messaging.y yVar = (com.google.firebase.messaging.y) this.f2708d;
        String str2 = (String) obj;
        h9.c c2 = FirebaseMessaging.c(firebaseMessaging.f6063b);
        h8.g gVar = firebaseMessaging.f6062a;
        gVar.a();
        String d10 = "[DEFAULT]".equals(gVar.f10402b) ? "" : gVar.d();
        String f6 = firebaseMessaging.f6070i.f();
        synchronized (c2) {
            String a7 = com.google.firebase.messaging.y.a(System.currentTimeMillis(), str2, f6);
            if (a7 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c2.f10430b).edit();
                edit.putString(d10 + "|T|" + str + "|*", a7);
                edit.commit();
            }
        }
        if (yVar == null || !str2.equals(yVar.f6187a)) {
            h8.g gVar2 = firebaseMessaging.f6062a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f10402b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f10402b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(AccountTable.tokenColumn, str2);
                new com.google.firebase.messaging.l(firebaseMessaging.f6063b).b(intent);
            }
        }
        return d5.q(str2);
    }

    @Override // w7.a
    public Object f(Task task) {
        j9.e eVar;
        URL url;
        switch (this.f2705a) {
            case 3:
                i9.b bVar = (i9.b) this.f2706b;
                Task task2 = (Task) this.f2707c;
                Task task3 = (Task) this.f2708d;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return d5.q(Boolean.FALSE);
                }
                j9.e eVar2 = (j9.e) task2.getResult();
                return (task3.isSuccessful() && (eVar = (j9.e) task3.getResult()) != null && eVar2.f18304c.equals(eVar.f18304c)) ? d5.q(Boolean.FALSE) : bVar.f11015d.e(eVar2).g(bVar.f11013b, new i9.a(bVar));
            default:
                j9.k kVar = (j9.k) this.f2706b;
                Task task4 = (Task) this.f2707c;
                Task task5 = (Task) this.f2708d;
                if (!task4.isSuccessful()) {
                    return d5.p(new i9.c("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return d5.p(new i9.c("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    try {
                        url = new URL(kVar.c(kVar.f18345n));
                    } catch (MalformedURLException unused) {
                        io.sentry.android.core.w0.d("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    kVar.l(httpURLConnection, (String) task5.getResult(), ((b9.a) task4.getResult()).f3092a);
                    return d5.q(httpURLConnection);
                } catch (IOException e7) {
                    return d5.p(new i9.c("Failed to open HTTP stream connection", e7));
                }
        }
    }

    @Override // com.logrocket.core.d0
    public void g(String str) {
        sc.h hVar = (sc.h) this.f2706b;
        String str2 = (String) this.f2707c;
        ha.d dVar = (ha.d) this.f2708d;
        hVar.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            eg.c0.t(MyApp.f6830c, null, null, new androidx.lifecycle.u0(hVar, str, str2, dVar, (Continuation) null, 14), 3);
        }
    }

    @Override // m5.b
    public Object i() {
        j5.a aVar = (j5.a) this.f2706b;
        e5.i iVar = (e5.i) this.f2707c;
        e5.h hVar = (e5.h) this.f2708d;
        l5.i iVar2 = (l5.i) aVar.f18262d;
        iVar2.getClass();
        b5.d dVar = iVar.f8643c;
        String str = hVar.f8635a;
        String str2 = iVar.f8641a;
        String w10 = ci.c.w("SQLiteEventStore");
        if (Log.isLoggable(w10, 3)) {
            Log.d(w10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) iVar2.n(new i(iVar2, hVar, iVar, 11))).getClass();
        aVar.f18259a.X(iVar, 1, false);
        return null;
    }

    public /* synthetic */ i(Runnable runnable, a0 a0Var, Runnable runnable2) {
        this.f2705a = 0;
        this.f2706b = runnable;
        this.f2708d = a0Var;
        this.f2707c = runnable2;
    }
}
