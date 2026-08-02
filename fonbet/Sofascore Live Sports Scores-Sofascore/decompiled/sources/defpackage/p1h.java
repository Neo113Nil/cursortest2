package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class p1h {
    public static final a1h a = new a1h(new byte[0], 0, 0, null);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        int intValue;
        int i = 0;
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        int i2 = highestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        c = i3;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", Intrinsics.c(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        property.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(property);
        if (intOrNull != null && (intValue = intOrNull.intValue()) >= 0) {
            i = intValue;
        }
        d = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        e = i4;
        f = new AtomicReferenceArray(highestOneBit);
        g = new AtomicReferenceArray(i3);
    }

    public static final void a(a1h a1hVar) {
        a1h a1hVar2 = a;
        a1hVar.getClass();
        if (a1hVar.f != null || a1hVar.g != null) {
            a70.p("Failed requirement.");
            return;
        }
        gsf gsfVar = a1hVar.d;
        if (gsfVar != null && gsfVar.a != 0) {
            int decrementAndGet = gsf.b.decrementAndGet(gsfVar);
            if (decrementAndGet >= 0) {
                return;
            }
            if (decrementAndGet != -1) {
                ilg.e(decrementAndGet + 1, "Shared copies count is negative: ");
                return;
            }
            gsfVar.a = 0;
        }
        AtomicReferenceArray atomicReferenceArray = f;
        int id = (int) ((b - 1) & Thread.currentThread().getId());
        a1hVar.b = 0;
        a1hVar.e = true;
        while (true) {
            a1h a1hVar3 = (a1h) atomicReferenceArray.get(id);
            if (a1hVar3 != a1hVar2) {
                int i = a1hVar3 != null ? a1hVar3.c : 0;
                if (i < 65536) {
                    a1hVar.f = a1hVar3;
                    a1hVar.c = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, a1hVar3, a1hVar)) {
                        if (atomicReferenceArray.get(id) != a1hVar3) {
                            break;
                        }
                    }
                    return;
                }
                if (d <= 0) {
                    return;
                }
                a1hVar.b = 0;
                a1hVar.e = true;
                int id2 = (int) ((c - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = g;
                int i2 = 0;
                while (true) {
                    a1h a1hVar4 = (a1h) atomicReferenceArray2.get(id2);
                    if (a1hVar4 != a1hVar2) {
                        int i3 = (a1hVar4 != null ? a1hVar4.c : 0) + 8192;
                        if (i3 <= e) {
                            a1hVar.f = a1hVar4;
                            a1hVar.c = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, a1hVar4, a1hVar)) {
                                if (atomicReferenceArray2.get(id2) != a1hVar4) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i4 = c;
                        if (i2 >= i4) {
                            return;
                        }
                        i2++;
                        id2 = (id2 + 1) & (i4 - 1);
                    }
                }
            }
        }
    }

    public static final a1h b() {
        AtomicReferenceArray atomicReferenceArray;
        a1h a1hVar;
        a1h a1hVar2;
        int id = (int) ((b - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            a1hVar = a;
            a1hVar2 = (a1h) atomicReferenceArray.getAndSet(id, a1hVar);
        } while (Intrinsics.c(a1hVar2, a1hVar));
        if (a1hVar2 != null) {
            atomicReferenceArray.set(id, a1hVar2.f);
            a1hVar2.f = null;
            a1hVar2.c = 0;
            return a1hVar2;
        }
        atomicReferenceArray.set(id, null);
        if (d <= 0) {
            return new a1h();
        }
        int i = c;
        int id2 = (int) (Thread.currentThread().getId() & (i - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = g;
            a1h a1hVar3 = (a1h) atomicReferenceArray2.getAndSet(id2, a1hVar);
            if (!Intrinsics.c(a1hVar3, a1hVar)) {
                if (a1hVar3 != null) {
                    atomicReferenceArray2.set(id2, a1hVar3.f);
                    a1hVar3.f = null;
                    a1hVar3.c = 0;
                    return a1hVar3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new a1h();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }
}
