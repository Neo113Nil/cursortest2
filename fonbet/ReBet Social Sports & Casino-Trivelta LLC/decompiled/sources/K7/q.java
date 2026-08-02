package K7;

import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f6342a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final SparseIntArray f6343b = new SparseIntArray(0);

    public static final M a() {
        return new M(0, f6342a.b(), f6343b);
    }

    public final int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
