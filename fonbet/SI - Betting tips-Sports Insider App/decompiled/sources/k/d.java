package k;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f18593a;

    /* renamed from: b, reason: collision with root package name */
    public int f18594b;

    /* renamed from: c, reason: collision with root package name */
    public int f18595c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        int i5 = (int) ((f6 * this.f18595c) + 0.5f);
        int i10 = this.f18594b;
        int[] iArr = this.f18593a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i5 < i12) {
                break;
            }
            i5 -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i5 / this.f18595c : 0.0f);
    }
}
