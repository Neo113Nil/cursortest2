package V1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f12358b;
    public final int[] bytesDeviations;

    /* renamed from: c, reason: collision with root package name */
    public final int f12359c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12360d;
    public final int[] millisecondsDeviations;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12358b = i10;
        this.f12359c = i11;
        this.f12360d = i12;
        this.bytesDeviations = iArr;
        this.millisecondsDeviations = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f12358b == lVar.f12358b && this.f12359c == lVar.f12359c && this.f12360d == lVar.f12360d && Arrays.equals(this.bytesDeviations, lVar.bytesDeviations) && Arrays.equals(this.millisecondsDeviations, lVar.millisecondsDeviations)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f12358b) * 31) + this.f12359c) * 31) + this.f12360d) * 31) + Arrays.hashCode(this.bytesDeviations)) * 31) + Arrays.hashCode(this.millisecondsDeviations);
    }
}
