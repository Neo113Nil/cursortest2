package com.tonicartos.superslim;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.tonicartos.superslim.b;
import com.unity3d.services.UnityAdsConstants;
import com.vk.thirdparty.R$styleable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import xsna.ji;
import xsna.tgw;
import xsna.wq;
import xsna.x9;
import xsna.zr;

/* loaded from: classes14.dex */
public class LayoutManager extends RecyclerView.o {
    public final com.tonicartos.superslim.a c;
    public int d = -1;
    public final Rect e = new Rect();
    public int f = 0;
    public final boolean h = true;
    public final com.tonicartos.superslim.c b = new com.tonicartos.superslim.c(this);
    public final HashMap<String, e> g = new HashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction END;
        public static final Direction NONE;
        public static final Direction START;

        static {
            Direction direction = new Direction("START", 0);
            START = direction;
            Direction direction2 = new Direction("END", 1);
            END = direction2;
            Direction direction3 = new Direction("NONE", 2);
            NONE = direction3;
            $VALUES = new Direction[]{direction, direction2, direction3};
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ int c;

        /* renamed from: com.tonicartos.superslim.LayoutManager$a$a, reason: collision with other inner class name */
        public class C0364a extends v {
            public C0364a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.v
            public final int calculateDyToMakeVisible(View view, int i) {
                RecyclerView.o layoutManager = getLayoutManager();
                if (!layoutManager.canScrollVertically()) {
                    return 0;
                }
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                int calculateDtToFit = calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, LayoutManager.this.getPosition(view) == 0 ? layoutManager.getPaddingTop() : 0, layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
                if (calculateDtToFit == 0) {
                    return 1;
                }
                return calculateDtToFit;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.z
            public final PointF computeScrollVectorForPosition(int i) {
                if (getChildCount() == 0) {
                    return null;
                }
                LayoutManager layoutManager = LayoutManager.this;
                com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(layoutManager, layoutManager.getChildAt(0));
                return new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i < layoutManager.getPosition(layoutManager.C(dVar).i(dVar.a, true)) ? -1 : 1);
            }

            @Override // androidx.recyclerview.widget.v
            public final int getVerticalSnapPreference() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
            public final void onStop() {
                super.onStop();
                LayoutManager.this.requestLayout();
            }
        }

        public a(RecyclerView recyclerView, int i) {
            this.b = recyclerView;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0364a c0364a = new C0364a(this.b.getContext());
            c0364a.setTargetPosition(this.c);
            LayoutManager.this.startSmoothScroll(c0364a);
        }
    }

    public class c extends RuntimeException {
        public c(int i) {
            super(tgw.b(i, "SLM not yet implemented ", "."));
        }
    }

    public class d extends RuntimeException {
        public d(String str) {
            super(zr.a("No registered layout for id ", str, "."));
        }
    }

    public LayoutManager(FragmentActivity fragmentActivity) {
        this.c = new com.tonicartos.superslim.a(this, fragmentActivity);
    }

    public final View A(int i, Direction direction, com.tonicartos.superslim.b bVar) {
        View v = v(i, direction == Direction.START ? 0 : getChildCount() - 1, direction);
        if (v != null) {
            return v;
        }
        b.a c2 = bVar.c(i);
        View view = c2.a;
        if (c2.a().f) {
            F(view);
        }
        bVar.a(i, view);
        return view;
    }

