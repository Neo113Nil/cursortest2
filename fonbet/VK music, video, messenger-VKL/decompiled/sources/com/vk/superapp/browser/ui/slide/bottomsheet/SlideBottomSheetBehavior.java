package com.vk.superapp.browser.ui.slide.bottomsheet;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$dimen;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.f;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import xsna.am;
import xsna.b0u0;
import xsna.d0k0;
import xsna.e0k0;
import xsna.iut0;
import xsna.lhg;
import xsna.t1u0;

/* loaded from: classes6.dex */
public class SlideBottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    @Nullable
    public f h;
    public int i;
    public boolean j;
    public int k;

    @Nullable
    public WeakReference<V> l;

    @Nullable
    public WeakReference<View> m;

    @Nullable
    public VelocityTracker n;

    @Nullable
    public HashMap o;

    public class a implements Runnable {
        public boolean b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r4 > r6) goto L40;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 3;
        if (v.getTop() == 0) {
            E(3);
            return;
        }
        if (view == this.m.get() && this.j) {
            VelocityTracker velocityTracker = this.n;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                f = this.n.getYVelocity(-1);
            }
            if (this.i > 0) {
                int top = v.getTop();
                i3 = this.e;
            } else {
                if (v.getTop() / this.k < Math.min(0.3f / (f / 4000.0f), 0.3f)) {
                    i3 = this.d;
                } else if (this.i == 0) {
                    int top2 = v.getTop();
                    int i6 = this.e;
                    if (top2 < i6) {
                        if (top2 >= Math.abs(top2 - this.f)) {
                            i4 = this.e;
                        }
                        i3 = 0;
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f)) {
                        i4 = this.e;
                    } else {
                        i2 = this.f;
                        i5 = 4;
                        i3 = i2;
                    }
                    i3 = i4;
                    i5 = 6;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.e) < Math.abs(top3 - this.f)) {
                        i3 = this.e;
                        i5 = 6;
                    } else {
                        i2 = this.f;
                        i5 = 4;
                        i3 = i2;
                    }
                }
            }
            G(i5, i3, v);
            this.j = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.g == 1 && actionMasked == 0) {
            return true;
        }
        f fVar = this.h;
        if (fVar != null) {
            fVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.n) != null) {
            velocityTracker.recycle();
            this.n = null;
        }
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        return false;
    }

    @Nullable
    public final View D(View view) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View D = D(viewGroup.getChildAt(i));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public final void E(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        WeakReference<V> weakReference = this.l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        if (i != 2) {
            boolean z = i == 3;
            if (this.c != z) {
                this.c = z;
            }
        }
        throw null;
    }

    public final void F(int i, @NonNull View view) {
        int i2;
        if (i == 4) {
            i2 = this.f;
        } else if (i == 6) {
            i2 = this.e;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal state argument: "));
            }
            i2 = 0;
        }
        G(i, i2, view);
    }

    public final void G(int i, int i2, View view) {
        f fVar = this.h;
        if (fVar == null || !fVar.s(view.getLeft(), i2, view)) {
            E(i);
            return;
        }
        E(2);
        if (i != 2) {
            boolean z = i == 3;
            if (this.c != z) {
                this.c = z;
            }
        }
        throw null;
    }

    public final void H(boolean z) {
        WeakReference<V> weakReference = this.l;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.o != null) {
                    return;
                } else {
                    this.o = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.l.get() && z) {
                    this.o.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.o = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void i(@NonNull CoordinatorLayout.f fVar) {
        this.l = null;
        this.h = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l() {
        this.l = null;
        this.h = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        v.isShown();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.l == null) {
            coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29) {
                t1u0.a(v, new d0k0(this));
            }
            WeakReference<V> weakReference = new WeakReference<>(v);
            this.l = weakReference;
            V v2 = weakReference.get();
            if (v2 != null) {
                iut0.n(524288, v2);
                iut0.k(0, v2);
                iut0.n(SQLiteDatabase.OPEN_PRIVATECACHE, v2);
                iut0.k(0, v2);
                iut0.n(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, v2);
                iut0.k(0, v2);
                int i2 = this.g;
                if (i2 == 3) {
                    iut0.o(v2, am.a.l, null, new e0k0(this, 6));
                } else if (i2 == 4) {
                    iut0.o(v2, am.a.k, null, new e0k0(this, 6));
                } else if (i2 == 6) {
                    iut0.o(v2, am.a.l, null, new e0k0(this, 4));
                    iut0.o(v2, am.a.k, null, new e0k0(this, 3));
                }
            }
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.h == null) {
            this.h = new f(coordinatorLayout.getContext(), coordinatorLayout, null);
        }
        int top = v.getTop();
        coordinatorLayout.R(i, v);
        coordinatorLayout.getWidth();
        this.k = coordinatorLayout.getHeight();
        this.d = Math.max(0, this.k - v.getHeight());
        this.e = (int) (this.k * 1.0f);
        int i3 = this.b;
        int max = this.k - (i3 > 0 ? Math.max(0, i3) : 0);
        this.f = max;
        int i4 = this.g;
        if (i4 == 3) {
            v.offsetTopAndBottom(0);
        } else if (i4 == 6) {
            v.offsetTopAndBottom(this.e);
        } else if (i4 == 4) {
            v.offsetTopAndBottom(max);
        } else if (i4 == 1 || i4 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.m = new WeakReference<>(D(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(@NonNull View view, @NonNull View view2, float f) {
        return view2 == this.m.get() && this.g != 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 != 1 && view == this.m.get()) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 >= 0) {
                    return;
                }
                iArr[1] = top;
                int i5 = -top;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                v.offsetTopAndBottom(i5);
                E(3);
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f;
                if (i4 <= i6) {
                    return;
                }
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                v.offsetTopAndBottom(i8);
                E(4);
            }
            v.getTop();
            if (this.l.get() != null) {
                throw null;
            }
            this.i = i2;
            this.j = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void w(@NonNull View view, @NonNull Parcelable parcelable) {
        int i = ((SavedState) parcelable).d;
        if (i == 1 || i == 2) {
            this.g = 4;
        } else {
            this.g = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public final Parcelable x(@NonNull View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (SlideBottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.i = 0;
        this.j = false;
        return (i & 2) != 0;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull SlideBottomSheetBehavior<?> slideBottomSheetBehavior) {
            super(parcelable);
            this.d = slideBottomSheetBehavior.g;
            this.e = 0;
            this.f = false;
            this.g = false;
            this.h = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }
}
