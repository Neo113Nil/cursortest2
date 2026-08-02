package m1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8031b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f73930a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f73931b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f73932c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f73933d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f73934e = 0;

    static {
        long j11 = 3;
        long j12 = j11 << 32;
        f73930a = (0 & 4294967295L) | j12;
        f73931b = (1 & 4294967295L) | j12;
        f73932c = j12 | (2 & 4294967295L);
        f73933d = (j11 & 4294967295L) | (4 << 32);
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    @NotNull
    public static String e(long j11) {
        return d(j11, f73930a) ? "Rgb" : d(j11, f73931b) ? "Xyz" : d(j11, f73932c) ? "Lab" : d(j11, f73933d) ? "Cmyk" : "Unknown";
    }
}
