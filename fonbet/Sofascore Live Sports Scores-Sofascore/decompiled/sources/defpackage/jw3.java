package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jw3 {
    public static final dw3 r = new dw3(1);
    public static final Charset s = Charset.forName(C.UTF8_NAME);
    public final Context a;
    public final rd4 b;
    public final z41 c;
    public final r18 d;
    public final hcc e;
    public final ar9 f;
    public final r18 g;
    public final jd0 h;
    public final f4a i;
    public final ow3 j;
    public final ku k;
    public final ew3 l;
    public final q8h m;
    public wx3 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public jw3(Context context, ar9 ar9Var, rd4 rd4Var, r18 r18Var, z41 z41Var, jd0 jd0Var, r18 r18Var2, f4a f4aVar, q8h q8hVar, ow3 ow3Var, ku kuVar, ew3 ew3Var, hcc hccVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = ar9Var;
        this.b = rd4Var;
        this.g = r18Var;
        this.c = z41Var;
        this.h = jd0Var;
        this.d = r18Var2;
        this.i = f4aVar;
        this.j = ow3Var;
        this.k = kuVar;
        this.l = ew3Var;
        this.m = q8hVar;
        this.e = hccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0430 A[LOOP:1: B:55:0x0430->B:57:0x0436, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0456  */
    /* JADX WARN: Type inference failed for: r14v17, types: [int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, ng2 ng2Var, boolean z2) {
        ow3 ow3Var;
        r18 r18Var;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        String str;
        r18 r18Var2;
        NavigableSet<String> d;
        int i4;
        int size;
        String substring;
        os0 a;
        qx3 qx3Var;
        String f;
        boolean z5;
        String[] list;
        List list2;
        ApplicationExitInfo e;
        String str2;
        String processName;
        List list3;
        InputStream traceInputStream;
        Closeable closeable;
        FileInputStream fileInputStream;
        ow3 ow3Var2 = this.j;
        Context context = this.a;
        r18 r18Var3 = this.g;
        hcc.K();
        final q8h q8hVar = this.m;
        ArrayList arrayList2 = new ArrayList(q8hVar.b.d());
        if (arrayList2.size() <= z) {
            return;
        }
        final String str3 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && ng2Var.g().b.b) {
            i = 4;
            if (Build.VERSION.SDK_INT >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    f4a f4aVar = new f4a(r18Var3);
                    i2 = 8;
                    f4aVar.c = f4a.i;
                    if (str3 != null) {
                        f4aVar.c = new yif(r18Var3.k(str3, "userlog"));
                    }
                    hcc hccVar = this.e;
                    hic hicVar = new hic(r18Var3);
                    i3 = 2;
                    r18 r18Var4 = new r18(str3, r18Var3, hccVar);
                    ((wja) ((AtomicMarkableReference) ((en0) r18Var4.d).c).getReference()).c(hicVar.c(str3, false));
                    ((wja) ((AtomicMarkableReference) ((en0) r18Var4.e).c).getReference()).c(hicVar.c(str3, true));
                    ((AtomicMarkableReference) r18Var4.g).set(hicVar.d(str3), false);
                    k89 k89Var = (k89) r18Var4.f;
                    File k = r18Var3.k(str3, "rollouts-state");
                    if (k.exists()) {
                        ?? r14 = (k.length() > 0L ? 1 : (k.length() == 0L ? 0 : -1));
                        try {
                            if (r14 != 0) {
                                try {
                                    fileInputStream = new FileInputStream(k);
                                    try {
                                        list2 = hic.b(k53.z0(fileInputStream));
                                        list2.toString();
                                        k53.a0(fileInputStream);
                                        r14 = fileInputStream;
                                    } catch (Exception unused) {
                                        hic.f(k);
                                        k53.a0(fileInputStream);
                                        list2 = Collections.EMPTY_LIST;
                                        r14 = fileInputStream;
                                        k89Var.d(list2);
                                        final int i5 = 0;
                                        e = q8hVar.e(str3, historicalProcessExitReasons, new Predicate() { // from class: o8h
                                            @Override // java.util.function.Predicate
                                            public final boolean test(Object obj) {
                                                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                                                switch (i5) {
                                                    case 0:
                                                        if (applicationExitInfo.getReason() != 6) {
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        boolean z6 = applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM");
                                                        boolean z7 = applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL;
                                                        if (!z6 && !z7) {
                                                            break;
                                                        }
                                                        break;
                                                }
                                                return false;
                                            }
                                        });
                                        if (e == null) {
                                        }
                                        if (z2) {
                                        }
                                        if (Build.VERSION.SDK_INT < 37) {
                                        }
                                        if (z == 0) {
                                        }
                                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                                        vx3 vx3Var = q8hVar.b;
                                        r18Var2 = vx3Var.b;
                                        r18Var2.c(".com.google.firebase.crashlytics");
                                        r18Var2.c(".com.google.firebase.crashlytics-ndk");
                                        if (!((String) r18Var2.a).isEmpty()) {
                                        }
                                        d = vx3Var.d();
                                        if (str != null) {
                                        }
                                        i4 = i2;
                                        if (d.size() > i4) {
                                        }
                                        while (r6.hasNext()) {
                                        }
                                        zid zidVar = vx3Var.c.g().a;
                                        ArrayList c = vx3Var.c();
                                        size = c.size();
                                        if (size > 4) {
                                        }
                                    }
                                } catch (Exception unused2) {
                                    fileInputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = null;
                                    k53.a0(closeable);
                                    throw th;
                                }
                                k89Var.d(list2);
                                final int i52 = 0;
                                e = q8hVar.e(str3, historicalProcessExitReasons, new Predicate() { // from class: o8h
                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                                        switch (i52) {
                                            case 0:
                                                if (applicationExitInfo.getReason() != 6) {
                                                    break;
                                                }
                                                break;
                                            default:
                                                boolean z6 = applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM");
                                                boolean z7 = applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL;
                                                if (!z6 && !z7) {
                                                    break;
                                                }
                                                break;
                                        }
                                        return false;
                                    }
                                });
                                if (e == null) {
                                    ow3Var = ow3Var2;
                                    r18Var = r18Var3;
                                    arrayList = arrayList2;
                                } else {
                                    sx3 sx3Var = q8hVar.a;
                                    try {
                                        traceInputStream = e.getTraceInputStream();
                                    } catch (IOException e2) {
                                        e.toString();
                                        e2.toString();
                                    }
                                    if (traceInputStream != null) {
                                        str2 = q8h.c(traceInputStream);
                                        qs0 qs0Var = new qs0();
                                        qs0Var.d = e.getImportance();
                                        qs0Var.j = (byte) (qs0Var.j | 4);
                                        processName = e.getProcessName();
                                        if (processName != null) {
                                            yhk.s("Null processName");
                                            return;
                                        }
                                        qs0Var.b = processName;
                                        qs0Var.c = e.getReason();
                                        qs0Var.j = (byte) (qs0Var.j | 2);
                                        qs0Var.g = e.getTimestamp();
                                        qs0Var.j = (byte) (qs0Var.j | 32);
                                        qs0Var.a = e.getPid();
                                        qs0Var.j = (byte) (qs0Var.j | 1);
                                        qs0Var.e = e.getPss();
                                        qs0Var.j = (byte) (qs0Var.j | 8);
                                        qs0Var.f = e.getRss();
                                        qs0Var.j = (byte) (qs0Var.j | 16);
                                        qs0Var.h = str2;
                                        rs0 a2 = qs0Var.a();
                                        int i6 = sx3Var.a.getResources().getConfiguration().orientation;
                                        et0 et0Var = new et0();
                                        et0Var.b = "anr";
                                        ow3Var = ow3Var2;
                                        long j = a2.g;
                                        et0Var.a = j;
                                        et0Var.g = (byte) (et0Var.g | 1);
                                        jd0 jd0Var = sx3Var.c;
                                        if (!sx3Var.e.g().b.c || jd0Var.c.size() <= 0) {
                                            r18Var = r18Var3;
                                            arrayList = arrayList2;
                                            list3 = null;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it = jd0Var.c.iterator();
                                            while (it.hasNext()) {
                                                Iterator it2 = it;
                                                s62 s62Var = (s62) it.next();
                                                String str4 = s62Var.a;
                                                if (str4 == null) {
                                                    yhk.s("Null libraryName");
                                                    return;
                                                }
                                                ArrayList arrayList4 = arrayList2;
                                                String str5 = s62Var.b;
                                                if (str5 == null) {
                                                    yhk.s("Null arch");
                                                    return;
                                                }
                                                String str6 = s62Var.c;
                                                if (str6 == null) {
                                                    yhk.s("Null buildId");
                                                    return;
                                                }
                                                arrayList3.add(new ss0(str5, str4, str6));
                                                it = it2;
                                                arrayList2 = arrayList4;
                                                r18Var3 = r18Var3;
                                            }
                                            r18Var = r18Var3;
                                            arrayList = arrayList2;
                                            list3 = Collections.unmodifiableList(arrayList3);
                                        }
                                        qs0 qs0Var2 = new qs0();
                                        qs0Var2.d = a2.d;
                                        byte b = (byte) (qs0Var2.j | 4);
                                        qs0Var2.j = b;
                                        String str7 = a2.b;
                                        if (str7 == null) {
                                            yhk.s("Null processName");
                                            return;
                                        }
                                        qs0Var2.b = str7;
                                        qs0Var2.c = a2.c;
                                        qs0Var2.g = j;
                                        qs0Var2.a = a2.a;
                                        qs0Var2.e = a2.e;
                                        qs0Var2.f = a2.f;
                                        qs0Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                                        qs0Var2.h = a2.h;
                                        qs0Var2.i = list3;
                                        rs0 a3 = qs0Var2.a();
                                        int i7 = a3.d;
                                        Boolean valueOf = Boolean.valueOf(i7 != 100);
                                        String str8 = a3.b;
                                        int i8 = a3.a;
                                        str8.getClass();
                                        pt0 pt0Var = new pt0();
                                        pt0Var.a = str8;
                                        pt0Var.b = i8;
                                        byte b2 = (byte) (pt0Var.e | 1);
                                        pt0Var.c = i7;
                                        pt0Var.d = false;
                                        pt0Var.e = (byte) (((byte) (b2 | 2)) | 4);
                                        qt0 a4 = pt0Var.a();
                                        lt0 e3 = sx3.e();
                                        List a5 = sx3Var.a();
                                        if (a5 == null) {
                                            yhk.s("Null binaries");
                                            return;
                                        } else {
                                            et0Var.c = new ht0(new it0(null, null, a3, null, e3, a5), null, null, valueOf, a4, null, i6);
                                            et0Var.d = sx3Var.b(i6);
                                            q8hVar.b.e(q8h.b(q8h.a(et0Var.a(), f4aVar, r18Var4, Collections.EMPTY_MAP), r18Var4), str3, true);
                                        }
                                    }
                                    str2 = null;
                                    qs0 qs0Var3 = new qs0();
                                    qs0Var3.d = e.getImportance();
                                    qs0Var3.j = (byte) (qs0Var3.j | 4);
                                    processName = e.getProcessName();
                                    if (processName != null) {
                                    }
                                }
                                if (z2 && ow3Var.c()) {
                                    ow3Var.a().getClass();
                                }
                                if (Build.VERSION.SDK_INT < 37) {
                                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                                    dw3 dw3Var = new dw3(i3);
                                    File file = new File((File) r18Var.d, str3);
                                    file.mkdirs();
                                    List list4 = (List) r18.s(file.listFiles(dw3Var)).stream().map(new mn0(1)).filter(new gw3(0)).collect(Collectors.toList());
                                    List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
                                    Optional findFirst = list4.stream().findFirst();
                                    if (findFirst.isPresent()) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                        final boolean z6 = true ? 1 : 0;
                                        findFirst = q8hVar.e(str3, historicalProcessExitReasons2, new Predicate() { // from class: o8h
                                            @Override // java.util.function.Predicate
                                            public final boolean test(Object obj) {
                                                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                                                switch (z6) {
                                                    case 0:
                                                        if (applicationExitInfo.getReason() != 6) {
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        boolean z62 = applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM");
                                                        boolean z7 = applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL;
                                                        if (!z62 && !z7) {
                                                            break;
                                                        }
                                                        break;
                                                }
                                                return false;
                                            }
                                        }) != null ? Optional.of(7) : Optional.empty();
                                        Objects.requireNonNull(findFirst);
                                    }
                                    findFirst.ifPresent(new Consumer() { // from class: p8h
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            String str9 = str3;
                                            vx3 vx3Var2 = q8h.this.b;
                                            ws0 ws0Var = new ws0(new xs0(((Integer) obj).intValue()));
                                            try {
                                                vx3.g.getClass();
                                                vx3.g(vx3Var2.b.k(str9, "profiling-manager-info"), tx3.a.m(ws0Var));
                                            } catch (IOException unused3) {
                                            }
                                        }
                                    });
                                } else {
                                    z3 = true;
                                }
                                if (z == 0) {
                                    z4 = false;
                                    str = (String) arrayList.get(0);
                                } else {
                                    z4 = false;
                                    this.l.a(null);
                                    str = null;
                                }
                                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                                vx3 vx3Var2 = q8hVar.b;
                                r18Var2 = vx3Var2.b;
                                r18Var2.c(".com.google.firebase.crashlytics");
                                r18Var2.c(".com.google.firebase.crashlytics-ndk");
                                if (!((String) r18Var2.a).isEmpty()) {
                                    r18Var2.c(".com.google.firebase.crashlytics.files.v1");
                                    final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
                                    File file2 = (File) r18Var2.b;
                                    if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: q18
                                        @Override // java.io.FilenameFilter
                                        public final boolean accept(File file3, String str10) {
                                            return str10.startsWith(str9);
                                        }
                                    })) != null) {
                                        int length = list.length;
                                        for (?? r8 = z4; r8 < length; r8++) {
                                            r18Var2.c(list[r8]);
                                        }
                                    }
                                }
                                d = vx3Var2.d();
                                if (str != null) {
                                    d.remove(str);
                                }
                                i4 = i2;
                                if (d.size() > i4) {
                                    while (d.size() > i4) {
                                        String str10 = (String) d.last();
                                        r18.r(new File((File) r18Var2.d, str10));
                                        d.remove(str10);
                                    }
                                }
                                for (String str11 : d) {
                                    tx3 tx3Var = vx3.g;
                                    dw3 dw3Var2 = vx3.i;
                                    File file3 = new File((File) r18Var2.d, str11);
                                    file3.mkdirs();
                                    List<File> s2 = r18.s(file3.listFiles(dw3Var2));
                                    if (!s2.isEmpty()) {
                                        Collections.sort(s2);
                                        ArrayList arrayList5 = new ArrayList();
                                        boolean z7 = z4;
                                        for (File file4 : s2) {
                                            try {
                                                f = vx3.f(file4);
                                                tx3Var.getClass();
                                            } catch (IOException unused3) {
                                                Objects.toString(file4);
                                            }
                                            try {
                                                JsonReader jsonReader = new JsonReader(new StringReader(f));
                                                try {
                                                    ft0 d2 = tx3.d(jsonReader);
                                                    jsonReader.close();
                                                    arrayList5.add(vx3Var2.a(str11, d2));
                                                    if (!z7) {
                                                        String name = file4.getName();
                                                        if (!name.startsWith("event") || !name.endsWith("_")) {
                                                            z5 = z4;
                                                            z7 = z5;
                                                        }
                                                    }
                                                    z5 = z3;
                                                    z7 = z5;
                                                } finally {
                                                }
                                            } catch (IllegalStateException e4) {
                                                throw new IOException(e4);
                                            }
                                        }
                                        if (!arrayList5.isEmpty()) {
                                            String d3 = new hic(r18Var2).d(str11);
                                            l2a l2aVar = vx3Var2.d.b;
                                            synchronized (l2aVar) {
                                                if (Objects.equals((String) l2aVar.c, str11)) {
                                                    substring = (String) l2aVar.d;
                                                } else {
                                                    r18 r18Var5 = (r18) l2aVar.b;
                                                    dw3 dw3Var3 = l2a.e;
                                                    File file5 = new File((File) r18Var5.d, str11);
                                                    file5.mkdirs();
                                                    List s3 = r18.s(file5.listFiles(dw3Var3));
                                                    substring = s3.isEmpty() ? null : ((File) Collections.min(s3, l2a.f)).getName().substring(i);
                                                }
                                            }
                                            File k2 = r18Var2.k(str11, "report");
                                            try {
                                                String f2 = vx3.f(k2);
                                                tx3Var.getClass();
                                                os0 j2 = tx3.j(f2);
                                                ns0 a6 = j2.a();
                                                qx3 qx3Var2 = j2.k;
                                                if (qx3Var2 != null) {
                                                    ys0 a7 = qx3Var2.a();
                                                    a7.e = Long.valueOf(currentTimeMillis2);
                                                    a7.f = z7;
                                                    try {
                                                        a7.m = (byte) (a7.m | 2);
                                                        if (d3 != null) {
                                                            a7.h = new au0(d3);
                                                        }
                                                        a6.j = a7.a();
                                                    } catch (IOException unused4) {
                                                        Objects.toString(k2);
                                                        r18.r(new File((File) r18Var2.d, str11));
                                                        i = 4;
                                                    }
                                                }
                                                os0 a8 = a6.a();
                                                ns0 a9 = a8.a();
                                                a9.g = substring;
                                                qx3 qx3Var3 = a8.k;
                                                if (qx3Var3 != null) {
                                                    ys0 a10 = qx3Var3.a();
                                                    a10.c = substring;
                                                    a9.j = a10.a();
                                                }
                                                a = a9.a();
                                                qx3Var = a.k;
                                            } catch (IOException unused5) {
                                            }
                                            if (qx3Var == null) {
                                                throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                            }
                                            ns0 a11 = a.a();
                                            ys0 a12 = qx3Var.a();
                                            a12.k = arrayList5;
                                            a11.j = a12.a();
                                            os0 a13 = a11.a();
                                            qx3 qx3Var4 = a13.k;
                                            if (qx3Var4 != null) {
                                                vx3.g(z7 ? new File((File) r18Var2.f, ((zs0) qx3Var4).b) : new File((File) r18Var2.e, ((zs0) qx3Var4).b), tx3.a.m(a13));
                                            }
                                            r18.r(new File((File) r18Var2.d, str11));
                                            i = 4;
                                        }
                                    }
                                    r18.r(new File((File) r18Var2.d, str11));
                                    i = 4;
                                }
                                zid zidVar2 = vx3Var2.c.g().a;
                                ArrayList c2 = vx3Var2.c();
                                size = c2.size();
                                if (size > 4) {
                                    return;
                                }
                                Iterator it3 = c2.subList(4, size).iterator();
                                while (it3.hasNext()) {
                                    ((File) it3.next()).delete();
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = r14;
                        }
                    }
                    hic.g(k, "The file has a length of zero for session: " + str3);
                    list2 = Collections.EMPTY_LIST;
                    k89Var.d(list2);
                    final int i522 = 0;
                    e = q8hVar.e(str3, historicalProcessExitReasons, new Predicate() { // from class: o8h
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                            switch (i522) {
                                case 0:
                                    if (applicationExitInfo.getReason() != 6) {
                                        break;
                                    }
                                    break;
                                default:
                                    boolean z62 = applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM");
                                    boolean z72 = applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL;
                                    if (!z62 && !z72) {
                                        break;
                                    }
                                    break;
                            }
                            return false;
                        }
                    });
                    if (e == null) {
                    }
                    if (z2) {
                        ow3Var.a().getClass();
                    }
                    if (Build.VERSION.SDK_INT < 37) {
                    }
                    if (z == 0) {
                    }
                    long currentTimeMillis22 = System.currentTimeMillis() / 1000;
                    vx3 vx3Var22 = q8hVar.b;
                    r18Var2 = vx3Var22.b;
                    r18Var2.c(".com.google.firebase.crashlytics");
                    r18Var2.c(".com.google.firebase.crashlytics-ndk");
                    if (!((String) r18Var2.a).isEmpty()) {
                    }
                    d = vx3Var22.d();
                    if (str != null) {
                    }
                    i4 = i2;
                    if (d.size() > i4) {
                    }
                    while (r6.hasNext()) {
                    }
                    zid zidVar22 = vx3Var22.c.g().a;
                    ArrayList c22 = vx3Var22.c();
                    size = c22.size();
                    if (size > 4) {
                    }
                }
            }
            ow3Var = ow3Var2;
            r18Var = r18Var3;
            arrayList = arrayList2;
        } else {
            ow3Var = ow3Var2;
            r18Var = r18Var3;
            arrayList = arrayList2;
            i = 4;
        }
        i2 = 8;
        i3 = 2;
        if (z2) {
        }
        if (Build.VERSION.SDK_INT < 37) {
        }
        if (z == 0) {
        }
        long currentTimeMillis222 = System.currentTimeMillis() / 1000;
        vx3 vx3Var222 = q8hVar.b;
        r18Var2 = vx3Var222.b;
        r18Var2.c(".com.google.firebase.crashlytics");
        r18Var2.c(".com.google.firebase.crashlytics-ndk");
        if (!((String) r18Var2.a).isEmpty()) {
        }
        d = vx3Var222.d();
        if (str != null) {
        }
        i4 = i2;
        if (d.size() > i4) {
        }
        while (r6.hasNext()) {
        }
        zid zidVar222 = vx3Var222.c.g().a;
        ArrayList c222 = vx3Var222.c();
        size = c222.size();
        if (size > 4) {
        }
    }

    public final void b(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        Map unmodifiableMap;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Locale locale = Locale.US;
        ar9 ar9Var = this.f;
        jd0 jd0Var = this.h;
        fv0 fv0Var = new fv0(ar9Var.c, jd0Var.f, jd0Var.g, ar9Var.c().a, me4.a(jd0Var.d != null ? 4 : 1), jd0Var.h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        hv0 hv0Var = new hv0(k53.v0());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        j53 j53Var = j53.a;
        String str7 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str7)) {
            j53 j53Var2 = (j53) j53.b.get(str7.toLowerCase(locale));
            if (j53Var2 != null) {
                j53Var = j53Var2;
            }
        }
        int ordinal = j53Var.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long X = k53.X(context);
        boolean u0 = k53.u0();
        int l0 = k53.l0();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.j.a.a(new gi3(str, currentTimeMillis, new ev0(fv0Var, hv0Var, new gv0(ordinal, availableProcessors, X, blockCount, u0, l0))));
        if (!bool.booleanValue() || str == null) {
            str2 = str9;
            str3 = str10;
            str4 = str8;
            i = 4;
        } else {
            r18 r18Var = this.d;
            synchronized (((String) r18Var.a)) {
                r18Var.a = str;
                wja wjaVar = (wja) ((AtomicMarkableReference) ((en0) r18Var.d).c).getReference();
                synchronized (wjaVar) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(wjaVar.a));
                }
                str4 = str8;
                str2 = str9;
                str3 = str10;
                i = 4;
                ((xx3) ((hcc) r18Var.c).c).g(new kx0(r18Var, str, unmodifiableMap, ((k89) r18Var.f).c(), 12));
            }
        }
        f4a f4aVar = this.i;
        ((h18) f4aVar.c).a();
        f4aVar.c = f4a.i;
        if (str != null) {
            f4aVar.c = new yif(((r18) f4aVar.b).k(str, "userlog"));
        }
        this.l.a(str);
        q8h q8hVar = this.m;
        sx3 sx3Var = q8hVar.a;
        Charset charset = rx3.a;
        ns0 ns0Var = new ns0();
        ns0Var.a = "20.1.0";
        jd0 jd0Var2 = sx3Var.c;
        String str11 = jd0Var2.a;
        if (str11 == null) {
            yhk.s("Null gmpAppId");
            return;
        }
        ns0Var.b = str11;
        ar9 ar9Var2 = sx3Var.b;
        String str12 = ar9Var2.c().a;
        if (str12 == null) {
            yhk.s("Null installationUuid");
            return;
        }
        ns0Var.d = str12;
        ns0Var.e = ar9Var2.c().b;
        ns0Var.f = ar9Var2.c().c;
        String str13 = jd0Var2.f;
        if (str13 == null) {
            yhk.s("Null buildVersion");
            return;
        }
        ns0Var.h = str13;
        String str14 = jd0Var2.g;
        if (str14 == null) {
            yhk.s("Null displayVersion");
            return;
        }
        ns0Var.i = str14;
        ns0Var.c = i;
        ns0Var.m = (byte) (ns0Var.m | 1);
        ys0 ys0Var = new ys0();
        ys0Var.f = false;
        byte b = (byte) (ys0Var.m | 2);
        ys0Var.d = currentTimeMillis;
        ys0Var.m = (byte) (b | 1);
        if (str == null) {
            yhk.s("Null identifier");
            return;
        }
        ys0Var.b = str;
        String str15 = sx3.g;
        if (str15 == null) {
            yhk.s("Null generator");
            return;
        }
        ys0Var.a = str15;
        String str16 = ar9Var2.c;
        if (str16 == null) {
            yhk.s("Null identifier");
            return;
        }
        fp4 fp4Var = jd0Var2.h;
        String str17 = ar9Var2.c().a;
        tm0 tm0Var = (tm0) fp4Var.c;
        if (tm0Var == null) {
            tm0Var = new tm0(fp4Var);
            fp4Var.c = tm0Var;
        }
        tm0 tm0Var2 = tm0Var;
        String str18 = tm0Var.b;
        if (tm0Var2 == null) {
            tm0Var2 = new tm0(fp4Var);
            fp4Var.c = tm0Var2;
        }
        ys0Var.g = new at0(str16, str13, str14, str17, str18, tm0Var2.c);
        yt0 yt0Var = new yt0();
        yt0Var.a = 3;
        yt0Var.e = (byte) (yt0Var.e | 1);
        if (str5 == null) {
            yhk.s("Null version");
            return;
        }
        yt0Var.b = str5;
        if (str6 == null) {
            yhk.s("Null buildVersion");
            return;
        }
        yt0Var.c = str6;
        yt0Var.d = k53.v0();
        yt0Var.e = (byte) (yt0Var.e | 2);
        ys0Var.i = yt0Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) sx3.f.get(str7.toLowerCase(locale))) != null) {
            i2 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long X2 = k53.X(sx3Var.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean u02 = k53.u0();
        int l02 = k53.l0();
        ct0 ct0Var = new ct0();
        ct0Var.a = i2;
        byte b2 = (byte) (ct0Var.j | 1);
        ct0Var.j = b2;
        if (str4 == null) {
            yhk.s("Null model");
            return;
        }
        ct0Var.b = str4;
        ct0Var.c = availableProcessors2;
        ct0Var.d = X2;
        ct0Var.e = blockCount2;
        ct0Var.f = u02;
        ct0Var.g = l02;
        ct0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str19 = str2;
        if (str19 == null) {
            yhk.s("Null manufacturer");
            return;
        }
        ct0Var.h = str19;
        String str20 = str3;
        if (str20 == null) {
            yhk.s("Null modelClass");
            return;
        }
        ct0Var.i = str20;
        ys0Var.j = ct0Var.a();
        ys0Var.l = 3;
        ys0Var.m = (byte) (ys0Var.m | 4);
        ns0Var.j = ys0Var.a();
        os0 a = ns0Var.a();
        r18 r18Var2 = q8hVar.b.b;
        qx3 qx3Var = a.k;
        if (qx3Var == null) {
            return;
        }
        String str21 = ((zs0) qx3Var).b;
        try {
            vx3.g.getClass();
            vx3.g(r18Var2.k(str21, "report"), tx3.a.m(a));
            File k = r18Var2.k(str21, "start-time");
            long j = ((zs0) qx3Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(k), vx3.e);
            try {
                outputStreamWriter.write("");
                k.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public final void c(final String str) {
        ExecutorService executorService = (ExecutorService) ((xx3) this.e.c).b;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(Collections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new Consumer() { // from class: fw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                jw3.this.f(str, (ProfilingResult) obj2);
            }
        });
    }

    public final String d() {
        NavigableSet d = this.m.b.d();
        if (d.isEmpty()) {
            return null;
        }
        return (String) d.first();
    }

    public final String e() {
        Context context = this.a;
        int q0 = k53.q0(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = q0 == 0 ? null : context.getResources().getString(q0);
        if (string != null) {
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = jw3.class.getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, ProfilingResult profilingResult) {
        int triggerType = profilingResult.getTriggerType();
        try {
            this.g.k(str, triggerType == 8 ? "trigger-type-anomaly" : triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown").createNewFile();
        } catch (IOException unused) {
        }
    }

    public final Task g() {
        Task call;
        ArrayList arrayList = new ArrayList();
        for (File file : r18.s(((File) this.g.c).listFiles(r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new iw3(this, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void h() {
        try {
            String e = e();
            if (e != null) {
                try {
                    ((en0) this.d.e).w("com.crashlytics.version-control-info", e);
                } catch (IllegalArgumentException e2) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e2;
                        }
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    public final void i(Task task) {
        Task task2;
        Task C;
        TaskCompletionSource taskCompletionSource = this.o;
        r18 r18Var = this.m.b.b;
        if (r18.s(((File) r18Var.e).listFiles()).isEmpty() && r18.s(((File) r18Var.f).listFiles()).isEmpty() && r18.s(((File) r18Var.g).listFiles()).isEmpty()) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        rd4 rd4Var = this.b;
        if (rd4Var.i()) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            C = Tasks.forResult(Boolean.TRUE);
        } else {
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (rd4Var.d) {
                task2 = ((TaskCompletionSource) rd4Var.e).getTask();
            }
            C = dy0.C(task2.onSuccessTask(new it7(20)), this.p.getTask());
        }
        C.onSuccessTask((xx3) this.e.b, new z41(this, task, false, 18));
    }
}
