package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f23691e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final qg.g f23692a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.v f23693b;

    /* renamed from: c, reason: collision with root package name */
    public long f23694c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f23695d;

    public t(qg.g descriptor, k2.v readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f23692a = descriptor;
        this.f23693b = readIfAbsent;
        int f6 = descriptor.f();
        if (f6 <= 64) {
            this.f23694c = f6 != 64 ? (-1) << f6 : 0L;
            this.f23695d = f23691e;
            return;
        }
        this.f23694c = 0L;
        int i5 = (f6 - 1) >>> 6;
        long[] jArr = new long[i5];
        if ((f6 & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i5 - 1] = (-1) << f6;
        }
        this.f23695d = jArr;
    }
}
