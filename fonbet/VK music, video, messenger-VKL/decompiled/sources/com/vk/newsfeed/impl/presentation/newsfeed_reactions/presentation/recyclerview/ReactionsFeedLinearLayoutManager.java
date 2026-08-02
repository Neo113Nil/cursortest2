package com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.recyclerview;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.themes.VKTheme;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.dhr0;
import xsna.iah0;
import xsna.o4f0;
import xsna.wwf0;
import xsna.y3f0;
import xsna.z3f0;

/* compiled from: ReactionsFeedLinearLayoutManager.kt */
/* loaded from: classes4.dex */
public final class ReactionsFeedLinearLayoutManager extends LinearLayoutManager implements dhr0.e {
    public RecyclerView.Adapter<?> r;
    public View u;
    public int x;
    public ReactionsFeedFragment.c y;
    public final ArrayList<Integer> s = new ArrayList<>();
    public final a t = new a();
    public int v = -1;
    public int w = -1;

    /* compiled from: ReactionsFeedLinearLayoutManager.kt */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable b;
        public int c;
        public int d;

        /* compiled from: ReactionsFeedLinearLayoutManager.kt */
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
            this();
            this.b = parcel.readParcelable(SavedState.class.getClassLoader());
            this.c = parcel.readInt();
            this.d = parcel.readInt();
        }
    }

    /* compiled from: ReactionsFeedLinearLayoutManager.kt */
    public final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager = ReactionsFeedLinearLayoutManager.this;
            ArrayList<Integer> arrayList = reactionsFeedLinearLayoutManager.s;
            arrayList.clear();
            RecyclerView.Adapter<?> adapter = reactionsFeedLinearLayoutManager.r;
            if (adapter == null) {
                return;
            }
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ReactionsFeedFragment.c cVar = reactionsFeedLinearLayoutManager.y;
                if (cVar != null && cVar.a(i)) {
                    arrayList.add(Integer.valueOf(i));
                    if (reactionsFeedLinearLayoutManager.y != null && 1 == arrayList.size()) {
                        break;
                    }
                }
            }
            if (reactionsFeedLinearLayoutManager.u == null || arrayList.contains(Integer.valueOf(reactionsFeedLinearLayoutManager.v))) {
                return;
            }
            reactionsFeedLinearLayoutManager.W(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager = ReactionsFeedLinearLayoutManager.this;
            ArrayList<Integer> arrayList = reactionsFeedLinearLayoutManager.s;
            int size = arrayList.size();
            if (size > 0) {
                for (int P = ReactionsFeedLinearLayoutManager.P(reactionsFeedLinearLayoutManager, i); P != -1 && P < size; P++) {
                    arrayList.set(P, Integer.valueOf(arrayList.get(P).intValue() + i2));
                }
            }
            if (reactionsFeedLinearLayoutManager.y == null || size != 1) {
                int i3 = i2 + i;
                while (i < i3) {
                    ReactionsFeedFragment.c cVar = reactionsFeedLinearLayoutManager.y;
                    if (cVar != null && cVar.a(i)) {
                        int P2 = ReactionsFeedLinearLayoutManager.P(reactionsFeedLinearLayoutManager, i);
                        if (P2 != -1) {
                            arrayList.add(P2, Integer.valueOf(i));
                        } else {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    i++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager = ReactionsFeedLinearLayoutManager.this;
            ArrayList<Integer> arrayList = reactionsFeedLinearLayoutManager.s;
            int size = arrayList.size();
            if (size > 0) {
                if (i < i2) {
                    for (int P = ReactionsFeedLinearLayoutManager.P(reactionsFeedLinearLayoutManager, i); P != -1 && P < size; P++) {
                        int intValue = arrayList.get(P).intValue();
                        if (intValue >= i && intValue < i + 1) {
                            arrayList.set(P, Integer.valueOf(intValue - (i2 - i)));
                            i(P);
                        } else {
                            if (intValue < i + 1 || intValue > i2) {
                                return;
                            }
                            arrayList.set(P, Integer.valueOf(intValue - 1));
                            i(P);
                        }
                    }
                    return;
                }
                for (int P2 = ReactionsFeedLinearLayoutManager.P(reactionsFeedLinearLayoutManager, i2); P2 != -1 && P2 < size; P2++) {
                    int intValue2 = arrayList.get(P2).intValue();
                    if (intValue2 >= i && intValue2 < i + 1) {
                        arrayList.set(P2, Integer.valueOf((i2 - i) + intValue2));
                        i(P2);
                    } else {
                        if (intValue2 < i2 || intValue2 > i) {
                            return;
                        }
                        arrayList.set(P2, Integer.valueOf(intValue2 + 1));
                        i(P2);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager = ReactionsFeedLinearLayoutManager.this;
            int size = reactionsFeedLinearLayoutManager.s.size();
            if (size > 0) {
                int i3 = i + i2;
                int i4 = i3 - 1;
                if (i <= i4) {
                    while (true) {
                        int S = reactionsFeedLinearLayoutManager.S(i4);
                        if (S != -1) {
                            reactionsFeedLinearLayoutManager.s.remove(S);
                            size--;
                        }
                        if (i4 == i) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                if (reactionsFeedLinearLayoutManager.u != null && !reactionsFeedLinearLayoutManager.s.contains(Integer.valueOf(reactionsFeedLinearLayoutManager.v))) {
                    reactionsFeedLinearLayoutManager.W(null);
                }
                for (int P = ReactionsFeedLinearLayoutManager.P(reactionsFeedLinearLayoutManager, i3); P != -1 && P < size; P++) {
                    ArrayList<Integer> arrayList = reactionsFeedLinearLayoutManager.s;
                    arrayList.set(P, Integer.valueOf(arrayList.get(P).intValue() - i2));
                }
            }
        }

        public final void i(int i) {
            ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager = ReactionsFeedLinearLayoutManager.this;
            int intValue = reactionsFeedLinearLayoutManager.s.remove(i).intValue();
            int P = ReactionsFeedLinearLayoutManager.P(reactionsFeedLinearLayoutManager, intValue);
            if (P != -1) {
                reactionsFeedLinearLayoutManager.s.add(P, Integer.valueOf(intValue));
            } else {
                reactionsFeedLinearLayoutManager.s.add(Integer.valueOf(intValue));
            }
        }
    }

    public static final int P(ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager, int i) {
        ArrayList<Integer> arrayList = reactionsFeedLinearLayoutManager.s;
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
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        int T = T(i);
        boolean z = false;
        if (T != -1 || S(i) != -1) {
            ReactionsFeedFragment.c cVar = this.y;
            if ((cVar != null ? cVar.a(i) : false) && this.u != null) {
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
        if (this.u == null || T != S(this.v)) {
            super.K(i, i2);
            return;
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        super.K(i, this.u.getHeight() + i2);
    }

    public final void Q() {
        View view;
        if (isAttachedToWindow() && (view = this.u) != null) {
            attachView(view);
        }
    }

    public final void R() {
        View view;
        if (isAttachedToWindow() && (view = this.u) != null) {
            detachView(view);
        }
    }

    public final int S(int i) {
        ArrayList<Integer> arrayList = this.s;
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
        ArrayList<Integer> arrayList = this.s;
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
                if ((getDecoratedBottom(childAt) > paddingTop || decoratedTop < height) && !childAt.equals(this.u)) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(RecyclerView.v vVar) {
        ReactionsFeedFragment.c cVar;
        View view = this.u;
        this.u = null;
        int i = this.v;
        this.v = -1;
        if (view != null) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (view != null) {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (view != null && (cVar = this.y) != null && (view instanceof com.vk.newsfeed.impl.feedlikes.a)) {
            RecyclerView.o layoutManager = cVar.a.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(i);
                if (findViewByPosition instanceof com.vk.newsfeed.impl.feedlikes.a) {
                    ((com.vk.newsfeed.impl.feedlikes.a) findViewByPosition).a(wwf0.q((ReactionsFeedMviState) ((o4f0) cVar.b.getValue()).getCurrentState()));
                }
            }
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

    public final void X(RecyclerView.Adapter<?> adapter) {
        RecyclerView.Adapter<?> adapter2 = this.r;
        a aVar = this.t;
        if (adapter2 != null && adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(aVar);
        }
        if (adapter == null) {
            this.r = null;
            this.s.clear();
        } else {
            this.r = adapter;
            adapter.registerAdapterDataObserver(aVar);
            aVar.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if ((r9.getBottom() - r9.getTranslationY()) > (getHeight() + com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if ((r9.getTranslationY() + r9.getTop()) < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if ((r9.getRight() - r9.getTranslationX()) > (getWidth() + com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        if ((r9.getTranslationX() + r9.getLeft()) < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(RecyclerView.v vVar, boolean z) {
        float f;
        View view;
        int i;
        View view2;
        float f2;
        View childAt;
        RecyclerView.p pVar;
        ArrayList<Integer> arrayList = this.s;
        int size = arrayList.size();
        int childCount = getChildCount();
        if (size > 0 && childCount > 0) {
            int i2 = 0;
            while (true) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                view = null;
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
                if (intValue != -1) {
                    if (intValue == i) {
                        if (this.b == 1) {
                            if (this.f) {
                            }
                        } else if (this.f) {
                        }
                    }
                    if (intValue2 != intValue + 1) {
                        View view3 = this.u;
                        if (view3 != null && getItemViewType(view3) != this.r.getItemViewType(intValue)) {
                            W(vVar);
                        }
                        if (this.u == null) {
                            View f3 = vVar.f(intValue);
                            ReactionsFeedFragment.c cVar = this.y;
                            if (cVar != null && (f3 instanceof com.vk.newsfeed.impl.feedlikes.a)) {
                                ((com.vk.newsfeed.impl.feedlikes.a) f3).a(wwf0.q((ReactionsFeedMviState) ((o4f0) cVar.b.getValue()).getCurrentState()));
                            }
                            addView(f3);
                            V(f3);
                            ignoreView(f3);
                            this.u = f3;
                            this.v = intValue;
                        }
                        if (z || getPosition(this.u) != intValue) {
                            vVar.b(intValue, this.u);
                            this.v = intValue;
                            V(this.u);
                            if (this.w != -1) {
                                View view4 = this.u;
                                ViewTreeObserver viewTreeObserver = view4 != null ? view4.getViewTreeObserver() : null;
                                if (viewTreeObserver != null) {
                                    viewTreeObserver.addOnGlobalLayoutListener(new y3f0(viewTreeObserver, this));
                                }
                            }
                        }
                        if (intValue2 != -1 && (childAt = getChildAt((intValue2 - i) + i2)) != this.u) {
                            view = childAt;
                        }
                        View view5 = this.u;
                        if (this.b != 1) {
                            f2 = this.f ? (getWidth() - view5.getWidth()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.0f;
                            if (view != null) {
                                f2 = this.f ? Math.max(view.getRight(), f2) : Math.min(view.getLeft() - view5.getWidth(), f2);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        view5.setTranslationX(f2);
                        View view6 = this.u;
                        if (this.b == 1) {
                            if (this.f) {
                                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + (getHeight() - view6.getHeight());
                            }
                            if (view != null) {
                                f = this.f ? Math.max(view.getBottom(), f) : Math.min(view.getTop() - view6.getHeight(), f);
                            }
                        }
                        view6.setTranslationY(f);
                        return;
                    }
                }
            }
        }
        if (this.u != null) {
            W(vVar);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        R();
        int computeScrollExtent = computeScrollExtent(a0Var);
        Q();
        return computeScrollExtent;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        R();
        int computeScrollOffset = computeScrollOffset(a0Var);
        Q();
        return computeScrollOffset;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        R();
        int computeScrollRange = computeScrollRange(a0Var);
        Q();
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
        R();
        int computeScrollExtent = computeScrollExtent(a0Var);
        Q();
        return computeScrollExtent;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        R();
        int computeScrollOffset = computeScrollOffset(a0Var);
        Q();
        return computeScrollOffset;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        R();
        int computeScrollRange = computeScrollRange(a0Var);
        Q();
        return computeScrollRange;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o(RecyclerView.a0 a0Var, int[] iArr) {
        super.o(a0Var, iArr);
        iArr[1] = iArr[1] + z3f0.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAdapterChanged(RecyclerView.Adapter<?> adapter, RecyclerView.Adapter<?> adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        X(adapter2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        X(recyclerView.getAdapter());
        dhr0.f(this);
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
        Y(vVar, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.w = savedState.c;
            this.x = savedState.d;
            parcelable = savedState.b;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.b = super.onSaveInstanceState();
        savedState.c = this.w;
        savedState.d = this.x;
        return savedState;
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        View view = this.u;
        if (view == null || this.y == null || !(view instanceof com.vk.newsfeed.impl.feedlikes.a)) {
            return;
        }
        ((com.vk.newsfeed.impl.feedlikes.a) view).b.setBackground(dhr0.t.a(R.drawable.feed_likes_filter_bg));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        R();
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, vVar, a0Var);
        Q();
        if (scrollHorizontallyBy != 0) {
            Y(vVar, false);
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
            Y(vVar, false);
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
}
