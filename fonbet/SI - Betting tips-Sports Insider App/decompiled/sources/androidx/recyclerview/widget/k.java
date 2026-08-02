package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f2449a;

    /* renamed from: e, reason: collision with root package name */
    public View f2453e;

    /* renamed from: d, reason: collision with root package name */
    public int f2452d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final j f2450b = new j();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2451c = new ArrayList();

    public k(v0 v0Var) {
        this.f2449a = v0Var;
    }

    public final void a(View view, int i5, boolean z5) {
        RecyclerView recyclerView = this.f2449a.f2572a;
        int childCount = i5 < 0 ? recyclerView.getChildCount() : f(i5);
        this.f2450b.f(childCount, z5);
        if (z5) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z5) {
        RecyclerView recyclerView = this.f2449a.f2572a;
        int childCount = i5 < 0 ? recyclerView.getChildCount() : f(i5);
        this.f2450b.f(childCount, z5);
        if (z5) {
            i(view);
        }
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, sb2));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i5) {
        int f6 = f(i5);
        this.f2450b.h(f6);
        RecyclerView recyclerView = this.f2449a.f2572a;
        View childAt = recyclerView.getChildAt(f6);
        if (childAt != null) {
            d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(childViewHolderInt);
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, sb2));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(256);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(f6);
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(f6);
    }

    public final View d(int i5) {
        return this.f2449a.f2572a.getChildAt(f(i5));
    }

    public final int e() {
        return this.f2449a.f2572a.getChildCount() - this.f2451c.size();
    }

    public final int f(int i5) {
        if (i5 < 0) {
            return -1;
        }
        int childCount = this.f2449a.f2572a.getChildCount();
        int i10 = i5;
        while (i10 < childCount) {
            j jVar = this.f2450b;
            int b10 = i5 - (i10 - jVar.b(i10));
            if (b10 == 0) {
                while (jVar.e(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += b10;
        }
        return -1;
    }

    public final View g(int i5) {
        return this.f2449a.f2572a.getChildAt(i5);
    }

    public final int h() {
        return this.f2449a.f2572a.getChildCount();
    }

    public final void i(View view) {
        this.f2451c.add(view);
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(this.f2449a.f2572a);
        }
    }

    public final int j(View view) {
        int indexOfChild = this.f2449a.f2572a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        j jVar = this.f2450b;
        if (jVar.e(indexOfChild)) {
            return -1;
        }
        return indexOfChild - jVar.b(indexOfChild);
    }

    public final void k(int i5) {
        v0 v0Var = this.f2449a;
        int i10 = this.f2452d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int f6 = f(i5);
            View childAt = v0Var.f2572a.getChildAt(f6);
            if (childAt != null) {
                this.f2452d = 1;
                this.f2453e = childAt;
                if (this.f2450b.h(f6)) {
                    l(childAt);
                }
                v0Var.c(f6);
            }
            this.f2452d = 0;
            this.f2453e = null;
        } catch (Throwable th2) {
            this.f2452d = 0;
            this.f2453e = null;
            throw th2;
        }
    }

    public final void l(View view) {
        d2 childViewHolderInt;
        if (!this.f2451c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState(this.f2449a.f2572a);
    }

    public final String toString() {
        return this.f2450b.toString() + ", hidden list:" + this.f2451c.size();
    }
}
