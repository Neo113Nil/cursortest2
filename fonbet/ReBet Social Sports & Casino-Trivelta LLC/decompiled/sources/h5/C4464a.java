package h5;

import E5.b;
import Ph.P;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.coralogix.android.sdk.internal.infrastructure.sysconf.Sysconf;
import f5.C4260a;
import f5.MobileVitalsSnapshot;
import f5.c;
import f5.k;
import java.io.File;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import s5.C6339a;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4464a extends k {

    /* renamed from: h, reason: collision with root package name */
    public final EnumMap f47706h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f47707i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f47708j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f47709k;

    /* renamed from: l, reason: collision with root package name */
    public final int f47710l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f47711m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicLong f47712n;

    /* renamed from: o, reason: collision with root package name */
    public final long f47713o;

    /* renamed from: p, reason: collision with root package name */
    public final RunnableC0713a f47714p;

    /* renamed from: h5.a$a, reason: collision with other inner class name */
    public static final class RunnableC0713a implements Runnable {
        public RunnableC0713a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4464a.this.f47712n.set(Debug.threadCpuTimeNanos() / 1000000);
            } finally {
                if (C4464a.this.B().get()) {
                    C4464a.this.f47711m.postDelayed(this, C4464a.this.f47713o);
                }
            }
        }
    }

    public /* synthetic */ C4464a(long j10, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1000L : j10, (i10 & 2) != 0 ? C6339a.f64787a.a() : p10);
    }

    public static final void a2(LinkedHashMap linkedHashMap, C4464a c4464a, c cVar) {
        Object obj = c4464a.f47706h.get(cVar);
        Intrinsics.checkNotNull(obj);
        MobileVitalsSnapshot c10 = ((C4260a) obj).c(cVar.getUnits());
        if (Double.isNaN(c10.getAvg())) {
            return;
        }
        linkedHashMap.put(cVar, c10);
    }

    @Override // f5.k
    public void A0() {
        this.f47707i = r().a();
        this.f47708j = Y1();
        this.f47711m.post(this.f47714p);
        this.f47709k = this.f47712n.get();
    }

    public void T1() {
        this.f47707i = r().a();
        this.f47708j = -1L;
        this.f47709k = -1L;
        Collection values = this.f47706h.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C4260a) it.next()).b();
        }
    }

    @Override // f5.k
    public void U() {
        this.f47711m.removeCallbacks(this.f47714p);
        this.f47707i = 0L;
        this.f47708j = -1L;
        this.f47709k = -1L;
        Collection values = this.f47706h.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C4260a) it.next()).b();
        }
    }

    public final long Y1() {
        Long longOrNull;
        Long longOrNull2;
        try {
            File[] listFiles = new File("/proc/self/task").listFiles();
            if (listFiles == null) {
                return -1L;
            }
            long j10 = 0;
            for (File file : listFiles) {
                File file2 = new File(file, "stat");
                if (file2.exists()) {
                    try {
                        List split$default = StringsKt.split$default((CharSequence) FilesKt.readText$default(file2, null, 1, null), new String[]{" "}, false, 0, 6, (Object) null);
                        String str = (String) CollectionsKt.getOrNull(split$default, 13);
                        long longValue = (str == null || (longOrNull2 = StringsKt.toLongOrNull(str)) == null) ? 0L : longOrNull2.longValue();
                        String str2 = (String) CollectionsKt.getOrNull(split$default, 14);
                        j10 += longValue + ((str2 == null || (longOrNull = StringsKt.toLongOrNull(str2)) == null) ? 0L : longOrNull.longValue());
                    } catch (Throwable th2) {
                        b.f3006a.c("Failed reading " + file.getName() + "/stat", th2);
                    }
                }
            }
            int clockTicksPerSecond = Sysconf.getClockTicksPerSecond();
            if (clockTicksPerSecond <= 0) {
                return -1L;
            }
            return (j10 * 1000) / clockTicksPerSecond;
        } catch (Throwable th3) {
            b.f3006a.c("CPU read failed", th3);
            return -1L;
        }
    }

    public Map Z1(boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        a2(linkedHashMap, this, c.f46393c);
        a2(linkedHashMap, this, c.f46394d);
        a2(linkedHashMap, this, c.f46395e);
        if (z10) {
            T1();
        }
        return linkedHashMap;
    }

    @Override // k5.InterfaceC5199a
    public void k1() {
        if (B().get()) {
            long a10 = r().a();
            long j10 = a10 - this.f47707i;
            if (j10 <= 0) {
                return;
            }
            long Y12 = Y1();
            long j11 = this.f47712n.get();
            if (this.f47708j >= 0 && this.f47709k >= 0) {
                long j12 = Y12 - this.f47708j;
                long coerceAtLeast = RangesKt.coerceAtLeast(j11 - this.f47709k, 0L);
                long j13 = this.f47710l * j10;
                if (j12 < 0 || j13 <= 0) {
                    b.f3006a.k("CPU sample skipped (appDelta=" + j12 + ", capacity=" + j13 + ", elapsed=" + j10 + ")");
                } else {
                    double d10 = j12;
                    Object obj = this.f47706h.get(c.f46393c);
                    Intrinsics.checkNotNull(obj);
                    ((C4260a) obj).a((d10 / j13) * 100.0d);
                    Object obj2 = this.f47706h.get(c.f46394d);
                    Intrinsics.checkNotNull(obj2);
                    ((C4260a) obj2).a(d10);
                    Object obj3 = this.f47706h.get(c.f46395e);
                    Intrinsics.checkNotNull(obj3);
                    ((C4260a) obj3).a(coerceAtLeast);
                }
            }
            this.f47707i = a10;
            this.f47708j = Y12;
            this.f47709k = j11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4464a(long j10, P detectorScope) {
        super(j10, detectorScope, null, 4, null);
        Intrinsics.checkNotNullParameter(detectorScope, "detectorScope");
        EnumMap enumMap = new EnumMap(c.class);
        enumMap.put((EnumMap) c.f46393c, (c) new C4260a(0, 1, null));
        enumMap.put((EnumMap) c.f46394d, (c) new C4260a(0, 1, null));
        enumMap.put((EnumMap) c.f46395e, (c) new C4260a(0, 1, null));
        this.f47706h = enumMap;
        this.f47708j = -1L;
        this.f47709k = -1L;
        this.f47710l = Math.max(1, Runtime.getRuntime().availableProcessors());
        this.f47711m = new Handler(Looper.getMainLooper());
        this.f47712n = new AtomicLong(0L);
        this.f47713o = 250L;
        this.f47714p = new RunnableC0713a();
    }
}
