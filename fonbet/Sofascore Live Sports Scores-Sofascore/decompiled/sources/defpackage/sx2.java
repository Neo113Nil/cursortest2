package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import androidx.media3.common.b;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.IdentifierInfo;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.ads.interactivemedia.v3.impl.data.TimeUpdateData;
import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzat;
import com.google.android.gms.ads.nonagon.signalgeneration.zzw;
import com.google.android.gms.ads.nonagon.signalgeneration.zzx;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.cast.internal.zzas;
import com.google.android.gms.cast.zzq;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzczr;
import com.google.android.gms.internal.ads.zzdbu;
import com.google.android.gms.internal.ads.zzdcz;
import com.google.android.gms.internal.ads.zzeay;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.results.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
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
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class sx2 implements ii9, ooh, w1g, r0f, et9, lli, z7p, zzas, MediationAdLoadCallback, zzw {
    public static volatile sx2 d;
    public static final Object e = new Object();
    public static final r5a f;
    public static final r5a g;
    public Object a;
    public Object b;
    public Object c;

    static {
        long j = C.TIME_UNSET;
        f = new r5a(j, 2, false);
        g = new r5a(j, 3, false);
    }

    public sx2(String str, Function0 function0, Function1 function1) {
        KType kType;
        function0.getClass();
        this.a = function0;
        this.b = function1;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(tx2.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KTypeParameter typeParameter = fufVar.typeParameter(fufVar.getOrCreateKotlinClass(sx2.class), "PluginConfigT", KVariance.INVARIANT, false);
            fufVar.setUpperBounds(typeParameter, Collections.singletonList(duf.b(Object.class)));
            kType = duf.c(tx2.class, companion.invariant(fufVar.typeOf(typeParameter, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            kType = null;
        }
        this.c = new pm0(str, new h5k(orCreateKotlinClass, kType));
    }

    public static so4 d(q5c q5cVar) {
        up4 up4Var = new up4();
        up4Var.b = null;
        Uri uri = q5cVar.b;
        l2a l2aVar = new l2a(uri == null ? null : uri.toString(), up4Var);
        cck it = q5cVar.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) l2aVar.d)) {
                ((HashMap) l2aVar.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = yc2.a;
        it7 it7Var = new it7(21);
        UUID uuid2 = q5cVar.a;
        uuid2.getClass();
        boolean z = q5cVar.d;
        int[] O = jaa.O(q5cVar.e);
        for (int i : O) {
            boolean z2 = true;
            if (i != 2 && i != 1) {
                z2 = false;
            }
            z1a.s(z2);
        }
        so4 so4Var = new so4(uuid2, l2aVar, hashMap, (int[]) O.clone(), z, it7Var);
        byte[] bArr = q5cVar.f;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        z1a.E(so4Var.l.isEmpty());
        so4Var.u = copyOf;
        return so4Var;
    }

    public static String m(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append(U3.j.b);
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append(U3.j.c);
            sb.append((String) entry2.getKey());
            sb.append(U3.j.b);
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), C.UTF8_NAME) : "");
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return lnb.o(str, "?", sb2);
        }
        if (!str.endsWith(U3.j.c)) {
            sb2 = U3.j.c.concat(sb2);
        }
        return str.concat(sb2);
    }

    public static sx2 x(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new sx2(context, 1);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public r5e A() {
        r5e r5eVar = (r5e) this.b;
        if (r5eVar != null) {
            return r5eVar;
        }
        Intrinsics.i("layoutInfo");
        throw null;
    }

    public int B() {
        if (A().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((n1c) CollectionsKt.h0(A().a)).k + A().b) + A().c) - A().g);
    }

    public int C() {
        if (A().a.isEmpty()) {
            return 0;
        }
        int i = ((n1c) CollectionsKt.Y(A().a)).k + (-A().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public long D() {
        return ((wj2) this.c).a.d;
    }

    public int E() {
        return ((Number) ((jt7) this.a).invoke()).intValue();
    }

    public void F(String str, String str2) {
        ((HashMap) this.c).put(str, str2);
    }

    public boolean G() {
        return ((wfb) this.b) != null;
    }

    public boolean H() {
        if (((cdi) this.a).getValue() != this.c) {
            return true;
        }
        sx2 sx2Var = (sx2) this.b;
        return sx2Var != null && sx2Var.H();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0048, B:13:0x004e, B:14:0x0053), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(yda ydaVar, sq3 sq3Var) {
        kih kihVar;
        int i;
        j2d j2dVar;
        try {
            if (sq3Var instanceof kih) {
                kihVar = (kih) sq3Var;
                int i2 = kihVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kihVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = kihVar.t;
                    lu3 lu3Var = lu3.a;
                    i = kihVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = (j2d) this.b;
                        kihVar.r = ydaVar;
                        kihVar.s = j2dVar;
                        kihVar.v = 1;
                        if (j2dVar.e(kihVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2d j2dVar2 = kihVar.s;
                        yda ydaVar2 = kihVar.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        ydaVar = ydaVar2;
                    }
                    if (ydaVar == ((yda) this.c)) {
                        this.c = null;
                    }
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            if (ydaVar == ((yda) this.c)) {
            }
            Unit unit2 = Unit.a;
            j2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        kihVar = new kih(this, sq3Var);
        Object obj2 = kihVar.t;
        lu3 lu3Var2 = lu3.a;
        i = kihVar.v;
        if (i != 0) {
        }
    }

    public void J(jv0 jv0Var, int i, boolean z) {
        bv0 bv0Var = (bv0) this.c;
        Context context = (Context) this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        String str = jv0Var.a;
        adler32.update(str.getBytes(Charset.forName(C.UTF8_NAME)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i7f i7fVar = jv0Var.c;
        adler32.update(allocate.putInt(m7f.a(i7fVar)).array());
        byte[] bArr = jv0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        d7a.t(jv0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((mlg) this.b).h().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(m7f.a(i7fVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bv0Var.a(i7fVar, longValue, i));
            Set set = ((cv0) bv0Var.b.get(i7fVar)).c;
            if (set.contains(isg.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(isg.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(isg.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, m7f.a(i7fVar));
            if (bArr != null) {
                persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jv0Var, Integer.valueOf(value), Long.valueOf(bv0Var.a(i7fVar, longValue, i)), valueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void K(uj2 uj2Var) {
        ((wj2) this.c).a.c = uj2Var;
    }

    public void L(kx4 kx4Var) {
        ((wj2) this.c).a.a = kx4Var;
    }

    public void M(ema emaVar) {
        ((wj2) this.c).a.b = emaVar;
    }

    public void N(long j) {
        ((wj2) this.c).a.d = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:14:0x007d, B:22:0x0055, B:24:0x005b, B:26:0x0060, B:28:0x006e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:14:0x007d, B:22:0x0055, B:24:0x005b, B:26:0x0060, B:28:0x006e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:14:0x007d, B:22:0x0055, B:24:0x005b, B:26:0x0060, B:28:0x006e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v0, types: [yda] */
    /* JADX WARN: Type inference failed for: r9v1, types: [h2d] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [h2d] */
    /* JADX WARN: Type inference failed for: r9v4, types: [h2d] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(yda ydaVar, sq3 sq3Var) {
        lih lihVar;
        int i;
        yda ydaVar2;
        yda ydaVar3;
        yda ydaVar4;
        try {
            if (sq3Var instanceof lih) {
                lihVar = (lih) sq3Var;
                int i2 = lihVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lihVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = lihVar.t;
                    lu3 lu3Var = lu3.a;
                    i = lihVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2d j2dVar = (j2d) this.b;
                        lihVar.r = ydaVar;
                        lihVar.s = j2dVar;
                        lihVar.v = 1;
                        if (j2dVar.e(lihVar) != lu3Var) {
                            ydaVar2 = ydaVar;
                            ydaVar = j2dVar;
                        }
                        return lu3Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar = lihVar.s;
                        ydaVar4 = lihVar.r;
                        y6a.M(obj);
                        ydaVar = h2dVar;
                        ydaVar2 = ydaVar4;
                        this.c = ydaVar2;
                        return true;
                    }
                    h2d h2dVar2 = lihVar.s;
                    ydaVar2 = lihVar.r;
                    y6a.M(obj);
                    ydaVar = h2dVar2;
                    ydaVar3 = (yda) this.c;
                    if (ydaVar3 != null) {
                        ydaVar3.isActive();
                    }
                    if (ydaVar3 != null) {
                        ydaVar3.e(new jih((bka) this.a));
                    }
                    if (ydaVar3 != null) {
                        lihVar.r = ydaVar2;
                        lihVar.s = ydaVar;
                        lihVar.v = 2;
                        if (ydaVar3.Z(lihVar) != lu3Var) {
                            ydaVar4 = ydaVar2;
                            ydaVar = ydaVar;
                            ydaVar2 = ydaVar4;
                        }
                        return lu3Var;
                    }
                    this.c = ydaVar2;
                    return true;
                }
            }
            if (i != 0) {
            }
            ydaVar3 = (yda) this.c;
            if (ydaVar3 != null) {
            }
            if (ydaVar3 != null) {
            }
            if (ydaVar3 != null) {
            }
            this.c = ydaVar2;
            return true;
        } finally {
            ydaVar.f(null);
        }
        lihVar = new lih(this, sq3Var);
        Object obj2 = lihVar.t;
        lu3 lu3Var2 = lu3.a;
        i = lihVar.v;
    }

    public rqk P() {
        ale aleVar;
        ah ahVar = (ah) ((hpo) this.c).a;
        rqk f2 = ahVar.f();
        wi5 wi5Var = ahVar.a;
        wi5Var.getClass();
        if (ahVar.O != C.TIME_UNSET) {
            if (SystemClock.elapsedRealtime() - ahVar.O >= wi5Var.a) {
                ahVar.O = C.TIME_UNSET;
                ahVar.i(new IOException("Ad preloading timed out"));
                ahVar.s();
            }
        } else if (ahVar.M != C.TIME_UNSET && (aleVar = ahVar.q) != null && aleVar.getPlaybackState() == 2 && ahVar.n()) {
            ahVar.O = SystemClock.elapsedRealtime();
        }
        return f2 == null ? rqk.c : f2;
    }

    public void Q() {
        ArrayList arrayList = (ArrayList) this.b;
        rqk P = P();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pon ponVar = (pon) it.next();
            TreeSet treeSet = ponVar.a;
            long j = P.a;
            if (P.b >= 0 && !P.equals(ponVar.e)) {
                long j2 = ponVar.e.a;
                if (!(j2 < j ? treeSet.subSet(Long.valueOf(j2), Long.valueOf(j)) : treeSet.subSet(Long.valueOf(j), Long.valueOf(j2))).isEmpty() || treeSet.contains(Long.valueOf(j)) || System.currentTimeMillis() - ponVar.d >= 1000) {
                    ponVar.d = System.currentTimeMillis();
                    ponVar.e = P;
                    ((mqn) ponVar.b).d(new lda(JavaScriptMessage$MsgChannel.contentTimeUpdate, JavaScriptMessage$MsgType.contentTimeUpdate, ponVar.c, TimeUpdateData.create(P), null));
                }
            }
        }
        ((Handler) this.a).postDelayed(new fsn(this, 20), 200L);
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public void a(String str, long j, String str2) {
        zzq zzqVar = (zzq) this.a;
        if (zzqVar != null) {
            zzqVar.b(str, str2).addOnFailureListener(new am0(this, j, 13));
        } else {
            a70.r("Device is not connected");
        }
    }

    @Override // defpackage.r0f
    public boolean b(Object obj) {
        if (obj instanceof tm6) {
            ((tm6) obj).b().a = true;
        }
        ((um6) this.b).h(obj);
        return ((t0f) this.c).b(obj);
    }

    @Override // defpackage.r0f
    public Object c() {
        Object c = ((t0f) this.c).c();
        if (c == null) {
            c = ((sm6) this.a).c();
            if (Log.isLoggable("FactoryPools", 2)) {
                c.getClass().toString();
            }
        }
        if (c instanceof tm6) {
            ((tm6) c).b().a = false;
        }
        return c;
    }

    @Override // defpackage.et9
    public Bitmap e(BitmapFactory.Options options) {
        uqf uqfVar = (uqf) ((de0) this.a).b;
        uqfVar.reset();
        return q9.c(uqfVar, options, this);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.et9
    public boolean f() {
        ArrayList arrayList = (ArrayList) this.c;
        uqf uqfVar = (uqf) ((de0) this.a).b;
        uqfVar.reset();
        kn4 kn4Var = (kn4) this.b;
        uqfVar.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                boolean d2 = ((ds9) arrayList.get(i)).d(uqfVar, kn4Var);
                uqfVar.reset();
                if (d2) {
                    return true;
                }
            } catch (Throwable th) {
                uqfVar.reset();
                throw th;
            }
        }
        return false;
    }

    @Override // defpackage.et9
    public void g() {
        uqf uqfVar = (uqf) ((de0) this.a).b;
        synchronized (uqfVar) {
            uqfVar.c = uqfVar.a.length;
        }
    }

    @Override // defpackage.lli
    public List getCues(long j) {
        List list = (List) this.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                v1l v1lVar = (v1l) list.get(i);
                m74 m74Var = v1lVar.a;
                if (m74Var.e == -3.4028235E38f) {
                    arrayList2.add(v1lVar);
                } else {
                    arrayList.add(m74Var);
                }
            }
        }
        Collections.sort(arrayList2, new m39(20));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            k74 a = ((v1l) arrayList2.get(i3)).a.a();
            a.e = (-1) - i3;
            a.f = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // defpackage.lli
    public long getEventTime(int i) {
        long[] jArr = (long[]) this.c;
        z1a.s(i >= 0);
        z1a.s(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.lli
    public int getEventTimeCount() {
        return ((long[]) this.c).length;
    }

    @Override // defpackage.ii9
    public pm0 getKey() {
        return (pm0) this.c;
    }

    @Override // defpackage.lli
    public int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.c;
        int b = nik.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // defpackage.ooh
    public cwh getSource() {
        return (lof) this.b;
    }

    @Override // defpackage.et9
    public int h() {
        ArrayList arrayList = (ArrayList) this.c;
        uqf uqfVar = (uqf) ((de0) this.a).b;
        uqfVar.reset();
        return ktm.y(arrayList, uqfVar, (kn4) this.b);
    }

    @Override // defpackage.ooh
    public ejh i() {
        return (kof) this.c;
    }

    public void j(pl6 pl6Var, c2k c2kVar) {
        vsj[] vsjVarArr = (vsj[]) this.b;
        for (int i = 0; i < vsjVarArr.length; i++) {
            c2kVar.a();
            c2kVar.b();
            vsj mo2track = pl6Var.mo2track(c2kVar.e, 3);
            b bVar = (b) ((List) this.a).get(i);
            String str = bVar.o;
            z1a.q(str, "Invalid closed caption MIME type provided: %s", MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str));
            String str2 = bVar.a;
            if (str2 == null) {
                c2kVar.b();
                str2 = c2kVar.f;
            }
            qm8 qm8Var = new qm8();
            qm8Var.a = str2;
            qm8Var.m = sjc.p("video/mp2t");
            qm8Var.n = sjc.p(str);
            qm8Var.e = bVar.e;
            qm8Var.d = bVar.d;
            qm8Var.K = bVar.L;
            qm8Var.q = bVar.r;
            w1l.r(qm8Var, mo2track);
            vsjVarArr[i] = mo2track;
        }
    }

    @Override // defpackage.ii9
    public void k(Object obj, vh9 vh9Var) {
        tx2 tx2Var = (tx2) obj;
        tx2Var.getClass();
        rx2 rx2Var = new rx2(tx2Var.a, vh9Var, tx2Var.b);
        tx2Var.c.invoke(rx2Var);
        tx2Var.d = rx2Var.d;
        Iterator it = rx2Var.c.iterator();
        while (it.hasNext()) {
            ve9 ve9Var = (ve9) it.next();
            ve9Var.getClass();
            ve9Var.a.h(vh9Var, ve9Var.b);
        }
    }

    @Override // defpackage.ii9
    public Object l(Function1 function1) {
        function1.getClass();
        Object invoke = ((Function0) this.a).invoke();
        function1.invoke(invoke);
        return new tx2((pm0) this.c, invoke, (Function1) this.b);
    }

    public void n(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (k3a.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    q((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new fb3(12, e2);
            }
        }
    }

    @Override // defpackage.w1g
    public e1g o(e1g e1gVar, uvd uvdVar) {
        Drawable drawable = (Drawable) e1gVar.get();
        if (drawable instanceof BitmapDrawable) {
            zic zicVar = (zic) this.b;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            return zicVar.o(bitmap != null ? new ex1((dx1) this.a, bitmap) : null, uvdVar);
        }
        if (drawable instanceof xx8) {
            return ((ccd) this.c).o(e1gVar, uvdVar);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((zzbxk) this.a).a(adError.zza());
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* synthetic */ Object onSuccess(Object obj) {
        zzbxk zzbxkVar = (zzbxk) this.a;
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd != null) {
            try {
                ((zzbyg) this.c).c = mediationInterstitialAd;
                zzbxkVar.zze();
            } catch (RemoteException e2) {
                zzo.zzg("", e2);
            }
            return new fqn((zzbwa) this.b);
        }
        zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            zzbxkVar.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
            return null;
        }
    }

    @Override // defpackage.et9
    public ImageHeaderParser$ImageType p() {
        ArrayList arrayList = (ArrayList) this.c;
        uqf uqfVar = (uqf) ((de0) this.a).b;
        uqfVar.reset();
        return ktm.z(arrayList, uqfVar, (kn4) this.b);
    }

    public Object q(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.a;
        if (h5a.M()) {
            try {
                Trace.beginSection(h5a.U(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                k3a k3aVar = (k3a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> dependencies = k3aVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            q(cls2, hashSet);
                        }
                    }
                }
                obj = k3aVar.create((Context) this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new fb3(12, th);
            }
        }
        return obj;
    }

    public yz1 r() {
        HttpsURLConnection httpsURLConnection;
        hcc.L();
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(m((String) this.a, (HashMap) this.b)).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(C4094gc.a);
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, C.UTF8_NAME));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new yz1(responseCode, sb, 4);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public kc5 s(h6c h6cVar) {
        so4 so4Var;
        h6cVar.b.getClass();
        q5c q5cVar = h6cVar.b.c;
        if (q5cVar == null) {
            return kc5.a;
        }
        synchronized (this.a) {
            try {
                if (!q5cVar.equals((q5c) this.b)) {
                    this.b = q5cVar;
                    this.c = d(q5cVar);
                }
                so4Var = (so4) this.c;
                so4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return so4Var;
    }

    public uj2 t() {
        return ((wj2) this.c).a.c;
    }

    public kx4 u() {
        return ((wj2) this.c).a.a;
    }

    public int v() {
        if (A().a.isEmpty()) {
            return -1;
        }
        long j = ((n1c) CollectionsKt.Y(A().a)).a - A().h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public boolean w() {
        return !A().a.isEmpty();
    }

    public int y() {
        if (A().a.isEmpty()) {
            return -1;
        }
        long j = ((n1c) CollectionsKt.h0(A().a)).a + A().h;
        long E = E() - 1;
        if (j > E) {
            j = E;
        }
        return (int) j;
    }

    public ema z() {
        return ((wj2) this.c).a.b;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public zzx zza() {
        zzioe.b(zzdcz.class, (zzdcz) this.b);
        zzioe.b(zzat.class, (zzat) this.c);
        zzat zzatVar = (zzat) this.c;
        new zzczr();
        new zzdbu();
        new zzeay();
        return new p((uun) this.a, zzatVar, (zzdcz) this.b);
    }

    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        zin zinVar = (zin) this.c;
        gbo gboVar = zinVar.i;
        WebViewInitData webViewInitData = (WebViewInitData) obj;
        final gl glVar = (gl) this.a;
        final String str = (String) this.b;
        l6n l6nVar = zinVar.e;
        l6nVar.d.put(str, glVar);
        l6nVar.a.c(str, JavaScriptMessage$MsgChannel.adsLoader, l6nVar);
        zinVar.c.c(str, JavaScriptMessage$MsgChannel.gestureSignal, zinVar.m);
        WebViewInitData.JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData = webViewInitData.initData;
        t6o t6oVar = zinVar.d;
        final long currentTimeMillis = System.currentTimeMillis();
        final sen b = t6oVar.b(str);
        final p4o p4oVar = zinVar.p;
        final e6o e6oVar = zinVar.o;
        e6oVar.getClass();
        x1p x1pVar = new x1p() { // from class: q5o
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
            
                if (r14 == (-1)) goto L28;
             */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0182 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01a5  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01ea A[Catch: TimeoutException -> 0x01fc, ExecutionException -> 0x01fe, InterruptedException -> 0x0200, TryCatch #8 {InterruptedException -> 0x0200, ExecutionException -> 0x01fe, TimeoutException -> 0x01fc, blocks: (B:78:0x01e3, B:80:0x01ea, B:81:0x0202), top: B:77:0x01e3 }] */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // defpackage.x1p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj2) {
                g5o g5oVar;
                Map map;
                Boolean bool;
                String str2;
                String str3;
                boolean z;
                String str4;
                String str5;
                String str6;
                String str7;
                AppSetIdInfo appSetIdInfo;
                int scope;
                boolean v;
                String host;
                q2o q2oVar;
                int i;
                g5o g5oVar2 = p4oVar;
                e6o e6oVar2 = e6o.this;
                e6oVar2.getClass();
                WebViewInitData.JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData2 = ((WebViewInitData) obj2).initData;
                b2p l = b2p.l(javaScriptNativeBridgeInitData2.disableAppSetId());
                b2p l2 = b2p.l(javaScriptNativeBridgeInitData2.appSetIdTimeoutMs());
                b2p l3 = b2p.l(javaScriptNativeBridgeInitData2.gksFirstPartyAdServers());
                b2p.l(javaScriptNativeBridgeInitData2.gksDaiNativeXhrApps());
                b2p l4 = b2p.l(javaScriptNativeBridgeInitData2.gksTimeoutMs());
                Context context = e6oVar2.a;
                String str8 = glVar.b;
                String str9 = "";
                Uri parse = Uri.parse(str8 == null ? "" : str8);
                if (parse == null || parse.isOpaque()) {
                    g5oVar = g5oVar2;
                    a70.m("This isn't a hierarchical URI.");
                    map = null;
                } else {
                    String encodedQuery = parse.getEncodedQuery();
                    if (encodedQuery == null || encodedQuery.length() == 0) {
                        g5oVar = g5oVar2;
                        map = Collections.EMPTY_MAP;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int indexOf = encodedQuery.indexOf(35);
                        int i2 = -1;
                        if (indexOf == -1) {
                            indexOf = encodedQuery.length();
                        }
                        int i3 = 0;
                        while (true) {
                            int indexOf2 = encodedQuery.indexOf(38, i3);
                            if (indexOf2 == i2) {
                                indexOf2 = indexOf;
                            }
                            int indexOf3 = encodedQuery.indexOf(61, i3);
                            if (indexOf3 <= indexOf2) {
                                g5oVar = g5oVar2;
                                i = -1;
                            } else {
                                g5oVar = g5oVar2;
                                i = -1;
                            }
                            indexOf3 = indexOf2;
                            linkedHashMap.put(encodedQuery.substring(i3, indexOf3), indexOf3 < indexOf2 ? encodedQuery.substring(indexOf3 + 1, indexOf2) : "");
                            i3 = indexOf2 + 1;
                            if (i3 >= indexOf) {
                                break;
                            }
                            i2 = i;
                            g5oVar2 = g5oVar;
                        }
                        map = Collections.unmodifiableMap(linkedHashMap);
                    }
                }
                Map map2 = map;
                try {
                    bool = (Boolean) ((p4o) g5oVar).a().get();
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    e6oVar2.b.d(InstrumentationData.Component.IDENTIFIER_INFO_FACTORY, InstrumentationData.Method.SAFE_BLOCKING_GET_IDLESS, e2);
                    bool = Boolean.TRUE;
                }
                if (bool.booleanValue() || ((str2 = (String) map2.get("ltd")) != null && str2.equals("1"))) {
                    return u1p.a;
                }
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    str3 = advertisingIdInfo.getId();
                    z = advertisingIdInfo.isLimitAdTrackingEnabled();
                    str4 = "adid";
                    str5 = str3;
                } catch (Exception | NoClassDefFoundError unused) {
                    str3 = "";
                    try {
                        ContentResolver contentResolver = context.getContentResolver();
                        String string = Settings.Secure.getString(contentResolver, "advertising_id");
                        boolean z2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 1;
                        str4 = "afai";
                        str5 = string;
                        z = z2;
                    } catch (Settings.SettingNotFoundException unused2) {
                        z = false;
                        str4 = "";
                    }
                }
                boolean d2 = l.d();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!d2 || !((Boolean) l.g()).booleanValue()) {
                    try {
                        long j = 150;
                        if (l2.d() && ((Long) l2.g()).longValue() > 0) {
                            j = ((Long) l2.g()).longValue();
                        }
                        appSetIdInfo = (AppSetIdInfo) Tasks.await(AppSet.getClient(context).getAppSetIdInfo(), j, timeUnit);
                        str6 = appSetIdInfo.getId();
                    } catch (InterruptedException | Exception | NoClassDefFoundError | NoSuchMethodError | ExecutionException | TimeoutException unused3) {
                        str6 = "";
                    }
                    try {
                        scope = appSetIdInfo.getScope();
                        str7 = str6;
                    } catch (InterruptedException | Exception | NoClassDefFoundError | NoSuchMethodError | ExecutionException | TimeoutException unused4) {
                        str7 = str6;
                        scope = 0;
                        v = y9.v(context);
                        if (!z) {
                        }
                        return b2p.k(IdentifierInfo.create(str5, str4, z, str7, scope, str9));
                    }
                    v = y9.v(context);
                    if (!z && v && str8 != null && str8.contains("GOOGLE_INSTREAM_VIDEO_NONCE") && l3.d()) {
                        List list = (List) l3.g();
                        host = Uri.parse(str8).getHost();
                        if (host != null) {
                            if (host.startsWith("www.")) {
                                host = host.substring(4);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (host.equals((String) it.next())) {
                                    break;
                                }
                            }
                        }
                        q2oVar = e6oVar2.e;
                        if (l4.d() && ((Integer) l4.g()).intValue() > 0) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            try {
                                Bundle bundle = new Bundle();
                                if (v) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("x-afma-token-requester-type", "requester_type_10");
                                    bundle.putBundle("extra_headers", bundle2);
                                }
                                str9 = (String) Tasks.await(q2oVar.a.i(bundle), ((Integer) l4.g()).intValue(), timeUnit);
                            } catch (InterruptedException e3) {
                                e = e3;
                                t6o t6oVar2 = q2oVar.b;
                                t6oVar2.d(InstrumentationData.Component.ADS_IDENTITY_TOKEN_LOADER, InstrumentationData.Method.GET_ADSIDENTITY_TOKEN, e);
                                sen b2 = t6oVar2.b(str);
                                qen c = t6o.c(currentTimeMillis2, System.currentTimeMillis());
                                b2.b();
                                ((uen) b2.b).F(c);
                                return b2p.k(IdentifierInfo.create(str5, str4, z, str7, scope, str9));
                            } catch (ExecutionException e4) {
                                e = e4;
                                t6o t6oVar22 = q2oVar.b;
                                t6oVar22.d(InstrumentationData.Component.ADS_IDENTITY_TOKEN_LOADER, InstrumentationData.Method.GET_ADSIDENTITY_TOKEN, e);
                                sen b22 = t6oVar22.b(str);
                                qen c2 = t6o.c(currentTimeMillis2, System.currentTimeMillis());
                                b22.b();
                                ((uen) b22.b).F(c2);
                                return b2p.k(IdentifierInfo.create(str5, str4, z, str7, scope, str9));
                            } catch (TimeoutException e5) {
                                e = e5;
                                t6o t6oVar222 = q2oVar.b;
                                t6oVar222.d(InstrumentationData.Component.ADS_IDENTITY_TOKEN_LOADER, InstrumentationData.Method.GET_ADSIDENTITY_TOKEN, e);
                                sen b222 = t6oVar222.b(str);
                                qen c22 = t6o.c(currentTimeMillis2, System.currentTimeMillis());
                                b222.b();
                                ((uen) b222.b).F(c22);
                                return b2p.k(IdentifierInfo.create(str5, str4, z, str7, scope, str9));
                            }
                        }
                    }
                    return b2p.k(IdentifierInfo.create(str5, str4, z, str7, scope, str9));
                }
                str7 = "";
                scope = 0;
                v = y9.v(context);
                if (!z) {
                    List list2 = (List) l3.g();
                    host = Uri.parse(str8).getHost();
                    if (host != null) {
                    }
                    q2oVar = e6oVar2.e;
                    if (l4.d()) {
                        long currentTimeMillis22 = System.currentTimeMillis();
                        Bundle bundle3 = new Bundle();
                        if (v) {
                        }
                        str9 = (String) Tasks.await(q2oVar.a.i(bundle3), ((Integer) l4.g()).intValue(), timeUnit);
                    }
                }
                return b2p.k(IdentifierInfo.create(str5, str4, z, str7, scope, str9));
            }
        };
        Executor executor = e6oVar.c;
        ddb ddbVar = e6oVar.d;
        int i = f7p.k;
        e7p e7pVar = new e7p(ddbVar, x1pVar);
        Executor executor2 = q7p.a;
        int i2 = 4;
        if (executor != executor2) {
            executor = new irb(executor, e7pVar, i2);
        }
        ddbVar.addListener(e7pVar, executor);
        final int i3 = 0;
        Runnable runnable = new Runnable() { // from class: xcn
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                sen senVar = b;
                long j = currentTimeMillis;
                switch (i4) {
                    case 0:
                        qen c = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).B(c);
                        break;
                    case 1:
                        qen c2 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).A(c2);
                        break;
                    case 2:
                        qen c3 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).z(c3);
                        break;
                    default:
                        qen c4 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).C(c4);
                        break;
                }
            }
        };
        b7p b7pVar = zinVar.n;
        e7pVar.addListener(runnable, b7pVar);
        ddb b2 = b7pVar.b(new een(i3, zinVar, javaScriptNativeBridgeInitData));
        final int i4 = 1;
        b2.addListener(new Runnable() { // from class: xcn
            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i4;
                sen senVar = b;
                long j = currentTimeMillis;
                switch (i42) {
                    case 0:
                        qen c = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).B(c);
                        break;
                    case 1:
                        qen c2 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).A(c2);
                        break;
                    case 2:
                        qen c3 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).z(c3);
                        break;
                    default:
                        qen c4 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).C(c4);
                        break;
                }
            }
        }, b7pVar);
        rbo rboVar = zinVar.k;
        Objects.requireNonNull(rboVar);
        ddb b3 = b7pVar.b(new v35(rboVar, 5));
        final int i5 = 2;
        b3.addListener(new Runnable() { // from class: xcn
            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i5;
                sen senVar = b;
                long j = currentTimeMillis;
                switch (i42) {
                    case 0:
                        qen c = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).B(c);
                        break;
                    case 1:
                        qen c2 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).A(c2);
                        break;
                    case 2:
                        qen c3 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).z(c3);
                        break;
                    default:
                        qen c4 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).C(c4);
                        break;
                }
            }
        }, b7pVar);
        Task task = zinVar.j.a.getTask();
        l1p l1pVar = new l1p();
        l1pVar.h = task;
        task.addOnCompleteListener(executor2, new n1p(l1pVar, i3));
        final int i6 = 3;
        l1pVar.addListener(new Runnable() { // from class: xcn
            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i6;
                sen senVar = b;
                long j = currentTimeMillis;
                switch (i42) {
                    case 0:
                        qen c = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).B(c);
                        break;
                    case 1:
                        qen c2 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).A(c2);
                        break;
                    case 2:
                        qen c3 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).z(c3);
                        break;
                    default:
                        qen c4 = t6o.c(j, System.currentTimeMillis());
                        senVar.b();
                        ((uen) senVar.b).C(c4);
                        break;
                }
            }
        }, b7pVar);
        m3p m3pVar = q3p.b;
        Object[] objArr = (Object[]) new ddb[]{e7pVar, b2, b3, l1pVar}.clone();
        int length = objArr.length;
        while (i3 < length) {
            pea.I(i3, objArr[i3]);
            i3++;
            str = str;
        }
        String str2 = str;
        v4p v = q3p.v(length, objArr);
        mgn mgnVar = new mgn(glVar, b3, b, currentTimeMillis, e7pVar, b2, l1pVar);
        int i7 = v.d;
        o7p o7pVar = new o7p();
        o7pVar.h = null;
        o7pVar.i = i7;
        o7pVar.l = v;
        o7pVar.m = new m7p(o7pVar, mgnVar, b7pVar);
        Objects.requireNonNull(o7pVar.l);
        if (o7pVar.l.isEmpty()) {
            m7p m7pVar = o7pVar.m;
            if (m7pVar != null) {
                try {
                    m7pVar.c.execute(m7pVar);
                } catch (RejectedExecutionException e2) {
                    m7pVar.d.e(e2);
                }
            }
        } else {
            v4p v4pVar = o7pVar.l;
            dno dnoVar = new dno(o7pVar, 20);
            m3p listIterator = v4pVar.listIterator(0);
            while (listIterator.hasNext()) {
                ddb ddbVar2 = (ddb) listIterator.next();
                if (ddbVar2.isDone()) {
                    int V = l7p.j.V(o7pVar);
                    if (!(V >= 0)) {
                        a70.r("Less than 0 remaining futures");
                        return;
                    }
                    if (V == 0) {
                        o7pVar.h = null;
                        m7p m7pVar2 = o7pVar.m;
                        if (m7pVar2 != null) {
                            try {
                                m7pVar2.c.execute(m7pVar2);
                            } catch (RejectedExecutionException e3) {
                                m7pVar2.d.e(e3);
                            }
                        }
                        o7pVar.l = null;
                    }
                } else {
                    ddbVar2.addListener(dnoVar, executor2);
                }
            }
        }
        o7pVar.addListener(new ugn(zinVar, o7pVar, gboVar, glVar, webViewInitData, str2, 0), zinVar.n);
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public long zzc() {
        return ((AtomicLong) this.b).getAndIncrement();
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public /* bridge */ /* synthetic */ zzw zzc(zzdcz zzdczVar) {
        this.b = zzdczVar;
        return this;
    }

    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        ((zin) this.c).f.v(new zjo(new tf(1, 1, "Error initializing the SDK", null)));
    }

    public /* synthetic */ sx2(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ sx2(boolean z, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public sx2(g7h g7hVar) {
        this.a = g7hVar;
        this.b = o6a.o((ss4) g7hVar.d);
        this.c = o6a.n((rs4) g7hVar.e);
    }

    public sx2(List list) {
        this.a = list;
        this.b = new vsj[list.size()];
        this.c = new jy0(new imf(this, 8));
    }

    public /* synthetic */ sx2(Object obj) {
        this.a = obj;
    }

    public sx2(Context context, int i) {
        switch (i) {
            case 15:
                context.getClass();
                this.a = context;
                this.b = new ArrayList();
                break;
            default:
                this.c = context.getApplicationContext();
                this.b = new HashSet();
                this.a = new HashMap();
                break;
        }
    }

    public sx2(i6k i6kVar, sx2 sx2Var) {
        this.a = i6kVar;
        this.b = sx2Var;
        this.c = i6kVar.getValue();
    }

    public sx2(int i, boolean z) {
        switch (i) {
            case 7:
                this.a = new Object();
                break;
            case 17:
                long[] jArr = qrg.a;
                this.a = new x0d();
                break;
            default:
                this.a = new zmb(16);
                long[] jArr2 = qrg.a;
                this.b = new x0d();
                this.c = new ubf(3);
                break;
        }
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public /* bridge */ /* synthetic */ zzw zzb(zzat zzatVar) {
        this.c = zzatVar;
        return this;
    }
}
