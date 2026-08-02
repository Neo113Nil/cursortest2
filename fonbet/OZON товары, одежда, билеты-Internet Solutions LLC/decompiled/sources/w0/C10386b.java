package w0;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10386b {

    /* renamed from: a, reason: collision with root package name */
    private final int f103252a;

    public C10386b(int i11) {
        this.f103252a = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException(T7.E.a(i11, "Provided count ", " should be larger than zero").toString());
        }
    }

    @NotNull
    public final ArrayList a(int i11, int i12) {
        int i13 = this.f103252a;
        int i14 = i11 - ((i13 - 1) * i12);
        int i15 = i14 / i13;
        int i16 = i14 % i13;
        ArrayList arrayList = new ArrayList(i13);
        int i17 = 0;
        while (i17 < i13) {
            arrayList.add(Integer.valueOf((i17 < i16 ? 1 : 0) + i15));
            i17++;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10386b) {
            return this.f103252a == ((C10386b) obj).f103252a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f103252a;
    }
}
