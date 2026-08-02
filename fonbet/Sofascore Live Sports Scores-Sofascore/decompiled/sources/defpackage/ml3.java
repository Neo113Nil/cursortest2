package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ml3 implements Sequence {
    public final AtomicReference a;

    public ml3(Sequence sequence) {
        this.a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        a70.r("This sequence can be consumed only once.");
        return null;
    }
}
