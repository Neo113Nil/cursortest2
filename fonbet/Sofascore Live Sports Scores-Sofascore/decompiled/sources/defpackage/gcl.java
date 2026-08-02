package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gcl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = rh0.a;
        f = unsafe.objectFieldOffset(gcl.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(gcl.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(gcl.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(gcl.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(gcl.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(gcl.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final yti a(yti ytiVar) {
        if (b() == 127) {
            return ytiVar;
        }
        if (ytiVar.b) {
            c.incrementAndGet(this);
        }
        int intVolatile = rh0.a.getIntVolatile(this, g) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, ytiVar);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return rh0.a.getIntVolatile(this, g) - rh0.a.getIntVolatile(this, e);
    }

    public final yti c() {
        yti ytiVar;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
            gcl gclVar = this;
            if (unsafe.compareAndSwapInt(gclVar, j, intVolatile, intVolatile + 1) && (ytiVar = (yti) gclVar.a.getAndSet(i, null)) != null) {
                if (ytiVar.b) {
                    c.decrementAndGet(gclVar);
                }
                return ytiVar;
            }
            this = gclVar;
        }
    }

    public final yti d(int i, boolean z) {
        int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        AtomicReferenceArray atomicReferenceArray = this.a;
        yti ytiVar = (yti) atomicReferenceArray.get(i2);
        if (ytiVar != null && ytiVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ytiVar, null)) {
                if (atomicReferenceArray.get(i2) != ytiVar) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return ytiVar;
        }
        return null;
    }
}
