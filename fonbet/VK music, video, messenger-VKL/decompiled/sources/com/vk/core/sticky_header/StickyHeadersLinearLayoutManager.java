package com.vk.core.sticky_header;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.recycler.CatalogStickyRecyclerPaginatedView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.sticky_header.a;
import com.vk.core.ui.themes.VKTheme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.dhr0;
import xsna.fgh0;
import xsna.fpf0;
import xsna.g5g;
import xsna.iah0;
import xsna.mhy;
import xsna.njf0;
import xsna.pb00;
import xsna.pd90;
import xsna.rfc;
import xsna.sv1;
import xsna.vel0;
import xsna.wel0;

/* JADX WARN: Incorrect field signature: TT; */
/* compiled from: StickyHeadersLinearLayoutManager.kt */
/* loaded from: classes17.dex */
public class StickyHeadersLinearLayoutManager<T extends RecyclerView.Adapter<?> & vel0> extends LinearLayoutManager implements dhr0.e {
    public int A;
    public final fgh0 r;
    public final WeakReference<View> s;
    public final WeakReference<FragmentImpl> t;
    public RecyclerView.Adapter u;
    public final ArrayList<Integer> v;
    public final StickyHeadersLinearLayoutManager<T>.a w;
    public View x;
    public int y;
    public int z;

    /* compiled from: StickyHeadersLinearLayoutManager.kt */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable b;
        public int c;
        public int d;