    public final e B(b bVar) {
        int i = bVar.m;
        if (i == -1) {
            return this.g.get(bVar.l);
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        throw new c(bVar.m);
    }

    public final e C(com.tonicartos.superslim.d dVar) {
        e eVar;
        b bVar = dVar.l;
        String str = dVar.d;
        int i = bVar.m;
        if (i == -1) {
            eVar = this.g.get(str);
            if (eVar == null) {
                throw new d(str);
            }
        } else if (i == 1) {
            eVar = this.b;
        } else {
            if (i != 2) {
                throw new c(dVar.l.m);
            }
            eVar = this.c;
        }
        return eVar.k(dVar);
    }

    public final int D(int i, View view, com.tonicartos.superslim.b bVar, com.tonicartos.superslim.d dVar) {
        Rect rect = this.e;
        G(rect, dVar, bVar);
        rect.top = i;
        int i2 = dVar.g;
        rect.bottom = i + i2;
        b bVar2 = dVar.l;
        if (bVar2.k() && !bVar2.l()) {
            i = rect.bottom;
        }
        if ((bVar2.g & 16) != 0 && rect.top < 0) {
            rect.top = 0;
            rect.bottom = i2;
        }
        layoutDecorated(view, rect.left, rect.top, rect.right, rect.bottom);
        return i;
    }

    public final int E(View view, int i, int i2, int i3, int i4, com.tonicartos.superslim.d dVar, com.tonicartos.superslim.b bVar) {
        Rect rect = this.e;
        G(rect, dVar, bVar);
        int i5 = dVar.g;
        b bVar2 = dVar.l;
        if (bVar2.k() && !bVar2.l()) {
            rect.bottom = i2;
            rect.top = i2 - i5;
        } else if (i3 <= 0) {
            int i6 = i3 + i2;
            rect.top = i6;
            rect.bottom = i6 + i5;
        } else {
            rect.bottom = i;
            rect.top = i - i5;
        }
        if ((bVar2.g & 16) != 0 && rect.top < i && dVar.a != bVar.b.a) {
            rect.top = i;
            rect.bottom = i + i5;
            if (bVar2.k() && !bVar2.l()) {
                i2 -= i5;
            }
        }
        if (rect.bottom > i4) {
            rect.bottom = i4;
            rect.top = i4 - i5;
        }
        layoutDecorated(view, rect.left, rect.top, rect.right, rect.bottom);
        return Math.min(rect.top, i2);
    }

    public final void F(View view) {
        int i;
        int i2;
        b bVar = (b) view.getLayoutParams();
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        if (!bVar.l()) {
            int i3 = bVar.g;
            if ((i3 & 2) != 0 && !bVar.j) {
                i2 = bVar.i;
            } else if ((i3 & 4) != 0 && !bVar.k) {
                i2 = bVar.h;
            }
            i = width - i2;
            measureChildWithMargins(view, i, 0);
        }
        i = 0;
        measureChildWithMargins(view, i, 0);
    }

    public final void G(Rect rect, com.tonicartos.superslim.d dVar, com.tonicartos.superslim.b bVar) {
        boolean z = bVar.d;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        b bVar2 = dVar.l;
        int i = dVar.j;
        int i2 = dVar.k;
        int i3 = dVar.f;
        int i4 = bVar2.g;
        if ((i4 & 4) != 0) {
            if (bVar2.l() || bVar2.k || i2 <= 0) {
                if (!z) {
                    rect.left = paddingLeft;
                    rect.right = paddingLeft + i3;
                    return;
                } else {
                    int width = getWidth() - paddingRight;
                    rect.right = width;
                    rect.left = width - i3;
                    return;
                }
            }
            if (z) {
                int width2 = (getWidth() - i2) - paddingRight;
                rect.left = width2;
                rect.right = width2 + i3;
                return;
            } else {
                int i5 = i2 + paddingLeft;
                rect.right = i5;
                rect.left = i5 - i3;
                return;
            }
        }
        if ((i4 & 2) == 0) {
            rect.left = paddingLeft;
            rect.right = paddingLeft + i3;
            return;
        }
        if (bVar2.l() || bVar2.j || i <= 0) {
            if (z) {
                rect.left = paddingLeft;
                rect.right = paddingLeft + i3;
                return;
            } else {
                int width3 = getWidth() - paddingRight;
                rect.right = width3;
                rect.left = width3 - i3;
                return;
            }
        }
        if (z) {
            int i6 = i + paddingLeft;
            rect.right = i6;
            rect.left = i6 - i3;
        } else {
            int width4 = (getWidth() - i) - paddingRight;
            rect.left = width4;
            rect.right = width4 + i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        int i = 0;
        if (getChildCount() == 0 || a0Var.b() == 0) {
            return 0;
        }
        if (!this.h) {
            return getChildCount();
        }
        float childCount = getChildCount() - z(true);
        float height = getHeight();
        View childAt = getChildAt(getChildCount() - 1);
        getPosition(childAt);
        com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(this, childAt);
        SparseArray sparseArray = new SparseArray();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i2 = -1;
        for (int i3 = 1; i3 <= getChildCount(); i3++) {
            View childAt2 = getChildAt(getChildCount() - i3);
            b bVar = (b) childAt2.getLayoutParams();
            if (bVar.m != dVar.e && !TextUtils.equals(bVar.l, dVar.d)) {
                break;
            }
            int position = getPosition(childAt2);
            float decoratedBottom = getDecoratedBottom(childAt2);
            float decoratedTop = getDecoratedTop(childAt2);
            if (decoratedBottom > height) {
                f = height < decoratedTop ? f + 1.0f : wq.a(decoratedBottom, height, getDecoratedMeasuredHeight(childAt2), f);
                if (!bVar.f) {
                    if (i2 == -1) {
                        i2 = position;
                    }
                    sparseArray.put(position, Boolean.TRUE);
                }
            }
        }
        float f2 = f - 0;
        C(dVar);
        int i4 = 0;
        while (i < sparseArray.size()) {
            if (((Boolean) sparseArray.get(i2, Boolean.FALSE)).booleanValue()) {
                i++;
            } else {
                i4++;
            }
            i2--;
        }
        return (int) (((childCount - (f2 - i4)) / a0Var.b()) * getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || a0Var.b() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!this.h) {
            return getPosition(childAt);
        }
        return (int) (((z(false) + getPosition(childAt)) / a0Var.b()) * getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return !this.h ? a0Var.b() : getHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        int i;
        String str;
        e eVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
        if (obtainStyledAttributes.getType(5) == 3) {
            String string = obtainStyledAttributes.getString(5);
            if (TextUtils.isEmpty(string)) {
                str = string;
                i = 1;
            } else {
                str = string;
                i = -1;
            }
        } else {
            i = obtainStyledAttributes.getInt(5, 1);
            str = null;
        }
        obtainStyledAttributes.recycle();
        if (i == -1) {
            eVar = this.g.get(str);
        } else if (i == 1) {
            eVar = this.b;
        } else {
            if (i != 2) {
                throw new c(i);
            }
            eVar = this.c;
        }
        return eVar.g(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getDecoratedBottom(View view) {
        return super.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getDecoratedLeft(View view) {
        return super.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getDecoratedMeasuredHeight(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return super.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getDecoratedMeasuredWidth(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return super.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getDecoratedRight(View view) {
        return super.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getDecoratedTop(View view) {
        return super.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        super.layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
    }

    public final int o(int i, int i2, int i3) {
        if (i2 < i) {
            return -1;
        }
        int b2 = x9.b(i2, i, 2, i);
        b bVar = (b) getChildAt(b2).getLayoutParams();
        if (bVar.i() < i3) {
            return o(b2 + 1, i2, i3);
        }
        if (bVar.i() > i3 || bVar.f) {
            return o(i, b2 - 1, i3);
        }
        if (b2 != getChildCount() - 1) {
            int i4 = b2 + 1;
            b bVar2 = (b) getChildAt(i4).getLayoutParams();
            if (bVar2.i() == i3 && (!bVar2.f || (i4 != getChildCount() - 1 && ((b) getChildAt(b2 + 2).getLayoutParams()).i() == i3))) {
                return o(i4, i2, i3);
            }
        }
        return b2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsChanged(RecyclerView recyclerView) {
        View y = y();
        if (y == null) {
            this.d = -1;
            this.f = 0;
        } else {
            this.d = getPosition(y);
            this.f = getDecoratedTop(y);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(getChildCount() - 1);
        if (i2 + i > getPosition(childAt) && i <= getPosition(childAt2)) {
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0127, code lost:
    
        if (r5.l() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        if (getDecoratedTop(r3) != getDecoratedTop(r4)) goto L58;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int min;
        int paddingBottom;
        int i;
        int i2;
        int i3;
        View view;
        boolean z;
        int max;
        View v;
        int b2 = a0Var.b();
        if (b2 == 0) {
            detachAndScrapAttachedViews(vVar);
            return;
        }
        int i4 = this.d;
        if (i4 != -1) {
            min = Math.min(i4, b2 - 1);
            this.d = -1;
            paddingBottom = this.f;
            this.f = 0;
        } else {
            View y = y();
            min = y == null ? 0 : Math.min(getPosition(y), b2 - 1);
            Direction direction = Direction.END;
            paddingBottom = y == null ? direction == Direction.START ? getPaddingBottom() : getPaddingTop() : direction == Direction.START ? getDecoratedBottom(y) : getDecoratedTop(y);
        }
        int i5 = paddingBottom;
        detachAndScrapAttachedViews(vVar);
        com.tonicartos.superslim.b bVar = new com.tonicartos.superslim.b(this, vVar, a0Var);
        int height = getHeight();
        b.a c2 = bVar.c(min);
        bVar.a(min, c2.a);
        int i6 = c2.a().i();
        b.a c3 = bVar.c(i6);
        View view2 = c3.a;
        F(view2);
        bVar.a(i6, view2);
        com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(this, view2);
        e C = C(dVar);
        int i7 = dVar.a;
        boolean z2 = dVar.b;
        if (z2 && min == i7) {
            i = min + 1;
            i2 = D(i5, view2, bVar, dVar);
        } else {
            i = min;
            i2 = i5;
        }
        int c4 = C.c(height, i2, i, dVar, bVar);
        int i8 = i;
        if (!z2 || min == i7) {
            i3 = i7;
            view = view2;
            z = z2;
            max = Math.max(c4, getDecoratedBottom(view));
        } else {
            int b3 = C.b(i8, dVar, bVar);
            z = z2;
            i3 = i7;
            view = view2;
            E(c3.a, 0, i5, b3, c4, dVar, bVar);
            max = c4;
        }
        if (z && getDecoratedBottom(view) > 0) {
            addView(view);
            bVar.b(i3);
        }
        int p = p(height, max, bVar);
        int b4 = bVar.b.b();
        if (getChildCount() == 0) {
            return;
        }
        com.tonicartos.superslim.d dVar2 = new com.tonicartos.superslim.d(this, getChildAt(0));
        e C2 = C(dVar2);
        int i9 = dVar2.a;
        View i10 = C2.i(i9, false);
        int position = getPosition(i10);
        if (position <= i9 + 1 && position != i9 && (v = v(i9, 0, Direction.START)) != null) {
            if (getDecoratedBottom(v) > getDecoratedTop(i10)) {
                b bVar2 = (b) v.getLayoutParams();
                if (bVar2.k()) {
                }
            }
            i10 = v;
        }
        boolean z3 = getPosition(i10) == 0;
        boolean z4 = getDecoratedTop(i10) > getPaddingTop();
        boolean z5 = getDecoratedTop(i10) == getPaddingTop();
        if (!z3 || !z4) {
            if (z3 && z5) {
                return;
            }
            com.tonicartos.superslim.d dVar3 = new com.tonicartos.superslim.d(this, getChildAt(getChildCount() - 1));
            LayoutManager layoutManager = C(dVar3).a;
            int childCount = layoutManager.getChildCount() - 1;
            View view3 = null;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = layoutManager.getChildAt(childCount);
                b bVar3 = (b) childAt.getLayoutParams();
                if (dVar3.a != bVar3.i()) {
                    break;
                }
                if (!bVar3.f) {
                    view3 = childAt;
                    break;
                } else {
                    childCount--;
                    view3 = childAt;
                }
            }
            boolean z6 = getPosition(view3) == b4 - 1;
            boolean z7 = getDecoratedBottom(view3) < getHeight() - getPaddingBottom();
            if (!z6 || !z7) {
                return;
            }
        }
        offsetChildrenVertical((getHeight() - getPaddingBottom()) - p);
        int r = r(0, bVar);
        if (r > getPaddingTop()) {
            offsetChildrenVertical(getPaddingTop() - r);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.d = savedState.b;
            this.f = savedState.c;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        View y = y();
        if (y == null) {
            savedState.b = 0;
            savedState.c = 0;
            return savedState;
        }
        savedState.b = getPosition(y);
        savedState.c = getDecoratedTop(y);
        return savedState;
    }

    public final int p(int i, int i2, com.tonicartos.superslim.b bVar) {
        View w;
        int position;
        int position2;
        int i3;
        com.tonicartos.superslim.b bVar2;
        RecyclerView.a0 a0Var = bVar.b;
        if (i2 >= i || (w = w()) == null || (position2 = (position = getPosition(w)) + 1) >= a0Var.b()) {
            return i2;
        }
        b.a c2 = bVar.c(position2);
        View view = c2.a;
        com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(this, view);
        if (dVar.b) {
            F(view);
            dVar = new com.tonicartos.superslim.d(this, view);
            i2 = D(i2, view, bVar, dVar);
            position2 = position + 2;
        } else {
            bVar.a(position2, view);
        }
        int i4 = i2;
        int i5 = position2;
        com.tonicartos.superslim.d dVar2 = dVar;
        if (i5 < a0Var.b()) {
            i3 = i;
            bVar2 = bVar;
            i4 = C(dVar2).c(i3, i4, i5, dVar2, bVar2);
        } else {
            i3 = i;
            bVar2 = bVar;
        }
        if (dVar2.b) {
            addView(view);
            if (c2.b) {
                bVar2.b(dVar2.a);
            }
            i4 = Math.max(getDecoratedBottom(view), i4);
        }
        return p(i3, i4, bVar2);
    }

    public final int q(int i, int i2, com.tonicartos.superslim.b bVar, ArrayList arrayList) {
        View i3;
        LayoutManager layoutManager;
        int i4;
        int i5;
        com.tonicartos.superslim.d dVar;
        View view;
        if (i2 >= i) {
            if (arrayList.size() >= 16) {
                arrayList.remove(0);
            }
            Locale locale = Locale.US;
            arrayList.add("leadingEdge: " + i + ", markerLine: " + i2);
            View x = x();
            int i6 = ((b) x.getLayoutParams()).n;
            Direction direction = Direction.START;
            View v = v(i6, 0, direction);
            int position = (v != null ? getPosition(v) : getPosition(x)) - 1;
            if (position >= 0) {
                View A = A(bVar.c(position).a().i(), direction, bVar);
                com.tonicartos.superslim.d dVar2 = new com.tonicartos.superslim.d(this, A);
                if (dVar2.b) {
                    F(A);
                    dVar2 = new com.tonicartos.superslim.d(this, A);
                }
                com.tonicartos.superslim.d dVar3 = dVar2;
                e C = C(dVar3);
                int d2 = position >= 0 ? C.d(i, i2, position, dVar3, bVar) : i2;
                if (dVar3.b) {
                    b bVar2 = dVar3.l;
                    boolean k = bVar2.k();
                    int i7 = dVar3.a;
                    if ((!k || bVar2.l()) && (i3 = C.i(i7, true)) != null) {
                        int b2 = C.b(getPosition(i3), dVar3, bVar);
                        layoutManager = this;
                        i4 = i;
                        i5 = b2;
                        dVar = dVar3;
                        view = A;
                    } else {
                        layoutManager = this;
                        i4 = i;
                        dVar = dVar3;
                        view = A;
                        i5 = 0;
                    }
                    d2 = layoutManager.E(view, i4, d2, i5, i2, dVar, bVar);
                    if (bVar.c.get(i7) != null && getDecoratedBottom(view) > i) {
                        addView(view, o(0, getChildCount() - 1, i7) + 1);
                        bVar.b(i7);
                    }
                }
                return q(i, d2, bVar, arrayList);
            }
        }
        return i2;
    }

    public final int r(int i, com.tonicartos.superslim.b bVar) {
        View i2;
        int b2;
        int i3;
        View x = x();
        View A = A(((b) x.getLayoutParams()).i(), Direction.START, bVar);
        com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(this, A);
        e C = C(dVar);
        int position = getPosition(x);
        boolean z = dVar.b;
        int i4 = dVar.a;
        int decoratedTop = position == i4 ? getDecoratedTop(x) : (position - 1 == i4 && z) ? getDecoratedTop(x) : C.f(i, x, bVar, dVar);
        if (z) {
            e C2 = C(dVar);
            int o = o(0, getChildCount() - 1, i4);
            int height = getHeight();
            int i5 = o == -1 ? 0 : o;
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i5);
                b bVar2 = (b) childAt.getLayoutParams();
                if (bVar2.i() != i4) {
                    View v = v(bVar2.i(), i5, Direction.START);
                    height = v == null ? getDecoratedTop(childAt) : getDecoratedTop(v);
                } else {
                    i5++;
                }
            }
            b bVar3 = dVar.l;
            if (o == -1 && bVar3.k() && !bVar3.l()) {
                decoratedTop = height;
            }
            if ((!bVar3.k() || bVar3.l()) && (i2 = C2.i(i4, true)) != null) {
                b2 = C2.b(getPosition(i2), dVar, bVar);
                i3 = decoratedTop;
            } else {
                i3 = decoratedTop;
                b2 = 0;
            }
            decoratedTop = E(A, i, i3, b2, height, dVar, bVar);
            if (bVar.c.get(i4) != null && getDecoratedBottom(A) > i) {
                addView(A, o(0, getChildCount() - 1, i4) + 1);
                bVar.b(i4);
            }
        }
        if (decoratedTop <= i) {
            return decoratedTop;
        }
        ArrayList arrayList = new ArrayList(16);
        try {
            return q(i, decoratedTop, bVar, arrayList);
        } catch (StackOverflowError e) {
            throw new IllegalStateException("last calling args " + TextUtils.join(";", arrayList), e);
        }
    }

    public final int s(int i, Direction direction, com.tonicartos.superslim.b bVar) {
        if (direction == Direction.START) {
            return r(i, bVar);
        }
        View w = w();
        com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(this, A(((b) w.getLayoutParams()).i(), Direction.END, bVar));
        int e = C(dVar).e(i, w, bVar, dVar);
        View t = t(dVar.a);
        if (t != null) {
            detachView(t);
            attachView(t, -1);
            e = Math.max(e, getDecoratedBottom(t));
        }
        return e <= i ? p(i, e, bVar) : e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
        if (i >= 0 && getItemCount() > i) {
            this.d = i;
            requestLayout();
        } else {
            StringBuilder b2 = ji.b(i, "Ignored scroll to ", " as it is not within the item range 0 - ");
            b2.append(getItemCount());
            Log.e("SuperSLiM.LayoutManager", b2.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (getPosition(r7) == (r15.b() - 1)) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b0 A[LOOP:4: B:87:0x01a8->B:89:0x01b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        SparseArray<View> sparseArray;
        View view;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (getChildCount() != 0) {
            com.tonicartos.superslim.b bVar = new com.tonicartos.superslim.b(this, vVar, a0Var);
            Direction direction = i > 0 ? Direction.END : Direction.START;
            Direction direction2 = Direction.END;
            boolean z = direction == direction2;
            int height = getHeight();
            int i6 = z ? height + i : i;
            if (z) {
                View w = w();
                b bVar2 = (b) w.getLayoutParams();
                if (B(bVar2).j(bVar2.i(), getChildCount() - 1, getDecoratedBottom(w)) < height - getPaddingBottom()) {
                }
            }
            try {
                int s = s(i6, direction, bVar);
                if (z) {
                    int paddingBottom = getPaddingBottom() + (s - height);
                    if (paddingBottom < i) {
                        i = paddingBottom;
                    }
                } else {
                    int paddingTop = s - getPaddingTop();
                    if (paddingTop > i) {
                        i = paddingTop;
                    }
                }
                RecyclerView.v vVar2 = bVar.a;
                if (i != 0) {
                    offsetChildrenVertical(-i);
                    if (z) {
                        direction2 = Direction.START;
                    }
                    if (direction2 == Direction.START) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= getChildCount()) {
                                view = null;
                                i7 = 0;
                                break;
                            }
                            view = getChildAt(i7);
                            if (getDecoratedBottom(view) > 0) {
                                break;
                            }
                            i7++;
                        }
                        if (view == null) {
                            detachAndScrapAttachedViews(vVar2);
                        } else {
                            b bVar3 = (b) view.getLayoutParams();
                            if (bVar3.f) {
                                int i8 = i7 - 1;
                                while (true) {
                                    if (i8 < 0) {
                                        break;
                                    }
                                    b bVar4 = (b) getChildAt(i8).getLayoutParams();
                                    if (bVar4.i() == bVar3.i()) {
                                        i7 = i8;
                                        bVar3 = bVar4;
                                        break;
                                    }
                                    i8--;
                                }
                            }
                            for (int i9 = 0; i9 < i7; i9++) {
                                removeAndRecycleViewAt(0, vVar2);
                            }
                            int i10 = bVar3.i();
                            View t = Direction.START == Direction.END ? t(i10) : u(0, getChildCount() - 1, i10);
                            if (t != null) {
                                if (getDecoratedTop(t) < 0) {
                                    com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(this, t);
                                    if ((dVar.l.g & 16) != 0) {
                                        int childCount = getChildCount() - 1;
                                        int i11 = dVar.a;
                                        int o = o(0, childCount, i11);
                                        if (o != -1) {
                                            e C = C(dVar);
                                            int j = C.j(i11, o, getHeight());
                                            LayoutManager layoutManager = C.a;
                                            for (int i12 = 0; i12 < layoutManager.getChildCount(); i12++) {
                                                View childAt = layoutManager.getChildAt(i12);
                                                b bVar5 = (b) childAt.getLayoutParams();
                                                if (bVar5.i() != i11) {
                                                    break;
                                                }
                                                if (!bVar5.f) {
                                                    i2 = layoutManager.getDecoratedTop(childAt);
                                                    break;
                                                }
                                            }
                                            i2 = 0;
                                            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(t);
                                            if ((dVar.l.k() && !dVar.l.l()) || j - i2 >= decoratedMeasuredHeight) {
                                                int decoratedLeft = getDecoratedLeft(t);
                                                int decoratedRight = getDecoratedRight(t);
                                                if (decoratedMeasuredHeight > j) {
                                                    i3 = j - decoratedMeasuredHeight;
                                                    i4 = j;
                                                } else {
                                                    i3 = 0;
                                                    i4 = decoratedMeasuredHeight;
                                                }
                                                layoutDecorated(t, decoratedLeft, i3, decoratedRight, i4);
                                                if (getDecoratedBottom(t) <= 0) {
                                                    removeAndRecycleView(t, vVar2);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (getDecoratedBottom(t) <= 0) {
                                }
                            }
                        }
                    } else {
                        int height2 = getHeight();
                        for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                            View childAt2 = getChildAt(childCount2);
                            if (getDecoratedTop(childAt2) >= height2) {
                                removeAndRecycleView(childAt2, vVar2);
                            } else if (((b) childAt2.getLayoutParams()).f) {
                            }
                        }
                    }
                    while (true) {
                        sparseArray = bVar.c;
                        if (i5 < sparseArray.size()) {
                            return i;
                        }
                        vVar2.k(sparseArray.valueAt(i5));
                        i5++;
                    }
                }
                while (true) {
                    sparseArray = bVar.c;
                    if (i5 < sparseArray.size()) {
                    }
                    vVar2.k(sparseArray.valueAt(i5));
                    i5++;
                }
            } catch (Throwable th) {
                Log.e("SuperSLiM.LayoutManager", "can't calc fillUntil leadingEdge=" + i6 + " direction=" + direction + " layoutState=" + bVar);
                StringBuilder sb = new StringBuilder("can't calc fillUntil error ");
                sb.append(th);
                Log.e("SuperSLiM.LayoutManager", sb.toString());
                return 0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        if (i >= 0 && getItemCount() > i) {
            requestLayout();
            recyclerView.getHandler().post(new a(recyclerView, i));
        } else {
            StringBuilder b2 = ji.b(i, "Ignored smooth scroll to ", " as it is not within the item range 0 - ");
            b2.append(getItemCount());
            Log.e("SuperSLiM.LayoutManager", b2.toString());
        }
    }

    public final View t(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            b bVar = (b) childAt.getLayoutParams();
            if (bVar.i() != i) {
                return null;
            }
            if (bVar.f) {
                return childAt;
            }
        }
        return null;
    }

    public final View u(int i, int i2, int i3) {
        if (i2 < i) {
            return null;
        }
        int b2 = x9.b(i2, i, 2, i);
        View childAt = getChildAt(b2);
        b bVar = (b) childAt.getLayoutParams();
        return bVar.i() != i3 ? u(i, b2 - 1, i3) : bVar.f ? childAt : u(b2 + 1, i2, i3);
    }

    public final View v(int i, int i2, Direction direction) {
        int i3 = direction == Direction.START ? 1 : -1;
        while (i2 >= 0 && i2 < getChildCount()) {
            View childAt = getChildAt(i2);
            if (getPosition(childAt) == i) {
                return childAt;
            }
            if (((b) childAt.getLayoutParams()).i() != i) {
                return null;
            }
            i2 += i3;
        }
        return null;
    }

    public final View w() {
        if (getChildCount() == 1) {
            return getChildAt(0);
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt == null) {
            return null;
        }
        b bVar = (b) childAt.getLayoutParams();
        if (bVar.f) {
            View childAt2 = getChildAt(getChildCount() - 2);
            if (((b) childAt2.getLayoutParams()).i() == bVar.i()) {
                return childAt2;
            }
        }
        return childAt;
    }

    public final View x() {
        View childAt = getChildAt(0);
        b bVar = (b) childAt.getLayoutParams();
        int i = bVar.i();
        if (bVar.f && 1 < getChildCount()) {
            View childAt2 = getChildAt(1);
            if (((b) childAt2.getLayoutParams()).i() == i) {
                return childAt2;
            }
        }
        return childAt;
    }

    public final View y() {
        if (getChildCount() == 0) {
            return null;
        }
        View childAt = getChildAt(0);
        int i = ((b) childAt.getLayoutParams()).i();
        View v = v(i, 0, Direction.START);
        if (v != null) {
            b bVar = (b) v.getLayoutParams();
            if (bVar.f && (!bVar.k() || bVar.l() ? getDecoratedTop(childAt) >= getDecoratedTop(v) && i + 1 == getPosition(childAt) : getDecoratedBottom(v) <= getDecoratedTop(childAt))) {
                return v;
            }
        }
        return childAt;
    }

    public final float z(boolean z) {
        float decoratedMeasuredHeight;
        View childAt = getChildAt(0);
        int position = getPosition(childAt);
        float decoratedTop = getDecoratedTop(childAt);
        if (getDecoratedBottom(childAt) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            decoratedMeasuredHeight = 1.0f;
        } else if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= decoratedTop) {
            decoratedMeasuredHeight = 0.0f;
        } else {
            decoratedMeasuredHeight = (-decoratedTop) / getDecoratedMeasuredHeight(childAt);
        }
        com.tonicartos.superslim.d dVar = new com.tonicartos.superslim.d(this, childAt);
        b bVar = dVar.l;
        if (bVar.f && bVar.k()) {
            return decoratedMeasuredHeight;
        }
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        int i2 = -1;
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            b bVar2 = (b) childAt2.getLayoutParams();
            if (bVar2.m != dVar.e && !TextUtils.equals(bVar2.l, dVar.d)) {
                break;
            }
            int position2 = getPosition(childAt2);
            if (!z && position2 < position) {
                i++;
            }
            float decoratedTop2 = getDecoratedTop(childAt2);
            if (getDecoratedBottom(childAt2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                decoratedMeasuredHeight += 1.0f;
            } else if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > decoratedTop2) {
                decoratedMeasuredHeight += (-decoratedTop2) / getDecoratedMeasuredHeight(childAt2);
            }
            if (!bVar2.f) {
                if (i2 == -1) {
                    i2 = position2;
                }
                sparseArray.put(position2, Boolean.TRUE);
            }
        }
        float f = decoratedMeasuredHeight - i;
        C(dVar);
        int i4 = 0;
        int i5 = 0;
        while (i4 < sparseArray.size()) {
            if (((Boolean) sparseArray.get(i2, Boolean.FALSE)).booleanValue()) {
                i4++;
            } else {
                i5++;
            }
            i2++;
        }
        return f - i5;
    }

    public static class b extends RecyclerView.p {
        public boolean f;
        public int g;
        public int h;
        public int i;
        public boolean j;
        public boolean k;
        public String l;
        public int m;
        public int n;

        public class a extends RuntimeException {
            public a() {
                super("Invalid section first position given.");
            }
        }

        /* renamed from: com.tonicartos.superslim.LayoutManager$b$b, reason: collision with other inner class name */
        public class C0365b extends RuntimeException {
            public C0365b() {
                super("Missing section first position.");
            }
        }

        public b() {
            super(-2, -2);
            this.m = 1;
            this.f = false;
        }

        public final int i() {
            int i = this.n;
            if (i != -1) {
                return i;
            }
            throw new C0365b();
        }

        public final void j(ViewGroup.LayoutParams layoutParams) {
            if (!(layoutParams instanceof b)) {
                this.f = false;
                this.g = 17;
                this.h = -1;
                this.i = -1;
                this.j = true;
                this.k = true;
                this.m = 1;
                return;
            }
            b bVar = (b) layoutParams;
            this.f = bVar.f;
            this.g = bVar.g;
            this.n = bVar.n;
            this.l = bVar.l;
            this.m = bVar.m;
            this.h = bVar.h;
            this.i = bVar.i;
            this.k = bVar.k;
            this.j = bVar.j;
        }

        public final boolean k() {
            return (this.g & 1) != 0;
        }

        public final boolean l() {
            return (this.g & 8) != 0;
        }

        @TargetApi(21)
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
            this.f = obtainStyledAttributes.getBoolean(1, false);
            this.g = obtainStyledAttributes.getInt(0, 17);
            this.n = obtainStyledAttributes.getInt(2, -1);
            if (obtainStyledAttributes.getType(4) == 5) {
                this.j = false;
                this.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            } else {
                this.j = true;
            }
            if (obtainStyledAttributes.getType(3) == 5) {
                this.k = false;
                this.h = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            } else {
                this.k = true;
            }
            if (obtainStyledAttributes.getType(5) == 3) {
                String string = obtainStyledAttributes.getString(5);
                this.l = string;
                if (TextUtils.isEmpty(string)) {
                    this.m = 1;
                } else {
                    this.m = -1;
                }
            } else {
                this.m = obtainStyledAttributes.getInt(5, 1);
            }
            obtainStyledAttributes.recycle();
        }

        @Deprecated
        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.m = 1;
            j(marginLayoutParams);
        }

        @Deprecated
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.m = 1;
            j(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b bVar;
        b bVar2;
        if (layoutParams == null) {
            bVar2 = new b();
        } else {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                bVar = new b(layoutParams);
            }
            bVar2 = bVar;
        }
        ((ViewGroup.MarginLayoutParams) bVar2).width = -1;
        ((ViewGroup.MarginLayoutParams) bVar2).height = -1;
        return B(bVar2).h(bVar2);
    }
}
