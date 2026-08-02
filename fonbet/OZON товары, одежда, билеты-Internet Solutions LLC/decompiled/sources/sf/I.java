package sf;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final H f98677a = new H(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    private static final int f98678b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AtomicReference<H>[] f98679c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f98678b = highestOneBit;
        AtomicReference<H>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i11 = 0; i11 < highestOneBit; i11++) {
            atomicReferenceArr[i11] = new AtomicReference<>();
        }
        f98679c = atomicReferenceArr;
    }

    public static final void a(@NotNull H segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f98675f != null || segment.f98676g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f98673d) {
            return;
        }
        AtomicReference<H> atomicReference = f98679c[(int) (Thread.currentThread().getId() & (f98678b - 1))];
        H h11 = f98677a;
        H andSet = atomicReference.getAndSet(h11);
        if (andSet == h11) {
            return;
        }
        int i11 = andSet != null ? andSet.f98672c : 0;
        if (i11 >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        segment.f98675f = andSet;
        segment.f98671b = 0;
        segment.f98672c = i11 + 8192;
        atomicReference.set(segment);
    }

    @NotNull
    public static final H b() {
        AtomicReference<H> atomicReference = f98679c[(int) (Thread.currentThread().getId() & (f98678b - 1))];
        H h11 = f98677a;
        H andSet = atomicReference.getAndSet(h11);
        if (andSet == h11) {
            return new H();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new H();
        }
        atomicReference.set(andSet.f98675f);
        andSet.f98675f = null;
        andSet.f98672c = 0;
        return andSet;
    }
}
