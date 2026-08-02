package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.LongCompanionObject;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2546a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2547b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2548c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2549d;

    /* renamed from: e, reason: collision with root package name */
    public int f2550e;

    /* renamed from: f, reason: collision with root package name */
    public int f2551f;

    /* renamed from: g, reason: collision with root package name */
    public r1 f2552g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2553h;

    public s1(RecyclerView recyclerView) {
        this.f2553h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2546a = arrayList;
        this.f2547b = null;
        this.f2548c = new ArrayList();
        this.f2549d = DesugarCollections.unmodifiableList(arrayList);
        this.f2550e = 2;
        this.f2551f = 2;
    }

    public static void e(ViewGroup viewGroup, boolean z5) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt, true);
            }
        }
        if (z5) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(d2 d2Var, boolean z5) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(d2Var);
        View view = d2Var.itemView;
        RecyclerView recyclerView = this.f2553h;
        f2 f2Var = recyclerView.mAccessibilityDelegate;
        if (f2Var != null) {
            androidx.core.view.b itemDelegate = f2Var.getItemDelegate();
            androidx.core.view.z0.o(view, itemDelegate instanceof e2 ? (androidx.core.view.b) ((e2) itemDelegate).f2378b.remove(view) : null);
        }
        if (z5) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
            x0 x0Var = recyclerView.mAdapter;
            if (x0Var != null) {
                x0Var.onViewRecycled(d2Var);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(d2Var);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + d2Var);
            }
        }
        d2Var.mBindingAdapter = null;
        d2Var.mOwnerRecyclerView = null;
        r1 c2 = c();
        c2.getClass();
        int itemViewType = d2Var.getItemViewType();
        ArrayList arrayList = c2.a(itemViewType).f2517a;
        if (((q1) c2.f2536a.get(itemViewType)).f2518b <= arrayList.size()) {
            ci.c.g(d2Var.itemView);
        } else {
            if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(d2Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            d2Var.resetInternal();
            arrayList.add(d2Var);
        }
    }

    public final int b(int i5) {
        RecyclerView recyclerView = this.f2553h;
        if (i5 >= 0 && i5 < recyclerView.mState.b()) {
            return !recyclerView.mState.f2601g ? i5 : recyclerView.mAdapterHelper.f(i5, 0);
        }
        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "invalid position ", ". State item count is ");
        r5.append(recyclerView.mState.b());
        r5.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(r5.toString());
    }

    public final r1 c() {
        if (this.f2552g == null) {
            r1 r1Var = new r1();
            r1Var.f2536a = new SparseArray();
            r1Var.f2537b = 0;
            r1Var.f2538c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2552g = r1Var;
            f();
        }
        return this.f2552g;
    }

    public final View d(int i5) {
        return m(i5, LongCompanionObject.MAX_VALUE).itemView;
    }

    public final void f() {
        if (this.f2552g != null) {
            RecyclerView recyclerView = this.f2553h;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            r1 r1Var = this.f2552g;
            r1Var.f2538c.add(recyclerView.mAdapter);
        }
    }

    public final void g(x0 x0Var, boolean z5) {
        r1 r1Var = this.f2552g;
        if (r1Var != null) {
            SparseArray sparseArray = r1Var.f2536a;
            Set set = r1Var.f2538c;
            set.remove(x0Var);
            if (set.size() != 0 || z5) {
                return;
            }
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                ArrayList arrayList = ((q1) sparseArray.get(sparseArray.keyAt(i5))).f2517a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ci.c.g(((d2) arrayList.get(i10)).itemView);
                }
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.f2548c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            d0 d0Var = this.f2553h.mPrefetchRegistry;
            int[] iArr = d0Var.f2367c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            d0Var.f2368d = 0;
        }
    }

    public final void i(int i5) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i5);
        }
        ArrayList arrayList = this.f2548c;
        d2 d2Var = (d2) arrayList.get(i5);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + d2Var);
        }
        a(d2Var, true);
        arrayList.remove(i5);
    }

    public final void j(View view) {
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean isTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f2553h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        k(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
            return;
        }
        recyclerView.mItemAnimator.d(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d4, code lost:
    
        r4 = r4 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(d2 d2Var) {
        boolean z5;
        boolean isScrap = d2Var.isScrap();
        boolean z7 = true;
        RecyclerView recyclerView = this.f2553h;
        if (isScrap || d2Var.itemView.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(d2Var.isScrap());
            sb2.append(" isAttached:");
            sb2.append(d2Var.itemView.getParent() != null);
            sb2.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d2Var.isTmpDetached()) {
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(d2Var);
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, sb3));
        }
        if (d2Var.shouldIgnore()) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        boolean doesTransientStatePreventRecycling = d2Var.doesTransientStatePreventRecycling();
        x0 x0Var = recyclerView.mAdapter;
        boolean z10 = x0Var != null && doesTransientStatePreventRecycling && x0Var.onFailedToRecycleView(d2Var);
        boolean z11 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f2548c;
        if (z11 && arrayList.contains(d2Var)) {
            StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
            sb4.append(d2Var);
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, sb4));
        }
        if (z10 || d2Var.isRecyclable()) {
            if (this.f2551f <= 0 || d2Var.hasAnyOfTheFlags(526)) {
                z5 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f2551f && size > 0) {
                    i(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                    d0 d0Var = recyclerView.mPrefetchRegistry;
                    int i5 = d2Var.mPosition;
                    if (d0Var.f2367c != null) {
                        int i10 = d0Var.f2368d * 2;
                        for (int i11 = 0; i11 < i10; i11 += 2) {
                            if (d0Var.f2367c[i11] == i5) {
                                break;
                            }
                        }
                    }
                    int i12 = size - 1;
                    loop1: while (i12 >= 0) {
                        int i13 = ((d2) arrayList.get(i12)).mPosition;
                        d0 d0Var2 = recyclerView.mPrefetchRegistry;
                        if (d0Var2.f2367c == null) {
                            break;
                        }
                        int i14 = d0Var2.f2368d * 2;
                        for (int i15 = 0; i15 < i14; i15 += 2) {
                            if (d0Var2.f2367c[i15] == i13) {
                                break;
                            }
                        }
                        break loop1;
                    }
                    size = i12 + 1;
                }
                arrayList.add(size, d2Var);
                z5 = true;
            }
            if (z5) {
                z7 = false;
            } else {
                a(d2Var, true);
            }
            r1 = z5;
        } else {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.exceptionLabel());
            }
            z7 = false;
        }
        recyclerView.mViewInfoStore.d(d2Var);
        if (r1 || z7 || !doesTransientStatePreventRecycling) {
            return;
        }
        ci.c.g(d2Var.itemView);
        d2Var.mBindingAdapter = null;
        d2Var.mOwnerRecyclerView = null;
    }

    public final void l(View view) {
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f2553h;
        if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f2547b == null) {
                this.f2547b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f2547b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f2546a.add(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x04ab, code lost:
    
        if ((r12 + r10) >= r29) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d2 m(int i5, long j) {
        d2 d2Var;
        boolean z5;
        boolean z7;
        long j6;
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        Object[] objArr;
        ViewGroup.LayoutParams layoutParams;
        l1 l1Var;
        RecyclerView findNestedRecyclerView;
        d2 d2Var2;
        View view;
        boolean z12;
        int size;
        int f6;
        RecyclerView recyclerView = this.f2553h;
        if (i5 < 0 || i5 >= recyclerView.mState.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i5 + "(" + i5 + "). Item count:" + recyclerView.mState.b() + recyclerView.exceptionLabel());
        }
        if (recyclerView.mState.f2601g) {
            ArrayList arrayList = this.f2547b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        d2Var = (d2) this.f2547b.get(i10);
                        if (!d2Var.wasReturnedFromScrap() && d2Var.getLayoutPosition() == i5) {
                            d2Var.addFlags(32);
                            break;
                        }
                        i10++;
                    } else if (recyclerView.mAdapter.hasStableIds() && (f6 = recyclerView.mAdapterHelper.f(i5, 0)) > 0 && f6 < recyclerView.mAdapter.getItemCount()) {
                        long itemId = recyclerView.mAdapter.getItemId(f6);
                        for (int i11 = 0; i11 < size; i11++) {
                            d2 d2Var3 = (d2) this.f2547b.get(i11);
                            if (!d2Var3.wasReturnedFromScrap() && d2Var3.getItemId() == itemId) {
                                d2Var3.addFlags(32);
                                d2Var = d2Var3;
                                break;
                            }
                        }
                    }
                }
                if (d2Var != null) {
                    z5 = true;
                    ArrayList arrayList2 = this.f2546a;
                    ArrayList arrayList3 = this.f2548c;
                    if (d2Var != null) {
                        int size2 = arrayList2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            d2 d2Var4 = (d2) arrayList2.get(i12);
                            if (!d2Var4.wasReturnedFromScrap() && d2Var4.getLayoutPosition() == i5 && !d2Var4.isInvalid() && (recyclerView.mState.f2601g || !d2Var4.isRemoved())) {
                                d2Var4.addFlags(32);
                                d2Var = d2Var4;
                                z7 = true;
                                break;
                            }
                        }
                        ArrayList arrayList4 = recyclerView.mChildHelper.f2451c;
                        int size3 = arrayList4.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                z7 = true;
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i13);
                            d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                            z7 = true;
                            if (childViewHolderInt.getLayoutPosition() == i5 && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                                break;
                            }
                            i13++;
                        }
                        if (view == null) {
                            int size4 = arrayList3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size4) {
                                    d2Var = null;
                                    break;
                                }
                                d2 d2Var5 = (d2) arrayList3.get(i14);
                                if (d2Var5.isInvalid() || d2Var5.getLayoutPosition() != i5 || d2Var5.isAttachedToTransitionOverlay()) {
                                    i14++;
                                } else {
                                    arrayList3.remove(i14);
                                    if (RecyclerView.sVerboseLoggingEnabled) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i5 + ") found match in cache: " + d2Var5);
                                    }
                                    d2Var = d2Var5;
                                }
                            }
                        } else {
                            d2 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                            k kVar = recyclerView.mChildHelper;
                            j jVar = kVar.f2450b;
                            int indexOfChild = kVar.f2449a.f2572a.indexOfChild(view);
                            if (indexOfChild < 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                            }
                            if (!jVar.e(indexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            jVar.a(indexOfChild);
                            kVar.l(view);
                            int j12 = recyclerView.mChildHelper.j(view);
                            if (j12 == -1) {
                                StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb2.append(childViewHolderInt2);
                                throw new IllegalStateException(androidx.appcompat.widget.c1.k(recyclerView, sb2));
                            }
                            recyclerView.mChildHelper.c(j12);
                            l(view);
                            childViewHolderInt2.addFlags(8224);
                            d2Var = childViewHolderInt2;
                        }
                        if (d2Var != null) {
                            if (!d2Var.isRemoved()) {
                                int i15 = d2Var.mPosition;
                                if (i15 < 0 || i15 >= recyclerView.mAdapter.getItemCount()) {
                                    StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                    sb3.append(d2Var);
                                    throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.k(recyclerView, sb3));
                                }
                                z12 = ((recyclerView.mState.f2601g || recyclerView.mAdapter.getItemViewType(d2Var.mPosition) == d2Var.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || d2Var.getItemId() == recyclerView.mAdapter.getItemId(d2Var.mPosition))) ? z7 : false;
                            } else {
                                if (RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.f2601g) {
                                    throw new IllegalStateException(androidx.appcompat.widget.c1.k(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                                }
                                z12 = recyclerView.mState.f2601g;
                            }
                            if (z12) {
                                z5 = z7;
                            } else {
                                d2Var.addFlags(4);
                                if (d2Var.isScrap()) {
                                    recyclerView.removeDetachedView(d2Var.itemView, false);
                                    d2Var.unScrap();
                                } else if (d2Var.wasReturnedFromScrap()) {
                                    d2Var.clearReturnedFromScrapFlag();
                                }
                                k(d2Var);
                                d2Var = null;
                            }
                        }
                    } else {
                        z7 = true;
                    }
                    if (d2Var != null) {
                        int f10 = recyclerView.mAdapterHelper.f(i5, 0);
                        if (f10 >= 0) {
                            j6 = 3;
                            if (f10 < recyclerView.mAdapter.getItemCount()) {
                                int itemViewType = recyclerView.mAdapter.getItemViewType(f10);
                                if (recyclerView.mAdapter.hasStableIds()) {
                                    long itemId2 = recyclerView.mAdapter.getItemId(f10);
                                    int size5 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size5 >= 0) {
                                            d2 d2Var6 = (d2) arrayList2.get(size5);
                                            if (d2Var6.getItemId() == itemId2 && !d2Var6.wasReturnedFromScrap()) {
                                                j10 = 4;
                                                if (itemViewType == d2Var6.getItemViewType()) {
                                                    d2Var6.addFlags(32);
                                                    if (d2Var6.isRemoved() && !recyclerView.mState.f2601g) {
                                                        d2Var6.setFlags(2, 14);
                                                    }
                                                    d2Var = d2Var6;
                                                } else {
                                                    arrayList2.remove(size5);
                                                    recyclerView.removeDetachedView(d2Var6.itemView, false);
                                                    d2 childViewHolderInt3 = RecyclerView.getChildViewHolderInt(d2Var6.itemView);
                                                    childViewHolderInt3.mScrapContainer = null;
                                                    childViewHolderInt3.mInChangeScrap = false;
                                                    childViewHolderInt3.clearReturnedFromScrapFlag();
                                                    k(childViewHolderInt3);
                                                }
                                            }
                                            size5--;
                                        } else {
                                            j10 = 4;
                                            int size6 = arrayList3.size() - 1;
                                            while (true) {
                                                if (size6 < 0) {
                                                    break;
                                                }
                                                d2 d2Var7 = (d2) arrayList3.get(size6);
                                                if (d2Var7.getItemId() != itemId2 || d2Var7.isAttachedToTransitionOverlay()) {
                                                    size6--;
                                                } else if (itemViewType == d2Var7.getItemViewType()) {
                                                    arrayList3.remove(size6);
                                                    d2Var = d2Var7;
                                                } else {
                                                    i(size6);
                                                }
                                            }
                                            d2Var = null;
                                        }
                                    }
                                    if (d2Var != null) {
                                        d2Var.mPosition = f10;
                                        z5 = z7;
                                    }
                                } else {
                                    j10 = 4;
                                }
                                if (d2Var == null) {
                                    if (RecyclerView.sVerboseLoggingEnabled) {
                                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i5 + ") fetching from shared pool");
                                    }
                                    q1 q1Var = (q1) c().f2536a.get(itemViewType);
                                    if (q1Var != null) {
                                        ArrayList arrayList5 = q1Var.f2517a;
                                        if (!arrayList5.isEmpty()) {
                                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                if (!((d2) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                                    d2Var2 = (d2) arrayList5.remove(size7);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    d2Var2 = null;
                                    if (d2Var2 != null) {
                                        d2Var2.resetInternal();
                                        if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                            View view2 = d2Var2.itemView;
                                            if (view2 instanceof ViewGroup) {
                                                e((ViewGroup) view2, false);
                                            }
                                        }
                                    }
                                    d2Var = d2Var2;
                                }
                                if (d2Var == null) {
                                    long nanoTime = recyclerView.getNanoTime();
                                    if (j != LongCompanionObject.MAX_VALUE) {
                                        long j13 = this.f2552g.a(itemViewType).f2519c;
                                        if (!((j13 == 0 || j13 + nanoTime < j) ? z7 : false)) {
                                            return null;
                                        }
                                    }
                                    d2 createViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(createViewHolder.itemView)) != null) {
                                        createViewHolder.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                                    }
                                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                    q1 a7 = this.f2552g.a(itemViewType);
                                    long j14 = a7.f2519c;
                                    if (j14 != 0) {
                                        nanoTime2 = (nanoTime2 / j10) + ((j14 / j10) * 3);
                                    }
                                    a7.f2519c = nanoTime2;
                                    if (RecyclerView.sVerboseLoggingEnabled) {
                                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                    }
                                    d2Var = createViewHolder;
                                }
                            }
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i5 + "(offset:" + f10 + ").state:" + recyclerView.mState.b() + recyclerView.exceptionLabel());
                    }
                    j6 = 3;
                    j10 = 4;
                    if (z5 && !recyclerView.mState.f2601g && d2Var.hasAnyOfTheFlags(Segment.SIZE)) {
                        d2Var.setFlags(0, Segment.SIZE);
                        if (recyclerView.mState.j) {
                            f1.b(d2Var);
                            f1 f1Var = recyclerView.mItemAnimator;
                            d2Var.getUnmodifiedPayloads();
                            f1Var.getClass();
                            e1 e1Var = new e1();
                            e1Var.a(d2Var);
                            recyclerView.recordAnimationInfoIfBouncedHiddenView(d2Var, e1Var);
                        }
                    }
                    if (!recyclerView.mState.f2601g && d2Var.isBound()) {
                        d2Var.mPreLayoutPosition = i5;
                    } else if (d2Var.isBound() || d2Var.needsUpdate() || d2Var.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && d2Var.isRemoved()) {
                            StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb4.append(d2Var);
                            throw new IllegalStateException(androidx.appcompat.widget.c1.k(recyclerView, sb4));
                        }
                        int f11 = recyclerView.mAdapterHelper.f(i5, 0);
                        d2Var.mBindingAdapter = null;
                        d2Var.mOwnerRecyclerView = recyclerView;
                        int itemViewType2 = d2Var.getItemViewType();
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != LongCompanionObject.MAX_VALUE) {
                            long j15 = this.f2552g.a(itemViewType2).f2520d;
                            if (j15 != 0) {
                            }
                        }
                        if (d2Var.isTmpDetached()) {
                            z10 = false;
                        } else {
                            recyclerView.attachViewToParent(d2Var.itemView, recyclerView.getChildCount(), d2Var.itemView.getLayoutParams());
                            z10 = z7;
                        }
                        recyclerView.mAdapter.bindViewHolder(d2Var, f11);
                        if (z10) {
                            recyclerView.detachViewFromParent(d2Var.itemView);
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        q1 a10 = this.f2552g.a(d2Var.getItemViewType());
                        j11 = a10.f2520d;
                        if (j11 != 0) {
                            nanoTime4 = (nanoTime4 / j10) + ((j11 / j10) * j6);
                        }
                        a10.f2520d = nanoTime4;
                        if (recyclerView.isAccessibilityEnabled()) {
                            z11 = z7;
                        } else {
                            View view3 = d2Var.itemView;
                            if (view3.getImportantForAccessibility() == 0) {
                                z11 = z7;
                                view3.setImportantForAccessibility(z11 ? 1 : 0);
                            } else {
                                z11 = z7;
                            }
                            f2 f2Var = recyclerView.mAccessibilityDelegate;
                            if (f2Var != null) {
                                androidx.core.view.b itemDelegate = f2Var.getItemDelegate();
                                if (itemDelegate instanceof e2) {
                                    e2 e2Var = (e2) itemDelegate;
                                    View.AccessibilityDelegate d10 = androidx.core.view.z0.d(view3);
                                    androidx.core.view.b bVar = d10 != null ? d10 instanceof androidx.core.view.a ? ((androidx.core.view.a) d10).f1279a : new androidx.core.view.b(d10) : null;
                                    if (bVar != null && bVar != e2Var) {
                                        e2Var.f2378b.put(view3, bVar);
                                    }
                                }
                                androidx.core.view.z0.o(view3, itemDelegate);
                            }
                        }
                        if (recyclerView.mState.f2601g) {
                            d2Var.mPreLayoutPosition = i5;
                        }
                        objArr = z11 ? 1 : 0;
                        layoutParams = d2Var.itemView.getLayoutParams();
                        if (layoutParams == null) {
                            l1Var = (l1) recyclerView.generateDefaultLayoutParams();
                            d2Var.itemView.setLayoutParams(l1Var);
                        } else if (recyclerView.checkLayoutParams(layoutParams)) {
                            l1Var = (l1) layoutParams;
                        } else {
                            l1Var = (l1) recyclerView.generateLayoutParams(layoutParams);
                            d2Var.itemView.setLayoutParams(l1Var);
                        }
                        l1Var.f2468a = d2Var;
                        if (z5 || objArr == false) {
                            z11 = false;
                        }
                        l1Var.f2471d = z11;
                        return d2Var;
                    }
                    objArr = false;
                    z11 = z7;
                    layoutParams = d2Var.itemView.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    l1Var.f2468a = d2Var;
                    if (z5) {
                    }
                    z11 = false;
                    l1Var.f2471d = z11;
                    return d2Var;
                }
            }
            d2Var = null;
            if (d2Var != null) {
            }
        } else {
            d2Var = null;
        }
        z5 = false;
        ArrayList arrayList22 = this.f2546a;
        ArrayList arrayList32 = this.f2548c;
        if (d2Var != null) {
        }
        if (d2Var != null) {
        }
        if (z5) {
            d2Var.setFlags(0, Segment.SIZE);
            if (recyclerView.mState.j) {
            }
        }
        if (!recyclerView.mState.f2601g) {
        }
        if (d2Var.isBound()) {
        }
        if (!RecyclerView.sDebugAssertionsEnabled) {
        }
        int f112 = recyclerView.mAdapterHelper.f(i5, 0);
        d2Var.mBindingAdapter = null;
        d2Var.mOwnerRecyclerView = recyclerView;
        int itemViewType22 = d2Var.getItemViewType();
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != LongCompanionObject.MAX_VALUE) {
        }
        if (d2Var.isTmpDetached()) {
        }
        recyclerView.mAdapter.bindViewHolder(d2Var, f112);
        if (z10) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        q1 a102 = this.f2552g.a(d2Var.getItemViewType());
        j11 = a102.f2520d;
        if (j11 != 0) {
        }
        a102.f2520d = nanoTime42;
        if (recyclerView.isAccessibilityEnabled()) {
        }
        if (recyclerView.mState.f2601g) {
        }
        objArr = z11 ? 1 : 0;
        layoutParams = d2Var.itemView.getLayoutParams();
        if (layoutParams == null) {
        }
        l1Var.f2468a = d2Var;
        if (z5) {
        }
        z11 = false;
        l1Var.f2471d = z11;
        return d2Var;
    }

    public final void n(d2 d2Var) {
        if (d2Var.mInChangeScrap) {
            this.f2547b.remove(d2Var);
        } else {
            this.f2546a.remove(d2Var);
        }
        d2Var.mScrapContainer = null;
        d2Var.mInChangeScrap = false;
        d2Var.clearReturnedFromScrapFlag();
    }

    public final void o() {
        k1 k1Var = this.f2553h.mLayout;
        this.f2551f = this.f2550e + (k1Var != null ? k1Var.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f2548c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2551f; size--) {
            i(size);
        }
    }
}
