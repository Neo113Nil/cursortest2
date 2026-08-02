package androidx.recyclerview.widget;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2365a;

    /* renamed from: b, reason: collision with root package name */
    public int f2366b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2367c;

    /* renamed from: d, reason: collision with root package name */
    public int f2368d;

    public final void a(int i5, int i10) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f2368d;
        int i12 = i11 * 2;
        int[] iArr = this.f2367c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2367c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f2367c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2367c;
        iArr4[i12] = i5;
        iArr4[i12 + 1] = i10;
        this.f2368d++;
    }

    public final void b(RecyclerView recyclerView, boolean z5) {
        this.f2368d = 0;
        int[] iArr = this.f2367c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        k1 k1Var = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || k1Var == null || !k1Var.isItemPrefetchEnabled()) {
            return;
        }
        if (z5) {
            if (!recyclerView.mAdapterHelper.g()) {
                k1Var.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            k1Var.collectAdjacentPrefetchPositions(this.f2365a, this.f2366b, recyclerView.mState, this);
        }
        int i5 = this.f2368d;
        if (i5 > k1Var.mPrefetchMaxCountObserved) {
            k1Var.mPrefetchMaxCountObserved = i5;
            k1Var.mPrefetchMaxObservedInInitialPrefetch = z5;
            recyclerView.mRecycler.o();
        }
    }
}
