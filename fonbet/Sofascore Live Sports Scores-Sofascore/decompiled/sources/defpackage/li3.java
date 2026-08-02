package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class li3 implements Continuation, OnFailureListener, lqi, cu4, vh2, wn3, OnSuccessListener, yu4, klg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ li3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.wn3
    public void accept(Object obj) {
        b10 b10Var = (b10) this.b;
        ((edc) obj).b(b10Var.b, (scc) this.c, (m6c) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // defpackage.klg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        mlg mlgVar;
        qib qibVar;
        int i = this.a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        qib qibVar2 = qib.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i8 = 0;
        switch (i) {
            case 14:
                mlg mlgVar2 = (mlg) obj4;
                du0 du0Var = (du0) obj3;
                dn5 dn5Var = du0Var.c;
                String str = du0Var.a;
                jv0 jv0Var = (jv0) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = mlgVar2.h().compileStatement("PRAGMA page_size").simpleQueryForLong() * mlgVar2.h().compileStatement("PRAGMA page_count").simpleQueryForLong();
                eu0 eu0Var = mlgVar2.d;
                if (simpleQueryForLong >= eu0Var.a) {
                    mlgVar2.m(1L, qibVar2, str);
                    return -1L;
                }
                Long i9 = mlg.i(sQLiteDatabase, jv0Var);
                if (i9 != null) {
                    insert = i9.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jv0Var.a);
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(m7f.a(jv0Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jv0Var.b;
                    if (bArr != null) {
                        contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i10 = eu0Var.e;
                byte[] bArr2 = dn5Var.b;
                boolean z = bArr2.length <= i10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(du0Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(du0Var.e));
                contentValues2.put("payload_encoding", dn5Var.a.a);
                contentValues2.put("code", du0Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", du0Var.g);
                contentValues2.put("pseudonymous_id", du0Var.h);
                contentValues2.put("experiment_ids_clear_blob", du0Var.i);
                contentValues2.put("experiment_ids_encrypted_blob", du0Var.j);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i10);
                    for (int i11 = 1; i11 <= ceil; i11++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i11 - 1) * i10, Math.min(i11 * i10, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i11));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(du0Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(U3.i.X, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 15:
                mlg mlgVar3 = (mlg) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                jv0 jv0Var2 = (jv0) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i12 = cursor2.getInt(7) != 0 ? i7 : 0;
                    c40 c40Var = new c40();
                    c40Var.g = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        yhk.s("Null transportName");
                        return null;
                    }
                    c40Var.b = string;
                    c40Var.e = Long.valueOf(cursor2.getLong(i6));
                    c40Var.f = Long.valueOf(cursor2.getLong(3));
                    if (i12 != 0) {
                        String string2 = cursor2.getString(4);
                        c40Var.d = new dn5(string2 == null ? mlg.f : new kn5(string2), cursor2.getBlob(5));
                        mlgVar = mlgVar3;
                    } else {
                        String string3 = cursor2.getString(4);
                        kn5 kn5Var = string3 == null ? mlg.f : new kn5(string3);
                        Cursor query = mlgVar3.h().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i13 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i13 += blob.length;
                            }
                            byte[] bArr3 = new byte[i13];
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i14);
                                mlg mlgVar4 = mlgVar3;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, i15, bArr4.length);
                                    i15 += bArr4.length;
                                    i14++;
                                    query = cursor;
                                    mlgVar3 = mlgVar4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            mlgVar = mlgVar3;
                            query.close();
                            c40Var.d = new dn5(kn5Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c40Var.c = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        c40Var.h = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        c40Var.i = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        c40Var.j = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        c40Var.k = cursor2.getBlob(11);
                    }
                    arrayList.add(new su0(j, jv0Var2, c40Var.i()));
                    mlgVar3 = mlgVar;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                mlg mlgVar5 = (mlg) obj4;
                HashMap hashMap = (HashMap) obj3;
                g7h g7hVar = (g7h) obj2;
                ArrayList arrayList3 = (ArrayList) g7hVar.d;
                Cursor cursor3 = (Cursor) obj;
                mlgVar5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i16 = cursor3.getInt(1);
                    qib qibVar3 = qib.REASON_UNKNOWN;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            qibVar3 = qib.MESSAGE_TOO_OLD;
                        } else if (i16 == 2) {
                            qibVar = qibVar2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new rib(j2, qibVar));
                            i2 = 6;
                            i3 = 5;
                            i4 = 4;
                            i5 = 3;
                            i8 = 0;
                        } else if (i16 == i5) {
                            qibVar3 = qib.PAYLOAD_TOO_BIG;
                        } else if (i16 == i4) {
                            qibVar3 = qib.MAX_RETRIES_REACHED;
                        } else if (i16 == i3) {
                            qibVar3 = qib.INVALID_PAYLOD;
                        } else if (i16 == i2) {
                            qibVar3 = qib.SERVER_ERROR;
                        } else {
                            d7a.t(Integer.valueOf(i16), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    qibVar = qibVar3;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new rib(j22, qibVar));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i17 = uib.c;
                    new ArrayList();
                    arrayList3.add(new uib((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long time = mlgVar5.b.getTime();
                SQLiteDatabase h = mlgVar5.h();
                h.beginTransaction();
                try {
                    Cursor rawQuery = h.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        cij cijVar = new cij(rawQuery.getLong(0), time);
                        rawQuery.close();
                        h.setTransactionSuccessful();
                        h.endTransaction();
                        g7hVar.c = cijVar;
                        g7hVar.e = new zz8(new mfi(mlgVar5.h().compileStatement("PRAGMA page_size").simpleQueryForLong() * mlgVar5.h().compileStatement("PRAGMA page_count").simpleQueryForLong(), eu0.f.a));
                        g7hVar.b = (String) mlgVar5.e.get();
                        return new qx2((cij) g7hVar.c, Collections.unmodifiableList(arrayList3), (zz8) g7hVar.e, (String) g7hVar.b);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    h.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
        ggf ggfVar = (ggf) this.b;
        String str = (String) this.c;
        gu guVar = (gu) this.d;
        if (((fu) ggfVar.b) == ggf.c) {
            return;
        }
        fu f = ((iu) vffVar.get()).f(str, guVar);
        ggfVar.b = f;
        synchronized (ggfVar) {
            try {
                if (!((HashSet) ggfVar.a).isEmpty()) {
                    f.b((HashSet) ggfVar.a);
                    ggfVar.a = new HashSet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cu4
    public vvf c(int i, osj osjVar, int[] iArr) {
        wt4 wt4Var = (wt4) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        zu9 s = hv9.s();
        for (int i2 = 0; i2 < osjVar.a; i2++) {
            s.c(new au4(i, osjVar, i2, wt4Var, iArr[i2], str, str2));
        }
        return s.g();
    }

    @Override // defpackage.vh2
    public Object g(uh2 uh2Var) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 7:
                CoroutineContext coroutineContext = (CoroutineContext) obj3;
                nu3 nu3Var = (nu3) obj2;
                Function2 function2 = (Function2) obj;
                yp8 yp8Var = new yp8((yda) coroutineContext.get(uic.g), 6);
                e35 e35Var = e35.a;
                b1g b1gVar = uh2Var.c;
                if (b1gVar != null) {
                    b1gVar.addListener(yp8Var, e35Var);
                }
                return xw3.L(s9a.c(coroutineContext), null, nu3Var, new zi7(function2, uh2Var, (rq3) null, 23), 1);
            default:
                Executor executor = (Executor) obj3;
                String str = (String) obj2;
                Function0 function0 = (Function0) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                edb edbVar = new edb(atomicBoolean, 0);
                e35 e35Var2 = e35.a;
                b1g b1gVar2 = uh2Var.c;
                if (b1gVar2 != null) {
                    b1gVar2.addListener(edbVar, e35Var2);
                }
                executor.execute(new fdb(atomicBoolean, uh2Var, function0, 0));
                return str;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$3((CancellationSignal) this.b, (Executor) this.c, (oy3) this.d, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 10:
                mjc mjcVar = (mjc) obj4;
                imf imfVar = mjcVar.a;
                lyf lyfVar = (lyf) mjc.h.get((d48) obj2);
                hi2 a = mjcVar.a((lw9) obj3, (String) obj);
                a.n(lyfVar);
                imfVar.h(((ii2) a.build()).toByteArray());
                break;
            case 11:
                mjc mjcVar2 = (mjc) obj4;
                imf imfVar2 = mjcVar2.a;
                o45 o45Var = (o45) mjc.i.get((c48) obj2);
                hi2 a2 = mjcVar2.a((lw9) obj3, (String) obj);
                a2.j(o45Var);
                imfVar2.h(((ii2) a2.build()).toByteArray());
                break;
            default:
                g7h g7hVar = (g7h) obj4;
                pw3 pw3Var = (pw3) obj2;
                try {
                    fi3 fi3Var = (fi3) ((Task) obj3).getResult();
                    if (fi3Var != null) {
                        ((Executor) g7hVar.d).execute(new z5g(pw3Var, ((y3g) g7hVar.c).q(fi3Var), 1));
                        break;
                    }
                } catch (g58 unused) {
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        fi3 fi3Var;
        int i = this.a;
        URL url = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ni3 ni3Var = (ni3) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                if (!task2.isSuccessful()) {
                    return Tasks.forException(new f58("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException()));
                }
                if (!task3.isSuccessful()) {
                    return Tasks.forException(new f58("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException()));
                }
                try {
                    try {
                        url = new URL(ni3Var.c(ni3Var.m));
                    } catch (IOException e) {
                        return Tasks.forException(new f58("Failed to open HTTP stream connection", e));
                    }
                } catch (MalformedURLException unused) {
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                ni3Var.i(httpURLConnection, (String) task3.getResult(), ((mu0) task2.getResult()).a);
                return Tasks.forResult(httpURLConnection);
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            default:
                e58 e58Var = (e58) obj3;
                Task task4 = (Task) obj2;
                Task task5 = (Task) obj;
                if (!task4.isSuccessful() || task4.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                fi3 fi3Var2 = (fi3) task4.getResult();
                return (task5.isSuccessful() && (fi3Var = (fi3) task5.getResult()) != null && fi3Var2.c.equals(fi3Var.c)) ? Tasks.forResult(Boolean.FALSE) : e58Var.e.d(fi3Var2).continueWith(e58Var.c, new d58(e58Var));
        }
    }

    @Override // defpackage.lqi
    public Object v() {
        is4 is4Var = (is4) this.b;
        jv0 jv0Var = (jv0) this.c;
        du0 du0Var = (du0) this.d;
        mlg mlgVar = is4Var.d;
        mlgVar.getClass();
        i7f i7fVar = jv0Var.c;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(i7fVar);
        }
        ((Long) mlgVar.j(new li3(14, mlgVar, du0Var, jv0Var))).getClass();
        is4Var.a.J(jv0Var, 1, false);
        return null;
    }
}
