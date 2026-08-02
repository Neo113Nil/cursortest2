package mh;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import mh.f;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* renamed from: mh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5587c implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final b f56606e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f56607f;

    /* renamed from: a, reason: collision with root package name */
    public final int f56608a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56610c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f56611d;

    @NotNull
    private final int[] next;
    private volatile long top;

    /* renamed from: mh.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    static {
        AtomicLongFieldUpdater newUpdater = AtomicLongFieldUpdater.newUpdater(AbstractC5587c.class, new MutablePropertyReference1Impl() { // from class: mh.c.a
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((AbstractC5587c) obj).top);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((AbstractC5587c) obj).top = ((Number) obj2).longValue();
            }
        }.getName());
        Intrinsics.checkNotNullExpressionValue(newUpdater, "newUpdater(Owner::class.java, p.name)");
        f56607f = newUpdater;
    }

    public AbstractC5587c(int i10) {
        this.f56608a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i10).toString());
        }
        if (i10 > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i10).toString());
        }
        int highestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
        this.f56609b = highestOneBit;
        this.f56610c = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        this.f56611d = new AtomicReferenceArray(highestOneBit + 1);
        this.next = new int[highestOneBit + 1];
    }

    public final boolean A0(Object obj) {
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f56610c) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            if (AbstractC5586b.a(this.f56611d, identityHashCode, null, obj)) {
                w0(identityHashCode);
                return true;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.f56609b;
            }
        }
        return false;
    }

    public void B(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    public void D0(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    public final int J() {
        long j10;
        long j11;
        int i10;
        do {
            j10 = this.top;
            if (j10 == 0) {
                return 0;
            }
            j11 = ((j10 >> 32) & BodyPartID.bodyIdMax) + 1;
            i10 = (int) (BodyPartID.bodyIdMax & j10);
            if (i10 == 0) {
                return 0;
            }
        } while (!f56607f.compareAndSet(this, j10, (j11 << 32) | this.next[i10]));
        return i10;
    }

    @Override // mh.f
    public final void O1(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        D0(instance);
        if (A0(instance)) {
            return;
        }
        B(instance);
    }

    public abstract Object U();

    @Override // mh.f
    public final Object V0() {
        Object r10;
        Object z02 = z0();
        return (z02 == null || (r10 = r(z02)) == null) ? U() : r10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    @Override // mh.f
    public final void dispose() {
        while (true) {
            Object z02 = z0();
            if (z02 == null) {
                return;
            } else {
                B(z02);
            }
        }
    }

    public Object r(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    public final void w0(int i10) {
        long j10;
        long j11;
        if (i10 <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j10 = this.top;
            j11 = ((j10 >> 32) & BodyPartID.bodyIdMax) + 1;
            this.next[i10] = (int) (BodyPartID.bodyIdMax & j10);
        } while (!f56607f.compareAndSet(this, j10, (j11 << 32) | i10));
    }

    public final Object z0() {
        int J10 = J();
        if (J10 == 0) {
            return null;
        }
        return this.f56611d.getAndSet(J10, null);
    }
}
