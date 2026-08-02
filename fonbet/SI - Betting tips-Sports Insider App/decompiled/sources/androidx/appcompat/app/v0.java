package androidx.appcompat.app;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.q4;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.d1;
import io.sentry.i1;
import io.sentry.k1;
import io.sentry.k4;
import io.sentry.l6;
import io.sentry.m6;
import io.sentry.n6;
import io.sentry.p1;
import io.sentry.p3;
import io.sentry.p6;
import io.sentry.q3;
import io.sentry.q6;
import io.sentry.r3;
import io.sentry.s3;
import io.sentry.t2;
import io.sentry.t4;
import io.sentry.w3;
import io.sentry.y3;
import io.sentry.z0;
import io.sentry.z4;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.Adler32;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class v0 implements OnCompleteListener, y7.c, g5.b, b3.a, z0, Socket {

    /* renamed from: e, reason: collision with root package name */
    public static v0 f362e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f363a;

    /* renamed from: b, reason: collision with root package name */
    public Object f364b;

    /* renamed from: c, reason: collision with root package name */
    public Object f365c;

    /* renamed from: d, reason: collision with root package name */
    public Object f366d;

    public /* synthetic */ v0(int i5, boolean z5) {
        this.f363a = i5;
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z5) {
        j1.v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (j1.v[]) editable.getSpans(selectionStart, selectionEnd, j1.v.class)) != null && vVarArr.length > 0) {
                for (j1.v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.sentry.z0
    public void A(String str) {
        Q(null).A(str);
    }

    @Override // io.sentry.z0
    public void B(v0 v0Var) {
        Q(null).B(v0Var);
    }

    @Override // io.sentry.z0
    public d1 C() {
        d1 C = ((z0) this.f366d).C();
        if (!(C instanceof t2)) {
            return C;
        }
        d1 C2 = ((z0) this.f365c).C();
        return !(C2 instanceof t2) ? C2 : ((z0) this.f364b).C();
    }

    @Override // io.sentry.z0
    public Map D() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((z0) this.f364b).D());
        concurrentHashMap.putAll(((z0) this.f365c).D());
        concurrentHashMap.putAll(((z0) this.f366d).D());
        return concurrentHashMap;
    }

    @Override // io.sentry.z0
    public List E() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((z0) this.f364b).E());
        copyOnWriteArrayList.addAll(((z0) this.f365c).E());
        copyOnWriteArrayList.addAll(((z0) this.f366d).E());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.z0
    public List F() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((z0) this.f364b).F());
        copyOnWriteArrayList.addAll(((z0) this.f365c).F());
        copyOnWriteArrayList.addAll(((z0) this.f366d).F());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.z0
    public void G(t4 t4Var) {
        ((z0) this.f364b).G(t4Var);
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.c H() {
        z0 z0Var = (z0) this.f364b;
        return new io.sentry.i(z0Var.H(), ((z0) this.f365c).H(), ((z0) this.f366d).H(), z0Var.m().getDefaultScopeType());
    }

    @Override // io.sentry.z0
    public v0 I(p3 p3Var) {
        return Q(null).I(p3Var);
    }

    @Override // io.sentry.z0
    public String J() {
        String J = ((z0) this.f366d).J();
        if (J != null) {
            return J;
        }
        String J2 = ((z0) this.f365c).J();
        return J2 != null ? J2 : ((z0) this.f364b).J();
    }

    @Override // io.sentry.z0
    public void K(r3 r3Var) {
        Q(null).K(r3Var);
    }

    @Override // io.sentry.z0
    public void L(io.sentry.protocol.v vVar) {
        ((z0) this.f364b).L(vVar);
        ((z0) this.f365c).L(vVar);
        ((z0) this.f366d).L(vVar);
    }

    @Override // io.sentry.z0
    public void M(k1 k1Var) {
        Q(null).M(k1Var);
    }

    @Override // io.sentry.z0
    public List N() {
        List N = ((z0) this.f366d).N();
        if (!N.isEmpty()) {
            return N;
        }
        List N2 = ((z0) this.f365c).N();
        return !N2.isEmpty() ? N2 : ((z0) this.f364b).N();
    }

    @Override // io.sentry.z0
    public List O() {
        return f3.x.D0((CopyOnWriteArrayList) E());
    }

    @Override // io.sentry.z0
    public String P() {
        String P = ((z0) this.f366d).P();
        if (P != null) {
            return P;
        }
        String P2 = ((z0) this.f365c).P();
        return P2 != null ? P2 : ((z0) this.f364b).P();
    }

    public z0 Q(w3 w3Var) {
        z0 z0Var = (z0) this.f365c;
        z0 z0Var2 = (z0) this.f366d;
        z0 z0Var3 = (z0) this.f364b;
        if (w3Var != null) {
            int i5 = io.sentry.j.f16535a[w3Var.ordinal()];
            if (i5 == 1) {
                return z0Var2;
            }
            if (i5 == 2) {
                return z0Var;
            }
            if (i5 == 3) {
                return z0Var3;
            }
            if (i5 == 4) {
                return this;
            }
        }
        int i10 = io.sentry.j.f16535a[z0Var3.m().getDefaultScopeType().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? z0Var2 : z0Var3 : z0Var : z0Var2;
    }

    public String R() {
        Boolean bool = (Boolean) this.f366d;
        String str = (bool == null || !bool.booleanValue()) ? "00" : "01";
        return "00-" + ((io.sentry.protocol.v) this.f364b) + "-" + ((p6) this.f365c) + "-" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean S() {
        com.google.firebase.messaging.s sVar;
        IconCompat iconCompat;
        if (((h9.c) this.f366d).l("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f365c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String u10 = ((h9.c) this.f366d).u("gcm.n.image");
        if (!TextUtils.isEmpty(u10)) {
            try {
                sVar = new com.google.firebase.messaging.s(new URL(u10));
            } catch (MalformedURLException unused) {
                io.sentry.android.core.w0.m("FirebaseMessaging", "Not downloading image, bad URL: " + u10);
            }
            if (sVar != null) {
                ExecutorService executorService = (ExecutorService) this.f364b;
                w7.g gVar = new w7.g();
                sVar.f6170b = executorService.submit(new t(5, sVar, gVar));
                sVar.f6171c = gVar.f24979a;
            }
            com.google.firebase.messaging.l a7 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.f365c, (h9.c) this.f366d);
            c0.w wVar = (c0.w) a7.f6156a;
            if (sVar != null) {
                try {
                    w7.m mVar = sVar.f6171c;
                    g6.v.h(mVar);
                    Bitmap bitmap = (Bitmap) d5.b(mVar, 5L, TimeUnit.SECONDS);
                    wVar.d(bitmap);
                    c0.t tVar = new c0.t();
                    if (bitmap == null) {
                        iconCompat = null;
                    } else {
                        iconCompat = new IconCompat(1);
                        iconCompat.f1270b = bitmap;
                    }
                    tVar.f3303b = iconCompat;
                    tVar.f3304c = null;
                    tVar.f3305d = true;
                    wVar.e(tVar);
                } catch (InterruptedException unused2) {
                    io.sentry.android.core.w0.m("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    sVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e7) {
                    io.sentry.android.core.w0.m("FirebaseMessaging", "Failed to download image: " + e7.getCause());
                } catch (TimeoutException unused3) {
                    io.sentry.android.core.w0.m("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    sVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f365c).getSystemService("notification")).notify((String) a7.f6157b, 0, ((c0.w) a7.f6156a).a());
            return true;
        }
        sVar = null;
        if (sVar != null) {
        }
        com.google.firebase.messaging.l a72 = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.f365c, (h9.c) this.f366d);
        c0.w wVar2 = (c0.w) a72.f6156a;
        if (sVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f365c).getSystemService("notification")).notify((String) a72.f6157b, 0, ((c0.w) a72.f6156a).a());
        return true;
    }

    public boolean T(CharSequence charSequence, int i5, int i10, j1.u uVar) {
        if ((uVar.f18239c & 3) == 0) {
            j1.g gVar = (j1.g) this.f366d;
            k1.a b10 = uVar.b();
            int a7 = b10.a(8);
            if (a7 != 0) {
                ((ByteBuffer) b10.f1362d).getShort(a7 + b10.f1359a);
            }
            j1.d dVar = (j1.d) gVar;
            dVar.getClass();
            ThreadLocal threadLocal = j1.d.f18195b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i5 < i10) {
                sb2.append(charSequence.charAt(i5));
                i5++;
            }
            TextPaint textPaint = dVar.f18196a;
            String sb3 = sb2.toString();
            int i11 = g0.e.f9680a;
            boolean hasGlyph = textPaint.hasGlyph(sb3);
            int i12 = uVar.f18239c & 4;
            uVar.f18239c = hasGlyph ? i12 | 2 : i12 | 1;
        }
        return (uVar.f18239c & 3) == 2;
    }

    public Object U(String sql, Function0 operation) {
        i1 i1Var;
        io.sentry.t tVar;
        Object obj;
        n6 v5;
        io.sentry.t tVar2 = (io.sentry.t) this.f366d;
        String str = (String) this.f365c;
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(operation, "operation");
        b1 b1Var = (b1) this.f364b;
        k4 a7 = b1Var.m().getDateProvider().a();
        try {
            Object invoke = operation.invoke();
            if (invoke instanceof CrossProcessCursor) {
                return new io.sentry.android.sqlite.c((CrossProcessCursor) invoke, this, sql);
            }
            i1 i5 = b1Var.i();
            if (i5 != null) {
                obj = invoke;
                i1Var = i5.k("db.sql.query", sql, a7, p1.SENTRY);
            } else {
                obj = invoke;
                i1Var = null;
            }
            if (i1Var != null) {
                try {
                    v5 = i1Var.v();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        i1 i10 = b1Var.i();
                        if (i10 != null) {
                            tVar = tVar2;
                            try {
                                i1Var = i10.k("db.sql.query", sql, a7, p1.SENTRY);
                            } catch (Throwable th3) {
                                th = th3;
                                if (i1Var != null) {
                                    boolean c2 = b1Var.m().getThreadChecker().c();
                                    i1Var.m(Boolean.valueOf(c2), "blocked_main_thread");
                                    if (c2) {
                                        i1Var.m(tVar.b(), "call_stack");
                                    }
                                    if (str != null) {
                                        i1Var.m("sqlite", "db.system");
                                        i1Var.m(str, "db.name");
                                    } else {
                                        i1Var.m("in-memory", "db.system");
                                    }
                                    i1Var.l();
                                }
                                throw th;
                            }
                        } else {
                            tVar = tVar2;
                            i1Var = null;
                        }
                        n6 v10 = i1Var != null ? i1Var.v() : null;
                        if (v10 != null) {
                            v10.f16675i = "auto.db.sqlite";
                        }
                        if (i1Var != null) {
                            i1Var.a(q6.INTERNAL_ERROR);
                        }
                        if (i1Var != null) {
                            i1Var.g(th);
                        }
                        throw th;
                    } catch (Throwable th4) {
                        th = th4;
                        tVar = tVar2;
                    }
                }
            } else {
                v5 = null;
            }
            if (v5 != null) {
                v5.f16675i = "auto.db.sqlite";
            }
            if (i1Var != null) {
                i1Var.a(q6.OK);
            }
            if (i1Var != null) {
                boolean c8 = b1Var.m().getThreadChecker().c();
                i1Var.m(Boolean.valueOf(c8), "blocked_main_thread");
                if (c8) {
                    i1Var.m(tVar2.b(), "call_stack");
                }
                if (str != null) {
                    i1Var.m("sqlite", "db.system");
                    i1Var.m(str, "db.name");
                } else {
                    i1Var.m("in-memory", "db.system");
                }
                i1Var.l();
            }
            return obj;
        } catch (Throwable th5) {
            th = th5;
            i1Var = null;
        }
    }

    public void V(androidx.lifecycle.w wVar) {
        androidx.lifecycle.i1 i1Var = (androidx.lifecycle.i1) this.f366d;
        if (i1Var != null) {
            i1Var.run();
        }
        androidx.lifecycle.i1 i1Var2 = new androidx.lifecycle.i1((androidx.lifecycle.g0) this.f364b, wVar);
        this.f366d = i1Var2;
        ((Handler) this.f365c).postAtFrontOfQueue(i1Var2);
    }

    public Object W(CharSequence charSequence, int i5, int i10, int i11, boolean z5, j1.n nVar) {
        int i12;
        char c2;
        j1.o oVar = new j1.o((j1.r) ((com.google.firebase.messaging.x) this.f365c).f6184c);
        int codePointAt = Character.codePointAt(charSequence, i5);
        int i13 = 0;
        boolean z7 = true;
        int i14 = i5;
        loop0: while (true) {
            i12 = i14;
            while (i14 < i10 && i13 < i11 && z7) {
                SparseArray sparseArray = oVar.f18217c.f18230a;
                j1.r rVar = sparseArray == null ? null : (j1.r) sparseArray.get(codePointAt);
                if (oVar.f18215a == 2) {
                    if (rVar != null) {
                        oVar.f18217c = rVar;
                        oVar.f18220f++;
                    } else {
                        if (codePointAt == 65038) {
                            oVar.a();
                        } else if (codePointAt != 65039) {
                            j1.r rVar2 = oVar.f18217c;
                            if (rVar2.f18231b != null) {
                                if (oVar.f18220f != 1) {
                                    oVar.f18218d = rVar2;
                                    oVar.a();
                                } else if (oVar.b()) {
                                    oVar.f18218d = oVar.f18217c;
                                    oVar.a();
                                } else {
                                    oVar.a();
                                }
                                c2 = 3;
                            } else {
                                oVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (rVar == null) {
                    oVar.a();
                    c2 = 1;
                } else {
                    oVar.f18215a = 2;
                    oVar.f18217c = rVar;
                    oVar.f18220f = 1;
                    c2 = 2;
                }
                oVar.f18219e = codePointAt;
                if (c2 == 1) {
                    i14 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (i14 < i10) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i14;
                    if (charCount < i10) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i14 = charCount;
                } else if (c2 == 3) {
                    if (z5 || !T(charSequence, i12, i14, oVar.f18218d.f18231b)) {
                        z7 = nVar.a(charSequence, i12, i14, oVar.f18218d.f18231b);
                        i13++;
                    }
                }
            }
        }
        if (oVar.f18215a == 2 && oVar.f18217c.f18231b != null && ((oVar.f18220f > 1 || oVar.b()) && i13 < i11 && z7 && (z5 || !T(charSequence, i12, i14, oVar.f18217c.f18231b)))) {
            nVar.a(charSequence, i12, i14, oVar.f18217c.f18231b);
        }
        return nVar.b();
    }

    public void X(e5.i iVar, int i5, boolean z5) {
        char c2;
        k5.a aVar = (k5.a) this.f366d;
        Context context = (Context) this.f364b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f8641a;
        String str2 = iVar.f8641a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        b5.d dVar = iVar.f8643c;
        adler32.update(allocate.putInt(o5.a.a(dVar)).array());
        byte[] bArr = iVar.f8642b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z5) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i5) {
                        ci.c.m(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((l5.i) ((l5.d) this.f365c)).c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(o5.a.a(dVar))});
        try {
            Cursor cursor = rawQuery;
            Long valueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i5));
            Set set = ((k5.b) aVar.f18810b.get(dVar)).f18813c;
            if (set.contains(k5.c.f18814a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(k5.c.f18816c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(k5.c.f18815b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i5);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", o5.a.a(dVar));
            if (bArr != null) {
                c2 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c2 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i5));
            Integer valueOf4 = Integer.valueOf(i5);
            Object[] objArr = new Object[5];
            objArr[c2] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String w10 = ci.c.w("JobInfoScheduler");
            if (Log.isLoggable(w10, 3)) {
                Log.d(w10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void Y(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f364b = str;
    }

    public void Z(HashMap hashMap, HashMap hashMap2, HashSet hashSet, long j) {
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            Object obj = (com.logrocket.core.graphics.o) entry.getValue();
            hashSet3.add(num);
            if (!((HashSet) this.f365c).contains(num)) {
                b(obj, 1, j, hashSet2);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            Object obj2 = (String) entry2.getValue();
            hashSet3.add(num2);
            if (!((HashSet) this.f365c).contains(num2)) {
                b(obj2, 2, j, hashSet2);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashSet4.add(Integer.valueOf(str.hashCode()));
            if (!((HashSet) this.f366d).contains(Integer.valueOf(str.hashCode()))) {
                b(str, 2, j, hashSet2);
            }
        }
        if (!hashSet2.isEmpty()) {
            v9.d dVar = (v9.d) this.f364b;
            ArrayList arrayList = new ArrayList(hashSet2);
            if (!dVar.j.get()) {
                bh.d r5 = bh.e.r();
                r5.d();
                bh.e.q((bh.e) r5.f6816b, arrayList);
                r5.d();
                bh.e.p((bh.e) r5.f6816b, 0.0d);
                dVar.f24473a.b(16, r5, null, false, Long.valueOf(j));
            }
        }
        this.f365c = hashSet3;
        this.f366d = hashSet4;
    }

    @Override // y7.c
    public Object a() {
        return new com.google.android.play.core.appupdate.e((com.google.android.play.core.appupdate.k) ((y7.c) this.f364b).a(), (com.google.android.play.core.appupdate.c) ((y7.c) this.f365c).a(), ((b2.e) ((h9.c) this.f366d).f10430b).f2968a);
    }

    public void a0(Object obj, String str) {
        v0 v0Var = new v0(26, false);
        ((v0) this.f366d).f366d = v0Var;
        this.f366d = v0Var;
        v0Var.f365c = obj;
        v0Var.f364b = str;
    }

    public void b(Object obj, int i5, long j, HashSet hashSet) {
        ArrayList arrayList;
        v9.d dVar = (v9.d) this.f364b;
        dVar.getClass();
        try {
            synchronized (dVar.f24489s) {
                dVar.c(12, i5, j, obj);
                arrayList = dVar.a(i5, 12, j, obj);
            }
        } catch (Exception e7) {
            dVar.f24482k.e("Error while observing element visible filter event", e7);
            arrayList = new ArrayList();
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        hashSet.addAll(arrayList);
    }

    @Override // io.sentry.z0
    public void c(io.sentry.e eVar) {
        Q(null).c(eVar);
    }

    @Override // okio.Socket
    public void cancel() {
        ((Socket) this.f364b).cancel();
    }

    @Override // io.sentry.z0
    public void clear() {
        Q(null).clear();
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m0clone() {
        switch (this.f363a) {
            case 4:
                v0 v0Var = new v0(((com.google.android.gms.internal.measurement.b) this.f364b).clone());
                Iterator it = ((ArrayList) this.f366d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) v0Var.f366d).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return v0Var;
            case 16:
                return clone();
            default:
                return super.clone();
        }
    }

    public e5.i d() {
        String str = ((String) this.f364b) == null ? " backendName" : "";
        if (((b5.d) this.f366d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new e5.i((String) this.f364b, (byte[]) this.f365c, (b5.d) this.f366d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // io.sentry.z0
    public void f(String str, String str2) {
        Q(null).f(str, str2);
    }

    @Override // io.sentry.z0
    public void g(Throwable th2, m6 m6Var, String str) {
        ((z0) this.f364b).g(th2, m6Var, str);
    }

    @Override // ff.a
    public Object get() {
        switch (this.f363a) {
            case 10:
                int i5 = 1;
                return new e5.r(new m8.a(i5), new m7.b(i5), (j5.b) ((c4.d) this.f364b).get(), (k5.h) ((q4) this.f365c).get(), (com.google.firebase.messaging.x) ((com.google.firebase.messaging.x) this.f366d).get());
            default:
                return new v0((Context) ((ff.a) this.f364b).get(), (l5.d) ((ff.a) this.f365c).get(), (k5.a) ((io.sentry.hints.j) this.f366d).get(), 25);
        }
    }

    @Override // io.sentry.z0
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((z0) this.f364b).getExtras());
        concurrentHashMap.putAll(((z0) this.f365c).getExtras());
        concurrentHashMap.putAll(((z0) this.f366d).getExtras());
        return concurrentHashMap;
    }

    @Override // b3.a
    public View getRoot() {
        return (FrameLayout) this.f364b;
    }

    @Override // okio.Socket
    public Sink getSink() {
        return (BufferedSink) this.f366d;
    }

    @Override // okio.Socket
    public Source getSource() {
        return (BufferedSource) this.f365c;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.i0 getUser() {
        io.sentry.protocol.i0 user = ((z0) this.f366d).getUser();
        if (user != null) {
            return user;
        }
        io.sentry.protocol.i0 user2 = ((z0) this.f365c).getUser();
        return user2 != null ? user2 : ((z0) this.f364b).getUser();
    }

    @Override // io.sentry.z0
    public void h(io.sentry.e eVar, io.sentry.h0 h0Var) {
        Q(null).h(eVar, h0Var);
    }

    @Override // io.sentry.z0
    public i1 i() {
        i1 i5 = ((z0) this.f366d).i();
        if (i5 != null) {
            return i5;
        }
        i1 i10 = ((z0) this.f365c).i();
        return i10 != null ? i10 : ((z0) this.f364b).i();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.h j() {
        return u().j();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.v k() {
        io.sentry.protocol.v k6 = ((z0) this.f366d).k();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        if (!vVar.equals(k6)) {
            return k6;
        }
        io.sentry.protocol.v k9 = ((z0) this.f365c).k();
        return !vVar.equals(k9) ? k9 : ((z0) this.f364b).k();
    }

    @Override // io.sentry.z0
    public void l(io.sentry.protocol.v vVar) {
        Q(null).l(vVar);
    }

    @Override // io.sentry.z0
    public b6 m() {
        return ((z0) this.f364b).m();
    }

    @Override // io.sentry.z0
    public k1 n() {
        k1 n9 = ((z0) this.f366d).n();
        if (n9 != null) {
            return n9;
        }
        k1 n10 = ((z0) this.f365c).n();
        return n10 != null ? n10 : ((z0) this.f364b).n();
    }

    @Override // io.sentry.z0
    public void o(String str) {
        Q(null).o(str);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        b6.b bVar = (b6.b) this.f364b;
        String str = (String) this.f365c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f366d;
        synchronized (bVar.f3034a) {
            bVar.f3034a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // io.sentry.z0
    public l6 p() {
        return Q(null).p();
    }

    @Override // io.sentry.z0
    public x5.h q() {
        return Q(null).q();
    }

    @Override // io.sentry.z0
    public void r(b5 b5Var) {
        Q(null).r(b5Var);
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.p s() {
        io.sentry.protocol.p s8 = ((z0) this.f366d).s();
        if (s8 != null) {
            return s8;
        }
        io.sentry.protocol.p s10 = ((z0) this.f365c).s();
        return s10 != null ? s10 : ((z0) this.f364b).s();
    }

    @Override // io.sentry.z0
    public void t() {
        Q(null).t();
    }

    public String toString() {
        String str = "";
        switch (this.f363a) {
            case 5:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f364b);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.j jVar = ((com.google.android.gms.internal.play_billing.j) this.f365c).f5485b;
                while (jVar != null) {
                    Object obj = jVar.f5484a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    jVar = jVar.f5485b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f364b);
                sb3.append('{');
                l1.a aVar = (l1.a) ((l1.a) this.f365c).f19315c;
                while (aVar != null) {
                    Object obj2 = aVar.f19314b;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    aVar = (l1.a) aVar.f19315c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return "ReplayNetworkRequestOrResponse{size=" + ((Long) this.f364b) + ", body=" + ((io.sentry.util.network.b) this.f365c) + ", headers=" + ((LinkedHashMap) this.f366d) + '}';
            case C0122e9.H /* 27 */:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f364b);
                sb4.append('{');
                v0 v0Var = (v0) ((v0) this.f365c).f366d;
                while (v0Var != null) {
                    Object obj3 = v0Var.f365c;
                    sb4.append(str);
                    String str2 = (String) v0Var.f364b;
                    if (str2 != null) {
                        sb4.append(str2);
                        sb4.append('=');
                    }
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r3.length() - 1);
                    }
                    v0Var = (v0) v0Var.f366d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    @Override // io.sentry.z0
    public io.sentry.featureflags.b u() {
        b6 m6 = ((z0) this.f364b).m();
        io.sentry.featureflags.b u10 = ((z0) this.f364b).u();
        io.sentry.featureflags.b u11 = ((z0) this.f365c).u();
        io.sentry.featureflags.b u12 = ((z0) this.f366d).u();
        io.sentry.featureflags.c cVar = io.sentry.featureflags.c.f16417a;
        int maxFeatureFlags = m6.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.a aVar = u10 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) u10 : null;
            io.sentry.featureflags.a aVar2 = u11 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) u11 : null;
            io.sentry.featureflags.a aVar3 = u12 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) u12 : null;
            CopyOnWriteArrayList copyOnWriteArrayList = aVar == null ? null : aVar.f16416a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.f16416a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = aVar3 != null ? aVar3.f16416a : null;
            int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
            int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
            int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i5 = size - 1;
                int i10 = size2 - 1;
                int i11 = size3 - 1;
                if (copyOnWriteArrayList != null && i5 >= 0 && copyOnWriteArrayList.get(i5) != null) {
                    throw new ClassCastException();
                }
                if (copyOnWriteArrayList2 != null && i10 >= 0 && copyOnWriteArrayList2.get(i10) != null) {
                    throw new ClassCastException();
                }
                if (copyOnWriteArrayList3 != null && i11 >= 0 && copyOnWriteArrayList3.get(i11) != null) {
                    throw new ClassCastException();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                linkedHashMap.size();
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList(arrayList);
                io.sentry.featureflags.a aVar4 = new io.sentry.featureflags.a();
                new io.sentry.util.a();
                aVar4.f16416a = copyOnWriteArrayList4;
                return aVar4;
            }
        }
        return cVar;
    }

    @Override // io.sentry.z0
    public l6 v() {
        l6 v5 = ((z0) this.f366d).v();
        if (v5 != null) {
            return v5;
        }
        l6 v10 = ((z0) this.f365c).v();
        return v10 != null ? v10 : ((z0) this.f364b).v();
    }

    @Override // io.sentry.z0
    public Queue w() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((z0) this.f364b).w());
        arrayList.addAll(((z0) this.f365c).w());
        z0 z0Var = (z0) this.f366d;
        arrayList.addAll(z0Var.w());
        Collections.sort(arrayList);
        Queue a7 = s3.a(z0Var.m().getMaxBreadcrumbs());
        a7.addAll(arrayList);
        return a7;
    }

    @Override // io.sentry.z0
    public b5 x() {
        b5 x10 = ((z0) this.f366d).x();
        if (x10 != null) {
            return x10;
        }
        b5 x11 = ((z0) this.f365c).x();
        return x11 != null ? x11 : ((z0) this.f364b).x();
    }

    @Override // io.sentry.z0
    public v0 y() {
        return Q(null).y();
    }

    @Override // io.sentry.z0
    public l6 z(q3 q3Var) {
        return Q(null).z(q3Var);
    }

    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, int i5) {
        this.f363a = i5;
        this.f364b = obj;
        this.f365c = obj2;
        this.f366d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(int i5) {
        this(new io.sentry.protocol.v(), new p6(), (io.sentry.c) null);
        this.f363a = i5;
        switch (i5) {
            case 17:
                break;
            default:
                this.f364b = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f365c = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f366d = new ArrayList();
                break;
        }
    }

    @Override // io.sentry.z0
    public z0 clone() {
        return new v0((z0) this.f364b, ((z0) this.f365c).clone(), ((z0) this.f366d).clone(), 16);
    }

    public v0(v9.d dVar) {
        this.f363a = 8;
        this.f365c = new HashSet();
        this.f366d = new HashSet();
        this.f364b = dVar;
    }

    public v0(String str, int i5) {
        this.f363a = i5;
        switch (i5) {
            case 11:
                l1.a aVar = new l1.a(13, false);
                this.f365c = aVar;
                this.f366d = aVar;
                this.f364b = str;
                break;
            case 20:
                y3 scopes = y3.f17255a;
                Intrinsics.checkNotNullExpressionValue(scopes, "getInstance(...)");
                Intrinsics.checkNotNullParameter(scopes, "scopes");
                this.f364b = scopes;
                this.f365c = str;
                this.f366d = new io.sentry.t(scopes.m(), 2);
                z4.d().a("SQLite");
                break;
            case C0122e9.H /* 27 */:
                v0 v0Var = new v0(26, false);
                this.f365c = v0Var;
                this.f366d = v0Var;
                this.f364b = str;
                break;
            default:
                com.google.android.gms.internal.play_billing.j jVar = new com.google.android.gms.internal.play_billing.j();
                this.f365c = jVar;
                this.f366d = jVar;
                this.f364b = str;
                break;
        }
    }

    public v0(com.google.android.gms.internal.measurement.b bVar) {
        this.f363a = 4;
        this.f364b = bVar;
        this.f365c = bVar.clone();
        this.f366d = new ArrayList();
    }

    public v0(androidx.lifecycle.h0 provider) {
        this.f363a = 1;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f364b = new androidx.lifecycle.g0(provider);
        this.f365c = new Handler(Looper.getMainLooper());
    }

    public v0(Socket socket) {
        this.f363a = 29;
        this.f364b = socket;
        this.f365c = Okio.buffer(socket.getSource());
        this.f366d = Okio.buffer(socket.getSink());
    }

    public v0(com.google.firebase.messaging.x _koin) {
        this.f363a = 15;
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.f364b = _koin;
        this.f365c = new ConcurrentHashMap();
        this.f366d = new ConcurrentHashMap();
    }

    public v0(FirebaseMessagingService firebaseMessagingService, h9.c cVar, ExecutorService executorService) {
        this.f363a = 7;
        this.f364b = executorService;
        this.f365c = firebaseMessagingService;
        this.f366d = cVar;
    }

    public v0(Context context, LocationManager locationManager) {
        this.f363a = 0;
        this.f366d = new u0();
        this.f364b = context;
        this.f365c = locationManager;
    }

    public v0(io.sentry.protocol.v vVar, p6 p6Var, io.sentry.c cVar) {
        this.f363a = 17;
        this.f364b = vVar;
        this.f365c = p6Var;
        this.f366d = com.google.android.gms.internal.measurement.y3.i(cVar, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(v0 v0Var) {
        this((io.sentry.protocol.v) v0Var.f364b, (p6) v0Var.f365c, (io.sentry.c) v0Var.f366d);
        this.f363a = 17;
    }

    public v0(com.google.firebase.messaging.x xVar, io.sentry.hints.j jVar, j1.d dVar, Set set) {
        this.f363a = 23;
        this.f364b = jVar;
        this.f365c = xVar;
        this.f366d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            W(str, 0, str.length(), 1, true, new com.android.billingclient.api.a(str, 8));
        }
    }
}
