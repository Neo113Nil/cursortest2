package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yr4 implements akd {
    public static final /* synthetic */ long e = rh0.a.objectFieldOffset(yr4.class.getDeclaredField(PlayerKt.E_SPORTS_TOP));
    public final int a;
    public final int b;
    public final AtomicReferenceArray c;
    public final int[] d;

    @NotNull
    private volatile /* synthetic */ long top;

    public yr4(int i) {
        if (i <= 0) {
            ogj.h(ljg.j(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            ogj.h(ljg.j(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.top = 0L;
        int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.a = highestOneBit;
        this.b = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        int i2 = highestOneBit + 1;
        this.c = new AtomicReferenceArray(i2);
        this.d = new int[i2];
    }

    @Override // defpackage.akd
    public final void O0(Object obj) {
        obj.getClass();
        m(obj);
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.b) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.c;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, obj)) {
                yr4 yr4Var = this;
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = yr4Var.a;
                    }
                    i++;
                    this = yr4Var;
                } else {
                    this = yr4Var;
                }
            }
            if (identityHashCode <= 0) {
                a70.p("index should be positive");
                return;
            }
            while (true) {
                long j = this.top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                this.d[identityHashCode] = (int) (4294967295L & j);
                yr4 yr4Var2 = this;
                if (rh0.a.compareAndSwapLong(yr4Var2, e, j, j2)) {
                    return;
                } else {
                    this = yr4Var2;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (k() != null) {
        }
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0009, code lost:
    
        r8 = 0;
        r1 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k() {
        int i;
        yr4 yr4Var;
        while (true) {
            long j = this.top;
            if (j == 0) {
                break;
            }
            long j2 = ((j >> 32) & 4294967295L) + 1;
            i = (int) (4294967295L & j);
            if (i == 0) {
                break;
            }
            yr4Var = this;
            if (rh0.a.compareAndSwapLong(yr4Var, e, j, (j2 << 32) | this.d[i])) {
                break;
            }
            this = yr4Var;
        }
        if (i == 0) {
            return null;
        }
        return yr4Var.c.getAndSet(i, null);
    }

    public void m(Object obj) {
        obj.getClass();
    }

    @Override // defpackage.akd
    public final Object p0() {
        Object e2;
        Object k = k();
        return (k == null || (e2 = e(k)) == null) ? h() : e2;
    }

    public Object e(Object obj) {
        return obj;
    }
}
