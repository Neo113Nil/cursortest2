package u4;

import D1.k;
import h1.C4426v;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u4.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6493D extends D1.j {

    /* renamed from: b, reason: collision with root package name */
    public final int f65972b;

    public C6493D(int i10) {
        super(i10);
        this.f65972b = i10;
    }

    @Override // D1.j, D1.k
    public long b(k.c loadErrorInfo) {
        Intrinsics.checkNotNullParameter(loadErrorInfo, "loadErrorInfo");
        String message = loadErrorInfo.f2452c.getMessage();
        if ((loadErrorInfo.f2452c instanceof C4426v) && message != null && (Intrinsics.areEqual(message, "Unable to connect") || Intrinsics.areEqual(message, "Software caused connection abort"))) {
            return 1000L;
        }
        if (loadErrorInfo.f2453d < this.f65972b) {
            return Math.min((r5 - 1) * 1000, 5000L);
        }
        return -9223372036854775807L;
    }

    @Override // D1.j, D1.k
    public int c(int i10) {
        return Integer.MAX_VALUE;
    }
}
