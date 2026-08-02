package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import xsna.xy9;

/* loaded from: classes12.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    private int mFullSizeSpec;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;

    @NonNull
    private final u mLayoutState;
    private int mOrientation;
    private SavedState mPendingSavedState;
    private int[] mPrefetchDistances;

    @NonNull
    f0 mPrimaryOrientation;
    private BitSet mRemainingSpans;

    @NonNull
    f0 mSecondaryOrientation;
    private int mSizePerSpan;
    d[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final b mAnchorInfo = new b();
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new a();

    public static class LazySpanLookup {
        public int[] a;
        public ArrayList b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int b;
            public int c;
            public int[] d;
            public boolean e;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.b = parcel.readInt();
                    fullSpanItem.c = parcel.readInt();
                    fullSpanItem.e = parcel.readInt() == 1;
                    int readInt = parcel.readInt();
                    if (readInt > 0) {
                        int[] iArr = new int[readInt];
                        fullSpanItem.d = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.b + ", mGapDir=" + this.c + ", mHasUnwantedGapAfter=" + this.e + ", mGapPerSpan=" + Arrays.toString(this.d) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.c);
                parcel.writeInt(this.e ? 1 : 0);
                int[] iArr = this.d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.d);
                }
            }
        }

        public final void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public final void b(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i) {
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.b.get(size)).b >= i) {
                        this.b.remove(size);
                    }
                }
            }
            e(i);
        }

        public final FullSpanItem d(int i, int i2, int i3) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i4);
                int i5 = fullSpanItem.b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.c == i3 || fullSpanItem.e)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int e(int i) {
            FullSpanItem fullSpanItem;
            int i2;
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        fullSpanItem = (FullSpanItem) this.b.get(size);
                        if (fullSpanItem.b == i) {
                            break;
                        }
                    }
                }
                fullSpanItem = null;
                if (fullSpanItem != null) {
                    this.b.remove(fullSpanItem);
                }
                int size2 = this.b.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        i3 = -1;
                        break;
                    }
                    if (((FullSpanItem) this.b.get(i3)).b >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    FullSpanItem fullSpanItem2 = (FullSpanItem) this.b.get(i3);
                    this.b.remove(i3);
                    i2 = fullSpanItem2.b;
                    if (i2 != -1) {
                        int[] iArr2 = this.a;
                        Arrays.fill(iArr2, i, iArr2.length, -1);
                        return this.a.length;
                    }
                    int min = Math.min(i2 + 1, this.a.length);
                    Arrays.fill(this.a, i, min, -1);
                    return min;
                }
            }
            i2 = -1;
            if (i2 != -1) {
            }
        }

        public final void f(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.b;
                if (i4 >= i) {
                    fullSpanItem.b = i4 + i2;
                }
            }
        }

        public final void g(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.b = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public int d;
        public int[] e;
        public int f;
        public int[] g;
        public ArrayList h;
        public boolean i;
        public boolean j;
        public boolean k;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                int readInt = parcel.readInt();
                savedState.d = readInt;
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    savedState.e = iArr;
                    parcel.readIntArray(iArr);
                }
                int readInt2 = parcel.readInt();
                savedState.f = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    savedState.g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.i = parcel.readInt() == 1;
                savedState.j = parcel.readInt() == 1;
                savedState.k = parcel.readInt() == 1;
                savedState.h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
                return savedState;
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
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            if (this.d > 0) {
                parcel.writeIntArray(this.e);
            }
            parcel.writeInt(this.f);
            if (this.f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.h);
        }

        public SavedState(SavedState savedState) {
            this.d = savedState.d;
            this.b = savedState.b;
            this.c = savedState.c;
            this.e = savedState.e;
            this.f = savedState.f;
            this.g = savedState.g;
            this.i = savedState.i;
            this.j = savedState.j;
            this.k = savedState.k;
            this.h = savedState.h;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.p {
        public d f;
    }

    public class d {
        public final ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public d(int i) {
            this.e = i;
        }

        public final void a() {
            View view = (View) xy9.b(1, this.a);
            c cVar = (c) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.mPrimaryOrientation.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? e(r1.size() - 1, -1, false, false, true) : e(0, this.a.size(), false, false, true);
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? e(0, this.a.size(), false, false, true) : e(r1.size() - 1, -1, false, false, true);
        }

        public final int e(int i, int i2, boolean z, boolean z2, boolean z3) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k = staggeredGridLayoutManager.mPrimaryOrientation.k();
            int g = staggeredGridLayoutManager.mPrimaryOrientation.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int e = staggeredGridLayoutManager.mPrimaryOrientation.e(view);
                int b = staggeredGridLayoutManager.mPrimaryOrientation.b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? e >= g : e > g;
                if (!z3 ? b > k : b >= k) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (e >= k && b <= g) {
                            return staggeredGridLayoutManager.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return staggeredGridLayoutManager.getPosition(view);
                        }
                        if (e < k || b > g) {
                            return staggeredGridLayoutManager.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        public final int f(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        public final View g(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.a;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = arrayList.get(i3);
                if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int h(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            View view = this.a.get(0);
            c cVar = (c) view.getLayoutParams();
            this.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            cVar.getClass();
            return this.b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setSpanCount(properties.b);
        setReverseLayout(properties.c);
        this.mLayoutState = new u();
        createOrientationHelpers();
    }

    private void applyPendingSavedState(b bVar) {
        SavedState savedState = this.mPendingSavedState;
        int i = savedState.d;
        if (i > 0) {
            if (i == this.mSpanCount) {
                for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                    this.mSpans[i2].b();
                    SavedState savedState2 = this.mPendingSavedState;
                    int i3 = savedState2.e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.j ? this.mPrimaryOrientation.g() : this.mPrimaryOrientation.k();
                    }
                    d dVar = this.mSpans[i2];
                    dVar.b = i3;
                    dVar.c = i3;
                }
            } else {
                savedState.e = null;
                savedState.d = 0;
                savedState.f = 0;
                savedState.g = null;
                savedState.h = null;
                savedState.b = savedState.c;
            }
        }
        SavedState savedState3 = this.mPendingSavedState;
        this.mLastLayoutRTL = savedState3.k;
        setReverseLayout(savedState3.i);
        resolveShouldLayoutReverse();
        SavedState savedState4 = this.mPendingSavedState;
        int i4 = savedState4.b;
        if (i4 != -1) {
            this.mPendingScrollPosition = i4;
            bVar.c = savedState4.j;
        } else {
            bVar.c = this.mShouldReverseLayout;
        }
        if (savedState4.f > 1) {
            LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
            lazySpanLookup.a = savedState4.g;
            lazySpanLookup.b = savedState4.h;
        }
    }

    private void attachViewToSpans(View view, c cVar, u uVar) {
        if (uVar.e == 1) {
            cVar.getClass();
            d dVar = cVar.f;
            dVar.getClass();
            c cVar2 = (c) view.getLayoutParams();
            cVar2.f = dVar;
            ArrayList<View> arrayList = dVar.a;
            arrayList.add(view);
            dVar.c = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                dVar.b = Integer.MIN_VALUE;
            }
            if (cVar2.b.isRemoved() || cVar2.b.isUpdated()) {
                dVar.d = StaggeredGridLayoutManager.this.mPrimaryOrientation.c(view) + dVar.d;
                return;
            }
            return;
        }
        cVar.getClass();
        d dVar2 = cVar.f;
        dVar2.getClass();
        c cVar3 = (c) view.getLayoutParams();
        cVar3.f = dVar2;
        ArrayList<View> arrayList2 = dVar2.a;
        arrayList2.add(0, view);
        dVar2.b = Integer.MIN_VALUE;
        if (arrayList2.size() == 1) {
            dVar2.c = Integer.MIN_VALUE;
        }
        if (cVar3.b.isRemoved() || cVar3.b.isUpdated()) {
            dVar2.d = StaggeredGridLayoutManager.this.mPrimaryOrientation.c(view) + dVar2.d;
        }
    }

    private int calculateScrollDirectionForPosition(int i) {
        if (getChildCount() == 0) {
            return this.mShouldReverseLayout ? 1 : -1;
        }
        return (i < getFirstChildPosition()) != this.mShouldReverseLayout ? -1 : 1;
    }

    private boolean checkSpanForGap(d dVar) {
        if (this.mShouldReverseLayout) {
            int i = dVar.c;
            if (i == Integer.MIN_VALUE) {
                dVar.a();
                i = dVar.c;
            }
            if (i < this.mPrimaryOrientation.g()) {
                ((c) ((View) xy9.b(1, dVar.a)).getLayoutParams()).getClass();
                return true;
            }
        } else {
            int i2 = dVar.b;
            if (i2 == Integer.MIN_VALUE) {
                View view = dVar.a.get(0);
                c cVar = (c) view.getLayoutParams();
                dVar.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
                cVar.getClass();
                i2 = dVar.b;
            }
            if (i2 > this.mPrimaryOrientation.k()) {
                ((c) dVar.a.get(0).getLayoutParams()).getClass();
                return true;
            }
        }
        return false;
    }

    private int computeScrollExtent(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return m0.a(a0Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return m0.b(a0Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return m0.c(a0Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = f0.a(this, this.mOrientation);
        this.mSecondaryOrientation = f0.a(this, 1 - this.mOrientation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x013c, code lost:
    
        recycle(r16, r15.mLayoutState);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int fill(RecyclerView.v vVar, u uVar, RecyclerView.a0 a0Var) {
        d dVar;
        int h;
        int c2;
        int k;
        int c3;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        int i = this.mLayoutState.i ? uVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : uVar.e == 1 ? uVar.g + uVar.b : uVar.f - uVar.b;
        updateAllRemainingSpans(uVar.e, i);
        int g = this.mShouldReverseLayout ? this.mPrimaryOrientation.g() : this.mPrimaryOrientation.k();
        boolean z = false;
        while (true) {
            int i2 = uVar.c;
            if (i2 < 0 || i2 >= a0Var.b() || (!this.mLayoutState.i && this.mRemainingSpans.isEmpty())) {
                break;
            }
            View f = vVar.f(uVar.c);
            uVar.c += uVar.d;
            c cVar = (c) f.getLayoutParams();
            int layoutPosition = cVar.b.getLayoutPosition();
            int[] iArr = this.mLazySpanLookup.a;
            int i3 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i3 == -1) {
                dVar = getNextSpan(uVar);
                LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
                lazySpanLookup.b(layoutPosition);
                lazySpanLookup.a[layoutPosition] = dVar.e;
            } else {
                dVar = this.mSpans[i3];
            }
            cVar.f = dVar;
            if (uVar.e == 1) {
                addView(f);
            } else {
                addView(f, 0);
            }
            measureChildWithDecorationsAndMargin(f, cVar, false);
            if (uVar.e == 1) {
                c2 = dVar.f(g);
                h = this.mPrimaryOrientation.c(f) + c2;
            } else {
                h = dVar.h(g);
                c2 = h - this.mPrimaryOrientation.c(f);
            }
            int i4 = c2;
            int i5 = h;
            attachViewToSpans(f, cVar, uVar);
            if (isLayoutRTL() && this.mOrientation == 1) {
                c3 = this.mSecondaryOrientation.g() - (((this.mSpanCount - 1) - dVar.e) * this.mSizePerSpan);
                k = c3 - this.mSecondaryOrientation.c(f);
            } else {
                k = this.mSecondaryOrientation.k() + (dVar.e * this.mSizePerSpan);
                c3 = this.mSecondaryOrientation.c(f) + k;
            }
            int i6 = c3;
            int i7 = k;
            if (this.mOrientation == 1) {
                layoutDecoratedWithMargins(f, i7, i4, i6, i5);
            } else {
                layoutDecoratedWithMargins(f, i4, i7, i5, i6);
            }
            updateRemainingSpans(dVar, this.mLayoutState.e, i);
            recycle(vVar, this.mLayoutState);
            if (this.mLayoutState.h && f.hasFocusable()) {
                this.mRemainingSpans.set(dVar.e, false);
            }
            z = true;
        }
        int k2 = this.mLayoutState.e == -1 ? this.mPrimaryOrientation.k() - getMinStart(this.mPrimaryOrientation.k()) : getMaxEnd(this.mPrimaryOrientation.g()) - this.mPrimaryOrientation.g();
        if (k2 > 0) {
            return Math.min(uVar.b, k2);
        }
        return 0;
    }

    private int findFirstReferenceChildPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private void fixEndGap(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int g;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (g = this.mPrimaryOrientation.g() - maxEnd) > 0) {
            int i = g - (-scrollBy(-g, vVar, a0Var));
            if (!z || i <= 0) {
                return;
            }
            this.mPrimaryOrientation.p(i);
        }
    }

    private void fixStartGap(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int k;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (k = minStart - this.mPrimaryOrientation.k()) > 0) {
            int scrollBy = k - scrollBy(k, vVar, a0Var);
            if (!z || scrollBy <= 0) {
                return;
            }
            this.mPrimaryOrientation.p(-scrollBy);
        }
    }

    private int getMaxEnd(int i) {
        int f = this.mSpans[0].f(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int f2 = this.mSpans[i2].f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    private int getMaxStart(int i) {
        int h = this.mSpans[0].h(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int h2 = this.mSpans[i2].h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    private int getMinEnd(int i) {
        int f = this.mSpans[0].f(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int f2 = this.mSpans[i2].f(i);
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    private int getMinStart(int i) {
        int h = this.mSpans[0].h(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int h2 = this.mSpans[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    private d getNextSpan(u uVar) {
        int i;
        int i2;
        int i3;
        if (preferLastSpan(uVar.e)) {
            i2 = this.mSpanCount - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.mSpanCount;
            i2 = 0;
            i3 = 1;
        }
        d dVar = null;
        if (uVar.e == 1) {
            int k = this.mPrimaryOrientation.k();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                d dVar2 = this.mSpans[i2];
                int f = dVar2.f(k);
                if (f < i4) {
                    dVar = dVar2;
                    i4 = f;
                }
                i2 += i3;
            }
            return dVar;
        }
        int g = this.mPrimaryOrientation.g();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            d dVar3 = this.mSpans[i2];
            int h = dVar3.h(g);
            if (h > i5) {
                dVar = dVar3;
                i5 = h;
            }
            i2 += i3;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleUpdate(int i, int i2, int i3) {
        int i4;
        int i5;
        int lastChildPosition = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                this.mLazySpanLookup.e(i5);
                if (i3 != 1) {
                    this.mLazySpanLookup.f(i, i2);
                } else if (i3 == 2) {
                    this.mLazySpanLookup.g(i, i2);
                } else if (i3 == 8) {
                    this.mLazySpanLookup.g(i, 1);
                    this.mLazySpanLookup.f(i2, 1);
                }
                if (i4 > lastChildPosition) {
                    return;
                }
                if (i5 <= (this.mShouldReverseLayout ? getFirstChildPosition() : getLastChildPosition())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        this.mLazySpanLookup.e(i5);
        if (i3 != 1) {
        }
        if (i4 > lastChildPosition) {
        }
    }

    private void measureChildWithDecorationsAndMargin(View view, c cVar, boolean z) {
        cVar.getClass();
        if (this.mOrientation != 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
            return;
        }
        measureChildWithDecorationsAndMargin(view, RecyclerView.o.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
    }

    private boolean preferLastSpan(int i) {
        if (this.mOrientation == 0) {
            return (i == -1) != this.mShouldReverseLayout;
        }
        return ((i == -1) == this.mShouldReverseLayout) == isLayoutRTL();
    }

    private void recycle(RecyclerView.v vVar, u uVar) {
        if (!uVar.a || uVar.i) {
            return;
        }
        if (uVar.b == 0) {
            if (uVar.e == -1) {
                recycleFromEnd(vVar, uVar.g);
                return;
            } else {
                recycleFromStart(vVar, uVar.f);
                return;
            }
        }
        if (uVar.e != -1) {
            int minEnd = getMinEnd(uVar.g) - uVar.g;
            recycleFromStart(vVar, minEnd < 0 ? uVar.f : Math.min(minEnd, uVar.b) + uVar.f);
        } else {
            int i = uVar.f;
            int maxStart = i - getMaxStart(i);
            recycleFromEnd(vVar, maxStart < 0 ? uVar.g : uVar.g - Math.min(maxStart, uVar.b));
        }
    }

    private void recycleFromEnd(RecyclerView.v vVar, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.e(childAt) < i || this.mPrimaryOrientation.o(childAt) < i) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            cVar.getClass();
            if (cVar.f.a.size() == 1) {
                return;
            }
            d dVar = cVar.f;
            ArrayList<View> arrayList = dVar.a;
            int size = arrayList.size();
            View remove = arrayList.remove(size - 1);
            c cVar2 = (c) remove.getLayoutParams();
            cVar2.f = null;
            if (cVar2.b.isRemoved() || cVar2.b.isUpdated()) {
                dVar.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.c(remove);
            }
            if (size == 1) {
                dVar.b = Integer.MIN_VALUE;
            }
            dVar.c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void recycleFromStart(RecyclerView.v vVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.b(childAt) > i || this.mPrimaryOrientation.n(childAt) > i) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            cVar.getClass();
            if (cVar.f.a.size() == 1) {
                return;
            }
            d dVar = cVar.f;
            ArrayList<View> arrayList = dVar.a;
            View remove = arrayList.remove(0);
            c cVar2 = (c) remove.getLayoutParams();
            cVar2.f = null;
            if (arrayList.size() == 0) {
                dVar.c = Integer.MIN_VALUE;
            }
            if (cVar2.b.isRemoved() || cVar2.b.isUpdated()) {
                dVar.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.c(remove);
            }
            dVar.b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.i() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float c2 = this.mSecondaryOrientation.c(childAt);
            if (c2 >= f) {
                ((c) childAt.getLayoutParams()).getClass();
                f = Math.max(f, c2);
            }
        }
        int i2 = this.mSizePerSpan;
        int round = Math.round(f * this.mSpanCount);
        if (this.mSecondaryOrientation.i() == Integer.MIN_VALUE) {
            round = Math.min(round, this.mSecondaryOrientation.l());
        }
        updateMeasureSpecs(round);
        if (this.mSizePerSpan == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            c cVar = (c) childAt2.getLayoutParams();
            cVar.getClass();
            if (isLayoutRTL() && this.mOrientation == 1) {
                int i4 = -((this.mSpanCount - 1) - cVar.f.e);
                childAt2.offsetLeftAndRight((this.mSizePerSpan * i4) - (i4 * i2));
            } else {
                int i5 = cVar.f.e;
                int i6 = this.mSizePerSpan * i5;
                int i7 = i5 * i2;
                if (this.mOrientation == 1) {
                    childAt2.offsetLeftAndRight(i6 - i7);
                } else {
                    childAt2.offsetTopAndBottom(i6 - i7);
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private void setLayoutStateDirection(int i) {
        u uVar = this.mLayoutState;
        uVar.e = i;
        uVar.d = this.mShouldReverseLayout != (i == -1) ? -1 : 1;
    }

    private void updateAllRemainingSpans(int i, int i2) {
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            if (!this.mSpans[i3].a.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2);
            }
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.a0 a0Var, b bVar) {
        bVar.a = this.mLastLayoutFromEnd ? findLastReferenceChildPosition(a0Var.b()) : findFirstReferenceChildPosition(a0Var.b());
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    private void updateLayoutState(int i, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int i4;
        u uVar = this.mLayoutState;
        boolean z = false;
        uVar.b = 0;
        uVar.c = i;
        if (!isSmoothScrolling() || (i4 = a0Var.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.mShouldReverseLayout == (i4 < i)) {
                i2 = this.mPrimaryOrientation.l();
                i3 = 0;
            } else {
                i3 = this.mPrimaryOrientation.l();
                i2 = 0;
            }
        }
        if (getClipToPadding()) {
            this.mLayoutState.f = this.mPrimaryOrientation.k() - i3;
            this.mLayoutState.g = this.mPrimaryOrientation.g() + i2;
        } else {
            this.mLayoutState.g = this.mPrimaryOrientation.f() + i2;
            this.mLayoutState.f = -i3;
        }
        u uVar2 = this.mLayoutState;
        uVar2.h = false;
        uVar2.a = true;
        if (this.mPrimaryOrientation.i() == 0 && this.mPrimaryOrientation.f() == 0) {
            z = true;
        }
        uVar2.i = z;
    }

    private void updateRemainingSpans(d dVar, int i, int i2) {
        int i3 = dVar.d;
        int i4 = dVar.e;
        if (i != -1) {
            int i5 = dVar.c;
            if (i5 == Integer.MIN_VALUE) {
                dVar.a();
                i5 = dVar.c;
            }
            if (i5 - i3 >= i2) {
                this.mRemainingSpans.set(i4, false);
                return;
            }
            return;
        }
        int i6 = dVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = dVar.a.get(0);
            c cVar = (c) view.getLayoutParams();
            dVar.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            cVar.getClass();
            i6 = dVar.b;
        }
        if (i6 + i3 <= i2) {
            this.mRemainingSpans.set(i4, false);
        }
    }

    private int updateSpecWithExtra(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        if (getChildCount() != 0 && this.mGapStrategy != 0 && isAttachedToWindow()) {
            if (this.mShouldReverseLayout) {
                firstChildPosition = getLastChildPosition();
                lastChildPosition = getFirstChildPosition();
            } else {
                firstChildPosition = getFirstChildPosition();
                lastChildPosition = getLastChildPosition();
            }
            if (firstChildPosition == 0 && hasGapsToFix() != null) {
                this.mLazySpanLookup.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            if (this.mLaidOutInvalidFullSpan) {
                int i = this.mShouldReverseLayout ? -1 : 1;
                int i2 = lastChildPosition + 1;
                LazySpanLookup.FullSpanItem d2 = this.mLazySpanLookup.d(firstChildPosition, i2, i);
                if (d2 == null) {
                    this.mLaidOutInvalidFullSpan = false;
                    this.mLazySpanLookup.c(i2);
                    return false;
                }
                LazySpanLookup.FullSpanItem d3 = this.mLazySpanLookup.d(firstChildPosition, d2.b, i * (-1));
                if (d3 == null) {
                    this.mLazySpanLookup.c(d2.b);
                } else {
                    this.mLazySpanLookup.c(d3.b + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int f;
        int i3;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        prepareLayoutStateForDelta(i, a0Var);
        int[] iArr = this.mPrefetchDistances;
        if (iArr == null || iArr.length < this.mSpanCount) {
            this.mPrefetchDistances = new int[this.mSpanCount];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            u uVar = this.mLayoutState;
            if (uVar.d == -1) {
                f = uVar.f;
                i3 = this.mSpans[i5].h(f);
            } else {
                f = this.mSpans[i5].f(uVar.g);
                i3 = this.mLayoutState.g;
            }
            int i6 = f - i3;
            if (i6 >= 0) {
                this.mPrefetchDistances[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.mPrefetchDistances, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.mLayoutState.c;
            if (i8 < 0 || i8 >= a0Var.b()) {
                return;
            }
            ((q.b) cVar).a(this.mLayoutState.c, this.mPrefetchDistances[i7]);
            u uVar2 = this.mLayoutState;
            uVar2.c += uVar2.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i) {
        int calculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i);
        PointF pointF = new PointF();
        if (calculateScrollDirectionForPosition == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = calculateScrollDirectionForPosition;
            pointF.y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return pointF;
        }
        pointF.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pointF.y = calculateScrollDirectionForPosition;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            d dVar = this.mSpans[i];
            iArr[i] = StaggeredGridLayoutManager.this.mReverseLayout ? dVar.e(r1.size() - 1, -1, true, true, false) : dVar.e(0, dVar.a.size(), true, true, false);
        }
        return iArr;
    }

    public View findFirstVisibleItemClosestToEnd(boolean z) {
        int k = this.mPrimaryOrientation.k();
        int g = this.mPrimaryOrientation.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e = this.mPrimaryOrientation.e(childAt);
            int b2 = this.mPrimaryOrientation.b(childAt);
            if (b2 > k && e < g) {
                if (b2 <= g || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View findFirstVisibleItemClosestToStart(boolean z) {
        int k = this.mPrimaryOrientation.k();
        int g = this.mPrimaryOrientation.g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int e = this.mPrimaryOrientation.e(childAt);
            if (this.mPrimaryOrientation.b(childAt) > k && e < g) {
                if (e >= k || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        if (findFirstVisibleItemClosestToEnd == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToEnd);
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            d dVar = this.mSpans[i];
            iArr[i] = StaggeredGridLayoutManager.this.mReverseLayout ? dVar.e(r1.size() - 1, -1, false, true, false) : dVar.e(0, dVar.a.size(), false, true, false);
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            d dVar = this.mSpans[i];
            iArr[i] = StaggeredGridLayoutManager.this.mReverseLayout ? dVar.e(0, dVar.a.size(), true, true, false) : dVar.e(r1.size() - 1, -1, true, true, false);
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            d dVar = this.mSpans[i];
            iArr[i] = StaggeredGridLayoutManager.this.mReverseLayout ? dVar.e(0, dVar.a.size(), false, true, false) : dVar.e(r1.size() - 1, -1, false, true, false);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View hasGapsToFix() {
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.mSpanCount);
        bitSet.set(0, this.mSpanCount, true);
        char c2 = (this.mOrientation == 1 && isLayoutRTL()) ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i2 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            c cVar = (c) childAt.getLayoutParams();
            if (bitSet.get(cVar.f.e)) {
                if (checkSpanForGap(cVar.f)) {
                    return childAt;
                }
                bitSet.clear(cVar.f.e);
            }
            i += i2;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.mShouldReverseLayout) {
                    int b2 = this.mPrimaryOrientation.b(childAt);
                    int b3 = this.mPrimaryOrientation.b(childAt2);
                    if (b2 >= b3) {
                        if (b2 == b3) {
                            if ((cVar.f.e - ((c) childAt2.getLayoutParams()).f.e >= 0) == (c2 >= 0)) {
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    int e = this.mPrimaryOrientation.e(childAt);
                    int e2 = this.mPrimaryOrientation.e(childAt2);
                    if (e <= e2) {
                        if (e == e2) {
                            if ((cVar.f.e - ((c) childAt2.getLayoutParams()).f.e >= 0) == (c2 >= 0)) {
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return childAt;
            }
        }
        return null;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            d dVar = this.mSpans[i2];
            int i3 = dVar.b;
            if (i3 != Integer.MIN_VALUE) {
                dVar.b = i3 + i;
            }
            int i4 = dVar.c;
            if (i4 != Integer.MIN_VALUE) {
                dVar.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            d dVar = this.mSpans[i2];
            int i3 = dVar.b;
            if (i3 != Integer.MIN_VALUE) {
                dVar.b = i3 + i;
            }
            int i4 = dVar.c;
            if (i4 != Integer.MIN_VALUE) {
                dVar.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.mLazySpanLookup.a();
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].b();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @Nullable
    public View onFocusSearchFailed(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View findContainingItemView;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        cVar.getClass();
        d dVar = cVar.f;
        int lastChildPosition = convertFocusDirectionToLayoutDirection == 1 ? getLastChildPosition() : getFirstChildPosition();
        updateLayoutState(lastChildPosition, a0Var);
        setLayoutStateDirection(convertFocusDirectionToLayoutDirection);
        u uVar = this.mLayoutState;
        uVar.c = uVar.d + lastChildPosition;
        uVar.b = (int) (this.mPrimaryOrientation.l() * 0.33333334f);
        u uVar2 = this.mLayoutState;
        uVar2.h = true;
        uVar2.a = false;
        fill(vVar, uVar2, a0Var);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        View g = dVar.g(lastChildPosition, convertFocusDirectionToLayoutDirection);
        if (g != null && g != findContainingItemView) {
            return g;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i2 = this.mSpanCount - 1; i2 >= 0; i2--) {
                View g2 = this.mSpans[i2].g(lastChildPosition, convertFocusDirectionToLayoutDirection);
                if (g2 != null && g2 != findContainingItemView) {
                    return g2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                View g3 = this.mSpans[i3].g(lastChildPosition, convertFocusDirectionToLayoutDirection);
                if (g3 != null && g3 != findContainingItemView) {
                    return g3;
                }
            }
        }
        boolean z = (this.mReverseLayout ^ true) == (convertFocusDirectionToLayoutDirection == -1);
        View findViewByPosition = findViewByPosition(z ? dVar.c() : dVar.d());
        if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
            return findViewByPosition;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i4 = this.mSpanCount - 1; i4 >= 0; i4--) {
                if (i4 != dVar.e) {
                    View findViewByPosition2 = findViewByPosition(z ? this.mSpans[i4].c() : this.mSpans[i4].d());
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                View findViewByPosition3 = findViewByPosition(z ? this.mSpans[i5].c() : this.mSpans[i5].d());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart == null || findFirstVisibleItemClosestToEnd == null) {
                return;
            }
            int position = getPosition(findFirstVisibleItemClosestToStart);
            int position2 = getPosition(findFirstVisibleItemClosestToEnd);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        handleUpdate(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        handleUpdate(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        onLayoutChildren(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.e = null;
                savedState.d = 0;
                savedState.b = -1;
                savedState.c = -1;
                savedState.e = null;
                savedState.d = 0;
                savedState.f = 0;
                savedState.g = null;
                savedState.h = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        int h;
        int k;
        int[] iArr;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.i = this.mReverseLayout;
        savedState2.j = this.mLastLayoutFromEnd;
        savedState2.k = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.a) == null) {
            savedState2.f = 0;
        } else {
            savedState2.g = iArr;
            savedState2.f = iArr.length;
            savedState2.h = lazySpanLookup.b;
        }
        if (getChildCount() <= 0) {
            savedState2.b = -1;
            savedState2.c = -1;
            savedState2.d = 0;
            return savedState2;
        }
        savedState2.b = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
        savedState2.c = findFirstVisibleItemPositionInt();
        int i = this.mSpanCount;
        savedState2.d = i;
        savedState2.e = new int[i];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            if (this.mLastLayoutFromEnd) {
                h = this.mSpans[i2].f(Integer.MIN_VALUE);
                if (h != Integer.MIN_VALUE) {
                    k = this.mPrimaryOrientation.g();
                    h -= k;
                    savedState2.e[i2] = h;
                } else {
                    savedState2.e[i2] = h;
                }
            } else {
                h = this.mSpans[i2].h(Integer.MIN_VALUE);
                if (h != Integer.MIN_VALUE) {
                    k = this.mPrimaryOrientation.k();
                    h -= k;
                    savedState2.e[i2] = h;
                } else {
                    savedState2.e[i2] = h;
                }
            }
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    public void prepareLayoutStateForDelta(int i, RecyclerView.a0 a0Var) {
        int firstChildPosition;
        int i2;
        if (i > 0) {
            firstChildPosition = getLastChildPosition();
            i2 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i2 = -1;
        }
        this.mLayoutState.a = true;
        updateLayoutState(firstChildPosition, a0Var);
        setLayoutStateDirection(i2);
        u uVar = this.mLayoutState;
        uVar.c = firstChildPosition + uVar.d;
        uVar.b = Math.abs(i);
    }

    public int scrollBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, a0Var);
        int fill = fill(vVar, this.mLayoutState, a0Var);
        if (this.mLayoutState.b >= fill) {
            i = i < 0 ? -fill : fill;
        }
        this.mPrimaryOrientation.p(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        u uVar = this.mLayoutState;
        uVar.b = 0;
        recycle(vVar, uVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return scrollBy(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.b != i) {
            savedState.e = null;
            savedState.d = 0;
            savedState.b = -1;
            savedState.c = -1;
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return scrollBy(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.o.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = RecyclerView.o.chooseSize(i, (this.mSizePerSpan * this.mSpanCount) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = RecyclerView.o.chooseSize(i2, (this.mSizePerSpan * this.mSpanCount) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.mOrientation) {
            return;
        }
        this.mOrientation = i;
        f0 f0Var = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = f0Var;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.i != z) {
            savedState.i = z;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new d[this.mSpanCount];
            for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                this.mSpans[i2] = new d(i2);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        v vVar = new v(recyclerView.getContext());
        vVar.setTargetPosition(i);
        startSmoothScroll(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public boolean updateAnchorFromPendingData(RecyclerView.a0 a0Var, b bVar) {
        int i;
        if (!a0Var.g && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.b != -1 && savedState.d >= 1) {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.mPendingScrollPosition;
                    return true;
                }
                View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (findViewByPosition == null) {
                    int i2 = this.mPendingScrollPosition;
                    bVar.a = i2;
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    int i3 = this.mPendingScrollPositionOffset;
                    if (i3 == Integer.MIN_VALUE) {
                        boolean z = calculateScrollDirectionForPosition(i2) == 1;
                        bVar.c = z;
                        bVar.b = z ? staggeredGridLayoutManager.mPrimaryOrientation.g() : staggeredGridLayoutManager.mPrimaryOrientation.k();
                    } else if (bVar.c) {
                        bVar.b = staggeredGridLayoutManager.mPrimaryOrientation.g() - i3;
                    } else {
                        bVar.b = staggeredGridLayoutManager.mPrimaryOrientation.k() + i3;
                    }
                    bVar.d = true;
                    return true;
                }
                bVar.a = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    if (bVar.c) {
                        bVar.b = (this.mPrimaryOrientation.g() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.b(findViewByPosition);
                        return true;
                    }
                    bVar.b = (this.mPrimaryOrientation.k() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.e(findViewByPosition);
                    return true;
                }
                if (this.mPrimaryOrientation.c(findViewByPosition) > this.mPrimaryOrientation.l()) {
                    bVar.b = bVar.c ? this.mPrimaryOrientation.g() : this.mPrimaryOrientation.k();
                    return true;
                }
                int e = this.mPrimaryOrientation.e(findViewByPosition) - this.mPrimaryOrientation.k();
                if (e < 0) {
                    bVar.b = -e;
                    return true;
                }
                int g = this.mPrimaryOrientation.g() - this.mPrimaryOrientation.b(findViewByPosition);
                if (g < 0) {
                    bVar.b = g;
                    return true;
                }
                bVar.b = Integer.MIN_VALUE;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    public void updateAnchorInfoForLayout(RecyclerView.a0 a0Var, b bVar) {
        if (updateAnchorFromPendingData(a0Var, bVar) || updateAnchorFromChildren(a0Var, bVar)) {
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        bVar.b = bVar.c ? staggeredGridLayoutManager.mPrimaryOrientation.g() : staggeredGridLayoutManager.mPrimaryOrientation.k();
        bVar.a = 0;
    }

    public void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x019f, code lost:
    
        if (checkForGaps() != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        SavedState savedState;
        b bVar = this.mAnchorInfo;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && a0Var.b() == 0) {
            removeAndRecycleAllViews(vVar);
            bVar.a();
            return;
        }
        boolean z2 = true;
        boolean z3 = (bVar.e && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) ? false : true;
        if (z3) {
            bVar.a();
            if (this.mPendingSavedState != null) {
                applyPendingSavedState(bVar);
            } else {
                resolveShouldLayoutReverse();
                bVar.c = this.mShouldReverseLayout;
            }
            updateAnchorInfoForLayout(a0Var, bVar);
            bVar.e = true;
        }
        if (this.mPendingSavedState == null && this.mPendingScrollPosition == -1 && (bVar.c != this.mLastLayoutFromEnd || isLayoutRTL() != this.mLastLayoutRTL)) {
            this.mLazySpanLookup.a();
            bVar.d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.mPendingSavedState) == null || savedState.d < 1)) {
            if (bVar.d) {
                for (int i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].b();
                    int i2 = bVar.b;
                    if (i2 != Integer.MIN_VALUE) {
                        d dVar = this.mSpans[i];
                        dVar.b = i2;
                        dVar.c = i2;
                    }
                }
            } else if (z3 || this.mAnchorInfo.f == null) {
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    d dVar2 = this.mSpans[i3];
                    boolean z4 = this.mShouldReverseLayout;
                    int i4 = bVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    int f = z4 ? dVar2.f(Integer.MIN_VALUE) : dVar2.h(Integer.MIN_VALUE);
                    dVar2.b();
                    if (f != Integer.MIN_VALUE && ((!z4 || f >= staggeredGridLayoutManager.mPrimaryOrientation.g()) && (z4 || f <= staggeredGridLayoutManager.mPrimaryOrientation.k()))) {
                        if (i4 != Integer.MIN_VALUE) {
                            f += i4;
                        }
                        dVar2.c = f;
                        dVar2.b = f;
                    }
                }
                b bVar2 = this.mAnchorInfo;
                d[] dVarArr = this.mSpans;
                bVar2.getClass();
                int length = dVarArr.length;
                int[] iArr = bVar2.f;
                if (iArr == null || iArr.length < length) {
                    bVar2.f = new int[StaggeredGridLayoutManager.this.mSpans.length];
                }
                for (int i5 = 0; i5 < length; i5++) {
                    bVar2.f[i5] = dVarArr[i5].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                    d dVar3 = this.mSpans[i6];
                    dVar3.b();
                    int i7 = this.mAnchorInfo.f[i6];
                    dVar3.b = i7;
                    dVar3.c = i7;
                }
            }
        }
        detachAndScrapAttachedViews(vVar);
        this.mLayoutState.a = false;
        this.mLaidOutInvalidFullSpan = false;
        updateMeasureSpecs(this.mSecondaryOrientation.l());
        updateLayoutState(bVar.a, a0Var);
        if (bVar.c) {
            setLayoutStateDirection(-1);
            fill(vVar, this.mLayoutState, a0Var);
            setLayoutStateDirection(1);
            u uVar = this.mLayoutState;
            uVar.c = bVar.a + uVar.d;
            fill(vVar, uVar, a0Var);
        } else {
            setLayoutStateDirection(1);
            fill(vVar, this.mLayoutState, a0Var);
            setLayoutStateDirection(-1);
            u uVar2 = this.mLayoutState;
            uVar2.c = bVar.a + uVar2.d;
            fill(vVar, uVar2, a0Var);
        }
        repositionToWrapContentIfNecessary();
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout) {
                fixEndGap(vVar, a0Var, true);
                fixStartGap(vVar, a0Var, false);
            } else {
                fixStartGap(vVar, a0Var, true);
                fixEndGap(vVar, a0Var, false);
            }
        }
        if (z && !a0Var.g && this.mGapStrategy != 0 && getChildCount() > 0 && (this.mLaidOutInvalidFullSpan || hasGapsToFix() != null)) {
            removeCallbacks(this.mCheckForGapsRunnable);
        }
        z2 = false;
        if (a0Var.g) {
            this.mAnchorInfo.a();
        }
        this.mLastLayoutFromEnd = bVar.c;
        this.mLastLayoutRTL = isLayoutRTL();
        if (z2) {
            this.mAnchorInfo.a();
            onLayoutChildren(vVar, a0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.mTmpRect);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.mTmpRect;
        int updateSpecWithExtra = updateSpecWithExtra(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.mTmpRect;
        int updateSpecWithExtra2 = updateSpecWithExtra(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, cVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, cVar);
        }
        if (shouldMeasureChild) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.mOrientation = i2;
        setSpanCount(i);
        this.mLayoutState = new u();
        createOrientationHelpers();
    }
}
