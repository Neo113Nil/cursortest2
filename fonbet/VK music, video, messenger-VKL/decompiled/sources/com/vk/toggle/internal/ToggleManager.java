package com.vk.toggle.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.ads.BuildConfig;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import com.vk.toggle.c;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.internal.a;
import com.vkontakte.android.VKApplication;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.asp;
import xsna.b0r0;
import xsna.b340;
import xsna.bpn0;
import xsna.bvq;
import xsna.bx9;
import xsna.c0g;
import xsna.c340;
import xsna.c5g;
import xsna.ck40;
import xsna.d0r0;
import xsna.dk40;
import xsna.drm0;
import xsna.epx;
import xsna.er4;
import xsna.eti;
import xsna.f93;
import xsna.g7r0;
import xsna.gzs;
import xsna.ha3;
import xsna.izs;
import xsna.j1k0;
import xsna.kb8;
import xsna.m0p0;
import xsna.n1p0;
import xsna.nb60;
import xsna.ndp0;
import xsna.o3y;
import xsna.ob60;
import xsna.q58;
import xsna.qoy;
import xsna.qs3;
import xsna.r0p0;
import xsna.rgl0;
import xsna.rq6;
import xsna.s3q0;
import xsna.s7f0;
import xsna.sf3;
import xsna.tv4;
import xsna.twi;
import xsna.up;
import xsna.urd0;
import xsna.v53;
import xsna.w220;
import xsna.wuq;
import xsna.xdj;
import xsna.xuq;
import xsna.xys;
import xsna.zrp;

/* compiled from: ToggleManager.kt */
/* loaded from: classes11.dex */
public class ToggleManager implements r0p0 {
    public static final a z = new a();
    public final c0g a;
    public final w220 b;
    public volatile c c;
    public volatile Sync d;
    public final LinkedHashSet e;
    public final d<Sync> f;
    public final y g;
    public volatile com.vk.toggle.c h;
    public volatile twi i;
    public volatile b j;
    public volatile Lazy<? extends xuq> k;
    public final LinkedHashMap l;
    public volatile int m;
    public bvq n;
    public b.InterfaceC1925b o;
    public Lazy<? extends w> p;
    public final HashMap<String, b.d> q;
    public final HashSet<String> r;
    public final ConcurrentHashMap<Class<?>, List<b.d>> s;
    public final HashSet<String> t;
    public final bpn0 u;
    public io.reactivex.rxjava3.disposables.b v;
    public final ReentrantReadWriteLock w;
    public final ArrayBlockingQueue<n1p0> x;
    public volatile boolean y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToggleManager.kt */
    public static final class DevicePerformanceClass {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DevicePerformanceClass[] $VALUES;
        public static final DevicePerformanceClass HIGH;
        public static final DevicePerformanceClass LOW;
        public static final DevicePerformanceClass MEDIUM;
        public static final DevicePerformanceClass UNKNOWN;
        private final int hashWeight;
        private final String jsonName;

        static {
            DevicePerformanceClass devicePerformanceClass = new DevicePerformanceClass("LOW", 0, 1, "low");
            LOW = devicePerformanceClass;
            DevicePerformanceClass devicePerformanceClass2 = new DevicePerformanceClass("MEDIUM", 1, 2, "medium");
            MEDIUM = devicePerformanceClass2;
            DevicePerformanceClass devicePerformanceClass3 = new DevicePerformanceClass("HIGH", 2, 3, "high");
            HIGH = devicePerformanceClass3;
            DevicePerformanceClass devicePerformanceClass4 = new DevicePerformanceClass(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, 0, BuildConfig.FLAVOR);
            UNKNOWN = devicePerformanceClass4;
            DevicePerformanceClass[] devicePerformanceClassArr = {devicePerformanceClass, devicePerformanceClass2, devicePerformanceClass3, devicePerformanceClass4};
            $VALUES = devicePerformanceClassArr;
            $ENTRIES = new asp(devicePerformanceClassArr);
        }

