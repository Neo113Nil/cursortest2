package androidx.media3.exoplayer.trackselection;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final int f21909a;

    /* renamed from: b, reason: collision with root package name */
    public int f21910b;
    private final C[] trackSelections;

    public D(C... cArr) {
        this.trackSelections = cArr;
        this.f21909a = cArr.length;
    }

    public C a(int i10) {
        return this.trackSelections[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.trackSelections, ((D) obj).trackSelections);
    }

    public int hashCode() {
        if (this.f21910b == 0) {
            this.f21910b = 527 + Arrays.hashCode(this.trackSelections);
        }
        return this.f21910b;
    }
}
