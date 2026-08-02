package j5;

import Ph.P;
import android.os.Debug;
import f5.C4260a;
import f5.MobileVitalsSnapshot;
import f5.g;
import f5.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import s5.C6339a;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5093a extends k {

    /* renamed from: h, reason: collision with root package name */
    public final EnumMap f53666h;

    public /* synthetic */ C5093a(long j10, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1000L : j10, (i10 & 2) != 0 ? C6339a.f64787a.a() : p10);
    }

    public static final void T1(LinkedHashMap linkedHashMap, C5093a c5093a, g gVar) {
        Object obj = c5093a.f53666h.get(gVar);
        Intrinsics.checkNotNull(obj);
        MobileVitalsSnapshot c10 = ((C4260a) obj).c(gVar.getUnits());
        if (Double.isNaN(c10.getAvg())) {
            return;
        }
        linkedHashMap.put(gVar, c10);
    }

    public static final long m1() {
        String str;
        Long longOrNull;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/self/status")), Charsets.UTF_8), 8192);
            try {
                Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    str = it.next();
                    if (StringsKt.startsWith$default(str, "VmRSS:", false, 2, (Object) null)) {
                        break;
                    }
                }
                String str2 = str;
                if (str2 == null) {
                    CloseableKt.closeFinally(bufferedReader, null);
                    return -1L;
                }
                String str3 = (String) CollectionsKt.getOrNull(new Regex("\\s+").split(StringsKt.trim((CharSequence) str2).toString(), 0), 1);
                long longValue = (str3 == null || (longOrNull = StringsKt.toLongOrNull(str3)) == null) ? -1L : longOrNull.longValue();
                CloseableKt.closeFinally(bufferedReader, null);
                return longValue;
            } finally {
            }
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static final long n1() {
        String str;
        Long longOrNull;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/meminfo")), Charsets.UTF_8), 8192);
            try {
                Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    str = it.next();
                    if (StringsKt.startsWith$default(str, "MemTotal:", false, 2, (Object) null)) {
                        break;
                    }
                }
                String str2 = str;
                if (str2 == null) {
                    CloseableKt.closeFinally(bufferedReader, null);
                    return -1L;
                }
                String str3 = (String) CollectionsKt.getOrNull(new Regex("\\s+").split(StringsKt.trim((CharSequence) str2).toString(), 0), 1);
                long longValue = (str3 == null || (longOrNull = StringsKt.toLongOrNull(str3)) == null) ? -1L : longOrNull.longValue();
                CloseableKt.closeFinally(bufferedReader, null);
                return longValue;
            } finally {
            }
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public void D0() {
        Collection values = this.f53666h.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C4260a) it.next()).b();
        }
    }

    @Override // f5.k
    public void U() {
        Collection values = this.f53666h.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C4260a) it.next()).b();
        }
    }

    @Override // k5.InterfaceC5199a
    public void k1() {
        C4260a c4260a;
        C4260a c4260a2;
        if (B().get()) {
            long m12 = m1();
            if (m12 > 0) {
                C4260a c4260a3 = (C4260a) this.f53666h.get(g.f46403c);
                if (c4260a3 != null) {
                    c4260a3.a(m12 / 1024.0d);
                }
                long n12 = n1();
                if (n12 > 0) {
                    double d10 = (m12 / n12) * 100.0d;
                    C4260a c4260a4 = (C4260a) this.f53666h.get(g.f46404d);
                    if (c4260a4 != null) {
                        c4260a4.a(d10);
                    }
                }
            }
            Runtime runtime = Runtime.getRuntime();
            long freeMemory = runtime.totalMemory() - runtime.freeMemory();
            long maxMemory = runtime.maxMemory();
            double d11 = (freeMemory / 1024.0d) / 1024.0d;
            double d12 = (maxMemory / 1024.0d) / 1024.0d;
            if (d12 > 0.0d) {
                double d13 = (d11 / d12) * 100.0d;
                C4260a c4260a5 = (C4260a) this.f53666h.get(g.f46405e);
                if (c4260a5 != null) {
                    c4260a5.a(d12);
                }
                C4260a c4260a6 = (C4260a) this.f53666h.get(g.f46406f);
                if (c4260a6 != null) {
                    c4260a6.a(d11);
                }
                C4260a c4260a7 = (C4260a) this.f53666h.get(g.f46407g);
                if (c4260a7 != null) {
                    c4260a7.a(d13);
                }
            }
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            double d14 = memoryInfo.dalvikPss;
            double d15 = memoryInfo.nativePss;
            if (d14 >= 0.0d && (c4260a2 = (C4260a) this.f53666h.get(g.f46408h)) != null) {
                c4260a2.a(d14);
            }
            if (d15 < 0.0d || (c4260a = (C4260a) this.f53666h.get(g.f46409i)) == null) {
                return;
            }
            c4260a.a(d15);
        }
    }

    public Map y1(boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(7);
        T1(linkedHashMap, this, g.f46403c);
        T1(linkedHashMap, this, g.f46404d);
        T1(linkedHashMap, this, g.f46405e);
        T1(linkedHashMap, this, g.f46406f);
        T1(linkedHashMap, this, g.f46407g);
        T1(linkedHashMap, this, g.f46408h);
        T1(linkedHashMap, this, g.f46409i);
        if (z10) {
            D0();
        }
        return linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5093a(long j10, P detectorScope) {
        super(j10, detectorScope, null, 4, null);
        Intrinsics.checkNotNullParameter(detectorScope, "detectorScope");
        EnumMap enumMap = new EnumMap(g.class);
        enumMap.put((EnumMap) g.f46403c, (g) new C4260a(0, 1, null));
        enumMap.put((EnumMap) g.f46404d, (g) new C4260a(0, 1, null));
        enumMap.put((EnumMap) g.f46405e, (g) new C4260a(0, 1, null));
        enumMap.put((EnumMap) g.f46406f, (g) new C4260a(0, 1, null));
        enumMap.put((EnumMap) g.f46407g, (g) new C4260a(0, 1, null));
        enumMap.put((EnumMap) g.f46408h, (g) new C4260a(0, 1, null));
        enumMap.put((EnumMap) g.f46409i, (g) new C4260a(0, 1, null));
        this.f53666h = enumMap;
    }
}