        public DevicePerformanceClass(String str, int i, int i2, String str2) {
            this.hashWeight = i2;
            this.jsonName = str2;
        }

        public static DevicePerformanceClass valueOf(String str) {
            return (DevicePerformanceClass) Enum.valueOf(DevicePerformanceClass.class, str);
        }

        public static DevicePerformanceClass[] values() {
            return (DevicePerformanceClass[]) $VALUES.clone();
        }

        public final int h() {
            return this.hashWeight;
        }

        public final String i() {
            return this.jsonName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToggleManager.kt */
    public static final class DevicePerformanceMetric {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DevicePerformanceMetric[] $VALUES;
        public static final DevicePerformanceMetric CPU;
        public static final a Companion;
        public static final DevicePerformanceMetric DISK;
        public static final DevicePerformanceMetric OVERALL;
        public static final DevicePerformanceMetric RAM;
        private final String jsonName;

        /* compiled from: ToggleManager.kt */
        public static final class a {
        }

        static {
            DevicePerformanceMetric devicePerformanceMetric = new DevicePerformanceMetric("CPU", 0, "cpu");
            CPU = devicePerformanceMetric;
            DevicePerformanceMetric devicePerformanceMetric2 = new DevicePerformanceMetric("DISK", 1, "disk");
            DISK = devicePerformanceMetric2;
            DevicePerformanceMetric devicePerformanceMetric3 = new DevicePerformanceMetric("RAM", 2, "ram");
            RAM = devicePerformanceMetric3;
            DevicePerformanceMetric devicePerformanceMetric4 = new DevicePerformanceMetric("OVERALL", 3, "overall");
            OVERALL = devicePerformanceMetric4;
            DevicePerformanceMetric[] devicePerformanceMetricArr = {devicePerformanceMetric, devicePerformanceMetric2, devicePerformanceMetric3, devicePerformanceMetric4};
            $VALUES = devicePerformanceMetricArr;
            $ENTRIES = new asp(devicePerformanceMetricArr);
            Companion = new a();
        }

        public DevicePerformanceMetric(String str, int i, String str2) {
            this.jsonName = str2;
        }

        public static DevicePerformanceMetric valueOf(String str) {
            return (DevicePerformanceMetric) Enum.valueOf(DevicePerformanceMetric.class, str);
        }

        public static DevicePerformanceMetric[] values() {
            return (DevicePerformanceMetric[]) $VALUES.clone();
        }

        public final String h() {
            return this.jsonName;
        }
    }

    /* compiled from: ToggleManager.kt */
    public static final class IllegalToggleException extends IllegalArgumentException {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToggleManager.kt */
    public static final class Sync {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Sync[] $VALUES;
        public static final Sync Done;
        public static final Sync Empty;
        public static final Sync InProgress;
        public static final Sync NotSynced;

        /* compiled from: ToggleManager.kt */
        @FunctionalInterface
        /* loaded from: classes6.dex */
        public interface a {
            void a(Sync sync);
        }

        static {
            Sync sync = new Sync("Empty", 0);
            Empty = sync;
            Sync sync2 = new Sync("NotSynced", 1);
            NotSynced = sync2;
            Sync sync3 = new Sync("InProgress", 2);
            InProgress = sync3;
            Sync sync4 = new Sync("Done", 3);
            Done = sync4;
            Sync[] syncArr = {sync, sync2, sync3, sync4};
            $VALUES = syncArr;
            $ENTRIES = new asp(syncArr);
        }

        public Sync() {
            throw null;
        }

        public static Sync valueOf(String str) {
            return (Sync) Enum.valueOf(Sync.class, str);
        }

        public static Sync[] values() {
            return (Sync[]) $VALUES.clone();
        }
    }

    /* compiled from: ToggleManager.kt */
    public static final class a {
    }

    /* compiled from: ToggleManager.kt */
    public static final class b {
        public final Lazy<xuq> a;
        public final boolean b;
        public final Lazy<Long> c;
        public final String d;
        public final Lazy<bvq> e;
        public final gzs<b.InterfaceC1925b> f;
        public final Lazy<w> g;
        public final Lazy<Boolean> h;
        public final izs<DevicePerformanceMetric, DevicePerformanceClass> i;

        public b() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Lazy<? extends xuq> lazy, boolean z, Lazy<Long> lazy2, String str, Lazy<? extends bvq> lazy3, gzs<? extends b.InterfaceC1925b> gzsVar, Lazy<? extends w> lazy4, Lazy<Boolean> lazy5, izs<? super DevicePerformanceMetric, ? extends DevicePerformanceClass> izsVar) {
            this.a = lazy;
            this.b = z;
            this.c = lazy2;
            this.d = str;
            this.e = lazy3;
            this.f = gzsVar;
            this.g = lazy4;
            this.h = lazy5;
            this.i = izsVar;
        }

        public static b a(b bVar, int i) {
            return new b(bVar.a, bVar.b, bVar.c, (i & 8) != 0 ? bVar.d : "anonymous", bVar.e, bVar.f, bVar.g, bVar.h, bVar.i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + g7r0.a(this.h, g7r0.a(this.g, sf3.a(g7r0.a(this.e, urd0.a(g7r0.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(storageRepositoryProvider=");
            sb.append(this.a);
            sb.append(", shouldPreloaded=");
            sb.append(this.b);
            sb.append(", timeoutDuringUpdatingMs=");
            sb.append(this.c);
            sb.append(", storageName=");
            sb.append(this.d);
            sb.append(", features=");
            sb.append(this.e);
            sb.append(", featureSourceProvider=");
            sb.append(this.f);
            sb.append(", toggleScheduler=");
            sb.append(this.g);
            sb.append(", debugTogglesEnabled=");
            sb.append(this.h);
            sb.append(", devicePerformanceProvider=");
            return up.c(sb, this.i, ')');
        }
    }

    /* compiled from: ToggleManager.kt */
    public static final class c {
        public final Set<String> a;
        public final Executor b;
        public final izs<Throwable, s3q0> c;

        public c(Set set, ExecutorService executorService, izs izsVar) {
            this.a = set;
            this.b = executorService;
            this.c = izsVar;
        }
    }

    public ToggleManager() {
        this("uninitialized");
    }

    @Override // xsna.r0p0
    public boolean a(b.a aVar) {
        boolean e = ndp0.e();
        if (e) {
            ndp0.b("ToggleManager.isFeatureEnabled " + aVar.getKey());
        }
        try {
            b.d j = j(aVar.getKey(), false);
            return j != null ? j.a : false;
        } finally {
            if (e) {
                Trace.endSection();
            }
        }
    }

    @Override // xsna.r0p0
    public final boolean b() {
        ReentrantReadWriteLock.ReadLock readLock = this.w.readLock();
        readLock.lock();
        try {
            return this.d == Sync.Done;
        } finally {
            readLock.unlock();
        }
    }

    public final boolean c() {
        ReentrantReadWriteLock.ReadLock readLock = this.w.readLock();
        readLock.lock();
        try {
            return this.d == Sync.NotSynced;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r3.equals(r6 != null ? r6 : "") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(b.d dVar) {
        String obj = dVar.b.toString();
        b.d dVar2 = (b.d) this.l.get(obj);
        CharSequence charSequence = dVar.b;
        String obj2 = charSequence.toString();
        HashSet<String> hashSet = this.r;
        boolean contains = hashSet.contains(obj2);
        if (dVar2 != null && !contains) {
            if (dVar2.a == dVar.a) {
                String obj3 = dVar2.c.toString();
                if (obj3 == null) {
                    obj3 = "";
                }
                String obj4 = dVar.c.toString();
            }
            L.F(new j1k0(3, dVar, dVar2));
            hashSet.add(charSequence.toString());
        }
        return !r1.containsKey(charSequence.toString());
    }

    public final void e() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.w;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Sync sync = Sync.NotSynced;
            t(sync);
            this.f.onNext(sync);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void f(String str) {
        if (str.length() == 0) {
            str = "default_storage";
        }
        b bVar = this.j;
        if (bVar == null) {
            bVar = null;
        }
        g(str, bVar.a).removeAll();
        b.InterfaceC1925b interfaceC1925b = this.o;
        if (interfaceC1925b == null) {
            interfaceC1925b = null;
        }
        interfaceC1925b.getClass();
        String i = this.h.i();
        Lazy<? extends xuq> lazy = this.k;
        this.h = g(i, lazy != null ? lazy : null);
    }

    public final eti g(String str, Lazy lazy) {
        return new eti(new s7f0(str, lazy), this.b);
    }

    public final long h() {
        bvq bvqVar = this.n;
        if (bvqVar == null) {
            bvqVar = null;
        }
        int i = 0;
        long hashCode = Arrays.hashCode(bvqVar.getSupportedFeatures().toArray(new String[0]));
        long j = 31;
        DevicePerformanceMetric[] values = DevicePerformanceMetric.values();
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            DevicePerformanceMetric devicePerformanceMetric = values[i2];
            int i4 = i3 + 1;
            b bVar = this.j;
            if (bVar == null) {
                bVar = null;
            }
            i2 = tv4.a(arrayList, bVar.i.invoke(devicePerformanceMetric).h() << (i3 * 2), i2, 1);
            i3 = i4;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return (j * i) + hashCode;
    }

    public final b.d i(b.a aVar) {
        return j(aVar.getKey(), false);
    }

    public final b.d j(String str, boolean z2) {
        Set<String> set;
        Trace.beginSection(ndp0.f("ToggleManager.getFeatureImpl"));
        try {
            boolean z3 = this.y;
            c cVar = this.c;
            if (cVar != null && (set = cVar.a) != null && !set.contains(str) && !z3) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"Add " + str + " to important list, located in FeatureManagerInitTaskLogic, or wait when cache was warmup"});
                }
            }
            b.d dVar = this.i.a.get(str);
            if (dVar == null) {
                if (!this.y && this.j != null) {
                    b bVar = this.j;
                    if (bVar == null) {
                        bVar = null;
                    }
                    if (bVar.h.getValue().booleanValue()) {
                        dVar = this.h.b(str, true);
                    }
                }
                dVar = null;
            }
            b.d dVar2 = this.q.get(str);
            if (dVar2 == null && ((z2 || !this.l.containsKey(str)) && this.h.j(str, false))) {
                L.e("toggle read from file ".concat(str));
                b.d b2 = this.h.e().a.b(str, false);
                if (b2 == null) {
                    b2 = new b.d(str);
                }
                dVar2 = b2;
                if (d(dVar2)) {
                    this.q.put(str, dVar2);
                }
            }
            b0r0.d.getClass();
            if (!d0r0.b(dVar2, dVar)) {
                dVar = dVar2;
            } else if (dVar != null) {
                L.e("toggle use user value " + dVar.b.toString() + " ~ " + dVar.a);
            }
            this.l.put(str, dVar);
            if (!z3 && dVar != null) {
                this.a.a(dVar);
            }
            Trace.endSection();
            return dVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final wuq k() {
        return (wuq) this.u.getValue();
    }

    /* JADX WARN: Finally extract failed */
    @SuppressLint({"CheckResult"})
    public synchronized void l(b bVar) {
        Executor executor;
        Trace.beginSection(ndp0.f("ToggleManager.init"));
        try {
            this.j = bVar;
            this.p = bVar.g;
            this.k = bVar.a;
            String str = bVar.d;
            if (str.length() == 0) {
                str = "default_storage";
            }
            Lazy<? extends xuq> lazy = this.k;
            if (lazy == null) {
                lazy = null;
            }
            final s7f0 s7f0Var = new s7f0(str, lazy);
            this.h = new eti(s7f0Var, this.b);
            this.n = bVar.e.getValue();
            int i = 0;
            this.y = false;
            final er4 er4Var = new er4(this, 6);
            Runnable runnable = new Runnable() { // from class: xsna.r7f0
                @Override // java.lang.Runnable
                public final void run() {
                    s7f0 s7f0Var2 = s7f0.this;
                    er4 er4Var2 = er4Var;
                    ReentrantReadWriteLock.ReadLock readLock = s7f0Var2.g.readLock();
                    readLock.lock();
                    try {
                        er4Var2.invoke();
                        s7f0Var2.h.set(true);
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                        readLock.unlock();
                    }
                }
            };
            c cVar = this.c;
            if (cVar == null || (executor = cVar.b) == null) {
                runnable.run();
                this.o = bVar.f.invoke();
            } else {
                executor.execute(runnable);
                w220 w220Var = this.b;
                c cVar2 = this.c;
                w220Var.f = cVar2 != null ? cVar2.c : null;
                ReentrantReadWriteLock reentrantReadWriteLock = this.w;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    t(Sync.NotSynced);
                    s3q0 s3q0Var = s3q0.a;
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    this.f.onNext(Sync.NotSynced);
                    this.o = bVar.f.invoke();
                    h hVar = k().a;
                    Lazy<? extends w> lazy2 = this.p;
                    int i3 = 2;
                    hVar.r0((lazy2 != null ? lazy2 : null).getValue()).b0(a.c.class).subscribe(new f93(new qs3(this, i3), i3), new nb60(new xdj(i3), 1));
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void m() {
        Trace.beginSection(ndp0.f("ToggleManager.loadAllToggles"));
        try {
            this.q.clear();
            this.s.clear();
            this.h.h(new m0p0(this, 0), false);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void n(q<b.c> qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.w;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Sync sync = this.d;
            Sync sync2 = Sync.InProgress;
            if (sync == sync2) {
                L.G("toggles: already start updating!");
                return;
            }
            L.p("toggles: start updating...");
            t(sync2);
            this.f.onNext(sync2);
            s3q0 s3q0Var = s3q0.a;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            Lazy<? extends w> lazy = this.p;
            if (lazy == null) {
                lazy = null;
            }
            int i3 = 3;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.a0(lazy.getValue()).subscribe(new q58(new ob60(this, i3), i3), new c340(new b340(this, 2), i3));
            io.reactivex.rxjava3.disposables.b bVar = this.v;
            if (bVar == null || bVar.c) {
                bVar = new io.reactivex.rxjava3.disposables.b();
                this.v = bVar;
            }
            bVar.b(subscribe);
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void o(final ClipsFeatures clipsFeatures) {
        if (this.t.contains(clipsFeatures.getKey())) {
            return;
        }
        b.InterfaceC1925b interfaceC1925b = this.o;
        if (interfaceC1925b == null) {
            interfaceC1925b = null;
        }
        final com.vk.toggle.b bVar = (com.vk.toggle.b) this;
        io.reactivex.rxjava3.disposables.c subscribe = interfaceC1925b.b(clipsFeatures).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.l0p0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                bVar.t.add(clipsFeatures.getKey());
            }
        }, new o3y(new rgl0(10), 24));
        io.reactivex.rxjava3.disposables.b bVar2 = this.v;
        if (bVar2 == null || bVar2.c) {
            bVar2 = new io.reactivex.rxjava3.disposables.b();
            this.v = bVar2;
        }
        bVar2.b(subscribe);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005d -> B:30:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b.d p(b.d dVar) {
        String str;
        String obj = dVar.c.toString();
        if (drm0.E(obj, '{') && (drm0.D(obj, "metric", false) || drm0.D(obj, "models", false))) {
            try {
                JSONObject jSONObject = new JSONObject(obj);
                if (jSONObject.has("metric")) {
                    str = q(jSONObject);
                } else if (jSONObject.has("models") && jSONObject.has("value")) {
                    str = new Regex(jSONObject.optString("models")).f(Build.MODEL) ? jSONObject.getString("value") : jSONObject.getString(BuildConfig.FLAVOR);
                }
            } catch (Throwable th) {
                L.i(th);
            }
            if (str != null) {
                obj = str;
            }
            return !epx.f(obj, dVar.c.toString()) ? dVar : new b.d(dVar.b.toString(), obj, dVar.a);
        }
        str = obj;
        if (str != null) {
        }
        if (!epx.f(obj, dVar.c.toString())) {
        }
    }

    public final String q(JSONObject jSONObject) throws JSONException {
        DevicePerformanceMetric devicePerformanceMetric;
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        DevicePerformanceMetric.a aVar = DevicePerformanceMetric.Companion;
        String string = jSONObject.getString("metric");
        aVar.getClass();
        DevicePerformanceMetric[] values = DevicePerformanceMetric.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                devicePerformanceMetric = null;
                break;
            }
            devicePerformanceMetric = values[i];
            if (epx.f(devicePerformanceMetric.h(), string)) {
                break;
            }
            i++;
        }
        if (devicePerformanceMetric == null) {
            return null;
        }
        b bVar = this.j;
        String optString = jSONObject.optString((bVar != null ? bVar : null).i.invoke(devicePerformanceMetric).i());
        return optString.length() == 0 ? jSONObject.getString(DevicePerformanceClass.UNKNOWN.i()) : optString;
    }

    public final void r(HashSet<String> hashSet, HashSet<b.d> hashSet2, Map<String, ? extends b.d> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends b.d> entry : map.entrySet()) {
            twi twiVar = this.i;
            if (!twiVar.a.containsKey(entry.getKey()) && !hashSet.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        s(linkedHashMap.values());
        ArrayList arrayList = new ArrayList();
        Iterator<b.d> it = hashSet2.iterator();
        while (it.hasNext()) {
            b.d next = it.next();
            twi twiVar2 = this.i;
            if (!twiVar2.a.containsKey(next.b.toString())) {
                arrayList.add(next);
            }
        }
        s(arrayList);
        this.s.clear();
    }

    public final void s(Collection<? extends b.d> collection) {
        for (b.d dVar : collection) {
            if (d(dVar)) {
                this.q.put(dVar.b.toString(), dVar);
            }
        }
        this.h.g(collection);
        this.s.clear();
    }

    public final void t(Sync sync) {
        this.d = sync;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Sync.a) it.next()).a(sync);
        }
    }

    public final io.reactivex.rxjava3.disposables.c u(gzs gzsVar, kb8 kb8Var) {
        return k().a.b0(a.c.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ck40(new ha3(gzsVar, 2), 1), new dk40(new xys(kb8Var, 3), 2));
    }

    public final b.c v() {
        int i;
        synchronized (this) {
            try {
                long a2 = this.h.a();
                long h = h();
                Integer valueOf = Integer.valueOf(this.h.getVersion());
                if (a2 != h) {
                    valueOf = null;
                }
                this.m = valueOf != null ? valueOf.intValue() : 0;
                i = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        bvq bvqVar = this.n;
        ArrayList supportedFeatures = (bvqVar != null ? bvqVar : null).getSupportedFeatures();
        ArrayList arrayList = new ArrayList(c5g.u(supportedFeatures, 10));
        Iterator it = supportedFeatures.iterator();
        while (it.hasNext()) {
            arrayList.add(new b.d((String) it.next()));
        }
        return new b.c(i, arrayList);
    }

    public final void w(b.c cVar) {
        Throwable th;
        int i;
        long currentTimeMillis;
        int i2;
        ToggleManager toggleManager;
        Trace.beginSection(ndp0.f("ToggleManager.sync"));
        try {
            i = cVar.a;
            currentTimeMillis = System.currentTimeMillis();
            this.h.f(h());
            i2 = 0;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (this.m != i) {
                this.m = i;
                this.h.setVersion(i);
                HashSet<b.d> hashSet = new HashSet<>();
                List<b.d> list = cVar.b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(p((b.d) it.next()));
                    } catch (Throwable th3) {
                        th = th3;
                        Trace.endSection();
                        throw th;
                    }
                }
                hashSet.addAll(arrayList);
                bvq bvqVar = this.n;
                if (bvqVar == null) {
                    bvqVar = null;
                }
                Map<String, ? extends b.d> a2 = bvqVar.a();
                HashSet<String> hashSet2 = new HashSet<>();
                Iterator<b.d> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(it2.next().b.toString());
                }
                this.h.h(new v53(24, a2, this), false);
                toggleManager = this;
                this.h.h(new bx9(hashSet2, hashSet, a2, toggleManager, 4), true);
                r(hashSet2, hashSet, a2);
            } else {
                toggleManager = this;
                L.e("toggles: version is same!");
            }
            bvq bvqVar2 = toggleManager.n;
            (bvqVar2 != null ? bvqVar2 : null).getClass();
            ReentrantReadWriteLock reentrantReadWriteLock = toggleManager.w;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                t(Sync.Done);
                s3q0 s3q0Var = s3q0.a;
                while (i2 < readHoldCount) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
                ArrayBlockingQueue<n1p0> arrayBlockingQueue = toggleManager.x;
                List<b.d> list2 = cVar.b;
                ArrayList arrayList2 = new ArrayList(cVar.b.size());
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((b.d) it3.next()).b.toString());
                }
                arrayBlockingQueue.offer(new n1p0(arrayList2));
                k().a.onNext(a.c.a);
                toggleManager.f.onNext(Sync.Done);
                L.e("toggles: sync time=" + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                s3q0 s3q0Var2 = s3q0.a;
                Trace.endSection();
            } catch (Throwable th4) {
                while (i2 < readHoldCount) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            Trace.endSection();
            throw th;
        }
    }

    public final synchronized void x() {
        Object obj;
        try {
            b.c v = v();
            Iterator<T> it = v.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                b.d dVar = (b.d) obj;
                if (!epx.f(drm0.p0(dVar.b.toString()).toString(), dVar.b.toString())) {
                    break;
                }
            }
            b.d dVar2 = (b.d) obj;
            if (dVar2 != null) {
                throw new IllegalToggleException("Invalid toggle key: ".concat(dVar2.b.toString()));
            }
            b.InterfaceC1925b interfaceC1925b = this.o;
            if (interfaceC1925b == null) {
                interfaceC1925b = null;
            }
            n(interfaceC1925b.a(v, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public ToggleManager(String str) {
        this.a = new c0g();
        w220 w220Var = new w220(str);
        w220Var.b();
        this.b = w220Var;
        Sync sync = Sync.Empty;
        this.d = sync;
        this.e = new LinkedHashSet();
        d<Sync> O0 = d.O0(sync);
        this.f = O0;
        this.g = new y(new z0(O0), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        com.vk.toggle.c.a.getClass();
        c.a.C1926a c1926a = c.a.b;
        this.h = c1926a;
        this.i = new twi(0);
        this.l = new LinkedHashMap();
        this.q = new HashMap<>();
        this.r = new HashSet<>();
        this.s = new ConcurrentHashMap<>();
        this.t = new HashSet<>();
        this.u = new bpn0(new rq6(11));
        this.w = new ReentrantReadWriteLock();
        this.x = new ArrayBlockingQueue<>(5);
        this.h = new eti(c1926a, w220Var);
    }
}
