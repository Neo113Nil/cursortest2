package androidx.recyclerview.widget;

import defpackage.a70;
import defpackage.frf;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e implements frf {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            a70.p("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            a70.p("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        n nVar = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || nVar == null || !nVar.isItemPrefetchEnabled()) {
            return;
        }
        if (z) {
            if (!recyclerView.mAdapterHelper.g()) {
                nVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            nVar.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView.mState, this);
        }
        int i = this.d;
        if (i > nVar.mPrefetchMaxCountObserved) {
            nVar.mPrefetchMaxCountObserved = i;
            nVar.mPrefetchMaxObservedInInitialPrefetch = z;
            recyclerView.mRecycler.o();
        }
    }
}