        /* compiled from: StickyHeadersLinearLayoutManager.kt */
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
        }

        public SavedState(Parcel parcel) {
            this.b = parcel.readParcelable(SavedState.class.getClassLoader());
            this.c = parcel.readInt();
            this.d = parcel.readInt();
        }
    }

    /* compiled from: StickyHeadersLinearLayoutManager.kt */
    public final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            StickyHeadersLinearLayoutManager<T> stickyHeadersLinearLayoutManager = StickyHeadersLinearLayoutManager.this;
            stickyHeadersLinearLayoutManager.r.a();
            ArrayList<Integer> arrayList = stickyHeadersLinearLayoutManager.v;
            arrayList.clear();
            int itemCount = stickyHeadersLinearLayoutManager.u.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                if (((vel0) stickyHeadersLinearLayoutManager.u).V(i)) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (stickyHeadersLinearLayoutManager.x == null || arrayList.contains(Integer.valueOf(stickyHeadersLinearLayoutManager.y))) {
                return;
            }
            stickyHeadersLinearLayoutManager.X(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            StickyHeadersLinearLayoutManager<T> stickyHeadersLinearLayoutManager = StickyHeadersLinearLayoutManager.this;
            stickyHeadersLinearLayoutManager.r.a();
            ArrayList<Integer> arrayList = stickyHeadersLinearLayoutManager.v;
            int size = arrayList.size();
            if (size > 0) {
                for (int P = StickyHeadersLinearLayoutManager.P(stickyHeadersLinearLayoutManager, i); P != -1 && P < size; P++) {
                    arrayList.set(P, Integer.valueOf(arrayList.get(P).intValue() + i2));
                }
            }
            int i3 = i2 + i;
            while (i < i3) {
                if (((vel0) stickyHeadersLinearLayoutManager.u).V(i)) {
                    int P2 = StickyHeadersLinearLayoutManager.P(stickyHeadersLinearLayoutManager, i);
                    if (P2 != -1) {
                        arrayList.add(P2, Integer.valueOf(i));
                    } else {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                i++;
            }
            g5g.D(stickyHeadersLinearLayoutManager.v, true, new pb00(stickyHeadersLinearLayoutManager, 28));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            StickyHeadersLinearLayoutManager<T> stickyHeadersLinearLayoutManager = StickyHeadersLinearLayoutManager.this;
            stickyHeadersLinearLayoutManager.r.a();
            ArrayList<Integer> arrayList = stickyHeadersLinearLayoutManager.v;
            int size = arrayList.size();
            if (size > 0) {
                if (i < i2) {
                    for (int P = StickyHeadersLinearLayoutManager.P(stickyHeadersLinearLayoutManager, i); P != -1 && P < size; P++) {
                        int intValue = arrayList.get(P).intValue();
                        if (intValue >= i && intValue < i + 1) {
                            arrayList.set(P, Integer.valueOf(intValue - (i2 - i)));
                            i(P);
                        } else {
                            if (intValue < i + 1 || intValue > i2) {
                                break;
                            }
                            arrayList.set(P, Integer.valueOf(intValue - 1));
                            i(P);
                        }
                    }
                } else {
                    for (int P2 = StickyHeadersLinearLayoutManager.P(stickyHeadersLinearLayoutManager, i2); P2 != -1 && P2 < size; P2++) {
                        int intValue2 = arrayList.get(P2).intValue();
                        if (intValue2 >= i && intValue2 < i + 1) {
                            arrayList.set(P2, Integer.valueOf((i2 - i) + intValue2));
                            i(P2);
                        } else {
                            if (intValue2 < i2 || intValue2 > i) {
                                break;
                            }
                            arrayList.set(P2, Integer.valueOf(intValue2 + 1));
                            i(P2);
                        }
                    }
                }
                g5g.D(stickyHeadersLinearLayoutManager.v, true, new pb00(stickyHeadersLinearLayoutManager, 28));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            StickyHeadersLinearLayoutManager<T> stickyHeadersLinearLayoutManager = StickyHeadersLinearLayoutManager.this;
            stickyHeadersLinearLayoutManager.r.a();
            ArrayList<Integer> arrayList = stickyHeadersLinearLayoutManager.v;
            int size = arrayList.size();
            if (size > 0) {
                int i3 = i + i2;
                int i4 = i3 - 1;
                if (i <= i4) {
                    while (true) {
                        int S = stickyHeadersLinearLayoutManager.S(i4);
                        if (S != -1) {
                            arrayList.remove(S);
                            size--;
                        }
                        if (i4 == i) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                if (stickyHeadersLinearLayoutManager.x != null && !arrayList.contains(Integer.valueOf(stickyHeadersLinearLayoutManager.y))) {
                    stickyHeadersLinearLayoutManager.X(null);
                }
                for (int P = StickyHeadersLinearLayoutManager.P(stickyHeadersLinearLayoutManager, i3); P != -1 && P < size; P++) {
                    arrayList.set(P, Integer.valueOf(arrayList.get(P).intValue() - i2));
                }
                g5g.D(stickyHeadersLinearLayoutManager.v, true, new pb00(stickyHeadersLinearLayoutManager, 28));
            }
        }

        public final void i(int i) {
            StickyHeadersLinearLayoutManager<T> stickyHeadersLinearLayoutManager = StickyHeadersLinearLayoutManager.this;
            int intValue = stickyHeadersLinearLayoutManager.v.remove(i).intValue();
            int P = StickyHeadersLinearLayoutManager.P(stickyHeadersLinearLayoutManager, intValue);
            if (P != -1) {
                stickyHeadersLinearLayoutManager.v.add(P, Integer.valueOf(intValue));
            } else {
                stickyHeadersLinearLayoutManager.v.add(Integer.valueOf(intValue));
            }
        }
    }

    public StickyHeadersLinearLayoutManager(FragmentImpl fragmentImpl, CatalogStickyRecyclerPaginatedView catalogStickyRecyclerPaginatedView, fgh0 fgh0Var) {
        this.r = fgh0Var;
        this.s = new WeakReference<>(catalogStickyRecyclerPaginatedView);
        this.t = new WeakReference<>(fragmentImpl);
        this.v = new ArrayList<>(0);
        this.w = new a();
        this.y = -1;
        this.z = -1;
    }

    public static final int P(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        ArrayList<Integer> arrayList = stickyHeadersLinearLayoutManager.v;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (arrayList.get(i4).intValue() >= i) {
                    size = i4;
                }
            }
            if (arrayList.get(i3).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K(int i, int i2) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        int T = T(i);
        boolean z = false;
        if (T != -1 || S(i) != -1) {
            Object obj = this.u;
            if ((obj != null ? ((vel0) obj).V(i) : false) && this.x != null) {
                z = true;
            }
            if (z) {
                super.K(i, -iah0.a(4));
                return;
            } else {
                super.K(i, i2);
                return;
            }
        }
        int i3 = i - 1;
        if (S(i3) != -1) {
            super.K(i3, i2);
            return;
        }
        if (this.x == null || T != S(this.y)) {
            this.z = i;
            this.A = i2;
            super.K(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            super.K(i, this.x.getHeight() + i2);
        }
    }

    public final void Q() {
        View view;
        if (isAttachedToWindow() && (view = this.x) != null) {
            attachView(view);
        }
    }

    public final void R() {
        View view;
        if (isAttachedToWindow() && (view = this.x) != null) {
            detachView(view);
        }
    }

    public final int S(int i) {
        ArrayList<Integer> arrayList = this.v;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (arrayList.get(i3).intValue() > i) {
                size = i3 - 1;
            } else {
                if (arrayList.get(i3).intValue() >= i) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int T(int i) {
        ArrayList<Integer> arrayList = this.v;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (arrayList.get(i3).intValue() <= i) {
                if (i3 < arrayList.size() - 1) {
                    i2 = i3 + 1;
                    if (arrayList.get(i2).intValue() <= i) {
                    }
                }
                return i3;
            }
            size = i3 - 1;
        }
        return -1;
    }

    public final View U(int i, int i2) {
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                int decoratedTop = getDecoratedTop(childAt);
                if ((getDecoratedBottom(childAt) > paddingTop || decoratedTop < height) && !childAt.equals(this.x)) {
                    return childAt;
                }
            }
            i += i3;
        }
        return null;
    }

    public final void V(View view) {
        measureChildWithMargins(view, 0, 0);
        if (this.b == 1) {
            view.layout(getPaddingLeft(), 0, getWidth() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), getHeight() - getPaddingBottom());
        }
    }

    public void W() {
        int i = this.z;
        if (i != -1) {
            K(i, this.A);
            this.z = -1;
            this.A = Integer.MIN_VALUE;
        }
    }

    public final void X(RecyclerView.v vVar) {
        Object obj;
        View view = this.x;
        this.x = null;
        int i = this.y;
        this.y = -1;
        if (view != null) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (view != null) {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (view != null && (obj = this.u) != null) {
            ((vel0) obj).o(i, view);
        }
        if (view != null) {
            stopIgnoringView(view);
        }
        if (vVar == null || view == null) {
            return;
        }
        removeView(view);
        vVar.k(view);
    }

    public final void Y(RecyclerView.Adapter<?> adapter) {
        RecyclerView.Adapter adapter2 = this.u;
        StickyHeadersLinearLayoutManager<T>.a aVar = this.w;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(aVar);
        }
        if (!(adapter instanceof vel0)) {
            this.u = null;
            this.v.clear();
        } else {
            this.u = adapter;
            adapter.registerAdapterDataObserver(aVar);
            aVar.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if ((r9.getBottom() - r9.getTranslationY()) > (getHeight() + com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        if ((r9.getTranslationY() + r9.getTop()) < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if ((r9.getRight() - r9.getTranslationX()) > (getWidth() + com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        if ((r9.getTranslationX() + r9.getLeft()) < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(RecyclerView.v vVar, boolean z) {
        View view;
        float f;
        int i;
        View view2;
        float f2;
        View childAt;
        RecyclerView.p pVar;
        ArrayList<Integer> arrayList = this.v;
        int size = arrayList.size();
        int childCount = getChildCount();
        if (size > 0 && childCount > 0) {
            int i2 = 0;
            while (true) {
                view = null;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i2 >= childCount) {
                    i = -1;
                    i2 = -1;
                    view2 = null;
                    break;
                }
                view2 = getChildAt(i2);
                if (view2 != null) {
                    pVar = (RecyclerView.p) view2.getLayoutParams();
                    if (!pVar.b.isRemoved() && !pVar.b.isInvalid()) {
                        if (this.b == 1) {
                            if (this.f) {
                                if (view2.getTranslationY() + view2.getTop() <= getHeight() + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    break;
                                }
                            } else if (view2.getBottom() - view2.getTranslationY() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                break;
                            }
                        } else if (this.f) {
                            if (view2.getTranslationX() + view2.getLeft() <= getWidth() + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                break;
                            }
                        } else if (view2.getRight() - view2.getTranslationX() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            break;
                        }
                    }
                }
                i2++;
            }
            i = pVar.b.getBindingAdapterPosition();
            if (view2 != null && i != -1) {
                int T = T(i);
                int intValue = (T != -1 ? arrayList.get(T) : r1).intValue();
                int i3 = T + 1;
                int intValue2 = (size > i3 ? arrayList.get(i3) : -1).intValue();
                if (intValue >= 0 && intValue < getItemCount()) {
                    if (intValue == i) {
                        if (this.b == 1) {
                            if (this.f) {
                            }
                        } else if (this.f) {
                        }
                    }
                    if (intValue2 != intValue + 1) {
                        View view3 = this.x;
                        if (view3 != null && intValue >= 0 && getItemViewType(view3) != this.u.getItemViewType(intValue)) {
                            X(vVar);
                        }
                        View view4 = this.x;
                        fgh0 fgh0Var = this.r;
                        if (view4 == null) {
                            View f3 = vVar.f(intValue);
                            Object obj = this.u;
                            if (obj != null) {
                                ((vel0) obj).b0(intValue, f3);
                            }
                            addView(f3);
                            V(f3);
                            ignoreView(f3);
                            this.x = f3;
                            this.y = intValue;
                            fgh0Var.a();
                        }
                        if (z || getPosition(this.x) != intValue) {
                            vVar.b(intValue, this.x);
                            this.y = intValue;
                            V(this.x);
                            if (this.z != -1) {
                                ViewTreeObserver viewTreeObserver = this.x.getViewTreeObserver();
                                viewTreeObserver.addOnGlobalLayoutListener(new wel0(viewTreeObserver, this));
                            }
                        }
                        if (intValue2 != -1 && (childAt = getChildAt((intValue2 - i) + i2)) != this.x) {
                            view = childAt;
                        }
                        View view5 = this.x;
                        if (this.b != 1) {
                            f2 = this.f ? (getWidth() - view5.getWidth()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.0f;
                            if (view != null) {
                                f2 = this.f ? Math.max(view.getRight(), f2) : Math.min(view.getLeft() - view5.getWidth(), f2);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        view5.setTranslationX(f2);
                        View view6 = this.x;
                        if (this.b == 1) {
                            if (this.f) {
                                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + (getHeight() - view6.getHeight());
                            }
                            if (view != null) {
                                f = this.f ? Math.max(view.getBottom(), f) : Math.min(view.getTop() - view6.getHeight(), f);
                            }
                        }
                        view6.setTranslationY(f);
                        fgh0Var.a();
                        return;
                    }
                }
            }
        }
        if (this.x != null) {
            X(vVar);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        OffsetOrientation offsetOrientation = OffsetOrientation.HORIZONTAL;
        rfc a2 = fpf0.a(a.C0775a.class);
        fgh0 fgh0Var = this.r;
        int c = fgh0Var.c(offsetOrientation, a2);
        if (c != -1) {
            return c;
        }
        R();
        int computeScrollExtent = computeScrollExtent(a0Var);
        Q();
        fgh0Var.b(offsetOrientation, new a.C0775a(computeScrollExtent));
        return computeScrollExtent;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        OffsetOrientation offsetOrientation = OffsetOrientation.HORIZONTAL;
        rfc a2 = fpf0.a(a.b.class);
        fgh0 fgh0Var = this.r;
        int c = fgh0Var.c(offsetOrientation, a2);
        if (c != -1) {
            return c;
        }
        R();
        int computeScrollOffset = computeScrollOffset(a0Var);
        Q();
        fgh0Var.b(offsetOrientation, new a.b(computeScrollOffset));
        return computeScrollOffset;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        OffsetOrientation offsetOrientation = OffsetOrientation.HORIZONTAL;
        rfc a2 = fpf0.a(a.c.class);
        fgh0 fgh0Var = this.r;
        int c = fgh0Var.c(offsetOrientation, a2);
        if (c != -1) {
            return c;
        }
        R();
        int computeScrollRange = computeScrollRange(a0Var);
        Q();
        fgh0Var.b(offsetOrientation, new a.c(computeScrollRange));
        return computeScrollRange;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF computeScrollVectorForPosition(int i) {
        R();
        PointF computeScrollVectorForPosition = super.computeScrollVectorForPosition(i);
        Q();
        return computeScrollVectorForPosition;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        OffsetOrientation offsetOrientation = OffsetOrientation.VERTICAL;
        rfc a2 = fpf0.a(a.C0775a.class);
        fgh0 fgh0Var = this.r;
        int c = fgh0Var.c(offsetOrientation, a2);
        if (c != -1) {
            return c;
        }
        R();
        int computeScrollExtent = computeScrollExtent(a0Var);
        Q();
        fgh0Var.b(offsetOrientation, new a.C0775a(computeScrollExtent));
        return computeScrollExtent;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        OffsetOrientation offsetOrientation = OffsetOrientation.VERTICAL;
        rfc a2 = fpf0.a(a.b.class);
        fgh0 fgh0Var = this.r;
        int c = fgh0Var.c(offsetOrientation, a2);
        if (c != -1) {
            return c;
        }
        R();
        int computeScrollOffset = computeScrollOffset(a0Var);
        Q();
        fgh0Var.b(offsetOrientation, new a.b(computeScrollOffset));
        return computeScrollOffset;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        OffsetOrientation offsetOrientation = OffsetOrientation.VERTICAL;
        rfc a2 = fpf0.a(a.c.class);
        fgh0 fgh0Var = this.r;
        int c = fgh0Var.c(offsetOrientation, a2);
        if (c != -1) {
            return c;
        }
        R();
        int computeScrollRange = computeScrollRange(a0Var);
        Q();
        fgh0Var.b(offsetOrientation, new a.c(computeScrollRange));
        return computeScrollRange;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAdapterChanged(RecyclerView.Adapter<?> adapter, RecyclerView.Adapter<?> adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        while (true) {
            if (adapter2 instanceof njf0) {
                adapter2 = ((njf0) adapter2).c;
            } else {
                if (!(adapter2 instanceof pd90)) {
                    Y(adapter2);
                    return;
                }
                adapter2 = ((pd90) adapter2).c;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        RecyclerView.Adapter<RecyclerView.e0> adapter = recyclerView.getAdapter();
        while (true) {
            if (adapter instanceof njf0) {
                adapter = ((njf0) adapter).c;
            } else {
                if (!(adapter instanceof pd90)) {
                    Y(adapter);
                    dhr0.f(this);
                    return;
                }
                adapter = ((pd90) adapter).c;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        dhr0.a.getClass();
        dhr0.X(this);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final View onFocusSearchFailed(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        R();
        View onFocusSearchFailed = super.onFocusSearchFailed(view, i, vVar, a0Var);
        Q();
        return onFocusSearchFailed;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        R();
        super.onLayoutChildren(vVar, a0Var);
        Q();
        if (a0Var.g) {
            return;
        }
        this.r.a();
        Z(vVar, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.z = savedState.c;
            this.A = savedState.d;
            parcelable = savedState.b;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.b = super.onSaveInstanceState();
        savedState.c = this.z;
        savedState.d = this.A;
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void removeAndRecycleViewAt(int i, RecyclerView.v vVar) {
        View view;
        try {
            super.removeAndRecycleViewAt(i, vVar);
        } catch (Throwable unused) {
            FragmentImpl fragmentImpl = this.t.get();
            if (fragmentImpl == null || (view = fragmentImpl.getView()) == null) {
                view = this.s.get();
            }
            if (view != null) {
                mhy.d(view);
                view.clearFocus();
            }
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        Object obj;
        View view = this.x;
        if (view == null || (obj = this.u) == null) {
            return;
        }
        ((vel0) obj).l(view);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        R();
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, vVar, a0Var);
        Q();
        if (scrollHorizontallyBy != 0) {
            this.r.a();
            Z(vVar, false);
        }
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
        K(i, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        R();
        int scrollVerticallyBy = super.scrollVerticallyBy(i, vVar, a0Var);
        Q();
        if (scrollVerticallyBy != 0) {
            this.r.a();
            Z(vVar, false);
        }
        return scrollVerticallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int v() {
        if (this.b != 1) {
            throw new UnsupportedOperationException("Unsupported orientation");
        }
        View U = U(0, getChildCount());
        if (U != null) {
            return getPosition(U);
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int x() {
        if (this.b != 1) {
            throw new UnsupportedOperationException("Unsupported orientation");
        }
        View U = U(getChildCount(), 0);
        if (U != null) {
            return getPosition(U);
        }
        return -1;
    }

    public StickyHeadersLinearLayoutManager(FragmentImpl fragmentImpl) {
        this(fragmentImpl, null, new sv1(21));
    }
}
