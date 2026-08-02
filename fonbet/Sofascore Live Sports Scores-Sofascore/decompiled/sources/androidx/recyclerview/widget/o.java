package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.am0;
import defpackage.bsk;
import defpackage.drf;
import defpackage.hg6;
import defpackage.hrf;
import defpackage.is8;
import defpackage.lnb;
import defpackage.lrf;
import defpackage.mrf;
import defpackage.mz1;
import defpackage.o9;
import defpackage.p9;
import defpackage.pvd;
import defpackage.qha;
import defpackage.trf;
import defpackage.urf;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public mrf g;
    public final /* synthetic */ RecyclerView h;

    public o(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public static void e(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt, true);
            }
        }
        if (z) {
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

    public final void a(u uVar, boolean z) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(uVar);
        View view = uVar.itemView;
        RecyclerView recyclerView = this.h;
        urf urfVar = recyclerView.mAccessibilityDelegate;
        if (urfVar != null) {
            p9 j = urfVar.j();
            bsk.q(view, j instanceof trf ? (p9) ((trf) j).e.remove(view) : null);
        }
        if (z) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                pvd.j();
                return;
            }
            l lVar = recyclerView.mAdapter;
            if (lVar != null) {
                lVar.onViewRecycled(uVar);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(uVar);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(uVar);
            }
        }
        uVar.mBindingAdapter = null;
        uVar.mOwnerRecyclerView = null;
        mrf c = c();
        c.getClass();
        int itemViewType = uVar.getItemViewType();
        ArrayList arrayList = c.a(itemViewType).a;
        if (((lrf) c.a.get(itemViewType)).b <= arrayList.size()) {
            qha.o(uVar.itemView);
        } else if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(uVar)) {
            a70.p("this scrap item already exists");
        } else {
            uVar.resetInternal();
            arrayList.add(uVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.mState.b()) {
            return !recyclerView.mState.g ? i : recyclerView.mAdapterHelper.f(i, 0);
        }
        StringBuilder t = lnb.t(i, "invalid position ", ". State item count is ");
        t.append(recyclerView.mState.b());
        t.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(t.toString());
    }

    public final mrf c() {
        if (this.g == null) {
            this.g = new mrf();
            f();
        }
        return this.g;
    }

    public final View d(int i) {
        return m(i, Long.MAX_VALUE).itemView;
    }

    public final void f() {
        if (this.g != null) {
            RecyclerView recyclerView = this.h;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            mrf mrfVar = this.g;
            mrfVar.c.add(recyclerView.mAdapter);
        }
    }

    public final void g(l lVar, boolean z) {
        mrf mrfVar = this.g;
        if (mrfVar != null) {
            SparseArray sparseArray = mrfVar.a;
            Set set = mrfVar.c;
            set.remove(lVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((lrf) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    qha.o(((u) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            e eVar = this.h.mPrefetchRegistry;
            int[] iArr = eVar.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            eVar.d = 0;
        }
    }

    public final void i(int i) {
        int i2 = RecyclerView.HORIZONTAL;
        ArrayList arrayList = this.c;
        u uVar = (u) arrayList.get(i);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Objects.toString(uVar);
        }
        a(uVar, true);
        arrayList.remove(i);
    }

    public final void j(View view) {
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean isTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.h;
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

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        r4 = r4 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(u uVar) {
        boolean z;
        boolean isScrap = uVar.isScrap();
        boolean z2 = true;
        RecyclerView recyclerView = this.h;
        if (isScrap || uVar.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(uVar.isScrap());
            sb.append(" isAttached:");
            sb.append(uVar.itemView.getParent() != null);
            sb.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (uVar.isTmpDetached()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(uVar);
            a70.p(mz1.l(recyclerView, sb2));
            return;
        }
        if (uVar.shouldIgnore()) {
            a70.p(mz1.l(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            return;
        }
        boolean doesTransientStatePreventRecycling = uVar.doesTransientStatePreventRecycling();
        l lVar = recyclerView.mAdapter;
        boolean z3 = lVar != null && doesTransientStatePreventRecycling && lVar.onFailedToRecycleView(uVar);
        boolean z4 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList arrayList = this.c;
        if (z4 && arrayList.contains(uVar)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(uVar);
            a70.p(mz1.l(recyclerView, sb3));
            return;
        }
        if (z3 || uVar.isRecyclable()) {
            if (this.f <= 0 || uVar.hasAnyOfTheFlags(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                z = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    i(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                    e eVar = recyclerView.mPrefetchRegistry;
                    int i = uVar.mPosition;
                    if (eVar.c != null) {
                        int i2 = eVar.d * 2;
                        for (int i3 = 0; i3 < i2; i3 += 2) {
                            if (eVar.c[i3] == i) {
                                break;
                            }
                        }
                    }
                    int i4 = size - 1;
                    loop1: while (i4 >= 0) {
                        int i5 = ((u) arrayList.get(i4)).mPosition;
                        e eVar2 = recyclerView.mPrefetchRegistry;
                        if (eVar2.c == null) {
                            break;
                        }
                        int i6 = eVar2.d * 2;
                        for (int i7 = 0; i7 < i6; i7 += 2) {
                            if (eVar2.c[i7] == i5) {
                                break;
                            }
                        }
                        break loop1;
                    }
                    size = i4 + 1;
                }
                arrayList.add(size, uVar);
                z = true;
            }
            if (z) {
                z2 = false;
            } else {
                a(uVar, true);
            }
            r1 = z;
        } else {
            if (RecyclerView.sVerboseLoggingEnabled) {
                recyclerView.exceptionLabel();
            }
            z2 = false;
        }
        recyclerView.mViewInfoStore.d(uVar);
        if (r1 || z2 || !doesTransientStatePreventRecycling) {
            return;
        }
        qha.o(uVar.itemView);
        uVar.mBindingAdapter = null;
        uVar.mOwnerRecyclerView = null;
    }

    public final void l(View view) {
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.h;
        if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            a70.p(mz1.l(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        } else {
            childViewHolderInt.setScrapContainer(this, false);
            this.a.add(childViewHolderInt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x043f, code lost:
    
        if ((r12 + r10) >= r30) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u m(int i, long j) {
        u uVar;
        int i2;
        int i3;
        long j2;
        long j3;
        long j4;
        int i4;
        long j5;
        int i5;
        int i6;
        ViewGroup.LayoutParams layoutParams;
        hrf hrfVar;
        RecyclerView findNestedRecyclerView;
        u uVar2;
        View view;
        u uVar3;
        boolean z;
        int size;
        int f;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.mState.b()) {
            StringBuilder s = lnb.s(i, i, "Invalid item position ", "(", "). Item count:");
            s.append(recyclerView.mState.b());
            s.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(s.toString());
        }
        int i7 = 1;
        if (recyclerView.mState.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i8 = 0;
                while (true) {
                    if (i8 < size) {
                        uVar = (u) this.b.get(i8);
                        if (!uVar.wasReturnedFromScrap() && uVar.getLayoutPosition() == i) {
                            uVar.addFlags(32);
                            break;
                        }
                        i8++;
                    } else if (recyclerView.mAdapter.hasStableIds() && (f = recyclerView.mAdapterHelper.f(i, 0)) > 0 && f < recyclerView.mAdapter.getItemCount()) {
                        long itemId = recyclerView.mAdapter.getItemId(f);
                        for (int i9 = 0; i9 < size; i9++) {
                            u uVar4 = (u) this.b.get(i9);
                            if (!uVar4.wasReturnedFromScrap() && uVar4.getItemId() == itemId) {
                                uVar4.addFlags(32);
                                uVar = uVar4;
                                break;
                            }
                        }
                    }
                }
                if (uVar != null) {
                    i2 = 1;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (uVar == null) {
                        int size2 = arrayList2.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            uVar3 = (u) arrayList2.get(i10);
                            if (!uVar3.wasReturnedFromScrap() && uVar3.getLayoutPosition() == i && !uVar3.isInvalid() && (recyclerView.mState.g || !uVar3.isRemoved())) {
                                uVar3.addFlags(32);
                                break;
                            }
                        }
                        ArrayList arrayList4 = recyclerView.mChildHelper.c;
                        int size3 = arrayList4.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size3) {
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i11);
                            u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                            if (childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                                break;
                            }
                            i11++;
                        }
                        if (view != null) {
                            uVar = RecyclerView.getChildViewHolderInt(view);
                            b bVar = recyclerView.mChildHelper;
                            am0 am0Var = bVar.b;
                            int indexOfChild = ((RecyclerView) bVar.a.b).indexOfChild(view);
                            if (indexOfChild < 0) {
                                is8.c(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (!am0Var.t(indexOfChild)) {
                                hg6.f(view, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            am0Var.o(indexOfChild);
                            bVar.l(view);
                            int j6 = recyclerView.mChildHelper.j(view);
                            if (j6 == -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(uVar);
                                a70.r(mz1.l(recyclerView, sb));
                                return null;
                            }
                            recyclerView.mChildHelper.c(j6);
                            l(view);
                            uVar.addFlags(8224);
                        } else {
                            int size4 = arrayList3.size();
                            for (int i12 = 0; i12 < size4; i12++) {
                                uVar3 = (u) arrayList3.get(i12);
                                if (!uVar3.isInvalid() && uVar3.getLayoutPosition() == i && !uVar3.isAttachedToTransitionOverlay()) {
                                    arrayList3.remove(i12);
                                    if (RecyclerView.sVerboseLoggingEnabled) {
                                        uVar3.toString();
                                    }
                                    uVar = uVar3;
                                }
                            }
                            uVar = null;
                        }
                        if (uVar != null) {
                            if (!uVar.isRemoved()) {
                                int i13 = uVar.mPosition;
                                if (i13 < 0 || i13 >= recyclerView.mAdapter.getItemCount()) {
                                    StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                    sb2.append(uVar);
                                    zzl.r(mz1.l(recyclerView, sb2));
                                    return null;
                                }
                                z = (recyclerView.mState.g || recyclerView.mAdapter.getItemViewType(uVar.mPosition) == uVar.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || uVar.getItemId() == recyclerView.mAdapter.getItemId(uVar.mPosition));
                            } else {
                                if (RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.g) {
                                    a70.r(mz1.l(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                                    return null;
                                }
                                z = recyclerView.mState.g;
                            }
                            if (z) {
                                i2 = 1;
                            } else {
                                uVar.addFlags(4);
                                if (uVar.isScrap()) {
                                    recyclerView.removeDetachedView(uVar.itemView, false);
                                    uVar.unScrap();
                                } else if (uVar.wasReturnedFromScrap()) {
                                    uVar.clearReturnedFromScrapFlag();
                                }
                                k(uVar);
                                uVar = null;
                            }
                        }
                    }
                    if (uVar != null) {
                        j2 = 3;
                        int f2 = recyclerView.mAdapterHelper.f(i, 0);
                        if (f2 < 0 || f2 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder s2 = lnb.s(i, f2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                            s2.append(recyclerView.mState.b());
                            s2.append(recyclerView.exceptionLabel());
                            throw new IndexOutOfBoundsException(s2.toString());
                        }
                        int itemViewType = recyclerView.mAdapter.getItemViewType(f2);
                        j3 = 4;
                        if (recyclerView.mAdapter.hasStableIds()) {
                            long itemId2 = recyclerView.mAdapter.getItemId(f2);
                            int size5 = arrayList2.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    j4 = 0;
                                    u uVar5 = (u) arrayList2.get(size5);
                                    if (uVar5.getItemId() != itemId2 || uVar5.wasReturnedFromScrap()) {
                                        i3 = i7;
                                    } else {
                                        i3 = i7;
                                        if (itemViewType == uVar5.getItemViewType()) {
                                            uVar5.addFlags(32);
                                            if (uVar5.isRemoved() && !recyclerView.mState.g) {
                                                uVar5.setFlags(2, 14);
                                            }
                                            uVar = uVar5;
                                        } else {
                                            arrayList2.remove(size5);
                                            recyclerView.removeDetachedView(uVar5.itemView, false);
                                            u childViewHolderInt2 = RecyclerView.getChildViewHolderInt(uVar5.itemView);
                                            childViewHolderInt2.mScrapContainer = null;
                                            childViewHolderInt2.mInChangeScrap = false;
                                            childViewHolderInt2.clearReturnedFromScrapFlag();
                                            k(childViewHolderInt2);
                                        }
                                    }
                                    size5--;
                                    i7 = i3;
                                } else {
                                    i3 = i7;
                                    j4 = 0;
                                    int size6 = arrayList3.size() - 1;
                                    while (true) {
                                        if (size6 < 0) {
                                            break;
                                        }
                                        u uVar6 = (u) arrayList3.get(size6);
                                        if (uVar6.getItemId() != itemId2 || uVar6.isAttachedToTransitionOverlay()) {
                                            size6--;
                                        } else if (itemViewType == uVar6.getItemViewType()) {
                                            arrayList3.remove(size6);
                                            uVar = uVar6;
                                        } else {
                                            i(size6);
                                        }
                                    }
                                    uVar = null;
                                }
                            }
                            if (uVar != null) {
                                uVar.mPosition = f2;
                                i2 = i3;
                            }
                        } else {
                            i3 = 1;
                            j4 = 0;
                        }
                        if (uVar == null) {
                            int i14 = RecyclerView.HORIZONTAL;
                            lrf lrfVar = (lrf) c().a.get(itemViewType);
                            if (lrfVar != null) {
                                ArrayList arrayList5 = lrfVar.a;
                                if (!arrayList5.isEmpty()) {
                                    for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                        if (!((u) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                            uVar2 = (u) arrayList5.remove(size7);
                                            break;
                                        }
                                    }
                                }
                            }
                            uVar2 = null;
                            if (uVar2 != null) {
                                uVar2.resetInternal();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    View view2 = uVar2.itemView;
                                    if (view2 instanceof ViewGroup) {
                                        e((ViewGroup) view2, false);
                                    }
                                }
                            }
                            uVar = uVar2;
                        }
                        if (uVar == null) {
                            long nanoTime = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j7 = this.g.a(itemViewType).c;
                                if (j7 != j4 && j7 + nanoTime >= j) {
                                    return null;
                                }
                            }
                            u createViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(createViewHolder.itemView)) != null) {
                                createViewHolder.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            lrf a = this.g.a(itemViewType);
                            long j8 = a.c;
                            if (j8 != j4) {
                                nanoTime2 = (nanoTime2 / 4) + ((j8 / 4) * 3);
                            }
                            a.c = nanoTime2;
                            uVar = createViewHolder;
                        }
                    } else {
                        i3 = 1;
                        j2 = 3;
                        j3 = 4;
                        j4 = 0;
                    }
                    if (i2 != 0 && !recyclerView.mState.g && uVar.hasAnyOfTheFlags(8192)) {
                        uVar.setFlags(0, 8192);
                        if (recyclerView.mState.j) {
                            m.b(uVar);
                            m mVar = recyclerView.mItemAnimator;
                            uVar.getUnmodifiedPayloads();
                            mVar.getClass();
                            drf drfVar = new drf();
                            drfVar.a(uVar);
                            recyclerView.recordAnimationInfoIfBouncedHiddenView(uVar, drfVar);
                        }
                    }
                    if (!recyclerView.mState.g && uVar.isBound()) {
                        uVar.mPreLayoutPosition = i;
                    } else if (uVar.isBound() || uVar.needsUpdate() || uVar.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && uVar.isRemoved()) {
                            StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb3.append(uVar);
                            a70.r(mz1.l(recyclerView, sb3));
                            return null;
                        }
                        int f3 = recyclerView.mAdapterHelper.f(i, 0);
                        uVar.mBindingAdapter = null;
                        uVar.mOwnerRecyclerView = recyclerView;
                        int itemViewType2 = uVar.getItemViewType();
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j9 = this.g.a(itemViewType2).d;
                            if (j9 != j4) {
                            }
                        }
                        if (uVar.isTmpDetached()) {
                            i4 = 0;
                        } else {
                            recyclerView.attachViewToParent(uVar.itemView, recyclerView.getChildCount(), uVar.itemView.getLayoutParams());
                            i4 = i3;
                        }
                        recyclerView.mAdapter.bindViewHolder(uVar, f3);
                        if (i4 != 0) {
                            recyclerView.detachViewFromParent(uVar.itemView);
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        lrf a2 = this.g.a(uVar.getItemViewType());
                        j5 = a2.d;
                        if (j5 != j4) {
                            nanoTime4 = (nanoTime4 / j3) + ((j5 / j3) * j2);
                        }
                        a2.d = nanoTime4;
                        if (recyclerView.isAccessibilityEnabled()) {
                            i5 = i3;
                        } else {
                            View view3 = uVar.itemView;
                            if (view3.getImportantForAccessibility() == 0) {
                                i5 = i3;
                                view3.setImportantForAccessibility(i5);
                            } else {
                                i5 = i3;
                            }
                            urf urfVar = recyclerView.mAccessibilityDelegate;
                            if (urfVar != null) {
                                p9 j10 = urfVar.j();
                                if (j10 instanceof trf) {
                                    trf trfVar = (trf) j10;
                                    View.AccessibilityDelegate f4 = bsk.f(view3);
                                    p9 p9Var = f4 != null ? f4 instanceof o9 ? ((o9) f4).a : new p9(f4) : null;
                                    if (p9Var != null && p9Var != trfVar) {
                                        trfVar.e.put(view3, p9Var);
                                    }
                                }
                                bsk.q(view3, j10);
                            }
                        }
                        if (recyclerView.mState.g) {
                            uVar.mPreLayoutPosition = i;
                        }
                        i6 = i5;
                        layoutParams = uVar.itemView.getLayoutParams();
                        if (layoutParams == null) {
                            hrfVar = (hrf) recyclerView.generateDefaultLayoutParams();
                            uVar.itemView.setLayoutParams(hrfVar);
                        } else if (recyclerView.checkLayoutParams(layoutParams)) {
                            hrfVar = (hrf) layoutParams;
                        } else {
                            hrfVar = (hrf) recyclerView.generateLayoutParams(layoutParams);
                            uVar.itemView.setLayoutParams(hrfVar);
                        }
                        hrfVar.a = uVar;
                        hrfVar.d = (i2 != 0 || i6 == 0) ? 0 : i5;
                        return uVar;
                    }
                    i6 = 0;
                    i5 = i3;
                    layoutParams = uVar.itemView.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    hrfVar.a = uVar;
                    hrfVar.d = (i2 != 0 || i6 == 0) ? 0 : i5;
                    return uVar;
                }
            }
            uVar = null;
            if (uVar != null) {
            }
        } else {
            uVar = null;
        }
        i2 = 0;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (uVar == null) {
        }
        if (uVar != null) {
        }
        if (i2 != 0) {
            uVar.setFlags(0, 8192);
            if (recyclerView.mState.j) {
            }
        }
        if (!recyclerView.mState.g) {
        }
        if (uVar.isBound()) {
        }
        if (!RecyclerView.sDebugAssertionsEnabled) {
        }
        int f32 = recyclerView.mAdapterHelper.f(i, 0);
        uVar.mBindingAdapter = null;
        uVar.mOwnerRecyclerView = recyclerView;
        int itemViewType22 = uVar.getItemViewType();
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        if (uVar.isTmpDetached()) {
        }
        recyclerView.mAdapter.bindViewHolder(uVar, f32);
        if (i4 != 0) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        lrf a22 = this.g.a(uVar.getItemViewType());
        j5 = a22.d;
        if (j5 != j4) {
        }
        a22.d = nanoTime42;
        if (recyclerView.isAccessibilityEnabled()) {
        }
        if (recyclerView.mState.g) {
        }
        i6 = i5;
        layoutParams = uVar.itemView.getLayoutParams();
        if (layoutParams == null) {
        }
        hrfVar.a = uVar;
        hrfVar.d = (i2 != 0 || i6 == 0) ? 0 : i5;
        return uVar;
    }

    public final void n(u uVar) {
        if (uVar.mInChangeScrap) {
            this.b.remove(uVar);
        } else {
            this.a.remove(uVar);
        }
        uVar.mScrapContainer = null;
        uVar.mInChangeScrap = false;
        uVar.clearReturnedFromScrapFlag();
    }

    public final void o() {
        n nVar = this.h.mLayout;
        this.f = this.e + (nVar != null ? nVar.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            i(size);
        }
    }
}
