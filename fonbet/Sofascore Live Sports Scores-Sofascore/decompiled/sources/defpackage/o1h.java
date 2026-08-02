package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class o1h {
    public static final b1h a = new b1h(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(b1h b1hVar) {
        b1hVar.getClass();
        if (b1hVar.f != null || b1hVar.g != null) {
            a70.p("Failed requirement.");
            return;
        }
        if (b1hVar.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        b1h b1hVar2 = a;
        b1h b1hVar3 = (b1h) atomicReference.getAndSet(b1hVar2);
        if (b1hVar3 == b1hVar2) {
            return;
        }
        int i = b1hVar3 != null ? b1hVar3.c : 0;
        if (i >= 65536) {
            atomicReference.set(b1hVar3);
            return;
        }
        b1hVar.f = b1hVar3;
        b1hVar.b = 0;
        b1hVar.c = i + 8192;
        atomicReference.set(b1hVar);
    }

    public static final b1h b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        b1h b1hVar = a;
        b1h b1hVar2 = (b1h) atomicReference.getAndSet(b1hVar);
        if (b1hVar2 == b1hVar) {
            return new b1h();
        }
        if (b1hVar2 == null) {
            atomicReference.set(null);
            return new b1h();
        }
        atomicReference.set(b1hVar2.f);
        b1hVar2.f = null;
        b1hVar2.c = 0;
        return b1hVar2;
    }
}
