package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h0i extends AtomicReferenceArray implements mhh {
    public static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int a;
    public final AtomicLong b;
    public long c;
    public final AtomicLong d;
    public final int e;

    public h0i(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
    }

    @Override // defpackage.ohh
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.b.get() == this.d.get();
    }

    @Override // defpackage.ohh
    public final boolean offer(Object obj) {
        if (obj == null) {
            yhk.s("Null is not a valid element");
            return false;
        }
        AtomicLong atomicLong = this.b;
        long j = atomicLong.get();
        int i = this.a;
        int i2 = ((int) j) & i;
        if (j >= this.c) {
            long j2 = this.e + j;
            if (get(i & ((int) j2)) == null) {
                this.c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // defpackage.ohh
    public final Object poll() {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
