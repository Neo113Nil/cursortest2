package defpackage;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q8h {
    public final sx3 a;
    public final vx3 b;
    public final fg4 c;
    public final f4a d;
    public final r18 e;
    public final ar9 f;
    public final hcc g;

    public q8h(sx3 sx3Var, vx3 vx3Var, fg4 fg4Var, f4a f4aVar, r18 r18Var, ar9 ar9Var, hcc hccVar) {
        this.a = sx3Var;
        this.b = vx3Var;
        this.c = fg4Var;
        this.d = f4aVar;
        this.e = r18Var;
        this.f = ar9Var;
        this.g = hccVar;
    }

    public static ft0 a(ft0 ft0Var, f4a f4aVar, r18 r18Var, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        et0 a = ft0Var.a();
        String q = ((h18) f4aVar.c).q();
        if (q != null) {
            a.e = new tt0(q);
        }
        boolean isEmpty = map.isEmpty();
        en0 en0Var = (en0) r18Var.d;
        if (isEmpty) {
            wja wjaVar = (wja) ((AtomicMarkableReference) en0Var.c).getReference();
            synchronized (wjaVar) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(wjaVar.a));
            }
        } else {
            wja wjaVar2 = (wja) ((AtomicMarkableReference) en0Var.c).getReference();
            synchronized (wjaVar2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(wjaVar2.a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            for (Map.Entry entry : map.entrySet()) {
                String a2 = wja.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a2)) {
                    hashMap.put(a2, wja.a(1024, (String) entry.getValue()));
                }
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List f = f(unmodifiableMap2);
        wja wjaVar3 = (wja) ((AtomicMarkableReference) ((en0) r18Var.e).c).getReference();
        synchronized (wjaVar3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(wjaVar3.a));
        }
        List f2 = f(unmodifiableMap3);
        if (!f.isEmpty() || !f2.isEmpty()) {
            gt0 a3 = ft0Var.c.a();
            a3.b = f;
            a3.c = f2;
            a.c = a3.a();
        }
        return a.a();
    }

    public static nx3 b(ft0 ft0Var, r18 r18Var) {
        List c = ((k89) r18Var.f).c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c.size(); i++) {
            y5g y5gVar = (y5g) c.get(i);
            y5gVar.getClass();
            ut0 ut0Var = new ut0();
            zu0 zu0Var = (zu0) y5gVar;
            String str = zu0Var.e;
            if (str == null) {
                yhk.s("Null variantId");
                return null;
            }
            String str2 = zu0Var.b;
            if (str2 == null) {
                yhk.s("Null rolloutId");
                return null;
            }
            ut0Var.a = new wt0(str2, str);
            String str3 = zu0Var.c;
            if (str3 == null) {
                yhk.s("Null parameterKey");
                return null;
            }
            ut0Var.b = str3;
            ut0Var.c = zu0Var.d;
            ut0Var.d = zu0Var.f;
            ut0Var.e = (byte) (ut0Var.e | 1);
            arrayList.add(ut0Var.a());
        }
        if (arrayList.isEmpty()) {
            return ft0Var;
        }
        et0 a = ft0Var.a();
        a.f = new xt0(arrayList);
        return a.a();
    }

    public static String c(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static q8h d(Context context, ar9 ar9Var, r18 r18Var, jd0 jd0Var, f4a f4aVar, r18 r18Var2, wj9 wj9Var, ng2 ng2Var, k1d k1dVar, ew3 ew3Var, hcc hccVar) {
        sx3 sx3Var = new sx3(context, ar9Var, jd0Var, wj9Var, ng2Var);
        vx3 vx3Var = new vx3(r18Var, ng2Var, ew3Var);
        tx3 tx3Var = fg4.b;
        gyj.b(context);
        return new q8h(sx3Var, vx3Var, new fg4(new kzf(gyj.a().c(new zc2(fg4.c, fg4.d)).a("FIREBASE_CRASHLYTICS_REPORT", new kn5("json"), fg4.e), ng2Var.g(), k1dVar)), f4aVar, r18Var2, ar9Var, hccVar);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                yhk.s("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                yhk.s("Null value");
                return null;
            }
            arrayList.add(new ts0(str, str2));
        }
        Collections.sort(arrayList, new m39(7));
        return Collections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.b.b.k(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo b = hg6.b(it.next());
            if (b.getTimestamp() >= lastModified && predicate.test(b)) {
                return b;
            }
        }
        return null;
    }

    public final void g(Throwable th, Thread thread, String str, v36 v36Var, boolean z) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean equals = str.equals("crash");
        long j = v36Var.b;
        sx3 sx3Var = this.a;
        Context context = sx3Var.a;
        int i = context.getResources().getConfiguration().orientation;
        wj9 wj9Var = sx3Var.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        g7h g7hVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            g7hVar = new g7h(th3.getLocalizedMessage(), th3.getClass().getName(), wj9Var.e(th3.getStackTrace()), g7hVar, 23);
        }
        g7h g7hVar2 = g7hVar;
        et0 et0Var = new et0();
        et0Var.b = str;
        et0Var.a = j;
        et0Var.g = (byte) (et0Var.g | 1);
        gx3 b = z7f.a.b(context);
        int i2 = ((qt0) b).c;
        Boolean valueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList a = z7f.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) g7hVar2.d;
        String name = thread.getName();
        if (name == null) {
            yhk.s("Null name");
            return;
        }
        List d = sx3.d(stackTraceElementArr, 4);
        if (d == null) {
            yhk.s("Null frames");
            return;
        }
        arrayList.add(new mt0(4, name, d));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                } else {
                    StackTraceElement[] e = wj9Var.e(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        yhk.s("Null name");
                        return;
                    }
                    it = it2;
                    List d2 = sx3.d(e, 0);
                    if (d2 == null) {
                        yhk.s("Null frames");
                        return;
                    }
                    arrayList.add(new mt0(0, name2, d2));
                }
                it2 = it;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        kt0 c = sx3.c(g7hVar2, 0);
        lt0 e2 = sx3.e();
        List a2 = sx3Var.a();
        if (a2 == null) {
            yhk.s("Null binaries");
            return;
        }
        et0Var.c = new ht0(new it0(unmodifiableList, c, null, null, e2, a2), null, null, valueOf, b, a, i);
        et0Var.d = sx3Var.b(i);
        ft0 a3 = et0Var.a();
        Map map = v36Var.c;
        f4a f4aVar = this.d;
        r18 r18Var = this.e;
        nx3 b2 = b(a(a3, f4aVar, r18Var, map), r18Var);
        if (z) {
            this.b.e(b2, v36Var.a, equals);
        } else {
            ((xx3) this.g.c).g(new q12(this, b2, v36Var, equals, 2));
        }
    }

    public final Task h(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList c = this.b.c();
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                tx3 tx3Var = vx3.g;
                String f = vx3.f(file);
                tx3Var.getClass();
                arrayList.add(new ps0(tx3.j(f), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ps0 ps0Var = (ps0) it2.next();
            if (str == null || str.equals(ps0Var.b)) {
                fg4 fg4Var = this.c;
                os0 os0Var = ps0Var.a;
                if (os0Var.f == null || os0Var.g == null) {
                    h48 b = this.f.b(true);
                    os0 os0Var2 = ps0Var.a;
                    String str2 = b.a;
                    ns0 a = os0Var2.a();
                    a.e = str2;
                    os0 a2 = a.a();
                    String str3 = b.b;
                    ns0 a3 = a2.a();
                    a3.f = str3;
                    ps0Var = new ps0(a3.a(), ps0Var.b, ps0Var.c);
                }
                boolean z = str != null;
                kzf kzfVar = fg4Var.a;
                synchronized (kzfVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z) {
                            ((AtomicInteger) kzfVar.i.b).getAndIncrement();
                            if (kzfVar.f.size() < kzfVar.e) {
                                kzfVar.f.size();
                                kzfVar.g.execute(new lv4(8, kzfVar, ps0Var, taskCompletionSource));
                                taskCompletionSource.trySetResult(ps0Var);
                            } else {
                                kzfVar.a();
                                ((AtomicInteger) kzfVar.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(ps0Var);
                            }
                        } else {
                            kzfVar.b(ps0Var, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new ilg(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
