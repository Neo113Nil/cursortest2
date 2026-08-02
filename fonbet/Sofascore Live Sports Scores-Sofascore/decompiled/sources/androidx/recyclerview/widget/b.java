package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import defpackage.a70;
import defpackage.am0;
import defpackage.d4a;
import defpackage.mz1;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    public final d4a a;
    public View e;
    public int d = 0;
    public final am0 b = new am0(1);
    public final ArrayList c = new ArrayList();

    public b(d4a d4aVar) {
        this.a = d4aVar;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.a.b;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.v(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.a.b;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.v(childCount, z);
        if (z) {
            i(view);
        }
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                a70.p(mz1.l(recyclerView, sb));
                return;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            a70.p(mz1.l(recyclerView, sb2));
            return;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f = f(i);
        this.b.x(f);
        RecyclerView recyclerView = (RecyclerView) this.a.b;
        View childAt = recyclerView.getChildAt(f);
        if (childAt != null) {
            u childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    a70.p(mz1.l(recyclerView, sb));
                    return;
                } else {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.addFlags(NotificationCompat.FLAG_LOCAL_ONLY);
                }
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f);
            a70.p(mz1.l(recyclerView, sb2));
            return;
        }
        recyclerView.detachViewFromParent(f);
    }

    public final View d(int i) {
        return ((RecyclerView) this.a.b).getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView) this.a.b).getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) this.a.b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            am0 am0Var = this.b;
            int r = i - (i2 - am0Var.r(i2));
            if (r == 0) {
                while (am0Var.t(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += r;
        }
        return -1;
    }

    public final View g(int i) {
        return ((RecyclerView) this.a.b).getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView) this.a.b).getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState((RecyclerView) this.a.b);
        }
    }

    public final int j(View view) {
        int indexOfChild = ((RecyclerView) this.a.b).indexOfChild(view);
        if (indexOfChild != -1) {
            am0 am0Var = this.b;
            if (!am0Var.t(indexOfChild)) {
                return indexOfChild - am0Var.r(indexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i) {
        d4a d4aVar = this.a;
        int i2 = this.d;
        if (i2 == 1) {
            a70.r("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            a70.r("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int f = f(i);
            View childAt = ((RecyclerView) d4aVar.b).getChildAt(f);
            if (childAt == null) {
                this.d = 0;
                this.e = null;
                return;
            }
            this.d = 1;
            this.e = childAt;
            if (this.b.x(f)) {
                l(childAt);
            }
            d4aVar.v(f);
            this.d = 0;
            this.e = null;
        } catch (Throwable th) {
            this.d = 0;
            this.e = null;
            throw th;
        }
    }

    public final void l(View view) {
        u childViewHolderInt;
        if (!this.c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState((RecyclerView) this.a.b);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
