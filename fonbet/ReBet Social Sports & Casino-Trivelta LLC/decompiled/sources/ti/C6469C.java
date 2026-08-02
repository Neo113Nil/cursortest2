package ti;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* renamed from: ti.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6469C {

    /* renamed from: a, reason: collision with root package name */
    public static final C6469C f65841a = new C6469C();

    /* renamed from: b, reason: collision with root package name */
    public static final int f65842b = PKIFailureInfo.notAuthorized;

    /* renamed from: c, reason: collision with root package name */
    public static final C6468B f65843c = new C6468B(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f65844d;

    @NotNull
    private static final AtomicReference<C6468B>[] hashBuckets;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f65844d = highestOneBit;
        AtomicReference<C6468B>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    public static final void b(C6468B segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f65839e != null || segment.f65840f != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f65837c) {
            return;
        }
        AtomicReference a10 = f65841a.a();
        C6468B c6468b = f65843c;
        C6468B c6468b2 = (C6468B) a10.getAndSet(c6468b);
        if (c6468b2 == c6468b) {
            return;
        }
        int i10 = c6468b2 != null ? c6468b2.f65836b : 0;
        if (i10 >= f65842b) {
            a10.set(c6468b2);
            return;
        }
        segment.f65839e = c6468b2;
        segment.f65835a = 0;
        segment.f65836b = i10 + 8192;
        a10.set(segment);
    }

    public static final C6468B c() {
        AtomicReference a10 = f65841a.a();
        C6468B c6468b = f65843c;
        C6468B c6468b2 = (C6468B) a10.getAndSet(c6468b);
        if (c6468b2 == c6468b) {
            return new C6468B();
        }
        if (c6468b2 == null) {
            a10.set(null);
            return new C6468B();
        }
        a10.set(c6468b2.f65839e);
        c6468b2.f65839e = null;
        c6468b2.f65836b = 0;
        return c6468b2;
    }

    public final AtomicReference a() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (f65844d - 1))];
    }
}
