package androidx.recyclerview.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2595a;

    /* renamed from: b, reason: collision with root package name */
    public int f2596b;

    /* renamed from: c, reason: collision with root package name */
    public int f2597c;

    /* renamed from: d, reason: collision with root package name */
    public int f2598d;

    /* renamed from: e, reason: collision with root package name */
    public int f2599e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2600f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2601g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2602h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2603i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2604k;

    /* renamed from: l, reason: collision with root package name */
    public int f2605l;

    /* renamed from: m, reason: collision with root package name */
    public long f2606m;

    /* renamed from: n, reason: collision with root package name */
    public int f2607n;

    public final void a(int i5) {
        if ((this.f2598d & i5) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i5) + " but it is " + Integer.toBinaryString(this.f2598d));
    }

    public final int b() {
        return this.f2601g ? this.f2596b - this.f2597c : this.f2599e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2595a + ", mData=null, mItemCount=" + this.f2599e + ", mIsMeasuring=" + this.f2603i + ", mPreviousLayoutItemCount=" + this.f2596b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2597c + ", mStructureChanged=" + this.f2600f + ", mInPreLayout=" + this.f2601g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f2604k + '}';
    }
}
